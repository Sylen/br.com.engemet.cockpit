package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame{
    
    private static AcessoUsuario acesso = new AcessoUsuario();
    public static final Principal Frame = new Principal();
    private MapaEstrategico mapa = new MapaEstrategico();
    private Indicadores indicador;
    private Iniciativas iniciativa;
    private AcaoCockpit acaoCockpit = new AcaoCockpit();
    private AcaoBotaoCockpit acaoBotaoCockpit = new AcaoBotaoCockpit();
    private CalculoStatus status = new CalculoStatus();
    private CriarUsuario usuario;
    private String descricao, campo, tabela, select, indCod, strCod;
    
    public Principal(){
        Info.telaPrincipal = this;

        initComponents();

        setDefaultCloseOperation(Frame.DO_NOTHING_ON_CLOSE); 
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt){
                if(JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
                    AcessoUsuario.conexao.closeBD();
                    System.exit(0);
                }
            }
        });
        
        checkAno();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuPrincipal = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuUsuario = new javax.swing.JMenu();
        jMenuItemCriarUsuario = new javax.swing.JMenuItem();
        jMenuItemRedefinirSenha = new javax.swing.JMenuItem();
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
        jMenuItemImprimirIndicador = new javax.swing.JMenuItem();
        jMenuScorecard = new javax.swing.JMenu();
        jMenuIniciativa = new javax.swing.JMenu();
        jMenuItemNovaIniciativa = new javax.swing.JMenuItem();
        jMenuItemConsultarIniciativa = new javax.swing.JMenuItem();
        jMenuItemEditarIniciativa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("COCKPIT");
        setBounds(new java.awt.Rectangle(0, 0, 1280, 740));
        setName("frCockpit"); // NOI18N

        jMenuArquivo.setText("Arquivo");

        jMenuUsuario.setText("Usuário");

        jMenuItemCriarUsuario.setText("Criar Usuário");
        jMenuItemCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCriarUsuarioActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemCriarUsuario);

        jMenuItemRedefinirSenha.setText("Redefinir Senha");
        jMenuItemRedefinirSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRedefinirSenhaActionPerformed(evt);
            }
        });
        jMenuUsuario.add(jMenuItemRedefinirSenha);

        jMenuArquivo.add(jMenuUsuario);

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

        jMenuItemImprimirIndicador.setText("Imprimir / Exportar Indicador");
        jMenuItemImprimirIndicador.setToolTipText("");
        jMenuItemImprimirIndicador.setEnabled(false);
        jMenuItemImprimirIndicador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemImprimirIndicadorActionPerformed(evt);
            }
        });
        jMenuIndicadores.add(jMenuItemImprimirIndicador);

        jMenuPrincipal.add(jMenuIndicadores);

        jMenuScorecard.setText("Scorecard");
        jMenuPrincipal.add(jMenuScorecard);

        jMenuIniciativa.setText("Iniciativas");

        jMenuItemNovaIniciativa.setText("Nova Iniciativa");
        jMenuItemNovaIniciativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNovaIniciativaActionPerformed(evt);
            }
        });
        jMenuIniciativa.add(jMenuItemNovaIniciativa);

        jMenuItemConsultarIniciativa.setText("Consultar Iniciativa");
        jMenuItemConsultarIniciativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarIniciativaActionPerformed(evt);
            }
        });
        jMenuIniciativa.add(jMenuItemConsultarIniciativa);

        jMenuItemEditarIniciativa.setText("Editar Iniciativa");
        jMenuItemEditarIniciativa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEditarIniciativaActionPerformed(evt);
            }
        });
        jMenuIniciativa.add(jMenuItemEditarIniciativa);

        jMenuPrincipal.add(jMenuIniciativa);

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

    private void checkAno(){
        Info.data = Info.cal.get(Calendar.YEAR);
        
        //int cod = Info.getCod();
        //int forCod = Info.getForecastCod();
        int compara = 0; 
        //String strCompara = "";
        
        tabela = "CP_META";
        campo = "MET_ANOREF";
        select = "SELECT " + campo + " FROM " + tabela;
        String strCompara = Info.objConexao.getBD(select, campo);
        
        if(strCompara != null){
            compara = Integer.parseInt(Info.objConexao.getBD(select, campo));
        }else{
            compara = 0;
        }
        
        if(Info.data != compara && compara != 0){
            tabela = "CP_HISTORICO";
            String tabela2= "CP_VAL_REAIS";
            String insert = "INSERT INTO " + tabela + " SELECT * FROM " + tabela2;
            Info.objConexao.setBD(insert);
            insert = "DELETE FROM " + tabela2;
            Info.objConexao.setBD(insert);

            tabela = "CP_HISTORICO_META";
            tabela2 = "CP_META";
            insert = "INSERT INTO " + tabela + " SELECT * FROM " + tabela2;
            Info.objConexao.setBD(insert);
            insert = "DELETE FROM " + tabela2;
            Info.objConexao.setBD(insert);
            
            tabela = "CP_FORECAST";
            insert = "DELETE FROM " + tabela;
            Info.objConexao.setBD(insert);
            
            tabela = "CP_CORES";
            insert = "DELETE FROM " + tabela;
            Info.objConexao.setBD(insert);
        }
        
        
    }
    
    private void jMenuItemFinancasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFinancasActionPerformed
        jMenuItemFinancas.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        if(Info.getMeta() > 1){
            setStatusCockpitFinancas(CockpitStrings.Perspectivas[0]);
        }
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemFinancasActionPerformed

    private void jMenuItemMapaEstrategicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMapaEstrategicoActionPerformed
        if(Frame.getComponents() != (null)){
            Frame.remove(Info.graficos);
        }

        Info.mapaEstrategico.setStatusNull();
        
        if(Info.getMeta() > 1){
            setStatusMapa();
        }
        
        mapa.setBounds(5, 5, 1270, 715);
        Frame.add(mapa);
        validate();
        repaint();
    }//GEN-LAST:event_jMenuItemMapaEstrategicoActionPerformed

    @SuppressWarnings("deprecation")
    private void jMenuItemNovoIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovoIndicadorActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Deseja criar um novo Indicador", "Indicadores", JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
            indicador = new Indicadores();
            indicador.setBounds(120, 20, 1000, 730);
            Info.indicadores.setNewCod();
            indicador.setVisible(true);
        }  
    }//GEN-LAST:event_jMenuItemNovoIndicadorActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            AcessoUsuario.conexao.closeBD();
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemClientesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemClientesActionPerformed
        // TODO add your handling code here:
        jMenuItemClientes.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        if(Info.getMeta() > 1){
            setStatusCockpitFinancas(CockpitStrings.Perspectivas[1]);
        }
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemClientesActionPerformed

    private void jMenuItemProcessosActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemProcessosActionPerformed
        // TODO add your handling code here: 
        jMenuItemProcessos.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        if(Info.getMeta() > 1){
            setStatusCockpitFinancas(CockpitStrings.Perspectivas[2]);
        }
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemProcessosActionPerformed

    private void jMenuItemPgtActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemPgtActionPerformed
        // TODO add your handling code here:
        jMenuItemPgt.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        if(Info.getMeta() > 1){
            setStatusCockpitFinancas(CockpitStrings.Perspectivas[3]);
        }
        acaoCockpit.actionPerformed(evt);
    }//GEN-LAST:event_jMenuItemPgtActionPerformed

    private void jMenuItemSgiActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jMenuItemSgiActionPerformed
        // TODO add your handling code here:
        jMenuItemFinancas.addActionListener(acaoCockpit);
        Info.cockpit.setStatusNull();
        if(Info.getMeta() > 1){
            setStatusSgi();
        }
        acaoCockpit.actionPerformed(evt);
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
        
        editar.setNomeEditar("Editar Indicadores");

        editar.setBounds(550, 400, 630, 160);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarIndicadorActionPerformed

    private void jMenuItemCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCriarUsuarioActionPerformed
        // TODO add your handling code here:
        usuario = new CriarUsuario();
        usuario.setTitulo("Criar Usuário");
        usuario.setVisible(true);
        Info.aux = 0;
    }//GEN-LAST:event_jMenuItemCriarUsuarioActionPerformed

    private void jMenuItemRedefinirSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRedefinirSenhaActionPerformed
        // TODO add your handling code here:
        usuario = new CriarUsuario();
        usuario.setTitulo("Redefir a Senha");
        usuario.setRedefirSenha();
        usuario.setVisible(true);
        Info.aux = 1;
    }//GEN-LAST:event_jMenuItemRedefinirSenhaActionPerformed

    private void jMenuItemNovaIniciativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNovaIniciativaActionPerformed
        // TODO add your handling code here:
        iniciativa = new Iniciativas();
        iniciativa.setIniciativaCod();
        iniciativa.setCodUsuario();
        iniciativa.setBounds(110, 0, 1050, 710);
        iniciativa.setVisible(true);
    }//GEN-LAST:event_jMenuItemNovaIniciativaActionPerformed

    private void jMenuItemEditarIniciativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEditarIniciativaActionPerformed
        // TODO add your handling code here:
        Editar editar = new Editar();

        editar.setTitle("Editar Atividades");
        editar.setTexto("Escolha a Atividade:");
        
        int cod = 0;
        
        String descricao;
        
        tabela = "IN_DEF_GERAIS";
        strCod = "DEF_CODUSU";
        String strUsuario = "DEF_NOMUSU";
        select = "SELECT * FROM " + tabela + " WHERE " + strUsuario + " = '" + Info.nomeUsuario + "'";
        cod = Info.objConexao.getIndCod(select, strCod, cod);
 
        String[] combo = new String[cod];
        
        campo = "DEF_INI";
        for(int i = 1; i < (cod); i++){
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strUsuario + " = '" + Info.nomeUsuario + "'" + " AND " + strCod + " = " + i;
            descricao = Info.objConexao.getBD(select, campo);

            combo[i] = i + " = " + descricao;

            editar.setCbxIndicadores(combo[i] = i + " = " + descricao);
        }
        
        editar.setNomeEditar("Editar Iniciativa");
        
        editar.setBounds(550, 400, 630, 160);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItemEditarIniciativaActionPerformed

    private void jMenuItemConsultarIniciativaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarIniciativaActionPerformed
        // TODO add your handling code here:
        Editar editar = new Editar();

        editar.setTitle("Consultar Atividades");
        editar.setTexto("Escolha a Atividade:");
        
        int cod = 0;
        
        String descricao , painel;
        
        tabela = "IN_DEF_GERAIS";
        indCod = "DEF_INICOD";
        String strUsuario = "DEF_NOMUSU";
        select = "SELECT * FROM " + tabela;
        cod = Info.objConexao.getIndCod(select, indCod, cod);
 
        String[] combo = new String[cod];
        
        campo = "DEF_INI";
        String campo2 = "DEF_PAI";
        for(int i = 1; i < (cod); i++){
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + i;
            descricao = Info.objConexao.getBD(select, campo);
            
            select = "SELECT " + campo2 + " FROM " + tabela + " WHERE " + indCod + " = " + i;
            painel = Info.objConexao.getBD(select, campo2);

            combo[i] = i + " = " + painel + " / " + descricao;

            editar.setCbxIndicadores(combo[i] = i + " = " + painel + " / " + descricao);
        }
        
        editar.setNomeEditar("Consultar Iniciativa");
        
        editar.setBounds(550, 400, 630, 160);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItemConsultarIniciativaActionPerformed

    private void jMenuItemImprimirIndicadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemImprimirIndicadorActionPerformed
        // TODO add your handling code here:
        Editar editar = new Editar();

        editar.setTitle("Imprimir / Exportar Indicadores");
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
        
        editar.setNomeEditar("Imprimir / Exportar Indicadores");

        editar.setBounds(550, 400, 630, 160);
        editar.setVisible(true);
    }//GEN-LAST:event_jMenuItemImprimirIndicadorActionPerformed

    public void setStatusMapa(){
        Info.data = Info.cal.get(Calendar.MONTH);

        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (data)){
                        status.setBolaMapa((j + 1), i);
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (data)){
                        status.setBolaMapa((j + 1), i);
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitFinancas(String per){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == (data)){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaFinancas((j + 1), i);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == (data)){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaFinancas((j + 1), i);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitFinancas(String per, int pai){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaFinancas((j + 1), i, pai);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaFinancas((j + 1), i, pai);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitFinancas(String per, int pai1, int pai2){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaFinancas((j + 1), i, pai1, pai2);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaFinancas((j + 1), i, pai1, pai2);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitClientes(String per){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaClientes((j + 1), i);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaClientes((j + 1), i);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitClientes(String per, int pai){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaClientes((j + 1), i, pai);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaClientes((j + 1), i, pai);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitClientes(String per, int pai1, int pai2){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaClientes((j + 1), i, pai1, pai2);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaClientes((j + 1), i, pai1, pai2);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitProcessos(String per){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
    
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaProcessos((j + 1), i);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaProcessos((j + 1), i);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitProcessos(String per, int pai){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaProcessos((j + 1), i, pai);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaProcessos((j + 1), i, pai);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitProcessos(String per, int pai1, int pai2){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaProcessos((j + 1), i, pai1, pai2);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaProcessos((j + 1), i, pai1, pai2);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitPGT(String per){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaPgt((j + 1), i);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaCockpit((j + 1), i, per);
                            status.setBolaPgt((j + 1), i);
                        }
                    }
                }
            }
        }   
    }
    
    public void setStatusCockpitPGT(String per, int pai){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaPgt((j + 1), i, pai);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaPgt((j + 1), i, pai);
                        }
                    }
                }
            }
        }
    }
    
    public void setStatusCockpitPGT(String per, int pai1, int pai2){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        String perspectiva;
        
        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                perspectiva = Info.getPers((j + 1));
                if(perspectiva.equals(per)){
                    calculo = Info.getCalculo((j + 1));
                    if(calculo.equals("CHK_MAIMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaPgt((j + 1), i, pai1, pai2);
                        }

                    }else if(calculo.equals("CHK_MENMEL")){
                        metaAcu = status.getMetaAcu((j + 1), i);
                        realAcu = status.getRealAcu((j + 1), i);
                        status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                        if(i == data){
                            status.setBolaPgt((j + 1), i, pai1, pai2);
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

        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == data){
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

                    if(i == data){
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

        int data;
        if(Info.data < 2){
            data = Info.data;
        }else{
            data = Info.data - 1;
        }
        
        for(int i = data; i < (data + 1); i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == data){
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

                    if(i == data){
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

    public void setStatusGrafico(String perspectiva, int pai, int pos, int cod){
        Info.data = Info.cal.get(Calendar.MONTH);

        double metaAcu;
        double realAcu;
        String calculo;
        
        for(int i = 0; i < Info.data; i++){
            calculo = Info.getCalculo((cod));
            if(calculo.equals("CHK_MAIMEL")){
                metaAcu = status.getMetaAcu((cod), i);
                realAcu = status.getRealAcu((cod), i);
                status.setMaiorMelhor(metaAcu, realAcu, (cod), i);
                status.setBolaGrafico((cod), i, perspectiva, pai, pos);

            }else if(calculo.equals("CHK_MENMEL")){
                metaAcu = status.getMetaAcu((cod), i);
                realAcu = status.getRealAcu((cod), i);
                status.setMenorMelhor(metaAcu, realAcu, (cod), i);
                status.setBolaGrafico((cod), i, perspectiva, pai, pos);
            }
        }
    }
    
    public void setStatusGraficoClientes(String perspectiva, int pai, int pos){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        
        if(perspectiva.equals(CockpitStrings.Perspectivas[1])){
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
    }
    
    public void setStatusGraficoProcessos(String perspectiva, int pai, int pos){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        if(perspectiva.equals(CockpitStrings.Perspectivas[2])){
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
    }
    
    public void setStatusGraficoPGT(String perspectiva, int pai, int pos){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();
        if(perspectiva.equals(CockpitStrings.Perspectivas[3])){
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
    }
    
    public void setStatusSgi(){
        Info.data = Info.cal.get(Calendar.MONTH);

        int cod;
        double metaAcu;
        double realAcu;
        String calculo;
        cod = Info.getCod();

        for(int i = (Info.data - 1); i < Info.data; i++){
            for(int j = 0; j < cod; j++){
                calculo = Info.getCalculo((j + 1));
                if(calculo.equals("CHK_MAIMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMaiorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaSgi((j + 1), i);
                    }
                }else if(calculo.equals("CHK_MENMEL")){
                    metaAcu = status.getMetaAcu((j + 1), i);
                    realAcu = status.getRealAcu((j + 1), i);
                    status.setMenorMelhor(metaAcu, realAcu, (j + 1), i);

                    if(i == (Info.data - 1)){
                        status.setBolaSgi((j + 1), i);
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
                Frame.setEnabled(false);
                acesso.setBounds(310, 250, 350, 170);
                acesso.setVisible(true);
            }

        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenu jMenuCockpit;
    private javax.swing.JMenu jMenuCokpitOps;
    private javax.swing.JMenu jMenuIndicadores;
    private javax.swing.JMenu jMenuIniciativa;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemConsultarIniciativa;
    private javax.swing.JMenuItem jMenuItemCriarUsuario;
    private javax.swing.JMenuItem jMenuItemEditarIndicador;
    private javax.swing.JMenuItem jMenuItemEditarIniciativa;
    private javax.swing.JMenuItem jMenuItemFinancas;
    private javax.swing.JMenuItem jMenuItemImprimirIndicador;
    private javax.swing.JMenuItem jMenuItemMapaEstrategico;
    private javax.swing.JMenuItem jMenuItemNovaIniciativa;
    private javax.swing.JMenuItem jMenuItemNovoIndicador;
    private javax.swing.JMenuItem jMenuItemPgt;
    private javax.swing.JMenuItem jMenuItemProcessos;
    private javax.swing.JMenuItem jMenuItemRedefinirSenha;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSgi;
    private javax.swing.JMenu jMenuMapaEstrategico;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JMenu jMenuQualidadeOps;
    private javax.swing.JMenu jMenuScorecard;
    private javax.swing.JMenu jMenuUsuario;
    // End of variables declaration//GEN-END:variables
    
    public String getTextUsuario(){
        return jMenuUsuario.getText();
    }
    
    public void setTextUsuario(String texto){
        jMenuUsuario.setText(texto);
    }
    
    public void setCriarUsuario(boolean bool){
        jMenuItemCriarUsuario.setEnabled(bool);
    }
    
    public void setIndicadores(boolean bool){
        jMenuItemCriarUsuario.setEnabled(bool);
        jMenuItemNovoIndicador.setEnabled(bool);
        jMenuItemEditarIndicador.setEnabled(bool);
    }
    
    public void setIniciativas(boolean bool){
        jMenuItemNovaIniciativa.setEnabled(bool);
        jMenuItemEditarIniciativa.setEnabled(bool);
    }
}
