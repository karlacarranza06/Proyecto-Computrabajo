package Paneles;

 import utils.Navigation;

    public class PanelCrearVacante extends javax.swing.JPanel {

        private static final Navigation navigation = Navigation.getInstance();

        public PanelCrearVacante() {
            initComponents();

            txtDescriPuesto.setLineWrap(true);
            txtDescriPuesto.setWrapStyleWord(true);
            txtRequerimientos.setLineWrap(true);
            txtRequerimientos.setWrapStyleWord(true);

            javax.swing.ButtonGroup estadoGrupo = new javax.swing.ButtonGroup();
            estadoGrupo.add(RadPuestoActivo);
            estadoGrupo.add(RadPuestoPausado);
            RadPuestoActivo.setSelected(true);
            }

            public void limpiarCampos() {
            txtTituloPosicion.setText("");
            txtDescriPuesto.setText("Detalle las responsabilidades principales...");
            txtRequerimientos.setText("Liste los conocimientos tecnicos...");
            txtSalarioMin.setText("$ Min");
            txtSalarioMax.setText("$ Max");
            cmbTipoContrato.setSelectedIndex(0);
            cmbDepartamento.setSelectedIndex(0);
            cmbUbicacion.setSelectedIndex(0);
            jComboBox1.setSelectedIndex(0);
            RadPuestoActivo.setSelected(true);
            }

            private void procesarFormulario(String accion) {

            String titulo = txtTituloPosicion.getText().trim();
            String tipoContrato = cmbTipoContrato.getSelectedItem().toString().trim();
            String departamento = cmbDepartamento.getSelectedItem().toString().trim(); 
            String ubicacion = cmbUbicacion.getSelectedItem().toString().trim();
            String descripcion = txtDescriPuesto.getText().trim();
            String requerimientos = txtRequerimientos.getText().trim();
            String salMin = txtSalarioMin.getText().trim();
            String salMax = txtSalarioMax.getText().trim();
            String pipeline = jComboBox1.getSelectedItem().toString().trim()    ;
            String estado = RadPuestoActivo.isSelected() ? "Activa" : "Pausada";

            if (titulo.isEmpty() || titulo.equals("Titulo de la posición")) {
                javax.swing.JOptionPane.showMessageDialog(this, "Debe Ingresar Un Titulo Valido.");
                return;
            }

            if (cmbTipoContrato.getSelectedIndex() <= 0 || cmbDepartamento.getSelectedIndex() <= 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por Favor, Seleccione El Contrato Y El Departamento.");
                return;
            }

            System.out.println("Accion: " + accion);
            System.out.println("Publicando vacante: " + titulo + " en " + departamento);

            javax.swing.JOptionPane.showMessageDialog(this, "Vacante procesada como: " + accion);

            navigation.reset(new PanelGestionVacantes());
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
        pnlMainContent = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipoContrato = new javax.swing.JComboBox<>();
        txtTituloPosicion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbUbicacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSalarioMin = new javax.swing.JTextField();
        txtSalarioMax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        RadPuestoActivo = new javax.swing.JRadioButton();
        RadPuestoPausado = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        btnCancelarCrearVacante = new javax.swing.JButton();
        btnPublicarVacante = new javax.swing.JButton();
        btnBorradorVacante = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescriPuesto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRequerimientos = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        lblBreadCrumbs = new javax.swing.JLabel();
        lblBreadCrumbs1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
            .addComponent(btnMenuPositions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuApplicants1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlMainContent.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Ttulo de la posicion");

        jLabel5.setText("Tipo de contrato");

        cmbTipoContrato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione item: ", " ", "Indefinido", "Temporal", "Pasantia", "Tiempo Parcial" }));
        cmbTipoContrato.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbTipoContrato.addActionListener(this::cmbTipoContratoActionPerformed);

        txtTituloPosicion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        txtTituloPosicion.addActionListener(this::txtTituloPosicionActionPerformed);

        jLabel6.setText("Departamento:");

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione departamento...", " ", "Santa Ana", "Ahuachapan", "Sonsonate", "Chalatenango", "La Libertad", "San Salvador", "Cuscatlan", "Cabañas", "La paz", "San Vicente", "Usulutan", "San Miguel", "Morazan", "La Union" }));
        cmbDepartamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbDepartamento.addActionListener(this::cmbDepartamentoActionPerformed);

        jLabel7.setText("Ubicación");

        cmbUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Ubicacion...", " ", "Presencial", "Remoto", "Hibrido" }));
        cmbUbicacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cmbUbicacion.addActionListener(this::cmbUbicacionActionPerformed);

        jLabel8.setText("Descripción de Puesto");

        jLabel9.setText("Requerimientos");

        jLabel10.setText("Rango Salarial");

        txtSalarioMin.setForeground(new java.awt.Color(204, 204, 204));
        txtSalarioMin.setText("$ Min");
        txtSalarioMin.addActionListener(this::txtSalarioMinActionPerformed);

        txtSalarioMax.setForeground(new java.awt.Color(204, 204, 204));
        txtSalarioMax.setText("$ Max");
        txtSalarioMax.addActionListener(this::txtSalarioMaxActionPerformed);

        jLabel11.setText("Pipeline de Selección");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione pipeline...", " ", "Postulado    -  Etapa 1", "CV Visto       -  Etapa 2", "En Proceso   -  Etapa 3", "Finalista        -  Etapa 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jLabel12.setText("Estado");

        RadPuestoActivo.setText("Activa");
        RadPuestoActivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RadPuestoActivo.addActionListener(this::RadPuestoActivoActionPerformed);

        RadPuestoPausado.setText("Pausada");
        RadPuestoPausado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RadPuestoPausado.addActionListener(this::RadPuestoPausadoActionPerformed);

        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("___________________________________________________________________________________________________________");

        btnCancelarCrearVacante.setBackground(new java.awt.Color(255, 204, 204));
        btnCancelarCrearVacante.setText("Cancelar");
        btnCancelarCrearVacante.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCancelarCrearVacante.addActionListener(this::btnCancelarCrearVacanteActionPerformed);

        btnPublicarVacante.setBackground(new java.awt.Color(102, 102, 255));
        btnPublicarVacante.setForeground(new java.awt.Color(255, 255, 255));
        btnPublicarVacante.setText("Publicar Vacante");
        btnPublicarVacante.addActionListener(this::btnPublicarVacanteActionPerformed);

        btnBorradorVacante.setText("Guardar Borrador");
        btnBorradorVacante.addActionListener(this::btnBorradorVacanteActionPerformed);

        txtDescriPuesto.setColumns(20);
        txtDescriPuesto.setRows(5);
        jScrollPane1.setViewportView(txtDescriPuesto);

        txtRequerimientos.setColumns(20);
        txtRequerimientos.setRows(5);
        jScrollPane2.setViewportView(txtRequerimientos);

        javax.swing.GroupLayout pnlMainContentLayout = new javax.swing.GroupLayout(pnlMainContent);
        pnlMainContent.setLayout(pnlMainContentLayout);
        pnlMainContentLayout.setHorizontalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContentLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainContentLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(pnlMainContentLayout.createSequentialGroup()
                        .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainContentLayout.createSequentialGroup()
                                .addComponent(RadPuestoActivo)
                                .addGap(18, 18, 18)
                                .addComponent(RadPuestoPausado))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainContentLayout.createSequentialGroup()
                        .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainContentLayout.createSequentialGroup()
                                .addComponent(btnCancelarCrearVacante, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBorradorVacante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPublicarVacante))
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainContentLayout.createSequentialGroup()
                                .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(cmbUbicacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlMainContentLayout.createSequentialGroup()
                                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTituloPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMainContentLayout.createSequentialGroup()
                                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlMainContentLayout.createSequentialGroup()
                                        .addComponent(txtSalarioMin, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSalarioMax, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMainContentLayout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlMainContentLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(15, 15, 15))))
        );
        pnlMainContentLayout.setVerticalGroup(
            pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTituloPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalarioMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalarioMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadPuestoActivo)
                    .addComponent(RadPuestoPausado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(pnlMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorradorVacante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPublicarVacante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelarCrearVacante))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblBreadCrumbs.setForeground(new java.awt.Color(102, 102, 102));
        lblBreadCrumbs.setText("Vacantes >");
        lblBreadCrumbs.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblBreadCrumbs1.setForeground(new java.awt.Color(0, 0, 255));
        lblBreadCrumbs1.setText("Nueva Vacante");
        lblBreadCrumbs1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setText("Crear Nueva Vacante");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Configure los detalles para la publicacion de su nueva vacante laboral");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblBreadCrumbs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBreadCrumbs1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBreadCrumbs)
                    .addComponent(lblBreadCrumbs1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
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

    private void cmbTipoContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoContratoActionPerformed

    private void txtTituloPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloPosicionActionPerformed

    private void cmbDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentoActionPerformed

    private void cmbUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUbicacionActionPerformed

    private void txtSalarioMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioMinActionPerformed

    private void txtSalarioMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioMaxActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void RadPuestoActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadPuestoActivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadPuestoActivoActionPerformed

    private void RadPuestoPausadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadPuestoPausadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RadPuestoPausadoActionPerformed

    private void btnCancelarCrearVacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCrearVacanteActionPerformed
        int confirmar = javax.swing.JOptionPane.showConfirmDialog(this, 
            "¿Esta seguro de cancelar? Se perderan los cambios", "Confirmar", 
            javax.swing.JOptionPane.YES_NO_OPTION);
            
        if (confirmar == javax.swing.JOptionPane.YES_OPTION) {
            navigation.reset(new PanelGestionVacantes());
        }
    }//GEN-LAST:event_btnCancelarCrearVacanteActionPerformed

    private void btnBorradorVacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorradorVacanteActionPerformed
        procesarFormulario("BORRADOR");
    }//GEN-LAST:event_btnBorradorVacanteActionPerformed

    private void btnPublicarVacanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarVacanteActionPerformed
        procesarFormulario("PUBLICAR");
    }//GEN-LAST:event_btnPublicarVacanteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadPuestoActivo;
    private javax.swing.JRadioButton RadPuestoPausado;
    private javax.swing.JButton btnBorradorVacante;
    private javax.swing.JButton btnCancelarCrearVacante;
    private javax.swing.JButton btnMenuApplicants;
    private javax.swing.JButton btnMenuApplicants1;
    private javax.swing.JButton btnMenuDashboard;
    private javax.swing.JButton btnMenuPositions;
    private javax.swing.JButton btnMenuSettings;
    private javax.swing.JButton btnPublicarVacante;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbTipoContrato;
    private javax.swing.JComboBox<String> cmbUbicacion;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBreadCrumbs;
    private javax.swing.JLabel lblBreadCrumbs1;
    private javax.swing.JPanel pnlMainContent;
    private javax.swing.JTextArea txtDescriPuesto;
    private javax.swing.JTextArea txtRequerimientos;
    private javax.swing.JTextField txtSalarioMax;
    private javax.swing.JTextField txtSalarioMin;
    private javax.swing.JTextField txtTituloPosicion;
    // End of variables declaration//GEN-END:variables
}
