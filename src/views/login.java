/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author klein
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
         try{
 
  JFrame.setDefaultLookAndFeelDecorated(true);
  JDialog.setDefaultLookAndFeelDecorated(true);  
  UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
  //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
}
catch (Exception e)
 {
  e.printStackTrace();
 }
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
        jLabelfondologin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabeluser = new javax.swing.JLabel();
        jLabelpassword = new javax.swing.JLabel();
        cajaUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        cajaContra = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabelGoogle = new javax.swing.JLabel();
        jLabelGithub = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 150));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelfondologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo-vector-tecnologia-brillante-abstracto-poli-baja-gris_91248-20.jpg"))); // NOI18N
        jLabelfondologin.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel1.add(jLabelfondologin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabeluser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jPanel1.add(jLabeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        jLabelpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/padlock.png"))); // NOI18N
        jPanel1.add(jLabelpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));

        cajaUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cajaUser.setBorder(null);
        cajaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUserActionPerformed(evt);
            }
        });
        jPanel1.add(cajaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 180, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 190, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 190, 10));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Recordarme");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel2.setText("Olvido la contraseña?");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 130, 20));

        btnEntrar.setBackground(new java.awt.Color(0, 153, 101));
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("INGRESAR");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusable(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 200, 30));

        cajaContra.setBorder(null);
        jPanel1.add(cajaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 180, 30));

        jLabel3.setText("Ingresar con:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        jLabelGoogle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/google.png"))); // NOI18N
        jLabelGoogle.setToolTipText("");
        jLabelGoogle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelGoogle, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        jLabelGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logotipo-de-github.png"))); // NOI18N
        jLabelGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabelGithub, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/error.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

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

    private void cajaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUserActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        System.out.println("usar");
    }//GEN-LAST:event_btnEntrarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnEntrar;
    public javax.swing.JPasswordField cajaContra;
    public javax.swing.JTextField cajaUser;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGithub;
    private javax.swing.JLabel jLabelGoogle;
    public javax.swing.JLabel jLabelfondologin;
    private javax.swing.JLabel jLabelpassword;
    private javax.swing.JLabel jLabeluser;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
