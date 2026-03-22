//APORTE DE ABELARDO
package Paneles;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import proyecto.computrabajo.MainFrame;

public class PanelLogin extends javax.swing.JPanel implements ITraceablePanel {
    
    MainFrame main;
    
    public PanelLogin(MainFrame main) {
        initComponents();
        this.main = main;
        btnLogin.setBackground(new Color(59, 130, 246));
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setFocusPainted(false);
        btnLogin.setBorderPainted(false);
        lblContraseña.setForeground(new Color(59, 130, 246));
        lblContraseña.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cbxRecuerdame.setBackground(Color.WHITE);
        txtEmail.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        txtPassword.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        cbxRecuerdame = new javax.swing.JCheckBox();
        btnLogin = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CompuTrabajoIcon.png"))); // NOI18N
        jLabel1.setText("CompuTrabajo");

        jPanel1.setBorder(new javax.swing.border.EmptyBorder(20,20,20,20));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 300));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Iniciar Sesión");

        jLabel3.setText("Correo Electrónico");

        jLabel4.setText("Contraseña");

        txtPassword.addActionListener(this::txtPasswordActionPerformed);

        cbxRecuerdame.setText("Recuérdame");
        cbxRecuerdame.addActionListener(this::cbxRecuerdameActionPerformed);

        btnLogin.setText("Iniciar Sesión");
        btnLogin.addActionListener(this::btnLoginActionPerformed);

        lblContraseña.setForeground(new java.awt.Color(0, 0, 255));
        lblContraseña.setText("¿Olvidó su contraseña?");
        lblContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblContraseña))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbxRecuerdame)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(txtPassword)
                                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(51, 51, 51))))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxRecuerdame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblContraseña)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cbxRecuerdameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRecuerdameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRecuerdameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       String user = txtEmail.getText();
    String pass = new String(txtPassword.getPassword());

    //CREDENCIALES DE PRUEBA
    if (user.equals("admin") && pass.equals("123")) {
        main.mostrarSistema();

    } else {
        JOptionPane.showMessageDialog(this, "Credenciales incorrectas");
    }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    @Override
    public String getTitle() {
        return "Login";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbxRecuerdame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
