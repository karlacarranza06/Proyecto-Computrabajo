//APORTE DE JOSUE
//APORTE DE KARLA

package proyecto.computrabajo;

import Paneles.PanelConfiguracion;
import Paneles.PanelDashboard;
import Paneles.PanelGestionUsuarios;
import Paneles.PanelGestionVacantes;
import Paneles.PanelPostulaciones;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;
import utils.Navigation;

public class MainFrame extends javax.swing.JFrame {
    private static final Navigation navigation = Navigation.getInstance();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());

    public MainFrame() {
        initComponents();

        navigation.setMainPanel(pnlMainContent);
        navigation.setBreadcrumbsLabel(lblBreadCrumbs);

        SwingUtilities.invokeLater(() -> {
            navigation.setMainFrame(this);
        });
        pnlMainContent.setLayout(new BorderLayout());
        
        navigation.navigateTo(new PanelDashboard());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMenuSettings = new javax.swing.JButton();
        btnMenuDashboard = new javax.swing.JButton();
        btnMenuPositions = new javax.swing.JButton();
        btnMenuApplicants = new javax.swing.JButton();
        btnMenuApplicants1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblBreadCrumbs = new javax.swing.JLabel();
        pnlMainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CompuTrabajoIcon.png"))); // NOI18N
        jLabel1.setText("CompuTrabajo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnMenuSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/ConfigIconGray.png"))); // NOI18N
        btnMenuSettings.setText("Configuracion");
        btnMenuSettings.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnMenuSettings.setContentAreaFilled(false);
        btnMenuSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuSettings.setIconTextGap(10);
        btnMenuSettings.setMargin(new java.awt.Insets(2, 20, 3, 14));
        btnMenuSettings.addActionListener(this::btnMenuSettingsActionPerformed);

        btnMenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/HomeIconGray.png"))); // NOI18N
        btnMenuDashboard.setText("Dashboard");
        btnMenuDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnMenuDashboard.setContentAreaFilled(false);
        btnMenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuDashboard.setIconTextGap(10);
        btnMenuDashboard.setMargin(new java.awt.Insets(2, 20, 3, 14));
        btnMenuDashboard.addActionListener(this::btnMenuDashboardActionPerformed);

        btnMenuPositions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/VacantesIconGray.png"))); // NOI18N
        btnMenuPositions.setText("Vacantes");
        btnMenuPositions.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnMenuPositions.setContentAreaFilled(false);
        btnMenuPositions.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPositions.setIconTextGap(10);
        btnMenuPositions.setMargin(new java.awt.Insets(2, 20, 3, 14));
        btnMenuPositions.addActionListener(this::btnMenuPositionsActionPerformed);

        btnMenuApplicants.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/PostulantesIconGray.png"))); // NOI18N
        btnMenuApplicants.setText("Postulantes");
        btnMenuApplicants.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnMenuApplicants.setContentAreaFilled(false);
        btnMenuApplicants.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuApplicants.setIconTextGap(10);
        btnMenuApplicants.setMargin(new java.awt.Insets(2, 20, 3, 14));
        btnMenuApplicants.addActionListener(this::btnMenuApplicantsActionPerformed);

        btnMenuApplicants1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/UsuariosIconGray.png"))); // NOI18N
        btnMenuApplicants1.setText("Usuarios");
        btnMenuApplicants1.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnMenuApplicants1.setContentAreaFilled(false);
        btnMenuApplicants1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuApplicants1.setIconTextGap(10);
        btnMenuApplicants1.setMargin(new java.awt.Insets(2, 20, 3, 14));
        btnMenuApplicants1.addActionListener(this::btnMenuApplicants1ActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuPositions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuPositions, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuApplicants, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuApplicants1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenuSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        lblBreadCrumbs.setForeground(new java.awt.Color(102, 102, 102));
        lblBreadCrumbs.setText("Vacantes > Java Developer");
        lblBreadCrumbs.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBreadCrumbs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblBreadCrumbs)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMainContentLayout = new javax.swing.GroupLayout(pnlMainContent);
        pnlMainContent.setLayout(pnlMainContentLayout);
        pnlMainContentLayout.setHorizontalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 539, Short.MAX_VALUE)
        );
        pnlMainContentLayout.setVerticalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnMenuSettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSettingsActionPerformed
        navigation.reset(new PanelConfiguracion());
    }//GEN-LAST:event_btnMenuSettingsActionPerformed

    private void btnMenuDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDashboardActionPerformed
        navigation.reset(new PanelDashboard());
    }//GEN-LAST:event_btnMenuDashboardActionPerformed

    private void btnMenuPositionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPositionsActionPerformed
        navigation.reset(new PanelGestionVacantes());
    }//GEN-LAST:event_btnMenuPositionsActionPerformed

    private void btnMenuApplicantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuApplicantsActionPerformed
        navigation.reset(new PanelPostulaciones());
    }//GEN-LAST:event_btnMenuApplicantsActionPerformed

    private void btnMenuApplicants1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuApplicants1ActionPerformed
        navigation.reset(new PanelGestionUsuarios());
    }//GEN-LAST:event_btnMenuApplicants1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenuApplicants;
    private javax.swing.JButton btnMenuApplicants1;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuPositions;
    private javax.swing.JButton btnMenuSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBreadCrumbs;
    private javax.swing.JPanel pnlMainContent;
    // End of variables declaration//GEN-END:variables
}
