/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;
//import Class.sSlide;

import javax.swing.JOptionPane;

/**
 *
 * @author klein
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    
    private int ejeX;
    private int ejeY;
    
    public main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }        
    int x = 230;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        jPanelSended = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelSended1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanelReceived = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanelHome = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelNew = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTab1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanelNewRequest = new javax.swing.JPanel();
        jPanelMsgReceived = new javax.swing.JPanel();
        jPanelMsgSended = new javax.swing.JPanel();
        jPanelAccount = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 0, 51));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSended.setBackground(new java.awt.Color(0, 0, 53));
        jPanelSended.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSended.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSendedMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSendedMouseEntered(evt);
            }
        });
        jPanelSended.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_customer_32px.png"))); // NOI18N
        jPanelSended.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cuenta");
        jPanelSended.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jPanelMenu.add(jPanelSended, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 170, 50));

        jPanelSended1.setBackground(new java.awt.Color(0, 0, 53));
        jPanelSended1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelSended1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSended1MouseClicked(evt);
            }
        });
        jPanelSended1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_received_32px.png"))); // NOI18N
        jPanelSended1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enviados");
        jPanelSended1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jPanelMenu.add(jPanelSended1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 170, 50));

        jPanelReceived.setBackground(new java.awt.Color(20, 20, 70));
        jPanelReceived.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelReceived.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelReceivedMouseClicked(evt);
            }
        });
        jPanelReceived.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_urgent_message_32px.png"))); // NOI18N
        jPanelReceived.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Recibidos");
        jPanelReceived.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jPanelMenu.add(jPanelReceived, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 170, 50));

        jPanelHome.setBackground(new java.awt.Color(0, 151, 240));
        jPanelHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelHomeMouseClicked(evt);
            }
        });
        jPanelHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_32px.png"))); // NOI18N
        jPanelHome.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inicio");
        jPanelHome.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jPanelMenu.add(jPanelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 170, 50));

        jPanelNew.setBackground(new java.awt.Color(20, 20, 70));
        jPanelNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelNewMouseClicked(evt);
            }
        });
        jPanelNew.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_add_32px_1.png"))); // NOI18N
        jPanelNew.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 50));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nuevo");
        jPanelNew.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 70, 30));

        jPanelMenu.add(jPanelNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 170, 50));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GetSoft");
        jPanelMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 30));
        jPanelMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 10));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Administrador");
        jPanelMenu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 90, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Welcome to GetSoft");
        jPanelMenu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 110, 20));

        jPanelMain.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 490));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("X");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 20, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("-");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 20, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Gestor de Archivos");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 140, 30));

        jPanelMain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 790, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-welcome.jpg"))); // NOI18N
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 480));

        jTab1.addTab("tab1", jPanel1);

        jPanelNewRequest.setBackground(new java.awt.Color(255, 255, 255));
        jTab1.addTab("tab2", jPanelNewRequest);

        jPanelMsgReceived.setBackground(new java.awt.Color(255, 255, 255));
        jTab1.addTab("tab3", jPanelMsgReceived);

        jPanelMsgSended.setBackground(new java.awt.Color(255, 255, 255));
        jTab1.addTab("tab4", jPanelMsgSended);
        jTab1.addTab("tab5", jPanelAccount);

        jPanelMain.add(jTab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 0, 800, 510));

        getContentPane().add(jPanelMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        int co=JOptionPane.YES_NO_OPTION;
        int res=JOptionPane.showConfirmDialog(null,"Esta seguro que desea salir?","Exit",co);
        if (res==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        this.setState(main.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jPanelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelHomeMouseClicked
        // TODO add your handling code here:
        jTab1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanelHomeMouseClicked

    private void jPanelNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNewMouseClicked
        // TODO add your handling code here:
        jTab1.setSelectedIndex(1);        
    }//GEN-LAST:event_jPanelNewMouseClicked

    private void jPanelReceivedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelReceivedMouseClicked
        // TODO add your handling code here:
        jTab1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanelReceivedMouseClicked

    private void jPanelSended1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSended1MouseClicked
        // TODO add your handling code here:
        jTab1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanelSended1MouseClicked

    private void jPanelSendedMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSendedMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelSendedMouseEntered

    private void jPanelSendedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSendedMouseClicked
        // TODO add your handling code here:
        jTab1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanelSendedMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
         ejeX = evt.getX();
         ejeY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        this.setLocation(this.getLocation().x + evt.getX() - ejeX, this.getLocation().y + evt.getY() - ejeY);
    }//GEN-LAST:event_jPanel2MouseDragged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAccount;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelMsgReceived;
    private javax.swing.JPanel jPanelMsgSended;
    private javax.swing.JPanel jPanelNew;
    private javax.swing.JPanel jPanelNewRequest;
    private javax.swing.JPanel jPanelReceived;
    private javax.swing.JPanel jPanelSended;
    private javax.swing.JPanel jPanelSended1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTab1;
    // End of variables declaration//GEN-END:variables
}
