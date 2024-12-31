import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class temp extends JFrame {

    private JPanel jPanel1;
    private JButton jButton3;
    private JLabel lblclose;

    public temp() {
        initComponents();
        try {
            // Load the image
            BufferedImage img = ImageIO.read(new File("C:\\Users\\rohit\\Dropbox\\Regal Java\\JavaApplication14\\src\\javaapplication14\\login.jpg"));

            // Scale the image
            Image dimg = img.getScaledInstance(lblclose.getWidth(), lblclose.getHeight(), Image.SCALE_SMOOTH);

            // Set the scaled image as an icon
            ImageIcon imageIcon = new ImageIcon(dimg);
            lblclose.setIcon(imageIcon);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Image not found or error loading image.");
        }
    }

    private void initComponents() {

        jPanel1 = new JPanel();
        jButton3 = new JButton();
        lblclose = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(13, 85, 158));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, 
            new java.awt.Color(102, 0, 204), new java.awt.Color(51, 51, 255), 
            new java.awt.Color(0, 0, 51), new java.awt.Color(51, 0, 102)));
        jPanel1.setForeground(new java.awt.Color(100, 225, 75));

        jButton3.setBackground(new java.awt.Color(51, 192, 238));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24));
        jButton3.setForeground(new java.awt.Color(33, 75, 25));
        jButton3.setText("Option");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, 
            new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255), 
            new java.awt.Color(51, 0, 255), new java.awt.Color(51, 0, 102)));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(534, Short.MAX_VALUE))
            .addComponent(lblclose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new temp().setVisible(true);
            }
        });
    }
}
