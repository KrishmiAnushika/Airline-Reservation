/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.viewclient;

import java.awt.Color;
import java.text.SimpleDateFormat;

/**
 *
 * @author USER
 */
public class ClientDash extends javax.swing.JFrame {

    /**
     * Creates new form ClientDash
     */
    public ClientDash() {
        initComponents();
        setDate();
        setTime();
        Home ad=new Home();
        pnlLoad.removeAll();
        pnlLoad.repaint();
        pnlLoad.revalidate();
        ad.setSize(pnlLoad.getSize());
        pnlLoad.add(ad);
        ad.setVisible(true);
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
        pnlLoad = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblTimeMain = new javax.swing.JLabel();
        lblDateMain = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblSearchBooking = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblAddNewBooking = new javax.swing.JLabel();
        lblSearchBalance = new javax.swing.JLabel();
        lblSetting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLoad.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Recevation System");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 330, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/AirGo-Design-closes-its-first-external-investment-round-to-accelerate-growth.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 90));

        lblTimeMain.setBackground(new java.awt.Color(153, 204, 255));
        lblTimeMain.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        lblTimeMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblTimeMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 280, 70));

        lblDateMain.setBackground(new java.awt.Color(153, 204, 255));
        lblDateMain.setFont(new java.awt.Font("Tahoma", 2, 32)); // NOI18N
        lblDateMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel4.add(lblDateMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 260, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/21716735_l-1024x671.jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 210, 250, 210));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Iconic_2718(0)_96.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, 80, 60));

        jLabel1.setBackground(new java.awt.Color(204, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/2315714_300.jpg"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, 224));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/overcoming-fear-of-flying.jpg"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, 240));
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 1040, 290));

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setOpaque(true);

        jLabel11.setText("AIRGO ");

        javax.swing.GroupLayout pnlLoadLayout = new javax.swing.GroupLayout(pnlLoad);
        pnlLoad.setLayout(pnlLoadLayout);
        pnlLoadLayout.setHorizontalGroup(
            pnlLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlLoadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLoadLayout.setVerticalGroup(
            pnlLoadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoadLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(pnlLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 1170, 770));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHome.setBackground(new java.awt.Color(0, 0, 204));
        lblHome.setForeground(new java.awt.Color(153, 204, 255));
        lblHome.setText("HOME");
        lblHome.setOpaque(true);
        lblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblHomeMouseExited(evt);
            }
        });
        jPanel2.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 91, 200, 47));

        lblSearchBooking.setBackground(new java.awt.Color(0, 0, 0));
        lblSearchBooking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSearchBooking.setForeground(new java.awt.Color(204, 204, 204));
        lblSearchBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Material Icons_e881(2)_48.png"))); // NOI18N
        lblSearchBooking.setText("Search Booking");
        lblSearchBooking.setOpaque(true);
        lblSearchBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSearchBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSearchBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSearchBookingMouseExited(evt);
            }
        });
        jPanel2.add(lblSearchBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 90));

        lblLogout.setBackground(new java.awt.Color(0, 0, 0));
        lblLogout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(204, 204, 204));
        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLogout.setText("         LOGOUT");
        lblLogout.setOpaque(true);
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });
        jPanel2.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 200, 90));

        lblAddNewBooking.setBackground(new java.awt.Color(0, 0, 0));
        lblAddNewBooking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddNewBooking.setForeground(new java.awt.Color(204, 204, 204));
        lblAddNewBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Typicons_e08b(0)_48.png"))); // NOI18N
        lblAddNewBooking.setText("Add New Booking");
        lblAddNewBooking.setOpaque(true);
        lblAddNewBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddNewBookingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddNewBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddNewBookingMouseExited(evt);
            }
        });
        jPanel2.add(lblAddNewBooking, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 90));

        lblSearchBalance.setBackground(new java.awt.Color(0, 0, 0));
        lblSearchBalance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSearchBalance.setForeground(new java.awt.Color(204, 204, 204));
        lblSearchBalance.setText("Serch Balance");
        lblSearchBalance.setOpaque(true);
        lblSearchBalance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSearchBalanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSearchBalanceMouseExited(evt);
            }
        });
        jPanel2.add(lblSearchBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 100));

        lblSetting.setBackground(new java.awt.Color(0, 0, 0));
        lblSetting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSetting.setForeground(new java.awt.Color(204, 204, 204));
        lblSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Material Icons_e8a4(1)_32.png"))); // NOI18N
        lblSetting.setText("Serch Balance");
        lblSetting.setOpaque(true);
        lblSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSettingMouseExited(evt);
            }
        });
        jPanel2.add(lblSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 100));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 770));

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

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lblSearchBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBookingMouseEntered
        lblSearchBooking.setBackground(Color.DARK_GRAY);
        lblSearchBooking.setForeground(Color.red);
    }//GEN-LAST:event_lblSearchBookingMouseEntered

    private void lblSearchBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBookingMouseExited
        lblSearchBooking.setBackground(Color.BLACK);
        lblSearchBooking.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblSearchBookingMouseExited

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        lblLogout.setBackground(Color.DARK_GRAY);
        lblLogout.setForeground(Color.red);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        lblLogout.setBackground(Color.BLACK);
        lblLogout.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblLogoutMouseExited

    private void lblAddNewBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewBookingMouseClicked
        NewBooking ad=new NewBooking();
        pnlLoad.removeAll();
        pnlLoad.repaint();
        pnlLoad.revalidate();
        ad.setSize(pnlLoad.getSize());
        pnlLoad.add(ad);
        ad.setVisible(true);
    }//GEN-LAST:event_lblAddNewBookingMouseClicked

    private void lblAddNewBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewBookingMouseEntered
        lblAddNewBooking.setBackground(Color.DARK_GRAY);
        lblAddNewBooking.setForeground(Color.red);
    }//GEN-LAST:event_lblAddNewBookingMouseEntered

    private void lblAddNewBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddNewBookingMouseExited
        lblAddNewBooking.setBackground(Color.BLACK);
        lblAddNewBooking.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblAddNewBookingMouseExited

    private void lblSearchBalanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBalanceMouseEntered
        lblSearchBalance.setBackground(Color.DARK_GRAY);
        lblSearchBalance.setForeground(Color.red);
    }//GEN-LAST:event_lblSearchBalanceMouseEntered

    private void lblSearchBalanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBalanceMouseExited
        lblSearchBalance.setBackground(Color.BLACK);
        lblSearchBalance.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblSearchBalanceMouseExited

    private void lblSearchBookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSearchBookingMouseClicked
       SearchDetails ad=new SearchDetails();
        pnlLoad.removeAll();
        pnlLoad.repaint();
        pnlLoad.revalidate();
        ad.setSize(pnlLoad.getSize());
        pnlLoad.add(ad);
        ad.setVisible(true);
    }//GEN-LAST:event_lblSearchBookingMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        Home ad=new Home();
        pnlLoad.removeAll();
        pnlLoad.repaint();
        pnlLoad.revalidate();
        ad.setSize(pnlLoad.getSize());
        pnlLoad.add(ad);
        ad.setVisible(true);
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        NewLogin nl = new NewLogin();
        nl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        lblHome.setForeground(Color.blue);
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        lblHome.setForeground(Color.white);
    }//GEN-LAST:event_lblHomeMouseExited

    private void lblSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingMouseEntered
        lblSetting.setBackground(Color.GRAY);
        lblSetting.setForeground(Color.red);
    }//GEN-LAST:event_lblSettingMouseEntered

    private void lblSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSettingMouseExited
        lblSetting.setBackground(Color.BLACK);
        lblSetting.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSettingMouseExited

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
            java.util.logging.Logger.getLogger(ClientDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAddNewBooking;
    private javax.swing.JLabel lblDateMain;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblSearchBalance;
    private javax.swing.JLabel lblSearchBooking;
    private javax.swing.JLabel lblSetting;
    private javax.swing.JLabel lblTimeMain;
    public static javax.swing.JPanel pnlLoad;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        
        java.util.Date d1 = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String formateDate = df.format(d1);
        lblDateMain.setText(formateDate);
    }

    private void setTime() {
         java.util.Date d1 = new java.util.Date();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
        String formateDate = df.format(d1);
        lblTimeMain.setText(formateDate);
    }
}
