import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CircleColorChangerAWT extends Frame implements ActionListener {
    private Color circleColor = Color.RED; // Default color
    private Panel colorPanel;

    public CircleColorChangerAWT() {
        setSize(400, 400);
        setTitle("Circle Color Changer");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Create a panel for buttons
        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new FlowLayout());

        // Create buttons
        Button redButton = new Button("Red");
        Button blueButton = new Button("Blue");
        Button greenButton = new Button("Green");

        // Add action listeners
        redButton.addActionListener(this);
        blueButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add buttons to the panel
        buttonPanel.add(redButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(greenButton);

        // Create a panel for drawing the circle
        colorPanel = new Panel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                g.setColor(circleColor);
                g.fillOval(100, 100, 200, 200); // Draw the circle
            }
        };

        // Add components to the frame
        add(buttonPanel, BorderLayout.SOUTH);
        add(colorPanel, BorderLayout.CENTER);

        // Set the frame to be visible
        setVisible(true);

        // Add window listener to handle closing event
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "Red":
                circleColor = Color.RED;
                break;
            case "Blue":
                circleColor = Color.BLUE;
                break;
            case "Green":
                circleColor = Color.GREEN;
                break;
        }
        colorPanel.repaint(); // Repaint the circle with the new color
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        EventQueue.invokeLater(() -> new CircleColorChangerAWT());
    }
}
