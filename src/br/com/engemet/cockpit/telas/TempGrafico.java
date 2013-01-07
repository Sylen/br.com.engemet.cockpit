package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.Imprimir;
import javax.swing.Icon;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class TempGrafico extends javax.swing.JFrame{
    
    private ChartPanel chartPanel;
    
    public TempGrafico(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpanelGrafico = new javax.swing.JPanel();
        lblStatus1 = new javax.swing.JLabel();
        lblStatus2 = new javax.swing.JLabel();
        lblResponsavel1 = new javax.swing.JLabel();
        lblResponsavel2 = new javax.swing.JLabel();
        lblIndicador1 = new javax.swing.JLabel();
        lblIndicador2 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblVariacao1 = new javax.swing.JLabel();
        lblVariacao2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanelGrafico.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jpanelGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 790, 430));

        lblStatus1.setBackground(new java.awt.Color(15, 36, 62));
        lblStatus1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus1.setText("Status");
        lblStatus1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatus1.setOpaque(true);
        jPanel1.add(lblStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        lblStatus2.setBackground(new java.awt.Color(54, 96, 146));
        lblStatus2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblStatus2.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblStatus2.setOpaque(true);
        jPanel1.add(lblStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 50));

        lblResponsavel1.setBackground(new java.awt.Color(15, 36, 62));
        lblResponsavel1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblResponsavel1.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel1.setText("Responsável");
        lblResponsavel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblResponsavel1.setOpaque(true);
        jPanel1.add(lblResponsavel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 170, -1));

        lblResponsavel2.setBackground(new java.awt.Color(54, 96, 146));
        lblResponsavel2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblResponsavel2.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblResponsavel2.setOpaque(true);
        jPanel1.add(lblResponsavel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 170, 50));

        lblIndicador1.setBackground(new java.awt.Color(15, 36, 62));
        lblIndicador1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblIndicador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicador1.setText("Indicador");
        lblIndicador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblIndicador1.setOpaque(true);
        jPanel1.add(lblIndicador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 440, -1));

        lblIndicador2.setBackground(new java.awt.Color(54, 96, 146));
        lblIndicador2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblIndicador2.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblIndicador2.setOpaque(true);
        jPanel1.add(lblIndicador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 440, 50));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanel1.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 570, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, -1, -1));

        lblVariacao1.setBackground(new java.awt.Color(15, 36, 62));
        lblVariacao1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblVariacao1.setForeground(new java.awt.Color(255, 255, 255));
        lblVariacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVariacao1.setText("Variação");
        lblVariacao1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVariacao1.setOpaque(true);
        jPanel1.add(lblVariacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 70, -1));

        lblVariacao2.setBackground(new java.awt.Color(54, 96, 146));
        lblVariacao2.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblVariacao2.setForeground(new java.awt.Color(255, 255, 255));
        lblVariacao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVariacao2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblVariacao2.setOpaque(true);
        jPanel1.add(lblVariacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 70, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 795, 608));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        Imprimir.printComponent(this);
        validate();
        repaint();
    }//GEN-LAST:event_btnImprimirActionPerformed

    
    public void setDados(Icon status, Icon variacao, String responsavel, String indicador){
        lblStatus2.setIcon(status);
        lblVariacao2.setIcon(variacao);
        lblResponsavel2.setText(responsavel);
        lblIndicador2.setText(indicador);
    }
    
    public void setGrafico(JFreeChart chart){
        chartPanel = new ChartPanel(chart);
        chartPanel.setVisible(true);
        jpanelGrafico.add(chartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));
        validate();
        repaint();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpanelGrafico;
    private javax.swing.JLabel lblIndicador1;
    private javax.swing.JLabel lblIndicador2;
    private javax.swing.JLabel lblResponsavel1;
    private javax.swing.JLabel lblResponsavel2;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblStatus2;
    private javax.swing.JLabel lblVariacao1;
    private javax.swing.JLabel lblVariacao2;
    // End of variables declaration//GEN-END:variables
}
