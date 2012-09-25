package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.CockpitStrings;
import java.awt.Color;
import java.awt.Component;
import java.util.Calendar;
import javax.swing.*;

public class Iniciativas extends javax.swing.JFrame{
    
    private CronogramaIniciativa cronogramaIniciativa = new CronogramaIniciativa();

    public int iniCod = 0;
    private int cod = 0;
    private int codUsu = 0;
    private int aux;
    private String select, insert, tabela, campo, strCodIni, strCod, strCodUsu, strNom, strUsuario;
    private String atuIniAno, atuIniMes, atuIniSem, atuFimAno, atuFimMes, atuFimSem;
    private float semanasRestantes, numSemanas, semanasDecorridas;
    
    public Iniciativas(){
        Info.iniciativas = this;

        initComponents();

        setComboBoxs();
        setSituacaoStatus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDefinicoesGerais = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblDefinicoes = new javax.swing.JLabel();
        lblIniciativa = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblPatrocinador = new javax.swing.JLabel();
        lblLider = new javax.swing.JLabel();
        lblEquipe = new javax.swing.JLabel();
        lblEscopo = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblIndicadores = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblDataTermino = new javax.swing.JLabel();
        txtIniciativa = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPatrocinador = new javax.swing.JTextField();
        txtLider = new javax.swing.JTextField();
        txtEquipe = new javax.swing.JTextField();
        txtEscopo = new javax.swing.JTextField();
        txtProdutos = new javax.swing.JTextField();
        txtIndicadores = new javax.swing.JTextField();
        cbxDataInicioSemana = new javax.swing.JComboBox();
        cbxDataInicioMes = new javax.swing.JComboBox();
        cbxDataInicioAno = new javax.swing.JComboBox();
        cbxDataTerminoSemana = new javax.swing.JComboBox();
        cbxDataTerminoMes = new javax.swing.JComboBox();
        cbxDataTerminoAno = new javax.swing.JComboBox();
        lblPainel = new javax.swing.JLabel();
        lblObjetivo = new javax.swing.JLabel();
        cbxPainel = new javax.swing.JComboBox();
        cbxObjetivos = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        lblGerenciamento = new javax.swing.JLabel();
        lblDataAtualizacao = new javax.swing.JLabel();
        lblCronograma = new javax.swing.JLabel();
        lblRecursos = new javax.swing.JLabel();
        lblPontoAtencao = new javax.swing.JLabel();
        lblAcoes = new javax.swing.JLabel();
        lblResponsavel = new javax.swing.JLabel();
        lblPrazo = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        txtPrazo = new javax.swing.JFormattedTextField();
        lblContagemDias = new javax.swing.JLabel();
        chkVermelho = new javax.swing.JRadioButton();
        chkVerde = new javax.swing.JRadioButton();
        lblSituacao = new javax.swing.JLabel();
        lblSituacaoRecursos = new javax.swing.JLabel();
        lblSituacaoCronograma = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAcoes = new javax.swing.JTextArea();
        txtResponsavel = new javax.swing.JTextField();
        txtDataAtualizacao = new javax.swing.JFormattedTextField();
        chkOk = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtPontoAtencao = new javax.swing.JTextArea();
        txtPrazo1 = new javax.swing.JFormattedTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAcoes1 = new javax.swing.JTextArea();
        txtResponsavel1 = new javax.swing.JTextField();
        chkOk1 = new javax.swing.JCheckBox();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtPontoAtencao1 = new javax.swing.JTextArea();
        txtPrazo2 = new javax.swing.JFormattedTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAcoes2 = new javax.swing.JTextArea();
        txtResponsavel2 = new javax.swing.JTextField();
        chkOk2 = new javax.swing.JCheckBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtPontoAtencao2 = new javax.swing.JTextArea();
        txtPrazo3 = new javax.swing.JFormattedTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtAcoes3 = new javax.swing.JTextArea();
        txtResponsavel3 = new javax.swing.JTextField();
        chkOk3 = new javax.swing.JCheckBox();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtPontoAtencao3 = new javax.swing.JTextArea();
        txtPrazo4 = new javax.swing.JFormattedTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        txtAcoes4 = new javax.swing.JTextArea();
        txtResponsavel4 = new javax.swing.JTextField();
        chkOk4 = new javax.swing.JCheckBox();
        jScrollPane11 = new javax.swing.JScrollPane();
        txtPontoAtencao4 = new javax.swing.JTextArea();
        lblPlanejamento = new javax.swing.JLabel();
        lblRecursos1 = new javax.swing.JLabel();
        lblEspecificacao = new javax.swing.JLabel();
        lblSituacao1 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        txtRecursos = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        txtEspecificacao = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        txtRecursos1 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        txtEspecificacao1 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        txtRecursos2 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        txtEspecificacao2 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        txtRecursos3 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        txtEspecificacao3 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtRecursos4 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        txtEspecificacao4 = new javax.swing.JTextArea();
        chkPlanejamentoPendente = new javax.swing.JRadioButton();
        chkPlanejamentoOk = new javax.swing.JRadioButton();
        chkPlanejamentoPendente1 = new javax.swing.JRadioButton();
        chkPlanejamentoOk1 = new javax.swing.JRadioButton();
        chkPlanejamentoPendente2 = new javax.swing.JRadioButton();
        chkPlanejamentoOk2 = new javax.swing.JRadioButton();
        chkPlanejamentoPendente3 = new javax.swing.JRadioButton();
        chkPlanejamentoOk3 = new javax.swing.JRadioButton();
        chkPlanejamentoPendente4 = new javax.swing.JRadioButton();
        chkPlanejamentoOk4 = new javax.swing.JRadioButton();
        lblControle = new javax.swing.JLabel();
        lblDe = new javax.swing.JLabel();
        lblPara = new javax.swing.JLabel();
        lblAprovacao = new javax.swing.JLabel();
        jScrollPane22 = new javax.swing.JScrollPane();
        txtDe = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        txtPara = new javax.swing.JTextArea();
        chkControlePendente = new javax.swing.JRadioButton();
        chkControleOk = new javax.swing.JRadioButton();
        jScrollPane24 = new javax.swing.JScrollPane();
        txtDe1 = new javax.swing.JTextArea();
        jScrollPane25 = new javax.swing.JScrollPane();
        txtPara1 = new javax.swing.JTextArea();
        chkControlePendente1 = new javax.swing.JRadioButton();
        chkControleOk1 = new javax.swing.JRadioButton();
        jScrollPane26 = new javax.swing.JScrollPane();
        txtDe2 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        txtPara2 = new javax.swing.JTextArea();
        chkControlePendente2 = new javax.swing.JRadioButton();
        chkControleOk2 = new javax.swing.JRadioButton();
        jScrollPane28 = new javax.swing.JScrollPane();
        txtDe3 = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        txtPara3 = new javax.swing.JTextArea();
        chkControlePendente3 = new javax.swing.JRadioButton();
        chkControleOk3 = new javax.swing.JRadioButton();
        jScrollPane30 = new javax.swing.JScrollPane();
        txtDe4 = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        txtPara4 = new javax.swing.JTextArea();
        chkControlePendente4 = new javax.swing.JRadioButton();
        chkControleOk4 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        lblCronoIniciativa = new javax.swing.JLabel();
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
        btnAdicionarAtividade = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblProgresso = new javax.swing.JLabel();
        lblAtividades = new javax.swing.JLabel();
        lblPeriodo = new javax.swing.JLabel();
        lblRealizado = new javax.swing.JLabel();
        btnEditarAtividade = new javax.swing.JButton();
        jScrollPane32 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDefinicoes.setBackground(new java.awt.Color(15, 36, 62));
        lblDefinicoes.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblDefinicoes.setForeground(new java.awt.Color(255, 255, 255));
        lblDefinicoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDefinicoes.setText("Definições Gerais");
        lblDefinicoes.setOpaque(true);
        jPanel1.add(lblDefinicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 965, 40));

