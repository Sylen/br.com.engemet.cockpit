package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.Imprimir;
import javax.swing.Icon;

public class TempIniciativas extends javax.swing.JFrame{

    public TempIniciativas(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblIniciativa = new javax.swing.JLabel();
        lblDescricao = new javax.swing.JLabel();
        lblPatrocinador = new javax.swing.JLabel();
        lblLider = new javax.swing.JLabel();
        lblEquipe = new javax.swing.JLabel();
        lblEscopo = new javax.swing.JLabel();
        lblProdutos = new javax.swing.JLabel();
        lblIndicadores = new javax.swing.JLabel();
        lblDataTermino = new javax.swing.JLabel();
        txtIniciativa = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtPatrocinador = new javax.swing.JTextField();
        txtLider = new javax.swing.JTextField();
        txtEquipe = new javax.swing.JTextField();
        txtEscopo = new javax.swing.JTextField();
        txtProdutos = new javax.swing.JTextField();
        txtIndicadores = new javax.swing.JTextField();
        lblPainel = new javax.swing.JLabel();
        lblObjetivo = new javax.swing.JLabel();
        lblDefinicoes = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblDataInicio = new javax.swing.JLabel();
        lblTermino = new javax.swing.JLabel();
        txtPainel = new javax.swing.JTextField();
        txtObjetivo = new javax.swing.JTextField();
        lblGerenciamento = new javax.swing.JLabel();
        lblDataAtualizacao = new javax.swing.JLabel();
        txtDataAtualizacao = new javax.swing.JFormattedTextField();
        lblContagemDias = new javax.swing.JLabel();
        lblPontoAtencao = new javax.swing.JLabel();
        lblAcoes = new javax.swing.JLabel();
        lblResponsavel = new javax.swing.JLabel();
        lblPrazo = new javax.swing.JLabel();
        lblOk = new javax.swing.JLabel();
        txtPrazo = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAcoes = new javax.swing.JTextArea();
        txtResponsavel = new javax.swing.JTextField();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, -1, -1));

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIniciativa.setBackground(new java.awt.Color(22, 54, 92));
        lblIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblIniciativa.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIniciativa.setText("Iniciativa");
        lblIniciativa.setOpaque(true);
        jPanel1.add(lblIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 100, 20));

        lblDescricao.setBackground(new java.awt.Color(54, 96, 146));
        lblDescricao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblDescricao.setForeground(new java.awt.Color(255, 255, 255));
        lblDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescricao.setText("Descrição / Objetivos");
        lblDescricao.setToolTipText("");
        lblDescricao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDescricao.setOpaque(true);
        jPanel1.add(lblDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 20));

        lblPatrocinador.setBackground(new java.awt.Color(54, 96, 146));
        lblPatrocinador.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblPatrocinador.setForeground(new java.awt.Color(255, 255, 255));
        lblPatrocinador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatrocinador.setText("<html><center>Patrocinador da Iniciativa</center></html>");
        lblPatrocinador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPatrocinador.setOpaque(true);
        jPanel1.add(lblPatrocinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 100, 20));

        lblLider.setBackground(new java.awt.Color(54, 96, 146));
        lblLider.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblLider.setForeground(new java.awt.Color(255, 255, 255));
        lblLider.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLider.setText("Líder  da Iniciativa");
        lblLider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblLider.setOpaque(true);
        jPanel1.add(lblLider, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 100, 20));

        lblEquipe.setBackground(new java.awt.Color(54, 96, 146));
        lblEquipe.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblEquipe.setForeground(new java.awt.Color(255, 255, 255));
        lblEquipe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEquipe.setText("Equipe da Iniciativa");
        lblEquipe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEquipe.setOpaque(true);
        jPanel1.add(lblEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 20));

        lblEscopo.setBackground(new java.awt.Color(54, 96, 146));
        lblEscopo.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblEscopo.setForeground(new java.awt.Color(255, 255, 255));
        lblEscopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscopo.setText("Escopo (Abrangência)");
        lblEscopo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEscopo.setOpaque(true);
        jPanel1.add(lblEscopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 100, 20));

        lblProdutos.setBackground(new java.awt.Color(54, 96, 146));
        lblProdutos.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblProdutos.setForeground(new java.awt.Color(255, 255, 255));
        lblProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProdutos.setText("<html><center>Produtos a serem gerados / Resultados / Benefícios Esperados</center></html>");
        lblProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProdutos.setOpaque(true);
        jPanel1.add(lblProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 100, 30));

        lblIndicadores.setBackground(new java.awt.Color(54, 96, 146));
        lblIndicadores.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblIndicadores.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicadores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicadores.setText("<html><center>Indicadores e Metas da Iniciativa</center></html>");
        lblIndicadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIndicadores.setOpaque(true);
        jPanel1.add(lblIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 100, 20));

        lblDataTermino.setBackground(new java.awt.Color(54, 96, 146));
        lblDataTermino.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblDataTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblDataTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataTermino.setText("<html><center>\"Data de Término Inicialmente Planejada\"</center></html>");
        lblDataTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDataTermino.setOpaque(true);
        jPanel1.add(lblDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 100, 30));

        txtIniciativa.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 440, 20));

        txtDescricao.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 440, 20));

        txtPatrocinador.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPatrocinador.setToolTipText("Apoia e monitora os Projetos e redesenho dos processos envolvidos.  ");
        jPanel1.add(txtPatrocinador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 440, 20));

        txtLider.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtLider.setToolTipText("<html><center>Responsável pelo Gerenciamento da Iniciativa, que inclui a  realização das atividades previstas, produtos e resultados gerados pela mesmao e a coordenação da equipe designada para sua implementação.</center></html>");
        jPanel1.add(txtLider, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 440, 20));

        txtEquipe.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtEquipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 440, 20));

        txtEscopo.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEscopo.setToolTipText("<html><center>O escopo define os limites da Iniciativa.</center></html>");
        jPanel1.add(txtEscopo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 440, 20));

        txtProdutos.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtProdutos.setToolTipText("Retrata a situação desejada após a implementação do Projeto.");
        jPanel1.add(txtProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 440, 30));

        txtIndicadores.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtIndicadores.setToolTipText("<html><center>Indicadores e Metas específicos da Iniciativa  que medem se os resultados do Projeto foram atendidos, ou não.</center></html>");
        jPanel1.add(txtIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 440, 20));

        lblPainel.setBackground(new java.awt.Color(54, 96, 146));
        lblPainel.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblPainel.setForeground(new java.awt.Color(255, 255, 255));
        lblPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainel.setText("<html><center>Painel</center></html>");
        lblPainel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPainel.setOpaque(true);
        jPanel1.add(lblPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 100, 20));

        lblObjetivo.setBackground(new java.awt.Color(54, 96, 146));
        lblObjetivo.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblObjetivo.setForeground(new java.awt.Color(255, 255, 255));
        lblObjetivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblObjetivo.setText("<html><center>Objetivo\n</center></html>");
        lblObjetivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblObjetivo.setOpaque(true);
        jPanel1.add(lblObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 100, 20));

        lblDefinicoes.setBackground(new java.awt.Color(15, 36, 62));
        lblDefinicoes.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblDefinicoes.setForeground(new java.awt.Color(255, 255, 255));
        lblDefinicoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDefinicoes.setText("Definições Gerais");
        lblDefinicoes.setOpaque(true);
        jPanel1.add(lblDefinicoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 20));

        lblInicio.setBackground(new java.awt.Color(255, 255, 255));
        lblInicio.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblInicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblInicio.setOpaque(true);
        jPanel1.add(lblInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 50, 30));

        lblDataInicio.setBackground(new java.awt.Color(54, 96, 146));
        lblDataInicio.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblDataInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblDataInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataInicio.setText("<html><center>\"Data de Início Inicialmente Planejada\"</center></html>");
        lblDataInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDataInicio.setOpaque(true);
        jPanel1.add(lblDataInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 100, 30));

        lblTermino.setBackground(new java.awt.Color(255, 255, 255));
        lblTermino.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        lblTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTermino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTermino.setOpaque(true);
        jPanel1.add(lblTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 50, 30));

        txtPainel.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 440, 20));

        txtObjetivo.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtObjetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 440, 20));

        lblGerenciamento.setBackground(new java.awt.Color(15, 36, 62));
        lblGerenciamento.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblGerenciamento.setForeground(new java.awt.Color(255, 255, 255));
        lblGerenciamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGerenciamento.setText("Gerenciamento da Iniciativa");
        lblGerenciamento.setOpaque(true);
        jPanel1.add(lblGerenciamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 540, 20));

        lblDataAtualizacao.setBackground(new java.awt.Color(22, 54, 92));
        lblDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblDataAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblDataAtualizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDataAtualizacao.setText("<html><center>Data de Atualização da Planilha</center></html>");
        lblDataAtualizacao.setOpaque(true);
        jPanel1.add(lblDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 100, -1));

        txtDataAtualizacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtDataAtualizacao.setToolTipText("formato da data dd/mm/aaaa");
        txtDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 60, 20));

        lblContagemDias.setBackground(new java.awt.Color(54, 96, 146));
        lblContagemDias.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblContagemDias.setForeground(new java.awt.Color(255, 255, 255));
        lblContagemDias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContagemDias.setText("Sem Dados");
        lblContagemDias.setToolTipText("");
        lblContagemDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblContagemDias.setOpaque(true);
        jPanel1.add(lblContagemDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 380, 20));

        lblPontoAtencao.setBackground(new java.awt.Color(22, 54, 92));
        lblPontoAtencao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblPontoAtencao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontoAtencao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontoAtencao.setText("Pontos de Atenção");
        lblPontoAtencao.setToolTipText("Problemas Reais ou Potenciais que estão impactando a Iniciativa");
        lblPontoAtencao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPontoAtencao.setOpaque(true);
        jPanel1.add(lblPontoAtencao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 160, 10));

        lblAcoes.setBackground(new java.awt.Color(22, 54, 92));
        lblAcoes.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblAcoes.setForeground(new java.awt.Color(255, 255, 255));
        lblAcoes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcoes.setText("Ações Corretivas / Preventivas");
        lblAcoes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAcoes.setOpaque(true);
        jPanel1.add(lblAcoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 10));

        lblResponsavel.setBackground(new java.awt.Color(22, 54, 92));
        lblResponsavel.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblResponsavel.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel.setText("Responsável");
        lblResponsavel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblResponsavel.setOpaque(true);
        jPanel1.add(lblResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 80, 10));

        lblPrazo.setBackground(new java.awt.Color(22, 54, 92));
        lblPrazo.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblPrazo.setForeground(new java.awt.Color(255, 255, 255));
        lblPrazo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrazo.setText("Prazo");
        lblPrazo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPrazo.setOpaque(true);
        jPanel1.add(lblPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 80, 10));

        lblOk.setBackground(new java.awt.Color(22, 54, 92));
        lblOk.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblOk.setForeground(new java.awt.Color(255, 255, 255));
        lblOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOk.setText("OK");
        lblOk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblOk.setOpaque(true);
        jPanel1.add(lblOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 60, 10));

        txtPrazo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 80, 20));

        jScrollPane2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtAcoes.setColumns(10);
        txtAcoes.setRows(1);
        jScrollPane2.setViewportView(txtAcoes);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 160, -1));

        txtResponsavel.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 80, 20));

        chkOk.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkOk.setText("OK");
        jPanel1.add(chkOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 60, 20));

        jScrollPane3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPontoAtencao.setColumns(10);
        txtPontoAtencao.setRows(1);
        jScrollPane3.setViewportView(txtPontoAtencao);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 160, -1));

        txtPrazo1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPrazo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 80, 20));

        jScrollPane4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtAcoes1.setColumns(10);
        txtAcoes1.setRows(1);
        jScrollPane4.setViewportView(txtAcoes1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 160, -1));

        txtResponsavel1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtResponsavel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 80, 20));

        chkOk1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkOk1.setText("OK");
        jPanel1.add(chkOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 60, 20));

        jScrollPane5.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPontoAtencao1.setColumns(10);
        txtPontoAtencao1.setRows(1);
        jScrollPane5.setViewportView(txtPontoAtencao1);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 160, -1));

        txtPrazo2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPrazo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 80, 20));

        jScrollPane6.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtAcoes2.setColumns(10);
        txtAcoes2.setRows(1);
        jScrollPane6.setViewportView(txtAcoes2);

        jPanel1.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, -1));

        txtResponsavel2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtResponsavel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 80, 20));

        chkOk2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkOk2.setText("OK");
        jPanel1.add(chkOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 60, 20));

        jScrollPane7.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPontoAtencao2.setColumns(10);
        txtPontoAtencao2.setRows(1);
        jScrollPane7.setViewportView(txtPontoAtencao2);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 160, -1));

        txtPrazo3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPrazo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 80, 20));

        jScrollPane8.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtAcoes3.setColumns(10);
        txtAcoes3.setRows(1);
        jScrollPane8.setViewportView(txtAcoes3);

        jPanel1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 160, -1));

        txtResponsavel3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtResponsavel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 80, 20));

        chkOk3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkOk3.setText("OK");
        jPanel1.add(chkOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 60, 20));

        jScrollPane9.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPontoAtencao3.setColumns(10);
        txtPontoAtencao3.setRows(1);
        jScrollPane9.setViewportView(txtPontoAtencao3);

        jPanel1.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 160, -1));

        txtPrazo4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtPrazo4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtPrazo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 80, 20));

        jScrollPane10.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtAcoes4.setColumns(10);
        txtAcoes4.setRows(1);
        jScrollPane10.setViewportView(txtAcoes4);

        jPanel1.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 160, -1));

        txtResponsavel4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        jPanel1.add(txtResponsavel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 80, 20));

        chkOk4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkOk4.setText("OK");
        jPanel1.add(chkOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, 60, 20));

        jScrollPane11.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPontoAtencao4.setColumns(10);
        txtPontoAtencao4.setRows(1);
        jScrollPane11.setViewportView(txtPontoAtencao4);

        jPanel1.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 160, -1));

        lblPlanejamento.setBackground(new java.awt.Color(22, 54, 92));
        lblPlanejamento.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblPlanejamento.setForeground(new java.awt.Color(255, 255, 255));
        lblPlanejamento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlanejamento.setText("<html><center>Planejamento de Recursos para a Iniciativa</center></html>");
        lblPlanejamento.setOpaque(true);
        jPanel1.add(lblPlanejamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 540, 20));

        lblRecursos1.setBackground(new java.awt.Color(22, 54, 92));
        lblRecursos1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblRecursos1.setForeground(new java.awt.Color(255, 255, 255));
        lblRecursos1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRecursos1.setText("Recursos");
        lblRecursos1.setToolTipText("(equipe, recursos materiais,  financeiros, etc.)");
        lblRecursos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRecursos1.setOpaque(true);
        jPanel1.add(lblRecursos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 180, 10));

        lblEspecificacao.setBackground(new java.awt.Color(22, 54, 92));
        lblEspecificacao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblEspecificacao.setForeground(new java.awt.Color(255, 255, 255));
        lblEspecificacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEspecificacao.setText("Especificação / Dimensionamento");
        lblEspecificacao.setToolTipText("(Ex: tempo de dedicação ou % de alocação, período, valor em R$, etc.)");
        lblEspecificacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblEspecificacao.setOpaque(true);
        jPanel1.add(lblEspecificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 180, 10));

        lblSituacao1.setBackground(new java.awt.Color(22, 54, 92));
        lblSituacao1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblSituacao1.setForeground(new java.awt.Color(255, 255, 255));
        lblSituacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSituacao1.setText("Situação");
        lblSituacao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblSituacao1.setOpaque(true);
        jPanel1.add(lblSituacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 180, 10));

        txtRecursos.setColumns(10);
        txtRecursos.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtRecursos.setRows(1);
        jScrollPane12.setViewportView(txtRecursos);

        jPanel1.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 180, 20));

        txtEspecificacao.setColumns(10);
        txtEspecificacao.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEspecificacao.setRows(1);
        jScrollPane13.setViewportView(txtEspecificacao);

        jPanel1.add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 180, 20));

        txtRecursos1.setColumns(10);
        txtRecursos1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtRecursos1.setRows(1);
        jScrollPane14.setViewportView(txtRecursos1);

        jPanel1.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 180, 20));

        txtEspecificacao1.setColumns(10);
        txtEspecificacao1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEspecificacao1.setRows(1);
        jScrollPane15.setViewportView(txtEspecificacao1);

        jPanel1.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 180, 20));

        txtRecursos2.setColumns(10);
        txtRecursos2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtRecursos2.setRows(1);
        jScrollPane16.setViewportView(txtRecursos2);

        jPanel1.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 180, 20));

        txtEspecificacao2.setColumns(10);
        txtEspecificacao2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEspecificacao2.setRows(1);
        jScrollPane17.setViewportView(txtEspecificacao2);

        jPanel1.add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 180, 20));

        txtRecursos3.setColumns(10);
        txtRecursos3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtRecursos3.setRows(1);
        jScrollPane18.setViewportView(txtRecursos3);

        jPanel1.add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 180, 20));

        txtEspecificacao3.setColumns(10);
        txtEspecificacao3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEspecificacao3.setRows(1);
        jScrollPane19.setViewportView(txtEspecificacao3);

        jPanel1.add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 180, 20));

        txtRecursos4.setColumns(10);
        txtRecursos4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtRecursos4.setRows(1);
        jScrollPane20.setViewportView(txtRecursos4);

        jPanel1.add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 180, 20));

        txtEspecificacao4.setColumns(10);
        txtEspecificacao4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtEspecificacao4.setRows(1);
        jScrollPane21.setViewportView(txtEspecificacao4);

        jPanel1.add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 180, 20));

        chkPlanejamentoPendente.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoPendente.setText("Pendente / com Problemas");
        jPanel1.add(chkPlanejamentoPendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, 20));

        chkPlanejamentoOk.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoOk.setText("OK");
        jPanel1.add(chkPlanejamentoOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, 20));

        chkPlanejamentoPendente1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoPendente1.setText("Pendente / com Problemas");
        jPanel1.add(chkPlanejamentoPendente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, -1, 20));

        chkPlanejamentoOk1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoOk1.setText("OK");
        jPanel1.add(chkPlanejamentoOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 460, -1, 20));

        chkPlanejamentoPendente2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoPendente2.setText("Pendente / com Problemas");
        jPanel1.add(chkPlanejamentoPendente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, -1, 20));

        chkPlanejamentoOk2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoOk2.setText("OK");
        jPanel1.add(chkPlanejamentoOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, -1, 20));

        chkPlanejamentoPendente3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoPendente3.setText("Pendente / com Problemas");
        jPanel1.add(chkPlanejamentoPendente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 500, -1, 20));

        chkPlanejamentoOk3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoOk3.setText("OK");
        jPanel1.add(chkPlanejamentoOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, -1, 20));

        chkPlanejamentoPendente4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoPendente4.setText("Pendente / com Problemas");
        jPanel1.add(chkPlanejamentoPendente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, 20));

        chkPlanejamentoOk4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkPlanejamentoOk4.setText("OK");
        jPanel1.add(chkPlanejamentoOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 520, -1, 20));

        lblControle.setBackground(new java.awt.Color(22, 54, 92));
        lblControle.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        lblControle.setForeground(new java.awt.Color(255, 255, 255));
        lblControle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControle.setText("<html><center>Controle de Alterações da Iniciativa</center></html>");
        lblControle.setOpaque(true);
        jPanel1.add(lblControle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 540, 20));

        lblDe.setBackground(new java.awt.Color(22, 54, 92));
        lblDe.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblDe.setForeground(new java.awt.Color(255, 255, 255));
        lblDe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDe.setText("De");
        lblDe.setToolTipText("");
        lblDe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblDe.setOpaque(true);
        jPanel1.add(lblDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 180, 10));

        lblPara.setBackground(new java.awt.Color(22, 54, 92));
        lblPara.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblPara.setForeground(new java.awt.Color(255, 255, 255));
        lblPara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPara.setText("Para");
        lblPara.setToolTipText("");
        lblPara.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblPara.setOpaque(true);
        jPanel1.add(lblPara, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 560, 180, 10));

        lblAprovacao.setBackground(new java.awt.Color(22, 54, 92));
        lblAprovacao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblAprovacao.setForeground(new java.awt.Color(255, 255, 255));
        lblAprovacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAprovacao.setText("Aprovação");
        lblAprovacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAprovacao.setOpaque(true);
        jPanel1.add(lblAprovacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 180, 10));

        jScrollPane22.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtDe.setColumns(10);
        txtDe.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtDe.setRows(1);
        jScrollPane22.setViewportView(txtDe);

        jPanel1.add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 180, 20));

        jScrollPane23.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPara.setColumns(10);
        txtPara.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPara.setRows(1);
        jScrollPane23.setViewportView(txtPara);

        jPanel1.add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 180, 20));

        chkControlePendente.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControlePendente.setText("Pendente");
        jPanel1.add(chkControlePendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 570, -1, 20));

        chkControleOk.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControleOk.setText("Aprovado");
        jPanel1.add(chkControleOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 570, -1, 20));

        jScrollPane24.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtDe1.setColumns(10);
        txtDe1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtDe1.setRows(1);
        jScrollPane24.setViewportView(txtDe1);

        jPanel1.add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 180, 20));

        jScrollPane25.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPara1.setColumns(10);
        txtPara1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPara1.setRows(1);
        jScrollPane25.setViewportView(txtPara1);

        jPanel1.add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 180, 20));

        chkControlePendente1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControlePendente1.setText("Pendente");
        jPanel1.add(chkControlePendente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, 20));

        chkControleOk1.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControleOk1.setText("Aprovado");
        jPanel1.add(chkControleOk1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 590, -1, 20));

        jScrollPane26.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtDe2.setColumns(10);
        txtDe2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtDe2.setRows(1);
        jScrollPane26.setViewportView(txtDe2);

        jPanel1.add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 180, 20));

        jScrollPane27.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPara2.setColumns(10);
        txtPara2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPara2.setRows(1);
        jScrollPane27.setViewportView(txtPara2);

        jPanel1.add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 610, 180, 20));

        chkControlePendente2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControlePendente2.setText("Pendente");
        jPanel1.add(chkControlePendente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, 20));

        chkControleOk2.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControleOk2.setText("Aprovado");
        jPanel1.add(chkControleOk2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, -1, 20));

        jScrollPane28.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtDe3.setColumns(10);
        txtDe3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtDe3.setRows(1);
        jScrollPane28.setViewportView(txtDe3);

        jPanel1.add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 180, 20));

        jScrollPane29.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPara3.setColumns(10);
        txtPara3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPara3.setRows(1);
        jScrollPane29.setViewportView(txtPara3);

        jPanel1.add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 630, 180, 20));

        chkControlePendente3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControlePendente3.setText("Pendente");
        jPanel1.add(chkControlePendente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, -1, 20));

        chkControleOk3.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControleOk3.setText("Aprovado");
        jPanel1.add(chkControleOk3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, -1, 20));

        jScrollPane30.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtDe4.setColumns(10);
        txtDe4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtDe4.setRows(1);
        jScrollPane30.setViewportView(txtDe4);

        jPanel1.add(jScrollPane30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 180, 20));

        jScrollPane31.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N

        txtPara4.setColumns(10);
        txtPara4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        txtPara4.setRows(1);
        jScrollPane31.setViewportView(txtPara4);

        jPanel1.add(jScrollPane31, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 650, 180, 20));

        chkControlePendente4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControlePendente4.setText("Pendente");
        jPanel1.add(chkControlePendente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 650, -1, 20));

        chkControleOk4.setFont(new java.awt.Font("Lucida Grande", 0, 5)); // NOI18N
        chkControleOk4.setText("Aprovado");
        jPanel1.add(chkControleOk4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 650, -1, 20));

        lblStatusCronograma.setBackground(new java.awt.Color(22, 54, 92));
        lblStatusCronograma.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblStatusCronograma.setForeground(new java.awt.Color(255, 255, 255));
        lblStatusCronograma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma.setText("<html><center>Status do Cronograma</center></html>");
        lblStatusCronograma.setOpaque(true);
        jPanel1.add(lblStatusCronograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 750, 90, -1));

        lblCronogramaDataTermino.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataTermino.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataTermino.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataTermino.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino.setText("<html><center>Data de Término Prevista</center></html>");
        lblCronogramaDataTermino.setToolTipText("");
        lblCronogramaDataTermino.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino.setOpaque(true);
        jPanel1.add(lblCronogramaDataTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 690, 90, 20));

        lblCronogramaDataAtualizacao.setBackground(new java.awt.Color(54, 96, 146));
        lblCronogramaDataAtualizacao.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataAtualizacao.setForeground(new java.awt.Color(255, 255, 255));
        lblCronogramaDataAtualizacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao.setText("<html><center>Data de Atualização</center></html>");
        lblCronogramaDataAtualizacao.setToolTipText("");
        lblCronogramaDataAtualizacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao.setOpaque(true);
        jPanel1.add(lblCronogramaDataAtualizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 90, 20));

        lblInicioReal.setBackground(new java.awt.Color(54, 96, 146));
        lblInicioReal.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblInicioReal.setForeground(new java.awt.Color(255, 255, 255));
        lblInicioReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioReal.setText("<html><center>Data de Ínicio Real</center></html>");
        lblInicioReal.setToolTipText("");
        lblInicioReal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblInicioReal.setOpaque(true);
        jPanel1.add(lblInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 690, 90, 20));

        lblNTotalSemanas.setBackground(new java.awt.Color(54, 96, 146));
        lblNTotalSemanas.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNTotalSemanas.setForeground(new java.awt.Color(255, 255, 255));
        lblNTotalSemanas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas.setText("<html><center>Nº Total de Semanas</center></html>");
        lblNTotalSemanas.setToolTipText("");
        lblNTotalSemanas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas.setOpaque(true);
        jPanel1.add(lblNTotalSemanas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 90, 20));

        lblNSemanasDecorridas.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasDecorridas.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasDecorridas.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasDecorridas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas.setText("<html><center>Nº de Semanas Decorridas</center></html>");
        lblNSemanasDecorridas.setToolTipText("");
        lblNSemanasDecorridas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas.setOpaque(true);
        jPanel1.add(lblNSemanasDecorridas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 730, 90, 20));

        lblNTotalSemanas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNTotalSemanas1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNTotalSemanas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNTotalSemanas1.setText("Sem Dados");
        lblNTotalSemanas1.setToolTipText("");
        lblNTotalSemanas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNTotalSemanas1.setOpaque(true);
        jPanel1.add(lblNTotalSemanas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 90, 20));

        lblNSemanasRestantes.setBackground(new java.awt.Color(54, 96, 146));
        lblNSemanasRestantes.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasRestantes.setForeground(new java.awt.Color(255, 255, 255));
        lblNSemanasRestantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes.setText("<html><center>Nº de Semanas Restantes</center></html>");
        lblNSemanasRestantes.setToolTipText("");
        lblNSemanasRestantes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes.setOpaque(true);
        jPanel1.add(lblNSemanasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 730, 90, 20));

        lblCronogramaDataAtualizacao1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataAtualizacao1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataAtualizacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataAtualizacao1.setText("Sem Dados");
        lblCronogramaDataAtualizacao1.setToolTipText("");
        lblCronogramaDataAtualizacao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataAtualizacao1.setOpaque(true);
        jPanel1.add(lblCronogramaDataAtualizacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 90, 20));

        lblCronogramaDataTermino1.setBackground(new java.awt.Color(153, 204, 255));
        lblCronogramaDataTermino1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblCronogramaDataTermino1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronogramaDataTermino1.setText("Sem Dados");
        lblCronogramaDataTermino1.setToolTipText("");
        lblCronogramaDataTermino1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblCronogramaDataTermino1.setOpaque(true);
        jPanel1.add(lblCronogramaDataTermino1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 710, 90, 20));

        lblNSemanasDecorridas1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasDecorridas1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasDecorridas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasDecorridas1.setText("Sem Dados");
        lblNSemanasDecorridas1.setToolTipText("");
        lblNSemanasDecorridas1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasDecorridas1.setOpaque(true);
        jPanel1.add(lblNSemanasDecorridas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 750, 90, 20));

        lblNSemanasRestantes1.setBackground(new java.awt.Color(153, 204, 255));
        lblNSemanasRestantes1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblNSemanasRestantes1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNSemanasRestantes1.setText("Sem Dados");
        lblNSemanasRestantes1.setToolTipText("");
        lblNSemanasRestantes1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblNSemanasRestantes1.setOpaque(true);
        jPanel1.add(lblNSemanasRestantes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 750, 90, 20));

        txtInicioReal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtInicioReal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtInicioReal.setToolTipText("formato da data dd/mm/aaaa");
        txtInicioReal.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jPanel1.add(txtInicioReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 710, 90, 20));

        lblTempoDecorrido.setBackground(new java.awt.Color(54, 96, 146));
        lblTempoDecorrido.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblTempoDecorrido.setForeground(new java.awt.Color(255, 255, 255));
        lblTempoDecorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido.setText("<html><center>Tempo Total Decorrido</center></html>");
        lblTempoDecorrido.setToolTipText("");
        lblTempoDecorrido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido.setOpaque(true);
        jPanel1.add(lblTempoDecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 690, 90, 20));

        lblProgressoFisico.setBackground(new java.awt.Color(54, 96, 146));
        lblProgressoFisico.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblProgressoFisico.setForeground(new java.awt.Color(255, 255, 255));
        lblProgressoFisico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico.setText("<html><center>Progresso Físico da Iniciativa</center></html>");
        lblProgressoFisico.setToolTipText("");
        lblProgressoFisico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico.setOpaque(true);
        jPanel1.add(lblProgressoFisico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 90, 20));

        lblTempoDecorrido1.setBackground(new java.awt.Color(153, 204, 255));
        lblTempoDecorrido1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblTempoDecorrido1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempoDecorrido1.setText("0%");
        lblTempoDecorrido1.setToolTipText("");
        lblTempoDecorrido1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblTempoDecorrido1.setOpaque(true);
        jPanel1.add(lblTempoDecorrido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 690, 70, 20));

        lblProgressoFisico1.setBackground(new java.awt.Color(153, 204, 255));
        lblProgressoFisico1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblProgressoFisico1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgressoFisico1.setText("0%");
        lblProgressoFisico1.setToolTipText("");
        lblProgressoFisico1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblProgressoFisico1.setOpaque(true);
        jPanel1.add(lblProgressoFisico1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 70, 20));

        lblStatusCronograma1.setBackground(new java.awt.Color(153, 204, 255));
        lblStatusCronograma1.setFont(new java.awt.Font("Lucida Grande", 1, 8)); // NOI18N
        lblStatusCronograma1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusCronograma1.setToolTipText("");
        lblStatusCronograma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblStatusCronograma1.setOpaque(true);
        jPanel1.add(lblStatusCronograma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 750, 70, 20));

        lblCronoIniciativa.setBackground(new java.awt.Color(15, 36, 62));
        lblCronoIniciativa.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCronoIniciativa.setForeground(new java.awt.Color(255, 255, 255));
        lblCronoIniciativa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronoIniciativa.setText("Cronograma da Iniciativa");
        lblCronoIniciativa.setOpaque(true);
        jPanel1.add(lblCronoIniciativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 540, 20));

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        Imprimir.printComponent(jPanel1);
        validate();
        repaint();
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void setDadosGerias(String iniciativa, String descricao, String patrocinador, String Lider, String equipe,
            String escopo, String produtos, String indicadores, String iniDia, String iniMes, String iniAno,
            String fimDia, String fimMes, String fimAno, String painel, String objetivo){

        txtIniciativa.setText(iniciativa);
        txtDescricao.setText(descricao);
        txtPatrocinador.setText(patrocinador);
        txtLider.setText(Lider);
        txtEquipe.setText(equipe);
        txtEscopo.setText(escopo);
        txtProdutos.setText(produtos);
        txtIndicadores.setText(indicadores);
        lblInicio.setText(iniDia + "/" + iniMes + "/" + iniAno);
        lblTermino.setText(fimDia + "/" + fimMes + "/ " + fimAno);
        txtPainel.setText(painel);
        txtObjetivo.setText(objetivo);
    }

    public void setGerenciamentoIniciativa(String dataAtualizacao, String dados, String ponto1, String ponto2, String ponto3,
            String ponto4, String ponto5, String acoes1, String acoes2, String acoes3, String acoes4, String acoes5,
            String resp1, String resp2, String resp3, String resp4, String resp5, String prazo1, String prazo2, String prazo3,
            String prazo4, String prazo5, String ok1, String ok2, String ok3, String ok4, String ok5){

        txtDataAtualizacao.setText(dataAtualizacao);
        lblContagemDias.setText(dados);
        txtPontoAtencao.setText(ponto1);
        txtPontoAtencao1.setText(ponto2);
        txtPontoAtencao2.setText(ponto3);
        txtPontoAtencao3.setText(ponto4);
        txtPontoAtencao4.setText(ponto5);
        txtAcoes.setText(acoes1);
        txtAcoes1.setText(acoes2);
        txtAcoes2.setText(acoes3);
        txtAcoes3.setText(acoes4);
        txtAcoes4.setText(acoes5);
        txtResponsavel.setText(resp1);
        txtResponsavel1.setText(resp2);
        txtResponsavel2.setText(resp3);
        txtResponsavel3.setText(resp4);
        txtResponsavel4.setText(resp5);
        txtPrazo.setText(prazo1);
        txtPrazo1.setText(prazo2);
        txtPrazo2.setText(prazo3);
        txtPrazo3.setText(prazo4);
        txtPrazo4.setText(prazo5);
        chkOk.setSelected(Boolean.valueOf(ok1));
        chkOk1.setSelected(Boolean.valueOf(ok2));
        chkOk2.setSelected(Boolean.valueOf(ok3));
        chkOk3.setSelected(Boolean.valueOf(ok4));
        chkOk4.setSelected(Boolean.valueOf(ok5));
    }

    public void setPlanejamentoRecursos(String recurso1, String recurso2, String recurso3, String recurso4, String recurso5,
            String espec1, String espec2, String espec3, String espec4, String espec5, String sitPen1, String sitPen2, String sitPen3,
            String sitPen4, String sitPen5, String sitOk1, String sitOk2, String sitOk3, String sitOk4, String sitOk5){

        txtRecursos.setText(recurso1);
        txtRecursos1.setText(recurso2);
        txtRecursos2.setText(recurso3);
        txtRecursos3.setText(recurso4);
        txtRecursos4.setText(recurso5);
        txtEspecificacao.setText(espec1);
        txtEspecificacao1.setText(espec2);
        txtEspecificacao2.setText(espec3);
        txtEspecificacao3.setText(espec4);
        txtEspecificacao4.setText(espec5);
        chkPlanejamentoPendente.setSelected(Boolean.valueOf(sitPen1));
        chkPlanejamentoPendente1.setSelected(Boolean.valueOf(sitPen2));
        chkPlanejamentoPendente2.setSelected(Boolean.valueOf(sitPen3));
        chkPlanejamentoPendente3.setSelected(Boolean.valueOf(sitPen4));
        chkPlanejamentoPendente4.setSelected(Boolean.valueOf(sitPen5));
        chkPlanejamentoOk.setSelected(Boolean.valueOf(sitOk1));
        chkPlanejamentoOk1.setSelected(Boolean.valueOf(sitOk2));
        chkPlanejamentoOk2.setSelected(Boolean.valueOf(sitOk3));
        chkPlanejamentoOk3.setSelected(Boolean.valueOf(sitOk4));
        chkPlanejamentoOk4.setSelected(Boolean.valueOf(sitOk5));
    }

    public void setControleAlteracoes(String de1, String de2, String de3, String de4, String de5, String para1, String para2,
            String para3, String para4, String para5, String aprPen1, String aprPen2, String aprPen3, String aprPen4,
            String aprPen5, String apr1, String apr2, String apr3, String apr4, String apr5){

        txtDe.setText(de1);
        txtDe1.setText(de2);
        txtDe2.setText(de3);
        txtDe3.setText(de4);
        txtDe4.setText(de5);
        txtPara.setText(para1);
        txtPara1.setText(para2);
        txtPara2.setText(para3);
        txtPara3.setText(para4);
        txtPara4.setText(para5);
        chkControlePendente.setSelected(Boolean.valueOf(aprPen1));
        chkControlePendente1.setSelected(Boolean.valueOf(aprPen2));
        chkControlePendente2.setSelected(Boolean.valueOf(aprPen3));
        chkControlePendente3.setSelected(Boolean.valueOf(aprPen4));
        chkControlePendente4.setSelected(Boolean.valueOf(aprPen5));
        chkControleOk.setSelected(Boolean.valueOf(apr1));
        chkControleOk1.setSelected(Boolean.valueOf(apr2));
        chkControleOk2.setSelected(Boolean.valueOf(apr3));
        chkControleOk3.setSelected(Boolean.valueOf(apr4));
        chkControleOk4.setSelected(Boolean.valueOf(apr5));
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
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblAcoes;
    private javax.swing.JLabel lblAprovacao;
    private javax.swing.JLabel lblContagemDias;
    private javax.swing.JLabel lblControle;
    private javax.swing.JLabel lblCronoIniciativa;
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
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblInicioReal;
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
    private javax.swing.JLabel lblPlanejamento;
    private javax.swing.JLabel lblPontoAtencao;
    private javax.swing.JLabel lblPrazo;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblProgressoFisico;
    private javax.swing.JLabel lblProgressoFisico1;
    private javax.swing.JLabel lblRecursos1;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JLabel lblSituacao1;
    private javax.swing.JLabel lblStatusCronograma;
    private javax.swing.JLabel lblStatusCronograma1;
    private javax.swing.JLabel lblTempoDecorrido;
    private javax.swing.JLabel lblTempoDecorrido1;
    private javax.swing.JLabel lblTermino;
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
    private javax.swing.JTextField txtObjetivo;
    private javax.swing.JTextField txtPainel;
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
