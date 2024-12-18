/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proaula.view;

/**
 *
 * @author Carlos Paez
 */
public class login extends javax.swing.JFrame {
    String user;
    String password;
    /**
     * Creates new form home
     */
    public login() {
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

        background = new javax.swing.JPanel();
        loginText = new javax.swing.JLabel();
        lateralPanel = new javax.swing.JPanel();
        userTextField = new javax.swing.JTextField();
        userText = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        passwordText = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginText.setText("Iniciar Sesión");
        background.add(loginText, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, -1, -1));

        lateralPanel.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout lateralPanelLayout = new javax.swing.GroupLayout(lateralPanel);
        lateralPanel.setLayout(lateralPanelLayout);
        lateralPanelLayout.setHorizontalGroup(
            lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        lateralPanelLayout.setVerticalGroup(
            lateralPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        background.add(lateralPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 480));

        userTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextFieldActionPerformed(evt);
            }
        });
        background.add(userTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 380, -1));

        userText.setText("Usuario");
        background.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, -1, -1));
        background.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 380, -1));

        passwordText.setText("Contraseña");
        background.add(passwordText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        loginButton.setText("Ingresar");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        background.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel1.setText("¿No tienes usuario?");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        jButton1.setText("Registrarte");
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextFieldActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        user = userTextField.getText();
        password = passwordTextField.getText();
        
    }//GEN-LAST:event_loginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel lateralPanel;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel passwordText;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JLabel userText;
    private javax.swing.JTextField userTextField;
    // End of variables declaration//GEN-END:variables
}
