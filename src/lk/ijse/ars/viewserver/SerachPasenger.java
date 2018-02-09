/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.ars.viewserver;

import java.awt.Color;

/**
 *
 * @author Krishanthi
 */
public class SerachPasenger extends javax.swing.JPanel {

    /**
     * Creates new form SerachPasenger
     */
    public SerachPasenger() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblConfirm = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblWaitingOrders = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 360, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Material Icons_e8b6(2)_64.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, 50, 30));

        jLabel17.setBackground(new java.awt.Color(51, 51, 51));
        jLabel17.setOpaque(true);
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 370, 50));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/image/img-1514358746221.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 700, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 60));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblConfirm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblConfirm.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Select_White_(56).png"))); // NOI18N
        lblConfirm.setText("Confirm");
        lblConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblConfirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblConfirmMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1238, Short.MAX_VALUE)
                .addComponent(lblConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1370, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "City", "AirPort", "Flight No", "Flight Name", "Type", "Class", "Seat", "Pasenger ID", "Pasenger Name", "Contact"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 167, 1330, 370));

        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 20));

        jLabel2.setBackground(new java.awt.Color(0, 204, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/ars/icon/Material Icons_e8b6(2)_48.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 40, 40));

        jLabel3.setBackground(new java.awt.Color(0, 204, 255));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 40));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Booking Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1330, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Waiting Pasenger");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 130, 30));

        lblWaitingOrders.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblWaitingOrders.setForeground(new java.awt.Color(102, 102, 102));
        lblWaitingOrders.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWaitingOrders.setText("00");
        lblWaitingOrders.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(lblWaitingOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 120, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblConfirmMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseEntered
        lblConfirm.setForeground(Color.GREEN);
    }//GEN-LAST:event_lblConfirmMouseEntered

    private void lblConfirmMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseExited
        lblConfirm.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblConfirmMouseExited

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void lblConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmMouseClicked
        //
        ServerHome sh = new ServerHome();
        AdminDash.pnlMain.removeAll();
        AdminDash.pnlMain.repaint();
        AdminDash.pnlMain.revalidate();
        sh.setSize(AdminDash.pnlMain.getSize());
        AdminDash.pnlMain.add(sh);
        sh.setVisible(true);
        
    }//GEN-LAST:event_lblConfirmMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblWaitingOrders;
    // End of variables declaration//GEN-END:variables
}