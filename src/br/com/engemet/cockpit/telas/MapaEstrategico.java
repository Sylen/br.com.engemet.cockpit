package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.AcaoMapaEstrategico;
import br.com.engemet.cockpit.acao.CockpitStrings;

public class MapaEstrategico extends javax.swing.JPanel{

    private AcaoMapaEstrategico botao = new AcaoMapaEstrategico();
    private String[] strCor = {"Vermelhao", "Vermelho", "Amarelo", "Verde", "Verdao"};

    public MapaEstrategico(){
        Info.mapaEstrategico = this;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMapa = new javax.swing.JScrollPane();
        panelMapa = new javax.swing.JPanel();
        lblStatusFinPos1 = new javax.swing.JLabel();
        lblStatusFinPos2 = new javax.swing.JLabel();
        lblStatusFinPos3 = new javax.swing.JLabel();
        lblStatusFinPos4 = new javax.swing.JLabel();
        lblStatusFinPos5 = new javax.swing.JLabel();
        lblStatusCliPos1 = new javax.swing.JLabel();
        lblStatusCliPos2 = new javax.swing.JLabel();
        lblStatusCliPos3 = new javax.swing.JLabel();
        lblStatusCliPos4 = new javax.swing.JLabel();
        lblStatusCliPos5 = new javax.swing.JLabel();
        lblStatusProPos1 = new javax.swing.JLabel();
        lblStatusProPos2 = new javax.swing.JLabel();
        lblStatusProPos3 = new javax.swing.JLabel();
        lblStatusProPos4 = new javax.swing.JLabel();
        lblStatusProPos5 = new javax.swing.JLabel();
        lblStatusProPos6 = new javax.swing.JLabel();
        lblStatusProPos7 = new javax.swing.JLabel();
        lblStatusPgtPos1 = new javax.swing.JLabel();
        lblStatusPgtPos2 = new javax.swing.JLabel();
        lblStatusPgtPos3 = new javax.swing.JLabel();
        lblStatusPgtPos4 = new javax.swing.JLabel();
        lblStatusPgtPos5 = new javax.swing.JLabel();
        lblStatusPgtPos6 = new javax.swing.JLabel();
        lblStatusPgtPos7 = new javax.swing.JLabel();
        lblStatusPgtPos8 = new javax.swing.JLabel();
        lblMapaEstrategico = new javax.swing.JLabel();
        btnFinancas1 = new javax.swing.JButton();
        btnFinancas2 = new javax.swing.JButton();
        btnFinancas3 = new javax.swing.JButton();
        btnFinancas4 = new javax.swing.JButton();
        btnFinancas5 = new javax.swing.JButton();
        btnPGT8 = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnClientes2 = new javax.swing.JButton();
        btnClientes3 = new javax.swing.JButton();
        btnClientes4 = new javax.swing.JButton();
        btnClientes5 = new javax.swing.JButton();
        btnProcessos1 = new javax.swing.JButton();
        btnProcessos2 = new javax.swing.JButton();
        btnProcessos3 = new javax.swing.JButton();
        btnProcessos4 = new javax.swing.JButton();
        btnProcessos5 = new javax.swing.JButton();
        btnProcessos6 = new javax.swing.JButton();
        btnProcessos7 = new javax.swing.JButton();
        btnPGT1 = new javax.swing.JButton();
        btnPGT2 = new javax.swing.JButton();
        btnPGT3 = new javax.swing.JButton();
        btnPGT4 = new javax.swing.JButton();
        btnPGT5 = new javax.swing.JButton();
        btnPGT6 = new javax.swing.JButton();
        btnPGT7 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(0, 0, 1275, 612));

