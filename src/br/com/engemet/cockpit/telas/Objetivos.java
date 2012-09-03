package br.com.engemet.cockpit.telas;

import javax.swing.JButton;

public class Objetivos extends javax.swing.JFrame{
    
    private String[] strCor = {"Vermelhao", "Vermelho", "Amarelo", "Verde", "Verdao"};
    
    public Objetivos(){
        Info.objetivos = this;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnObjetivo1 = new javax.swing.JButton();
        btnObjetivo2 = new javax.swing.JButton();
        btnIndicador1 = new javax.swing.JButton();
        btnIndicador2 = new javax.swing.JButton();
        btnIndicador3 = new javax.swing.JButton();
        btnIndicador4 = new javax.swing.JButton();
        btnIndicador5 = new javax.swing.JButton();
        btnIndicador6 = new javax.swing.JButton();
        btnIndicador7 = new javax.swing.JButton();
        btnIndicador8 = new javax.swing.JButton();
        btnIndicador9 = new javax.swing.JButton();
        btnIndicador10 = new javax.swing.JButton();
        btnIndicador11 = new javax.swing.JButton();
        btnIndicador12 = new javax.swing.JButton();
        lblStatusPos1 = new javax.swing.JLabel();
        lblStatusPos4 = new javax.swing.JLabel();
        lblStatusPos5 = new javax.swing.JLabel();
        lblStatusPos2 = new javax.swing.JLabel();
        lblStatusPos3 = new javax.swing.JLabel();
        lblStatusPos6 = new javax.swing.JLabel();
        lblStatusPos7 = new javax.swing.JLabel();
        lblStatusPos8 = new javax.swing.JLabel();
        lblStatusPos9 = new javax.swing.JLabel();
        lblStatusPos10 = new javax.swing.JLabel();
        lblStatusPos11 = new javax.swing.JLabel();
        lblStatusPos12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 300, 860, 330));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(getLocation());
        setPreferredSize(new java.awt.Dimension(860, 340));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnObjetivo1.setText("Objetivo");
        btnObjetivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetivo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnObjetivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 100));

        btnObjetivo2.setText("Objetivo");
        btnObjetivo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObjetivo2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnObjetivo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 410, 100));

        btnIndicador1.setText("Indicador 1");
        btnIndicador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 90));

        btnIndicador2.setText("Indicador 2");
        btnIndicador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 130, 90));

        btnIndicador3.setText("Indicador 3");
        btnIndicador3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnIndicador3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 130, 90));

        btnIndicador4.setText("Indicador 4");
        btnIndicador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 130, 90));

        btnIndicador5.setText("Indicador 5");
        btnIndicador5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 130, 90));

        btnIndicador6.setText("Indicador 6");
        btnIndicador6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 130, 90));

        btnIndicador7.setText("Indicador 7");
        btnIndicador7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 130, 90));

        btnIndicador8.setText("Indicador 8");
        btnIndicador8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 130, 90));

        btnIndicador9.setText("Indicador 9");
        btnIndicador9.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnIndicador9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador9, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 130, 90));

        btnIndicador10.setText("Indicador 10");
        btnIndicador10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 130, 90));

        btnIndicador11.setText("Indicador 11");
        btnIndicador11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 130, 90));

        btnIndicador12.setText("Indicador 12");
        btnIndicador12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIndicador12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnIndicador12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 230, 130, 90));

        lblStatusPos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 30, 20));

        lblStatusPos4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 30, 20));

        lblStatusPos5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 30, 20));

        lblStatusPos2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 30, 20));

        lblStatusPos3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 30, 20));

        lblStatusPos6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 30, 20));

        lblStatusPos7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 30, 20));

        lblStatusPos8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 30, 20));

        lblStatusPos9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 100, 30, 20));

        lblStatusPos10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 30, 20));

        lblStatusPos11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 30, 20));

        lblStatusPos12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblStatusPos12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 30, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnObjetivo1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnObjetivo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObjetivo1ActionPerformed

    private void btnIndicador1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador1ActionPerformed
        // TODO add your handling code here:
        btnIndicador1.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador1ActionPerformed

    private void btnIndicador2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador2ActionPerformed
        // TODO add your handling code here:
        btnIndicador2.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador2ActionPerformed

    private void btnIndicador3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador3ActionPerformed
        // TODO add your handling code here:
        btnIndicador3.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador3ActionPerformed

    private void btnIndicador4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador4ActionPerformed
        // TODO add your handling code here:
        btnIndicador4.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador4ActionPerformed

    private void btnIndicador5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador5ActionPerformed
        // TODO add your handling code here:
        btnIndicador5.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador5ActionPerformed

    private void btnIndicador6ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador6ActionPerformed
        // TODO add your handling code here:
        btnIndicador6.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador6ActionPerformed

    private void btnObjetivo2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnObjetivo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnObjetivo2ActionPerformed

    private void btnIndicador7ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador7ActionPerformed
        // TODO add your handling code here:
        btnIndicador7.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador7ActionPerformed

    private void btnIndicador8ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador8ActionPerformed
        // TODO add your handling code here:
        btnIndicador8.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador8ActionPerformed

    private void btnIndicador9ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador9ActionPerformed
        // TODO add your handling code here:
        btnIndicador9.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador9ActionPerformed

    private void btnIndicador10ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador10ActionPerformed
        // TODO add your handling code here:
        btnIndicador10.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador10ActionPerformed

    private void btnIndicador11ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador11ActionPerformed
        // TODO add your handling code here:
        btnIndicador11.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador11ActionPerformed

    private void btnIndicador12ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnIndicador12ActionPerformed
        // TODO add your handling code here:
        btnIndicador12.addActionListener(Info.acaoBotaoCockpit);
        Info.acaoBotaoCockpit.actionPerformed(evt);
        dispose();
    }//GEN-LAST:event_btnIndicador12ActionPerformed

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){

            public void run(){
                new Objetivos().setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIndicador1;
    private javax.swing.JButton btnIndicador10;
    private javax.swing.JButton btnIndicador11;
    private javax.swing.JButton btnIndicador12;
    private javax.swing.JButton btnIndicador2;
    private javax.swing.JButton btnIndicador3;
    private javax.swing.JButton btnIndicador4;
    private javax.swing.JButton btnIndicador5;
    private javax.swing.JButton btnIndicador6;
    private javax.swing.JButton btnIndicador7;
    private javax.swing.JButton btnIndicador8;
    private javax.swing.JButton btnIndicador9;
    private javax.swing.JButton btnObjetivo1;
    private javax.swing.JButton btnObjetivo2;
    private javax.swing.JLabel lblStatusPos1;
    private javax.swing.JLabel lblStatusPos10;
    private javax.swing.JLabel lblStatusPos11;
    private javax.swing.JLabel lblStatusPos12;
    private javax.swing.JLabel lblStatusPos2;
    private javax.swing.JLabel lblStatusPos3;
    private javax.swing.JLabel lblStatusPos4;
    private javax.swing.JLabel lblStatusPos5;
    private javax.swing.JLabel lblStatusPos6;
    private javax.swing.JLabel lblStatusPos7;
    private javax.swing.JLabel lblStatusPos8;
    private javax.swing.JLabel lblStatusPos9;
    // End of variables declaration//GEN-END:variables
    private String nome = new String();
    private boolean visibilidade = true;

    public JButton getBtObjetivo1(){
        return btnObjetivo1;
    }

    public void setBtObjetivo1(String nome){
        this.nome = nome;
        this.btnObjetivo1.setText(nome);
    }

    public void setBtObjetivo1ActionCommand(String nome){
        this.nome = nome;
        this.btnObjetivo1.setActionCommand(nome);
    }

    public JButton getBtIndicador1(){
        return btnIndicador1;
    }

    public void setBtIndicador1(String nome){
        this.nome = nome;
        this.btnIndicador1.setText(nome);
    }

    public void setBtIndicador1ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador1.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador1(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador1.setVisible(visibilidade);
    }

    public JButton getBtIndicador2(){
        return btnIndicador2;
    }

    public void setBtIndicador2(String nome){
        this.nome = nome;
        this.btnIndicador2.setText(nome);
    }

    public void setBtIndicador2ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador2.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador2(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador2.setVisible(visibilidade);
    }

    public JButton getBtIndicador3(){
        return btnIndicador3;
    }

    public void setBtIndicador3(String nome){
        this.nome = nome;
        this.btnIndicador3.setText(nome);
    }

    public void setBtIndicador3ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador3.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador3(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador3.setVisible(visibilidade);
    }

    public JButton getBtIndicador4(){
        return btnIndicador4;
    }

    public void setBtIndicador4(String nome){
        this.nome = nome;
        this.btnIndicador4.setText(nome);
    }

    public void setBtIndicador4ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador4.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador4(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador4.setVisible(visibilidade);
    }

    public JButton getBtIndicador5(){
        return btnIndicador5;
    }

    public void setBtIndicador5(String nome){
        this.nome = nome;
        this.btnIndicador5.setText(nome);
    }

    public void setBtIndicador5ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador5.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador5(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador5.setVisible(visibilidade);
    }

    public JButton getBtIndicador6(){
        return btnIndicador6;
    }

    public void setBtIndicador6(String nome){
        this.nome = nome;
        this.btnIndicador6.setText(nome);
    }

    public void setBtIndicador6ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador6.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador6(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador6.setVisible(visibilidade);
    }

    public JButton getBtObjetivo2(){
        return btnObjetivo2;
    }

    public void setBtObjetivo2(String nome){
        this.nome = nome;
        this.btnObjetivo2.setText(nome);
    }

    public void setBtObjetivo2ActionCommand(String nome){
        this.nome = nome;
        this.btnObjetivo2.setActionCommand(nome);
    }

    public JButton getBtIndicador7(){
        return btnIndicador7;
    }

    public void setBtIndicador7(String nome){
        this.nome = nome;
        this.btnIndicador7.setText(nome);
    }

    public void setBtIndicador7ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador7.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador7(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador7.setVisible(visibilidade);
    }

    public JButton getBtIndicador8(){
        return btnIndicador8;
    }

    public void setBtIndicador8(String nome){
        this.nome = nome;
        this.btnIndicador8.setText(nome);
    }

    public void setBtIndicador8ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador8.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador8(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador8.setVisible(visibilidade);
    }

    public JButton getBtIndicador9(){
        return btnIndicador9;
    }

    public void setBtIndicador9(String nome){
        this.nome = nome;
        this.btnIndicador9.setText(nome);
    }

    public void setBtIndicador9ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador9.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador9(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador9.setVisible(visibilidade);
    }

    public JButton getBtIndicador10(){
        return btnIndicador10;
    }

    public void setBtIndicador10(String nome){
        this.nome = nome;
        this.btnIndicador10.setText(nome);
    }

    public void setBtIndicador10ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador10.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador10(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador10.setVisible(visibilidade);
    }

    public JButton getBtIndicador11(){
        return btnIndicador11;
    }

    public void setBtIndicador11(String nome){
        this.nome = nome;
        this.btnIndicador11.setText(nome);
    }

    public void setBtIndicador11ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador11.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador11(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador11.setVisible(visibilidade);
    }

    public JButton getBtIndicador12(){
        return btnIndicador12;
    }

    public void setBtIndicador12(String nome){
        this.nome = nome;
        this.btnIndicador12.setText(nome);
    }

    public void setBtIndicador12ActionCommand(String nome){
        this.nome = nome;
        this.btnIndicador12.setActionCommand(nome);
    }
    
    public void setVisibleBtIndicador12(boolean visibilidade){
        this.visibilidade = visibilidade;
        this.btnIndicador12.setVisible(visibilidade);
    }

    public void setLblStatusPos1(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos2(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos3(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos4(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos5(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos6(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos7(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos8(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos9(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos10(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos11(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }

    public void setLblStatusPos12(String cor){
        if(cor.equals(strCor[0])){
            lblStatusPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5M.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4M.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3M.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2M.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusPos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1M.png")));
        }
    }
    
    public void setStatusNull(){
        lblStatusPos1.setIcon(null);
        lblStatusPos2.setIcon(null);
        lblStatusPos3.setIcon(null);
        lblStatusPos4.setIcon(null);
        lblStatusPos5.setIcon(null);
        lblStatusPos6.setIcon(null);
        lblStatusPos7.setIcon(null);
        lblStatusPos8.setIcon(null);
        lblStatusPos9.setIcon(null);
        lblStatusPos10.setIcon(null);
        lblStatusPos11.setIcon(null);
        lblStatusPos12.setIcon(null);
    }

}
