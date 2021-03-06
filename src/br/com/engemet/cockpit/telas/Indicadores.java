package br.com.engemet.cockpit.telas;

import javax.swing.JOptionPane;

public class Indicadores extends javax.swing.JFrame{

    public Indicadores(){
        Info.indicadores = this;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableIndicador = new javax.swing.JTabbedPane();
        panelInformGerais = new javax.swing.JPanel();
        lblNivelDivulg = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        lbIIdentDesemp = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblUnidade = new javax.swing.JLabel();
        lblFreqAtu = new javax.swing.JLabel();
        lblPerspectiva = new javax.swing.JLabel();
        lblPainel = new javax.swing.JLabel();
        lblPosicao = new javax.swing.JLabel();
        lblRespMeta = new javax.swing.JLabel();
        lblRespInformacao = new javax.swing.JLabel();
        txtRespInformacao = new javax.swing.JTextField();
        txtCod = new javax.swing.JTextField();
        txtIdentDesemp = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPainel = new javax.swing.JTextField();
        txtPosicao = new javax.swing.JTextField();
        txtRespMeta = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JComboBox();
        btnUnidade = new javax.swing.JButton();
        chkBianual = new javax.swing.JCheckBox();
        chkMensal = new javax.swing.JCheckBox();
        chkBimensal = new javax.swing.JCheckBox();
        chkTrimestral = new javax.swing.JCheckBox();
        chkSemestral = new javax.swing.JCheckBox();
        chkAnual = new javax.swing.JCheckBox();
        cbxPerspectiva = new javax.swing.JComboBox();
        chkGestores = new javax.swing.JCheckBox();
        chkTodosSomInt = new javax.swing.JCheckBox();
        chkTodos = new javax.swing.JCheckBox();
        btnDadosHistoricos = new javax.swing.JButton();
        btnDadosReais = new javax.swing.JButton();
        btnProx1 = new javax.swing.JToggleButton();
        btnForecast = new javax.swing.JButton();
        btnValorIdeal = new javax.swing.JButton();
        panelCalcIndicador = new javax.swing.JPanel();
        lblObserv = new javax.swing.JLabel();
        txtObserv1 = new javax.swing.JTextField();
        lblFormCalc = new javax.swing.JLabel();
        lblDado = new javax.swing.JLabel();
        lblUniDado = new javax.swing.JLabel();
        lblRespDado = new javax.swing.JLabel();
        lblAreaOrig = new javax.swing.JLabel();
        txtFormCalc = new javax.swing.JTextField();
        txtDado1 = new javax.swing.JTextField();
        txtRespDado1 = new javax.swing.JTextField();
        txtAreaOrig1 = new javax.swing.JTextField();
        cbxUniDado1 = new javax.swing.JComboBox();
        btnUniDado1 = new javax.swing.JButton();
        txtObserv2 = new javax.swing.JTextField();
        txtDado2 = new javax.swing.JTextField();
        txtRespDado2 = new javax.swing.JTextField();
        txtAreaOrig2 = new javax.swing.JTextField();
        cbxUniDado2 = new javax.swing.JComboBox();
        btnUniDado2 = new javax.swing.JButton();
        txtObserv3 = new javax.swing.JTextField();
        txtDado3 = new javax.swing.JTextField();
        txtRespDado3 = new javax.swing.JTextField();
        txtAreaOrig3 = new javax.swing.JTextField();
        cbxUniDado3 = new javax.swing.JComboBox();
        btnUniDado3 = new javax.swing.JButton();
        txtObserv4 = new javax.swing.JTextField();
        txtDado4 = new javax.swing.JTextField();
        txtRespDado4 = new javax.swing.JTextField();
        txtAreaOrig4 = new javax.swing.JTextField();
        cbxUniDado4 = new javax.swing.JComboBox();
        btnUniDado4 = new javax.swing.JButton();
        txtObserv5 = new javax.swing.JTextField();
        txtDado5 = new javax.swing.JTextField();
        txtRespDado5 = new javax.swing.JTextField();
        txtAreaOrig5 = new javax.swing.JTextField();
        cbxUniDado5 = new javax.swing.JComboBox();
        btnUniDado5 = new javax.swing.JButton();
        txtObserv6 = new javax.swing.JTextField();
        txtDado6 = new javax.swing.JTextField();
        txtRespDado6 = new javax.swing.JTextField();
        txtAreaOrig6 = new javax.swing.JTextField();
        cbxUniDado6 = new javax.swing.JComboBox();
        btnUniDado6 = new javax.swing.JButton();
        txtObserv7 = new javax.swing.JTextField();
        txtDado7 = new javax.swing.JTextField();
        txtRespDado7 = new javax.swing.JTextField();
        txtAreaOrig7 = new javax.swing.JTextField();
        cbxUniDado7 = new javax.swing.JComboBox();
        btnUniDado7 = new javax.swing.JButton();
        txtObserv8 = new javax.swing.JTextField();
        txtDado8 = new javax.swing.JTextField();
        txtRespDado8 = new javax.swing.JTextField();
        txtAreaOrig8 = new javax.swing.JTextField();
        cbxUniDado8 = new javax.swing.JComboBox();
        btnUniDado8 = new javax.swing.JButton();
        txtObserv9 = new javax.swing.JTextField();
        txtDado9 = new javax.swing.JTextField();
        txtRespDado9 = new javax.swing.JTextField();
        txtAreaOrig9 = new javax.swing.JTextField();
        cbxUniDado9 = new javax.swing.JComboBox();
        btnUniDado9 = new javax.swing.JButton();
        txtObserv10 = new javax.swing.JTextField();
        txtDado10 = new javax.swing.JTextField();
        txtRespDado10 = new javax.swing.JTextField();
        txtAreaOrig10 = new javax.swing.JTextField();
        cbxUniDado10 = new javax.swing.JComboBox();
        btnUniDado10 = new javax.swing.JButton();
        btnAnt1 = new javax.swing.JToggleButton();
        btnProx2 = new javax.swing.JToggleButton();
        panelMetas = new javax.swing.JPanel();
        btnAnt2 = new javax.swing.JToggleButton();
        btnProx3 = new javax.swing.JToggleButton();
        lblVarMeta = new javax.swing.JLabel();
        lblTpDeMeta = new javax.swing.JLabel();
        chkVlFixoLongPeriodo = new javax.swing.JCheckBox();
        chkAcumAoLongPeriodo = new javax.swing.JCheckBox();
        chkAcum12UltMeses = new javax.swing.JCheckBox();
        btnAddMeta = new javax.swing.JButton();
        cbxMetas = new javax.swing.JComboBox();
        lblVer = new javax.swing.JLabel();
        lblVlAcum1 = new javax.swing.JLabel();
        lblVlAcumAbs = new javax.swing.JLabel();
        txtVer = new javax.swing.JTextField();
        txtVlAcumJaneiro = new javax.swing.JTextField();
        txtVlAcumAbs = new javax.swing.JTextField();
        lblVlJunho = new javax.swing.JLabel();
        lblValor1 = new javax.swing.JLabel();
        lblValoresAbsolutos = new javax.swing.JLabel();
        lblVlFevereiro = new javax.swing.JLabel();
        lblVlMarco = new javax.swing.JLabel();
        lblVlAbril = new javax.swing.JLabel();
        lblVlMaio = new javax.swing.JLabel();
        txtMeta = new javax.swing.JTextField();
        txtVlJaneiro = new javax.swing.JTextField();
        txtVlAcumFevereiro = new javax.swing.JTextField();
        txtVlFevereiro = new javax.swing.JTextField();
        txtVlAcumMarco = new javax.swing.JTextField();
        txtVlMarco = new javax.swing.JTextField();
        txtVlAcumAbril = new javax.swing.JTextField();
        txtVlAbril = new javax.swing.JTextField();
        txtVlAcumMaio = new javax.swing.JTextField();
        txtVlMaio = new javax.swing.JTextField();
        txtMaiorqueVerd = new javax.swing.JTextField();
        txtVlJunho = new javax.swing.JTextField();
        lblVlAcum2 = new javax.swing.JLabel();
        txtVlAcumJulho = new javax.swing.JTextField();
        lblVlDezembro = new javax.swing.JLabel();
        lblValor2 = new javax.swing.JLabel();
        lblVlJulho = new javax.swing.JLabel();
        lblVlAgosto = new javax.swing.JLabel();
        lblVlSetembro = new javax.swing.JLabel();
        lblVlOutubro = new javax.swing.JLabel();
        lblVlNovembro = new javax.swing.JLabel();
        txtVlJulho = new javax.swing.JTextField();
        txtVlAcumAgosto = new javax.swing.JTextField();
        txtVlAgosto = new javax.swing.JTextField();
        txtVlAcumSetembro = new javax.swing.JTextField();
        txtVlSetembro = new javax.swing.JTextField();
        txtVlAcumOutubro = new javax.swing.JTextField();
        txtVlOutubro = new javax.swing.JTextField();
        txtVlAcumNovembro = new javax.swing.JTextField();
        txtVlNovembro = new javax.swing.JTextField();
        txtVlAcumDezembro = new javax.swing.JTextField();
        txtVlDezembro = new javax.swing.JTextField();
        lblComFoiEstabMeta = new javax.swing.JLabel();
        lblVlJaneiro = new javax.swing.JLabel();
        lblPerMesAno2 = new javax.swing.JLabel();
        lblCntrlDesv = new javax.swing.JLabel();
        lblPerMesAno1 = new javax.swing.JLabel();
        lblMeta1 = new javax.swing.JLabel();
        txtVlAcumJunho = new javax.swing.JTextField();
        lblObservacoes = new javax.swing.JLabel();
        lblMaiorMelor = new javax.swing.JLabel();
        lblMenorMelhor = new javax.swing.JLabel();
        chk120 = new javax.swing.JCheckBox();
        chk74 = new javax.swing.JCheckBox();
        chk75e94 = new javax.swing.JCheckBox();
        chk95e99 = new javax.swing.JCheckBox();
        chk100e119 = new javax.swing.JCheckBox();
        chk80 = new javax.swing.JCheckBox();
        chk125 = new javax.swing.JCheckBox();
        chkMenorqueVerm = new javax.swing.JCheckBox();
        chk105e100 = new javax.swing.JCheckBox();
        chkMaiorqueVerd = new javax.swing.JCheckBox();
        chk125e105 = new javax.swing.JCheckBox();
        chk100e80 = new javax.swing.JCheckBox();
        chkMaiorqueVerm = new javax.swing.JCheckBox();
        chkMenorqueVerd = new javax.swing.JCheckBox();
        txtObservacoes = new javax.swing.JTextField();
        txtMenorqueVerm = new javax.swing.JTextField();
        txtMaiorqueVerm = new javax.swing.JTextField();
        txtMenorqueVerd = new javax.swing.JTextField();
        lblMeta2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtComFoiEstabMeta = new javax.swing.JTextArea();
        chkValAbs = new javax.swing.JCheckBox();
        chkValPer = new javax.swing.JCheckBox();
        cbxPerDeMes = new javax.swing.JComboBox();
        cbxPerAMes = new javax.swing.JComboBox();
        lblAno = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        panelTipsGrafs = new javax.swing.JPanel();
        btnAnt3 = new javax.swing.JToggleButton();
        btnProx4 = new javax.swing.JToggleButton();
        lblEscFormtTbGraf = new javax.swing.JLabel();
        lblEscTipGraf = new javax.swing.JLabel();
        chkNumPerc = new javax.swing.JCheckBox();
        chkNumAbs = new javax.swing.JCheckBox();
        cbxTipsGrafs = new javax.swing.JComboBox();
        panelDesdInd = new javax.swing.JPanel();
        btnAnt4 = new javax.swing.JToggleButton();
        lblDesdobramento2 = new javax.swing.JLabel();
        lblDesdobramento3 = new javax.swing.JLabel();
        lblDesdobramento4 = new javax.swing.JLabel();
        lblDesdobramento5 = new javax.swing.JLabel();
        lblDesdobramento1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDesdobramento5 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaDesdobramento1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaDesdobramento2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAreaDesdobramento3 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtAreaDesdobramento4 = new javax.swing.JTextArea();
        btnConcluir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        tableIndicador.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        panelInformGerais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNivelDivulg.setBackground(new java.awt.Color(22, 54, 92));
        lblNivelDivulg.setForeground(new java.awt.Color(255, 255, 255));
        lblNivelDivulg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNivelDivulg.setText("<html><center>Nível de Divulgação</center></html>");
        lblNivelDivulg.setOpaque(true);
        panelInformGerais.add(lblNivelDivulg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 100, 50));

