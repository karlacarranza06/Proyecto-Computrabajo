//APORTE DE JOSUE
//APORTE DE KARLA

package proyecto.computrabajo;

import Paneles.PanelConfiguracion;
import Paneles.PanelDashboard;
import Paneles.PanelGestionUsuarios;
import Paneles.PanelGestionVacantes;
import Paneles.PanelLogin;
import Paneles.PanelPostulaciones;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.SwingUtilities;
import utils.Navigation;

public class MainFrame extends javax.swing.JFrame {
    private static final Navigation navigation = Navigation.getInstance();
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainFrame.class.getName());
    

    public MainFrame() {
        initComponents();
        navigation.setMainPanel(pnlMainContent);
        navigation.setBreadcrumbsLabel(lblBreadCrumbs);
        
        mainWrapper.setLayout(new GridBagLayout());
        GridBagLayout layout = (GridBagLayout) mainWrapper.getLayout();
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 0.0;
        gbc.weighty = 1.0;

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.anchor = GridBagConstraints.CENTER;

        // Que use todo el espacio disponible
        gbc.fill = GridBagConstraints.BOTH;
        
        layout.setConstraints(centeredWrapper, gbc);
        
        mainWrapper.revalidate();
        mainWrapper.repaint();

        SwingUtilities.invokeLater(() -> {
            navigation.setMainFrame(this);
        });
        pnlMainContent.setLayout(new BorderLayout());
        ocultarMenu();
        mostrarLogin();
    }
    
    //Para que solo se vea el login nomás y el logo, solo es prototipo aún
    private void ocultarMenu() {
        btnMenuDashboard.setVisible(false);
        btnMenuPositions.setVisible(false);
        btnMenuApplicants.setVisible(false);
        btnMenuApplicants1.setVisible(false);
        btnMenuSettings.setVisible(false);
    }
    
    //mostrar login en vez de pantalla principal
    private void mostrarLogin() {
        pnlMainContent.removeAll();
        pnlMainContent.add(new PanelLogin(this));
        pnlMainContent.revalidate();
        pnlMainContent.repaint();
    }

    public void mostrarSistema() {

        // Mostrar menú
        btnMenuDashboard.setVisible(true);
        btnMenuPositions.setVisible(true);
        btnMenuApplicants.setVisible(true);
        btnMenuApplicants1.setVisible(true);
        btnMenuSettings.setVisible(true);

        //Cargar Pantalla principal
        pnlMainContent.removeAll();
        pnlMainContent.add(new PanelDashboard());
        pnlMainContent.revalidate();
        pnlMainContent.repaint();
    }

    
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnMenuSettings = new javax.swing.JButton();
        btnMenuDashboard = new javax.swing.JButton();
        btnMenuPositions = new javax.swing.JButton();
        btnMenuApplicants = new javax.swing.JButton();
        btnMenuApplicants1 = new javax.swing.JButton();
        mainWrapper = new javax.swing.JPanel();
        centeredWrapper = new javax.swing.JPanel();
        pnlMainContent = new javax.swing.JPanel();
        topBar = new javax.swing.JPanel();
        lblBreadCrumbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/CompuTrabajoIcon.png"))); // NOI18N
        lblLogo.setText("CompuTrabajo");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblLogo)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblLogo)
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
            .addComponent(btnMenuPositions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(159, Short.MAX_VALUE))
        );

        centeredWrapper.setMaximumSize(new java.awt.Dimension(1024, 32767));
        centeredWrapper.setPreferredSize(new java.awt.Dimension(1024, 519));

        pnlMainContent.setMaximumSize(new java.awt.Dimension(1024, 32767));
        pnlMainContent.setPreferredSize(new java.awt.Dimension(1024, 1024));

        javax.swing.GroupLayout pnlMainContentLayout = new javax.swing.GroupLayout(pnlMainContent);
        pnlMainContent.setLayout(pnlMainContentLayout);
        pnlMainContentLayout.setHorizontalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMainContentLayout.setVerticalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        topBar.setMaximumSize(new java.awt.Dimension(1024, 58));
        topBar.setPreferredSize(new java.awt.Dimension(1024, 58));

        lblBreadCrumbs.setForeground(new java.awt.Color(102, 102, 102));
        lblBreadCrumbs.setText("Vacantes > Java Developer");
        lblBreadCrumbs.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBreadCrumbs, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
                .addContainerGap())
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblBreadCrumbs)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout centeredWrapperLayout = new javax.swing.GroupLayout(centeredWrapper);
        centeredWrapper.setLayout(centeredWrapperLayout);
        centeredWrapperLayout.setHorizontalGroup(
            centeredWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        centeredWrapperLayout.setVerticalGroup(
            centeredWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, centeredWrapperLayout.createSequentialGroup()
                .addComponent(topBar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainWrapperLayout = new javax.swing.GroupLayout(mainWrapper);
        mainWrapper.setLayout(mainWrapperLayout);
        mainWrapperLayout.setHorizontalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centeredWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainWrapperLayout.setVerticalGroup(
            mainWrapperLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(centeredWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainWrapper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
¿
    private javax.swing.JPanel centeredWrapper;
    private javax.swing.JLabel jLabel1;

    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblBreadCrumbs;

    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel mainWrapper;
    private javax.swing.JPanel pnlMainContent;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
