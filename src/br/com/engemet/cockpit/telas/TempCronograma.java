package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.Imprimir;
import java.awt.Component;
import javax.swing.Icon;

public class TempCronograma extends javax.swing.JFrame{

    public TempCronograma(){
        Info.tempCronograma = this;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblStatusCronograma = new javax.swing.JLabel();
        lblCronogramaDataTermino = new javax.swing.JLabel();
        lblCronogramaDataAtualizacao = new javax.swing.JLabel();
        lblInicioReal = new javax.swing.JLabel();
        lblNTotalSemanas = new javax.swing.JLabel();
        lblNSemanasDecorridas = new javax.swing.JLabel();
        lblNTotalSemanas1 = new javax.swing.JLabel();
        lblNSemanasRestantes = new javax.swing.JLabel();
        lblCronogramaDataAtualizacao1 = new javax.swing.JLabel();
        lblCronogramaDataTermino1 = new javax.swing.JLabel();
        lblNSemanasDecorridas1 = new javax.swing.JLabel();
        lblNSemanasRestantes1 = new javax.swing.JLabel();
        txtInicioReal = new javax.swing.JFormattedTextField();
        lblTempoDecorrido = new javax.swing.JLabel();
        lblProgressoFisico = new javax.swing.JLabel();
        lblTempoDecorrido1 = new javax.swing.JLabel();
        lblProgressoFisico1 = new javax.swing.JLabel();
        lblStatusCronograma1 = new javax.swing.JLabel();
        lblCronoIniciativa = new javax.swing.JLabel();
        lblPlanejamento = new javax.swing.JLabel();
        jpanelAtividades = new javax.swing.JPanel();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatusCronograma.setBackground(new java.awt.Color(22, 54, 92));
        lblStatusCronograma.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblStatusCronograma.setForeground(new java.awt.Color(255, 255, 255));
        lblStatusCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma.setText("<html><center>Status do Cronograma</center></html>");
        lblStatusCronograma.setOpaque(true);
        jPanel1.add(lblStatusCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        lblCronogramaDataTermino.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataTermino.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino.setText("<html><center>Data de Término Prevista</center></html>");
        lblCronogramaDataTermino.setToolTipText("");
        lblCronogramaDataTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino.setOpaque(true);
        jPanel1.add(lblCronogramaDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 90, 20));

        lblCronogramaDataAtualizacao.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataAtualizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao.setText("<html><center>Data de Atualização</center></html>");
        lblCronogramaDataAtualizacao.setToolTipText("");
        lblCronogramaDataAtualizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao.setOpaque(true);
        jPanel1.add(lblCronogramaDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 20));