        panelMapa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatusFinPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusFinPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 20, 20));

        lblStatusFinPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusFinPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 20, 20));

        lblStatusFinPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusFinPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 20, 20));

        lblStatusFinPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusFinPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 60, 20, 20));

        lblStatusFinPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusFinPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 60, 20, 20));

        lblStatusCliPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusCliPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 195, 20, 20));

        lblStatusCliPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusCliPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 195, 20, 20));

        lblStatusCliPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusCliPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 195, 20, 20));

        lblStatusCliPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusCliPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 195, 20, 20));

        lblStatusCliPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusCliPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 195, 20, 20));

        lblStatusProPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 20, 20));

        lblStatusProPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 20, 20));

        lblStatusProPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, 20, 20));

        lblStatusProPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 20, 20));

        lblStatusProPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 20, 20));

        lblStatusProPos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 20, 20));

        lblStatusProPos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusProPos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 340, 20, 20));

        lblStatusPgtPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 20, 20));

        lblStatusPgtPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 20, 20));

        lblStatusPgtPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, 20, 20));

        lblStatusPgtPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 20, 20));

        lblStatusPgtPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 600, 20, 20));

        lblStatusPgtPos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 680, 20, 20));

        lblStatusPgtPos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 600, 20, 20));

        lblStatusPgtPos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelMapa.add(lblStatusPgtPos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 680, 20, 20));

        lblMapaEstrategico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Mapa_Estrategico.png"))); // NOI18N
        panelMapa.add(lblMapaEstrategico, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 800));

        btnFinancas1.setActionCommand(CockpitStrings.MapaFinancas[0]);
        btnFinancas1.setBorderPainted(false);
        btnFinancas1.setContentAreaFilled(false);
        btnFinancas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancas1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnFinancas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 150, 70));
        btnFinancas1.getAccessibleContext().setAccessibleName("btnOtimizarOsCustosTotais");

        btnFinancas2.setActionCommand(CockpitStrings.MapaFinancas[1]);
        btnFinancas2.setBorderPainted(false);
        btnFinancas2.setContentAreaFilled(false);
        btnFinancas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancas2ActionPerformed(evt);
            }
        });
        panelMapa.add(btnFinancas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 110, 70));

        btnFinancas3.setActionCommand(CockpitStrings.MapaFinancas[2]);
        btnFinancas3.setBorderPainted(false);
        btnFinancas3.setContentAreaFilled(false);
        btnFinancas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancas3ActionPerformed(evt);
            }
        });
        panelMapa.add(btnFinancas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 230, 70));

        btnFinancas4.setActionCommand(CockpitStrings.MapaFinancas[3]);
        btnFinancas4.setBorderPainted(false);
        btnFinancas4.setContentAreaFilled(false);
        btnFinancas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancas4ActionPerformed(evt);
            }
        });
        panelMapa.add(btnFinancas4, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 170, 70));

        btnFinancas5.setActionCommand(CockpitStrings.MapaFinancas[4]);
        btnFinancas5.setBorderPainted(false);
        btnFinancas5.setContentAreaFilled(false);
        btnFinancas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinancas5ActionPerformed(evt);
            }
        });
        panelMapa.add(btnFinancas5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 80, 160, 70));

        btnPGT8.setActionCommand(CockpitStrings.MapaPGT[7]);
        btnPGT8.setBorderPainted(false);
        btnPGT8.setContentAreaFilled(false);
        btnPGT8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT8ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 700, 260, 50));

        btnClientes1.setActionCommand(CockpitStrings.MapaClientes[0]);
        btnClientes1.setBorderPainted(false);
        btnClientes1.setContentAreaFilled(false);
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 130, 70));

        btnClientes2.setActionCommand(CockpitStrings.MapaClientes[1]);
        btnClientes2.setBorderPainted(false);
        btnClientes2.setContentAreaFilled(false);
        btnClientes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes2ActionPerformed(evt);
            }
        });
        panelMapa.add(btnClientes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 180, 70));

        btnClientes3.setActionCommand(CockpitStrings.MapaClientes[2]);
        btnClientes3.setBorderPainted(false);
        btnClientes3.setContentAreaFilled(false);
        btnClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes3ActionPerformed(evt);
            }
        });
        panelMapa.add(btnClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 110, 70));

        btnClientes4.setActionCommand(CockpitStrings.MapaClientes[3]);
        btnClientes4.setBorderPainted(false);
        btnClientes4.setContentAreaFilled(false);
        btnClientes4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes4ActionPerformed(evt);
            }
        });
        panelMapa.add(btnClientes4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 190, 70));

        btnClientes5.setActionCommand(CockpitStrings.MapaClientes[4]);
        btnClientes5.setBorderPainted(false);
        btnClientes5.setContentAreaFilled(false);
        btnClientes5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes5ActionPerformed(evt);
            }
        });
        panelMapa.add(btnClientes5, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 190, 70));

        btnProcessos1.setActionCommand(CockpitStrings.MapaProcessos[0]);
        btnProcessos1.setBorderPainted(false);
        btnProcessos1.setContentAreaFilled(false);
        btnProcessos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 230, 70));

        btnProcessos2.setActionCommand(CockpitStrings.MapaProcessos[1]);
        btnProcessos2.setBorderPainted(false);
        btnProcessos2.setContentAreaFilled(false);
        btnProcessos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos2ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 230, 70));

        btnProcessos3.setActionCommand(CockpitStrings.MapaProcessos[2]);
        btnProcessos3.setBorderPainted(false);
        btnProcessos3.setContentAreaFilled(false);
        btnProcessos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos3ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 70));

        btnProcessos4.setActionCommand(CockpitStrings.MapaProcessos[3]);
        btnProcessos4.setBorderPainted(false);
        btnProcessos4.setContentAreaFilled(false);
        btnProcessos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos4ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 140, 70));

        btnProcessos5.setActionCommand(CockpitStrings.MapaProcessos[4]);
        btnProcessos5.setBorderPainted(false);
        btnProcessos5.setContentAreaFilled(false);
        btnProcessos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos5ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 140, 70));

        btnProcessos6.setActionCommand(CockpitStrings.MapaProcessos[5]);
        btnProcessos6.setBorderPainted(false);
        btnProcessos6.setContentAreaFilled(false);
        btnProcessos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos6ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 140, 70));

        btnProcessos7.setActionCommand(CockpitStrings.MapaProcessos[6]);
        btnProcessos7.setBorderPainted(false);
        btnProcessos7.setContentAreaFilled(false);
        btnProcessos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessos7ActionPerformed(evt);
            }
        });
        panelMapa.add(btnProcessos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, 180, 90));

        btnPGT1.setActionCommand(CockpitStrings.MapaPGT[0]);
        btnPGT1.setBorderPainted(false);
        btnPGT1.setContentAreaFilled(false);
        btnPGT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT1ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 620, 260, 50));

        btnPGT2.setActionCommand(CockpitStrings.MapaPGT[1]);
        btnPGT2.setBorderPainted(false);
        btnPGT2.setContentAreaFilled(false);
        btnPGT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT2ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 700, 260, 50));

        btnPGT3.setActionCommand(CockpitStrings.MapaPGT[2]);
        btnPGT3.setBorderPainted(false);
        btnPGT3.setContentAreaFilled(false);
        btnPGT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT3ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 260, 50));

        btnPGT4.setActionCommand(CockpitStrings.MapaPGT[3]);
        btnPGT4.setBorderPainted(false);
        btnPGT4.setContentAreaFilled(false);
        btnPGT4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT4ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 700, 260, 50));

        btnPGT5.setActionCommand(CockpitStrings.MapaPGT[4]);
        btnPGT5.setBorderPainted(false);
        btnPGT5.setContentAreaFilled(false);
        btnPGT5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT5ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 620, 250, 50));

        btnPGT6.setActionCommand(CockpitStrings.MapaPGT[5]);
        btnPGT6.setBorderPainted(false);
        btnPGT6.setContentAreaFilled(false);
        btnPGT6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT6ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 700, 250, 50));

        btnPGT7.setActionCommand(CockpitStrings.MapaPGT[6]);
        btnPGT7.setBorderPainted(false);
        btnPGT7.setContentAreaFilled(false);
        btnPGT7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPGT7ActionPerformed(evt);
            }
        });
        panelMapa.add(btnPGT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 620, 260, 50));

        scrollMapa.setViewportView(panelMapa);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(scrollMapa, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1275, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(scrollMapa, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 906, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinancas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancas1ActionPerformed
        btnFinancas1.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitFinancas(CockpitStrings.Perspectivas[0], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnFinancas1ActionPerformed

    private void btnFinancas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancas2ActionPerformed
        btnFinancas2.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitFinancas(CockpitStrings.Perspectivas[0], 4);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnFinancas2ActionPerformed

    private void btnFinancas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancas3ActionPerformed
        btnFinancas3.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitFinancas(CockpitStrings.Perspectivas[0], 5);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnFinancas3ActionPerformed

    private void btnFinancas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancas4ActionPerformed
        btnFinancas4.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitFinancas(CockpitStrings.Perspectivas[0], 2, 3);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnFinancas4ActionPerformed

    private void btnFinancas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinancas5ActionPerformed
        btnFinancas5.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitFinancas(CockpitStrings.Perspectivas[0], 6);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnFinancas5ActionPerformed

    private void btnPGT8ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT8ActionPerformed
        // TODO add your handling code here:
        btnPGT8.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 6);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT8ActionPerformed

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnClientes1ActionPerformed
        // TODO add your handling code here:
        btnClientes1.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitClientes(CockpitStrings.Perspectivas[1], 2);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnClientes2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnClientes2ActionPerformed
        // TODO add your handling code here:
        btnClientes2.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitClientes(CockpitStrings.Perspectivas[1], 5);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnClientes2ActionPerformed

    private void btnClientes3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnClientes3ActionPerformed
        // TODO add your handling code here:
        btnClientes3.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitClientes(CockpitStrings.Perspectivas[1], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnClientes3ActionPerformed

    private void btnClientes4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnClientes4ActionPerformed
        // TODO add your handling code here:
        btnClientes4.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitClientes(CockpitStrings.Perspectivas[1], 4);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnClientes4ActionPerformed

    private void btnClientes5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnClientes5ActionPerformed
        // TODO add your handling code here:
        btnClientes5.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitClientes(CockpitStrings.Perspectivas[1], 3, 6);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnClientes5ActionPerformed

    private void btnProcessos1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos1ActionPerformed
        // TODO add your handling code here:
        btnProcessos1.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos1ActionPerformed

    private void btnProcessos2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos2ActionPerformed
        // TODO add your handling code here:
        btnProcessos2.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos2ActionPerformed

    private void btnProcessos3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos3ActionPerformed
        // TODO add your handling code here:
        btnProcessos3.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 5, 2);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos3ActionPerformed

    private void btnProcessos4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos4ActionPerformed
        // TODO add your handling code here:
        btnProcessos4.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 4);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos4ActionPerformed

    private void btnProcessos5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos5ActionPerformed
        // TODO add your handling code here:
        btnProcessos5.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 3);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos5ActionPerformed

    private void btnProcessos6ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos6ActionPerformed
        // TODO add your handling code here:
        btnProcessos6.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 6);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos6ActionPerformed

    private void btnProcessos7ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnProcessos7ActionPerformed
        // TODO add your handling code here:
        btnProcessos7.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitProcessos(CockpitStrings.Perspectivas[2], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnProcessos7ActionPerformed

    private void btnPGT1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT1ActionPerformed
        // TODO add your handling code here:
        btnPGT1.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 2);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT1ActionPerformed

    private void btnPGT2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT2ActionPerformed
        // TODO add your handling code here:
        btnPGT2.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 2);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT2ActionPerformed

    private void btnPGT3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT3ActionPerformed
        // TODO add your handling code here:
        btnPGT3.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 5);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT3ActionPerformed

    private void btnPGT4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT4ActionPerformed
        // TODO add your handling code here:
        btnPGT4.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 4);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT4ActionPerformed

    private void btnPGT5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT5ActionPerformed
        // TODO add your handling code here:
        btnPGT5.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 1);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT5ActionPerformed

    private void btnPGT6ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT6ActionPerformed
        // TODO add your handling code here:
        btnPGT6.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 3);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT6ActionPerformed

    private void btnPGT7ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnPGT7ActionPerformed
        // TODO add your handling code here:
        btnPGT7.addActionListener(botao);
        Info.objetivos.setStatusNull();
        Info.telaPrincipal.setStatusCockpitPGT(CockpitStrings.Perspectivas[3], 6);
        botao.actionPerformed(evt);
    }//GEN-LAST:event_btnPGT7ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnClientes2;
    private javax.swing.JButton btnClientes3;
    private javax.swing.JButton btnClientes4;
    private javax.swing.JButton btnClientes5;
    private javax.swing.JButton btnFinancas1;
    private javax.swing.JButton btnFinancas2;
    private javax.swing.JButton btnFinancas3;
    private javax.swing.JButton btnFinancas4;
    private javax.swing.JButton btnFinancas5;
    private javax.swing.JButton btnPGT1;
    private javax.swing.JButton btnPGT2;
    private javax.swing.JButton btnPGT3;
    private javax.swing.JButton btnPGT4;
    private javax.swing.JButton btnPGT5;
    private javax.swing.JButton btnPGT6;
    private javax.swing.JButton btnPGT7;
    private javax.swing.JButton btnPGT8;
    private javax.swing.JButton btnProcessos1;
    private javax.swing.JButton btnProcessos2;
    private javax.swing.JButton btnProcessos3;
    private javax.swing.JButton btnProcessos4;
    private javax.swing.JButton btnProcessos5;
    private javax.swing.JButton btnProcessos6;
    private javax.swing.JButton btnProcessos7;
    private javax.swing.JLabel lblMapaEstrategico;
    private javax.swing.JLabel lblStatusCliPos1;
    private javax.swing.JLabel lblStatusCliPos2;
    private javax.swing.JLabel lblStatusCliPos3;
    private javax.swing.JLabel lblStatusCliPos4;
    private javax.swing.JLabel lblStatusCliPos5;
    private javax.swing.JLabel lblStatusFinPos1;
    private javax.swing.JLabel lblStatusFinPos2;
    private javax.swing.JLabel lblStatusFinPos3;
    private javax.swing.JLabel lblStatusFinPos4;
    private javax.swing.JLabel lblStatusFinPos5;
    private javax.swing.JLabel lblStatusPgtPos1;
    private javax.swing.JLabel lblStatusPgtPos2;
    private javax.swing.JLabel lblStatusPgtPos3;
    private javax.swing.JLabel lblStatusPgtPos4;
    private javax.swing.JLabel lblStatusPgtPos5;
    private javax.swing.JLabel lblStatusPgtPos6;
    private javax.swing.JLabel lblStatusPgtPos7;
    private javax.swing.JLabel lblStatusPgtPos8;
    private javax.swing.JLabel lblStatusProPos1;
    private javax.swing.JLabel lblStatusProPos2;
    private javax.swing.JLabel lblStatusProPos3;
    private javax.swing.JLabel lblStatusProPos4;
    private javax.swing.JLabel lblStatusProPos5;
    private javax.swing.JLabel lblStatusProPos6;
    private javax.swing.JLabel lblStatusProPos7;
    private javax.swing.JPanel panelMapa;
    private javax.swing.JScrollPane scrollMapa;
    // End of variables declaration//GEN-END:variables

    public void setLblStatusFinPos1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFinPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFinPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFinPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFinPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFinPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFinPos2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFinPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFinPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFinPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFinPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFinPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFinPos3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFinPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFinPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFinPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFinPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFinPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFinPos4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFinPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFinPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFinPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFinPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFinPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusFinPos5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFinPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFinPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFinPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFinPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFinPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCliPos1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCliPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCliPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCliPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCliPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCliPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCliPos2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCliPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCliPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCliPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCliPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCliPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCliPos3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCliPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCliPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCliPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCliPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCliPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCliPos4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCliPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCliPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCliPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCliPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCliPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusCliPos5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusCliPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusCliPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusCliPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusCliPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusCliPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusProPos7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusProPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusProPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusProPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusProPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusProPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPgtPos8(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPgtPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPgtPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPgtPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPgtPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPgtPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setStatusNull(){
        lblStatusFinPos1.setIcon(null);
        lblStatusFinPos2.setIcon(null);
        lblStatusFinPos3.setIcon(null);
        lblStatusFinPos4.setIcon(null);
        lblStatusFinPos5.setIcon(null);
        
        lblStatusCliPos1.setIcon(null);
        lblStatusCliPos2.setIcon(null);
        lblStatusCliPos3.setIcon(null);
        lblStatusCliPos4.setIcon(null);
        lblStatusCliPos5.setIcon(null);
        
        lblStatusProPos1.setIcon(null);
        lblStatusProPos2.setIcon(null);
        lblStatusProPos3.setIcon(null);
        lblStatusProPos4.setIcon(null);
        lblStatusProPos5.setIcon(null);
        lblStatusProPos6.setIcon(null);
        lblStatusProPos7.setIcon(null);
        
        lblStatusPgtPos1.setIcon(null);
        lblStatusPgtPos2.setIcon(null);
        lblStatusPgtPos3.setIcon(null);
        lblStatusPgtPos4.setIcon(null);
        lblStatusPgtPos5.setIcon(null);
        lblStatusPgtPos6.setIcon(null);
        lblStatusPgtPos7.setIcon(null);
        lblStatusPgtPos8.setIcon(null);
    }
}