        lblCod.setBackground(new java.awt.Color(22, 54, 92));
        lblCod.setForeground(new java.awt.Color(255, 255, 255));
        lblCod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCod.setText("<html><center>\nCódigo de Identificação\n</center></html>");
        lblCod.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblCod.setOpaque(true);
        panelInformGerais.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        lbIIdentDesemp.setBackground(new java.awt.Color(22, 54, 92));
        lbIIdentDesemp.setForeground(new java.awt.Color(255, 255, 255));
        lbIIdentDesemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIIdentDesemp.setText("<html><center>Indicador de Desempenho</center></html>");
        lbIIdentDesemp.setOpaque(true);
        panelInformGerais.add(lbIIdentDesemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 50));

        lblDescricao.setBackground(new java.awt.Color(22, 54, 92));
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("<html><center>Descrição / Objetivos</center></html>");
        lblDescricao.setOpaque(true);
        panelInformGerais.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 50));

        lblUnidade.setBackground(new java.awt.Color(22, 54, 92));
        lblUnidade.setForeground(new java.awt.Color(255, 255, 255));
        lblUnidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUnidade.setText("<html><center>Unidade</center></html>");
        lblUnidade.setOpaque(true);
        panelInformGerais.add(lblUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 100, 50));

        lblFreqAtu.setBackground(new java.awt.Color(22, 54, 92));
        lblFreqAtu.setForeground(new java.awt.Color(255, 255, 255));
        lblFreqAtu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFreqAtu.setText("<html><center>Frequência de Atualização</center></html>");
        lblFreqAtu.setOpaque(true);
        panelInformGerais.add(lblFreqAtu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 100, 50));

        lblPerspectiva.setBackground(new java.awt.Color(22, 54, 92));
        lblPerspectiva.setForeground(new java.awt.Color(255, 255, 255));
        lblPerspectiva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerspectiva.setText("<html><center>Perspectiva</center></html>");
        lblPerspectiva.setOpaque(true);
        panelInformGerais.add(lblPerspectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 100, 50));

        lblPainel.setBackground(new java.awt.Color(22, 54, 92));
        lblPainel.setForeground(new java.awt.Color(255, 255, 255));
        lblPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainel.setText("<html><center>Painel</center></html>");
        lblPainel.setOpaque(true);
        panelInformGerais.add(lblPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 100, 50));

        lblPosicao.setBackground(new java.awt.Color(22, 54, 92));
        lblPosicao.setForeground(new java.awt.Color(255, 255, 255));
        lblPosicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPosicao.setText("<html><center>Posição</center></html>");
        lblPosicao.setOpaque(true);
        panelInformGerais.add(lblPosicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 100, 50));

        lblRespMeta.setBackground(new java.awt.Color(22, 54, 92));
        lblRespMeta.setForeground(new java.awt.Color(255, 255, 255));
        lblRespMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespMeta.setText("<html><center>Responsável pela Meta</center></html>");
        lblRespMeta.setOpaque(true);
        panelInformGerais.add(lblRespMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 100, 50));

        lblRespInformacao.setBackground(new java.awt.Color(22, 54, 92));
        lblRespInformacao.setForeground(new java.awt.Color(255, 255, 255));
        lblRespInformacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespInformacao.setText("<html><center>Responsável pela Informação</center></html>");
        lblRespInformacao.setOpaque(true);
        panelInformGerais.add(lblRespInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 100, 50));

        txtRespInformacao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespInformacaoFocusLost(evt);
            }
        });
        panelInformGerais.add(txtRespInformacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 430, 50));

        txtCod.setEditable(false);
        txtCod.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        panelInformGerais.add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 70, 50));

        txtIdentDesemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentDesempActionPerformed(evt);
            }
        });
        txtIdentDesemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdentDesempFocusLost(evt);
            }
        });
        panelInformGerais.add(txtIdentDesemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 760, 50));

        txtDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescricaoFocusLost(evt);
            }
        });
        panelInformGerais.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 760, 50));

        txtPainel.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPainelFocusLost(evt);
            }
        });
        panelInformGerais.add(txtPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 110, 50));

        txtPosicao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPosicaoFocusLost(evt);
            }
        });
        panelInformGerais.add(txtPosicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 110, 50));

        txtRespMeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespMetaFocusLost(evt);
            }
        });
        panelInformGerais.add(txtRespMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 430, 50));

        txtUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        txtUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadeActionPerformed(evt);
            }
        });
        panelInformGerais.add(txtUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 130, -1));

        btnUnidade.setText("+");
        btnUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadeActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 40, -1));

        chkBianual.setText("Bianual");
        chkBianual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBianualActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkBianual, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, -1));

        chkMensal.setText("Mensal");
        chkMensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMensalActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkMensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        chkBimensal.setText("Bimensal");
        chkBimensal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBimensalActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkBimensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, -1, -1));

        chkTrimestral.setText("Trimestral");
        chkTrimestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTrimestralActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkTrimestral, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, -1));

        chkSemestral.setText("Semestral");
        chkSemestral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSemestralActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkSemestral, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        chkAnual.setText("Anual");
        chkAnual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAnualActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, -1));

        cbxPerspectiva.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Finanças", "Clientes", "Processos", "PGT" }));
        cbxPerspectiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPerspectivaActionPerformed(evt);
            }
        });
        panelInformGerais.add(cbxPerspectiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 260, -1));

        chkGestores.setText("Gestores");
        chkGestores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkGestoresActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkGestores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, -1, -1));

        chkTodosSomInt.setText("Todos - Somente Interno");
        chkTodosSomInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosSomIntActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkTodosSomInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

        chkTodos.setText("Todos");
        chkTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkTodosActionPerformed(evt);
            }
        });
        panelInformGerais.add(chkTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        btnDadosHistoricos.setText("<html><center>Adicionar Dados Históricos</center></html>");
        btnDadosHistoricos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosHistoricosActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnDadosHistoricos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 290, -1));

        btnDadosReais.setText("<html><center>Adicionar Dados Reais</center></html>");
        btnDadosReais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDadosReaisActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnDadosReais, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 290, -1));

        btnProx1.setText("<html><center>Próximo</center></html>");
        btnProx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx1ActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnProx1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 680, 100, -1));

        btnForecast.setText("<html><center>Adicionar Forecast</center></html>");
        btnForecast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForecastActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnForecast, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 290, -1));

        btnValorIdeal.setText("<html><center>Adicionar Valor Ideal</center></html>");
        btnValorIdeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValorIdealActionPerformed(evt);
            }
        });
        panelInformGerais.add(btnValorIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 290, -1));

        tableIndicador.addTab("1. Informações Gerais", panelInformGerais);

        panelCalcIndicador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblObserv.setBackground(new java.awt.Color(22, 54, 92));
        lblObserv.setForeground(new java.awt.Color(255, 255, 255));
        lblObserv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObserv.setText("<html><center>\nObservações\n</center></html>");
        lblObserv.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblObserv.setOpaque(true);
        panelCalcIndicador.add(lblObserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, 180, 50));

        txtObserv1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv1FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 110, 180, 50));

        lblFormCalc.setBackground(new java.awt.Color(22, 54, 92));
        lblFormCalc.setForeground(new java.awt.Color(255, 255, 255));
        lblFormCalc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFormCalc.setText("<html><center>\nForma de Cálculo\n</center></html>");
        lblFormCalc.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblFormCalc.setOpaque(true);
        panelCalcIndicador.add(lblFormCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        lblDado.setBackground(new java.awt.Color(22, 54, 92));
        lblDado.setForeground(new java.awt.Color(255, 255, 255));
        lblDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDado.setText("<html><center>\nDado\n</center></html>");
        lblDado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDado.setOpaque(true);
        panelCalcIndicador.add(lblDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 50));

        lblUniDado.setBackground(new java.awt.Color(22, 54, 92));
        lblUniDado.setForeground(new java.awt.Color(255, 255, 255));
        lblUniDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUniDado.setText("<html><center>\nUnidade do Dado\n</center></html>");
        lblUniDado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblUniDado.setOpaque(true);
        panelCalcIndicador.add(lblUniDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, 50));

        lblRespDado.setBackground(new java.awt.Color(22, 54, 92));
        lblRespDado.setForeground(new java.awt.Color(255, 255, 255));
        lblRespDado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRespDado.setText("<html><center>\nResponsável pelo Dado\n</center></html>");
        lblRespDado.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblRespDado.setOpaque(true);
        panelCalcIndicador.add(lblRespDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 180, 50));

        lblAreaOrig.setBackground(new java.awt.Color(22, 54, 92));
        lblAreaOrig.setForeground(new java.awt.Color(255, 255, 255));
        lblAreaOrig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAreaOrig.setText("<html><center>\nÁrea Origem\n</center></html>");
        lblAreaOrig.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAreaOrig.setOpaque(true);
        panelCalcIndicador.add(lblAreaOrig, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 180, 50));

        txtFormCalc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFormCalcFocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtFormCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 760, 50));

        txtDado1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtDado1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado1FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 180, 50));

        txtRespDado1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado1FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 180, 50));

        txtAreaOrig1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig1FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 180, 50));

        cbxUniDado1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado1ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, -1));

        btnUniDado1.setText("+");
        btnUniDado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado1ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 40, -1));

        txtObserv2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv2FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 180, 50));

        txtDado2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado2FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 180, 50));

        txtRespDado2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado2FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 180, 50));

        txtAreaOrig2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig2FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 180, 50));

        cbxUniDado2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado2ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, -1));

        btnUniDado2.setText("+");
        btnUniDado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado2ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 40, -1));

        txtObserv3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv3FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 180, 50));

        txtDado3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado3FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 180, 50));

        txtRespDado3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado3FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 180, 50));

        txtAreaOrig3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig3FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 180, 50));

        cbxUniDado3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado3ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, -1));

        btnUniDado3.setText("+");
        btnUniDado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado3ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 40, -1));

        txtObserv4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv4FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 180, 50));

        txtDado4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado4FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 180, 50));

        txtRespDado4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado4FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 180, 50));

        txtAreaOrig4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig4FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 180, 50));

        cbxUniDado4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado4ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 140, -1));

        btnUniDado4.setText("+");
        btnUniDado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado4ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 40, -1));

        txtObserv5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv5FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 180, 50));

        txtDado5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado5FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 180, 50));

        txtRespDado5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado5FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 180, 50));

        txtAreaOrig5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig5FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 180, 50));

        cbxUniDado5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado5ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, -1));

        btnUniDado5.setText("+");
        btnUniDado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado5ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 40, -1));

        txtObserv6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv6FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 180, 50));

        txtDado6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado6FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 180, 50));

        txtRespDado6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado6FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 180, 50));

        txtAreaOrig6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig6FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 180, 50));

        cbxUniDado6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado6ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 140, -1));

        btnUniDado6.setText("+");
        btnUniDado6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado6ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 40, -1));

        txtObserv7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv7FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 410, 180, 50));

        txtDado7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado7FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 180, 50));

        txtRespDado7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado7FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 180, 50));

        txtAreaOrig7.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig7FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 180, 50));

        cbxUniDado7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado7ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 140, -1));

        btnUniDado7.setText("+");
        btnUniDado7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado7ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 40, -1));

        txtObserv8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv8FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv8, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 460, 180, 50));

        txtDado8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado8FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 50));

        txtRespDado8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado8FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 180, 50));

        txtAreaOrig8.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig8FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig8, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 180, 50));

        cbxUniDado8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado8ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 140, -1));

        btnUniDado8.setText("+");
        btnUniDado8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado8ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 40, -1));

        txtObserv9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv9FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 180, 50));

        txtDado9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado9FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 180, 50));

        txtRespDado9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado9FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, 180, 50));

        txtAreaOrig9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig9FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 180, 50));

        cbxUniDado9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado9ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 140, -1));

        btnUniDado9.setText("+");
        btnUniDado9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado9ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 520, 40, -1));

        txtObserv10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObserv10FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtObserv10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 560, 180, 50));

        txtDado10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDado10FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtDado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 180, 50));

        txtRespDado10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRespDado10FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtRespDado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 180, 50));

        txtAreaOrig10.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaOrig10FocusLost(evt);
            }
        });
        panelCalcIndicador.add(txtAreaOrig10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, 180, 50));

        cbxUniDado10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "R$ 1000", "%" }));
        cbxUniDado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUniDado10ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(cbxUniDado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 140, -1));

        btnUniDado10.setText("+");
        btnUniDado10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUniDado10ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnUniDado10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 40, -1));

        btnAnt1.setText("<html><center>\nAnterior\n</center></html>");
        btnAnt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnt1ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnAnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 100, -1));

        btnProx2.setText("<html><center>Próximo</center></html>");
        btnProx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx2ActionPerformed(evt);
            }
        });
        panelCalcIndicador.add(btnProx2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 100, -1));

        tableIndicador.addTab("2. Cálculo do Indicador", panelCalcIndicador);

        panelMetas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnt2.setText("<html><center>\nAnterior\n</center></html>");
        btnAnt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnt2ActionPerformed(evt);
            }
        });
        panelMetas.add(btnAnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 790, 100, -1));

        btnProx3.setText("<html><center>Próximo</center></html>");
        btnProx3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx3ActionPerformed(evt);
            }
        });
        panelMetas.add(btnProx3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 790, 100, -1));

        lblVarMeta.setBackground(new java.awt.Color(22, 54, 92));
        lblVarMeta.setForeground(new java.awt.Color(255, 255, 255));
        lblVarMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVarMeta.setText("<html><center>\nVariações da Meta\n</center></html>");
        lblVarMeta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVarMeta.setOpaque(true);
        panelMetas.add(lblVarMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 540, 940, 30));

        lblTpDeMeta.setBackground(new java.awt.Color(22, 54, 92));
        lblTpDeMeta.setForeground(new java.awt.Color(255, 255, 255));
        lblTpDeMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTpDeMeta.setText("<html><center>\nTipo de Meta\n</center></html>");
        lblTpDeMeta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblTpDeMeta.setOpaque(true);
        panelMetas.add(lblTpDeMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 940, 30));

        chkVlFixoLongPeriodo.setText("Valor fixo ao longo do período");
        chkVlFixoLongPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkVlFixoLongPeriodoActionPerformed(evt);
            }
        });
        panelMetas.add(chkVlFixoLongPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 30, -1, -1));

        chkAcumAoLongPeriodo.setText("<html><center>\nAcumulada ao longo do período\n</center></html>");
        chkAcumAoLongPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAcumAoLongPeriodoActionPerformed(evt);
            }
        });
        panelMetas.add(chkAcumAoLongPeriodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        chkAcum12UltMeses.setText("Acumulada - 12 últimos meses");
        chkAcum12UltMeses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAcum12UltMesesActionPerformed(evt);
            }
        });
        panelMetas.add(chkAcum12UltMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, -1));

        btnAddMeta.setText("+");
        btnAddMeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMetaActionPerformed(evt);
            }
        });
        panelMetas.add(btnAddMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, -1));

        cbxMetas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Adicione uma Meta" }));
        cbxMetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMetasActionPerformed(evt);
            }
        });
        panelMetas.add(cbxMetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 550, -1));

        lblVer.setBackground(new java.awt.Color(22, 54, 92));
        lblVer.setForeground(new java.awt.Color(255, 255, 255));
        lblVer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVer.setText("<html><center>\nVersão\n</center></html>");
        lblVer.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVer.setOpaque(true);
        panelMetas.add(lblVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 100, 50));

        lblVlAcum1.setBackground(new java.awt.Color(22, 54, 92));
        lblVlAcum1.setForeground(new java.awt.Color(255, 255, 255));
        lblVlAcum1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlAcum1.setText("<html><center>\nvalor acumulado:\n</center></html>");
        lblVlAcum1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlAcum1.setOpaque(true);
        panelMetas.add(lblVlAcum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 100, 30));

        lblVlAcumAbs.setBackground(new java.awt.Color(22, 54, 92));
        lblVlAcumAbs.setForeground(new java.awt.Color(255, 255, 255));
        lblVlAcumAbs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlAcumAbs.setText("<html><center>\nValor Acumulado Absoluto\n</center></html>");
        lblVlAcumAbs.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlAcumAbs.setOpaque(true);
        panelMetas.add(lblVlAcumAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 100, 50));

        txtVer.setEditable(false);
        panelMetas.add(txtVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 100, -1));

        txtVlAcumJaneiro.setEditable(false);
        panelMetas.add(txtVlAcumJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 100, -1));

        txtVlAcumAbs.setEditable(false);
        panelMetas.add(txtVlAcumAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 100, -1));

        lblVlJunho.setBackground(new java.awt.Color(22, 54, 92));
        lblVlJunho.setForeground(new java.awt.Color(255, 255, 255));
        lblVlJunho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlJunho.setText("<html><center>\nJunho\n</center></html>");
        lblVlJunho.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlJunho.setOpaque(true);
        panelMetas.add(lblVlJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 100, 30));

        lblValor1.setBackground(new java.awt.Color(22, 54, 92));
        lblValor1.setForeground(new java.awt.Color(255, 255, 255));
        lblValor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor1.setText("<html><center>\nvalor:\n</center></html>");
        lblValor1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblValor1.setOpaque(true);
        panelMetas.add(lblValor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 100, 30));

        lblValoresAbsolutos.setBackground(new java.awt.Color(22, 54, 92));
        lblValoresAbsolutos.setForeground(new java.awt.Color(255, 255, 255));
        lblValoresAbsolutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValoresAbsolutos.setText("<html><center>\nValores Absolutos\n</center></html>");
        lblValoresAbsolutos.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblValoresAbsolutos.setOpaque(true);
        panelMetas.add(lblValoresAbsolutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 630, 100, 30));

        lblVlFevereiro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlFevereiro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlFevereiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlFevereiro.setText("<html><center>\nFevereiro\n</center></html>");
        lblVlFevereiro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlFevereiro.setOpaque(true);
        panelMetas.add(lblVlFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 100, 30));

        lblVlMarco.setBackground(new java.awt.Color(22, 54, 92));
        lblVlMarco.setForeground(new java.awt.Color(255, 255, 255));
        lblVlMarco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlMarco.setText("<html><center>\nMarço\n</center></html>");
        lblVlMarco.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlMarco.setOpaque(true);
        panelMetas.add(lblVlMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 100, 30));

        lblVlAbril.setBackground(new java.awt.Color(22, 54, 92));
        lblVlAbril.setForeground(new java.awt.Color(255, 255, 255));
        lblVlAbril.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlAbril.setText("<html><center>\nAbril\n</center></html>");
        lblVlAbril.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlAbril.setOpaque(true);
        panelMetas.add(lblVlAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 100, 30));

        lblVlMaio.setBackground(new java.awt.Color(22, 54, 92));
        lblVlMaio.setForeground(new java.awt.Color(255, 255, 255));
        lblVlMaio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlMaio.setText("<html><center>\nMaio\n</center></html>");
        lblVlMaio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlMaio.setOpaque(true);
        panelMetas.add(lblVlMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 100, 30));

        txtMeta.setEditable(false);
        panelMetas.add(txtMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, 100, -1));

        txtVlJaneiro.setEditable(false);
        panelMetas.add(txtVlJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 100, -1));

        txtVlAcumFevereiro.setEditable(false);
        panelMetas.add(txtVlAcumFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 100, -1));

        txtVlFevereiro.setEditable(false);
        panelMetas.add(txtVlFevereiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, -1));

        txtVlAcumMarco.setEditable(false);
        panelMetas.add(txtVlAcumMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 100, -1));

        txtVlMarco.setEditable(false);
        panelMetas.add(txtVlMarco, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 100, -1));

        txtVlAcumAbril.setEditable(false);
        panelMetas.add(txtVlAcumAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 100, -1));

        txtVlAbril.setEditable(false);
        panelMetas.add(txtVlAbril, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, -1));

        txtVlAcumMaio.setEditable(false);
        panelMetas.add(txtVlAcumMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 100, -1));

        txtVlMaio.setEditable(false);
        panelMetas.add(txtVlMaio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 100, -1));
        panelMetas.add(txtMaiorqueVerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 630, 60, -1));

        txtVlJunho.setEditable(false);
        panelMetas.add(txtVlJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 100, -1));

        lblVlAcum2.setBackground(new java.awt.Color(22, 54, 92));
        lblVlAcum2.setForeground(new java.awt.Color(255, 255, 255));
        lblVlAcum2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlAcum2.setText("<html><center>\nvalor acumulado:\n</center></html>");
        lblVlAcum2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlAcum2.setOpaque(true);
        panelMetas.add(lblVlAcum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 100, 30));

        txtVlAcumJulho.setEditable(false);
        panelMetas.add(txtVlAcumJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 100, -1));

        lblVlDezembro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlDezembro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlDezembro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlDezembro.setText("<html><center>\nDezembro\n</center></html>");
        lblVlDezembro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlDezembro.setOpaque(true);
        panelMetas.add(lblVlDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, 100, 30));

        lblValor2.setBackground(new java.awt.Color(22, 54, 92));
        lblValor2.setForeground(new java.awt.Color(255, 255, 255));
        lblValor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor2.setText("<html><center>\nvalor:\n</center></html>");
        lblValor2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblValor2.setOpaque(true);
        panelMetas.add(lblValor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 100, 30));

        lblVlJulho.setBackground(new java.awt.Color(22, 54, 92));
        lblVlJulho.setForeground(new java.awt.Color(255, 255, 255));
        lblVlJulho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlJulho.setText("<html><center>\nJulho\n</center></html>");
        lblVlJulho.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlJulho.setOpaque(true);
        panelMetas.add(lblVlJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 100, 30));

        lblVlAgosto.setBackground(new java.awt.Color(22, 54, 92));
        lblVlAgosto.setForeground(new java.awt.Color(255, 255, 255));
        lblVlAgosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlAgosto.setText("<html><center>\nAgosto\n</center></html>");
        lblVlAgosto.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlAgosto.setOpaque(true);
        panelMetas.add(lblVlAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 100, 30));

        lblVlSetembro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlSetembro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlSetembro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlSetembro.setText("<html><center>\nSetembro\n</center></html>");
        lblVlSetembro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlSetembro.setOpaque(true);
        panelMetas.add(lblVlSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 100, 30));

        lblVlOutubro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlOutubro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlOutubro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlOutubro.setText("<html><center>\nOutubro\n</center></html>");
        lblVlOutubro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlOutubro.setOpaque(true);
        panelMetas.add(lblVlOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 100, 30));

        lblVlNovembro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlNovembro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlNovembro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlNovembro.setText("<html><center>\nNovembro\n</center></html>");
        lblVlNovembro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlNovembro.setOpaque(true);
        panelMetas.add(lblVlNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 100, 30));

        txtVlJulho.setEditable(false);
        panelMetas.add(txtVlJulho, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 100, -1));

        txtVlAcumAgosto.setEditable(false);
        panelMetas.add(txtVlAcumAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 100, -1));

        txtVlAgosto.setEditable(false);
        panelMetas.add(txtVlAgosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 100, -1));

        txtVlAcumSetembro.setEditable(false);
        panelMetas.add(txtVlAcumSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 100, -1));

        txtVlSetembro.setEditable(false);
        panelMetas.add(txtVlSetembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 100, -1));

        txtVlAcumOutubro.setEditable(false);
        panelMetas.add(txtVlAcumOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 100, -1));

        txtVlOutubro.setEditable(false);
        panelMetas.add(txtVlOutubro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, 100, -1));

        txtVlAcumNovembro.setEditable(false);
        panelMetas.add(txtVlAcumNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 350, 100, -1));

        txtVlNovembro.setEditable(false);
        panelMetas.add(txtVlNovembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 100, -1));

        txtVlAcumDezembro.setEditable(false);
        panelMetas.add(txtVlAcumDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 100, -1));

        txtVlDezembro.setEditable(false);
        panelMetas.add(txtVlDezembro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 100, -1));

        lblComFoiEstabMeta.setBackground(new java.awt.Color(22, 54, 92));
        lblComFoiEstabMeta.setForeground(new java.awt.Color(255, 255, 255));
        lblComFoiEstabMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblComFoiEstabMeta.setText("<html><center>\nComo Foi estabelecida Meta?\n(descrva o processo e as pemissas adotadas)\n</center></html>");
        lblComFoiEstabMeta.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblComFoiEstabMeta.setOpaque(true);
        panelMetas.add(lblComFoiEstabMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 680, 190, 90));

        lblVlJaneiro.setBackground(new java.awt.Color(22, 54, 92));
        lblVlJaneiro.setForeground(new java.awt.Color(255, 255, 255));
        lblVlJaneiro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVlJaneiro.setText("<html><center>\nJaneiro\n</center></html>");
        lblVlJaneiro.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblVlJaneiro.setOpaque(true);
        panelMetas.add(lblVlJaneiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, 30));

        lblPerMesAno2.setBackground(new java.awt.Color(22, 54, 92));
        lblPerMesAno2.setForeground(new java.awt.Color(255, 255, 255));
        lblPerMesAno2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerMesAno2.setText("<html><center>\nPeriodo: a mês\n</center></html>");
        lblPerMesAno2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPerMesAno2.setOpaque(true);
        panelMetas.add(lblPerMesAno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 100, 30));

        lblCntrlDesv.setBackground(new java.awt.Color(22, 54, 92));
        lblCntrlDesv.setForeground(new java.awt.Color(255, 255, 255));
        lblCntrlDesv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCntrlDesv.setText("<html><center>\nControle de Desvio\n</center></html>");
        lblCntrlDesv.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblCntrlDesv.setOpaque(true);
        panelMetas.add(lblCntrlDesv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 100, 30));

        lblPerMesAno1.setBackground(new java.awt.Color(22, 54, 92));
        lblPerMesAno1.setForeground(new java.awt.Color(255, 255, 255));
        lblPerMesAno1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerMesAno1.setText("<html><center>\nPeriodo: de mês\n</center></html>");
        lblPerMesAno1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblPerMesAno1.setOpaque(true);
        panelMetas.add(lblPerMesAno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 30));

        lblMeta1.setBackground(new java.awt.Color(22, 54, 92));
        lblMeta1.setForeground(new java.awt.Color(255, 255, 255));
        lblMeta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMeta1.setText("<html><center>\nMeta\n</center></html>");
        lblMeta1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblMeta1.setOpaque(true);
        panelMetas.add(lblMeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 60, 940, 30));

        txtVlAcumJunho.setEditable(false);
        panelMetas.add(txtVlAcumJunho, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 100, -1));

        lblObservacoes.setBackground(new java.awt.Color(22, 54, 92));
        lblObservacoes.setForeground(new java.awt.Color(255, 255, 255));
        lblObservacoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObservacoes.setText("<html><center>\nObservações\n</center></html>");
        lblObservacoes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblObservacoes.setOpaque(true);
        panelMetas.add(lblObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 100, 30));

        lblMaiorMelor.setBackground(new java.awt.Color(22, 54, 92));
        lblMaiorMelor.setForeground(new java.awt.Color(255, 255, 255));
        lblMaiorMelor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaiorMelor.setText("<html><center>\nMaior Melhor\n</center></html>");
        lblMaiorMelor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblMaiorMelor.setOpaque(true);
        panelMetas.add(lblMaiorMelor, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 570, 100, 30));

        lblMenorMelhor.setBackground(new java.awt.Color(22, 54, 92));
        lblMenorMelhor.setForeground(new java.awt.Color(255, 255, 255));
        lblMenorMelhor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenorMelhor.setText("<html><center>\nMenor Melhor\n</center></html>");
        lblMenorMelhor.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblMenorMelhor.setOpaque(true);
        panelMetas.add(lblMenorMelhor, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 600, 100, 30));

        chk120.setBackground(new java.awt.Color(0, 51, 0));
        chk120.setText("Maior que: 120%");
        chk120.setOpaque(true);
        chk120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk120ActionPerformed(evt);
            }
        });
        panelMetas.add(chk120, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, 140, 30));

        chk74.setBackground(new java.awt.Color(153, 0, 0));
        chk74.setText("Menor que: 74,99%");
        chk74.setOpaque(true);
        chk74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk74ActionPerformed(evt);
            }
        });
        panelMetas.add(chk74, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 170, 30));

        chk75e94.setBackground(new java.awt.Color(255, 0, 0));
        chk75e94.setText("Entre 75% e 94,99%");
        chk75e94.setOpaque(true);
        chk75e94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk75e94ActionPerformed(evt);
            }
        });
        panelMetas.add(chk75e94, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 570, 170, 30));

        chk95e99.setBackground(new java.awt.Color(255, 255, 0));
        chk95e99.setText("Entre 95% e 99,99%");
        chk95e99.setOpaque(true);
        chk95e99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk95e99ActionPerformed(evt);
            }
        });
        panelMetas.add(chk95e99, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, 170, 30));

        chk100e119.setBackground(new java.awt.Color(0, 153, 0));
        chk100e119.setText("Entre 100% e 119,99%");
        chk100e119.setOpaque(true);
        chk100e119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk100e119ActionPerformed(evt);
            }
        });
        panelMetas.add(chk100e119, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, 170, 30));

        chk80.setBackground(new java.awt.Color(0, 51, 0));
        chk80.setText("Menor que: 80%");
        chk80.setOpaque(true);
        chk80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk80ActionPerformed(evt);
            }
        });
        panelMetas.add(chk80, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 140, 30));

        chk125.setBackground(new java.awt.Color(153, 0, 0));
        chk125.setText("Maior que: 125,01%");
        chk125.setOpaque(true);
        chk125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk125ActionPerformed(evt);
            }
        });
        panelMetas.add(chk125, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 600, 170, 30));

        chkMenorqueVerm.setBackground(new java.awt.Color(255, 0, 0));
        chkMenorqueVerm.setText("Menor que:");
        chkMenorqueVerm.setOpaque(true);
        chkMenorqueVerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMenorqueVermActionPerformed(evt);
            }
        });
        panelMetas.add(chkMenorqueVerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 630, 110, 30));

        chk105e100.setBackground(new java.awt.Color(255, 255, 0));
        chk105e100.setText("Entre 105% e 100,01%");
        chk105e100.setOpaque(true);
        chk105e100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk105e100ActionPerformed(evt);
            }
        });
        panelMetas.add(chk105e100, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, 170, 30));

        chkMaiorqueVerd.setBackground(new java.awt.Color(0, 153, 0));
        chkMaiorqueVerd.setText("Maior que:");
        chkMaiorqueVerd.setOpaque(true);
        chkMaiorqueVerd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaiorqueVerdActionPerformed(evt);
            }
        });
        panelMetas.add(chkMaiorqueVerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 630, 110, 30));

        chk125e105.setBackground(new java.awt.Color(255, 0, 0));
        chk125e105.setText("Entre 125% e 105,01%");
        chk125e105.setOpaque(true);
        chk125e105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk125e105ActionPerformed(evt);
            }
        });
        panelMetas.add(chk125e105, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 600, 170, 30));

        chk100e80.setBackground(new java.awt.Color(0, 153, 0));
        chk100e80.setText("Entre 100% e 80,01%");
        chk100e80.setOpaque(true);
        chk100e80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk100e80ActionPerformed(evt);
            }
        });
        panelMetas.add(chk100e80, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 600, 170, 30));

        chkMaiorqueVerm.setBackground(new java.awt.Color(255, 0, 0));
        chkMaiorqueVerm.setText("Maior que:");
        chkMaiorqueVerm.setOpaque(true);
        chkMaiorqueVerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMaiorqueVermActionPerformed(evt);
            }
        });
        panelMetas.add(chkMaiorqueVerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 110, 30));

        chkMenorqueVerd.setBackground(new java.awt.Color(0, 153, 0));
        chkMenorqueVerd.setText("Menor que:");
        chkMenorqueVerd.setOpaque(true);
        chkMenorqueVerd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMenorqueVerdActionPerformed(evt);
            }
        });
        panelMetas.add(chkMenorqueVerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 630, 110, 30));

        txtObservacoes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtObservacoesFocusLost(evt);
            }
        });
        panelMetas.add(txtObservacoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, 660, -1));
        panelMetas.add(txtMenorqueVerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 60, -1));
        panelMetas.add(txtMaiorqueVerm, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 630, 60, -1));
        panelMetas.add(txtMenorqueVerd, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 630, 60, -1));

        lblMeta2.setBackground(new java.awt.Color(22, 54, 92));
        lblMeta2.setForeground(new java.awt.Color(255, 255, 255));
        lblMeta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMeta2.setText("<html><center>\nMeta\n</center></html>");
        lblMeta2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblMeta2.setOpaque(true);
        panelMetas.add(lblMeta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 100, 50));

        txtComFoiEstabMeta.setColumns(20);
        txtComFoiEstabMeta.setRows(5);
        txtComFoiEstabMeta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtComFoiEstabMetaFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtComFoiEstabMeta);

        panelMetas.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 730, 90));

        chkValAbs.setText("Valor Absoluto");
        chkValAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkValAbsActionPerformed(evt);
            }
        });
        panelMetas.add(chkValAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, 30));

        chkValPer.setText("Valor %");
        chkValPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkValPerActionPerformed(evt);
            }
        });
        panelMetas.add(chkValPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, -1, 30));

        cbxPerDeMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" }));
        cbxPerDeMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPerDeMesActionPerformed(evt);
            }
        });
        panelMetas.add(cbxPerDeMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 30));

        cbxPerAMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "JAN", "FEV", "MAR", "ABR", "MAI", "JUN", "JUL", "AGO", "SET", "OUT", "NOV", "DEZ" }));
        cbxPerAMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPerAMesActionPerformed(evt);
            }
        });
        panelMetas.add(cbxPerAMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, 30));

        lblAno.setBackground(new java.awt.Color(22, 54, 92));
        lblAno.setForeground(new java.awt.Color(255, 255, 255));
        lblAno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAno.setText("<html><center>\nAno\n</center></html>");
        lblAno.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblAno.setOpaque(true);
        panelMetas.add(lblAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 120, 100, 50));

        txtAno.setEditable(false);
        panelMetas.add(txtAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 100, -1));

        tableIndicador.addTab("3. Metas", panelMetas);

        panelTipsGrafs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnt3.setText("<html><center>\nAnterior\n</center></html>");
        btnAnt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnt3ActionPerformed(evt);
            }
        });
        panelTipsGrafs.add(btnAnt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 100, -1));

        btnProx4.setText("<html><center>Próximo</center></html>");
        btnProx4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProx4ActionPerformed(evt);
            }
        });
        panelTipsGrafs.add(btnProx4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 100, -1));

        lblEscFormtTbGraf.setBackground(new java.awt.Color(22, 54, 92));
        lblEscFormtTbGraf.setForeground(new java.awt.Color(255, 255, 255));
        lblEscFormtTbGraf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscFormtTbGraf.setText("<html><center>\nEscolha a Formatação da Tabela de Gráfico\n</center></html>");
        lblEscFormtTbGraf.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEscFormtTbGraf.setOpaque(true);
        panelTipsGrafs.add(lblEscFormtTbGraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 0, 940, 30));

        lblEscTipGraf.setBackground(new java.awt.Color(22, 54, 92));
        lblEscTipGraf.setForeground(new java.awt.Color(255, 255, 255));
        lblEscTipGraf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscTipGraf.setText("<html><center>\nEscolha o Tipo de Gráfico\n</center></html>");
        lblEscTipGraf.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblEscTipGraf.setOpaque(true);
        panelTipsGrafs.add(lblEscTipGraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 60, 940, 30));

        chkNumPerc.setText("Número %");
        chkNumPerc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNumPercActionPerformed(evt);
            }
        });
        panelTipsGrafs.add(chkNumPerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, -1));

        chkNumAbs.setText("Números Absolutos");
        chkNumAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkNumAbsActionPerformed(evt);
            }
        });
        panelTipsGrafs.add(chkNumAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        cbxTipsGrafs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Real x Meta - Acumulado", "Real x Meta - Mensal", "Desvio % Mensal x Meta Mensal", "Desvio Absoluto Real x Meta Mensal" }));
        cbxTipsGrafs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipsGrafsActionPerformed(evt);
            }
        });
        panelTipsGrafs.add(cbxTipsGrafs, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 420, -1));

        tableIndicador.addTab("4. Tipos de Gráficos", panelTipsGrafs);

        panelDesdInd.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnt4.setText("<html><center>\nAnterior\n</center></html>");
        btnAnt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnt4ActionPerformed(evt);
            }
        });
        panelDesdInd.add(btnAnt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 620, 100, -1));

        lblDesdobramento2.setBackground(new java.awt.Color(22, 54, 92));
        lblDesdobramento2.setForeground(new java.awt.Color(255, 255, 255));
        lblDesdobramento2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesdobramento2.setText("<html><center>\nDesdobramento 2\n</center></html>");
        lblDesdobramento2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDesdobramento2.setOpaque(true);
        panelDesdInd.add(lblDesdobramento2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 120, 50));

        lblDesdobramento3.setBackground(new java.awt.Color(22, 54, 92));
        lblDesdobramento3.setForeground(new java.awt.Color(255, 255, 255));
        lblDesdobramento3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesdobramento3.setText("<html><center>\nDesdobramento 3\n</center></html>");
        lblDesdobramento3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDesdobramento3.setOpaque(true);
        panelDesdInd.add(lblDesdobramento3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 120, 50));

        lblDesdobramento4.setBackground(new java.awt.Color(22, 54, 92));
        lblDesdobramento4.setForeground(new java.awt.Color(255, 255, 255));
        lblDesdobramento4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesdobramento4.setText("<html><center>\nDesdobramento 4\n</center></html>");
        lblDesdobramento4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDesdobramento4.setOpaque(true);
        panelDesdInd.add(lblDesdobramento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, 50));

        lblDesdobramento5.setBackground(new java.awt.Color(22, 54, 92));
        lblDesdobramento5.setForeground(new java.awt.Color(255, 255, 255));
        lblDesdobramento5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesdobramento5.setText("<html><center>\nDesdobramento 5\n</center></html>");
        lblDesdobramento5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDesdobramento5.setOpaque(true);
        panelDesdInd.add(lblDesdobramento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 120, 50));

        lblDesdobramento1.setBackground(new java.awt.Color(22, 54, 92));
        lblDesdobramento1.setForeground(new java.awt.Color(255, 255, 255));
        lblDesdobramento1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDesdobramento1.setText("<html><center>\nDesdobramento 1\n</center></html>");
        lblDesdobramento1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblDesdobramento1.setOpaque(true);
        panelDesdInd.add(lblDesdobramento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        txtAreaDesdobramento5.setColumns(20);
        txtAreaDesdobramento5.setRows(5);
        txtAreaDesdobramento5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaDesdobramento5FocusLost(evt);
            }
        });
        jScrollPane3.setViewportView(txtAreaDesdobramento5);

        panelDesdInd.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 810, 50));

        txtAreaDesdobramento1.setColumns(20);
        txtAreaDesdobramento1.setRows(5);
        txtAreaDesdobramento1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaDesdobramento1FocusLost(evt);
            }
        });
        jScrollPane4.setViewportView(txtAreaDesdobramento1);

        panelDesdInd.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 810, 50));

        txtAreaDesdobramento2.setColumns(20);
        txtAreaDesdobramento2.setRows(5);
        txtAreaDesdobramento2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaDesdobramento2FocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(txtAreaDesdobramento2);

        panelDesdInd.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 810, 50));

        txtAreaDesdobramento3.setColumns(20);
        txtAreaDesdobramento3.setRows(5);
        txtAreaDesdobramento3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaDesdobramento3FocusLost(evt);
            }
        });
        jScrollPane6.setViewportView(txtAreaDesdobramento3);

        panelDesdInd.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 810, 50));

        txtAreaDesdobramento4.setColumns(20);
        txtAreaDesdobramento4.setRows(5);
        txtAreaDesdobramento4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAreaDesdobramento4FocusLost(evt);
            }
        });
        jScrollPane7.setViewportView(txtAreaDesdobramento4);

        panelDesdInd.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 810, 50));

        btnConcluir.setText("<html><center>\nConcluir\n</center></html>");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        panelDesdInd.add(btnConcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 620, 100, -1));

        tableIndicador.addTab("5. Desdobramento do Indicador", panelDesdInd);

        jScrollPane1.setViewportView(tableIndicador);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(0, 0, Short.MAX_VALUE)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 990, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx1ActionPerformed
        tableIndicador.setSelectedIndex(1);
    }//GEN-LAST:event_btnProx1ActionPerformed

    private void btnAnt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnt1ActionPerformed
        tableIndicador.setSelectedIndex(0);
    }//GEN-LAST:event_btnAnt1ActionPerformed

    private void btnProx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx2ActionPerformed
        tableIndicador.setSelectedIndex(2);
    }//GEN-LAST:event_btnProx2ActionPerformed

    private void btnAnt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnt2ActionPerformed
        tableIndicador.setSelectedIndex(1);
    }//GEN-LAST:event_btnAnt2ActionPerformed

    private void btnProx3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx3ActionPerformed
        tableIndicador.setSelectedIndex(3);
    }//GEN-LAST:event_btnProx3ActionPerformed

    private void btnAnt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnt3ActionPerformed
        tableIndicador.setSelectedIndex(2);
    }//GEN-LAST:event_btnAnt3ActionPerformed

    private void btnProx4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProx4ActionPerformed
        tableIndicador.setSelectedIndex(4);
    }//GEN-LAST:event_btnProx4ActionPerformed

    private void btnAnt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnt4ActionPerformed
        tableIndicador.setSelectedIndex(3);
    }//GEN-LAST:event_btnAnt4ActionPerformed

    private void txtIdentDesempFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtIdentDesempFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_INDDES";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtIdentDesemp.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtIdentDesempFocusLost

    private void txtDescricaoFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDescricaoFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_DESOBJ";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDescricao.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtDescricaoFocusLost

    private void txtUnidadeActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_txtUnidadeActionPerformed
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_UNI";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtUnidade.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtUnidadeActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUnidadeActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUnidadeActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        txtUnidade.addItem(var);
    }//GEN-LAST:event_btnUnidadeActionPerformed

    private void chkMensalActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkMensalActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_MEN";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkMensal.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkMensalActionPerformed

    private void chkBimensalActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkBimensalActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_BIM";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkBimensal.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkBimensalActionPerformed

    private void chkTrimestralActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkTrimestralActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_TRI";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkTrimestral.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkTrimestralActionPerformed

    private void chkSemestralActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkSemestralActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_SEM";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkSemestral.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkSemestralActionPerformed

    private void chkAnualActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkAnualActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_ANU";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkAnual.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkAnualActionPerformed

    private void chkBianualActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkBianualActionPerformed
        // TODO add your handling code here:
        codIndicador = "FRE_INDCOD";
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_BIA";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkBianual.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkBianualActionPerformed

    private void cbxPerspectivaActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxPerspectivaActionPerformed
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_PER";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxPerspectiva.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxPerspectivaActionPerformed

    private void txtPainelFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtPainelFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_PAI";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPainel.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPainelFocusLost

    private void txtPosicaoFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtPosicaoFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_POS";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtPosicao.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtPosicaoFocusLost

    private void txtRespMetaFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespMetaFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_RESMET";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespMeta.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespMetaFocusLost

    private void txtRespInformacaoFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespInformacaoFocusLost
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_RESINF";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespInformacao.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespInformacaoFocusLost

    private void chkGestoresActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkGestoresActionPerformed
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_GES";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkGestores.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkGestoresActionPerformed

    private void chkTodosSomIntActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkTodosSomIntActionPerformed
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_TODINT";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkTodosSomInt.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkTodosSomIntActionPerformed

    private void chkTodosActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkTodosActionPerformed
        // TODO add your handling code here:
        codIndicador = "INF_INDCOD";
        tabela = "CP_INF_GERAIS";
        campo = "INF_TOD";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkTodos.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkTodosActionPerformed

    private void txtFormCalcFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtFormCalcFocusLost
        // TODO add your handling code here:
        codIndicador = "CAL_INDCOD";
        tabela = "CP_CAL_INDICADOR";
        campo = "CAL_FORCAL";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtFormCalc.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtFormCalcFocusLost

    private void txtDado1FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado1FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado1FocusLost

    private void txtDado2FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado2FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 2;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado2FocusLost

    private void txtDado3FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado3FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 3;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado3FocusLost

    private void txtDado4FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado4FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 4;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado4FocusLost

    private void txtDado5FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado5FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 5;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado5FocusLost

    private void txtDado6FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado6FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 6;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado6.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado6.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado6FocusLost

    private void txtDado7FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado7FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 7;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado7.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado7.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado7FocusLost

    private void txtDado8FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado8FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 8;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado8.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado8.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado8FocusLost

    private void txtDado9FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado9FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 9;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado9.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado9.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado9FocusLost

    private void txtDado10FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtDado10FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_DAD";

        Info.codTb = 10;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado10.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtDado10.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtDado10FocusLost

    private void cbxUniDado1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado1ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 1;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado1.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado1ActionPerformed

    private void cbxUniDado2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado2ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 2;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado2.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado2ActionPerformed

    private void cbxUniDado3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado3ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 3;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado3.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado3ActionPerformed

    private void cbxUniDado4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado4ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 4;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado4.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado4ActionPerformed

    private void cbxUniDado5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado5ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 5;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado5.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado5ActionPerformed

    private void cbxUniDado6ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado6ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 6;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado6.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado6ActionPerformed

    private void cbxUniDado7ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado7ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 7;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado7.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado7ActionPerformed

    private void cbxUniDado8ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado8ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 8;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado8.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado8ActionPerformed

    private void cbxUniDado9ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado9ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 9;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado9.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado9ActionPerformed

    private void cbxUniDado10ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxUniDado10ActionPerformed
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_UNIDAD";

        Info.codTb = 10;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxUniDado10.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxUniDado10ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado1ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado1.addItem(var);
    }//GEN-LAST:event_btnUniDado1ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado2ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado2ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado2.addItem(var);
    }//GEN-LAST:event_btnUniDado2ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado3ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado3ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado3.addItem(var);
    }//GEN-LAST:event_btnUniDado3ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado4ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado4ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado4.addItem(var);
    }//GEN-LAST:event_btnUniDado4ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado5ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado5ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado5.addItem(var);
    }//GEN-LAST:event_btnUniDado5ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado6ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado6ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado6.addItem(var);
    }//GEN-LAST:event_btnUniDado6ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado7ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado7ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado7.addItem(var);
    }//GEN-LAST:event_btnUniDado7ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado8ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado8ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado8.addItem(var);
    }//GEN-LAST:event_btnUniDado8ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado9ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado9ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado9.addItem(var);
    }//GEN-LAST:event_btnUniDado9ActionPerformed

    @SuppressWarnings("unchecked")
    private void btnUniDado10ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnUniDado10ActionPerformed
        // TODO add your handling code here:
        String var = "";
        var = JOptionPane.showInputDialog(var);

        cbxUniDado10.addItem(var);
    }//GEN-LAST:event_btnUniDado10ActionPerformed

    private void txtRespDado1FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado1FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 1;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado1FocusLost

    private void txtRespDado2FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado2FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 2;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado2FocusLost

    private void txtRespDado3FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado3FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 3;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado3FocusLost

    private void txtRespDado4FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado4FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 4;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado4FocusLost

    private void txtRespDado5FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado5FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 5;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado5FocusLost

    private void txtRespDado6FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado6FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 6;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado6.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado6FocusLost

    private void txtRespDado7FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado7FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 7;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado7.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado7FocusLost

    private void txtRespDado8FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado8FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 8;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado8.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado8FocusLost

    private void txtRespDado9FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado9FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 9;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado9.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado9FocusLost

    private void txtRespDado10FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtRespDado10FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_RESDAD";

        Info.codTb = 10;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRespDado10.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtRespDado10FocusLost

    private void txtAreaOrig1FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig1FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 1;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig1FocusLost

    private void txtAreaOrig2FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig2FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 2;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig2FocusLost

    private void txtAreaOrig3FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig3FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 3;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig3FocusLost

    private void txtAreaOrig4FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig4FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 4;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig4FocusLost

    private void txtAreaOrig5FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig5FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 5;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig5FocusLost

    private void txtAreaOrig6FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig6FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 6;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig6.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig6FocusLost

    private void txtAreaOrig7FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig7FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 7;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig7.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig7FocusLost

    private void txtAreaOrig8FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig8FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 8;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig8.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig8FocusLost

    private void txtAreaOrig9FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig9FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 9;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig9.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig9FocusLost

    private void txtAreaOrig10FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaOrig10FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_AREDAD";

        Info.codTb = 10;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaOrig10.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtAreaOrig10FocusLost

    private void txtObserv1FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv1FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 1;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv1FocusLost

    private void txtObserv2FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv2FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 2;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv2FocusLost

    private void txtObserv3FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv3FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 3;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv3FocusLost

    private void txtObserv4FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv4FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 4;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv4FocusLost

    private void txtObserv5FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv5FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 5;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv5FocusLost

    private void txtObserv6FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv6FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 6;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv6.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv6FocusLost

    private void txtObserv7FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv7FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 7;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv7.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv7FocusLost

    private void txtObserv8FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv8FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 8;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv8.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv8FocusLost

    private void txtObserv9FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv9FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 9;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv9.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv9FocusLost

    private void txtObserv10FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObserv10FocusLost
        // TODO add your handling code here:
        codIndicador = "DAD_INDCOD";
        tabela = "CP_CAL_DADO";
        codTab = "DAD_COD";
        campo = "DAD_OBS";

        Info.codTb = 10;

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObserv10.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObserv10FocusLost

    private void chkAcumAoLongPeriodoActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkAcumAoLongPeriodoActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_ACUPER";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkAcumAoLongPeriodo.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkAcumAoLongPeriodoActionPerformed

    private void chkAcum12UltMesesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkAcum12UltMesesActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_ACUMES";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkAcum12UltMeses.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkAcum12UltMesesActionPerformed

    private void chkVlFixoLongPeriodoActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkVlFixoLongPeriodoActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_VALFIX";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkVlFixoLongPeriodo.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkVlFixoLongPeriodoActionPerformed

    private void chk74ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk74ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEL";

        if(chk74.isSelected() != false){
            chk75e94.setSelected(true);
            chk95e99.setSelected(true);
            chk100e119.setSelected(true);
            chk120.setSelected(true);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk75e94.setSelected(false);
            chk95e99.setSelected(false);
            chk100e119.setSelected(false);
            chk120.setSelected(false);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk74.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);

    }//GEN-LAST:event_chk74ActionPerformed

    private void chk75e94ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk75e94ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEL";

        if(chk75e94.isSelected() != false){
            chk74.setSelected(true);
            chk95e99.setSelected(true);
            chk100e119.setSelected(true);
            chk120.setSelected(true);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk74.setSelected(false);
            chk95e99.setSelected(false);
            chk100e119.setSelected(false);
            chk120.setSelected(false);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk75e94.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk75e94ActionPerformed

    private void chk120ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk120ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEL";

        if(chk120.isSelected() != false){
            chk74.setSelected(true);
            chk75e94.setSelected(true);
            chk95e99.setSelected(true);
            chk100e119.setSelected(true);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk74.setSelected(false);
            chk75e94.setSelected(false);
            chk95e99.setSelected(false);
            chk100e119.setSelected(false);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk120.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk120ActionPerformed

    private void chk125ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk125ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMEL";

        if(chk125.isSelected() != false){
            chk125e105.setSelected(true);
            chk105e100.setSelected(true);
            chk100e80.setSelected(true);
            chk80.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk125e105.setSelected(false);
            chk105e100.setSelected(false);
            chk100e80.setSelected(false);
            chk80.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk125.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk125ActionPerformed

    private void chk125e105ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk125e105ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMEL";

        if(chk125e105.isSelected() != false){
            chk125.setSelected(true);
            chk105e100.setSelected(true);
            chk100e80.setSelected(true);
            chk80.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk125.setSelected(false);
            chk105e100.setSelected(false);
            chk100e80.setSelected(false);
            chk80.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk125e105.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk125e105ActionPerformed

    private void chk105e100ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk105e100ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMEL";

        if(chk105e100.isSelected() != false){
            chk125.setSelected(true);
            chk125e105.setSelected(true);
            chk100e80.setSelected(true);
            chk80.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk125.setSelected(false);
            chk125e105.setSelected(false);
            chk100e80.setSelected(false);
            chk80.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk105e100.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk105e100ActionPerformed

    private void chk100e80ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk100e80ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMEL";

        if(chk100e80.isSelected() != false){
            chk125.setSelected(true);
            chk125e105.setSelected(true);
            chk105e100.setSelected(true);
            chk80.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk125.setSelected(false);
            chk125e105.setSelected(false);
            chk105e100.setSelected(false);
            chk80.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk100e80.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk100e80ActionPerformed

    private void chk80ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk80ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMEL";

        if(chk80.isSelected() != false){
            chk125.setSelected(true);
            chk125e105.setSelected(true);
            chk105e100.setSelected(true);
            chk100e80.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk125.setSelected(false);
            chk125e105.setSelected(false);
            chk105e100.setSelected(false);
            chk100e80.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk80.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk80ActionPerformed

    private void chk95e99ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk95e99ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEL";

        if(chk95e99.isSelected() != false){
            chk74.setSelected(true);
            chk75e94.setSelected(true);
            chk100e119.setSelected(true);
            chk120.setSelected(true);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk74.setSelected(false);
            chk75e94.setSelected(false);
            chk100e119.setSelected(false);
            chk120.setSelected(false);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk95e99.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk95e99ActionPerformed

    private void chk100e119ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chk100e119ActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEL";

        if(chk100e119.isSelected() != false){
            chk74.setSelected(true);
            chk75e94.setSelected(true);
            chk95e99.setSelected(true);
            chk120.setSelected(true);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chk74.setSelected(false);
            chk75e94.setSelected(false);
            chk95e99.setSelected(false);
            chk120.setSelected(false);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);

            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chk100e119.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chk100e119ActionPerformed

    private void chkMenorqueVermActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkMenorqueVermActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMAI";

        if(chkMenorqueVerm.isSelected() != false){
            chkMaiorqueVerd.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chkMaiorqueVerd.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);


            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkMenorqueVerm.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkMenorqueVermActionPerformed

    private void chkMaiorqueVerdActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkMaiorqueVerdActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MENMAI";

        if(chkMaiorqueVerd.isSelected() != false){
            chkMenorqueVerm.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerd.setEnabled(false);
            chkMaiorqueVerm.setEnabled(false);
        }else{
            chkMenorqueVerm.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);


            chkMenorqueVerd.setEnabled(true);
            chkMaiorqueVerm.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkMaiorqueVerd.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkMaiorqueVerdActionPerformed

    private void chkMaiorqueVermActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkMaiorqueVermActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEN";

        if(chkMaiorqueVerm.isSelected() != false){
            chkMenorqueVerd.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
        }else{
            chkMenorqueVerd.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);


            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkMaiorqueVerm.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkMaiorqueVermActionPerformed

    private void chkMenorqueVerdActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkMenorqueVerdActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_MAIMEN";

        if(chkMenorqueVerd.isSelected() != false){
            chkMaiorqueVerm.setSelected(true);

            chk74.setEnabled(false);
            chk75e94.setEnabled(false);
            chk95e99.setEnabled(false);
            chk100e119.setEnabled(false);
            chk120.setEnabled(false);

            chk125.setEnabled(false);
            chk125e105.setEnabled(false);
            chk105e100.setEnabled(false);
            chk100e80.setEnabled(false);
            chk80.setEnabled(false);

            chkMenorqueVerm.setEnabled(false);
            chkMaiorqueVerd.setEnabled(false);
        }else{
            chkMaiorqueVerm.setSelected(false);

            chk74.setEnabled(true);
            chk75e94.setEnabled(true);
            chk95e99.setEnabled(true);
            chk100e119.setEnabled(true);
            chk120.setEnabled(true);

            chk125.setEnabled(true);
            chk125e105.setEnabled(true);
            chk105e100.setEnabled(true);
            chk100e80.setEnabled(true);
            chk80.setEnabled(true);


            chkMenorqueVerm.setEnabled(true);
            chkMaiorqueVerd.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkMenorqueVerd.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkMenorqueVerdActionPerformed

    private void cbxPerDeMesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxPerDeMesActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_PERDE";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxPerDeMes.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxPerDeMesActionPerformed

    private void cbxPerAMesActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxPerAMesActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_PERA";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxPerAMes.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxPerAMesActionPerformed

    private void chkValPerActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkValPerActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_VALPER";

        if(chkValPer.isSelected() != false){
            chkValAbs.setEnabled(false);
        }else{
            chkValAbs.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkValPer.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkValPerActionPerformed

    private void chkValAbsActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkValAbsActionPerformed
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_VALABS";

        if(chkValAbs.isSelected() != false){
            chkValPer.setEnabled(false);
        }else{
            chkValPer.setEnabled(true);
        }

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkValAbs.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkValAbsActionPerformed

    private void txtObservacoesFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtObservacoesFocusLost
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_OBS";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtObservacoes.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtObservacoesFocusLost

    private void txtComFoiEstabMetaFocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtComFoiEstabMetaFocusLost
        // TODO add your handling code here:
        codIndicador = "CHK_INDCOD";
        tabela = "CP_META_CHK";
        codTab = "CHK_COD";
        campo = "CHK_COMMET";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtComFoiEstabMeta.getText() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_txtComFoiEstabMetaFocusLost

    private void btnAddMetaActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnAddMetaActionPerformed
        // TODO add your handling code here:
        codIndicador = "MET_INDCOD";
        tabela = "CP_META";
        codTab = "MET_COD";
        int chk;
        String strChk = "";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND MET_VERMET = 1";
        aux = Info.objConexao.getIndCod(select, "MET_VERMET", aux);

        if(aux == 1){
            chk = JOptionPane.showConfirmDialog(meta, "Meta Sobre Receita Líquida?", "Meta", JOptionPane.YES_NO_OPTION);
            meta = new Meta();
            meta.setVerMet(1);
            if(chk == 1){
                meta.setVisibleCamposFalse();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor acumulado:");
                meta.setData();
                meta.setVisible(true);
                Info.metaAux = "Meta";
            }else if(chk == 0){
                meta.setVisibleCamposTrue();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor / RL:");
                meta.setData();
                meta.setMetRl();
                meta.setVisible(true);
                Info.metaAux = "Meta / Receita Liquida";
            }
        }else{
            chk = JOptionPane.showConfirmDialog(meta, "Deseja editar a Meta?", "Meta", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                chk = JOptionPane.showConfirmDialog(meta, "Meta Sobre Receita Líquida?", "Meta", JOptionPane.YES_NO_OPTION);
                meta = new Meta();
                meta.setVerMet(2);

                if(chk == 1){
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setData();
                    meta.setVisible(true);
                    Info.metaAux = "Meta";
                }else if(chk == 0){
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setData();
                    meta.setMetRl();
                    meta.setVisible(true);
                    Info.metaAux = "Meta / Receita Liquida";
                }
            }else if(chk == 0){
                campo = "MET_TIPMET";
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
                strChk = Info.objConexao.getBD(select, campo);
                meta = new Meta();
                meta.setVerMet(1);

                if("Meta / Receita Liquida".equals(strChk)){
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setData();
                    meta.setMetRl();
                    meta.setEditarMetaRl();
                    meta.setVisible(true);
                    Info.metaAux = "Meta / Receita Liquida";
                }else{
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setData();
                    meta.setEditarMetaInd();
                    meta.setVisible(true);
                    Info.metaAux = "Meta";
                }
            }
        }
    }//GEN-LAST:event_btnAddMetaActionPerformed

    private void cbxMetasActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxMetasActionPerformed
        // TODO add your handling code here:
        if(cbxMetas.getSelectedIndex() == 1){
            codIndicador = "MET_INDCOD";
            tabela = "CP_META";
            codTab = "MET_COD";

            Info.codTb = 1;
            //Meta
            campo = "MET_MET";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtMeta.setText(Info.objConexao.getBD(select, campo));

            //Valor Acumulado Absoluto
            campo = "MET_VALACUABS";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumAbs.setText(Info.objConexao.getBD(select, campo));

            //Versão
            campo = "MET_VERMET";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVer.setText(Info.objConexao.getBD(select, campo));

            //Ano
            campo = "MET_ANOREF";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtAno.setText(Info.objConexao.getBD(select, campo));

            //Janeiro
            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlJaneiro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumJaneiro.setText(Info.objConexao.getBD(select, campo));

            //Fevereiro
            Info.codTb = 2;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlFevereiro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumFevereiro.setText(Info.objConexao.getBD(select, campo));

            //Marco
            Info.codTb = 3;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlMarco.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumMarco.setText(Info.objConexao.getBD(select, campo));

            //Abril
            Info.codTb = 4;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAbril.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumAbril.setText(Info.objConexao.getBD(select, campo));

            //Maio
            Info.codTb = 5;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlMaio.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumMaio.setText(Info.objConexao.getBD(select, campo));

            //Junho
            Info.codTb = 6;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlJunho.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumJunho.setText(Info.objConexao.getBD(select, campo));

            //Julho
            Info.codTb = 7;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlJulho.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumJulho.setText(Info.objConexao.getBD(select, campo));

            //Agosto
            Info.codTb = 8;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAgosto.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumAgosto.setText(Info.objConexao.getBD(select, campo));

            //Setembro
            Info.codTb = 9;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlSetembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumSetembro.setText(Info.objConexao.getBD(select, campo));

            //Outubro
            Info.codTb = 10;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlOutubro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumOutubro.setText(Info.objConexao.getBD(select, campo));

            //Novembro
            Info.codTb = 11;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlNovembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumNovembro.setText(Info.objConexao.getBD(select, campo));

            //Dezembro
            Info.codTb = 12;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlDezembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 1";
            txtVlAcumDezembro.setText(Info.objConexao.getBD(select, campo));

        }else if(cbxMetas.getSelectedIndex() == 2){
            codIndicador = "MET_INDCOD";
            tabela = "CP_META";
            codTab = "MET_COD";

            Info.codTb = 1;
            //Meta
            campo = "MET_MET";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtMeta.setText(Info.objConexao.getBD(select, campo));

            //Valor Acumulado Absoluto
            campo = "MET_VALACUABS";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumAbs.setText(Info.objConexao.getBD(select, campo));

            //Versão
            campo = "MET_VERMET";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVer.setText(Info.objConexao.getBD(select, campo));

            //Ano
            campo = "MET_ANOREF";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtAno.setText(Info.objConexao.getBD(select, campo));

            //Janeiro
            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlJaneiro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumJaneiro.setText(Info.objConexao.getBD(select, campo));

            //Fevereiro
            Info.codTb = 2;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlFevereiro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumFevereiro.setText(Info.objConexao.getBD(select, campo));

            //Marco
            Info.codTb = 3;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlMarco.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumMarco.setText(Info.objConexao.getBD(select, campo));

            //Abril
            Info.codTb = 4;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAbril.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumAbril.setText(Info.objConexao.getBD(select, campo));

            //Maio
            Info.codTb = 5;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlMaio.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumMaio.setText(Info.objConexao.getBD(select, campo));

            //Junho
            Info.codTb = 6;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlJunho.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumJunho.setText(Info.objConexao.getBD(select, campo));

            //Julho
            Info.codTb = 7;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlJulho.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumJulho.setText(Info.objConexao.getBD(select, campo));

            //Agosto
            Info.codTb = 8;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAgosto.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumAgosto.setText(Info.objConexao.getBD(select, campo));

            //Setembro
            Info.codTb = 9;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlSetembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumSetembro.setText(Info.objConexao.getBD(select, campo));

            //Outubro
            Info.codTb = 10;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlOutubro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumOutubro.setText(Info.objConexao.getBD(select, campo));

            //Novembro
            Info.codTb = 11;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlNovembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumNovembro.setText(Info.objConexao.getBD(select, campo));

            //Dezembro
            Info.codTb = 12;

            campo = "MET_VAL";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlDezembro.setText(Info.objConexao.getBD(select, campo));

            campo = "MET_VALACU";
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb + " AND MET_VERMET = 2";
            txtVlAcumDezembro.setText(Info.objConexao.getBD(select, campo));
        }
    }//GEN-LAST:event_cbxMetasActionPerformed

    private void chkNumAbsActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkNumAbsActionPerformed
        // TODO add your handling code here:
        codIndicador = "GRA_INDCOD";
        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMABS";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkNumAbs.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkNumAbsActionPerformed

    private void chkNumPercActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_chkNumPercActionPerformed
        // TODO add your handling code here:
        codIndicador = "GRA_INDCOD";
        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkNumPerc.isSelected() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_chkNumPercActionPerformed

    private void cbxTipsGrafsActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_cbxTipsGrafsActionPerformed
        // TODO add your handling code here:

        codIndicador = "GRA_INDCOD";
        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_GRA";

        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxTipsGrafs.getSelectedItem() + "' WHERE " + codIndicador + " = " + Info.codInd;
        Info.objConexao.setBD(insert);
    }//GEN-LAST:event_cbxTipsGrafsActionPerformed

    private void txtAreaDesdobramento1FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaDesdobramento1FocusLost
        // TODO add your handling code here:
        codIndicador = "DES_INDCOD";
        tabela = "CP_DES_INDICADOR";
        codTab = "DES_COD";
        campo = "DES_DES";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento1.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtAreaDesdobramento1FocusLost

    private void txtAreaDesdobramento2FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaDesdobramento2FocusLost
        // TODO add your handling code here:
        codIndicador = "DES_INDCOD";
        tabela = "CP_DES_INDICADOR";
        codTab = "DES_COD";
        campo = "DES_DES";

        Info.codTb = 2;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento2.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtAreaDesdobramento2FocusLost

    private void txtAreaDesdobramento3FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaDesdobramento3FocusLost
        // TODO add your handling code here:
        codIndicador = "DES_INDCOD";
        tabela = "CP_DES_INDICADOR";
        codTab = "DES_COD";
        campo = "DES_DES";

        Info.codTb = 3;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento3.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtAreaDesdobramento3FocusLost

    private void txtAreaDesdobramento4FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaDesdobramento4FocusLost
        // TODO add your handling code here:
        codIndicador = "DES_INDCOD";
        tabela = "CP_DES_INDICADOR";
        codTab = "DES_COD";
        campo = "DES_DES";

        Info.codTb = 4;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento4.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtAreaDesdobramento4FocusLost

    private void txtAreaDesdobramento5FocusLost(java.awt.event.FocusEvent evt){//GEN-FIRST:event_txtAreaDesdobramento5FocusLost
        // TODO add your handling code here:
        codIndicador = "DES_INDCOD";
        tabela = "CP_DES_INDICADOR";
        codTab = "DES_COD";
        campo = "DES_DES";

        Info.codTb = 5;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + codIndicador + ", " + codTab + ") values (" + Info.codInd + ", " + Info.codTb + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }else{
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAreaDesdobramento5.getText() + "' WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
            Info.objConexao.setBD(insert);
        }
    }//GEN-LAST:event_txtAreaDesdobramento5FocusLost

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnConcluirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnConcluirActionPerformed

    private void btnDadosReaisActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnDadosReaisActionPerformed
        // TODO add your handling code here:
        codIndicador = "VAL_INDCOD";
        tabela = "CP_VAL_REAIS";
        codTab = "VAL_COD";
        int chk;
        String strChk = "";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, codTab, aux);

        if(aux == 1){
            chk = JOptionPane.showConfirmDialog(meta, "Valores Reais Sobre Receita Líquida?", "Meta", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                meta = new Meta();
                meta.setVisibleCamposFalse();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor acumulado:");
                meta.setReaisReceitaLiquida();
                meta.setData();
                meta.setVisible(true);
                Info.metaAux = "Reais";
            }else if(chk == 0){
                meta = new Meta();
                meta.setVisibleCamposTrue();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor / RL:");
                meta.setReaisReceitaLiquida();
                meta.setData();
                meta.setValRl();
                meta.setVisible(true);
                Info.metaAux = "Reais / Receita Liquida";
            }
        }else{
            chk = JOptionPane.showConfirmDialog(meta, "Deseja editar os Valores Reais?", "Meta", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                chk = JOptionPane.showConfirmDialog(meta, "Valores Reais Sobre Receita Líquida?", "Meta", JOptionPane.YES_NO_OPTION);

                if(chk == 1){
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setReaisReceitaLiquida();
                    meta.setData();
                    meta.setVisible(true);
                    Info.metaAux = "Reais";
                }else if(chk == 0){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setReaisReceitaLiquida();
                    meta.setData();
                    meta.setValRl();
                    meta.setVisible(true);
                    Info.metaAux = "Reais / Receita Liquida";
                }
            }else if(chk == 0){
                campo = "VAL_TIPVAL";
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
                strChk = Info.objConexao.getBD(select, campo);

                if("Real / Receita Liquida".equals(strChk)){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setReaisReceitaLiquida();
                    meta.setData();
                    meta.setValRl();
                    meta.setEditarValRl();
                    meta.setVisible(true);
                    Info.metaAux = "Reais / Receita Liquida";
                }else{
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setReaisReceitaLiquida();
                    meta.setData();
                    meta.setEditarVal();
                    meta.setVisible(true);
                    Info.metaAux = "Reais";
                }
            }
        }
    }//GEN-LAST:event_btnDadosReaisActionPerformed

    private void btnDadosHistoricosActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnDadosHistoricosActionPerformed
        // TODO add your handling code here:
        codIndicador = "HIS_INDCOD";
        tabela = "CP_HISTORICO";
        codTab = "HIS_COD";
        campo = "HIS_COD";

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, codTab, aux);

        if(aux == 1){
            meta = new Meta();
            meta.setVisibleCamposFalse();
            meta.setBounds(160, 40, 560, 620);
            meta.setLblVlAcum("valor acumulado:");
            meta.setHistorico();
            meta.setVisible(true);
            Info.metaAux = "Historico";
        }else{
            meta = new Meta();
            meta.setVisibleCamposFalse();
            meta.setBounds(160, 40, 560, 620);
            meta.setLblVlAcum("valor acumulado:");
            meta.setHistorico();
            meta.setEditarHistorico();
            meta.setVisible(true);
            Info.metaAux = "Historico";
        }
    }//GEN-LAST:event_btnDadosHistoricosActionPerformed

    private void btnForecastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForecastActionPerformed
        // TODO add your handling code here:
        codIndicador = "FOR_INDCOD";
        tabela = "CP_FORECAST";
        codTab = "FOR_COD";
        int chk;
        String strChk = "";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, codTab, aux);

        if(aux == 1){
            chk = JOptionPane.showConfirmDialog(meta, "Forecast Sobre Receita Líquida?", "Forecast", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                meta = new Meta();
                meta.setVisibleCamposFalse();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor acumulado:");
                meta.setForecast();
                meta.setVisible(true);
                Info.metaAux = "Forecast";
            }else if(chk == 0){
                meta = new Meta();
                meta.setVisibleCamposTrue();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor / RL:");
                meta.setForecast();
                meta.setValRlForecast();
                meta.setVisible(true);
                Info.metaAux = "Forecast / Receita Liquida";
            }
        }else{
            chk = JOptionPane.showConfirmDialog(meta, "Deseja editar o Forecast?", "Forecast", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                chk = JOptionPane.showConfirmDialog(meta, "Forecast Sobre Receita Líquida?", "Forecast", JOptionPane.YES_NO_OPTION);

                if(chk == 1){
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setForecast();
                    meta.setVisible(true);
                    Info.metaAux = "Forecast";
                }else if(chk == 0){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setForecast();
                    meta.setValRlForecast();
                    meta.setVisible(true);
                    Info.metaAux = "Forecast / Receita Liquida";
                }
            }else if(chk == 0){
                campo = "FOR_TIPFOR";
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
                strChk = Info.objConexao.getBD(select, campo);

                if("Forecast / Receita Liquida".equals(strChk)){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setForecast();
                    meta.setValRlForecast();
                    meta.setEditarForecastRl();
                    meta.setVisible(true);
                    Info.metaAux = "Forecast / Receita Liquida";
                }else{
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setForecast();
                    meta.setEditarForecast();
                    meta.setVisible(true);
                    Info.metaAux = "Forecast";
                }
            }
        }
    }//GEN-LAST:event_btnForecastActionPerformed

    private void btnValorIdealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValorIdealActionPerformed
        // TODO add your handling code here:
        codIndicador = "IDE_INDCOD";
        tabela = "CP_VAL_IDEAL";
        codTab = "IDE_COD";
        int chk;
        String strChk = "";

        Info.codTb = 1;

        select = "SELECT * FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        aux = Info.objConexao.getIndCod(select, codTab, aux);

        if(aux == 1){
            chk = JOptionPane.showConfirmDialog(meta, "Valor Ideal Sobre Receita Líquida?", "Valor Ideal", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                meta = new Meta();
                meta.setVisibleCamposFalse();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor acumulado:");
                meta.setValorIdeal();
                meta.setVisible(true);
                Info.metaAux = "Valor Ideal";
            }else if(chk == 0){
                meta = new Meta();
                meta.setVisibleCamposTrue();
                meta.setBounds(160, 40, 560, 620);
                meta.setLblVlAcum("valor / RL:");
                meta.setValorIdeal();
                meta.setValorIdealReceitaLiquida();
                meta.setVisible(true);
                Info.metaAux = "Valor Ideal / Receita Liquida";
            }
        }else{
            chk = JOptionPane.showConfirmDialog(meta, "Deseja editar os Valores Ideais?", "Valor Ideal", JOptionPane.YES_NO_OPTION);

            if(chk == 1){
                chk = JOptionPane.showConfirmDialog(meta, "Valor Ideal Sobre Receita Líquida?", "Valor Ideal", JOptionPane.YES_NO_OPTION);

                if(chk == 1){
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setValorIdeal();
                    meta.setVisible(true);
                    Info.metaAux = "Valor Ideal";
                }else if(chk == 0){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setValorIdeal();
                    meta.setValorIdealReceitaLiquida();
                    meta.setVisible(true);
                    Info.metaAux = "Valor Ideal / Receita Liquida";
                }
            }else if(chk == 0){
                campo = "IDE_TIPIDE";
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
                strChk = Info.objConexao.getBD(select, campo);

                if("Forecast / Receita Liquida".equals(strChk)){
                    meta = new Meta();
                    meta.setVisibleCamposTrue();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor / RL:");
                    meta.setValorIdeal();
                    meta.setValorIdealReceitaLiquida();
                    meta.setEditarValorIdealRL();
                    meta.setVisible(true);
                    Info.metaAux = "Valor Ideal / Receita Liquida";
                }else{
                    meta = new Meta();
                    meta.setVisibleCamposFalse();
                    meta.setBounds(160, 40, 560, 620);
                    meta.setLblVlAcum("valor acumulado:");
                    meta.setValorIdeal();
                    meta.setEditarValorIdeal();
                    meta.setVisible(true);
                    Info.metaAux = "Valor Ideal";
                }
            }
        }
    }//GEN-LAST:event_btnValorIdealActionPerformed

    private void txtIdentDesempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentDesempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentDesempActionPerformed

    @SuppressWarnings("unchecked")
    public void setCombo(String meta){
        cbxMetas.addItem(meta);
    }

    public void setNewCod(){
        //Tabela INFORMACOES GERAIS
        tabela = "CP_INF_GERAIS";
        campo = "INF_INDCOD";

        select = "SELECT * FROM CP_INF_GERAIS";
        Info.codInd = Info.objConexao.getIndCod(select, campo, Info.codInd);

        insert = "INSERT INTO " + tabela + " (" + campo + ") values (" + Info.codInd + ")";
        Info.objConexao.setBD(insert);

        //Tabela FREQUECIA ATUALIZACAO
        tabela = "CP_FREQ_ATUALIZACAO";
        campo = "FRE_INDCOD";

        insert = "INSERT INTO " + tabela + " (" + campo + ") values (" + Info.codInd + ")";
        Info.objConexao.setBD(insert);

        //Tabela CALCULO INDICADOR
        tabela = "CP_CAL_INDICADOR";
        campo = "CAL_INDCOD";

        insert = "INSERT INTO " + tabela + " (" + campo + ") values (" + Info.codInd + ")";
        Info.objConexao.setBD(insert);

        //Meta CHK
        tabela = "CP_META_CHK";
        campo = "CHK_INDCOD";

        insert = "INSERT INTO " + tabela + " (" + campo + ") values (" + Info.codInd + ")";
        Info.objConexao.setBD(insert);


        //Tabela TIPO GRAFICO
        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_INDCOD";

        insert = "INSERT INTO " + tabela + " (" + campo + ") values (" + Info.codInd + ")";
        Info.objConexao.setBD(insert);

        txtCod.setText(String.valueOf(Info.codInd));
    }

    public void setCod(int cod){
        Info.codInd = cod;
        txtCod.setText(String.valueOf(Info.codInd));

        setEditar();
    }

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new Indicadores().setVisible(true);
            }

        });
    }

    @SuppressWarnings("unchecked")
    public void setEditar(){
        boolean check;
        String strAux;
        int intAux = 0;

        ///////////////////////// CP_INF_GERAIS /////////////////////////
        tabela = "CP_INF_GERAIS";
        codIndicador = "INF_INDCOD";

        //Indicador de Desempenho
        campo = "INF_INDDES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtIdentDesemp.setText(Info.objConexao.getBD(select, campo));

        //Descrição do Objetivo
        campo = "INF_DESOBJ";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtDescricao.setText(Info.objConexao.getBD(select, campo));

        //Unidade
        campo = "INF_UNI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtUnidade.setSelectedItem(Info.objConexao.getBD(select, campo));

        //Perspectiva
        campo = "INF_PER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        cbxPerspectiva.setSelectedItem(Info.objConexao.getBD(select, campo));

        //Painel
        campo = "INF_PAI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtPainel.setText(Info.objConexao.getBD(select, campo));

        //Posição
        campo = "INF_POS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtPosicao.setText(Info.objConexao.getBD(select, campo));

        //Responsável pela Meta
        campo = "INF_RESMET";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtRespMeta.setText(Info.objConexao.getBD(select, campo));

        //Responsável pela Informação
        campo = "INF_RESINF";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtRespInformacao.setText(Info.objConexao.getBD(select, campo));

        //Gestores
        campo = "INF_GES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkGestores.setSelected(check);

        //Todos somente Interno
        campo = "INF_TODINT";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkTodosSomInt.setSelected(check);

        //Todos
        campo = "INF_TOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkTodos.setSelected(check);

        ///////////////////////// CP_FREQ_ATUALIZACAO /////////////////////////
        tabela = "CP_FREQ_ATUALIZACAO";
        codIndicador = "FRE_INDCOD";

        //Frequência Mensal
        campo = "FRE_MEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkMensal.setSelected(check);

        //Frequência Bimensal
        campo = "FRE_BIM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkBimensal.setSelected(check);

        //Frequência Trimestral
        campo = "FRE_TRI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkTrimestral.setSelected(check);

        //Frequência Semestral
        campo = "FRE_SEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkSemestral.setSelected(check);

        //Frequência Anual
        campo = "FRE_ANU";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkAnual.setSelected(check);

        //Frequência Bianual
        campo = "FRE_ANU";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkBianual.setSelected(check);

        ///////////////////////// CP_CAL_INDICADOR /////////////////////////
        tabela = "CP_CAL_INDICADOR";
        codIndicador = "CAL_INDCOD";

        //Froma de Cálculo
        campo = "CAL_FORCAL";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtFormCalc.setText(Info.objConexao.getBD(select, campo));

        ///////////////////////// CP_CAL_DADO /////////////////////////
        tabela = "CP_CAL_DADO";
        codIndicador = "DAD_INDCOD";
        codTab = "DAD_COD";

        //Dado 1
        Info.codTb = 1;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);

        if(intAux == 2){
            txtDado1.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 2
        Info.codTb = 2;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado2.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 3
        Info.codTb = 3;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado3.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 4
        Info.codTb = 4;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado4.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 5
        Info.codTb = 5;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado5.setText(Info.objConexao.getBD(select, campo));
        }


        //Dado 6
        Info.codTb = 6;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado6.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 7
        Info.codTb = 7;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado7.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 8
        Info.codTb = 8;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado8.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 9
        Info.codTb = 9;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado9.setText(Info.objConexao.getBD(select, campo));
        }

        //Dado 10
        Info.codTb = 10;
        campo = "DAD_DAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtDado10.setText(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 1
        Info.codTb = 1;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado1.setSelectedItem(Info.objConexao.getBD(select, campo));
        }


        //Unidade do Dado 2
        Info.codTb = 2;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado2.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 3
        Info.codTb = 3;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado3.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 4
        Info.codTb = 4;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado4.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 5
        Info.codTb = 5;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado5.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 6
        Info.codTb = 6;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado6.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 7
        Info.codTb = 7;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado7.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 8
        Info.codTb = 8;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado8.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 9
        Info.codTb = 9;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado9.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Unidade do Dado 10
        Info.codTb = 10;
        campo = "DAD_UNIDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            cbxUniDado10.setSelectedItem(Info.objConexao.getBD(select, campo));
        }

        //Responsável pelo Dado 1
        Info.codTb = 1;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado1.setText(Info.objConexao.getBD(select, campo));
        }

        //Responsável pelo Dado 2
        Info.codTb = 2;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado2.setText(Info.objConexao.getBD(select, campo));
        }

        //Responsável pelo Dado 3
        Info.codTb = 3;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado3.setText(Info.objConexao.getBD(select, campo));
        }

        //Responsável pelo Dado 4
        Info.codTb = 4;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado4.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 5
        Info.codTb = 5;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado5.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 6
        Info.codTb = 6;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado6.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 7
        Info.codTb = 7;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado7.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 8
        Info.codTb = 8;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado8.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 9
        Info.codTb = 9;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado9.setText(Info.objConexao.getBD(select, campo));
        }


        //Responsável pelo Dado 10
        Info.codTb = 10;
        campo = "DAD_RESDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtRespDado10.setText(Info.objConexao.getBD(select, campo));
        }


        //Área Dado 1
        Info.codTb = 1;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig1.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 2
        Info.codTb = 2;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig2.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 3
        Info.codTb = 3;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig3.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 4
        Info.codTb = 4;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig4.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 5
        Info.codTb = 5;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig5.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 6
        Info.codTb = 6;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig6.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 7
        Info.codTb = 7;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig7.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 8
        Info.codTb = 8;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig8.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 9
        Info.codTb = 9;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig9.setText(Info.objConexao.getBD(select, campo));
        }

        //Área Dado 10
        Info.codTb = 10;
        campo = "DAD_AREDAD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaOrig10.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 1
        Info.codTb = 1;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv1.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 2
        Info.codTb = 2;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv2.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 3
        Info.codTb = 3;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv3.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 4
        Info.codTb = 4;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv4.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 5
        Info.codTb = 5;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv5.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 6
        Info.codTb = 6;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv6.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 7
        Info.codTb = 7;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv7.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 8
        Info.codTb = 8;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv8.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 9
        Info.codTb = 9;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv9.setText(Info.objConexao.getBD(select, campo));
        }

        //Observação sobre o Dado 10
        Info.codTb = 10;
        campo = "DAD_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtObserv10.setText(Info.objConexao.getBD(select, campo));
        }

        ///////////////////////// CP_META_CHK /////////////////////////
        tabela = "CP_META_CHK";
        codIndicador = "CHK_INDCOD";

        //Acumulada ao Longo do Período
        campo = "CHK_ACUPER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkAcumAoLongPeriodo.setSelected(check);

        //Acumulada - 12 últimos meses
        campo = "CHK_ACUMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkAcum12UltMeses.setSelected(check);

        //Valor Fixo ao Longo do Período
        campo = "CHK_VALFIX";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkVlFixoLongPeriodo.setSelected(check);

        //Maior Melhor
        campo = "CHK_MAIMEL";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chk74.setSelected(check);

        //Menor Melhor
        campo = "CHK_MENMEL";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chk125.setSelected(check);

        //Menor Maior
        campo = "CHK_MENMAI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkMenorqueVerm.setSelected(check);

        //Maior Menor
        campo = "CHK_MAIMEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkMenorqueVerd.setSelected(check);

        //Período de
        campo = "CHK_PERDE";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        cbxPerDeMes.setSelectedItem(Info.objConexao.getBD(select, campo));

        //Período A
        campo = "CHK_PERA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        cbxPerAMes.setSelectedItem(Info.objConexao.getBD(select, campo));

        //Valor Percentual
        campo = "CHK_VALPER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkValPer.setSelected(check);

        //Valor Absoluto
        campo = "CHK_VALABS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkValAbs.setSelected(check);

        //Observações
        campo = "CHK_OBS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtObservacoes.setText(Info.objConexao.getBD(select, campo));

        //Como foi estabelecida a Meta
        campo = "CHK_COMMET";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        txtComFoiEstabMeta.setText(Info.objConexao.getBD(select, campo));

        ///////////////////////// CP_META /////////////////////////
        tabela = "CP_META";
        codIndicador = "MET_INDCOD";
        codTab = "MET_COD";

        //Gráfico
        Info.codTb = 1;
        campo = "MET_MET";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        cbxMetas.addItem(Info.objConexao.getBD(select, campo));

        ///////////////////////// CP_TIP_GRAFICO /////////////////////////
        tabela = "CP_TIP_GRAFICO";
        codIndicador = "GRA_INDCOD";

        //Gráfico
        campo = "GRA_GRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        cbxTipsGrafs.setSelectedItem(Info.objConexao.getBD(select, campo));

        //Número Absoluto
        campo = "GRA_NUMABS";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkNumAbs.setSelected(check);

        //Número Percentual
        campo = "GRA_NUMPER";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd;
        strAux = Info.objConexao.getBD(select, campo);
        check = Boolean.parseBoolean(strAux);
        chkNumPerc.setSelected(check);

        ///////////////////////// CP_DES_INDICADOR /////////////////////////
        tabela = "CP_DES_INDICADOR";
        codIndicador = "DES_INDCOD";
        codTab = "DES_COD";

        //Desdobramento 1
        Info.codTb = 1;
        campo = "DES_DES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaDesdobramento1.setText(Info.objConexao.getBD(select, campo));
        }

        //Desdobramento 2
        Info.codTb = 2;
        campo = "DES_DES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaDesdobramento2.setText(Info.objConexao.getBD(select, campo));
        }

        //Desdobramento 3
        Info.codTb = 3;
        campo = "DES_DES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaDesdobramento3.setText(Info.objConexao.getBD(select, campo));
        }

        //Desdobramento 4
        Info.codTb = 4;
        campo = "DES_DES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaDesdobramento4.setText(Info.objConexao.getBD(select, campo));
        }

        //Desdobramento 5
        Info.codTb = 5;
        campo = "DES_DES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + codIndicador + " = " + Info.codInd + " AND " + codTab + " = " + Info.codTb;
        intAux = Info.objConexao.getIndCod(select, campo, intAux);
        if(intAux == 2){
            txtAreaDesdobramento5.setText(Info.objConexao.getBD(select, campo));
        }
    }

    private int aux;
    private String codIndicador;
    private String insert;
    private String select;
    private String tabela;
    private String campo;
    private String codTab;
    private Meta meta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddMeta;
    private javax.swing.JToggleButton btnAnt1;
    private javax.swing.JToggleButton btnAnt2;
    private javax.swing.JToggleButton btnAnt3;
    private javax.swing.JToggleButton btnAnt4;
    private javax.swing.JToggleButton btnConcluir;
    private javax.swing.JButton btnDadosHistoricos;
    private javax.swing.JButton btnDadosReais;
    private javax.swing.JButton btnForecast;
    private javax.swing.JToggleButton btnProx1;
    private javax.swing.JToggleButton btnProx2;
    private javax.swing.JToggleButton btnProx3;
    private javax.swing.JToggleButton btnProx4;
    private javax.swing.JButton btnUniDado1;
    private javax.swing.JButton btnUniDado10;
    private javax.swing.JButton btnUniDado2;
    private javax.swing.JButton btnUniDado3;
    private javax.swing.JButton btnUniDado4;
    private javax.swing.JButton btnUniDado5;
    private javax.swing.JButton btnUniDado6;
    private javax.swing.JButton btnUniDado7;
    private javax.swing.JButton btnUniDado8;
    private javax.swing.JButton btnUniDado9;
    private javax.swing.JButton btnUnidade;
    private javax.swing.JButton btnValorIdeal;
    private javax.swing.JComboBox cbxMetas;
    private javax.swing.JComboBox cbxPerAMes;
    private javax.swing.JComboBox cbxPerDeMes;
    private javax.swing.JComboBox cbxPerspectiva;
    private javax.swing.JComboBox cbxTipsGrafs;
    private javax.swing.JComboBox cbxUniDado1;
    private javax.swing.JComboBox cbxUniDado10;
    private javax.swing.JComboBox cbxUniDado2;
    private javax.swing.JComboBox cbxUniDado3;
    private javax.swing.JComboBox cbxUniDado4;
    private javax.swing.JComboBox cbxUniDado5;
    private javax.swing.JComboBox cbxUniDado6;
    private javax.swing.JComboBox cbxUniDado7;
    private javax.swing.JComboBox cbxUniDado8;
    private javax.swing.JComboBox cbxUniDado9;
    private javax.swing.JCheckBox chk100e119;
    private javax.swing.JCheckBox chk100e80;
    private javax.swing.JCheckBox chk105e100;
    private javax.swing.JCheckBox chk120;
    private javax.swing.JCheckBox chk125;
    private javax.swing.JCheckBox chk125e105;
    private javax.swing.JCheckBox chk74;
    private javax.swing.JCheckBox chk75e94;
    private javax.swing.JCheckBox chk80;
    private javax.swing.JCheckBox chk95e99;
    private javax.swing.JCheckBox chkAcum12UltMeses;
    private javax.swing.JCheckBox chkAcumAoLongPeriodo;
    private javax.swing.JCheckBox chkAnual;
    private javax.swing.JCheckBox chkBianual;
    private javax.swing.JCheckBox chkBimensal;
    private javax.swing.JCheckBox chkGestores;
    private javax.swing.JCheckBox chkMaiorqueVerd;
    private javax.swing.JCheckBox chkMaiorqueVerm;
    private javax.swing.JCheckBox chkMenorqueVerd;
    private javax.swing.JCheckBox chkMenorqueVerm;
    private javax.swing.JCheckBox chkMensal;
    private javax.swing.JCheckBox chkNumAbs;
    private javax.swing.JCheckBox chkNumPerc;
    private javax.swing.JCheckBox chkSemestral;
    private javax.swing.JCheckBox chkTodos;
    private javax.swing.JCheckBox chkTodosSomInt;
    private javax.swing.JCheckBox chkTrimestral;
    private javax.swing.JCheckBox chkValAbs;
    private javax.swing.JCheckBox chkValPer;
    private javax.swing.JCheckBox chkVlFixoLongPeriodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel lbIIdentDesemp;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblAreaOrig;
    private javax.swing.JLabel lblCntrlDesv;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblComFoiEstabMeta;
    private javax.swing.JLabel lblDado;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblDesdobramento1;
    private javax.swing.JLabel lblDesdobramento2;
    private javax.swing.JLabel lblDesdobramento3;
    private javax.swing.JLabel lblDesdobramento4;
    private javax.swing.JLabel lblDesdobramento5;
    private javax.swing.JLabel lblEscFormtTbGraf;
    private javax.swing.JLabel lblEscTipGraf;
    private javax.swing.JLabel lblFormCalc;
    private javax.swing.JLabel lblFreqAtu;
    private javax.swing.JLabel lblMaiorMelor;
    private javax.swing.JLabel lblMenorMelhor;
    private javax.swing.JLabel lblMeta1;
    private javax.swing.JLabel lblMeta2;
    private javax.swing.JLabel lblNivelDivulg;
    private javax.swing.JLabel lblObserv;
    private javax.swing.JLabel lblObservacoes;
    private javax.swing.JLabel lblPainel;
    private javax.swing.JLabel lblPerMesAno1;
    private javax.swing.JLabel lblPerMesAno2;
    private javax.swing.JLabel lblPerspectiva;
    private javax.swing.JLabel lblPosicao;
    private javax.swing.JLabel lblRespDado;
    private javax.swing.JLabel lblRespInformacao;
    private javax.swing.JLabel lblRespMeta;
    private javax.swing.JLabel lblTpDeMeta;
    private javax.swing.JLabel lblUniDado;
    private javax.swing.JLabel lblUnidade;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JLabel lblValor2;
    private javax.swing.JLabel lblValoresAbsolutos;
    private javax.swing.JLabel lblVarMeta;
    private javax.swing.JLabel lblVer;
    private javax.swing.JLabel lblVlAbril;
    private javax.swing.JLabel lblVlAcum1;
    private javax.swing.JLabel lblVlAcum2;
    private javax.swing.JLabel lblVlAcumAbs;
    private javax.swing.JLabel lblVlAgosto;
    private javax.swing.JLabel lblVlDezembro;
    private javax.swing.JLabel lblVlFevereiro;
    private javax.swing.JLabel lblVlJaneiro;
    private javax.swing.JLabel lblVlJulho;
    private javax.swing.JLabel lblVlJunho;
    private javax.swing.JLabel lblVlMaio;
    private javax.swing.JLabel lblVlMarco;
    private javax.swing.JLabel lblVlNovembro;
    private javax.swing.JLabel lblVlOutubro;
    private javax.swing.JLabel lblVlSetembro;
    private javax.swing.JPanel panelCalcIndicador;
    private javax.swing.JPanel panelDesdInd;
    private javax.swing.JPanel panelInformGerais;
    private javax.swing.JPanel panelMetas;
    private javax.swing.JPanel panelTipsGrafs;
    private javax.swing.JTabbedPane tableIndicador;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextArea txtAreaDesdobramento1;
    private javax.swing.JTextArea txtAreaDesdobramento2;
    private javax.swing.JTextArea txtAreaDesdobramento3;
    private javax.swing.JTextArea txtAreaDesdobramento4;
    private javax.swing.JTextArea txtAreaDesdobramento5;
    private javax.swing.JTextField txtAreaOrig1;
    private javax.swing.JTextField txtAreaOrig10;
    private javax.swing.JTextField txtAreaOrig2;
    private javax.swing.JTextField txtAreaOrig3;
    private javax.swing.JTextField txtAreaOrig4;
    private javax.swing.JTextField txtAreaOrig5;
    private javax.swing.JTextField txtAreaOrig6;
    private javax.swing.JTextField txtAreaOrig7;
    private javax.swing.JTextField txtAreaOrig8;
    private javax.swing.JTextField txtAreaOrig9;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextArea txtComFoiEstabMeta;
    private javax.swing.JTextField txtDado1;
    private javax.swing.JTextField txtDado10;
    private javax.swing.JTextField txtDado2;
    private javax.swing.JTextField txtDado3;
    private javax.swing.JTextField txtDado4;
    private javax.swing.JTextField txtDado5;
    private javax.swing.JTextField txtDado6;
    private javax.swing.JTextField txtDado7;
    private javax.swing.JTextField txtDado8;
    private javax.swing.JTextField txtDado9;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtFormCalc;
    private javax.swing.JTextField txtIdentDesemp;
    private javax.swing.JTextField txtMaiorqueVerd;
    private javax.swing.JTextField txtMaiorqueVerm;
    private javax.swing.JTextField txtMenorqueVerd;
    private javax.swing.JTextField txtMenorqueVerm;
    private javax.swing.JTextField txtMeta;
    private javax.swing.JTextField txtObserv1;
    private javax.swing.JTextField txtObserv10;
    private javax.swing.JTextField txtObserv2;
    private javax.swing.JTextField txtObserv3;
    private javax.swing.JTextField txtObserv4;
    private javax.swing.JTextField txtObserv5;
    private javax.swing.JTextField txtObserv6;
    private javax.swing.JTextField txtObserv7;
    private javax.swing.JTextField txtObserv8;
    private javax.swing.JTextField txtObserv9;
    private javax.swing.JTextField txtObservacoes;
    private javax.swing.JTextField txtPainel;
    private javax.swing.JTextField txtPosicao;
    private javax.swing.JTextField txtRespDado1;
    private javax.swing.JTextField txtRespDado10;
    private javax.swing.JTextField txtRespDado2;
    private javax.swing.JTextField txtRespDado3;
    private javax.swing.JTextField txtRespDado4;
    private javax.swing.JTextField txtRespDado5;
    private javax.swing.JTextField txtRespDado6;
    private javax.swing.JTextField txtRespDado7;
    private javax.swing.JTextField txtRespDado8;
    private javax.swing.JTextField txtRespDado9;
    private javax.swing.JTextField txtRespInformacao;
    private javax.swing.JTextField txtRespMeta;
    private javax.swing.JComboBox txtUnidade;
    private javax.swing.JTextField txtVer;
    private javax.swing.JTextField txtVlAbril;
    private javax.swing.JTextField txtVlAcumAbril;
    private javax.swing.JTextField txtVlAcumAbs;
    private javax.swing.JTextField txtVlAcumAgosto;
    private javax.swing.JTextField txtVlAcumDezembro;
    private javax.swing.JTextField txtVlAcumFevereiro;
    private javax.swing.JTextField txtVlAcumJaneiro;
    private javax.swing.JTextField txtVlAcumJulho;
    private javax.swing.JTextField txtVlAcumJunho;
    private javax.swing.JTextField txtVlAcumMaio;
    private javax.swing.JTextField txtVlAcumMarco;
    private javax.swing.JTextField txtVlAcumNovembro;
    private javax.swing.JTextField txtVlAcumOutubro;
    private javax.swing.JTextField txtVlAcumSetembro;
    private javax.swing.JTextField txtVlAgosto;
    private javax.swing.JTextField txtVlDezembro;
    private javax.swing.JTextField txtVlFevereiro;
    private javax.swing.JTextField txtVlJaneiro;
    private javax.swing.JTextField txtVlJulho;
    private javax.swing.JTextField txtVlJunho;
    private javax.swing.JTextField txtVlMaio;
    private javax.swing.JTextField txtVlMarco;
    private javax.swing.JTextField txtVlNovembro;
    private javax.swing.JTextField txtVlOutubro;
    private javax.swing.JTextField txtVlSetembro;
    // End of variables declaration//GEN-END:variables
}
