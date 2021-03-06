/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.viewclient;

import javax.swing.JOptionPane;
import lk.ijse.ars.viewserver.AdminDash;

/**
 *
 * @author USER
 */
public class NewLogin extends javax.swing.JFrame {

    /**
     * Creates new form NewLogin
     */
    public NewLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbSelectUserType = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRestart = new javax.swing.JLabel();
        lblShutdown = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/FontAwesome_f00d(0)_32.png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 310, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/icomoon_e657(0)_48.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, 40, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 180, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/octicons_f049(0)_48.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 230, 40, 30));

        cmbSelectUserType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbSelectUserType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- Select User Type -", "Admin", "Client" }));
        cmbSelectUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectUserTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSelectUserType, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 130, 210, 30));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 230, 210, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 310, 450));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/SriLankan-Airlines.jpg"))); // NOI18N
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 740, 330));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 760, 350));

        lblRestart.setBackground(new java.awt.Color(204, 204, 204));
        lblRestart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblRestart.setForeground(new java.awt.Color(204, 204, 204));
        lblRestart.setText("Restart");
        lblRestart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRestartMouseClicked(evt);
            }
        });
        jPanel1.add(lblRestart, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 60, 30));

        lblShutdown.setBackground(new java.awt.Color(204, 204, 204));
        lblShutdown.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblShutdown.setForeground(new java.awt.Color(204, 204, 204));
        lblShutdown.setText("Shutdown");
        lblShutdown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShutdownMouseClicked(evt);
            }
        });
        jPanel1.add(lblShutdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 60, 30));

        jLabel16.setFont(new java.awt.Font("Castellar", 0, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Reservation System");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 330, 40));

        jLabel15.setFont(new java.awt.Font("Algerian", 0, 64)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 255));
        jLabel15.setText("AirGO");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 70));

        jLabel7.setBackground(new java.awt.Color(0, 0, 153));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 120));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 760, 70));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 560));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Iconic_2718(0)_96.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, 80, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cmbSelectUserType.getSelectedItem().toString().equalsIgnoreCase("Admin")) {
            new AdminDash().setVisible(true);
            this.dispose();
        }
        if (cmbSelectUserType.getSelectedItem().toString().equalsIgnoreCase("Client")) {
            new ClientDash().setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void lblShutdownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShutdownMouseClicked
        int res = JOptionPane.showConfirmDialog(this,"Are You Sure You Want to ShutDown? ",null,JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            Runtime runtime = Runtime.getRuntime();
            try{
                Process process = runtime.exec("Shutdown -s -t 1");
            }catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(this,"Are you sure");
            }
        }
    }//GEN-LAST:event_lblShutdownMouseClicked

    private void lblRestartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRestartMouseClicked
        int res = JOptionPane.showConfirmDialog(this,"Are You Sure You Want to ShutDown? ",null,JOptionPane.YES_NO_OPTION);
        if (res == 0) {
            Runtime runtime = Runtime.getRuntime();
            try{
                Process process = runtime.exec("Shutdown -r -t 120");
            }catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(this,"Are you sure");
            }
        }
    }//GEN-LAST:event_lblRestartMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void cmbSelectUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSelectUserTypeActionPerformed

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
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbSelectUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblRestart;
    private javax.swing.JLabel lblShutdown;
    // End of variables declaration//GEN-END:variables
}
