package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.AcaoBotaoCockpit;
import br.com.engemet.cockpit.acao.AcaoCockpit;
import br.com.engemet.cockpit.acao.CalculoStatus;
import br.com.engemet.cockpit.acao.CockpitStrings;
import br.com.engemet.cockpit.oracle.Conexao;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame{

    public static final Principal Frame = new Principal();
    private Conexao conexao = new Conexao();
    private MapaEstrategico mapa = new MapaEstrategico();
    private Indicadores indicador;
    private AcaoCockpit acaoCockpit = new AcaoCockpit();
    private AcaoBotaoCockpit acaoBotaoCockpit = new AcaoBotaoCockpit();
    private CalculoStatus status = new CalculoStatus();
    //private Forecast forecast;
    private String descricao;
    private String campo;
    private String tabela;
    private String select;
    private String indCod;

    public Principal(){
        Info.telaPrincipal = this;
        conexao.openBD();

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuMapaEstrategico = new javax.swing.JMenu();
        jMenuItemMapaEstrategico = new javax.swing.JMenuItem();
        jMenuCockpit = new javax.swing.JMenu();
        jMenuCokpitOps = new javax.swing.JMenu();
        jMenuItemFinancas = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemProcessos = new javax.swing.JMenuItem();
        jMenuItemPgt = new javax.swing.JMenuItem();
        jMenuQualidadeOps = new javax.swing.JMenu();
        jMenuItemSgi = new javax.swing.JMenuItem();
        jMenuIndicadores = new javax.swing.JMenu();
        jMenuItemNovoIndicador = new javax.swing.JMenuItem();
        jMenuItemEditarIndicador = new javax.swing.JMenuItem();
        jMenuScorecard = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COCKPIT");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 740));
        setName("frCockpit"); // NOI18N

        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuPrincipal.add(jMenuArquivo);

        jMenuMapaEstrategico.setText("Mapa Estratégico");

        jMenuItemMapaEstrategico.setText("Mapa Estratégico");
        jMenuItemMapaEstrategico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMapaEstrategicoActionPerformed(evt);
            }
        });
        jMenuMapaEstrategico.add(jMenuItemMapaEstrategico);

        jMenuPrincipal.add(jMenuMapaEstrategico);

        jMenuCockpit.setText("Cockpit");

        jMenuCokpitOps.setText("Cockpit");

        jMenuItemFinancas.setText("Finanças");
        jMenuItemFinancas.setActionCommand(CockpitStrings.Cockpit[0]);
        jMenuItemFinancas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFinancasActionPerformed(evt);
            }
        });
        jMenuCokpitOps.add(jMenuItemFinancas);

        jMenuItemClientes.setText("Clientes");
        jMenuItemClientes.setActionCommand(CockpitStrings.Cockpit[1]);
        jMenuItemClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClientesActionPerformed(evt);
            }
        });
        jMenuCokpitOps.add(jMenuItemClientes);

        jMenuItemProcessos.setText("Processos");
        jMenuItemProcessos.setActionCommand(CockpitStrings.Cockpit[2]);
        jMenuItemProcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProcessosActionPerformed(evt);
            }
        });
        jMenuCokpitOps.add(jMenuItemProcessos);

        jMenuItemPgt.setText("PGT");
        jMenuItemPgt.setActionCommand(CockpitStrings.Cockpit[3]);
        jMenuItemPgt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPgtActionPerformed(evt);
            }
        });
        jMenuCokpitOps.add(jMenuItemPgt);

        jMenuCockpit.add(jMenuCokpitOps);

        jMenuQualidadeOps.setText("Qualidade");

        jMenuItemSgi.setText("SGI");
        jMenuItemSgi.setActionCommand(CockpitStrings.Cockpit[4]);
        jMenuItemSgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSgiActionPerformed(evt);
            }
        });
        jMenuQualidadeOps.add(jMenuItemSgi);

        jMenuCockpit.add(jMenuQualidadeOps);

        jMenuPrincipal.add(jMenuCockpit);

        jMenuIndicadores.setText("Indicadores");

        jMenuItemNovoIndicador.setText("Novo Indicador");
        jMenuItemNovoIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovoIndicadorActionPerformed(evt);
            }
        });
        jMenuIndicadores.add(jMenuItemNovoIndicador);

        jMenuItemEditarIndicador.setText("Editar Indicador");
        jMenuItemEditarIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarIndicadorActionPerformed(evt);
            }
        });
        jMenuIndicadores.add(jMenuItemEditarIndicador);

        jMenuPrincipal.add(jMenuIndicadores);

        jMenuScorecard.setText("Scorecard");

        jMenuItem1.setText("jMenuItem1");
        jMenuScorecard.add(jMenuItem1);

        jMenuPrincipal.add(jMenuScorecard);

        setJMenuBar(jMenuPrincipal);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancasActionPerformed
        jMenuItemFinancas.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        setStatusCockpit(CockpitStrings.Perspectivas[0]);
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemFinancasActionPerformed

    private void jMenuItemMapaEstrategicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMapaEstrategicoActionPerformed
        if(Frame.getComponents() != (null)){
            Frame.remove(Info.graficos);
        }

        Info.mapaEstrategico.setStatusNull();
        setStatusMapa();

        mapa.setBounds(5, 5, 1270, 715);
        Frame.add(mapa);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItemMapaEstrategicoActionPerformed

    @SuppressWarnings("deprecation")
    private void jMenuItemNovoIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoIndicadorActionPerformed
        indicador = new Indicadores();
        indicador.setBounds(120, 40, 1000, 730);
        Info.indicadores.setNewCod();
        indicador.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovoIndicadorActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        conexao.closeBD();
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemClientesActionPerformed
        // TODO add your handling code here:
        jMenuItemClientes.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        setStatusCockpit(CockpitStrings.Perspectivas[1]);
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemProcessosActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemProcessosActionPerformed
        // TODO add your handling code here: 
        jMenuItemProcessos.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        setStatusCockpit(CockpitStrings.Perspectivas[2]);
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemProcessosActionPerformed

    private void jMenuItemPgtActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemPgtActionPerformed
        // TODO add your handling code here:
        jMenuItemPgt.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        setStatusCockpit(CockpitStrings.Perspectivas[3]);
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemPgtActionPerformed

    private void jMenuItemSgiActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemSgiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemSgiActionPerformed

    @SuppressWarnings("deprecation")
    private void jMenuItemEditarIndicadorActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemEditarIndicadorActionPerformed
        // TODO add your handling code here:
        Editar editar = new Editar();

        editar.setTitle("Editar Indicadores");
        editar.setTexto("Escolha o Indicador:");

        int cod = 0;

        campo = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        select = "SELECT " + campo + " FROM " + tabela;
        cod = Info.objConexao.getIndCod(select, campo, cod);

        String[] combo = new String[cod];

        campo = "INF_INDDES";
        indCod = "INF_INDCOD";
        for(int i = 1; i < (cod); i++){
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + i;
            descricao = Info.objConexao.getBD(select, campo);

            combo[i] = i + " = " + descricao;

            editar.setCbxIndicadores(combo[i] = i + " = " + descricao);

        }

        for(int i = 1; i < combo.length; i++){
            if((i + descricao) == combo[i]){
                cod = i;
            }
        }

        editar.setBounds(550, 400, 520, 160);
        editar.setVisible(true);
        /*
         descricao = String.valueOf(JOptionPane.showInputDialog(null, "Escolha o Indicador:", "Editar Indicadorores", JOptionPane.PLAIN_MESSAGE, null, combo, ""));
         System.out.println("Resultado = "+ descricao);
        
         for(int i = 1; i < combo.length; i++){
         if(descricao == combo[i]){
         cod = i;
         }
         }

         indicador = new Indicadores();
         indicador.setBounds(120, 40, 1000, 730);
         indicador.setCod(cod);
         indicador.setVisible(true);
         */
    }//GEN-LAST:event_jMenuItemEditarIndicadorActionPerformed

    public void setStatusMapa(){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();


        for(int i = 0; i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaMapa((j + 1), i);
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaMapa((j + 1), i);
                    }
                }
            }
        }
    }

    public void setStatusCockpit(String per){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        for(int i = 0; i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaCockpit((j + 1), i, per);

                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i);
                        }
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaCockpit((j + 1), i, per);

                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i);
                        }
                    }
                }
            }
        }
    }

    public void setStatusCockpit(String per, int pai){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        for(int i = 0; i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i, pai);
                        }
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i, pai);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i, pai);
                        }
                    }
                }
            }
        }
    }

    public void setStatusCockpit(String per, int pai1, int pai2){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        for(int i = 0; i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i, pai1, pai2);
                        }
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        if(per.equals(CockpitStrings.Perspectivas[0])){
                            status.setBolaFinancas((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[1])){
                            status.setBolaClientes((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[2])){
                            status.setBolaProcessos((j + 1), i, pai1, pai2);
                        }else if(per.equals(CockpitStrings.Perspectivas[3])){
                            status.setBolaPgt((j + 1), i, pai1, pai2);
                        }
                    }
                }
            }
        }
    }

    public void setStatusGrafico(String perspectiva, int pai, int pos){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        for(int i = 0; i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);
                    status.setBolaGrafico((j + 1), i, perspectiva, pai, pos);

                    if(i == (Info.data - 1)){
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);
                    status.setBolaGrafico((j + 1), i, perspectiva, pai, pos);

                    if(i == (Info.data - 1)){
                    }
                }
            }
        }
    }

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                Frame.setExtendedState(Principal.MAXIMIZED_BOTH);
                Frame.setVisible(true);
            }

        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenu jMenuCockpit;
    private javax.swing.JMenu jMenuCokpitOps;
    private javax.swing.JMenu jMenuIndicadores;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemEditarIndicador;
    private javax.swing.JMenuItem jMenuItemFinancas;
    private javax.swing.JMenuItem jMenuItemMapaEstrategico;
    private javax.swing.JMenuItem jMenuItemNovoIndicador;
    private javax.swing.JMenuItem jMenuItemPgt;
    private javax.swing.JMenuItem jMenuItemProcessos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSgi;
    private javax.swing.JMenu jMenuMapaEstrategico;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuQualidadeOps;
    private javax.swing.JMenu jMenuScorecard;
    // End of variables declaration//GEN-END:variables
}