        lblInicioReal.setBackground(new java.awt.Color(54, 96, 146));
        lblInicioReal.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblInicioReal.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioReal.setText("<html><center>Data de Ínicio Real</center></html>");
        lblInicioReal.setToolTipText("");
        lblInicioReal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblInicioReal.setOpaque(true);
        jPanel1.add(lblInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 90, 20));

        lblNTotalSemanas.setBackground(new java.awt.Color(54, 96, 146));
        lblNTotalSemanas.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNTotalSemanas.setForeground(new java.awt.Color(255, 255, 255));
        lblNTotalSemanas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas.setText("<html><center>Nº Total de Semanas</center></html>");
        lblNTotalSemanas.setToolTipText("");
        lblNTotalSemanas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas.setOpaque(true);
        jPanel1.add(lblNTotalSemanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 20));

        lblNSemanasDecorridas.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasDecorridas.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasDecorridas.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasDecorridas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas.setText("<html><center>Nº de Semanas Decorridas</center></html>");
        lblNSemanasDecorridas.setToolTipText("");
        lblNSemanasDecorridas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas.setOpaque(true);
        jPanel1.add(lblNSemanasDecorridas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 90, 20));

        lblNTotalSemanas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNTotalSemanas1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNTotalSemanas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas1.setText("Sem Dados");
        lblNTotalSemanas1.setToolTipText("");
        lblNTotalSemanas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas1.setOpaque(true);
        jPanel1.add(lblNTotalSemanas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 90, 20));

        lblNSemanasRestantes.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasRestantes.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasRestantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes.setText("<html><center>Nº de Semanas Restantes</center></html>");
        lblNSemanasRestantes.setToolTipText("");
        lblNSemanasRestantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes.setOpaque(true);
        jPanel1.add(lblNSemanasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 90, 20));

        lblCronogramaDataAtualizacao1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataAtualizacao1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataAtualizacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao1.setText("Sem Dados");
        lblCronogramaDataAtualizacao1.setToolTipText("");
        lblCronogramaDataAtualizacao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao1.setOpaque(true);
        jPanel1.add(lblCronogramaDataAtualizacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 20));

        lblCronogramaDataTermino1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataTermino1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataTermino1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino1.setText("Sem Dados");
        lblCronogramaDataTermino1.setToolTipText("");
        lblCronogramaDataTermino1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino1.setOpaque(true);
        jPanel1.add(lblCronogramaDataTermino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 90, 20));

        lblNSemanasDecorridas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasDecorridas1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasDecorridas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas1.setText("Sem Dados");
        lblNSemanasDecorridas1.setToolTipText("");
        lblNSemanasDecorridas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas1.setOpaque(true);
        jPanel1.add(lblNSemanasDecorridas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 90, 20));

        lblNSemanasRestantes1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasRestantes1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasRestantes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes1.setText("Sem Dados");
        lblNSemanasRestantes1.setToolTipText("");
        lblNSemanasRestantes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes1.setOpaque(true);
        jPanel1.add(lblNSemanasRestantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 90, 20));

        txtInicioReal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtInicioReal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicioReal.setToolTipText("formato da data dd/mm/aaaa");
        txtInicioReal.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jPanel1.add(txtInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 90, 20));

        lblTempoDecorrido.setBackground(new java.awt.Color(54, 96, 146));
        lblTempoDecorrido.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblTempoDecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lblTempoDecorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido.setText("<html><center>Tempo Total Decorrido</center></html>");
        lblTempoDecorrido.setToolTipText("");
        lblTempoDecorrido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido.setOpaque(true);
        jPanel1.add(lblTempoDecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 90, 20));

        lblProgressoFisico.setBackground(new java.awt.Color(54, 96, 146));
        lblProgressoFisico.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblProgressoFisico.setForeground(new java.awt.Color(255, 255, 255));
        lblProgressoFisico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico.setText("<html><center>Progresso Físico da Iniciativa</center></html>");
        lblProgressoFisico.setToolTipText("");
        lblProgressoFisico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico.setOpaque(true);
        jPanel1.add(lblProgressoFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, 20));

        lblTempoDecorrido1.setBackground(new java.awt.Color(153, 204, 255));
        lblTempoDecorrido1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblTempoDecorrido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido1.setText("0%");
        lblTempoDecorrido1.setToolTipText("");
        lblTempoDecorrido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido1.setOpaque(true);
        jPanel1.add(lblTempoDecorrido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 70, 20));

        lblProgressoFisico1.setBackground(new java.awt.Color(153, 204, 255));
        lblProgressoFisico1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblProgressoFisico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico1.setText("0%");
        lblProgressoFisico1.setToolTipText("");
        lblProgressoFisico1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico1.setOpaque(true);
        jPanel1.add(lblProgressoFisico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 70, 20));

        lblStatusCronograma1.setBackground(new java.awt.Color(153, 204, 255));
        lblStatusCronograma1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblStatusCronograma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma1.setToolTipText("");
        lblStatusCronograma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStatusCronograma1.setOpaque(true);
        jPanel1.add(lblStatusCronograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 70, 20));

        lblCronoIniciativa.setBackground(new java.awt.Color(15, 36, 62));
        lblCronoIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCronoIniciativa.setForeground(new java.awt.Color(255, 255, 255));
        lblCronoIniciativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronoIniciativa.setText("Cronograma da Iniciativa");
        lblCronoIniciativa.setOpaque(true);
        jPanel1.add(lblCronoIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 20));

        lblPlanejamento.setBackground(new java.awt.Color(22, 54, 92));
        lblPlanejamento.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPlanejamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanejamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlanejamento.setText("Atividades");
        lblPlanejamento.setOpaque(true);
        jPanel1.add(lblPlanejamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 540, 20));

        jpanelAtividades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jpanelAtividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 540, 640));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        Imprimir.printComponent(jPanel1);
        validate();
        repaint();
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    
    public void setJPanelAtividades(Component campoGrafico, int x, int y, int width, int height){
        jpanelAtividades.add(campoGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, width, height));
    }
    
    public void setCronogramaIniciativa(String dataAtualizacao, String dataInicio, String dataTermino, String totalSemanadas,
            String semanasDecorridas, String semanasRestantes, String tempoDecorrido, String progressoFisico, Icon status){
        
        lblCronogramaDataAtualizacao1.setText(dataAtualizacao);
        txtInicioReal.setText(dataInicio);
        lblCronogramaDataTermino1.setText(dataTermino);
        lblNTotalSemanas1.setText(totalSemanadas);
        lblNSemanasDecorridas1.setText(semanasDecorridas);
        lblNSemanasRestantes1.setText(semanasRestantes);
        lblTempoDecorrido1.setText(tempoDecorrido);
        lblProgressoFisico1.setText(progressoFisico);
        lblStatusCronograma1.setIcon(status);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelAtividades;
    private javax.swing.JLabel lblCronoIniciativa;
    private javax.swing.JLabel lblCronogramaDataAtualizacao;
    private javax.swing.JLabel lblCronogramaDataAtualizacao1;
    private javax.swing.JLabel lblCronogramaDataTermino;
    private javax.swing.JLabel lblCronogramaDataTermino1;
    private javax.swing.JLabel lblInicioReal;
    private javax.swing.JLabel lblNSemanasDecorridas;
    private javax.swing.JLabel lblNSemanasDecorridas1;
    private javax.swing.JLabel lblNSemanasRestantes;
    private javax.swing.JLabel lblNSemanasRestantes1;
    private javax.swing.JLabel lblNTotalSemanas;
    private javax.swing.JLabel lblNTotalSemanas1;
    private javax.swing.JLabel lblPlanejamento;
    private javax.swing.JLabel lblProgressoFisico;
    private javax.swing.JLabel lblProgressoFisico1;
    private javax.swing.JLabel lblStatusCronograma;
    private javax.swing.JLabel lblStatusCronograma1;
    private javax.swing.JLabel lblTempoDecorrido;
    private javax.swing.JLabel lblTempoDecorrido1;
    private javax.swing.JFormattedTextField txtInicioReal;
    // End of variables declaration//GEN-END:variables
}
