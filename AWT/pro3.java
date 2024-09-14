import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;

class Myframe3 extends Frame implements Runnable {
    int x, y;
    Ellipse2D.Double circle;
    Thread t;

    Myframe3() {
        setSize(800, 800);
        setTitle("This is pro3");
        setLocationRelativeTo(null);
        setBackground(Color.GRAY);
        Myframe3 ref = this;
        t = new Thread(this);

        // Adapter ko as Anoynmonus inner class karke use karna hai, but registration ke time pe windowListener ko hi use karna hai
        WindowAdapter obj = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                ref.dispose();
            }
        };
        this.addWindowListener(obj);

        // Add mouse listener
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int mouseX = e.getX();
                int mouseY = e.getY();
                if (circle != null && circle.contains(mouseX, mouseY)) {
                    System.out.println("hit");
                } else {
                    System.out.println("miss");
                }
            }
        });

        setVisible(true);
        t.start(); // Start the thread
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        circle = new Ellipse2D.Double(x, y, 200, 200);
        g2d.fill(circle);
    }

    public void run() {
        while (true) {
            x = (int) (Math.random() * 600);
            y = (int) (Math.random() * 600);
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("caught" + e);
            }
        }
    }
}

public class pro3 {
    public static void main(String args[]) {
        Myframe3 frame = new Myframe3();
    }
}
