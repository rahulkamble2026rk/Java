/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rohit
 */  
import java.sql.*; 
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Practiceform extends javax.swing.JFrame
{

    /**
     * Creates new form Practiceform
     */
    public Practiceform()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        listbtn = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        datalst = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        TFetch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        listbtn.setBackground(new java.awt.Color(102, 255, 0));
        listbtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        listbtn.setForeground(new java.awt.Color(0, 0, 255));
        listbtn.setText("Fetch");
        listbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(255, 0, 51), new java.awt.Color(255, 0, 255)));
        listbtn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                listbtnActionPerformed(evt);
            }
        });

        cmb.setBackground(new java.awt.Color(102, 255, 51));
        cmb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cmb.setForeground(new java.awt.Color(0, 0, 255));
        cmb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 51, 255), new java.awt.Color(255, 0, 255), new java.awt.Color(153, 153, 255), new java.awt.Color(102, 102, 255)));
        cmb.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cmbActionPerformed(evt);
            }
        });

        datalst.setBackground(new java.awt.Color(0, 204, 204));
        datalst.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(0, 153, 153)));
        datalst.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        datalst.setForeground(new java.awt.Color(255, 0, 255));
        jScrollPane1.setViewportView(datalst);

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {

            }
        ));
        jScrollPane2.setViewportView(tblstudent);

        TFetch.setBackground(new java.awt.Color(0, 255, 0));
        TFetch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TFetch.setForeground(new java.awt.Color(0, 0, 255));
        TFetch.setText("TFetch");
        TFetch.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 204), new java.awt.Color(51, 51, 255)));
        TFetch.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                TFetchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(listbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(TFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(listbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void cmbActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cmbActionPerformed
    {//GEN-HEADEREND:event_cmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbActionPerformed

    private void listbtnActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_listbtnActionPerformed
    {//GEN-HEADEREND:event_listbtnActionPerformed
            
             try 
             {
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1000/employee","root","RAHUL#2004"); 
                 Statement st=con.createStatement();
                 String query="select fname,lname from employee_info"; 
                 ResultSet res=st.executeQuery(query); 
                 DefaultListModel lst=new DefaultListModel();  // this is the DeafultListModel lst object 
                 while(res.next()==true)
                 {  
                     String f=res.getString("fname"); 
                     String s=res.getString("lname");
                     cmb.addItem(f+" "+s); 
                     lst.addElement(f+" "+s); 
                 }  
                 datalst.setModel(lst);
                 JOptionPane.showMessageDialog(this,"Data fetch sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
             }  
             catch(SQLException e)
             {
                 JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE); 
                 
             }
    }//GEN-LAST:event_listbtnActionPerformed

    private void TFetchActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_TFetchActionPerformed
    {//GEN-HEADEREND:event_TFetchActionPerformed
           try
           {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:1000/employee","root","RAHUL#2004"); 
            Statement st = con.createStatement();
            String query = "select fname,lname from employee_info";
            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd = rs.getMetaData(); //->>> 
            
            DefaultTableModel  model = (DefaultTableModel)tblstudent.getModel();
            int cols = rsmd.getColumnCount();
            String colnames[] = new String[cols];
            for(int i=0;i<cols;i++)
            {
                colnames[i]=rsmd.getColumnName(i+1);
            }
            model.setColumnIdentifiers(colnames);
            String fname,mname,lname;
            while(rs.next())
            {
                fname = rs.getString("fname");
                lname = rs.getString("lname");
                String row[] ={fname,lname}; 
                model.addRow(row);
            }
            con.close();
            st.close(); 
             JOptionPane.showMessageDialog(this,"Data fetch sucessfully","Sucess",JOptionPane.INFORMATION_MESSAGE);
        } 
          catch(SQLException e)
             {
                 JOptionPane.showMessageDialog(this,e,"ERROR",JOptionPane.ERROR_MESSAGE); 
                 
             }
    }//GEN-LAST:event_TFetchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Practiceform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Practiceform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Practiceform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Practiceform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Practiceform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton TFetch;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JList<String> datalst;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listbtn;
    private javax.swing.JTable tblstudent;
    // End of variables declaration//GEN-END:variables
}
