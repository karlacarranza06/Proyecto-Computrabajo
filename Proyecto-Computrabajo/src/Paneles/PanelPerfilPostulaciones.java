//APORTE DE DANIEL
package Paneles;

import javax.swing.DefaultListModel;
import utils.Navigation;

public class PanelPerfilPostulaciones extends javax.swing.JPanel implements ITraceablePanel {

    public PanelPerfilPostulaciones() {
        initComponents();
        txtEducacion.setEditable(false);
        txtCompetencias.setEditable(false);
        txtHistorial.setEditable(false);

        txtEducacion.setLineWrap(true);
        txtEducacion.setWrapStyleWord(true);

        txtCompetencias.setLineWrap(true);
        txtCompetencias.setWrapStyleWord(true);

        txtHistorial.setLineWrap(true);
        txtHistorial.setWrapStyleWord(true);

        txtNota.setLineWrap(true);
        txtNota.setWrapStyleWord(true);

        limpiarPerfil();
    }
    DefaultListModel<String> modelo = new DefaultListModel<>();

    @SuppressWarnings("unchecked")

    private int etapa = 0;
    private boolean procesoFinalizado = false;

    public void mostrarDatosPerfil(String nombre, String correo, String telefono,
            String direccion, String educacion,
            String competencias) {

        lblNombreDato.setText(nombre);
        lblCorreoDato.setText(correo);
        lblTelefonoDato.setText(telefono);
        lblDireccionDato.setText(direccion);

        txtEducacion.setText(educacion);
        txtCompetencias.setText(competencias);
    }

    public void agregarNotaHistorial(String nota) {
        String historialActual = txtHistorial.getText().trim();

        if (historialActual.isEmpty()) {
            txtHistorial.setText("• " + nota);
        } else {
            txtHistorial.setText(historialActual + "\n• " + nota);
        }
    }

    public void limpiarPerfil() {
    lblNombreDato.setText("");
    lblCorreoDato.setText("");
    lblTelefonoDato.setText("");
    lblDireccionDato.setText("");

    txtEducacion.setText("");
    txtCompetencias.setText("");
    txtNota.setText("");
    txtHistorial.setText("");

    etapa = 0;
    
    procesoFinalizado = false;
    btnAvanzar.setEnabled(true);
    btnRechazar.setEnabled(true);

    actualizarPipeline();
    }

