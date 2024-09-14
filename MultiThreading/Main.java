import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BlockingQueue<Double> dataQueue = new LinkedBlockingQueue<>();

        DataGenerator dataGenerator = new DataGenerator(dataQueue);
        DataProcessor dataProcessor = new DataProcessor(dataQueue);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(dataGenerator);
        executor.submit(dataProcessor);

        // JavaFX GUI setup
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Time");
        yAxis.setLabel("Value");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Real-Time Data Processing Dashboard");

        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Data Stream");

        Scene scene = new Scene(lineChart, 800, 600);
        lineChart.getData().add(series);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Real-Time Data Processing Dashboard");
        primaryStage.show();

        // Update GUI with data
        new Thread(() -> {
            while (true) {
                try {
                    double data = dataQueue.take();
                    Platform.runLater(() -> {
                        series.getData().add(new XYChart.Data<>(System.currentTimeMillis(), data));
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        primaryStage.setOnCloseRequest(event -> {
            executor.shutdown();
            dataGenerator.stop();
            dataProcessor.stop();
        });
    }

    static class DataGenerator implements Runnable {
        private BlockingQueue<Double> dataQueue;
        private Random random = new Random();
        private boolean isRunning = true;

        public DataGenerator(BlockingQueue<Double> dataQueue) {
            this.dataQueue = dataQueue;
        }

        @Override
        public void run() {
            while (isRunning) {
                double newData = random.nextDouble() * 100; // Generate random data
                try {
                    dataQueue.put(newData); // Add data to the queue
                    Thread.sleep(1000); // Simulate data generation interval
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void stop() {
            isRunning = false;
        }
    }

    static class DataProcessor implements Runnable {
        private BlockingQueue<Double> dataQueue;
        private boolean isRunning = true;

        public DataProcessor(BlockingQueue<Double> dataQueue) {
            this.dataQueue = dataQueue;
        }

        @Override
        public void run() {
            while (isRunning) {
                try {
                    double data = dataQueue.take(); // Retrieve data from the queue
                    // Perform data processing and analysis
                    System.out.println("Processing data: " + data);
                    Thread.sleep(500); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void stop() {
            isRunning = false;
        }
    }
}