        lblIniciativa.setBackground(new java.awt.Color(22, 54, 92));
        lblIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblIniciativa.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciativa.setText("Iniciativa");
        lblIniciativa.setOpaque(true);
        jPanel1.add(lblIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 40));

        lblDescricao.setBackground(new java.awt.Color(54, 96, 146));
        lblDescricao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descrição / Objetivos");
        lblDescricao.setToolTipText("");
        lblDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDescricao.setOpaque(true);
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 40));

        lblPatrocinador.setBackground(new java.awt.Color(54, 96, 146));
        lblPatrocinador.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPatrocinador.setForeground(new java.awt.Color(255, 255, 255));
        lblPatrocinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatrocinador.setText("<html><center>Patrocinador da Iniciativa</center></html>");
        lblPatrocinador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPatrocinador.setOpaque(true);
        jPanel1.add(lblPatrocinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 40));

        lblLider.setBackground(new java.awt.Color(54, 96, 146));
        lblLider.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblLider.setForeground(new java.awt.Color(255, 255, 255));
        lblLider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLider.setText("Líder  da Iniciativa");
        lblLider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLider.setOpaque(true);
        jPanel1.add(lblLider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 40));

        lblEquipe.setBackground(new java.awt.Color(54, 96, 146));
        lblEquipe.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblEquipe.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquipe.setText("Equipe da Iniciativa");
        lblEquipe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEquipe.setOpaque(true);
        jPanel1.add(lblEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 40));

        lblEscopo.setBackground(new java.awt.Color(54, 96, 146));
        lblEscopo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblEscopo.setForeground(new java.awt.Color(255, 255, 255));
        lblEscopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscopo.setText("Escopo (Abrangência)");
        lblEscopo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEscopo.setOpaque(true);
        jPanel1.add(lblEscopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 40));

        lblProdutos.setBackground(new java.awt.Color(54, 96, 146));
        lblProdutos.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("<html><center>Produtos a serem gerados / Resultados / Benefícios Esperados</center></html>");
        lblProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProdutos.setOpaque(true);
        jPanel1.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 50));

        lblIndicadores.setBackground(new java.awt.Color(54, 96, 146));
        lblIndicadores.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblIndicadores.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicadores.setText("<html><center>Indicadores e Metas da Iniciativa</center></html>");
        lblIndicadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIndicadores.setOpaque(true);
        jPanel1.add(lblIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 150, 40));

        lblDataInicio.setBackground(new java.awt.Color(54, 96, 146));
        lblDataInicio.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblDataInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataInicio.setText("<html><center>\"Data de Início Inicialmente Planejada\"</center></html>");
        lblDataInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDataInicio.setOpaque(true);
        jPanel1.add(lblDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 150, 40));

        lblDataTermino.setBackground(new java.awt.Color(54, 96, 146));
        lblDataTermino.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDataTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblDataTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataTermino.setText("<html><center>\"Data de Término Inicialmente Planejada\"</center></html>");
        lblDataTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDataTermino.setOpaque(true);
        jPanel1.add(lblDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 150, 40));

        txtIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txtIniciativa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIniciativaFocusLost(evt);
            }
        });
        jPanel1.add(txtIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 810, 40));

        txtDescricao.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        jPanel1.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 810, 40));

        txtPatrocinador.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtPatrocinador.setToolTipText("Apoia e monitora os Projetos e redesenho dos processos envolvidos.  ");
        txtPatrocinador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPatrocinadorFocusLost(evt);
            }
        });
        jPanel1.add(txtPatrocinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 810, 40));

        txtLider.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtLider.setToolTipText("<html><center>Responsável pelo Gerenciamento da Iniciativa, que inclui a  realização das atividades previstas, produtos e resultados gerados pela mesmao e a coordenação da equipe designada para sua implementação.</center></html>");
        txtLider.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtLiderFocusLost(evt);
            }
        });
        jPanel1.add(txtLider, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 810, 40));

        txtEquipe.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtEquipe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEquipeFocusLost(evt);
            }
        });
        jPanel1.add(txtEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 810, 40));

        txtEscopo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtEscopo.setToolTipText("<html><center>O escopo define os limites da Iniciativa.</center></html>");
        txtEscopo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEscopoFocusLost(evt);
            }
        });
        jPanel1.add(txtEscopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 810, 40));

        txtProdutos.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtProdutos.setToolTipText("Retrata a situação desejada após a implementação do Projeto.");
        txtProdutos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtProdutosFocusLost(evt);
            }
        });
        jPanel1.add(txtProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 810, 50));

        txtIndicadores.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        txtIndicadores.setToolTipText("<html><center>Indicadores e Metas específicos da Iniciativa  que medem se os resultados do Projeto foram atendidos, ou não.</center></html>");
        txtIndicadores.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIndicadoresFocusLost(evt);
            }
        });
        jPanel1.add(txtIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 810, 40));

        cbxDataInicioSemana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1º semana", "2º semana", "3º semana", "4º semana" }));
        cbxDataInicioSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataInicioSemanaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataInicioSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 40));

        cbxDataInicioMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbxDataInicioMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataInicioMesActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataInicioMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, -1, 40));

        cbxDataInicioAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        cbxDataInicioAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataInicioAnoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataInicioAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, 40));

        cbxDataTerminoSemana.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "1º semana", "2º semana", "3º semana", "4º semana" }));
        cbxDataTerminoSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataTerminoSemanaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataTerminoSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, 40));

        cbxDataTerminoMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro" }));
        cbxDataTerminoMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataTerminoMesActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataTerminoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, -1, 40));

        cbxDataTerminoAno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        cbxDataTerminoAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataTerminoAnoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxDataTerminoAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, 40));

        lblPainel.setBackground(new java.awt.Color(54, 96, 146));
        lblPainel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPainel.setForeground(new java.awt.Color(255, 255, 255));
        lblPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainel.setText("<html><center>Painel</center></html>");
        lblPainel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPainel.setOpaque(true);
        jPanel1.add(lblPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 150, 40));

        lblObjetivo.setBackground(new java.awt.Color(54, 96, 146));
        lblObjetivo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblObjetivo.setForeground(new java.awt.Color(255, 255, 255));
        lblObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObjetivo.setText("<html><center>Objetivo\n</center></html>");
        lblObjetivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblObjetivo.setOpaque(true);
        jPanel1.add(lblObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 150, 40));

        cbxPainel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Finanças", "Clientes", "Processos", "Pessoas, Gestão & Tecnologia" }));
        cbxPainel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPainelActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 320, 40));

        cbxObjetivos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbxObjetivosFocusLost(evt);
            }
        });
        jPanel1.add(cbxObjetivos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 540, 40));

        txtDefinicoesGerais.addTab("Definições Gerais", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblGerenciamento.setBackground(new java.awt.Color(15, 36, 62));
        lblGerenciamento.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblGerenciamento.setForeground(new java.awt.Color(255, 255, 255));
        lblGerenciamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerenciamento.setText("Gerenciamento da Iniciativa");
        lblGerenciamento.setOpaque(true);
        jPanel2.add(lblGerenciamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 965, 40));

        lblDataAtualizacao.setBackground(new java.awt.Color(22, 54, 92));
        lblDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDataAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAtualizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataAtualizacao.setText("<html><center>Data de Atualização da Planilha</center></html>");
        lblDataAtualizacao.setOpaque(true);
        jPanel2.add(lblDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 40));

        lblCronograma.setBackground(new java.awt.Color(22, 54, 92));
        lblCronograma.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblCronograma.setForeground(new java.awt.Color(255, 255, 255));
        lblCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronograma.setText("Cronograma");
        lblCronograma.setToolTipText("");
        lblCronograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronograma.setOpaque(true);
        jPanel2.add(lblCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 150, 50));

        lblRecursos.setBackground(new java.awt.Color(22, 54, 92));
        lblRecursos.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblRecursos.setForeground(new java.awt.Color(255, 255, 255));
        lblRecursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecursos.setText("<html><center>Recusrsos / Equipe</center></html>");
        lblRecursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRecursos.setOpaque(true);
        jPanel2.add(lblRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 50));

        lblPontoAtencao.setBackground(new java.awt.Color(22, 54, 92));
        lblPontoAtencao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPontoAtencao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontoAtencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontoAtencao.setText("Pontos de Atenção");
        lblPontoAtencao.setToolTipText("Problemas Reais ou Potenciais que estão impactando a Iniciativa");
        lblPontoAtencao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPontoAtencao.setOpaque(true);
        jPanel2.add(lblPontoAtencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 350, 40));

        lblAcoes.setBackground(new java.awt.Color(22, 54, 92));
        lblAcoes.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblAcoes.setForeground(new java.awt.Color(255, 255, 255));
        lblAcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcoes.setText("Ações Corretivas / Preventivas");
        lblAcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAcoes.setOpaque(true);
        jPanel2.add(lblAcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 290, 40));

        lblResponsavel.setBackground(new java.awt.Color(22, 54, 92));
        lblResponsavel.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel.setText("Responsável");
        lblResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblResponsavel.setOpaque(true);
        jPanel2.add(lblResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 150, 40));

        lblPrazo.setBackground(new java.awt.Color(22, 54, 92));
        lblPrazo.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPrazo.setForeground(new java.awt.Color(255, 255, 255));
        lblPrazo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrazo.setText("Prazo");
        lblPrazo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPrazo.setOpaque(true);
        jPanel2.add(lblPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 250, 110, 40));

        lblOk.setBackground(new java.awt.Color(22, 54, 92));
        lblOk.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblOk.setForeground(new java.awt.Color(255, 255, 255));
        lblOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOk.setText("OK");
        lblOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblOk.setOpaque(true);
        jPanel2.add(lblOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 250, 60, 40));

        txtPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrazoFocusLost(evt);
            }
        });
        jPanel2.add(txtPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 290, 110, 30));

        lblContagemDias.setBackground(new java.awt.Color(54, 96, 146));
        lblContagemDias.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblContagemDias.setForeground(new java.awt.Color(255, 255, 255));
        lblContagemDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContagemDias.setText("Sem Dados");
        lblContagemDias.setToolTipText("");
        lblContagemDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblContagemDias.setOpaque(true);
        jPanel2.add(lblContagemDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 710, 40));

        chkVermelho.setText("Vermelho");
        chkVermelho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVermelhoActionPerformed(evt);
            }
        });
        jPanel2.add(chkVermelho, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        chkVerde.setText("Verde");
        chkVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVerdeActionPerformed(evt);
            }
        });
        jPanel2.add(chkVerde, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, -1));

        lblSituacao.setBackground(new java.awt.Color(22, 54, 92));
        lblSituacao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblSituacao.setForeground(new java.awt.Color(255, 255, 255));
        lblSituacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao.setText("Situação");
        lblSituacao.setToolTipText("");
        lblSituacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSituacao.setOpaque(true);
        jPanel2.add(lblSituacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 60, 20));

        lblSituacaoRecursos.setBackground(new java.awt.Color(54, 96, 146));
        lblSituacaoRecursos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacaoRecursos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSituacaoRecursos.setOpaque(true);
        jPanel2.add(lblSituacaoRecursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 60, 50));

        lblSituacaoCronograma.setBackground(new java.awt.Color(54, 96, 146));
        lblSituacaoCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacaoCronograma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSituacaoCronograma.setOpaque(true);
        jPanel2.add(lblSituacaoCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 60, 50));

        txtAcoes.setColumns(20);
        txtAcoes.setRows(1);
        txtAcoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcoesFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtAcoes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 290, 30));

        txtResponsavel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResponsavelFocusLost(evt);
            }
        });
        jPanel2.add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 150, 30));

        txtDataAtualizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataAtualizacao.setToolTipText("formato da data dd/mm/aaaa");
        txtDataAtualizacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataAtualizacaoFocusLost(evt);
            }
        });
        jPanel2.add(txtDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 40));

        chkOk.setText("OK");
        chkOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOkActionPerformed(evt);
            }
        });
        jPanel2.add(chkOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 290, 60, 30));

        txtPontoAtencao.setColumns(20);
        txtPontoAtencao.setRows(1);
        txtPontoAtencao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPontoAtencaoFocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(txtPontoAtencao);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 350, 30));

        txtPrazo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrazo1FocusLost(evt);
            }
        });
        jPanel2.add(txtPrazo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, 110, 30));

        txtAcoes1.setColumns(20);
        txtAcoes1.setRows(1);
        txtAcoes1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcoes1FocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(txtAcoes1);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 290, 30));

        txtResponsavel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResponsavel1FocusLost(evt);
            }
        });
        jPanel2.add(txtResponsavel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 150, 30));

        chkOk1.setText("OK");
        chkOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOk1ActionPerformed(evt);
            }
        });
        jPanel2.add(chkOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 320, 60, 30));

        txtPontoAtencao1.setColumns(20);
        txtPontoAtencao1.setRows(1);
        txtPontoAtencao1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPontoAtencao1FocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(txtPontoAtencao1);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 350, 30));

        txtPrazo2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrazo2FocusLost(evt);
            }
        });
        jPanel2.add(txtPrazo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 350, 110, 30));

        txtAcoes2.setColumns(20);
        txtAcoes2.setRows(1);
        txtAcoes2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcoes2FocusLost(evt);
            }
        });
        jScrollPane6.setViewportView(txtAcoes2);

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 290, 30));

        txtResponsavel2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResponsavel2FocusLost(evt);
            }
        });
        jPanel2.add(txtResponsavel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 150, 30));

        chkOk2.setText("OK");
        chkOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOk2ActionPerformed(evt);
            }
        });
        jPanel2.add(chkOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 350, 60, 30));

        txtPontoAtencao2.setColumns(20);
        txtPontoAtencao2.setRows(1);
        txtPontoAtencao2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPontoAtencao2FocusLost(evt);
            }
        });
        jScrollPane7.setViewportView(txtPontoAtencao2);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 350, 30));

        txtPrazo3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrazo3FocusLost(evt);
            }
        });
        jPanel2.add(txtPrazo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 380, 110, 30));

        txtAcoes3.setColumns(20);
        txtAcoes3.setRows(1);
        txtAcoes3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcoes3FocusLost(evt);
            }
        });
        jScrollPane8.setViewportView(txtAcoes3);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 290, 30));

        txtResponsavel3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResponsavel3FocusLost(evt);
            }
        });
        jPanel2.add(txtResponsavel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 150, 30));

        chkOk3.setText("OK");
        chkOk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOk3ActionPerformed(evt);
            }
        });
        jPanel2.add(chkOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 60, 30));

        txtPontoAtencao3.setColumns(20);
        txtPontoAtencao3.setRows(1);
        txtPontoAtencao3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPontoAtencao3FocusLost(evt);
            }
        });
        jScrollPane9.setViewportView(txtPontoAtencao3);

        jPanel2.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 350, 30));

        txtPrazo4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPrazo4FocusLost(evt);
            }
        });
        jPanel2.add(txtPrazo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 410, 110, 30));

        txtAcoes4.setColumns(20);
        txtAcoes4.setRows(1);
        txtAcoes4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAcoes4FocusLost(evt);
            }
        });
        jScrollPane10.setViewportView(txtAcoes4);

        jPanel2.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 290, 30));

        txtResponsavel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtResponsavel4FocusLost(evt);
            }
        });
        jPanel2.add(txtResponsavel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 150, 30));

        chkOk4.setText("OK");
        chkOk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkOk4ActionPerformed(evt);
            }
        });
        jPanel2.add(chkOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 60, 30));

        txtPontoAtencao4.setColumns(20);
        txtPontoAtencao4.setRows(1);
        txtPontoAtencao4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPontoAtencao4FocusLost(evt);
            }
        });
        jScrollPane11.setViewportView(txtPontoAtencao4);

        jPanel2.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 350, 30));

        lblPlanejamento.setBackground(new java.awt.Color(22, 54, 92));
        lblPlanejamento.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPlanejamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanejamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlanejamento.setText("<html><center>Planejamento de Recursos para a Iniciativa</center></html>");
        lblPlanejamento.setOpaque(true);
        jPanel2.add(lblPlanejamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 965, 40));

        lblRecursos1.setBackground(new java.awt.Color(22, 54, 92));
        lblRecursos1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblRecursos1.setForeground(new java.awt.Color(255, 255, 255));
        lblRecursos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecursos1.setText("Recursos");
        lblRecursos1.setToolTipText("(equipe, recursos materiais,  financeiros, etc.)");
        lblRecursos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRecursos1.setOpaque(true);
        jPanel2.add(lblRecursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 350, 40));

        lblEspecificacao.setBackground(new java.awt.Color(22, 54, 92));
        lblEspecificacao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblEspecificacao.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecificacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecificacao.setText("Especificação / Dimensionamento");
        lblEspecificacao.setToolTipText("(Ex: tempo de dedicação ou % de alocação, período, valor em R$, etc.)");
        lblEspecificacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEspecificacao.setOpaque(true);
        jPanel2.add(lblEspecificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 350, 40));

        lblSituacao1.setBackground(new java.awt.Color(22, 54, 92));
        lblSituacao1.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblSituacao1.setForeground(new java.awt.Color(255, 255, 255));
        lblSituacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao1.setText("Situação");
        lblSituacao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSituacao1.setOpaque(true);
        jPanel2.add(lblSituacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 260, 40));

        txtRecursos.setColumns(20);
        txtRecursos.setRows(1);
        txtRecursos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecursosFocusLost(evt);
            }
        });
        jScrollPane12.setViewportView(txtRecursos);

        jPanel2.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 350, 30));

        txtEspecificacao.setColumns(20);
        txtEspecificacao.setRows(1);
        txtEspecificacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEspecificacaoFocusLost(evt);
            }
        });
        jScrollPane13.setViewportView(txtEspecificacao);

        jPanel2.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 530, 350, 30));

        txtRecursos1.setColumns(20);
        txtRecursos1.setRows(1);
        txtRecursos1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecursos1FocusLost(evt);
            }
        });
        jScrollPane14.setViewportView(txtRecursos1);

        jPanel2.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 350, 30));

        txtEspecificacao1.setColumns(20);
        txtEspecificacao1.setRows(1);
        txtEspecificacao1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEspecificacao1FocusLost(evt);
            }
        });
        jScrollPane15.setViewportView(txtEspecificacao1);

        jPanel2.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 350, 30));

        txtRecursos2.setColumns(20);
        txtRecursos2.setRows(1);
        txtRecursos2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecursos2FocusLost(evt);
            }
        });
        jScrollPane16.setViewportView(txtRecursos2);

        jPanel2.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 350, 30));

        txtEspecificacao2.setColumns(20);
        txtEspecificacao2.setRows(1);
        txtEspecificacao2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEspecificacao2FocusLost(evt);
            }
        });
        jScrollPane17.setViewportView(txtEspecificacao2);

        jPanel2.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 590, 350, 30));

        txtRecursos3.setColumns(20);
        txtRecursos3.setRows(1);
        txtRecursos3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecursos3FocusLost(evt);
            }
        });
        jScrollPane18.setViewportView(txtRecursos3);

        jPanel2.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 350, 30));

        txtEspecificacao3.setColumns(20);
        txtEspecificacao3.setRows(1);
        txtEspecificacao3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEspecificacao3FocusLost(evt);
            }
        });
        jScrollPane19.setViewportView(txtEspecificacao3);

        jPanel2.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 350, 30));

        txtRecursos4.setColumns(20);
        txtRecursos4.setRows(1);
        txtRecursos4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRecursos4FocusLost(evt);
            }
        });
        jScrollPane20.setViewportView(txtRecursos4);

        jPanel2.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 350, 30));

        txtEspecificacao4.setColumns(20);
        txtEspecificacao4.setRows(1);
        txtEspecificacao4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEspecificacao4FocusLost(evt);
            }
        });
        jScrollPane21.setViewportView(txtEspecificacao4);

        jPanel2.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 650, 350, 30));

        chkPlanejamentoPendente.setText("Pendente / com Problemas");
        chkPlanejamentoPendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoPendenteActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoPendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 530, -1, 30));

        chkPlanejamentoOk.setText("OK");
        chkPlanejamentoOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoOkActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, -1, 30));

        chkPlanejamentoPendente1.setText("Pendente / com Problemas");
        chkPlanejamentoPendente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoPendente1ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoPendente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 560, -1, 30));

        chkPlanejamentoOk1.setText("OK");
        chkPlanejamentoOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoOk1ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, -1, 30));

        chkPlanejamentoPendente2.setText("Pendente / com Problemas");
        chkPlanejamentoPendente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoPendente2ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoPendente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, -1, 30));

        chkPlanejamentoOk2.setText("OK");
        chkPlanejamentoOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoOk2ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 590, -1, 30));

        chkPlanejamentoPendente3.setText("Pendente / com Problemas");
        chkPlanejamentoPendente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoPendente3ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoPendente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 620, -1, 30));

        chkPlanejamentoOk3.setText("OK");
        chkPlanejamentoOk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoOk3ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, -1, 30));

        chkPlanejamentoPendente4.setText("Pendente / com Problemas");
        chkPlanejamentoPendente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoPendente4ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoPendente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 650, -1, 30));

        chkPlanejamentoOk4.setText("OK");
        chkPlanejamentoOk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPlanejamentoOk4ActionPerformed(evt);
            }
        });
        jPanel2.add(chkPlanejamentoOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, -1, 30));

        lblControle.setBackground(new java.awt.Color(22, 54, 92));
        lblControle.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblControle.setForeground(new java.awt.Color(255, 255, 255));
        lblControle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControle.setText("<html><center>Controle de Alterações da Iniciativa</center></html>");
        lblControle.setOpaque(true);
        jPanel2.add(lblControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 965, 40));

        lblDe.setBackground(new java.awt.Color(22, 54, 92));
        lblDe.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDe.setForeground(new java.awt.Color(255, 255, 255));
        lblDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDe.setText("De");
        lblDe.setToolTipText("");
        lblDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDe.setOpaque(true);
        jPanel2.add(lblDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 350, 40));

        lblPara.setBackground(new java.awt.Color(22, 54, 92));
        lblPara.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPara.setForeground(new java.awt.Color(255, 255, 255));
        lblPara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPara.setText("Para");
        lblPara.setToolTipText("");
        lblPara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPara.setOpaque(true);
        jPanel2.add(lblPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 730, 350, 40));

        lblAprovacao.setBackground(new java.awt.Color(22, 54, 92));
        lblAprovacao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblAprovacao.setForeground(new java.awt.Color(255, 255, 255));
        lblAprovacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAprovacao.setText("Aprovação");
        lblAprovacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAprovacao.setOpaque(true);
        jPanel2.add(lblAprovacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 730, 260, 40));

        txtDe.setColumns(20);
        txtDe.setRows(1);
        txtDe.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDeFocusLost(evt);
            }
        });
        jScrollPane22.setViewportView(txtDe);

        jPanel2.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 350, 30));

        txtPara.setColumns(20);
        txtPara.setRows(1);
        txtPara.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtParaFocusLost(evt);
            }
        });
        jScrollPane23.setViewportView(txtPara);

        jPanel2.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 770, 350, 30));

        chkControlePendente.setText("Pendente");
        chkControlePendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlePendenteActionPerformed(evt);
            }
        });
        jPanel2.add(chkControlePendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 770, -1, 30));

        chkControleOk.setText("Aprovado");
        chkControleOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControleOkActionPerformed(evt);
            }
        });
        jPanel2.add(chkControleOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 770, -1, 30));

        txtDe1.setColumns(20);
        txtDe1.setRows(1);
        txtDe1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDe1FocusLost(evt);
            }
        });
        jScrollPane24.setViewportView(txtDe1);

        jPanel2.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 350, 30));

        txtPara1.setColumns(20);
        txtPara1.setRows(1);
        txtPara1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPara1FocusLost(evt);
            }
        });
        jScrollPane25.setViewportView(txtPara1);

        jPanel2.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 800, 350, 30));

        chkControlePendente1.setText("Pendente");
        chkControlePendente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlePendente1ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControlePendente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 800, -1, 30));

        chkControleOk1.setText("Aprovado");
        chkControleOk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControleOk1ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControleOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 800, -1, 30));

        txtDe2.setColumns(20);
        txtDe2.setRows(1);
        txtDe2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDe2FocusLost(evt);
            }
        });
        jScrollPane26.setViewportView(txtDe2);

        jPanel2.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 830, 350, 30));

        txtPara2.setColumns(20);
        txtPara2.setRows(1);
        txtPara2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPara2FocusLost(evt);
            }
        });
        jScrollPane27.setViewportView(txtPara2);

        jPanel2.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 830, 350, 30));

        chkControlePendente2.setText("Pendente");
        chkControlePendente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlePendente2ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControlePendente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 830, -1, 30));

        chkControleOk2.setText("Aprovado");
        chkControleOk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControleOk2ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControleOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 830, -1, 30));

        txtDe3.setColumns(20);
        txtDe3.setRows(1);
        txtDe3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDe3FocusLost(evt);
            }
        });
        jScrollPane28.setViewportView(txtDe3);

        jPanel2.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 350, 30));

        txtPara3.setColumns(20);
        txtPara3.setRows(1);
        txtPara3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPara3FocusLost(evt);
            }
        });
        jScrollPane29.setViewportView(txtPara3);

        jPanel2.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 860, 350, 30));

        chkControlePendente3.setText("Pendente");
        chkControlePendente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlePendente3ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControlePendente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 860, -1, 30));

        chkControleOk3.setText("Aprovado");
        chkControleOk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControleOk3ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControleOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 860, -1, 30));

        txtDe4.setColumns(20);
        txtDe4.setRows(1);
        txtDe4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDe4FocusLost(evt);
            }
        });
        jScrollPane30.setViewportView(txtDe4);

        jPanel2.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 890, 350, 30));

        txtPara4.setColumns(20);
        txtPara4.setRows(1);
        txtPara4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPara4FocusLost(evt);
            }
        });
        jScrollPane31.setViewportView(txtPara4);

        jPanel2.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 890, 350, 30));

        chkControlePendente4.setText("Pendente");
        chkControlePendente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControlePendente4ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControlePendente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 890, -1, 30));

        chkControleOk4.setText("Aprovado");
        chkControleOk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkControleOk4ActionPerformed(evt);
            }
        });
        jPanel2.add(chkControleOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 890, -1, 30));

        txtDefinicoesGerais.addTab("Gerenciamento da Iniciativa", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCronoIniciativa.setBackground(new java.awt.Color(15, 36, 62));
        lblCronoIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCronoIniciativa.setForeground(new java.awt.Color(255, 255, 255));
        lblCronoIniciativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronoIniciativa.setText("Cronograma da Iniciativa");
        lblCronoIniciativa.setOpaque(true);
        jPanel3.add(lblCronoIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 965, 40));

        lblStatusCronograma.setBackground(new java.awt.Color(22, 54, 92));
        lblStatusCronograma.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblStatusCronograma.setForeground(new java.awt.Color(255, 255, 255));
        lblStatusCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma.setText("<html><center>Status do Cronograma</center></html>");
        lblStatusCronograma.setOpaque(true);
        jPanel3.add(lblStatusCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 150, 50));

        lblCronogramaDataTermino.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataTermino.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblCronogramaDataTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino.setText("<html><center>Data de Término Prevista</center></html>");
        lblCronogramaDataTermino.setToolTipText("");
        lblCronogramaDataTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino.setOpaque(true);
        jPanel3.add(lblCronogramaDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 200, 40));

        lblCronogramaDataAtualizacao.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblCronogramaDataAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataAtualizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao.setText("<html><center>Data de Atualização</center></html>");
        lblCronogramaDataAtualizacao.setToolTipText("");
        lblCronogramaDataAtualizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao.setOpaque(true);
        jPanel3.add(lblCronogramaDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 40));

        lblInicioReal.setBackground(new java.awt.Color(54, 96, 146));
        lblInicioReal.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblInicioReal.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioReal.setText("<html><center>Data de Ínicio Real</center></html>");
        lblInicioReal.setToolTipText("");
        lblInicioReal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblInicioReal.setOpaque(true);
        jPanel3.add(lblInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 150, 40));

        lblNTotalSemanas.setBackground(new java.awt.Color(54, 96, 146));
        lblNTotalSemanas.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblNTotalSemanas.setForeground(new java.awt.Color(255, 255, 255));
        lblNTotalSemanas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas.setText("<html><center>Nº Total de Semanas</center></html>");
        lblNTotalSemanas.setToolTipText("");
        lblNTotalSemanas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas.setOpaque(true);
        jPanel3.add(lblNTotalSemanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 40));

        lblNSemanasDecorridas.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasDecorridas.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblNSemanasDecorridas.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasDecorridas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas.setText("<html><center>Nº de Semanas Decorridas</center></html>");
        lblNSemanasDecorridas.setToolTipText("");
        lblNSemanasDecorridas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas.setOpaque(true);
        jPanel3.add(lblNSemanasDecorridas, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 150, 40));

        lblNTotalSemanas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNTotalSemanas1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNTotalSemanas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas1.setText("Sem Dados");
        lblNTotalSemanas1.setToolTipText("");
        lblNTotalSemanas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas1.setOpaque(true);
        jPanel3.add(lblNTotalSemanas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 40));

        lblNSemanasRestantes.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasRestantes.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblNSemanasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasRestantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes.setText("<html><center>Nº de Semanas Restantes</center></html>");
        lblNSemanasRestantes.setToolTipText("");
        lblNSemanasRestantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes.setOpaque(true);
        jPanel3.add(lblNSemanasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 200, 40));

        lblCronogramaDataAtualizacao1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataAtualizacao1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCronogramaDataAtualizacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao1.setText("Sem Dados");
        lblCronogramaDataAtualizacao1.setToolTipText("");
        lblCronogramaDataAtualizacao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao1.setOpaque(true);
        jPanel3.add(lblCronogramaDataAtualizacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 40));

        lblCronogramaDataTermino1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataTermino1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblCronogramaDataTermino1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino1.setText("Sem Dados");
        lblCronogramaDataTermino1.setToolTipText("");
        lblCronogramaDataTermino1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino1.setOpaque(true);
        jPanel3.add(lblCronogramaDataTermino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 200, 40));

        lblNSemanasDecorridas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasDecorridas1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNSemanasDecorridas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas1.setText("Sem Dados");
        lblNSemanasDecorridas1.setToolTipText("");
        lblNSemanasDecorridas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas1.setOpaque(true);
        jPanel3.add(lblNSemanasDecorridas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, 40));

        lblNSemanasRestantes1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasRestantes1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblNSemanasRestantes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes1.setText("Sem Dados");
        lblNSemanasRestantes1.setToolTipText("");
        lblNSemanasRestantes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes1.setOpaque(true);
        jPanel3.add(lblNSemanasRestantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 200, 40));

        txtInicioReal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtInicioReal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicioReal.setToolTipText("formato da data dd/mm/aaaa");
        txtInicioReal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInicioRealFocusLost(evt);
            }
        });
        jPanel3.add(txtInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 40));

        lblTempoDecorrido.setBackground(new java.awt.Color(54, 96, 146));
        lblTempoDecorrido.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblTempoDecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lblTempoDecorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido.setText("<html><center>Tempo Total Decorrido</center></html>");
        lblTempoDecorrido.setToolTipText("");
        lblTempoDecorrido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido.setOpaque(true);
        jPanel3.add(lblTempoDecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 150, 40));

        lblProgressoFisico.setBackground(new java.awt.Color(54, 96, 146));
        lblProgressoFisico.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblProgressoFisico.setForeground(new java.awt.Color(255, 255, 255));
        lblProgressoFisico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico.setText("<html><center>Progresso Físico da Iniciativa</center></html>");
        lblProgressoFisico.setToolTipText("");
        lblProgressoFisico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico.setOpaque(true);
        jPanel3.add(lblProgressoFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 150, 40));

        lblTempoDecorrido1.setBackground(new java.awt.Color(153, 204, 255));
        lblTempoDecorrido1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTempoDecorrido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido1.setText("0%");
        lblTempoDecorrido1.setToolTipText("");
        lblTempoDecorrido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido1.setOpaque(true);
        jPanel3.add(lblTempoDecorrido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 70, 40));

        lblProgressoFisico1.setBackground(new java.awt.Color(153, 204, 255));
        lblProgressoFisico1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblProgressoFisico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico1.setText("0%");
        lblProgressoFisico1.setToolTipText("");
        lblProgressoFisico1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico1.setOpaque(true);
        jPanel3.add(lblProgressoFisico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 70, 40));

        lblStatusCronograma1.setBackground(new java.awt.Color(153, 204, 255));
        lblStatusCronograma1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblStatusCronograma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma1.setToolTipText("");
        lblStatusCronograma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStatusCronograma1.setOpaque(true);
        jPanel3.add(lblStatusCronograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 70, 50));

        btnAdicionarAtividade.setText("Adicionar Atividade");
        btnAdicionarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAtividadeActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdicionarAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jLabel1.setBackground(new java.awt.Color(15, 36, 62));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cronograma");
        jLabel1.setOpaque(true);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 965, 20));

        lblItem.setBackground(new java.awt.Color(22, 54, 92));
        lblItem.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblItem.setForeground(new java.awt.Color(255, 255, 255));
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblItem.setText("Item");
        lblItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblItem.setOpaque(true);
        jPanel3.add(lblItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 40, 40));

        lblProgresso.setBackground(new java.awt.Color(22, 54, 92));
        lblProgresso.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblProgresso.setForeground(new java.awt.Color(255, 255, 255));
        lblProgresso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgresso.setText("Progresso");
        lblProgresso.setToolTipText("");
        lblProgresso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblProgresso.setOpaque(true);
        jPanel3.add(lblProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 200, 40));

        lblAtividades.setBackground(new java.awt.Color(22, 54, 92));
        lblAtividades.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblAtividades.setForeground(new java.awt.Color(255, 255, 255));
        lblAtividades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAtividades.setText("Atividades");
        lblAtividades.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblAtividades.setOpaque(true);
        jPanel3.add(lblAtividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 300, 40));

        lblPeriodo.setBackground(new java.awt.Color(22, 54, 92));
        lblPeriodo.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPeriodo.setForeground(new java.awt.Color(255, 255, 255));
        lblPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPeriodo.setText("Período");
        lblPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblPeriodo.setOpaque(true);
        jPanel3.add(lblPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 330, 40));

        lblRealizado.setBackground(new java.awt.Color(22, 54, 92));
        lblRealizado.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblRealizado.setForeground(new java.awt.Color(255, 255, 255));
        lblRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRealizado.setText("Realizado %");
        lblRealizado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblRealizado.setOpaque(true);
        jPanel3.add(lblRealizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 90, 40));

        btnEditarAtividade.setText("Editar Atividade");
        btnEditarAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAtividadeActionPerformed(evt);
            }
        });
        jPanel3.add(btnEditarAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane32.setViewportView(jPanel4);

        jPanel3.add(jScrollPane32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 965, 580));

        txtDefinicoesGerais.addTab("Cronograma da Iniciativa", jPanel3);

        jScrollPane1.setViewportView(txtDefinicoesGerais);
        txtDefinicoesGerais.getAccessibleContext().setAccessibleDescription("");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 700, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAtividadeActionPerformed
        // TODO add your handling code here:
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        campo = "ATI_COD";
        
        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        Info.cronogramaIniciativa.cod = Info.objConexao.getIndCod(select, campo, Info.cronogramaIniciativa.cod);
        
        cronogramaIniciativa.setComboBoxs();
        cronogramaIniciativa.setBounds(440, 200, 450, 450);
        cronogramaIniciativa.setVisible(true);
         //setAtividades(numeroAtividade);
        //numeroAtividade ++;
    }//GEN-LAST:event_btnAdicionarAtividadeActionPerformed

    private void txtIniciativaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIniciativaFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";
        campo = "DEF_INI";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtIniciativa.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        campo = "DEF_NOM";
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtIniciativaFocusLost

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescricaoFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";
        campo = "DEF_DESOBJ";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu + ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDescricao.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtPatrocinadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPatrocinadorFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_PATINI";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPatrocinador.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPatrocinadorFocusLost

    private void txtLiderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtLiderFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_LIDINI";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtLider.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtLiderFocusLost

    private void txtEquipeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEquipeFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_EQPINI";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEquipe.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEquipeFocusLost

    private void txtEscopoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEscopoFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_ESC";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEscopo.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEscopoFocusLost

    private void txtProdutosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtProdutosFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_PROGER";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtProdutos.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtProdutosFocusLost

    private void txtIndicadoresFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIndicadoresFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_INDMET";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtIndicadores.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtIndicadoresFocusLost

    private void cbxDataInicioSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataInicioSemanaActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_INISEM";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataInicioSemana.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuIniSem = String.valueOf(cbxDataInicioSemana.getSelectedItem());
    }//GEN-LAST:event_cbxDataInicioSemanaActionPerformed

    private void cbxDataInicioMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataInicioMesActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_INIMES";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataInicioMes.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuIniMes = String.valueOf(cbxDataInicioMes.getSelectedItem());
    }//GEN-LAST:event_cbxDataInicioMesActionPerformed

    private void cbxDataInicioAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataInicioAnoActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_INIANO";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataInicioAno.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuIniAno = String.valueOf(cbxDataInicioAno.getSelectedItem());
    }//GEN-LAST:event_cbxDataInicioAnoActionPerformed

    private void cbxDataTerminoSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataTerminoSemanaActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_FIMSEM";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataTerminoSemana.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuFimSem = String.valueOf(cbxDataTerminoSemana.getSelectedItem());
    }//GEN-LAST:event_cbxDataTerminoSemanaActionPerformed

    private void cbxDataTerminoMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataTerminoMesActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_FIMMES";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataTerminoMes.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuFimMes = String.valueOf(cbxDataTerminoMes.getSelectedItem());
    }//GEN-LAST:event_cbxDataTerminoMesActionPerformed

    private void cbxDataTerminoAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataTerminoAnoActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_FIMANO";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxDataTerminoAno.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        atuFimAno = String.valueOf(cbxDataTerminoAno.getSelectedItem());
    }//GEN-LAST:event_cbxDataTerminoAnoActionPerformed

    @SuppressWarnings("unchecked")
    private void cbxPainelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPainelActionPerformed
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_PAI";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxPainel.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);

        if(cbxPainel.getSelectedItem().equals("Finanças")){
            cbxObjetivos.removeAllItems();
            cbxObjetivos.addItem("");
            for(int i = 0; i < 6; i++){
                cbxObjetivos.addItem(CockpitStrings.objetivosFinancas[i]);
            }
        }else if(cbxPainel.getSelectedItem().equals("Clientes")){
            cbxObjetivos.removeAllItems();
            cbxObjetivos.addItem("");
            for(int i = 0; i < 6; i++){
                cbxObjetivos.addItem(CockpitStrings.objetivosClientes[i]);
            }
        }else if(cbxPainel.getSelectedItem().equals("Processos")){
            cbxObjetivos.removeAllItems();
            cbxObjetivos.addItem("");
            for(int i = 0; i < 6; i++){
                cbxObjetivos.addItem(CockpitStrings.objetivosProcessos[i]);
            }
        }else if(cbxPainel.getSelectedItem().equals("Pessoas, Gestão & Tecnologia")){
            cbxObjetivos.removeAllItems();
            cbxObjetivos.addItem("");
            for(int i = 0; i < 6; i++){
                cbxObjetivos.addItem(CockpitStrings.objetivosPGT[i]);
            }
        }
    }//GEN-LAST:event_cbxPainelActionPerformed

    private void txtDataAtualizacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataAtualizacaoFocusLost
        // TODO add your handling code here:
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        campo = "GER_DATATU";
        strCodUsu = "GER_CODUSU";
        strNom = "GER_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDataAtualizacao.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        setDataAtualizacao();
        
    }//GEN-LAST:event_txtDataAtualizacaoFocusLost

    private void chkVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVerdeActionPerformed
        // TODO add your handling code here:
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        campo = "GER_SITREC";
        strCodUsu = "GER_CODUSU";
        strNom = "GER_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
        
        if(chkVerde.isSelected() != false){
            chkVermelho.setSelected(false);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Verde" + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        }else{
            chkVermelho.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Vermelho" + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_chkVerdeActionPerformed

    private void chkVermelhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkVermelhoActionPerformed
        // TODO add your handling code here:
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        campo = "GER_SITREC";
        strCodUsu = "GER_CODUSU";
        strNom = "GER_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
        
        if(chkVermelho.isSelected() != false){
            chkVerde.setSelected(false);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Vermelho" + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
            Info.objConexao.setBD(insert);
        }else{
            chkVerde.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Verde" + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_chkVermelhoActionPerformed

    private void txtPontoAtencaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPontoAtencaoFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PONATE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPontoAtencao.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPontoAtencaoFocusLost

    private void txtPontoAtencao1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPontoAtencao1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PONATE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPontoAtencao1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPontoAtencao1FocusLost

    private void txtPontoAtencao2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPontoAtencao2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PONATE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPontoAtencao2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPontoAtencao2FocusLost

    private void txtPontoAtencao3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPontoAtencao3FocusLost
        // TODO add your handling code here:tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PONATE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPontoAtencao3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPontoAtencao3FocusLost

    private void txtPontoAtencao4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPontoAtencao4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PONATE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPontoAtencao4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPontoAtencao4FocusLost

    private void txtAcoesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcoesFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ACOCOR";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcoes.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAcoesFocusLost

    private void txtAcoes1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcoes1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ACOCOR";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
        
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcoes1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAcoes1FocusLost

    private void txtAcoes2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcoes2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ACOCOR";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcoes2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAcoes2FocusLost

    private void txtAcoes3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcoes3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ACOCOR";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcoes3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAcoes3FocusLost

    private void txtAcoes4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAcoes4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ACOCOR";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcoes4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAcoes4FocusLost

    private void txtResponsavelFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResponsavelFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_RES";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtResponsavelFocusLost

    private void txtResponsavel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResponsavel1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_RES";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtResponsavel1FocusLost

    private void txtResponsavel2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResponsavel2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_RES";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtResponsavel2FocusLost

    private void txtResponsavel3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResponsavel3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_RES";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtResponsavel3FocusLost

    private void txtResponsavel4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtResponsavel4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_RES";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtResponsavel4FocusLost

    private void txtPrazoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrazoFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PRA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPrazo.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPrazoFocusLost

    private void txtPrazo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrazo1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PRA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPrazo1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPrazo1FocusLost

    private void txtPrazo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrazo2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PRA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPrazo2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPrazo2FocusLost

    private void txtPrazo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrazo3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PRA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPrazo3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPrazo3FocusLost

    private void txtPrazo4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPrazo4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PRA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPrazo4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPrazo4FocusLost

    private void chkOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOkActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_OK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkOkActionPerformed

    private void chkOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOk1ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_OK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk1.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkOk1ActionPerformed

    private void chkOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOk2ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_OK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk2.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkOk2ActionPerformed

    private void chkOk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOk3ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_OK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk3.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkOk3ActionPerformed

    private void chkOk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkOk4ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_OK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk4.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkOk4ActionPerformed

    private void txtRecursosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecursosFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_REC";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRecursos.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRecursosFocusLost

    private void txtRecursos1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecursos1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_REC";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRecursos1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRecursos1FocusLost

    private void txtRecursos2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecursos2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_REC";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRecursos2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRecursos2FocusLost

    private void txtRecursos3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecursos3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_REC";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRecursos3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRecursos3FocusLost

    private void txtRecursos4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRecursos4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_REC";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRecursos4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRecursos4FocusLost

    private void txtEspecificacaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEspecificacaoFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ESP";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEspecificacao.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEspecificacaoFocusLost

    private void txtEspecificacao1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEspecificacao1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ESP";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEspecificacao1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEspecificacao1FocusLost

    private void txtEspecificacao2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEspecificacao2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ESP";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEspecificacao2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEspecificacao2FocusLost

    private void txtEspecificacao3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEspecificacao3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ESP";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEspecificacao3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEspecificacao3FocusLost

    private void txtEspecificacao4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEspecificacao4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_ESP";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtEspecificacao4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtEspecificacao4FocusLost

    private void chkPlanejamentoPendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoPendenteActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoPendente.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoPendenteActionPerformed

    private void chkPlanejamentoPendente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoPendente1ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoPendente1.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoPendente1ActionPerformed

    private void chkPlanejamentoPendente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoPendente2ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoPendente2.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoPendente2ActionPerformed

    private void chkPlanejamentoPendente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoPendente3ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoPendente3.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoPendente3ActionPerformed

    private void chkPlanejamentoPendente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoPendente4ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoPendente4.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoPendente4ActionPerformed

    private void chkPlanejamentoOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoOkActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITOK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoOk.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoOkActionPerformed

    private void chkPlanejamentoOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoOk1ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITOK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoOk1.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoOk1ActionPerformed

    private void chkPlanejamentoOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoOk2ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITOK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoOk2.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoOk2ActionPerformed

    private void chkPlanejamentoOk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoOk3ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITOK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoOk3.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoOk3ActionPerformed

    private void chkPlanejamentoOk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPlanejamentoOk4ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_SITOK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkPlanejamentoOk4.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkPlanejamentoOk4ActionPerformed

    private void txtDeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDeFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_DE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDe.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDeFocusLost

    private void txtDe1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDe1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_DE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDe1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDe1FocusLost

    private void txtDe2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDe2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_DE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDe2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDe2FocusLost

    private void txtDe3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDe3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_DE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDe3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDe3FocusLost

    private void txtDe4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDe4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_DE";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDe4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDe4FocusLost

    private void txtParaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtParaFocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PARA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPara.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtParaFocusLost

    private void txtPara1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPara1FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PARA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPara1.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPara1FocusLost

    private void txtPara2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPara2FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PARA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPara2.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPara2FocusLost

    private void txtPara3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPara3FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PARA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPara3.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPara3FocusLost

    private void txtPara4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPara4FocusLost
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_PARA";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPara4.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPara4FocusLost

    private void chkControlePendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlePendenteActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APRPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControlePendente.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControlePendenteActionPerformed

    private void chkControlePendente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlePendente1ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APRPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControlePendente1.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControlePendente1ActionPerformed

    private void chkControlePendente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlePendente2ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APRPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControlePendente2.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControlePendente2ActionPerformed

    private void chkControlePendente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlePendente3ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APRPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControlePendente3.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControlePendente3ActionPerformed

    private void chkControlePendente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControlePendente4ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APRPEN";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControlePendente4.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControlePendente4ActionPerformed

    private void chkControleOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControleOkActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APROK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControleOk.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControleOkActionPerformed

    private void chkControleOk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControleOk1ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APROK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 2;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControleOk1.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControleOk1ActionPerformed

    private void chkControleOk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControleOk2ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APROK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 3;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControleOk2.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControleOk2ActionPerformed

    private void chkControleOk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControleOk3ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APROK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 4;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControleOk3.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControleOk3ActionPerformed

    private void chkControleOk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkControleOk4ActionPerformed
        // TODO add your handling code here:
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        campo = "ACO_APROK";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 5;
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ", " + strCodUsu + ") values (" + iniCod + ", " + cod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkControleOk4.isSelected() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + cod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkControleOk4ActionPerformed

    private void txtInicioRealFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInicioRealFocusLost
        // TODO add your handling code here:
        tabela = "IN_CRONOGRAMA";
        strCodIni = "CRO_INICOD";
        campo = "CRO_INIREA";
        strCodUsu = "CRO_CODUSU";
        strNom = "CRO_NOMUSU";
        
        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtInicioReal.getText() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        insert = "UPDATE " + tabela + " SET " + strNom + " = '" + Info.nomeUsuario + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
        
        setDataAtualizacao();
    }//GEN-LAST:event_txtInicioRealFocusLost

    private void btnEditarAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAtividadeActionPerformed
        // TODO add your handling code here:
        Editar editar = new Editar();

        editar.setTitle("Editar Atividades");
        editar.setTexto("Escolha a Atividade:");
        
        cod = 0;
        
        String descricao;
        
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";
        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        cod = Info.objConexao.getIndCod(select, strCodIni, cod);
        
        String[] combo = new String[cod];
        
        campo = "ATI_NOM";
        for(int i = 1; i < (cod); i++){
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            descricao = Info.objConexao.getBD(select, campo);

            combo[i] = i + " = " + descricao;

            editar.setCbxIndicadores(combo[i] = i + " = " + descricao);

        }
        
        editar.setNomeEditar("Editar Atividades");
        
        editar.setBounds(550, 400, 630, 160);
        editar.setVisible(true);
    }//GEN-LAST:event_btnEditarAtividadeActionPerformed

    private void cbxObjetivosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbxObjetivosFocusLost
        // TODO add your handling code here:
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        campo = "DEF_OBJ";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codUsu;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCodUsu+ ") values (" + iniCod + ", " + codUsu + ")";
            Info.objConexao.setBD(insert);
        }
 
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxObjetivos.getSelectedItem() + "' WHERE " + strCodIni + " = " + iniCod + " AND " + strCodUsu + " = " + codUsu;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxObjetivosFocusLost
    
    @SuppressWarnings("unchecked")
    private void setComboBoxs(){
        Info.data = Info.cal.get(Calendar.YEAR);
        int data = Info.data + 10;
        String strData;
        
        for(int i = Info.data; i <= data; i++){
            strData = String.valueOf(i);
            cbxDataInicioAno.addItem(strData);
            cbxDataTerminoAno.addItem(strData);
        }
    }
    
    private void setSituacaoStatus(){
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        campo = "GER_SITREC";
        
        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);
        
        String verificar;

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ") values (" + iniCod + ")";
            Info.objConexao.setBD(insert);
        }
        
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        verificar = Info.objConexao.getBD(select, campo);

        if(verificar == null || verificar.equals("Verde")){
            chkVerde.setSelected(true);
            chkVermelho.setSelected(false);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Verde" + "' WHERE " + strCodIni + " = " + iniCod;
            Info.objConexao.setBD(insert);
        }else{
            chkVermelho.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
            
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + "Vermelho" + "' WHERE " + strCodIni + " = " + iniCod;
            Info.objConexao.setBD(insert);
        }
    }
    
    public void setIniciativaCod(){
        tabela = "IN_DEF_GERAIS";
        campo = "DEF_INICOD";
        
        select = "SELECT * FROM " + tabela;
        iniCod = Info.objConexao.getIndCod(select, campo, iniCod);
        
    }
    
    public void setCodUsuario(){
        tabela = "IN_DEF_GERAIS";
        campo = "DEF_CODUSU";
        
        select = "SELECT * FROM " + tabela + " WHERE DEF_NOMUSU = '" + Info.nomeUsuario + "'";
        codUsu = Info.objConexao.getIndCod(select, campo, codUsu);
    }
    
    public void setJPanel4(Component campoGrafico, int x, int y, int width, int  height){
        jPanel4.add(campoGrafico, new org.netbeans.lib.awtextra.AbsoluteConstraints(x, y, width, height));
    }
    
    public void removeJPanel4(){
        jPanel4.removeAll();
    }

    public void setEditarIniciativa(int codIniciativa){
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";
        
        select = "SELECT " + strCodIni + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa;
        iniCod = Info.objConexao.getSelect(select, strCodIni, iniCod);
        
        codUsu = codIniciativa;
        
        campo = "DEF_INI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtIniciativa.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_DESOBJ";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtDescricao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PATINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtPatrocinador.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_LIDINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtLider.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_EQPINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtEquipe.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_ESC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtEscopo.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PROGER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtProdutos.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INDMET";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtIndicadores.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INISEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioSemana.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INIMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioMes.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INIANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioAno.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMSEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoSemana.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoMes.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoAno.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PAI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxPainel.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_OBJ";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxObjetivos.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        
        //////////////////////////////////////////GERENCIAMENTO DAS INICIATIVAS
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        strCodUsu = "GER_CODUSU";
        strNom = "GER_NOMUSU";
        
        campo = "GER_DATATU";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtDataAtualizacao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "GER_SITCRO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        String sitCro = Info.objConexao.getBD(select, campo);

        campo = "GER_SITREC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        String sitRec = Info.objConexao.getBD(select, campo);
        
        if(sitRec == null || sitRec.equals("Verde")){
            chkVerde.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
        }else if(sitRec.equals("Vermelho")){
            chkVerde.setSelected(false);
            chkVermelho.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
        }
        
        //////////////////////////////////////////GERENCIAMENTO DAS INICIATIVAS / ACOES
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 2;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 3;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 4;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 5;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strNom + " = '" + Info.nomeUsuario + "' AND " + strCodUsu + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        //////////////////////////////////////////CRONOGRAMA da INICIATICA
        tabela = "IN_CRONOGRAMA";
        strCodIni = "CRO_INICOD";
        strCodUsu = "CRO_CODUSU";
        strNom = "CRO_NOMUSU";
        
        campo = "CRO_INIREA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtInicioReal.setText(Info.objConexao.getBD(select, campo));
        
        //////////////////////////////////////////CRONOGRAMA da INICIATICA / ATIVIDADES
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";
        strCodUsu = "ATI_CODUSU";
        strNom = "ATI_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        cod = Info.objConexao.getIndCod(select, strCod, cod);
        
        
        for(int i = 1 ; i < cod; i++){
            campo = "ATI_NOM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strNomAti = Info.objConexao.getBD(select, campo);

            campo = "ATI_REA";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strRea = Info.objConexao.getBD(select, campo);
            
            campo = "ATI_INISEM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniSem = Info.objConexao.getBD(select, campo);
            campo = "ATI_INIMES";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniMes = Info.objConexao.getBD(select, campo);
            campo = "ATI_INIANO";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniAno = Info.objConexao.getBD(select, campo);
            String strIniPeriodo = ("de: " + strIniSem + "/" + strIniMes + "/" + strIniAno);

            campo = "ATI_FIMSEM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimSem = Info.objConexao.getBD(select, campo);
            campo = "ATI_FIMMES";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimMes = Info.objConexao.getBD(select, campo);
            campo = "ATI_FIMANO";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimAno = Info.objConexao.getBD(select, campo);
            String strFimPeriodo = ("a: " + strFimSem + "/" + strFimMes + "/" + strFimAno);

            Info.cronogramaIniciativa.setCamposAtvidade(i, String.valueOf(i), strNomAti, strRea, strIniPeriodo, strFimPeriodo);
        }
    }
    
    public void setConsultarIniciativa(int codIniciativa){
        tabela = "IN_DEF_GERAIS";
        strCodIni = "DEF_INICOD";
        strCodUsu = "DEF_CODUSU";
        strNom = "DEF_NOMUSU";
        
        select = "SELECT " + strCodIni + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        iniCod = Info.objConexao.getSelect(select, strCodIni, iniCod);
        
        codUsu = codIniciativa;
        
        campo = "DEF_INI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtIniciativa.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_DESOBJ";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtDescricao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PATINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtPatrocinador.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_LIDINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtLider.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_EQPINI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtEquipe.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_ESC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtEscopo.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PROGER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtProdutos.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INDMET";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtIndicadores.setText(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INISEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioSemana.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INIMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioMes.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_INIANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataInicioAno.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMSEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoSemana.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoMes.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_FIMANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxDataTerminoAno.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_PAI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxPainel.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        campo = "DEF_OBJ";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        cbxObjetivos.setSelectedItem(Info.objConexao.getBD(select, campo));
        
        
        //////////////////////////////////////////GERENCIAMENTO DAS INICIATIVAS
        tabela = "IN_GEREN_INICIATIVAS";
        strCodIni = "GER_INICOD";
        strCodUsu = "GER_CODUSU";
        strNom = "GER_NOMUSU";
        
        campo = "GER_DATATU";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtDataAtualizacao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "GER_SITCRO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        String sitCro = Info.objConexao.getBD(select, campo);

        campo = "GER_SITREC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        String sitRec = Info.objConexao.getBD(select, campo);
        
        if(sitRec == null || sitRec.equals("Verde")){
            chkVerde.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
        }else if(sitRec.equals("Vermelho")){
            chkVerde.setSelected(false);
            chkVermelho.setSelected(true);
            lblSituacaoRecursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
        }
        
        //////////////////////////////////////////GERENCIAMENTO DAS INICIATIVAS / ACOES
        tabela = "IN_ACOES_GER_INICIATIVAS";
        strCodIni = "ACO_INICOD";
        strCod = "ACO_COD";
        strCodUsu = "ACO_CODUSU";
        strNom = "ACO_NOMUSU";
        
        cod = 1;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 2;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara1.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk1.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 3;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara2.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk2.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 4;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara3.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk3.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        cod = 5;
        
        campo = "ACO_PONATE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPontoAtencao4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ACOCOR";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtAcoes4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtResponsavel4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPrazo4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_REC";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtRecursos4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_ESP";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtEspecificacao4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_SITPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoPendente4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_SITOK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkPlanejamentoOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_DE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtDe4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_PARA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        txtPara4.setText(Info.objConexao.getBD(select, campo));
        
        campo = "ACO_APRPEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControlePendente4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        campo = "ACO_APROK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa + " AND " + strCod + " = " + cod;
        chkControleOk4.setSelected(Boolean.parseBoolean(Info.objConexao.getBD(select, campo)));
        
        //////////////////////////////////////////CRONOGRAMA da INICIATICA
        tabela = "IN_CRONOGRAMA";
        strCodIni = "CRO_INICOD";
        strCodUsu = "CRO_CODUSU";
        strNom = "CRO_NOMUSU";
        
        campo = "CRO_INIREA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + codIniciativa;
        txtInicioReal.setText(Info.objConexao.getBD(select, campo));
        
        //////////////////////////////////////////CRONOGRAMA da INICIATICA / ATIVIDADES
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";
        strCodUsu = "ATI_CODUSU";
        strNom = "ATI_NOMUSU";

        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod;
        cod = Info.objConexao.getIndCod(select, strCod, cod);
        
        
        for(int i = 1 ; i < cod; i++){
            campo = "ATI_NOM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strNomAti = Info.objConexao.getBD(select, campo);

            campo = "ATI_REA";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strRea = Info.objConexao.getBD(select, campo);
            
            campo = "ATI_INISEM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniSem = Info.objConexao.getBD(select, campo);
            campo = "ATI_INIMES";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniMes = Info.objConexao.getBD(select, campo);
            campo = "ATI_INIANO";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strIniAno = Info.objConexao.getBD(select, campo);
            String strIniPeriodo = ("de: " + strIniSem + "/" + strIniMes + "/" + strIniAno);

            campo = "ATI_FIMSEM";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimSem = Info.objConexao.getBD(select, campo);
            campo = "ATI_FIMMES";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimMes = Info.objConexao.getBD(select, campo);
            campo = "ATI_FIMANO";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + iniCod + " AND " + strCod + " = " + i;
            String strFimAno = Info.objConexao.getBD(select, campo);
            String strFimPeriodo = ("a: " + strFimSem + "/" + strFimMes + "/" + strFimAno);

            Info.cronogramaIniciativa.setCamposAtvidade(i, String.valueOf(i), strNomAti, strRea, strIniPeriodo, strFimPeriodo);
        }
    }
    
    public void consultarIniciativa(){
        txtIniciativa.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtPatrocinador.setEnabled(false);
        txtLider.setEnabled(false);
        txtEquipe.setEnabled(false);
        txtEscopo.setEnabled(false);
        txtProdutos.setEnabled(false);
        txtIndicadores.setEnabled(false);
        cbxDataInicioSemana.setEnabled(false);
        cbxDataInicioMes.setEnabled(false);
        cbxDataInicioAno.setEnabled(false);
        cbxDataTerminoSemana.setEnabled(false);
        cbxDataTerminoMes.setEnabled(false);
        cbxDataTerminoAno.setEnabled(false);
        cbxPainel.setEnabled(false);
        cbxObjetivos.setEnabled(false);
        
        txtDataAtualizacao.setEnabled(false);
        chkVerde.setEnabled(false);
        chkVermelho.setEnabled(false);
        
        txtPontoAtencao.setEnabled(false);
        txtPontoAtencao1.setEnabled(false);
        txtPontoAtencao2.setEnabled(false);
        txtPontoAtencao3.setEnabled(false);
        txtPontoAtencao4.setEnabled(false);
        txtAcoes.setEnabled(false);
        txtAcoes1.setEnabled(false);
        txtAcoes2.setEnabled(false);
        txtAcoes3.setEnabled(false);
        txtAcoes4.setEnabled(false);
        txtResponsavel.setEnabled(false);
        txtResponsavel1.setEnabled(false);
        txtResponsavel2.setEnabled(false);
        txtResponsavel3.setEnabled(false);
        txtResponsavel4.setEnabled(false);
        txtPrazo.setEnabled(false);
        txtPrazo1.setEnabled(false);
        txtPrazo2.setEnabled(false);
        txtPrazo3.setEnabled(false);
        txtPrazo4.setEnabled(false);
        chkOk.setEnabled(false);
        chkOk1.setEnabled(false);
        chkOk2.setEnabled(false);
        chkOk3.setEnabled(false);
        chkOk4.setEnabled(false);
        txtRecursos.setEnabled(false);
        txtRecursos1.setEnabled(false);
        txtRecursos2.setEnabled(false);
        txtRecursos3.setEnabled(false);
        txtRecursos4.setEnabled(false);
        txtEspecificacao.setEnabled(false);
        txtEspecificacao1.setEnabled(false);
        txtEspecificacao2.setEnabled(false);
        txtEspecificacao3.setEnabled(false);
        txtEspecificacao4.setEnabled(false);
        chkPlanejamentoPendente.setEnabled(false);
        chkPlanejamentoPendente1.setEnabled(false);
        chkPlanejamentoPendente2.setEnabled(false);
        chkPlanejamentoPendente3.setEnabled(false);
        chkPlanejamentoPendente4.setEnabled(false);
        chkPlanejamentoOk.setEnabled(false);
        chkPlanejamentoOk1.setEnabled(false);
        chkPlanejamentoOk2.setEnabled(false);
        chkPlanejamentoOk3.setEnabled(false);
        chkPlanejamentoOk4.setEnabled(false);
        txtDe.setEnabled(false);
        txtDe1.setEnabled(false);
        txtDe2.setEnabled(false);
        txtDe3.setEnabled(false);
        txtDe4.setEnabled(false);
        txtPara.setEnabled(false);
        txtPara1.setEnabled(false);
        txtPara2.setEnabled(false);
        txtPara3.setEnabled(false);
        txtPara4.setEnabled(false);
        chkControlePendente.setEnabled(false);
        chkControlePendente1.setEnabled(false);
        chkControlePendente2.setEnabled(false);
        chkControlePendente3.setEnabled(false);
        chkControlePendente4.setEnabled(false);
        chkControleOk.setEnabled(false);
        chkControleOk1.setEnabled(false);
        chkControleOk2.setEnabled(false);
        chkControleOk3.setEnabled(false);
        chkControleOk4.setEnabled(false);
        
        txtInicioReal.setEnabled(false);
        btnAdicionarAtividade.setEnabled(false);
        btnEditarAtividade.setEnabled(false);
    }
    
    public void setDataAtualizacao(){
        if(!txtDataAtualizacao.getText().equals("")){
            
            String strDiaAtual = txtDataAtualizacao.getText().substring(0, 2);
            String strMesAtual = txtDataAtualizacao.getText().substring(3, 5);
            String strAnoAtual = txtDataAtualizacao.getText().substring(6, 10);

            int semAtual = Integer.parseInt(strDiaAtual);
            int mesAtual = Integer.parseInt(strMesAtual);
            int anoAtual = Integer.parseInt(strAnoAtual);

            int semReal = 0, mesReal = 0, anoReal = 0;
            
            if(!txtInicioReal.getText().equals("")){
                String strDiaReal = txtInicioReal.getText().substring(0, 2);
                String strMesReal = txtInicioReal.getText().substring(3, 5);
                String strAnoReal = txtInicioReal.getText().substring(6, 10);
                
                semReal = Integer.parseInt(strDiaReal);
                mesReal = Integer.parseInt(strMesReal);
                anoReal = Integer.parseInt(strAnoReal);
            }

            int fimAno = 0, fimMes = 0, fimSem = 0;

            if(atuFimSem.equals("1º semana")){
                fimSem = 1 * 7;
            }else if(atuFimSem.equals("2º semana")){
                fimSem = 2 * 7;
            }else if(atuFimSem.equals("23º semana")){
                fimSem = 3 * 7;
            }else if(atuFimSem.equals("4º semana")){
                fimSem = 4 * 7;
            }

            if(atuFimMes.equals("Janeiro")){
                fimMes = 1;
            }else if(atuFimMes.equals("Fevereiro")){
                fimMes = 2;
            }else if(atuFimMes.equals("Março")){
                fimMes = 3;
            }else if(atuFimMes.equals("Abril")){
                fimMes = 4;
            }else if(atuFimMes.equals("Maio")){
                fimMes = 5;
            }else if(atuFimMes.equals("Junho")){
                fimMes = 6;
            }else if(atuFimMes.equals("Julho")){
                fimMes = 7;
            }else if(atuFimMes.equals("Agosto")){
                fimMes = 8;
            }else if(atuFimMes.equals("Setembro")){
                fimMes = 9;
            }else if(atuFimMes.equals("Outubro")){
                fimMes = 10;
            }else if(atuFimMes.equals("Novembro")){
                fimMes = 11;
            }else if(atuFimMes.equals("Dezembro")){
                fimMes = 12;
            }

            fimAno = Integer.parseInt(atuFimAno);

            int diasDeco = semAtual - semReal;
            int mesDeco = (mesAtual - mesReal) * 30;
            int anoDeco = (anoAtual - anoReal) * 365;
            
            int diasTotal = fimSem - semReal;
            int mesTotal = (fimMes - mesReal) * 30;
            int anoTotal = (fimAno - anoReal) * 365;

            numSemanas = (diasTotal + mesTotal + anoTotal) / 7;

            semanasDecorridas = (diasDeco + mesDeco + anoDeco) / 7;
            
            semanasRestantes = numSemanas - semanasDecorridas;
            
            String strSemanasRestantes = String.valueOf(semanasRestantes);

            lblContagemDias.setText("Faltam " + strSemanasRestantes.replace(".0", "") + " semanas para o término da Iniciativa");

            lblCronogramaDataAtualizacao1.setText(txtDataAtualizacao.getText());

            lblCronogramaDataTermino1.setText(atuFimSem + "/" + atuFimMes + "/" + atuFimAno);

            lblNTotalSemanas1.setText(String.valueOf(numSemanas).replace(".0", ""));

            lblNSemanasDecorridas1.setText(String.valueOf(semanasDecorridas).replace(".0", ""));

            lblNSemanasRestantes1.setText(String.valueOf(semanasRestantes).replace(".0", ""));
            
            float totalDecorrido, progressoIniciativa = 0;
            
            Info.percentual.setMaximumFractionDigits(2);

            totalDecorrido = semanasDecorridas / numSemanas;
            String strTotalDecorrido = String.valueOf(totalDecorrido);
            lblTempoDecorrido1.setText(Info.percentual.format(Float.parseFloat(strTotalDecorrido)));

            tabela = "IN_CRONO_ATIVIDADES";
            strCodIni = "ATI_INICOD";
            strCod = "ATI_COD";
            float ver;
            select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
            ver = Info.objConexao.getIndCod(select, strCodIni, aux);
            
            campo = "ATI_REA";
            for(int i = 1; i < ver; i++){
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + i;
                progressoIniciativa += Float.parseFloat(Info.objConexao.getBD(select, campo));
            }
            
            ver--;
            progressoIniciativa = (progressoIniciativa / ver) / 100;
            String strProgressoIniciativa = String.valueOf(progressoIniciativa);
            
            lblProgressoFisico1.setText(Info.percentual.format(Float.parseFloat(strProgressoIniciativa)));
            
            if(progressoIniciativa < totalDecorrido){
                setLblStatusCronograma("Vermelho");
            }else{
                setLblStatusCronograma("Verde");
            }
        }
    }
    
    public void setLblStatusCronograma(String cor){
        if(cor.equals("Verde")){
            lblStatusCronograma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
        }else if(cor.equals("Vermelho")){
            lblStatusCronograma1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
        }
    }
    /*
    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Iniciativas().setVisible(true);
            }

        });
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAtividade;
    private javax.swing.JButton btnEditarAtividade;
    private javax.swing.JComboBox cbxDataInicioAno;
    private javax.swing.JComboBox cbxDataInicioMes;
    private javax.swing.JComboBox cbxDataInicioSemana;
    private javax.swing.JComboBox cbxDataTerminoAno;
    private javax.swing.JComboBox cbxDataTerminoMes;
    private javax.swing.JComboBox cbxDataTerminoSemana;
    private javax.swing.JComboBox cbxObjetivos;
    private javax.swing.JComboBox cbxPainel;
    private javax.swing.JRadioButton chkControleOk;
    private javax.swing.JRadioButton chkControleOk1;
    private javax.swing.JRadioButton chkControleOk2;
    private javax.swing.JRadioButton chkControleOk3;
    private javax.swing.JRadioButton chkControleOk4;
    private javax.swing.JRadioButton chkControlePendente;
    private javax.swing.JRadioButton chkControlePendente1;
    private javax.swing.JRadioButton chkControlePendente2;
    private javax.swing.JRadioButton chkControlePendente3;
    private javax.swing.JRadioButton chkControlePendente4;
    private javax.swing.JCheckBox chkOk;
    private javax.swing.JCheckBox chkOk1;
    private javax.swing.JCheckBox chkOk2;
    private javax.swing.JCheckBox chkOk3;
    private javax.swing.JCheckBox chkOk4;
    private javax.swing.JRadioButton chkPlanejamentoOk;
    private javax.swing.JRadioButton chkPlanejamentoOk1;
    private javax.swing.JRadioButton chkPlanejamentoOk2;
    private javax.swing.JRadioButton chkPlanejamentoOk3;
    private javax.swing.JRadioButton chkPlanejamentoOk4;
    private javax.swing.JRadioButton chkPlanejamentoPendente;
    private javax.swing.JRadioButton chkPlanejamentoPendente1;
    private javax.swing.JRadioButton chkPlanejamentoPendente2;
    private javax.swing.JRadioButton chkPlanejamentoPendente3;
    private javax.swing.JRadioButton chkPlanejamentoPendente4;
    private javax.swing.JRadioButton chkVerde;
    private javax.swing.JRadioButton chkVermelho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblAcoes;
    private javax.swing.JLabel lblAprovacao;
    private javax.swing.JLabel lblAtividades;
    private javax.swing.JLabel lblContagemDias;
    private javax.swing.JLabel lblControle;
    private javax.swing.JLabel lblCronoIniciativa;
    private javax.swing.JLabel lblCronograma;
    private javax.swing.JLabel lblCronogramaDataAtualizacao;
    private javax.swing.JLabel lblCronogramaDataAtualizacao1;
    private javax.swing.JLabel lblCronogramaDataTermino;
    private javax.swing.JLabel lblCronogramaDataTermino1;
    private javax.swing.JLabel lblDataAtualizacao;
    private javax.swing.JLabel lblDataInicio;
    private javax.swing.JLabel lblDataTermino;
    private javax.swing.JLabel lblDe;
    private javax.swing.JLabel lblDefinicoes;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEquipe;
    private javax.swing.JLabel lblEscopo;
    private javax.swing.JLabel lblEspecificacao;
    private javax.swing.JLabel lblGerenciamento;
    private javax.swing.JLabel lblIndicadores;
    private javax.swing.JLabel lblIniciativa;
    private javax.swing.JLabel lblInicioReal;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblLider;
    private javax.swing.JLabel lblNSemanasDecorridas;
    private javax.swing.JLabel lblNSemanasDecorridas1;
    private javax.swing.JLabel lblNSemanasRestantes;
    private javax.swing.JLabel lblNSemanasRestantes1;
    private javax.swing.JLabel lblNTotalSemanas;
    private javax.swing.JLabel lblNTotalSemanas1;
    private javax.swing.JLabel lblObjetivo;
    private javax.swing.JLabel lblOk;
    private javax.swing.JLabel lblPainel;
    private javax.swing.JLabel lblPara;
    private javax.swing.JLabel lblPatrocinador;
    private javax.swing.JLabel lblPeriodo;
    private javax.swing.JLabel lblPlanejamento;
    private javax.swing.JLabel lblPontoAtencao;
    private javax.swing.JLabel lblPrazo;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblProgresso;
    private javax.swing.JLabel lblProgressoFisico;
    private javax.swing.JLabel lblProgressoFisico1;
    private javax.swing.JLabel lblRealizado;
    private javax.swing.JLabel lblRecursos;
    private javax.swing.JLabel lblRecursos1;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblSituacao;
    private javax.swing.JLabel lblSituacao1;
    private javax.swing.JLabel lblSituacaoCronograma;
    private javax.swing.JLabel lblSituacaoRecursos;
    private javax.swing.JLabel lblStatusCronograma;
    private javax.swing.JLabel lblStatusCronograma1;
    private javax.swing.JLabel lblTempoDecorrido;
    private javax.swing.JLabel lblTempoDecorrido1;
    private javax.swing.JTextArea txtAcoes;
    private javax.swing.JTextArea txtAcoes1;
    private javax.swing.JTextArea txtAcoes2;
    private javax.swing.JTextArea txtAcoes3;
    private javax.swing.JTextArea txtAcoes4;
    private javax.swing.JFormattedTextField txtDataAtualizacao;
    private javax.swing.JTextArea txtDe;
    private javax.swing.JTextArea txtDe1;
    private javax.swing.JTextArea txtDe2;
    private javax.swing.JTextArea txtDe3;
    private javax.swing.JTextArea txtDe4;
    private javax.swing.JTabbedPane txtDefinicoesGerais;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEquipe;
    private javax.swing.JTextField txtEscopo;
    private javax.swing.JTextArea txtEspecificacao;
    private javax.swing.JTextArea txtEspecificacao1;
    private javax.swing.JTextArea txtEspecificacao2;
    private javax.swing.JTextArea txtEspecificacao3;
    private javax.swing.JTextArea txtEspecificacao4;
    private javax.swing.JTextField txtIndicadores;
    private javax.swing.JTextField txtIniciativa;
    private javax.swing.JFormattedTextField txtInicioReal;
    private javax.swing.JTextField txtLider;
    private javax.swing.JTextArea txtPara;
    private javax.swing.JTextArea txtPara1;
    private javax.swing.JTextArea txtPara2;
    private javax.swing.JTextArea txtPara3;
    private javax.swing.JTextArea txtPara4;
    private javax.swing.JTextField txtPatrocinador;
    private javax.swing.JTextArea txtPontoAtencao;
    private javax.swing.JTextArea txtPontoAtencao1;
    private javax.swing.JTextArea txtPontoAtencao2;
    private javax.swing.JTextArea txtPontoAtencao3;
    private javax.swing.JTextArea txtPontoAtencao4;
    private javax.swing.JFormattedTextField txtPrazo;
    private javax.swing.JFormattedTextField txtPrazo1;
    private javax.swing.JFormattedTextField txtPrazo2;
    private javax.swing.JFormattedTextField txtPrazo3;
    private javax.swing.JFormattedTextField txtPrazo4;
    private javax.swing.JTextField txtProdutos;
    private javax.swing.JTextArea txtRecursos;
    private javax.swing.JTextArea txtRecursos1;
    private javax.swing.JTextArea txtRecursos2;
    private javax.swing.JTextArea txtRecursos3;
    private javax.swing.JTextArea txtRecursos4;
    private javax.swing.JTextField txtResponsavel;
    private javax.swing.JTextField txtResponsavel1;
    private javax.swing.JTextField txtResponsavel2;
    private javax.swing.JTextField txtResponsavel3;
    private javax.swing.JTextField txtResponsavel4;
    // End of variables declaration//GEN-END:variables
}