    public void actualizarPipeline() {
        java.awt.Color colorNormal = java.awt.Color.BLACK;
        java.awt.Color colorActivo = new java.awt.Color(0, 153, 0);

        lblRevisionCV.setForeground(colorNormal);
        lblEvaluacionTecnica.setForeground(colorNormal);
        lblEntrevista.setForeground(colorNormal);
        lblOfertaFinal.setForeground(colorNormal);

        if (etapa >= 0) {
            lblRevisionCV.setForeground(colorActivo);
        }
        if (etapa >= 1) {
            lblEvaluacionTecnica.setForeground(colorActivo);
        }
        if (etapa >= 2) {
            lblEntrevista.setForeground(colorActivo);
        }
        if (etapa >= 3) {
            lblOfertaFinal.setForeground(colorActivo);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelPostulante = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblNombreDato = new javax.swing.JLabel();
        lblCorreoDato = new javax.swing.JLabel();
        lblTelefonoDato = new javax.swing.JLabel();
        lblDireccionDato = new javax.swing.JLabel();
        PanelReclutamiento = new javax.swing.JPanel();
        btnAvanzar = new javax.swing.JButton();
        btnRechazar = new javax.swing.JButton();
        lblRevisionCV = new javax.swing.JLabel();
        lblEvaluacionTecnica = new javax.swing.JLabel();
        lblEntrevista = new javax.swing.JLabel();
        lblOfertaFinal = new javax.swing.JLabel();
        PanelEducacion = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtEducacion = new javax.swing.JTextArea();
        PanelHistorial = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnEnviarCandidato = new javax.swing.JButton();
        btnNota = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNota = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHistorial = new javax.swing.JTextArea();
        PanelCompetencias = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtCompetencias = new javax.swing.JTextArea();
        btnVolver = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Perfil de postulante");

        panelPostulante.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblNombre.setFont(new java.awt.Font("Segoe UI Black", 2, 16)); // NOI18N
        lblNombre.setText("Nombre:");

        lblCorreo.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblCorreo.setText("Correo:");

        lblTelefono.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblTelefono.setText("Telefono:");

        lblFoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\danio\\Downloads\\icono.png")); // NOI18N
        lblFoto.setText("Foto");
        lblFoto.setPreferredSize(new java.awt.Dimension(80, 80));

        lblDireccion.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblDireccion.setText("Direccion:");

        lblNombreDato.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N

        lblCorreoDato.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblTelefonoDato.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblDireccionDato.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        javax.swing.GroupLayout panelPostulanteLayout = new javax.swing.GroupLayout(panelPostulante);
        panelPostulante.setLayout(panelPostulanteLayout);
        panelPostulanteLayout.setHorizontalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorreoDato)
                        .addGap(89, 89, 89)
                        .addComponent(lblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTelefonoDato)
                        .addGap(81, 81, 81)
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDireccionDato))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNombreDato)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPostulanteLayout.setVerticalGroup(
            panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPostulanteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addComponent(lblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(lblTelefono)
                            .addComponent(lblDireccion)
                            .addComponent(lblCorreoDato)
                            .addComponent(lblTelefonoDato)
                            .addComponent(lblDireccionDato)))
                    .addGroup(panelPostulanteLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPostulanteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(lblNombreDato))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        PanelReclutamiento.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Pipeline de Reclutamiento"), "Pipeline de Reclutamiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        btnAvanzar.setBackground(new java.awt.Color(0, 102, 255));
        btnAvanzar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnAvanzar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvanzar.setText("Avanzar");
        btnAvanzar.addActionListener(this::btnAvanzarActionPerformed);

        btnRechazar.setBackground(new java.awt.Color(255, 0, 0));
        btnRechazar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnRechazar.setText("Rechazar");
        btnRechazar.addActionListener(this::btnRechazarActionPerformed);

        lblRevisionCV.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        lblRevisionCV.setText("Revision de CV");

        lblEvaluacionTecnica.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        lblEvaluacionTecnica.setText("Evaluacion Tecnica");

        lblEntrevista.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        lblEntrevista.setText("Entrevista con Manager");

        lblOfertaFinal.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        lblOfertaFinal.setText("Oferta final");

        javax.swing.GroupLayout PanelReclutamientoLayout = new javax.swing.GroupLayout(PanelReclutamiento);
        PanelReclutamiento.setLayout(PanelReclutamientoLayout);
        PanelReclutamientoLayout.setHorizontalGroup(
            PanelReclutamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReclutamientoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelReclutamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOfertaFinal)
                    .addComponent(lblEvaluacionTecnica)
                    .addComponent(lblRevisionCV)
                    .addGroup(PanelReclutamientoLayout.createSequentialGroup()
                        .addComponent(btnAvanzar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(btnRechazar)))
                .addContainerGap())
            .addGroup(PanelReclutamientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEntrevista)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelReclutamientoLayout.setVerticalGroup(
            PanelReclutamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelReclutamientoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblRevisionCV)
                .addGap(18, 18, 18)
                .addComponent(lblEvaluacionTecnica)
                .addGap(24, 24, 24)
                .addComponent(lblEntrevista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblOfertaFinal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(PanelReclutamientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAvanzar)
                    .addComponent(btnRechazar))
                .addGap(16, 16, 16))
        );

        PanelEducacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Educacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        txtEducacion.setEditable(false);
        txtEducacion.setColumns(20);
        txtEducacion.setLineWrap(true);
        txtEducacion.setRows(5);
        txtEducacion.setWrapStyleWord(true);
        jScrollPane4.setViewportView(txtEducacion);

        jScrollPane3.setViewportView(jScrollPane4);

        javax.swing.GroupLayout PanelEducacionLayout = new javax.swing.GroupLayout(PanelEducacion);
        PanelEducacion.setLayout(PanelEducacionLayout);
        PanelEducacionLayout.setHorizontalGroup(
            PanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEducacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelEducacionLayout.setVerticalGroup(
            PanelEducacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEducacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelHistorial.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial y Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 2, 12)); // NOI18N
        jLabel2.setText("Agregar un comentario interno");

        btnEnviarCandidato.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        btnEnviarCandidato.setText("Enviar al candidato");
        btnEnviarCandidato.addActionListener(this::btnEnviarCandidatoActionPerformed);

        btnNota.setBackground(new java.awt.Color(0, 102, 255));
        btnNota.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnNota.setForeground(new java.awt.Color(255, 255, 255));
        btnNota.setText("Guardar Nota");
        btnNota.addActionListener(this::btnNotaActionPerformed);

        txtNota.setColumns(20);
        txtNota.setRows(5);
        jScrollPane1.setViewportView(txtNota);

        txtHistorial.setEditable(false);
        txtHistorial.setColumns(20);
        txtHistorial.setLineWrap(true);
        txtHistorial.setRows(5);
        txtHistorial.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtHistorial);

        javax.swing.GroupLayout PanelHistorialLayout = new javax.swing.GroupLayout(PanelHistorial);
        PanelHistorial.setLayout(PanelHistorialLayout);
        PanelHistorialLayout.setHorizontalGroup(
            PanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHistorialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelHistorialLayout.createSequentialGroup()
                        .addGroup(PanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelHistorialLayout.createSequentialGroup()
                                .addGap(322, 322, 322)
                                .addComponent(btnEnviarCandidato)
                                .addGap(18, 18, 18)
                                .addComponent(btnNota))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        PanelHistorialLayout.setVerticalGroup(
            PanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHistorialLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(PanelHistorialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNota)
                    .addComponent(btnEnviarCandidato))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        PanelCompetencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Competencias\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 0, 12))); // NOI18N

        txtCompetencias.setEditable(false);
        txtCompetencias.setColumns(20);
        txtCompetencias.setLineWrap(true);
        txtCompetencias.setRows(5);
        txtCompetencias.setWrapStyleWord(true);
        jScrollPane6.setViewportView(txtCompetencias);

        jScrollPane5.setViewportView(jScrollPane6);

        javax.swing.GroupLayout PanelCompetenciasLayout = new javax.swing.GroupLayout(PanelCompetencias);
        PanelCompetencias.setLayout(PanelCompetenciasLayout);
        PanelCompetenciasLayout.setHorizontalGroup(
            PanelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompetenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelCompetenciasLayout.setVerticalGroup(
            PanelCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompetenciasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(this::btnVolverActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PanelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVolver)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PanelEducacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(PanelCompetencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(panelPostulante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(PanelReclutamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PanelEducacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(PanelCompetencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(PanelReclutamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(PanelHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotaActionPerformed
        String nota = txtNota.getText().trim();

        if (nota.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escriba una nota");
            return;
        }

        agregarNotaHistorial(nota);
        txtNota.setText("");
    }//GEN-LAST:event_btnNotaActionPerformed

    private void btnEnviarCandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarCandidatoActionPerformed
        String nota = txtNota.getText().trim();

        if (nota.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Escriba una nota");
            return;
        }

        agregarNotaHistorial(nota);
        txtNota.setText("");
    }//GEN-LAST:event_btnEnviarCandidatoActionPerformed

    private void btnAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvanzarActionPerformed
        if (procesoFinalizado) {
            javax.swing.JOptionPane.showMessageDialog(this, "El proceso ya fue finalizado.");
            return;
        }

        javax.swing.JTextArea txtComentarioModal = new javax.swing.JTextArea(4, 20);
        txtComentarioModal.setLineWrap(true);
        txtComentarioModal.setWrapStyleWord(true);

        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));

        javax.swing.JPanel panelCentro = new javax.swing.JPanel();
        panelCentro.setLayout(new javax.swing.BoxLayout(panelCentro, javax.swing.BoxLayout.Y_AXIS));

        javax.swing.JLabel lblTitulo = new javax.swing.JLabel("Se avanzará a la siguiente etapa");
        lblTitulo.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

        javax.swing.JLabel lblComentario = new javax.swing.JLabel("Comentario adicional (opcional):");

        panelCentro.add(lblTitulo);
        panelCentro.add(javax.swing.Box.createVerticalStrut(10));
        panelCentro.add(lblComentario);
        panelCentro.add(new javax.swing.JScrollPane(txtComentarioModal));

        panel.add(panelCentro, java.awt.BorderLayout.CENTER);

        int resultado = javax.swing.JOptionPane.showConfirmDialog(
                this,
                panel,
                "Avanzar etapa",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE
        );

        if (resultado == javax.swing.JOptionPane.OK_OPTION) {
            String comentario = txtComentarioModal.getText().trim();

            if (etapa < 3) {
                etapa++;
                actualizarPipeline();

                if (comentario.isEmpty()) {
                    agregarNotaHistorial("El candidato avanzó a la siguiente etapa.");
                } else {
                    agregarNotaHistorial("El candidato avanzó a la siguiente etapa. Comentario: " + comentario);
                }

                if (etapa == 3) {
                    procesoFinalizado = true;
                    btnAvanzar.setEnabled(false);
                    btnRechazar.setEnabled(false);
                }

                javax.swing.JOptionPane.showMessageDialog(this, "Etapa actualizada correctamente.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "El candidato ya está en la etapa final.");
            }
        }
    }//GEN-LAST:event_btnAvanzarActionPerformed

    private void btnRechazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechazarActionPerformed
        if (procesoFinalizado) {
            javax.swing.JOptionPane.showMessageDialog(this, "El proceso ya fue finalizado.");
            return;
        }

        javax.swing.JComboBox<String> cbMotivo = new javax.swing.JComboBox<>(new String[]{
            "Expectativas salariales",
            "No cumple con el perfil",
            "Falta de experiencia",
            "Entrevista no aprobada",
            "Otro"
        });

        javax.swing.JTextArea txtComentarioModal = new javax.swing.JTextArea(4, 20);
        txtComentarioModal.setLineWrap(true);
        txtComentarioModal.setWrapStyleWord(true);

        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.BorderLayout(5, 5));

        javax.swing.JPanel panelCampos = new javax.swing.JPanel();
        panelCampos.setLayout(new javax.swing.BoxLayout(panelCampos, javax.swing.BoxLayout.Y_AXIS));

        panelCampos.add(new javax.swing.JLabel("Motivo del rechazo (opcional):"));
        panelCampos.add(cbMotivo);
        panelCampos.add(javax.swing.Box.createVerticalStrut(10));
        panelCampos.add(new javax.swing.JLabel("Comentario adicional (opcional):"));
        panelCampos.add(new javax.swing.JScrollPane(txtComentarioModal));

        panel.add(new javax.swing.JLabel("¿Desea rechazar al candidato?"), java.awt.BorderLayout.NORTH);
        panel.add(panelCampos, java.awt.BorderLayout.CENTER);

        int resultado = javax.swing.JOptionPane.showConfirmDialog(
                this,
                panel,
                "Confirmar Rechazo",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE
        );

        if (resultado == javax.swing.JOptionPane.OK_OPTION) {
            String motivo = cbMotivo.getSelectedItem().toString();
            String comentario = txtComentarioModal.getText().trim();

            String nota = "El candidato fue rechazado. Motivo: " + motivo;
            if (!comentario.isEmpty()) {
                nota += ". Comentario: " + comentario;
            }

            agregarNotaHistorial(nota);

            procesoFinalizado = true;
            btnAvanzar.setEnabled(false);
            btnRechazar.setEnabled(false);

            javax.swing.JOptionPane.showMessageDialog(this, "Candidato rechazado correctamente.");
        }

    }//GEN-LAST:event_btnRechazarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        Navigation.getInstance().navigateTo(new PanelPostulaciones());
    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCompetencias;
    private javax.swing.JPanel PanelEducacion;
    private javax.swing.JPanel PanelHistorial;
    private javax.swing.JPanel PanelReclutamiento;
    private javax.swing.JButton btnAvanzar;
    private javax.swing.JButton btnEnviarCandidato;
    private javax.swing.JButton btnNota;
    private javax.swing.JButton btnRechazar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreoDato;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblDireccionDato;
    private javax.swing.JLabel lblEntrevista;
    private javax.swing.JLabel lblEvaluacionTecnica;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreDato;
    private javax.swing.JLabel lblOfertaFinal;
    private javax.swing.JLabel lblRevisionCV;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefonoDato;
    private javax.swing.JPanel panelPostulante;
    private javax.swing.JTextArea txtCompetencias;
    private javax.swing.JTextArea txtEducacion;
    private javax.swing.JTextArea txtHistorial;
    private javax.swing.JTextArea txtNota;
    // End of variables declaration//GEN-END:variables
@Override
    public String getTitle() {
        return "Perfil de postulante";
    }
}
