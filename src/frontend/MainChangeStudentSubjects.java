//This class was created on 2018.11.23 by Jaco van Stryp
package frontend;

/**
 *
 * @author Jaco van Stryp
 */
public class MainChangeStudentSubjects extends javax.swing.JFrame {

    /**
     * Creates new form MainUserInterface
     */
    public MainChangeStudentSubjects() {
        initComponents();
    }
    int xMouse;
    int yMouse;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        g8v1 = new javax.swing.JTextField();
        g8v4 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        g8v5 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnVote7 = new javax.swing.JButton();
        btnVote5 = new javax.swing.JButton();
        btnVote8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eduplex Book Management System");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(8, 8, 94));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel2MouseReleased(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Eduplex Book Management System");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 4, -1, -1));

        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Eduplex EVS v5 Small.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 741, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(741, 67, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 477, 8, 24));

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Student Full Name:");
        jPanel1.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 40));

        g8v1.setBackground(new java.awt.Color(34, 34, 78));
        g8v1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8v1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 490, 40));

        g8v4.setBackground(new java.awt.Color(34, 34, 78));
        g8v4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8v4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8v4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 490, 40));

        jLabel58.setBackground(new java.awt.Color(255, 255, 255));
        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Student Grade:");
        jPanel1.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 190, 40));

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Student Number:");
        jPanel1.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 40));

        g8v5.setBackground(new java.awt.Color(34, 34, 78));
        g8v5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        g8v5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(g8v5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 490, 40));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Student New Subjects:");
        jPanel1.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 40));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Seperate By - \" ; \"");
        jPanel1.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 200, 40));

        jTextArea1.setBackground(new java.awt.Color(34, 34, 78));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 490, 150));

        btnVote7.setBackground(new java.awt.Color(255, 89, 33));
        btnVote7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote7.setForeground(new java.awt.Color(255, 255, 255));
        btnVote7.setText("Next");
        btnVote7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 440, 210, 40));

        btnVote5.setBackground(new java.awt.Color(255, 89, 33));
        btnVote5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote5.setForeground(new java.awt.Color(255, 255, 255));
        btnVote5.setText("Main Menu");
        btnVote5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 210, 40));

        btnVote8.setBackground(new java.awt.Color(255, 89, 33));
        btnVote8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVote8.setForeground(new java.awt.Color(255, 255, 255));
        btnVote8.setText("Clear");
        btnVote8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnVote8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 210, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Change Student Subjects");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //Code will log the user out and then close the program

        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
      
    }//GEN-LAST:event_jLabel15MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        //This is used so the user can drag the window around without it having an frame
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseReleased

        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MouseReleased

    private void btnVote7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVote7ActionPerformed

    private void btnVote5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote5ActionPerformed
       new MainUserInterface().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVote5ActionPerformed

    private void btnVote8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVote8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVote8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainChangeStudentSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainChangeStudentSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainChangeStudentSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainChangeStudentSubjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainChangeStudentSubjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVote5;
    private javax.swing.JButton btnVote7;
    private javax.swing.JButton btnVote8;
    private javax.swing.JTextField g8v1;
    private javax.swing.JTextField g8v4;
    private javax.swing.JTextField g8v5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
