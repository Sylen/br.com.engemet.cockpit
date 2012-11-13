package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.CockpitCor;
import br.com.engemet.cockpit.oracle.Conexao;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.TextAnchor;

public class Graficos extends javax.swing.JPanel{

    private ChartPanel chartPanelRealMetaAcu;
    private ChartPanel chartPanelRealMetaMen;
    private ChartPanel chartPanelDesvioPerc;
    private ChartPanel chartPanelDesvioAbs;
    private String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    private String[] strCor = {"Vermelhao", "Vermelho", "Amarelo", "Verde", "Verdao"};
    private String[] strFlecha = {"cima", "meio", "baixo"};
    private String tabela, insert, campo, select, codTab;
    private String reaAcu[] = new String[12];
    private String metAcu[] = new String[12];
    private String forAcu[] = new String[12];
    private String desAcu[] = new String[12];
    private String desPerAcu[] = new String[12];
    private String hisAcu[] = new String[12];
    private String benAcu[] = new String[12];
    private String ideAcu[] = new String[12];
    private String metAntAcu[] = new String[12];
    private String reaMen[] = new String[12];
    private String metMen[] = new String[12];
    private String forMen[] = new String[12];
    private String desMen[] = new String[12];
    private String desPerMen[] = new String[12];
    private String hisMen[] = new String[12];
    private String benMen[] = new String[12];
    private String ideMen[] = new String[12];
    private String metAntMen[] = new String[12];
    private String strAux;
    
    private TempGrafico tempGrafico;
    private JFreeChart chart;

    public Graficos(){
        Info.graficos = this;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollGraficos = new javax.swing.JScrollPane();
        jPanelGraficos = new javax.swing.JPanel();
        lblStatus1 = new javax.swing.JLabel();
        lblResponsavel1 = new javax.swing.JLabel();
        lblIndicador1 = new javax.swing.JLabel();
        lblResponsavel2 = new javax.swing.JLabel();
        lblIndicador2 = new javax.swing.JLabel();
        btnFatoCausaAcao = new javax.swing.JButton();
        jPanelGraficoEvoAcum = new javax.swing.JPanel();
        jPanelGraficoDesvPerc = new javax.swing.JPanel();
        lblAcumFev = new javax.swing.JLabel();
        lblAcumulado = new javax.swing.JLabel();
        lblAcumJan = new javax.swing.JLabel();
        lblAcumMai = new javax.swing.JLabel();
        lblAcumMar = new javax.swing.JLabel();
        lblAcumAbr = new javax.swing.JLabel();
        lblAcumJul = new javax.swing.JLabel();
        lblAcumAgo = new javax.swing.JLabel();
        lblAcumSet = new javax.swing.JLabel();
        lblAcumOut = new javax.swing.JLabel();
        lblAcumDez = new javax.swing.JLabel();
        lblAcumJun = new javax.swing.JLabel();
        lblAcumNov = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblTendencia = new javax.swing.JLabel();
        lblAcumReal = new javax.swing.JLabel();
        lblAcumMeta = new javax.swing.JLabel();
        lblAcumForc = new javax.swing.JLabel();
        lblAcumDesvPer = new javax.swing.JLabel();
        lblAcumDesv = new javax.swing.JLabel();
        lblAcumRealHis = new javax.swing.JLabel();
        lblAcumBench = new javax.swing.JLabel();
        lblAcumIdeal = new javax.swing.JLabel();
        lblAcumMetaAnt = new javax.swing.JLabel();
        txtAcumRealFev = new javax.swing.JTextField();
        txtAcumMetaFev = new javax.swing.JTextField();
        txtAcumForcFev = new javax.swing.JTextField();
        txtAcumDesvFev = new javax.swing.JTextField();
        txtAcumDesvPerFev = new javax.swing.JTextField();
        txtAcumRealHisFev = new javax.swing.JTextField();
        txtAcumBenchFev = new javax.swing.JTextField();
        txtAcumIdealFev = new javax.swing.JTextField();
        txtAcumMetaAntFev = new javax.swing.JTextField();
        txtAcumRealMar = new javax.swing.JTextField();
        txtAcumMetaMar = new javax.swing.JTextField();
        txtAcumForcMar = new javax.swing.JTextField();
        txtAcumDesvMar = new javax.swing.JTextField();
        txtAcumDesvPerMar = new javax.swing.JTextField();
        txtAcumRealHisMar = new javax.swing.JTextField();
        txtAcumBenchMar = new javax.swing.JTextField();
        txtAcumIdealMar = new javax.swing.JTextField();
        txtAcumMetaAntMar = new javax.swing.JTextField();
        txtAcumRealAbr = new javax.swing.JTextField();
        txtAcumMetaAbr = new javax.swing.JTextField();
        txtAcumForcAbr = new javax.swing.JTextField();
        txtAcumDesvAbr = new javax.swing.JTextField();
        txtAcumDesvPerAbr = new javax.swing.JTextField();
        txtAcumRealHisAbr = new javax.swing.JTextField();
        txtAcumBenchAbr = new javax.swing.JTextField();
        txtAcumIdealAbr = new javax.swing.JTextField();
        txtAcumMetaAntAbr = new javax.swing.JTextField();
        txtAcumRealMai = new javax.swing.JTextField();
        txtAcumMetaMai = new javax.swing.JTextField();
        txtAcumForcMai = new javax.swing.JTextField();
        txtAcumDesvMai = new javax.swing.JTextField();
        txtAcumDesvPerMai = new javax.swing.JTextField();
        txtAcumRealHisMai = new javax.swing.JTextField();
        txtAcumBenchMai = new javax.swing.JTextField();
        txtAcumIdealMai = new javax.swing.JTextField();
        txtAcumMetaAntMai = new javax.swing.JTextField();
        txtAcumRealJun = new javax.swing.JTextField();
        txtAcumMetaJun = new javax.swing.JTextField();
        txtAcumForcJun = new javax.swing.JTextField();
        txtAcumDesvJun = new javax.swing.JTextField();
        txtAcumDesvPerJun = new javax.swing.JTextField();
        txtAcumRealHisJun = new javax.swing.JTextField();
        txtAcumBenchJun = new javax.swing.JTextField();
        txtAcumIdealJun = new javax.swing.JTextField();
        txtAcumMetaAntJun = new javax.swing.JTextField();
        txtAcumRealJul = new javax.swing.JTextField();
        txtAcumMetaJul = new javax.swing.JTextField();
        txtAcumForcJul = new javax.swing.JTextField();
        txtAcumDesvJul = new javax.swing.JTextField();
        txtAcumDesvPerJul = new javax.swing.JTextField();
        txtAcumRealHisJul = new javax.swing.JTextField();
        txtAcumBenchJul = new javax.swing.JTextField();
        txtAcumIdealJul = new javax.swing.JTextField();
        txtAcumMetaAntJul = new javax.swing.JTextField();
        txtAcumRealAgo = new javax.swing.JTextField();
        txtAcumMetaAgo = new javax.swing.JTextField();
        txtAcumForcAgo = new javax.swing.JTextField();
        txtAcumDesvAgo = new javax.swing.JTextField();
        txtAcumDesvPerAgo = new javax.swing.JTextField();
        txtAcumRealHisAgo = new javax.swing.JTextField();
        txtAcumBenchAgo = new javax.swing.JTextField();
        txtAcumIdealAgo = new javax.swing.JTextField();
        txtAcumMetaAntAgo = new javax.swing.JTextField();
        txtAcumRealJan = new javax.swing.JTextField();
        txtAcumMetaJan = new javax.swing.JTextField();
        txtAcumForcJan = new javax.swing.JTextField();
        txtAcumDesvJan = new javax.swing.JTextField();
        txtAcumDesvPerJan = new javax.swing.JTextField();
        txtAcumRealHisJan = new javax.swing.JTextField();
        txtAcumBenchJan = new javax.swing.JTextField();
        txtAcumIdealJan = new javax.swing.JTextField();
        txtAcumMetaAntJan = new javax.swing.JTextField();
        txtAcumRealSet = new javax.swing.JTextField();
        txtAcumMetaSet = new javax.swing.JTextField();
        txtAcumForcSet = new javax.swing.JTextField();
        txtAcumDesvSet = new javax.swing.JTextField();
        txtAcumDesvPerSet = new javax.swing.JTextField();
        txtAcumRealHisSet = new javax.swing.JTextField();
        txtAcumBenchSet = new javax.swing.JTextField();
        txtAcumIdealSet = new javax.swing.JTextField();
        txtAcumMetaAntSet = new javax.swing.JTextField();
        txtAcumRealOut = new javax.swing.JTextField();
        txtAcumMetaOut = new javax.swing.JTextField();
        txtAcumForcOut = new javax.swing.JTextField();
        txtAcumDesvOut = new javax.swing.JTextField();
        txtAcumDesvPerOut = new javax.swing.JTextField();
        txtAcumRealHisOut = new javax.swing.JTextField();
        txtAcumBenchOut = new javax.swing.JTextField();
        txtAcumIdealOut = new javax.swing.JTextField();
        txtAcumMetaAntOut = new javax.swing.JTextField();
        txtAcumRealNov = new javax.swing.JTextField();
        txtAcumMetaNov = new javax.swing.JTextField();
        txtAcumForcNov = new javax.swing.JTextField();
        txtAcumDesvNov = new javax.swing.JTextField();
        txtAcumDesvPerNov = new javax.swing.JTextField();
        txtAcumRealHisNov = new javax.swing.JTextField();
        txtAcumBenchNov = new javax.swing.JTextField();
        txtAcumIdealNov = new javax.swing.JTextField();
        txtAcumMetaAntNov = new javax.swing.JTextField();
        txtAcumRealDez = new javax.swing.JTextField();
        txtAcumMetaDez = new javax.swing.JTextField();
        txtAcumForcDez = new javax.swing.JTextField();
        txtAcumDesvDez = new javax.swing.JTextField();
        txtAcumDesvPerDez = new javax.swing.JTextField();
        txtAcumRealHisDez = new javax.swing.JTextField();
        txtAcumBenchDez = new javax.swing.JTextField();
        txtAcumIdealDez = new javax.swing.JTextField();
        txtAcumMetaAntDez = new javax.swing.JTextField();
        lblMenFev = new javax.swing.JLabel();
        lblMensal = new javax.swing.JLabel();
        lblMenJan = new javax.swing.JLabel();
        lblMenMai = new javax.swing.JLabel();
        lblMenMar = new javax.swing.JLabel();
        lblMenAbr = new javax.swing.JLabel();
        lblMenJul = new javax.swing.JLabel();
        lblMenAgo = new javax.swing.JLabel();
        lblMenSet = new javax.swing.JLabel();
        lblMenOut = new javax.swing.JLabel();
        lblMenDez = new javax.swing.JLabel();
        lblMenJun = new javax.swing.JLabel();
        lblMenNov = new javax.swing.JLabel();
        lblMenReal = new javax.swing.JLabel();
        lblMenMeta = new javax.swing.JLabel();
        lblMenForc = new javax.swing.JLabel();
        lblMenDesvPer = new javax.swing.JLabel();
        lblMenDesv = new javax.swing.JLabel();
        lblMenRealHis = new javax.swing.JLabel();
        lblMenBench = new javax.swing.JLabel();
        lblMenIdeal = new javax.swing.JLabel();
        lblMenMetaAnt = new javax.swing.JLabel();
        txtMenRealFev = new javax.swing.JTextField();
        txtMenMetaFev = new javax.swing.JTextField();
        txtMenForcFev = new javax.swing.JTextField();
        txtMenDesvFev = new javax.swing.JTextField();
        txtMenDesvPerFev = new javax.swing.JTextField();
        txtMenRealHisFev = new javax.swing.JTextField();
        txtMenBenchFev = new javax.swing.JTextField();
        txtMenIdealFev = new javax.swing.JTextField();
        txtMenMetaAntFev = new javax.swing.JTextField();
        txtMenRealMar = new javax.swing.JTextField();
        txtMenMetaMar = new javax.swing.JTextField();
        txtMenForcMar = new javax.swing.JTextField();
        txtMenDesvMar = new javax.swing.JTextField();
        txtMenDesvPerMar = new javax.swing.JTextField();
        txtMenRealHisMar = new javax.swing.JTextField();
        txtMenBenchMar = new javax.swing.JTextField();
        txtMenIdealMar = new javax.swing.JTextField();
        txtMenMetaAntMar = new javax.swing.JTextField();
        txtMenRealAbr = new javax.swing.JTextField();
        txtMenMetaAbr = new javax.swing.JTextField();
        txtMenForcAbr = new javax.swing.JTextField();
        txtMenDesvAbr = new javax.swing.JTextField();
        txtMenDesvPerAbr = new javax.swing.JTextField();
        txtMenRealHisAbr = new javax.swing.JTextField();
        txtMenBenchAbr = new javax.swing.JTextField();
        txtMenIdealAbr = new javax.swing.JTextField();
        txtMenMetaAntAbr = new javax.swing.JTextField();
        txtMenRealMai = new javax.swing.JTextField();
        txtMenMetaMai = new javax.swing.JTextField();
        txtMenForcMai = new javax.swing.JTextField();
        txtMenDesvMai = new javax.swing.JTextField();
        txtMenDesvPerMai = new javax.swing.JTextField();
        txtMenRealHisMai = new javax.swing.JTextField();
        txtMenBenchMai = new javax.swing.JTextField();
        txtMenIdealMai = new javax.swing.JTextField();
        txtMenMetaAntMai = new javax.swing.JTextField();
        txtMenRealJun = new javax.swing.JTextField();
        txtMenMetaJun = new javax.swing.JTextField();
        txtMenForcJun = new javax.swing.JTextField();
        txtMenDesvJun = new javax.swing.JTextField();
        txtMenDesvPerJun = new javax.swing.JTextField();
        txtMenRealHisJun = new javax.swing.JTextField();
        txtMenBenchJun = new javax.swing.JTextField();
        txtMenIdealJun = new javax.swing.JTextField();
        txtMenMetaAntJun = new javax.swing.JTextField();
        txtMenRealJul = new javax.swing.JTextField();
        txtMenMetaJul = new javax.swing.JTextField();
        txtMenForcJul = new javax.swing.JTextField();
        txtMenDesvJul = new javax.swing.JTextField();
        txtMenDesvPerJul = new javax.swing.JTextField();
        txtMenRealHisJul = new javax.swing.JTextField();
        txtMenBenchJul = new javax.swing.JTextField();
        txtMenIdealJul = new javax.swing.JTextField();
        txtMenMetaAntJul = new javax.swing.JTextField();
        txtMenRealAgo = new javax.swing.JTextField();
        txtMenMetaAgo = new javax.swing.JTextField();
        txtMenForcAgo = new javax.swing.JTextField();
        txtMenDesvAgo = new javax.swing.JTextField();
        txtMenDesvPerAgo = new javax.swing.JTextField();
        txtMenRealHisAgo = new javax.swing.JTextField();
        txtMenBenchAgo = new javax.swing.JTextField();
        txtMenIdealAgo = new javax.swing.JTextField();
        txtMenMetaAntAgo = new javax.swing.JTextField();
        txtMenRealJan = new javax.swing.JTextField();
        txtMenMetaJan = new javax.swing.JTextField();
        txtMenForcJan = new javax.swing.JTextField();
        txtMenDesvJan = new javax.swing.JTextField();
        txtMenDesvPerJan = new javax.swing.JTextField();
        txtMenRealHisJan = new javax.swing.JTextField();
        txtMenBenchJan = new javax.swing.JTextField();
        txtMenIdealJan = new javax.swing.JTextField();
        txtMenMetaAntJan = new javax.swing.JTextField();
        txtMenRealSet = new javax.swing.JTextField();
        txtMenMetaSet = new javax.swing.JTextField();
        txtMenForcSet = new javax.swing.JTextField();
        txtMenDesvSet = new javax.swing.JTextField();
        txtMenDesvPerSet = new javax.swing.JTextField();
        txtMenRealHisSet = new javax.swing.JTextField();
        txtMenBenchSet = new javax.swing.JTextField();
        txtMenIdealSet = new javax.swing.JTextField();
        txtMenMetaAntSet = new javax.swing.JTextField();
        txtMenRealOut = new javax.swing.JTextField();
        txtMenMetaOut = new javax.swing.JTextField();
        txtMenForcOut = new javax.swing.JTextField();
        txtMenDesvOut = new javax.swing.JTextField();
        txtMenDesvPerOut = new javax.swing.JTextField();
        txtMenRealHisOut = new javax.swing.JTextField();
        txtMenBenchOut = new javax.swing.JTextField();
        txtMenIdealOut = new javax.swing.JTextField();
        txtMenMetaAntOut = new javax.swing.JTextField();
        txtMenRealNov = new javax.swing.JTextField();
        txtMenMetaNov = new javax.swing.JTextField();
        txtMenForcNov = new javax.swing.JTextField();
        txtMenDesvNov = new javax.swing.JTextField();
        txtMenDesvPerNov = new javax.swing.JTextField();
        txtMenRealHisNov = new javax.swing.JTextField();
        txtMenBenchNov = new javax.swing.JTextField();
        txtMenIdealNov = new javax.swing.JTextField();
        txtMenMetaAntNov = new javax.swing.JTextField();
        txtMenRealDez = new javax.swing.JTextField();
        txtMenMetaDez = new javax.swing.JTextField();
        txtMenForcDez = new javax.swing.JTextField();
        txtMenDesvDez = new javax.swing.JTextField();
        txtMenDesvPerDez = new javax.swing.JTextField();
        txtMenRealHisDez = new javax.swing.JTextField();
        txtMenBenchDez = new javax.swing.JTextField();
        txtMenIdealDez = new javax.swing.JTextField();
        txtMenMetaAntDez = new javax.swing.JTextField();
        lblStatusJan = new javax.swing.JLabel();
        lblStatusFev = new javax.swing.JLabel();
        lblStatusMar = new javax.swing.JLabel();
        lblStatusAbr = new javax.swing.JLabel();
        lblStatusMai = new javax.swing.JLabel();
        lblStatusJun = new javax.swing.JLabel();
        lblStatusJul = new javax.swing.JLabel();
        lblStatusAgo = new javax.swing.JLabel();
        lblStatusSet = new javax.swing.JLabel();
        lblStatusOut = new javax.swing.JLabel();
        lblStatusNov = new javax.swing.JLabel();
        lblStatusDez = new javax.swing.JLabel();
        lblTendenciaJan = new javax.swing.JLabel();
        lblTendenciaFev = new javax.swing.JLabel();
        lblTendenciaMar = new javax.swing.JLabel();
        lblTendenciaAbr = new javax.swing.JLabel();
        lblTendenciaMai = new javax.swing.JLabel();
        lblTendenciaJun = new javax.swing.JLabel();
        lblTendenciaJul = new javax.swing.JLabel();
        lblTendenciaAgo = new javax.swing.JLabel();
        lblTendenciaSet = new javax.swing.JLabel();
        lblTendenciaOut = new javax.swing.JLabel();
        lblTendenciaNov = new javax.swing.JLabel();
        lblTendenciaDez = new javax.swing.JLabel();
        btnGraTrocaDesvio = new javax.swing.JButton();
        btnGraTrocaRealxMeta1 = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        lblStatus2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblVariacao1 = new javax.swing.JLabel();
        lblVariacao2 = new javax.swing.JLabel();

        setMinimumSize(getMaximumSize());
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollGraficos.setMinimumSize(getMaximumSize());

        jPanelGraficos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStatus1.setBackground(new java.awt.Color(15, 36, 62));
        lblStatus1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblStatus1.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus1.setText("Status");
        lblStatus1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatus1.setOpaque(true);
        jPanelGraficos.add(lblStatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, -1));

        lblResponsavel1.setBackground(new java.awt.Color(15, 36, 62));
        lblResponsavel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblResponsavel1.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel1.setText("Responsável");
        lblResponsavel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblResponsavel1.setOpaque(true);
        jPanelGraficos.add(lblResponsavel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 220, -1));

        lblIndicador1.setBackground(new java.awt.Color(15, 36, 62));
        lblIndicador1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblIndicador1.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicador1.setText("Indicador");
        lblIndicador1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblIndicador1.setOpaque(true);
        jPanelGraficos.add(lblIndicador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 570, -1));

        lblResponsavel2.setBackground(new java.awt.Color(54, 96, 146));
        lblResponsavel2.setForeground(new java.awt.Color(255, 255, 255));
        lblResponsavel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResponsavel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblResponsavel2.setOpaque(true);
        jPanelGraficos.add(lblResponsavel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 220, 50));

        lblIndicador2.setBackground(new java.awt.Color(54, 96, 146));
        lblIndicador2.setForeground(new java.awt.Color(255, 255, 255));
        lblIndicador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIndicador2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblIndicador2.setOpaque(true);
        jPanelGraficos.add(lblIndicador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 570, 50));

        btnFatoCausaAcao.setBackground(new java.awt.Color(54, 96, 146));
        btnFatoCausaAcao.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnFatoCausaAcao.setForeground(new java.awt.Color(255, 255, 255));
        btnFatoCausaAcao.setText("Fato, Causa e Ação");
        btnFatoCausaAcao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        btnFatoCausaAcao.setOpaque(true);
        btnFatoCausaAcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFatoCausaAcaoActionPerformed(evt);
            }
        });
        jPanelGraficos.add(btnFatoCausaAcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 30, 180, 50));

        jPanelGraficoEvoAcum.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelGraficos.add(jPanelGraficoEvoAcum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 610, 400));

        jPanelGraficoDesvPerc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanelGraficos.add(jPanelGraficoDesvPerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 610, 400));

        lblAcumFev.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumFev.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumFev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumFev.setText("FEVEREIRO");
        lblAcumFev.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumFev.setOpaque(true);
        jPanelGraficos.add(lblAcumFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 90, 20));

        lblAcumulado.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumulado.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumulado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumulado.setText("ACUMULADO");
        lblAcumulado.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumulado.setOpaque(true);
        jPanelGraficos.add(lblAcumulado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 220, 20));

        lblAcumJan.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumJan.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumJan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumJan.setText("JANEIRO");
        lblAcumJan.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumJan.setOpaque(true);
        jPanelGraficos.add(lblAcumJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 90, 20));

        lblAcumMai.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumMai.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumMai.setText("MAIO");
        lblAcumMai.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumMai.setOpaque(true);
        jPanelGraficos.add(lblAcumMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, 90, 20));

        lblAcumMar.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumMar.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumMar.setText("MARÇO");
        lblAcumMar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumMar.setOpaque(true);
        jPanelGraficos.add(lblAcumMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 90, 20));

        lblAcumAbr.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumAbr.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumAbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumAbr.setText("ABRIL");
        lblAcumAbr.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumAbr.setOpaque(true);
        jPanelGraficos.add(lblAcumAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 550, 90, 20));

        lblAcumJul.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumJul.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumJul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumJul.setText("JULHO");
        lblAcumJul.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumJul.setOpaque(true);
        jPanelGraficos.add(lblAcumJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 90, 20));

        lblAcumAgo.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumAgo.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumAgo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumAgo.setText("AGOSTO");
        lblAcumAgo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumAgo.setOpaque(true);
        jPanelGraficos.add(lblAcumAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 90, 20));

        lblAcumSet.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumSet.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumSet.setText("SETEMBRO");
        lblAcumSet.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumSet.setOpaque(true);
        jPanelGraficos.add(lblAcumSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, 90, 20));

        lblAcumOut.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumOut.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumOut.setText("OUTUBRO");
        lblAcumOut.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumOut.setOpaque(true);
        jPanelGraficos.add(lblAcumOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 550, 90, 20));

        lblAcumDez.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumDez.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumDez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumDez.setText("DEZEMBRO");
        lblAcumDez.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumDez.setOpaque(true);
        jPanelGraficos.add(lblAcumDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 550, 90, 20));

        lblAcumJun.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumJun.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumJun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumJun.setText("JUNHO");
        lblAcumJun.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumJun.setOpaque(true);
        jPanelGraficos.add(lblAcumJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 550, 90, 20));

        lblAcumNov.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumNov.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumNov.setText("NOVEMBRO");
        lblAcumNov.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumNov.setOpaque(true);
        jPanelGraficos.add(lblAcumNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 550, 90, 20));

        lblStatus.setBackground(new java.awt.Color(253, 233, 217));
        lblStatus.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Status");
        lblStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblStatus.setOpaque(true);
        jPanelGraficos.add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 220, 20));

        lblTendencia.setBackground(new java.awt.Color(253, 233, 217));
        lblTendencia.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblTendencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendencia.setText("Tendência");
        lblTendencia.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblTendencia.setOpaque(true);
        jPanelGraficos.add(lblTendencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 220, 20));

        lblAcumReal.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumReal.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumReal.setText("Real - Acum");
        lblAcumReal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumReal.setOpaque(true);
        jPanelGraficos.add(lblAcumReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 220, 20));

        lblAcumMeta.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumMeta.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumMeta.setText("Meta - Acum");
        lblAcumMeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumMeta.setOpaque(true);
        jPanelGraficos.add(lblAcumMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 220, 20));

        lblAcumForc.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumForc.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumForc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumForc.setText("Forecast - Acum");
        lblAcumForc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumForc.setOpaque(true);
        jPanelGraficos.add(lblAcumForc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 220, 20));

        lblAcumDesvPer.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumDesvPer.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumDesvPer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumDesvPer.setText("Desvio % - Acum");
        lblAcumDesvPer.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumDesvPer.setOpaque(true);
        jPanelGraficos.add(lblAcumDesvPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 220, 20));

        lblAcumDesv.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumDesv.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumDesv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumDesv.setText("Desvio - Acum");
        lblAcumDesv.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumDesv.setOpaque(true);
        jPanelGraficos.add(lblAcumDesv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 220, 20));

        lblAcumRealHis.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumRealHis.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumRealHis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumRealHis.setText("Real (Ano Anterior) - Acum");
        lblAcumRealHis.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumRealHis.setOpaque(true);
        jPanelGraficos.add(lblAcumRealHis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 220, 20));

        lblAcumBench.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumBench.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumBench.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumBench.setText("Valor Referencial / Benchmark - Acum");
        lblAcumBench.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumBench.setOpaque(true);
        jPanelGraficos.add(lblAcumBench, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 220, 20));

        lblAcumIdeal.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumIdeal.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumIdeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumIdeal.setText("Valor Ideal - Acum");
        lblAcumIdeal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumIdeal.setOpaque(true);
        jPanelGraficos.add(lblAcumIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 750, 220, 20));

        lblAcumMetaAnt.setBackground(new java.awt.Color(253, 233, 217));
        lblAcumMetaAnt.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblAcumMetaAnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAcumMetaAnt.setText("Meta Versao Anteriro - Acum");
        lblAcumMetaAnt.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblAcumMetaAnt.setOpaque(true);
        jPanelGraficos.add(lblAcumMetaAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 770, 220, 20));

        txtAcumRealFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, 90, 20));

        txtAcumMetaFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 630, 90, 20));

        txtAcumForcFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 650, 90, 20));

        txtAcumDesvFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 670, 90, 20));

        txtAcumDesvPerFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 690, 90, 20));

        txtAcumRealHisFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, 90, 20));

        txtAcumBenchFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 730, 90, 20));

        txtAcumIdealFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 750, 90, 20));

        txtAcumMetaAntFev.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 770, 90, 20));

        txtAcumRealMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 90, 20));

        txtAcumMetaMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 630, 90, 20));

        txtAcumForcMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 650, 90, 20));

        txtAcumDesvMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 670, 90, 20));

        txtAcumDesvPerMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 690, 90, 20));

        txtAcumRealHisMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 710, 90, 20));

        txtAcumBenchMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 730, 90, 20));

        txtAcumIdealMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 750, 90, 20));

        txtAcumMetaAntMar.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 770, 90, 20));

        txtAcumRealAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 90, 20));

        txtAcumMetaAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 90, 20));

        txtAcumForcAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, 90, 20));

        txtAcumDesvAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 670, 90, 20));

        txtAcumDesvPerAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 690, 90, 20));

        txtAcumRealHisAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 710, 90, 20));

        txtAcumBenchAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 730, 90, 20));

        txtAcumIdealAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 750, 90, 20));

        txtAcumMetaAntAbr.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 770, 90, 20));

        txtAcumRealMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 90, 20));

        txtAcumMetaMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 630, 90, 20));

        txtAcumForcMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 90, 20));

        txtAcumDesvMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 670, 90, 20));

        txtAcumDesvPerMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 690, 90, 20));

        txtAcumRealHisMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 710, 90, 20));

        txtAcumBenchMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 730, 90, 20));

        txtAcumIdealMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 750, 90, 20));

        txtAcumMetaAntMai.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 770, 90, 20));

        txtAcumRealJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 610, 90, 20));

        txtAcumMetaJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 630, 90, 20));

        txtAcumForcJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 650, 90, 20));

        txtAcumDesvJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 670, 90, 20));

        txtAcumDesvPerJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 690, 90, 20));

        txtAcumRealHisJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 710, 90, 20));

        txtAcumBenchJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 730, 90, 20));

        txtAcumIdealJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 750, 90, 20));

        txtAcumMetaAntJun.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 770, 90, 20));

        txtAcumRealJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 90, 20));

        txtAcumMetaJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 90, 20));

        txtAcumForcJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, 90, 20));

        txtAcumDesvJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 670, 90, 20));

        txtAcumDesvPerJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 690, 90, 20));

        txtAcumRealHisJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, 90, 20));

        txtAcumBenchJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 730, 90, 20));

        txtAcumIdealJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 750, 90, 20));

        txtAcumMetaAntJul.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 770, 90, 20));

        txtAcumRealAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 90, 20));

        txtAcumMetaAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 630, 90, 20));

        txtAcumForcAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 90, 20));

        txtAcumDesvAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 670, 90, 20));

        txtAcumDesvPerAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 690, 90, 20));

        txtAcumRealHisAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 710, 90, 20));

        txtAcumBenchAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 730, 90, 20));

        txtAcumIdealAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 750, 90, 20));

        txtAcumMetaAntAgo.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 770, 90, 20));

        txtAcumRealJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 90, 20));

        txtAcumMetaJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 90, 20));

        txtAcumForcJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 90, 20));

        txtAcumDesvJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, 90, 20));

        txtAcumDesvPerJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 690, 90, 20));

        txtAcumRealHisJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, 90, 20));

        txtAcumBenchJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 730, 90, 20));

        txtAcumIdealJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 750, 90, 20));

        txtAcumMetaAntJan.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 770, 90, 20));

        txtAcumRealSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 90, 20));

        txtAcumMetaSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 630, 90, 20));

        txtAcumForcSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 650, 90, 20));

        txtAcumDesvSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 670, 90, 20));

        txtAcumDesvPerSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 690, 90, 20));

        txtAcumRealHisSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 710, 90, 20));

        txtAcumBenchSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 730, 90, 20));

        txtAcumIdealSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 750, 90, 20));

        txtAcumMetaAntSet.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 770, 90, 20));

        txtAcumRealOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, 90, 20));

        txtAcumMetaOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 630, 90, 20));

        txtAcumForcOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 650, 90, 20));

        txtAcumDesvOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 670, 90, 20));

        txtAcumDesvPerOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 690, 90, 20));

        txtAcumRealHisOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 710, 90, 20));

        txtAcumBenchOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 730, 90, 20));

        txtAcumIdealOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 750, 90, 20));

        txtAcumMetaAntOut.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 770, 90, 20));

        txtAcumRealNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 610, 90, 20));

        txtAcumMetaNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 630, 90, 20));

        txtAcumForcNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 650, 90, 20));

        txtAcumDesvNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 670, 90, 20));

        txtAcumDesvPerNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 690, 90, 20));

        txtAcumRealHisNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 710, 90, 20));

        txtAcumBenchNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 730, 90, 20));

        txtAcumIdealNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 750, 90, 20));

        txtAcumMetaAntNov.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 770, 90, 20));

        txtAcumRealDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 610, 90, 20));

        txtAcumMetaDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 630, 90, 20));

        txtAcumForcDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumForcDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumForcDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumForcDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumForcDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 650, 90, 20));

        txtAcumDesvDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 670, 90, 20));

        txtAcumDesvPerDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumDesvPerDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumDesvPerDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumDesvPerDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumDesvPerDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 690, 90, 20));

        txtAcumRealHisDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumRealHisDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumRealHisDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumRealHisDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumRealHisDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 710, 90, 20));

        txtAcumBenchDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumBenchDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumBenchDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumBenchDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumBenchDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 730, 90, 20));

        txtAcumIdealDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumIdealDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumIdealDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumIdealDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumIdealDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 750, 90, 20));

        txtAcumMetaAntDez.setBackground(new java.awt.Color(253, 233, 217));
        txtAcumMetaAntDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtAcumMetaAntDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtAcumMetaAntDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtAcumMetaAntDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 770, 90, 20));

        lblMenFev.setBackground(new java.awt.Color(216, 228, 188));
        lblMenFev.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenFev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenFev.setText("FEVEREIRO");
        lblMenFev.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenFev.setOpaque(true);
        jPanelGraficos.add(lblMenFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 800, 90, 20));

        lblMensal.setBackground(new java.awt.Color(216, 228, 188));
        lblMensal.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMensal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensal.setText("MENSAL");
        lblMensal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMensal.setOpaque(true);
        jPanelGraficos.add(lblMensal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 220, 20));

        lblMenJan.setBackground(new java.awt.Color(216, 228, 188));
        lblMenJan.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenJan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenJan.setText("JANEIRO");
        lblMenJan.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenJan.setOpaque(true);
        jPanelGraficos.add(lblMenJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 800, 90, 20));

        lblMenMai.setBackground(new java.awt.Color(216, 228, 188));
        lblMenMai.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenMai.setText("MAIO");
        lblMenMai.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenMai.setOpaque(true);
        jPanelGraficos.add(lblMenMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 800, 90, 20));

        lblMenMar.setBackground(new java.awt.Color(216, 228, 188));
        lblMenMar.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenMar.setText("MARÇO");
        lblMenMar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenMar.setOpaque(true);
        jPanelGraficos.add(lblMenMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 800, 90, 20));

        lblMenAbr.setBackground(new java.awt.Color(216, 228, 188));
        lblMenAbr.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenAbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenAbr.setText("ABRIL");
        lblMenAbr.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenAbr.setOpaque(true);
        jPanelGraficos.add(lblMenAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 800, 90, 20));

        lblMenJul.setBackground(new java.awt.Color(216, 228, 188));
        lblMenJul.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenJul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenJul.setText("JULHO");
        lblMenJul.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenJul.setOpaque(true);
        jPanelGraficos.add(lblMenJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 800, 90, 20));

        lblMenAgo.setBackground(new java.awt.Color(216, 228, 188));
        lblMenAgo.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenAgo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenAgo.setText("AGOSTO");
        lblMenAgo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenAgo.setOpaque(true);
        jPanelGraficos.add(lblMenAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 800, 90, 20));

        lblMenSet.setBackground(new java.awt.Color(216, 228, 188));
        lblMenSet.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenSet.setText("SETEMBRO");
        lblMenSet.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenSet.setOpaque(true);
        jPanelGraficos.add(lblMenSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 800, 90, 20));

        lblMenOut.setBackground(new java.awt.Color(216, 228, 188));
        lblMenOut.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenOut.setText("OUTUBRO");
        lblMenOut.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenOut.setOpaque(true);
        jPanelGraficos.add(lblMenOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 800, 90, 20));

        lblMenDez.setBackground(new java.awt.Color(216, 228, 188));
        lblMenDez.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenDez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenDez.setText("DEZEMBRO");
        lblMenDez.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenDez.setOpaque(true);
        jPanelGraficos.add(lblMenDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 800, 90, 20));

        lblMenJun.setBackground(new java.awt.Color(216, 228, 188));
        lblMenJun.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenJun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenJun.setText("JUNHO");
        lblMenJun.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenJun.setOpaque(true);
        jPanelGraficos.add(lblMenJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 800, 90, 20));

        lblMenNov.setBackground(new java.awt.Color(216, 228, 188));
        lblMenNov.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenNov.setText("NOVEMBRO");
        lblMenNov.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenNov.setOpaque(true);
        jPanelGraficos.add(lblMenNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 800, 90, 20));

        lblMenReal.setBackground(new java.awt.Color(216, 228, 188));
        lblMenReal.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenReal.setText("Real - Mensal");
        lblMenReal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenReal.setOpaque(true);
        jPanelGraficos.add(lblMenReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 220, 20));

        lblMenMeta.setBackground(new java.awt.Color(216, 228, 188));
        lblMenMeta.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenMeta.setLabelFor(lblMenMeta);
        lblMenMeta.setText("Meta - Mensal");
        lblMenMeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenMeta.setOpaque(true);
        jPanelGraficos.add(lblMenMeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 840, 220, 20));

        lblMenForc.setBackground(new java.awt.Color(216, 228, 188));
        lblMenForc.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenForc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenForc.setText("Forecast - Mensal");
        lblMenForc.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenForc.setOpaque(true);
        jPanelGraficos.add(lblMenForc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 860, 220, 20));

        lblMenDesvPer.setBackground(new java.awt.Color(216, 228, 188));
        lblMenDesvPer.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenDesvPer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenDesvPer.setText("Desvio % - Mensal");
        lblMenDesvPer.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenDesvPer.setOpaque(true);
        jPanelGraficos.add(lblMenDesvPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 900, 220, 20));

        lblMenDesv.setBackground(new java.awt.Color(216, 228, 188));
        lblMenDesv.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenDesv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenDesv.setText("Desvio - Mensal");
        lblMenDesv.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenDesv.setOpaque(true);
        jPanelGraficos.add(lblMenDesv, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 880, 220, 20));

        lblMenRealHis.setBackground(new java.awt.Color(216, 228, 188));
        lblMenRealHis.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenRealHis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenRealHis.setText("Real (Ano Anterior) - Mensal");
        lblMenRealHis.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenRealHis.setOpaque(true);
        jPanelGraficos.add(lblMenRealHis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, 220, 20));

        lblMenBench.setBackground(new java.awt.Color(216, 228, 188));
        lblMenBench.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenBench.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenBench.setText("Valor Referencial / Benchmark - Mensal");
        lblMenBench.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenBench.setOpaque(true);
        jPanelGraficos.add(lblMenBench, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 940, 220, 20));

        lblMenIdeal.setBackground(new java.awt.Color(216, 228, 188));
        lblMenIdeal.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenIdeal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenIdeal.setText("Valor Ideal - Mensal");
        lblMenIdeal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenIdeal.setOpaque(true);
        jPanelGraficos.add(lblMenIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 960, 220, 20));

        lblMenMetaAnt.setBackground(new java.awt.Color(216, 228, 188));
        lblMenMetaAnt.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        lblMenMetaAnt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMenMetaAnt.setText("Meta Versao Anteriro - Mensal");
        lblMenMetaAnt.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 0), null));
        lblMenMetaAnt.setOpaque(true);
        jPanelGraficos.add(lblMenMetaAnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 980, 220, 20));

        txtMenRealFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 820, 90, 20));

        txtMenMetaFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 840, 90, 20));

        txtMenForcFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 860, 90, 20));

        txtMenDesvFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 880, 90, 20));

        txtMenDesvPerFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 900, 90, 20));

        txtMenRealHisFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 920, 90, 20));

        txtMenBenchFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 940, 90, 20));

        txtMenIdealFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 960, 90, 20));

        txtMenMetaAntFev.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntFev.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntFev.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 980, 90, 20));

        txtMenRealMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 820, 90, 20));

        txtMenMetaMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 840, 90, 20));

        txtMenForcMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 860, 90, 20));

        txtMenDesvMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 880, 90, 20));

        txtMenDesvPerMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 900, 90, 20));

        txtMenRealHisMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 920, 90, 20));

        txtMenBenchMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 940, 90, 20));

        txtMenIdealMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 960, 90, 20));

        txtMenMetaAntMar.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntMar.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntMar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 980, 90, 20));

        txtMenRealAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 820, 90, 20));

        txtMenMetaAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 840, 90, 20));

        txtMenForcAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 860, 90, 20));

        txtMenDesvAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 880, 90, 20));

        txtMenDesvPerAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 900, 90, 20));

        txtMenRealHisAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 920, 90, 20));

        txtMenBenchAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 940, 90, 20));

        txtMenIdealAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 960, 90, 20));

        txtMenMetaAntAbr.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntAbr.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntAbr.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 980, 90, 20));

        txtMenRealMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 820, 90, 20));

        txtMenMetaMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 840, 90, 20));

        txtMenForcMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 860, 90, 20));

        txtMenDesvMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 880, 90, 20));

        txtMenDesvPerMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 900, 90, 20));

        txtMenRealHisMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 920, 90, 20));

        txtMenBenchMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 940, 90, 20));

        txtMenIdealMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 960, 90, 20));

        txtMenMetaAntMai.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntMai.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntMai.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 980, 90, 20));

        txtMenRealJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 820, 90, 20));

        txtMenMetaJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 840, 90, 20));

        txtMenForcJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 860, 90, 20));

        txtMenDesvJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 880, 90, 20));

        txtMenDesvPerJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 900, 90, 20));

        txtMenRealHisJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 920, 90, 20));

        txtMenBenchJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 940, 90, 20));

        txtMenIdealJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 960, 90, 20));

        txtMenMetaAntJun.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntJun.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntJun.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 980, 90, 20));

        txtMenRealJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 820, 90, 20));

        txtMenMetaJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 840, 90, 20));

        txtMenForcJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 860, 90, 20));

        txtMenDesvJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 880, 90, 20));

        txtMenDesvPerJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 900, 90, 20));

        txtMenRealHisJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 920, 90, 20));

        txtMenBenchJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 940, 90, 20));

        txtMenIdealJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 960, 90, 20));

        txtMenMetaAntJul.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntJul.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntJul.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 980, 90, 20));

        txtMenRealAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 820, 90, 20));

        txtMenMetaAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 840, 90, 20));

        txtMenForcAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 860, 90, 20));

        txtMenDesvAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 880, 90, 20));

        txtMenDesvPerAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 900, 90, 20));

        txtMenRealHisAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 920, 90, 20));

        txtMenBenchAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 940, 90, 20));

        txtMenIdealAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 960, 90, 20));

        txtMenMetaAntAgo.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntAgo.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntAgo.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 980, 90, 20));

        txtMenRealJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 820, 90, 20));

        txtMenMetaJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 840, 90, 20));

        txtMenForcJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 860, 90, 20));

        txtMenDesvJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 880, 90, 20));

        txtMenDesvPerJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 900, 90, 20));

        txtMenRealHisJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 920, 90, 20));

        txtMenBenchJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 940, 90, 20));

        txtMenIdealJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 960, 90, 20));

        txtMenMetaAntJan.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntJan.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntJan.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 980, 90, 20));

        txtMenRealSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 820, 90, 20));

        txtMenMetaSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 840, 90, 20));

        txtMenForcSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 860, 90, 20));

        txtMenDesvSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 880, 90, 20));

        txtMenDesvPerSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 900, 90, 20));

        txtMenRealHisSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 920, 90, 20));

        txtMenBenchSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 940, 90, 20));

        txtMenIdealSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 960, 90, 20));

        txtMenMetaAntSet.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntSet.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntSet.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 980, 90, 20));

        txtMenRealOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 820, 90, 20));

        txtMenMetaOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 840, 90, 20));

        txtMenForcOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 860, 90, 20));

        txtMenDesvOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 880, 90, 20));

        txtMenDesvPerOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 900, 90, 20));

        txtMenRealHisOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 920, 90, 20));

        txtMenBenchOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 940, 90, 20));

        txtMenIdealOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 960, 90, 20));

        txtMenMetaAntOut.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntOut.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntOut.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 980, 90, 20));

        txtMenRealNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 820, 90, 20));

        txtMenMetaNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 840, 90, 20));

        txtMenForcNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 860, 90, 20));

        txtMenDesvNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 880, 90, 20));

        txtMenDesvPerNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 900, 90, 20));

        txtMenRealHisNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 920, 90, 20));

        txtMenBenchNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 940, 90, 20));

        txtMenIdealNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 960, 90, 20));

        txtMenMetaAntNov.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntNov.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntNov.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 980, 90, 20));

        txtMenRealDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 820, 90, 20));

        txtMenMetaDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 840, 90, 20));

        txtMenForcDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenForcDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenForcDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenForcDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenForcDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 860, 90, 20));

        txtMenDesvDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 880, 90, 20));

        txtMenDesvPerDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenDesvPerDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenDesvPerDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenDesvPerDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenDesvPerDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 900, 90, 20));

        txtMenRealHisDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenRealHisDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenRealHisDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenRealHisDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenRealHisDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 920, 90, 20));

        txtMenBenchDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenBenchDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenBenchDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenBenchDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenBenchDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 940, 90, 20));

        txtMenIdealDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenIdealDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenIdealDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenIdealDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenIdealDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 960, 90, 20));

        txtMenMetaAntDez.setBackground(new java.awt.Color(216, 228, 188));
        txtMenMetaAntDez.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        txtMenMetaAntDez.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        txtMenMetaAntDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGraficos.add(txtMenMetaAntDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 980, 90, 20));

        lblStatusJan.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusJan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusJan.setOpaque(true);
        jPanelGraficos.add(lblStatusJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 570, 90, 20));

        lblStatusFev.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusFev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusFev.setOpaque(true);
        jPanelGraficos.add(lblStatusFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 90, 20));

        lblStatusMar.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusMar.setOpaque(true);
        jPanelGraficos.add(lblStatusMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 90, 20));

        lblStatusAbr.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusAbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusAbr.setOpaque(true);
        jPanelGraficos.add(lblStatusAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 90, 20));

        lblStatusMai.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusMai.setOpaque(true);
        jPanelGraficos.add(lblStatusMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 90, 20));

        lblStatusJun.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusJun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusJun.setOpaque(true);
        jPanelGraficos.add(lblStatusJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, 90, 20));

        lblStatusJul.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusJul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusJul.setOpaque(true);
        jPanelGraficos.add(lblStatusJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, 90, 20));

        lblStatusAgo.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusAgo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusAgo.setOpaque(true);
        jPanelGraficos.add(lblStatusAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 90, 20));

        lblStatusSet.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusSet.setOpaque(true);
        jPanelGraficos.add(lblStatusSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 570, 90, 20));

        lblStatusOut.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusOut.setOpaque(true);
        jPanelGraficos.add(lblStatusOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 570, 90, 20));

        lblStatusNov.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusNov.setOpaque(true);
        jPanelGraficos.add(lblStatusNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, 90, 20));

        lblStatusDez.setBackground(new java.awt.Color(253, 233, 217));
        lblStatusDez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblStatusDez.setOpaque(true);
        jPanelGraficos.add(lblStatusDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, 90, 20));

        lblTendenciaJan.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaJan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaJan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaJan.setOpaque(true);
        jPanelGraficos.add(lblTendenciaJan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, 90, 20));

        lblTendenciaFev.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaFev.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaFev.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaFev.setOpaque(true);
        jPanelGraficos.add(lblTendenciaFev, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 590, 90, 20));

        lblTendenciaMar.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaMar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaMar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaMar.setOpaque(true);
        jPanelGraficos.add(lblTendenciaMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 590, 90, 20));

        lblTendenciaAbr.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaAbr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaAbr.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaAbr.setOpaque(true);
        jPanelGraficos.add(lblTendenciaAbr, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 590, 90, 20));

        lblTendenciaMai.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaMai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaMai.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaMai.setOpaque(true);
        jPanelGraficos.add(lblTendenciaMai, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 590, 90, 20));

        lblTendenciaJun.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaJun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaJun.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaJun.setOpaque(true);
        jPanelGraficos.add(lblTendenciaJun, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 590, 90, 20));

        lblTendenciaJul.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaJul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaJul.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaJul.setOpaque(true);
        jPanelGraficos.add(lblTendenciaJul, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 90, 20));

        lblTendenciaAgo.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaAgo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaAgo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaAgo.setOpaque(true);
        jPanelGraficos.add(lblTendenciaAgo, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 90, 20));

        lblTendenciaSet.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaSet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaSet.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaSet.setOpaque(true);
        jPanelGraficos.add(lblTendenciaSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 590, 90, 20));

        lblTendenciaOut.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaOut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaOut.setOpaque(true);
        jPanelGraficos.add(lblTendenciaOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 590, 90, 20));

        lblTendenciaNov.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaNov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaNov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaNov.setOpaque(true);
        jPanelGraficos.add(lblTendenciaNov, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 590, 90, 20));

        lblTendenciaDez.setBackground(new java.awt.Color(253, 233, 217));
        lblTendenciaDez.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTendenciaDez.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTendenciaDez.setOpaque(true);
        jPanelGraficos.add(lblTendenciaDez, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 590, 90, 20));

        btnGraTrocaDesvio.setText("Desvio Absoluto");
        btnGraTrocaDesvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraTrocaDesvioActionPerformed(evt);
            }
        });
        jPanelGraficos.add(btnGraTrocaDesvio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 210, 30));

        btnGraTrocaRealxMeta1.setText("Real x Meta - Mensal");
        btnGraTrocaRealxMeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraTrocaRealxMeta1ActionPerformed(evt);
            }
        });
        jPanelGraficos.add(btnGraTrocaRealxMeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 210, 30));

        btnImprimir.setText("Imprimir Relatório");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jPanelGraficos.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 500, 180, 30));

        lblStatus2.setBackground(new java.awt.Color(54, 96, 146));
        lblStatus2.setForeground(new java.awt.Color(255, 255, 255));
        lblStatus2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblStatus2.setOpaque(true);
        jPanelGraficos.add(lblStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 100, 50));

        jButton1.setText("Imprimir Gráfico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanelGraficos.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, 180, 30));

        lblVariacao1.setBackground(new java.awt.Color(15, 36, 62));
        lblVariacao1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblVariacao1.setForeground(new java.awt.Color(255, 255, 255));
        lblVariacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVariacao1.setText("Variação");
        lblVariacao1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblVariacao1.setOpaque(true);
        jPanelGraficos.add(lblVariacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 100, 20));

        lblVariacao2.setBackground(new java.awt.Color(54, 96, 146));
        lblVariacao2.setForeground(new java.awt.Color(255, 255, 255));
        lblVariacao2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVariacao2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        lblVariacao2.setOpaque(true);
        jPanelGraficos.add(lblVariacao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 100, 50));

        jScrollGraficos.setViewportView(jPanelGraficos);

        add(jScrollGraficos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraTrocaDesvioActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnGraTrocaDesvioActionPerformed
        // TODO add your handling code here:
        if(btnGraTrocaDesvio.getText().equals("Desvio Absoluto")){
            chartPanelDesvioPerc.setVisible(false);
            chartPanelDesvioAbs.setVisible(true);
            btnGraTrocaDesvio.setText("Desvio %");
        }else if(btnGraTrocaDesvio.getText().equals("Desvio %")){
            chartPanelDesvioPerc.setVisible(true);
            chartPanelDesvioAbs.setVisible(false);
            btnGraTrocaDesvio.setText("Desvio Absoluto");
        }
    }//GEN-LAST:event_btnGraTrocaDesvioActionPerformed

    private void btnGraTrocaRealxMeta1ActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_btnGraTrocaRealxMeta1ActionPerformed
        // TODO add your handling code here:
        if(btnGraTrocaRealxMeta1.getText().equals("Real x Meta - Mensal")){
            chartPanelRealMetaAcu.setVisible(false);
            chartPanelRealMetaMen.setVisible(true);
            btnGraTrocaRealxMeta1.setText("Real x Meta - Acumulado");
        }else if(btnGraTrocaRealxMeta1.getText().equals("Real x Meta - Acumulado")){
            chartPanelRealMetaAcu.setVisible(true);
            chartPanelRealMetaMen.setVisible(false);
            btnGraTrocaRealxMeta1.setText("Real x Meta - Mensal");
        }
    }//GEN-LAST:event_btnGraTrocaRealxMeta1ActionPerformed

    private void btnFatoCausaAcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFatoCausaAcaoActionPerformed
        // TODO add your handling code here:
        FatoCausaAcao fato = new FatoCausaAcao();
        fato.setBounds(120, 40, 610, 590);
        fato.setVisible(true);
    }//GEN-LAST:event_btnFatoCausaAcaoActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        // TODO add your handling code here:
        InputStream inputStream = getClass().getResourceAsStream("/Graficos.jasper");

        Map<String, Object> parametros = new HashMap<String,Object>();

        try{        
            Info.openReport("Gráficos", inputStream, parametros, Conexao.getBDCockpit());
        }catch(SQLException ex){
            ex.printStackTrace();
        }catch(JRException ex){
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnImprimirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        tempGrafico = new TempGrafico();
        tempGrafico.setGrafico(chart);
        tempGrafico.setDados(lblStatus2.getIcon(), lblVariacao2.getIcon(), lblResponsavel2.getText(), lblIndicador2.getText());
        tempGrafico.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void setGraficoEvoAcum(){
        final CategoryDataset realAcu = createDataSetRealAcumulado();
        final CategoryDataset metaAcu = createDataSetMetaAcumulado();

        final JFreeChart chartRealMetaAcu = ChartFactory.createBarChart(lblIndicador2.getText(), "Evolução Real x Meta - Acumulado", null, realAcu, PlotOrientation.VERTICAL, true, true, true);
        final CategoryItemRenderer linhaMeta = new LineAndShapeRenderer(true, false);
        final CategoryPlot plot = chartRealMetaAcu.getCategoryPlot();

        plot.getRenderer().setSeriesPaint(0, CockpitCor.getGraficoAzul());
        linhaMeta.setSeriesPaint(0, CockpitCor.getGraficoPreto());

        if(Info.verificarHis != false){
            final CategoryDataset hisAcu = createDataSetHisAcumulado();
            final CategoryItemRenderer linhaHis = new LineAndShapeRenderer(true, false);
            linhaHis.setSeriesPaint(0, CockpitCor.getGraficoCinza());
            linhaHis.setSeriesStroke(0, new BasicStroke(2.0f));
            plot.setDataset(2, hisAcu);
            plot.setRenderer(2, linhaHis);
        }

        if(Info.verificarFor != false){
            final CategoryDataset forAcu = createDataSetForAcumulado();
            final CategoryItemRenderer linhaFor = new LineAndShapeRenderer(true, false);
            linhaFor.setSeriesPaint(0, CockpitCor.getGraficoPreto());
            linhaFor.setSeriesStroke(0, new BasicStroke(2.0f, 0, 0, 1.0f, new float[]{6.0f, 6.0f}, 0.0f));
            plot.setDataset(3, forAcu);
            plot.setRenderer(3, linhaFor);
        }

        if(Info.verificarIde != false){
            final CategoryDataset ideAcu = createDataSetIdeAcumulado();
            final CategoryItemRenderer linhaIde = new LineAndShapeRenderer(true, false);
            linhaIde.setSeriesPaint(0, CockpitCor.getGraficoLinhaVerde());
            linhaIde.setSeriesStroke(0, new BasicStroke(1.0f));
            plot.setDataset(4, ideAcu);
            plot.setRenderer(4, linhaIde);
        }

        linhaMeta.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setDataset(1, metaAcu);
        plot.setRenderer(1, linhaMeta);

        if(jPanelGraficoEvoAcum.getComponents() != (null) && chartPanelRealMetaAcu != null){
            jPanelGraficoEvoAcum.remove(chartPanelRealMetaAcu);
        }
        
        chartPanelRealMetaAcu = new ChartPanel(chartRealMetaAcu);
        chartPanelRealMetaAcu.setVisible(true);
        jPanelGraficoEvoAcum.add(chartPanelRealMetaAcu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));
        jPanelGraficoEvoAcum.revalidate();
        jPanelGraficoEvoAcum.repaint();
        
        setImgGrafico(chartRealMetaAcu, "realXmetaAcum.jpg");
        
        chart = chartRealMetaAcu;
    }

    public void setGraficoEvoMen(){
        final CategoryDataset realMen = createDataSetRealMensal();
        final CategoryDataset metaMen = createDataSetMetaMensal();

        final JFreeChart chartRealMetaMen = ChartFactory.createBarChart(lblIndicador2.getText(), "Evolução Real x Meta - Mensal", null, realMen, PlotOrientation.VERTICAL, true, true, true);
        final CategoryItemRenderer linhaMeta = new LineAndShapeRenderer(true, false);
        final CategoryPlot plot = chartRealMetaMen.getCategoryPlot();

        if(Info.verificarHis != false){
            final CategoryDataset hisMen = createDataSetHisMensal();
            final CategoryItemRenderer linhaHis = new LineAndShapeRenderer(true, false);
            linhaHis.setSeriesPaint(0, CockpitCor.getGraficoCinza());
            linhaHis.setSeriesStroke(0, new BasicStroke(2.0f));
            plot.setDataset(2, hisMen);
            plot.setRenderer(2, linhaHis);
        }

        if(Info.verificarFor != false){
            final CategoryDataset forMen = createDataSetForMensal();
            final CategoryItemRenderer linhaFor = new LineAndShapeRenderer(true, false);
            linhaFor.setSeriesPaint(0, Color.BLACK);
            linhaFor.setSeriesStroke(0, new BasicStroke(2.0f, 0, 0, 1.0f, new float[]{6.0f, 6.0f}, 0.0f));
            plot.setDataset(3, forMen);
            plot.setRenderer(3, linhaFor);
        }

        if(Info.verificarIde != false){
            final CategoryDataset ideMen = createDataSetForMensal();
            final CategoryItemRenderer linhaIde = new LineAndShapeRenderer(true, false);
            linhaIde.setSeriesPaint(0, CockpitCor.getGraficoLinhaVerde());
            linhaIde.setSeriesStroke(0, new BasicStroke(1.0f));
            plot.setDataset(4, ideMen);
            plot.setRenderer(4, linhaIde);
        }

        plot.getRenderer().setSeriesPaint(0, CockpitCor.getGraficoAzul());
        linhaMeta.setSeriesPaint(0, Color.BLACK);

        linhaMeta.setSeriesStroke(0, new BasicStroke(2.0f));

        plot.setDataset(1, metaMen);
        plot.setRenderer(1, linhaMeta);

        if(jPanelGraficoEvoAcum.getComponents() != (null) && chartPanelRealMetaMen != null){
            jPanelGraficoEvoAcum.remove(chartPanelRealMetaMen);
        }

        chartPanelRealMetaMen = new ChartPanel(chartRealMetaMen);
        chartPanelRealMetaMen.setVisible(false);

        jPanelGraficoEvoAcum.add(chartPanelRealMetaMen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));
        jPanelGraficoEvoAcum.revalidate();
        jPanelGraficoEvoAcum.repaint();
        
        setImgGrafico(chartRealMetaMen, "realXmetaMen.jpg");
    }

    public void setGraficoDesvPerc(){
        final CategoryDataset desvioPercentual = createDataSetDesvPer();

        final JFreeChart chartDevioPerc = ChartFactory.createBarChart(lblIndicador2.getText(), "Desvio Real x Meta - Mensal (%)", null, desvioPercentual, PlotOrientation.VERTICAL, true, true, true);
        final CategoryPlot plot = chartDevioPerc.getCategoryPlot();

        String select, tabela, campo;
        boolean chkMeta;
        String maiorMenor, menorMaior;
        String aux;

        maiorMenor = "[Maior, Menor]";
        menorMaior = "[Menor, Maior]";

        tabela = "CP_META_CHK";
        campo = "CHK_MAIMEL";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE CHK_INDCOD = " + Info.cod;
        chkMeta = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        aux = String.valueOf(desvioPercentual.getRowKeys());

        if(chkMeta != false){
            if(aux.endsWith(maiorMenor)){
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVermelho());
            }else if(aux.endsWith(menorMaior)){
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVermelho());
            }
        }else{
            if(aux.endsWith(maiorMenor)){
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVermelho());
            }else if(aux.endsWith(menorMaior)){
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVermelho());
            }
        }

        renderer.setItemMargin(-0.4);
        renderer.setBaseItemLabelFont(new Font("Arial", Font.PLAIN, 10));

        if(jPanelGraficoDesvPerc.getComponents() != (null) && chartPanelDesvioPerc != null){
            jPanelGraficoDesvPerc.remove(chartPanelDesvioPerc);
        }

        StandardCategoryItemLabelGenerator label = new StandardCategoryItemLabelGenerator();

        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(label.getLabelFormat(), Info.percentual));

        renderer.setBaseItemLabelsVisible(true);
        ItemLabelPosition p = new ItemLabelPosition(ItemLabelAnchor.CENTER,
                TextAnchor.CENTER, TextAnchor.CENTER, 0.0);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        //rangeAxis.setTickUnit(new NumberTickUnit(.1, new DecimalFormat("##0%")));

        chartPanelDesvioPerc = new ChartPanel(chartDevioPerc);
        chartPanelDesvioPerc.setVisible(true);

        jPanelGraficoDesvPerc.add(chartPanelDesvioPerc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));
        jPanelGraficoDesvPerc.revalidate();
        jPanelGraficoDesvPerc.repaint();
        
        setImgGrafico(chartDevioPerc, "desvrealXmetaPer.jpg");
    }

    public void setGraficoDesvAbs(){
        final CategoryDataset desvioAbsoluto = createDataSetDesvAbs();

        final JFreeChart chartDevioAbs = ChartFactory.createBarChart(lblIndicador2.getText(), "Desvio Real x Meta - Mensal (Absoluto)", null, desvioAbsoluto, PlotOrientation.VERTICAL, true, true, true);
        final CategoryPlot plot = chartDevioAbs.getCategoryPlot();

        String select, tabela, campo;
        boolean chkMeta;
        String maiorMenor, menorMaior;
        String aux;

        maiorMenor = "[Maior, Menor]";
        menorMaior = "[Menor, Maior]";

        tabela = "CP_META_CHK";
        campo = "CHK_MAIMEL";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE CHK_INDCOD = " + Info.cod;
        chkMeta = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        aux = String.valueOf(desvioAbsoluto.getRowKeys());

        if(chkMeta != false){
            if(aux.endsWith(maiorMenor)){
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVermelho());
                setLblVariacao("Maior");
            }else if(aux.endsWith(menorMaior)){
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVermelho());
                setLblVariacao("Menor");
            }
        }else{
            if(aux.endsWith(maiorMenor)){
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVermelho());
                setLblVariacao("Maior");
            }else if(aux.endsWith(menorMaior)){
                renderer.setSeriesPaint(0, CockpitCor.getGraficoVerde());
                renderer.setSeriesPaint(1, CockpitCor.getGraficoVermelho());
                setLblVariacao("Menor");
            }
        }

        renderer.setItemMargin(-0.4);
        renderer.setBaseItemLabelFont(new Font("Arial", Font.PLAIN, 10));

        if(jPanelGraficoDesvPerc.getComponents() != (null) && chartPanelDesvioAbs != null){
            jPanelGraficoDesvPerc.remove(chartPanelDesvioAbs);
        }

        StandardCategoryItemLabelGenerator label = new StandardCategoryItemLabelGenerator();
        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        String indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod;
        boolean valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(label.getLabelFormat(), Info.absoluto));
        }else{
            renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator(label.getLabelFormat(), Info.percentual));
        }

        renderer.setBaseItemLabelsVisible(true);
        ItemLabelPosition p = new ItemLabelPosition(ItemLabelAnchor.CENTER,
                TextAnchor.CENTER, TextAnchor.CENTER, 0.0);
        //renderer.setBasePositiveItemLabelPosition(p);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.BOLD, 12));
        //rangeAxis.setTickUnit(new NumberTickUnit(500, new DecimalFormat("##,##,##0")));

        chartPanelDesvioAbs = new ChartPanel(chartDevioAbs);
        chartPanelDesvioAbs.setVisible(false);

        jPanelGraficoDesvPerc.add(chartPanelDesvioAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 400));
        jPanelGraficoDesvPerc.revalidate();
        jPanelGraficoDesvPerc.repaint();
        
        setImgGrafico(chartDevioAbs, "desvRealXmetaAbs.jpg");
    }
    
    private void setImgGrafico(JFreeChart chart, String caminho){
        OutputStream out;
        File arquivo = new File(caminho);
        
        //lblStatus2.getIcon();
        
        //BufferedImage imgStatus = new BufferedImage(lblStatus2.getIcon().getIconWidth(), lblStatus2.getIcon().getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        //Graphics2D g2 = imgStatus.createGraphics();
        //g2.dispose();
        //imgStatus = (BufferedImage)lblStatus2.getIcon();
        try{
            out = new FileOutputStream(arquivo);
            //ImageIO.write(imgStatus, "JPG", status);
            ChartUtilities.writeChartAsJPEG(out, chart, 400, 300);
        }catch(IOException ex){
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private CategoryDataset createDataSetRealAcumulado(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String realAcu = "Real";

        double mesReal[] = new double[12];

        for(int i = 0; i < 12; i++){
            mesReal[i] = Double.parseDouble(Info.acaoBotaoCockpit.getRealAcu(i));
            dataset.addValue(mesReal[i], realAcu, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetMetaAcumulado(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String metaAcu = "Meta";

        double[] mesMeta = new double[12];

        for(int i = 0; i < 12; i++){
            mesMeta[i] = Double.parseDouble(Info.acaoBotaoCockpit.getMetaAcu(i));
            dataset.addValue(mesMeta[i], metaAcu, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetRealMensal(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String realAcu = "Real";

        double mesReal[] = new double[12];

        for(int i = 0; i < 12; i++){
            mesReal[i] = Double.parseDouble(Info.acaoBotaoCockpit.getRealMen(i));
            dataset.addValue(mesReal[i], realAcu, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetMetaMensal(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String metaAcu = "Meta";

        double[] mesMeta = new double[12];

        for(int i = 0; i < 12; i++){
            mesMeta[i] = Double.parseDouble(Info.acaoBotaoCockpit.getMetaMen(i));
            dataset.addValue(mesMeta[i], metaAcu, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetDesvPer(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String maior = "Maior";
        final String menor = "Menor";
        String select, tabela, campo;
        boolean chkMeta;

        tabela = "CP_META_CHK";
        campo = "CHK_MAIMEL";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE CHK_INDCOD = " + Info.cod;
        chkMeta = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));

        double[] desAbs = new double[12];

        if(chkMeta != false){
            for(int i = 0; i < 12; i++){
                desAbs[i] = Double.parseDouble(Info.acaoBotaoCockpit.getDesvPer(i));

                if(desAbs[i] < 0){
                    dataset.addValue(desAbs[i], menor, mes[i]);
                }else{
                    dataset.addValue(desAbs[i], maior, mes[i]);
                }
            }
        }else{
            for(int i = 0; i < 12; i++){
                desAbs[i] = Double.parseDouble(Info.acaoBotaoCockpit.getDesvPer(i));
                if(desAbs[i] < 0){
                    dataset.addValue(desAbs[i], menor, mes[i]);
                }else{
                    dataset.addValue(desAbs[i], maior, mes[i]);
                }
            }
        }

        return dataset;
    }

    private CategoryDataset createDataSetDesvAbs(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String maior = "Maior";
        final String menor = "Menor";
        String select, tabela, campo;
        boolean chkMeta;

        tabela = "CP_META_CHK";
        campo = "CHK_MAIMEL";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE CHK_INDCOD = " + Info.cod;
        chkMeta = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));

        double[] desPerc = new double[12];

        if(chkMeta != false){
            for(int i = 0; i < 12; i++){
                desPerc[i] = Double.parseDouble(Info.acaoBotaoCockpit.getDesvAbs(i));
                if(desPerc[i] < 0){
                    dataset.addValue(desPerc[i], menor, mes[i]);
                }else{
                    dataset.addValue(desPerc[i], maior, mes[i]);
                }
            }
        }else{
            for(int i = 0; i < 12; i++){
                desPerc[i] = Double.parseDouble(Info.acaoBotaoCockpit.getDesvAbs(i));
                if(desPerc[i] < 0){
                    dataset.addValue(desPerc[i], menor, mes[i]);
                }else{
                    dataset.addValue(desPerc[i], maior, mes[i]);
                }
            }
        }

        return dataset;
    }

    private CategoryDataset createDataSetHisMensal(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String historico = "Histórico";

        double[] hisMen = new double[12];

        for(int i = 0; i < 12; i++){
            hisMen[i] = Double.parseDouble(Info.acaoBotaoCockpit.getHistoricoMen(i));
            dataset.addValue(hisMen[i], historico, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetHisAcumulado(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String historico = "Histórico";

        double[] hisAcu = new double[12];

        for(int i = 0; i < 12; i++){
            hisAcu[i] = Double.parseDouble(Info.acaoBotaoCockpit.getHistoricoAcu(i));
            dataset.addValue(hisAcu[i], historico, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetForMensal(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String forecast = "Forecast";

        double[] forMen = new double[12];

        for(int i = 0; i < 12; i++){
            forMen[i] = Double.parseDouble(Info.acaoBotaoCockpit.getForecastMen(i));
            dataset.addValue(forMen[i], forecast, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetForAcumulado(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String forecast = "Forecast";

        double[] forAcu = new double[12];

        for(int i = 0; i < 12; i++){
            forAcu[i] = Double.parseDouble(Info.acaoBotaoCockpit.getForecastAcu(i));
            dataset.addValue(forAcu[i], forecast, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetIdeMensal(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String valIdeal = "Valor Ideal";

        double[] ideMen = new double[12];

        for(int i = 0; i < 12; i++){
            ideMen[i] = Double.parseDouble(Info.acaoBotaoCockpit.getValorIdealMen(i));
            dataset.addValue(ideMen[i], valIdeal, mes[i]);
        }

        return dataset;
    }

    private CategoryDataset createDataSetIdeAcumulado(){
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        final String valIdeal = "Valor Ideal";

        double[] ideAcu = new double[12];

        for(int i = 0; i < 12; i++){
            ideAcu[i] = Double.parseDouble(Info.acaoBotaoCockpit.getValorIdealAcu(i));
            dataset.addValue(ideAcu[i], valIdeal, mes[i]);
        }

        return dataset;
    }

    private void setValores(){
        reaAcu[0] = txtAcumRealJan.getText();
        reaAcu[1] = txtAcumRealFev.getText();
        reaAcu[2] = txtAcumRealMar.getText();
        reaAcu[3] = txtAcumRealAbr.getText();
        reaAcu[4] = txtAcumRealMai.getText();
        reaAcu[5] = txtAcumRealJun.getText();
        reaAcu[6] = txtAcumRealJul.getText();
        reaAcu[7] = txtAcumRealAgo.getText();
        reaAcu[8] = txtAcumRealSet.getText();
        reaAcu[9] = txtAcumRealOut.getText();
        reaAcu[10] = txtAcumRealNov.getText();
        reaAcu[11] = txtAcumRealDez.getText();

        metAcu[0] = txtAcumMetaJan.getText();
        metAcu[1] = txtAcumMetaFev.getText();
        metAcu[2] = txtAcumMetaMar.getText();
        metAcu[3] = txtAcumMetaAbr.getText();
        metAcu[4] = txtAcumMetaMai.getText();
        metAcu[5] = txtAcumMetaJun.getText();
        metAcu[6] = txtAcumMetaJul.getText();
        metAcu[7] = txtAcumMetaAgo.getText();
        metAcu[8] = txtAcumMetaSet.getText();
        metAcu[9] = txtAcumMetaOut.getText();
        metAcu[10] = txtAcumMetaNov.getText();
        metAcu[11] = txtAcumMetaDez.getText();

        forAcu[0] = txtAcumForcJan.getText();
        forAcu[1] = txtAcumForcFev.getText();
        forAcu[2] = txtAcumForcMar.getText();
        forAcu[3] = txtAcumForcAbr.getText();
        forAcu[4] = txtAcumForcMai.getText();
        forAcu[5] = txtAcumForcJun.getText();
        forAcu[6] = txtAcumForcJul.getText();
        forAcu[7] = txtAcumForcAgo.getText();
        forAcu[8] = txtAcumForcSet.getText();
        forAcu[9] = txtAcumForcOut.getText();
        forAcu[10] = txtAcumForcNov.getText();
        forAcu[11] = txtAcumForcDez.getText();

        desAcu[0] = txtAcumDesvJan.getText();
        desAcu[1] = txtAcumDesvFev.getText();
        desAcu[2] = txtAcumDesvMar.getText();
        desAcu[3] = txtAcumDesvAbr.getText();
        desAcu[4] = txtAcumDesvMai.getText();
        desAcu[5] = txtAcumDesvJun.getText();
        desAcu[6] = txtAcumDesvJul.getText();
        desAcu[7] = txtAcumDesvAgo.getText();
        desAcu[8] = txtAcumDesvSet.getText();
        desAcu[9] = txtAcumDesvOut.getText();
        desAcu[10] = txtAcumDesvNov.getText();
        desAcu[11] = txtAcumDesvDez.getText();

        desPerAcu[0] = txtAcumDesvPerJan.getText();
        desPerAcu[1] = txtAcumDesvPerFev.getText();
        desPerAcu[2] = txtAcumDesvPerMar.getText();
        desPerAcu[3] = txtAcumDesvPerAbr.getText();
        desPerAcu[4] = txtAcumDesvPerMai.getText();
        desPerAcu[5] = txtAcumDesvPerJun.getText();
        desPerAcu[6] = txtAcumDesvPerJul.getText();
        desPerAcu[7] = txtAcumDesvPerAgo.getText();
        desPerAcu[8] = txtAcumDesvPerSet.getText();
        desPerAcu[9] = txtAcumDesvPerOut.getText();
        desPerAcu[10] = txtAcumDesvPerNov.getText();
        desPerAcu[11] = txtAcumDesvPerDez.getText();

        hisAcu[0] = txtAcumRealHisJan.getText();
        hisAcu[1] = txtAcumRealHisFev.getText();
        hisAcu[2] = txtAcumRealHisMar.getText();
        hisAcu[3] = txtAcumRealHisAbr.getText();
        hisAcu[4] = txtAcumRealHisMai.getText();
        hisAcu[5] = txtAcumRealHisJun.getText();
        hisAcu[6] = txtAcumRealHisJul.getText();
        hisAcu[7] = txtAcumRealHisAgo.getText();
        hisAcu[8] = txtAcumRealHisSet.getText();
        hisAcu[9] = txtAcumRealHisOut.getText();
        hisAcu[10] = txtAcumRealHisNov.getText();
        hisAcu[11] = txtAcumRealHisDez.getText();

        benAcu[0] = txtAcumBenchJan.getText();
        benAcu[1] = txtAcumBenchFev.getText();
        benAcu[2] = txtAcumBenchMar.getText();
        benAcu[3] = txtAcumBenchAbr.getText();
        benAcu[4] = txtAcumBenchMai.getText();
        benAcu[5] = txtAcumBenchJun.getText();
        benAcu[6] = txtAcumBenchJul.getText();
        benAcu[7] = txtAcumBenchAgo.getText();
        benAcu[8] = txtAcumBenchSet.getText();
        benAcu[9] = txtAcumBenchOut.getText();
        benAcu[10] = txtAcumBenchNov.getText();
        benAcu[11] = txtAcumBenchDez.getText();

        ideAcu[0] = txtAcumIdealJan.getText();
        ideAcu[1] = txtAcumIdealFev.getText();
        ideAcu[2] = txtAcumIdealMar.getText();
        ideAcu[3] = txtAcumIdealAbr.getText();
        ideAcu[4] = txtAcumIdealMai.getText();
        ideAcu[5] = txtAcumIdealJun.getText();
        ideAcu[6] = txtAcumIdealJul.getText();
        ideAcu[7] = txtAcumIdealAgo.getText();
        ideAcu[8] = txtAcumIdealSet.getText();
        ideAcu[9] = txtAcumIdealOut.getText();
        ideAcu[10] = txtAcumIdealNov.getText();
        ideAcu[11] = txtAcumIdealDez.getText();

        metAntAcu[0] = txtAcumMetaAntJan.getText();
        metAntAcu[1] = txtAcumMetaAntFev.getText();
        metAntAcu[2] = txtAcumMetaAntMar.getText();
        metAntAcu[3] = txtAcumMetaAntAbr.getText();
        metAntAcu[4] = txtAcumMetaAntMai.getText();
        metAntAcu[5] = txtAcumMetaAntJun.getText();
        metAntAcu[6] = txtAcumMetaAntJul.getText();
        metAntAcu[7] = txtAcumMetaAntAgo.getText();
        metAntAcu[8] = txtAcumMetaAntSet.getText();
        metAntAcu[9] = txtAcumMetaAntOut.getText();
        metAntAcu[10] = txtAcumMetaAntNov.getText();
        metAntAcu[11] = txtAcumMetaAntDez.getText();


        reaMen[0] = txtMenRealJan.getText();
        reaMen[1] = txtMenRealFev.getText();
        reaMen[2] = txtMenRealMar.getText();
        reaMen[3] = txtMenRealAbr.getText();
        reaMen[4] = txtMenRealMai.getText();
        reaMen[5] = txtMenRealJun.getText();
        reaMen[6] = txtMenRealJul.getText();
        reaMen[7] = txtMenRealAgo.getText();
        reaMen[8] = txtMenRealSet.getText();
        reaMen[9] = txtMenRealOut.getText();
        reaMen[10] = txtMenRealNov.getText();
        reaMen[11] = txtMenRealDez.getText();

        metMen[0] = txtMenMetaJan.getText();
        metMen[1] = txtMenMetaFev.getText();
        metMen[2] = txtMenMetaMar.getText();
        metMen[3] = txtMenMetaAbr.getText();
        metMen[4] = txtMenMetaMai.getText();
        metMen[5] = txtMenMetaJun.getText();
        metMen[6] = txtMenMetaJul.getText();
        metMen[7] = txtMenMetaAgo.getText();
        metMen[8] = txtMenMetaSet.getText();
        metMen[9] = txtMenMetaOut.getText();
        metMen[10] = txtMenMetaNov.getText();
        metMen[11] = txtMenMetaDez.getText();

        forMen[0] = txtMenForcJan.getText();
        forMen[1] = txtMenForcFev.getText();
        forMen[2] = txtMenForcMar.getText();
        forMen[3] = txtMenForcAbr.getText();
        forMen[4] = txtMenForcMai.getText();
        forMen[5] = txtMenForcJun.getText();
        forMen[6] = txtMenForcJul.getText();
        forMen[7] = txtMenForcAgo.getText();
        forMen[8] = txtMenForcSet.getText();
        forMen[9] = txtMenForcOut.getText();
        forMen[10] = txtMenForcNov.getText();
        forMen[11] = txtMenForcDez.getText();

        desMen[0] = txtMenDesvJan.getText();
        desMen[1] = txtMenDesvFev.getText();
        desMen[2] = txtMenDesvMar.getText();
        desMen[3] = txtMenDesvAbr.getText();
        desMen[4] = txtMenDesvMai.getText();
        desMen[5] = txtMenDesvJun.getText();
        desMen[6] = txtMenDesvJul.getText();
        desMen[7] = txtMenDesvAgo.getText();
        desMen[8] = txtMenDesvSet.getText();
        desMen[9] = txtMenDesvOut.getText();
        desMen[10] = txtMenDesvNov.getText();
        desMen[11] = txtMenDesvDez.getText();

        desPerMen[0] = txtMenDesvPerJan.getText();
        desPerMen[1] = txtMenDesvPerFev.getText();
        desPerMen[2] = txtMenDesvPerMar.getText();
        desPerMen[3] = txtMenDesvPerAbr.getText();
        desPerMen[4] = txtMenDesvPerMai.getText();
        desPerMen[5] = txtMenDesvPerJun.getText();
        desPerMen[6] = txtMenDesvPerJul.getText();
        desPerMen[7] = txtMenDesvPerAgo.getText();
        desPerMen[8] = txtMenDesvPerSet.getText();
        desPerMen[9] = txtMenDesvPerOut.getText();
        desPerMen[10] = txtMenDesvPerNov.getText();
        desPerMen[11] = txtMenDesvPerDez.getText();

        hisMen[0] = txtMenRealHisJan.getText();
        hisMen[1] = txtMenRealHisFev.getText();
        hisMen[2] = txtMenRealHisMar.getText();
        hisMen[3] = txtMenRealHisAbr.getText();
        hisMen[4] = txtMenRealHisMai.getText();
        hisMen[5] = txtMenRealHisJun.getText();
        hisMen[6] = txtMenRealHisJul.getText();
        hisMen[7] = txtMenRealHisAgo.getText();
        hisMen[8] = txtMenRealHisSet.getText();
        hisMen[9] = txtMenRealHisOut.getText();
        hisMen[10] = txtMenRealHisNov.getText();
        hisMen[11] = txtMenRealHisDez.getText();

        benMen[0] = txtMenBenchJan.getText();
        benMen[1] = txtMenBenchFev.getText();
        benMen[2] = txtMenBenchMar.getText();
        benMen[3] = txtMenBenchAbr.getText();
        benMen[4] = txtMenBenchMai.getText();
        benMen[5] = txtMenBenchJun.getText();
        benMen[6] = txtMenBenchJul.getText();
        benMen[7] = txtMenBenchAgo.getText();
        benMen[8] = txtMenBenchSet.getText();
        benMen[9] = txtMenBenchOut.getText();
        benMen[10] = txtMenBenchNov.getText();
        benMen[11] = txtMenBenchDez.getText();

        ideMen[0] = txtMenIdealJan.getText();
        ideMen[1] = txtMenIdealFev.getText();
        ideMen[2] = txtMenIdealMar.getText();
        ideMen[3] = txtMenIdealAbr.getText();
        ideMen[4] = txtMenIdealMai.getText();
        ideMen[5] = txtMenIdealJun.getText();
        ideMen[6] = txtMenIdealJul.getText();
        ideMen[7] = txtMenIdealAgo.getText();
        ideMen[8] = txtMenIdealSet.getText();
        ideMen[9] = txtMenIdealOut.getText();
        ideMen[10] = txtMenIdealNov.getText();
        ideMen[11] = txtMenIdealDez.getText();

        metAntMen[0] = txtMenMetaAntJan.getText();
        metAntMen[1] = txtMenMetaAntFev.getText();
        metAntMen[2] = txtMenMetaAntMar.getText();
        metAntMen[3] = txtMenMetaAntAbr.getText();
        metAntMen[4] = txtMenMetaAntMai.getText();
        metAntMen[5] = txtMenMetaAntJun.getText();
        metAntMen[6] = txtMenMetaAntJul.getText();
        metAntMen[7] = txtMenMetaAntAgo.getText();
        metAntMen[8] = txtMenMetaAntSet.getText();
        metAntMen[9] = txtMenMetaAntOut.getText();
        metAntMen[10] = txtMenMetaAntNov.getText();
        metAntMen[11] = txtMenMetaAntDez.getText();

        for(int i = 0; i < 12; i++){
            if(reaAcu[i].equals("")){
                reaAcu[i] = " ";
            }

            if(metAcu[i].equals("")){
                metAcu[i] = " ";
            }

            if(forAcu[i].equals("")){
                forAcu[i] = " ";
            }

            if(desAcu[i].equals("")){
                desAcu[i] = " ";
            }

            if(desPerAcu[i].equals("")){
                desPerAcu[i] = " ";
            }

            if(hisAcu[i].equals("")){
                hisAcu[i] = " ";
            }

            if(benAcu[i].equals("")){
                benAcu[i] = " ";
            }

            if(ideAcu[i].equals("")){
                ideAcu[i] = " ";
            }

            if(metAntAcu[i].equals("")){
                metAntAcu[i] = " ";
            }

            if(reaMen[i].equals("")){
                reaMen[i] = " ";
            }

            if(metMen[i].equals("")){
                metMen[i] = " ";
            }

            if(forMen[i].equals("")){
                forMen[i] = " ";
            }

            if(desMen[i].equals("")){
                desMen[i] = " ";
            }

            if(desPerMen[i].equals("")){
                desPerMen[i] = " ";
            }

            if(hisMen[i].equals("")){
                hisMen[i] = " ";
            }

            if(benMen[i].equals("")){
                benMen[i] = " ";
            }

            if(ideMen[i].equals("")){
                ideMen[i] = " ";
            }

            if(metAntMen[i].equals("")){
                metAntMen[i] = " ";
            }
        }

    }

    public void setBDGrafico(){
        tabela = "CP_GRAFICO_TEMP";
        codTab = "GRA_COD";

        setValores();
        
        String[] mes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

        insert = "DELETE " + tabela;
        Info.objConexao.setBD(insert);

        for(int i = 0; i < 12; i++){
            insert = "INSERT INTO " + tabela + " (" + codTab + ") values (" + (i + 1) + ")";
            Info.objConexao.setBD(insert);
            
            campo = "GRA_MES";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + mes[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);
            
            campo = "GRA_REAACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + reaAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_METACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + metAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_FORACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + forAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_DESACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + desAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_DESPERACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + desPerAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_HISACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + hisAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_BENACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + benAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_IDEACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + ideAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_METANTACU";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + metAntAcu[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_REAMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + reaMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_METMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + metMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_FORMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + forMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_DESMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + desMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_DESPERMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + desPerMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_HISMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + hisMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_BENMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + benMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_IDEMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + ideMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);

            campo = "GRA_METANTMEN";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + metAntMen[i] + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);
            
            campo = "GRA_STA";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strAux + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);
            
            campo = "GRA_RES";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + lblResponsavel2.getText() + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);
            
            campo = "GRA_IND";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + lblIndicador2.getText() + "' WHERE " + codTab + " = " + (i + 1);
            Info.objConexao.setBD(insert);
        }
    }
    private double dblJan;
    private double dblFev;
    private double dblMar;
    private double dblAbr;
    private double dblMai;
    private double dblJun;
    private double dblJul;
    private double dblAgo;
    private double dblSet;
    private double dblOut;
    private double dblNov;
    private double dblDez;
    private String strJan;
    private String strFev;
    private String strMar;
    private String strAbr;
    private String strMai;
    private String strJun;
    private String strJul;
    private String strAgo;
    private String strSet;
    private String strOut;
    private String strNov;
    private String strDez;
    private String nome = new String();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFatoCausaAcao;
    private javax.swing.JButton btnGraTrocaDesvio;
    private javax.swing.JButton btnGraTrocaRealxMeta1;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanelGraficoDesvPerc;
    private javax.swing.JPanel jPanelGraficoEvoAcum;
    private javax.swing.JPanel jPanelGraficos;
    private javax.swing.JScrollPane jScrollGraficos;
    private javax.swing.JLabel lblAcumAbr;
    private javax.swing.JLabel lblAcumAgo;
    private javax.swing.JLabel lblAcumBench;
    private javax.swing.JLabel lblAcumDesv;
    private javax.swing.JLabel lblAcumDesvPer;
    private javax.swing.JLabel lblAcumDez;
    private javax.swing.JLabel lblAcumFev;
    private javax.swing.JLabel lblAcumForc;
    private javax.swing.JLabel lblAcumIdeal;
    private javax.swing.JLabel lblAcumJan;
    private javax.swing.JLabel lblAcumJul;
    private javax.swing.JLabel lblAcumJun;
    private javax.swing.JLabel lblAcumMai;
    private javax.swing.JLabel lblAcumMar;
    private javax.swing.JLabel lblAcumMeta;
    private javax.swing.JLabel lblAcumMetaAnt;
    private javax.swing.JLabel lblAcumNov;
    private javax.swing.JLabel lblAcumOut;
    private javax.swing.JLabel lblAcumReal;
    private javax.swing.JLabel lblAcumRealHis;
    private javax.swing.JLabel lblAcumSet;
    private javax.swing.JLabel lblAcumulado;
    private javax.swing.JLabel lblIndicador1;
    private javax.swing.JLabel lblIndicador2;
    private javax.swing.JLabel lblMenAbr;
    private javax.swing.JLabel lblMenAgo;
    private javax.swing.JLabel lblMenBench;
    private javax.swing.JLabel lblMenDesv;
    private javax.swing.JLabel lblMenDesvPer;
    private javax.swing.JLabel lblMenDez;
    private javax.swing.JLabel lblMenFev;
    private javax.swing.JLabel lblMenForc;
    private javax.swing.JLabel lblMenIdeal;
    private javax.swing.JLabel lblMenJan;
    private javax.swing.JLabel lblMenJul;
    private javax.swing.JLabel lblMenJun;
    private javax.swing.JLabel lblMenMai;
    private javax.swing.JLabel lblMenMar;
    private javax.swing.JLabel lblMenMeta;
    private javax.swing.JLabel lblMenMetaAnt;
    private javax.swing.JLabel lblMenNov;
    private javax.swing.JLabel lblMenOut;
    private javax.swing.JLabel lblMenReal;
    private javax.swing.JLabel lblMenRealHis;
    private javax.swing.JLabel lblMenSet;
    private javax.swing.JLabel lblMensal;
    private javax.swing.JLabel lblResponsavel1;
    private javax.swing.JLabel lblResponsavel2;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JLabel lblStatus2;
    private javax.swing.JLabel lblStatusAbr;
    private javax.swing.JLabel lblStatusAgo;
    private javax.swing.JLabel lblStatusDez;
    private javax.swing.JLabel lblStatusFev;
    private javax.swing.JLabel lblStatusJan;
    private javax.swing.JLabel lblStatusJul;
    private javax.swing.JLabel lblStatusJun;
    private javax.swing.JLabel lblStatusMai;
    private javax.swing.JLabel lblStatusMar;
    private javax.swing.JLabel lblStatusNov;
    private javax.swing.JLabel lblStatusOut;
    private javax.swing.JLabel lblStatusSet;
    private javax.swing.JLabel lblTendencia;
    private javax.swing.JLabel lblTendenciaAbr;
    private javax.swing.JLabel lblTendenciaAgo;
    private javax.swing.JLabel lblTendenciaDez;
    private javax.swing.JLabel lblTendenciaFev;
    private javax.swing.JLabel lblTendenciaJan;
    private javax.swing.JLabel lblTendenciaJul;
    private javax.swing.JLabel lblTendenciaJun;
    private javax.swing.JLabel lblTendenciaMai;
    private javax.swing.JLabel lblTendenciaMar;
    private javax.swing.JLabel lblTendenciaNov;
    private javax.swing.JLabel lblTendenciaOut;
    private javax.swing.JLabel lblTendenciaSet;
    private javax.swing.JLabel lblVariacao1;
    private javax.swing.JLabel lblVariacao2;
    private javax.swing.JTextField txtAcumBenchAbr;
    private javax.swing.JTextField txtAcumBenchAgo;
    private javax.swing.JTextField txtAcumBenchDez;
    private javax.swing.JTextField txtAcumBenchFev;
    private javax.swing.JTextField txtAcumBenchJan;
    private javax.swing.JTextField txtAcumBenchJul;
    private javax.swing.JTextField txtAcumBenchJun;
    private javax.swing.JTextField txtAcumBenchMai;
    private javax.swing.JTextField txtAcumBenchMar;
    private javax.swing.JTextField txtAcumBenchNov;
    private javax.swing.JTextField txtAcumBenchOut;
    private javax.swing.JTextField txtAcumBenchSet;
    private javax.swing.JTextField txtAcumDesvAbr;
    private javax.swing.JTextField txtAcumDesvAgo;
    private javax.swing.JTextField txtAcumDesvDez;
    private javax.swing.JTextField txtAcumDesvFev;
    private javax.swing.JTextField txtAcumDesvJan;
    private javax.swing.JTextField txtAcumDesvJul;
    private javax.swing.JTextField txtAcumDesvJun;
    private javax.swing.JTextField txtAcumDesvMai;
    private javax.swing.JTextField txtAcumDesvMar;
    private javax.swing.JTextField txtAcumDesvNov;
    private javax.swing.JTextField txtAcumDesvOut;
    private javax.swing.JTextField txtAcumDesvPerAbr;
    private javax.swing.JTextField txtAcumDesvPerAgo;
    private javax.swing.JTextField txtAcumDesvPerDez;
    private javax.swing.JTextField txtAcumDesvPerFev;
    private javax.swing.JTextField txtAcumDesvPerJan;
    private javax.swing.JTextField txtAcumDesvPerJul;
    private javax.swing.JTextField txtAcumDesvPerJun;
    private javax.swing.JTextField txtAcumDesvPerMai;
    private javax.swing.JTextField txtAcumDesvPerMar;
    private javax.swing.JTextField txtAcumDesvPerNov;
    private javax.swing.JTextField txtAcumDesvPerOut;
    private javax.swing.JTextField txtAcumDesvPerSet;
    private javax.swing.JTextField txtAcumDesvSet;
    private javax.swing.JTextField txtAcumForcAbr;
    private javax.swing.JTextField txtAcumForcAgo;
    private javax.swing.JTextField txtAcumForcDez;
    private javax.swing.JTextField txtAcumForcFev;
    private javax.swing.JTextField txtAcumForcJan;
    private javax.swing.JTextField txtAcumForcJul;
    private javax.swing.JTextField txtAcumForcJun;
    private javax.swing.JTextField txtAcumForcMai;
    private javax.swing.JTextField txtAcumForcMar;
    private javax.swing.JTextField txtAcumForcNov;
    private javax.swing.JTextField txtAcumForcOut;
    private javax.swing.JTextField txtAcumForcSet;
    private javax.swing.JTextField txtAcumIdealAbr;
    private javax.swing.JTextField txtAcumIdealAgo;
    private javax.swing.JTextField txtAcumIdealDez;
    private javax.swing.JTextField txtAcumIdealFev;
    private javax.swing.JTextField txtAcumIdealJan;
    private javax.swing.JTextField txtAcumIdealJul;
    private javax.swing.JTextField txtAcumIdealJun;
    private javax.swing.JTextField txtAcumIdealMai;
    private javax.swing.JTextField txtAcumIdealMar;
    private javax.swing.JTextField txtAcumIdealNov;
    private javax.swing.JTextField txtAcumIdealOut;
    private javax.swing.JTextField txtAcumIdealSet;
    private javax.swing.JTextField txtAcumMetaAbr;
    private javax.swing.JTextField txtAcumMetaAgo;
    private javax.swing.JTextField txtAcumMetaAntAbr;
    private javax.swing.JTextField txtAcumMetaAntAgo;
    private javax.swing.JTextField txtAcumMetaAntDez;
    private javax.swing.JTextField txtAcumMetaAntFev;
    private javax.swing.JTextField txtAcumMetaAntJan;
    private javax.swing.JTextField txtAcumMetaAntJul;
    private javax.swing.JTextField txtAcumMetaAntJun;
    private javax.swing.JTextField txtAcumMetaAntMai;
    private javax.swing.JTextField txtAcumMetaAntMar;
    private javax.swing.JTextField txtAcumMetaAntNov;
    private javax.swing.JTextField txtAcumMetaAntOut;
    private javax.swing.JTextField txtAcumMetaAntSet;
    private javax.swing.JTextField txtAcumMetaDez;
    private javax.swing.JTextField txtAcumMetaFev;
    private javax.swing.JTextField txtAcumMetaJan;
    private javax.swing.JTextField txtAcumMetaJul;
    private javax.swing.JTextField txtAcumMetaJun;
    private javax.swing.JTextField txtAcumMetaMai;
    private javax.swing.JTextField txtAcumMetaMar;
    private javax.swing.JTextField txtAcumMetaNov;
    private javax.swing.JTextField txtAcumMetaOut;
    private javax.swing.JTextField txtAcumMetaSet;
    private javax.swing.JTextField txtAcumRealAbr;
    private javax.swing.JTextField txtAcumRealAgo;
    private javax.swing.JTextField txtAcumRealDez;
    private javax.swing.JTextField txtAcumRealFev;
    private javax.swing.JTextField txtAcumRealHisAbr;
    private javax.swing.JTextField txtAcumRealHisAgo;
    private javax.swing.JTextField txtAcumRealHisDez;
    private javax.swing.JTextField txtAcumRealHisFev;
    private javax.swing.JTextField txtAcumRealHisJan;
    private javax.swing.JTextField txtAcumRealHisJul;
    private javax.swing.JTextField txtAcumRealHisJun;
    private javax.swing.JTextField txtAcumRealHisMai;
    private javax.swing.JTextField txtAcumRealHisMar;
    private javax.swing.JTextField txtAcumRealHisNov;
    private javax.swing.JTextField txtAcumRealHisOut;
    private javax.swing.JTextField txtAcumRealHisSet;
    private javax.swing.JTextField txtAcumRealJan;
    private javax.swing.JTextField txtAcumRealJul;
    private javax.swing.JTextField txtAcumRealJun;
    private javax.swing.JTextField txtAcumRealMai;
    private javax.swing.JTextField txtAcumRealMar;
    private javax.swing.JTextField txtAcumRealNov;
    private javax.swing.JTextField txtAcumRealOut;
    private javax.swing.JTextField txtAcumRealSet;
    private javax.swing.JTextField txtMenBenchAbr;
    private javax.swing.JTextField txtMenBenchAgo;
    private javax.swing.JTextField txtMenBenchDez;
    private javax.swing.JTextField txtMenBenchFev;
    private javax.swing.JTextField txtMenBenchJan;
    private javax.swing.JTextField txtMenBenchJul;
    private javax.swing.JTextField txtMenBenchJun;
    private javax.swing.JTextField txtMenBenchMai;
    private javax.swing.JTextField txtMenBenchMar;
    private javax.swing.JTextField txtMenBenchNov;
    private javax.swing.JTextField txtMenBenchOut;
    private javax.swing.JTextField txtMenBenchSet;
    private javax.swing.JTextField txtMenDesvAbr;
    private javax.swing.JTextField txtMenDesvAgo;
    private javax.swing.JTextField txtMenDesvDez;
    private javax.swing.JTextField txtMenDesvFev;
    private javax.swing.JTextField txtMenDesvJan;
    private javax.swing.JTextField txtMenDesvJul;
    private javax.swing.JTextField txtMenDesvJun;
    private javax.swing.JTextField txtMenDesvMai;
    private javax.swing.JTextField txtMenDesvMar;
    private javax.swing.JTextField txtMenDesvNov;
    private javax.swing.JTextField txtMenDesvOut;
    private javax.swing.JTextField txtMenDesvPerAbr;
    private javax.swing.JTextField txtMenDesvPerAgo;
    private javax.swing.JTextField txtMenDesvPerDez;
    private javax.swing.JTextField txtMenDesvPerFev;
    private javax.swing.JTextField txtMenDesvPerJan;
    private javax.swing.JTextField txtMenDesvPerJul;
    private javax.swing.JTextField txtMenDesvPerJun;
    private javax.swing.JTextField txtMenDesvPerMai;
    private javax.swing.JTextField txtMenDesvPerMar;
    private javax.swing.JTextField txtMenDesvPerNov;
    private javax.swing.JTextField txtMenDesvPerOut;
    private javax.swing.JTextField txtMenDesvPerSet;
    private javax.swing.JTextField txtMenDesvSet;
    private javax.swing.JTextField txtMenForcAbr;
    private javax.swing.JTextField txtMenForcAgo;
    private javax.swing.JTextField txtMenForcDez;
    private javax.swing.JTextField txtMenForcFev;
    private javax.swing.JTextField txtMenForcJan;
    private javax.swing.JTextField txtMenForcJul;
    private javax.swing.JTextField txtMenForcJun;
    private javax.swing.JTextField txtMenForcMai;
    private javax.swing.JTextField txtMenForcMar;
    private javax.swing.JTextField txtMenForcNov;
    private javax.swing.JTextField txtMenForcOut;
    private javax.swing.JTextField txtMenForcSet;
    private javax.swing.JTextField txtMenIdealAbr;
    private javax.swing.JTextField txtMenIdealAgo;
    private javax.swing.JTextField txtMenIdealDez;
    private javax.swing.JTextField txtMenIdealFev;
    private javax.swing.JTextField txtMenIdealJan;
    private javax.swing.JTextField txtMenIdealJul;
    private javax.swing.JTextField txtMenIdealJun;
    private javax.swing.JTextField txtMenIdealMai;
    private javax.swing.JTextField txtMenIdealMar;
    private javax.swing.JTextField txtMenIdealNov;
    private javax.swing.JTextField txtMenIdealOut;
    private javax.swing.JTextField txtMenIdealSet;
    private javax.swing.JTextField txtMenMetaAbr;
    private javax.swing.JTextField txtMenMetaAgo;
    private javax.swing.JTextField txtMenMetaAntAbr;
    private javax.swing.JTextField txtMenMetaAntAgo;
    private javax.swing.JTextField txtMenMetaAntDez;
    private javax.swing.JTextField txtMenMetaAntFev;
    private javax.swing.JTextField txtMenMetaAntJan;
    private javax.swing.JTextField txtMenMetaAntJul;
    private javax.swing.JTextField txtMenMetaAntJun;
    private javax.swing.JTextField txtMenMetaAntMai;
    private javax.swing.JTextField txtMenMetaAntMar;
    private javax.swing.JTextField txtMenMetaAntNov;
    private javax.swing.JTextField txtMenMetaAntOut;
    private javax.swing.JTextField txtMenMetaAntSet;
    private javax.swing.JTextField txtMenMetaDez;
    private javax.swing.JTextField txtMenMetaFev;
    private javax.swing.JTextField txtMenMetaJan;
    private javax.swing.JTextField txtMenMetaJul;
    private javax.swing.JTextField txtMenMetaJun;
    private javax.swing.JTextField txtMenMetaMai;
    private javax.swing.JTextField txtMenMetaMar;
    private javax.swing.JTextField txtMenMetaNov;
    private javax.swing.JTextField txtMenMetaOut;
    private javax.swing.JTextField txtMenMetaSet;
    private javax.swing.JTextField txtMenRealAbr;
    private javax.swing.JTextField txtMenRealAgo;
    private javax.swing.JTextField txtMenRealDez;
    private javax.swing.JTextField txtMenRealFev;
    private javax.swing.JTextField txtMenRealHisAbr;
    private javax.swing.JTextField txtMenRealHisAgo;
    private javax.swing.JTextField txtMenRealHisDez;
    private javax.swing.JTextField txtMenRealHisFev;
    private javax.swing.JTextField txtMenRealHisJan;
    private javax.swing.JTextField txtMenRealHisJul;
    private javax.swing.JTextField txtMenRealHisJun;
    private javax.swing.JTextField txtMenRealHisMai;
    private javax.swing.JTextField txtMenRealHisMar;
    private javax.swing.JTextField txtMenRealHisNov;
    private javax.swing.JTextField txtMenRealHisOut;
    private javax.swing.JTextField txtMenRealHisSet;
    private javax.swing.JTextField txtMenRealJan;
    private javax.swing.JTextField txtMenRealJul;
    private javax.swing.JTextField txtMenRealJun;
    private javax.swing.JTextField txtMenRealMai;
    private javax.swing.JTextField txtMenRealMar;
    private javax.swing.JTextField txtMenRealNov;
    private javax.swing.JTextField txtMenRealOut;
    private javax.swing.JTextField txtMenRealSet;
    // End of variables declaration//GEN-END:variables

    /*****************************************Cabeçalho*****************************************/
    public javax.swing.JLabel getLblStatus2(){
        return lblStatus2;
    }

    public void setLblStatus2(String cor){
        if(cor.equals(strCor[0])){
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5G.png")));
            setBDStatus("Muito Vermelho");
        }else if(cor.equals(strCor[1])){
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4G.png")));
            setBDStatus("Vermelho");
        }else if(cor.equals(strCor[2])){
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3G.png")));
            setBDStatus("Amarelo");
        }else if(cor.equals(strCor[3])){
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2G.png")));
            setBDStatus("Verde");
        }else if(cor.equals(strCor[4])){
            lblStatus2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1G.png")));
            setBDStatus("Muito Verde");
        }
    }
    
    private void setBDStatus(String status){
        strAux = status;
    }
    /* TESTE
    private void setIcoStatus(String caminho){
        ImageIcon io = new ImageIcon(getClass().getResource(caminho));
        
        Image img = null;
        try{
            img = ImageIO.read(getClass().getResource(caminho));
        }catch(IOException ex){
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
        //img = io.getImage();
        JOptionPane.showMessageDialog(null, io);
        //BufferedImage imgStatus = new BufferedImage(lblStatus2.getIcon().getIconWidth(), lblStatus2.getIcon().getIconHeight(), BufferedImage.TYPE_INT_ARGB);
        //Graphics2D g2 = imgStatus.createGraphics();
        //g2.dispose();
        //imgStatus = (BufferedImage)lblStatus2.getIcon();
        
        //BufferedImage buff = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_RGB);
        //Graphics2D g2 = buff.createGraphics();
        //g2.drawImage(img, 0, 0, null);
        //g2.dispose();
        
        BufferedImage buff;
        ByteArrayInputStream();
        try{
            buff = ImageIO.read(getClass().getResource(caminho));
            ImageIO.write(buff, "JPG", new FileOutputStream("status.jpg"));
        }catch(IOException ex){
            Logger.getLogger(Graficos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    public String getLblResponsavel2(){
        return nome;
    }

    public void setLblResponsavel2(String nome){
        this.nome = nome;
        lblResponsavel2.setText(nome);
    }

    public String getLblIndicador2(){
        nome = lblIndicador2.getText();
        return nome;
    }

    public void setLblIndicador2(String nome){
        this.nome = nome;
        lblIndicador2.setText(nome);
    }

    /*****************************************Status*****************************************/
    public javax.swing.JLabel getLblStatusJan(){
        return lblStatusJan;
    }

    public void setLblStatusJan(String cor){
        if(cor.equals(strCor[0])){
            lblStatusJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusFev(){
        return lblStatusFev;
    }

    public void setLblStatusFev(String cor){
        if(cor.equals(strCor[0])){
            lblStatusFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusMar(){
        return lblStatusMar;
    }

    public void setLblStatusMar(String cor){
        if(cor.equals(strCor[0])){
            lblStatusMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusAbr(){
        return lblStatusAbr;
    }

    public void setLblStatusAbr(String cor){
        if(cor.equals(strCor[0])){
            lblStatusAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusMai(){
        return lblStatusMai;
    }

    public void setLblStatusMai(String cor){
        if(cor.equals(strCor[0])){
            lblStatusMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusJun(){
        return lblStatusJun;
    }

    public void setLblStatusJun(String cor){
        if(cor.equals(strCor[0])){
            lblStatusJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusJul(){
        return lblStatusJul;
    }

    public void setLblStatusJul(String cor){
        if(cor.equals(strCor[0])){
            lblStatusJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusAgo(){
        return lblStatusAgo;
    }

    public void setLblStatusAgo(String cor){
        if(cor.equals(strCor[0])){
            lblStatusAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusSet(){
        return lblStatusSet;
    }

    public void setLblStatusSet(String cor){
        if(cor.equals(strCor[0])){
            lblStatusSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusOut(){
        return lblStatusOut;
    }

    public void setLblStatusOut(String cor){
        if(cor.equals(strCor[0])){
            lblStatusOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusNov(){
        return lblStatusNov;
    }

    public void setLblStatusNov(String cor){
        if(cor.equals(strCor[0])){
            lblStatusNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    public javax.swing.JLabel getLblStatusDez(){
        return lblStatusDez;
    }

    public void setLblStatusDez(String cor){
        if(cor.equals(strCor[0])){
            lblStatusDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola5P.png")));
        }else if(cor.equals(strCor[1])){
            lblStatusDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola4P.png")));
        }else if(cor.equals(strCor[2])){
            lblStatusDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola3P.png")));
        }else if(cor.equals(strCor[3])){
            lblStatusDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola2P.png")));
        }else if(cor.equals(strCor[4])){
            lblStatusDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola1P.png")));
        }
    }

    /*****************************************Tendência*****************************************/
    public javax.swing.JLabel getLblTendenciaJan(){
        return lblTendenciaJan;
    }

    public void setLblTendenciaJan(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaJan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaFev(){
        return lblTendenciaFev;
    }

    public void setLblTendenciaFev(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaFev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaMar(){
        return lblTendenciaMar;
    }

    public void setLblTendenciaMar(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaMar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaAbr(){
        return lblTendenciaAbr;
    }

    public void setLblTendenciaAbr(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaAbr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaMai(){
        return lblTendenciaMai;
    }

    public void setLblTendenciaMai(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaJun(){
        return lblTendenciaJun;
    }

    public void setLblTendenciaJun(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaJun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaJul(){
        return lblTendenciaJul;
    }

    public void setLblTendenciaJul(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaJul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaAgo(){
        return lblTendenciaAgo;
    }

    public void setLblTendenciaAgo(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaAgo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaSet(){
        return lblTendenciaSet;
    }

    public javax.swing.JLabel getLblTendenciaOut(){
        return lblTendenciaOut;
    }

    public void setLblTendenciaOut(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public void setLblTendenciaSet(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaNov(){
        return lblTendenciaNov;
    }

    public void setLblTendenciaNov(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaNov.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }

    public javax.swing.JLabel getLblTendenciaDez(){
        return lblTendenciaDez;
    }

    public void setLblTendenciaDez(String flecha){
        if(flecha.equals(strFlecha[0])){
            lblTendenciaDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaUp.PNG")));
        }else if(flecha.equals(strFlecha[1])){
            lblTendenciaDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaCenter.PNG")));
        }else if(flecha.equals(strFlecha[2])){
            lblTendenciaDez.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaDown.PNG")));
        }
    }
    
    public void setLblVariacao(String flecha){
       if(flecha.equals("Maior")){
            lblVariacao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaMaior.png")));
        }else if(flecha.equals("Menor")){
            lblVariacao2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/flechaMenor.png")));
        } 
    }

    /*****************************************Real Acumulado*****************************************/
    public String getTxtAcumRealJan(){
        strJan = txtAcumRealJan.getText();
        return strJan;
    }

    public void setTxtAcumRealJan(String jan){
        strJan = jan;
        txtAcumRealJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumRealFev(){
        strFev = txtAcumRealFev.getText();
        return strFev;
    }

    public void setTxtAcumRealFev(String fev){
        strFev = fev;
        txtAcumRealFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumRealMar(){
        strMar = txtAcumRealMar.getText();
        return strMar;
    }

    public void setTxtAcumRealMar(String mar){
        strMar = mar;
        txtAcumRealMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumRealAbr(){
        strAbr = txtAcumRealAbr.getText();
        return strAbr;
    }

    public void setTxtAcumRealAbr(String abr){
        strAbr = abr;
        txtAcumRealAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumRealMai(){
        strMai = txtAcumRealMai.getText();
        return strMai;
    }

    public void setTxtAcumRealMai(String mai){
        strMai = mai;
        txtAcumRealMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumRealJun(){
        strJun = txtAcumRealJun.getText();
        return strJun;
    }

    public void setTxtAcumRealJun(String jun){
        strJun = jun;
        txtAcumRealJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumRealJul(){
        strJul = txtAcumRealJul.getText();
        return strJul;
    }

    public void setTxtAcumRealJul(String jul){
        strJul = jul;
        txtAcumRealJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumRealAgo(){
        strAgo = txtAcumRealAgo.getText();
        return strAgo;
    }

    public void setTxtAcumRealAgo(String ago){
        strAgo = ago;
        txtAcumRealAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumRealSet(){
        strSet = txtAcumRealSet.getText();
        return strSet;
    }

    public void setTxtAcumRealSet(String set){
        strSet = set;
        txtAcumRealSet.setText(String.valueOf(set));
    }

    public String getTxtAcumRealOut(){
        strOut = txtAcumRealOut.getText();
        return strOut;
    }

    public void setTxtAcumRealOut(String out){
        strOut = out;
        txtAcumRealOut.setText(String.valueOf(out));
    }

    public String getTxtAcumRealNov(){
        strNov = txtAcumRealNov.getText();
        return strNov;
    }

    public void setTxtAcumRealNov(String nov){
        strNov = nov;
        txtAcumRealNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumRealDez(){
        strDez = txtAcumRealDez.getText();
        return strDez;
    }

    public void setTxtAcumRealDez(String dez){
        strDez = dez;
        txtAcumRealDez.setText(String.valueOf(dez));
    }

    /*****************************************Meta Acumulado*****************************************/
    public String getTxtAcumMetaJan(){
        strJan = txtAcumMetaJan.getText();
        return strJan;
    }

    public void setTxtAcumMetaJan(String jan){
        strJan = jan;
        txtAcumMetaJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumMetaFev(){
        strFev = txtAcumMetaFev.getText();
        return strFev;
    }

    public void setTxtAcumMetaFev(String fev){
        strFev = fev;
        txtAcumMetaFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumMetaMar(){
        strMar = txtAcumMetaMar.getText();
        return strMar;
    }

    public void setTxtAcumMetaMar(String mar){
        strMar = mar;
        txtAcumMetaMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumMetaAbr(){
        strAbr = txtAcumMetaAbr.getText();
        return strAbr;
    }

    public void setTxtAcumMetaAbr(String abr){
        strAbr = abr;
        txtAcumMetaAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumMetaMai(){
        strMai = txtAcumMetaMai.getText();
        return strMai;
    }

    public void setTxtAcumMetaMai(String mai){
        strMai = mai;
        txtAcumMetaMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumMetaJun(){
        strJun = txtAcumMetaJun.getText();
        return strJun;
    }

    public void setTxtAcumMetaJun(String jun){
        strJun = jun;
        txtAcumMetaJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumMetaJul(){
        strJul = txtAcumMetaJul.getText();
        return strJul;
    }

    public void setTxtAcumMetaJul(String jul){
        strJul = jul;
        txtAcumMetaJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumMetaAgo(){
        strAgo = txtAcumMetaAgo.getText();
        return strAgo;
    }

    public void setTxtAcumMetaAgo(String ago){
        strAgo = ago;
        txtAcumMetaAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumMetaSet(){
        strSet = txtAcumMetaSet.getText();
        return strSet;
    }

    public void setTxtAcumMetaSet(String set){
        strSet = set;
        txtAcumMetaSet.setText(String.valueOf(set));
    }

    public String getTxtAcumMetaOut(){
        strOut = txtAcumMetaOut.getText();
        return strOut;
    }

    public void setTxtAcumMetaOut(String out){
        strOut = out;
        txtAcumMetaOut.setText(String.valueOf(out));
    }

    public String getTxtAcumMetaNov(){
        strNov = txtAcumMetaNov.getText();
        return strNov;
    }

    public void setTxtAcumMetaNov(String nov){
        strNov = nov;
        txtAcumMetaNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumMetaDez(){
        strDez = txtAcumMetaDez.getText();
        return strDez;
    }

    public void setTxtAcumMetaDez(String dez){
        strDez = dez;
        txtAcumMetaDez.setText(String.valueOf(dez));
    }

    /*****************************************Forecast Acumulado*****************************************/
    public String getTxtAcumForcJan(){
        strJan = txtAcumForcJan.getText();
        return strJan;
    }

    public void setTxtAcumForcJan(String jan){
        strJan = jan;
        txtAcumForcJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumForcFev(){
        strFev = txtAcumForcFev.getText();
        return strFev;
    }

    public void setTxtAcumForcFev(String fev){
        strFev = fev;
        txtAcumForcFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumForcMar(){
        strMar = txtAcumForcMar.getText();
        return strMar;
    }

    public void setTxtAcumForcMar(String mar){
        strMar = mar;
        txtAcumForcMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumForcAbr(){
        strAbr = txtAcumForcAbr.getText();
        return strAbr;
    }

    public void setTxtAcumForcAbr(String abr){
        strAbr = abr;
        txtAcumForcAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumForcMai(){
        strMai = txtAcumForcMai.getText();
        return strMai;
    }

    public void setTxtAcumForcMai(String mai){
        strMai = mai;
        txtAcumForcMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumForcJun(){
        strJun = txtAcumForcJun.getText();
        return strJun;
    }

    public void setTxtAcumForcJun(String jun){
        strJun = jun;
        txtAcumForcJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumForcJul(){
        strJul = txtAcumForcJul.getText();
        return strJul;
    }

    public void setTxtAcumForcJul(String jul){
        strJul = jul;
        txtAcumForcJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumForcAgo(){
        strAgo = txtAcumForcAgo.getText();
        return strAgo;
    }

    public void setTxtAcumForcAgo(String ago){
        strAgo = ago;
        txtAcumForcAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumForcSet(){
        strSet = txtAcumForcSet.getText();
        return strSet;
    }

    public void setTxtAcumForcSet(String set){
        strSet = set;
        txtAcumForcSet.setText(String.valueOf(set));
    }

    public String getTxtAcumForcOut(){
        strOut = txtAcumForcOut.getText();
        return strOut;
    }

    public void setTxtAcumForcOut(String out){
        strOut = out;
        txtAcumForcOut.setText(String.valueOf(out));
    }

    public String getTxtAcumForcNov(){
        strNov = txtAcumForcNov.getText();
        return strNov;
    }

    public void setTxtAcumForcNov(String nov){
        strNov = nov;
        txtAcumForcNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumForcDez(){
        strDez = txtAcumForcDez.getText();
        return strDez;
    }

    public void setTxtAcumForcDez(String dez){
        strDez = dez;
        txtAcumForcDez.setText(String.valueOf(dez));
    }

    /*****************************************Desvio Acumulado*****************************************/
    public String getTxtAcumDesvJan(){
        strJan = txtAcumDesvJan.getText();
        return strJan;
    }

    public void setTxtAcumDesvJan(String jan){
        strJan = jan;
        txtAcumDesvJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumDesvFev(){
        strFev = txtAcumDesvFev.getText();
        return strFev;
    }

    public void setTxtAcumDesvFev(String fev){
        strFev = fev;
        txtAcumDesvFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumDesvMar(){
        strMar = txtAcumDesvMar.getText();
        return strMar;
    }

    public void setTxtAcumDesvMar(String mar){
        strMar = mar;
        txtAcumDesvMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumDesvAbr(){
        strAbr = txtAcumDesvAbr.getText();
        return strAbr;
    }

    public void setTxtAcumDesvAbr(String abr){
        strAbr = abr;
        txtAcumDesvAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumDesvMai(){
        strMai = txtAcumDesvMai.getText();
        return strMai;
    }

    public void setTxtAcumDesvMai(String mai){
        strMai = mai;
        txtAcumDesvMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumDesvJun(){
        strJun = txtAcumDesvJun.getText();
        return strJun;
    }

    public void setTxtAcumDesvJun(String jun){
        strJun = jun;
        txtAcumDesvJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumDesvJul(){
        strJul = txtAcumDesvJul.getText();
        return strJul;
    }

    public void setTxtAcumDesvJul(String jul){
        strJul = jul;
        txtAcumDesvJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumDesvAgo(){
        strAgo = txtAcumDesvAgo.getText();
        return strAgo;
    }

    public void setTxtAcumDesvAgo(String ago){
        strAgo = ago;
        txtAcumDesvAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumDesvSet(){
        strSet = txtAcumDesvSet.getText();
        return strSet;
    }

    public void setTxtAcumDesvSet(String set){
        strSet = set;
        txtAcumDesvSet.setText(String.valueOf(set));
    }

    public String getTxtAcumDesvOut(){
        strOut = txtAcumDesvOut.getText();
        return strOut;
    }

    public void setTxtAcumDesvOut(String out){
        strOut = out;
        txtAcumDesvOut.setText(String.valueOf(out));
    }

    public String getTxtAcumDesvNov(){
        strNov = txtAcumDesvNov.getText();
        return strNov;
    }

    public void setTxtAcumDesvNov(String nov){
        strNov = nov;
        txtAcumDesvNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumDesvDez(){
        strDez = txtAcumDesvDez.getText();
        return strDez;
    }

    public void setTxtAcumDesvDez(String dez){
        strDez = dez;
        txtAcumDesvDez.setText(String.valueOf(dez));
    }

    /*****************************************Desvio Percentual Acumulado*****************************************/
    public String getTxtAcumDesvPerJan(){
        strJan = txtAcumDesvPerJan.getText();
        return strJan;
    }

    public void setTxtAcumDesvPerJan(String jan){
        strJan = jan;
        txtAcumDesvPerJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumDesvPerFev(){
        strFev = txtAcumDesvPerFev.getText();
        return strFev;
    }

    public void setTxtAcumDesvPerFev(String fev){
        strFev = fev;
        txtAcumDesvPerFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumDesvPerMar(){
        strMar = txtAcumDesvPerMar.getText();
        return strMar;
    }

    public void setTxtAcumDesvPerMar(String mar){
        strMar = mar;
        txtAcumDesvPerMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumDesvPerAbr(){
        strAbr = txtAcumDesvPerAbr.getText();
        return strAbr;
    }

    public void setTxtAcumDesvPerAbr(String abr){
        strAbr = abr;
        txtAcumDesvPerAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumDesvPerMai(){
        strMai = txtAcumDesvPerMai.getText();
        return strMai;
    }

    public void setTxtAcumDesvPerMai(String mai){
        strMai = mai;
        txtAcumDesvPerMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumDesvPerJun(){
        strJun = txtAcumDesvPerJun.getText();
        return strJun;
    }

    public void setTxtAcumDesvPerJun(String jun){
        strJun = jun;
        txtAcumDesvPerJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumDesvPerJul(){
        strJul = txtAcumDesvPerJul.getText();
        return strJul;
    }

    public void setTxtAcumDesvPerJul(String jul){
        strJul = jul;
        txtAcumDesvPerJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumDesvPerAgo(){
        strAgo = txtAcumDesvPerAgo.getText();
        return strAgo;
    }

    public void setTxtAcumDesvPerAgo(String ago){
        strAgo = ago;
        txtAcumDesvPerAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumDesvPerSet(){
        strSet = txtAcumDesvPerSet.getText();
        return strSet;
    }

    public void setTxtAcumDesvPerSet(String set){
        strSet = set;
        txtAcumDesvPerSet.setText(String.valueOf(set));
    }

    public String getTxtAcumDesvPerOut(){
        strOut = txtAcumDesvPerOut.getText();
        return strOut;
    }

    public void setTxtAcumDesvPerOut(String out){
        strOut = out;
        txtAcumDesvPerOut.setText(String.valueOf(out));
    }

    public String getTxtAcumDesvPerNov(){
        strNov = txtAcumDesvPerNov.getText();
        return strNov;
    }

    public void setTxtAcumDesvPerNov(String nov){
        strNov = nov;
        txtAcumDesvPerNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumDesvPerDez(){
        strDez = txtAcumDesvPerDez.getText();
        return strDez;
    }

    public void setTxtAcumDesvPerDez(String dez){
        strDez = dez;
        txtAcumDesvPerDez.setText(String.valueOf(dez));
    }

    /*****************************************Real Histórico Acumulado*****************************************/
    public String getTxtAcumRealHisJan(){
        strJan = txtAcumRealHisJan.getText();
        return strJan;
    }

    public void setTxtAcumRealHisJan(String jan){
        strJan = jan;
        txtAcumRealHisJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumRealHisFev(){
        strFev = txtAcumRealHisFev.getText();
        return strFev;
    }

    public void setTxtAcumRealHisFev(String fev){
        strFev = fev;
        txtAcumRealHisFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumRealHisMar(){
        strMar = txtAcumRealHisMar.getText();
        return strMar;
    }

    public void setTxtAcumRealHisMar(String mar){
        strMar = mar;
        txtAcumRealHisMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumRealHisAbr(){
        strAbr = txtAcumRealHisAbr.getText();
        return strAbr;
    }

    public void setTxtAcumRealHisAbr(String abr){
        strAbr = abr;
        txtAcumRealHisAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumRealHisMai(){
        strMai = txtAcumRealHisMai.getText();
        return strMai;
    }

    public void setTxtAcumRealHisMai(String mai){
        strMai = mai;
        txtAcumRealHisMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumRealHisJun(){
        strJun = txtAcumRealHisJun.getText();
        return strJun;
    }

    public void setTxtAcumRealHisJun(String jun){
        strJun = jun;
        txtAcumRealHisJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumRealHisJul(){
        strJul = txtAcumRealHisJul.getText();
        return strJul;
    }

    public void setTxtAcumRealHisJul(String jul){
        strJul = jul;
        txtAcumRealHisJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumRealHisAgo(){
        strAgo = txtAcumRealHisAgo.getText();
        return strAgo;
    }

    public void setTxtAcumRealHisAgo(String ago){
        strAgo = ago;
        txtAcumRealHisAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumRealHisSet(){
        strSet = txtAcumRealHisSet.getText();
        return strSet;
    }

    public void setTxtAcumRealHisSet(String set){
        strSet = set;
        txtAcumRealHisSet.setText(String.valueOf(set));
    }

    public String getTxtAcumRealHisOut(){
        strOut = txtAcumRealHisOut.getText();
        return strOut;
    }

    public void setTxtAcumRealHisOut(String out){
        strOut = out;
        txtAcumRealHisOut.setText(String.valueOf(out));
    }

    public String getTxtAcumRealHisNov(){
        strNov = txtAcumRealHisNov.getText();
        return strNov;
    }

    public void setTxtAcumRealHisNov(String nov){
        strNov = nov;
        txtAcumRealHisNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumRealHisDez(){
        strDez = txtAcumRealHisDez.getText();
        return strDez;
    }

    public void setTxtAcumRealHisDez(String dez){
        strDez = dez;
        txtAcumRealHisDez.setText(String.valueOf(dez));
    }

    /*****************************************Benchmark Acumulado*****************************************/
    public String getTxtAcumBenchJan(){
        strJan = txtAcumBenchJan.getText();
        return strJan;
    }

    public void setTxtAcumBenchJan(double jan){
        dblJan = jan;
        txtAcumBenchJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumBenchFev(){
        strFev = txtAcumBenchFev.getText();
        return strFev;
    }

    public void setTxtAcumBenchFev(double fev){
        dblFev = fev;
        txtAcumBenchFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumBenchMar(){
        strMar = txtAcumBenchMar.getText();
        return strMar;
    }

    public void setTxtAcumBenchMar(double mar){
        dblMar = mar;
        txtAcumBenchMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumBenchAbr(){
        strAbr = txtAcumBenchAbr.getText();
        return strAbr;
    }

    public void setTxtAcumBenchAbr(double abr){
        dblAbr = abr;
        txtAcumBenchAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumBenchMai(){
        strMai = txtAcumBenchMai.getText();
        return strMai;
    }

    public void setTxtAcumBenchMai(double mai){
        dblMai = mai;
        txtAcumBenchMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumBenchJun(){
        strJun = txtAcumBenchJun.getText();
        return strJun;
    }

    public void setTxtAcumBenchJun(double jun){
        dblJun = jun;
        txtAcumBenchJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumBenchJul(){
        strJul = txtAcumBenchJul.getText();
        return strJul;
    }

    public void setTxtAcumBenchJul(double jul){
        dblJul = jul;
        txtAcumBenchJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumBenchAgo(){
        strAgo = txtAcumBenchAgo.getText();
        return strAgo;
    }

    public void setTxtAcumBenchAgo(double ago){
        dblAgo = ago;
        txtAcumBenchAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumBenchSet(){
        strSet = txtAcumBenchSet.getText();
        return strSet;
    }

    public void setTxtAcumBenchSet(double set){
        dblSet = set;
        txtAcumBenchSet.setText(String.valueOf(set));
    }

    public String getTxtAcumBenchOut(){
        strOut = txtAcumBenchOut.getText();
        return strOut;
    }

    public void setTxtAcumBenchOut(double out){
        dblOut = out;
        txtAcumBenchOut.setText(String.valueOf(out));
    }

    public String getTxtAcumBenchNov(){
        strNov = txtAcumBenchNov.getText();
        return strNov;
    }

    public void setTxtAcumBenchNov(double nov){
        dblNov = nov;
        txtAcumBenchNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumBenchDez(){
        strDez = txtAcumBenchDez.getText();
        return strDez;
    }

    public void setTxtAcumBenchDez(double dez){
        dblDez = dez;
        txtAcumBenchDez.setText(String.valueOf(dez));
    }

    /*****************************************Ideal Acumulado*****************************************/
    public String getTxtAcumIdealJan(){
        strJan = txtAcumIdealJan.getText();
        return strJan;
    }

    public void setTxtAcumIdealJan(String jan){
        strJan = jan;
        txtAcumIdealJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumIdealFev(){
        strFev = txtAcumIdealFev.getText();
        return strFev;
    }

    public void setTxtAcumIdealFev(String fev){
        strFev = fev;
        txtAcumIdealFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumIdealMar(){
        strMar = txtAcumIdealMar.getText();
        return strMar;
    }

    public void setTxtAcumIdealMar(String mar){
        strMar = mar;
        txtAcumIdealMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumIdealAbr(){
        strAbr = txtAcumIdealAbr.getText();
        return strAbr;
    }

    public void setTxtAcumIdealAbr(String abr){
        strAbr = abr;
        txtAcumIdealAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumIdealMai(){
        strMai = txtAcumIdealMai.getText();
        return strMai;
    }

    public void setTxtAcumIdealMai(String mai){
        strMai = mai;
        txtAcumIdealMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumIdealJun(){
        strJun = txtAcumIdealJun.getText();
        return strJun;
    }

    public void setTxtAcumIdealJun(String jun){
        strJun = jun;
        txtAcumIdealJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumIdealJul(){
        strJul = txtAcumIdealJul.getText();
        return strJul;
    }

    public void setTxtAcumIdealJul(String jul){
        strJul = jul;
        txtAcumIdealJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumIdealAgo(){
        strAgo = txtAcumIdealAgo.getText();
        return strAgo;
    }

    public void setTxtAcumIdealAgo(String ago){
        strAgo = ago;
        txtAcumIdealAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumIdealSet(){
        strSet = txtAcumIdealSet.getText();
        return strSet;
    }

    public void setTxtAcumIdealSet(String set){
        strSet = set;
        txtAcumIdealSet.setText(String.valueOf(set));
    }

    public String getTxtAcumIdealOut(){
        strOut = txtAcumIdealOut.getText();
        return strOut;
    }

    public void setTxtAcumIdealOut(String out){
        strOut = out;
        txtAcumIdealOut.setText(String.valueOf(out));
    }

    public String getTxtAcumIdealNov(){
        strNov = txtAcumIdealNov.getText();
        return strNov;
    }

    public void setTxtAcumIdealNov(String nov){
        strNov = nov;
        txtAcumIdealNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumIdealDez(){
        strDez = txtAcumIdealDez.getText();
        return strDez;
    }

    public void setTxtAcumIdealDez(String dez){
        strDez = dez;
        txtAcumIdealDez.setText(String.valueOf(dez));
    }

    /*****************************************Meta Anterior Acumulado*****************************************/
    public String getTxtAcumMetaAntJan(){
        strJan = txtAcumMetaAntJan.getText();
        return strJan;
    }

    public void setTxtAcumMetaAntJan(double jan){
        dblJan = jan;
        txtAcumMetaAntJan.setText(String.valueOf(jan));
    }

    public String getTxtAcumMetaAntFev(){
        strFev = txtAcumMetaAntFev.getText();
        return strFev;
    }

    public void setTxtAcumMetaAntFev(double fev){
        dblFev = fev;
        txtAcumMetaAntFev.setText(String.valueOf(fev));
    }

    public String getTxtAcumMetaAntMar(){
        strMar = txtAcumMetaAntMar.getText();
        return strMar;
    }

    public void setTxtAcumMetaAntMar(double mar){
        dblMar = mar;
        txtAcumMetaAntMar.setText(String.valueOf(mar));
    }

    public String getTxtAcumMetaAntAbr(){
        strAbr = txtAcumMetaAntAbr.getText();
        return strAbr;
    }

    public void setTxtAcumMetaAntAbr(double abr){
        dblAbr = abr;
        txtAcumMetaAntAbr.setText(String.valueOf(abr));
    }

    public String getTxtAcumMetaAntMai(){
        strMai = txtAcumMetaAntMai.getText();
        return strMai;
    }

    public void setTxtAcumMetaAntMai(double mai){
        dblMai = mai;
        txtAcumMetaAntMai.setText(String.valueOf(mai));
    }

    public String getTxtAcumMetaAntJun(){
        strJun = txtAcumMetaAntJun.getText();
        return strJun;
    }

    public void setTxtAcumMetaAntJun(double jun){
        dblJun = jun;
        txtAcumMetaAntJun.setText(String.valueOf(jun));
    }

    public String getTxtAcumMetaAntJul(){
        strJul = txtAcumMetaAntJul.getText();
        return strJul;
    }

    public void setTxtAcumMetaAntJul(double jul){
        dblJul = jul;
        txtAcumMetaAntJul.setText(String.valueOf(jul));
    }

    public String getTxtAcumMetaAntAgo(){
        strAgo = txtAcumMetaAntAgo.getText();
        return strAgo;
    }

    public void setTxtAcumMetaAntAgo(double ago){
        dblAgo = ago;
        txtAcumMetaAntAgo.setText(String.valueOf(ago));
    }

    public String getTxtAcumMetaAntSet(){
        strSet = txtAcumMetaAntSet.getText();
        return strSet;
    }

    public void setTxtAcumMetaAntSet(double set){
        dblSet = set;
        txtAcumMetaAntSet.setText(String.valueOf(set));
    }

    public String getTxtAcumMetaAntOut(){
        strOut = txtAcumMetaAntOut.getText();
        return strOut;
    }

    public void setTxtAcumMetaAntOut(double out){
        dblOut = out;
        txtAcumMetaAntOut.setText(String.valueOf(out));
    }

    public String getTxtAcumMetaAntNov(){
        strNov = txtAcumMetaAntNov.getText();
        return strNov;
    }

    public void setTxtAcumMetaAntNov(double nov){
        dblNov = nov;
        txtAcumMetaAntNov.setText(String.valueOf(nov));
    }

    public String getTxtAcumMetaAntDez(){
        strDez = txtAcumMetaAntDez.getText();
        return strDez;
    }

    public void setTxtAcumMetaAntDez(double dez){
        dblDez = dez;
        txtAcumMetaAntDez.setText(String.valueOf(dez));
    }

    /*****************************************Real Mensal*****************************************/
    public String getTxtMenRealJan(){
        strJan = txtMenRealJan.getText();
        return strJan;
    }

    public void setTxtMenRealJan(String jan){
        strJan = jan;
        txtMenRealJan.setText(String.valueOf(jan));
    }

    public String getTxtMenRealFev(){
        strFev = txtMenRealFev.getText();
        return strFev;
    }

    public void setTxtMenRealFev(String fev){
        strFev = fev;
        txtMenRealFev.setText(String.valueOf(fev));
    }

    public String getTxtMenRealMar(){
        strMar = txtMenRealMar.getText();
        return strMar;
    }

    public void setTxtMenRealMar(String mar){
        strMar = mar;
        txtMenRealMar.setText(String.valueOf(mar));
    }

    public String getTxtMenRealAbr(){
        strAbr = txtMenRealAbr.getText();
        return strAbr;
    }

    public void setTxtMenRealAbr(String abr){
        strAbr = abr;
        txtMenRealAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenRealMai(){
        strMai = txtMenRealMai.getText();
        return strMai;
    }

    public void setTxtMenRealMai(String mai){
        strMai = mai;
        txtMenRealMai.setText(String.valueOf(mai));
    }

    public String getTxtMenRealJun(){
        strJun = txtMenRealJun.getText();
        return strJun;
    }

    public void setTxtMenRealJun(String jun){
        strJun = jun;
        txtMenRealJun.setText(String.valueOf(jun));
    }

    public String getTxtMenRealJul(){
        strJul = txtMenRealJul.getText();
        return strJul;
    }

    public void setTxtMenRealJul(String jul){
        strJul = jul;
        txtMenRealJul.setText(String.valueOf(jul));
    }

    public String getTxtMenRealAgo(){
        strAgo = txtMenRealAgo.getText();
        return strAgo;
    }

    public void setTxtMenRealAgo(String ago){
        strAgo = ago;
        txtMenRealAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenRealSet(){
        strSet = txtMenRealSet.getText();
        return strSet;
    }

    public void setTxtMenRealSet(String set){
        strSet = set;
        txtMenRealSet.setText(String.valueOf(set));
    }

    public String getTxtMenRealOut(){
        strOut = txtMenRealOut.getText();
        return strOut;
    }

    public void setTxtMenRealOut(String out){
        strOut = out;
        txtMenRealOut.setText(String.valueOf(out));
    }

    public String getTxtMenRealNov(){
        strNov = txtMenRealNov.getText();
        return strNov;
    }

    public void setTxtMenRealNov(String nov){
        strNov = nov;
        txtMenRealNov.setText(String.valueOf(nov));
    }

    public String getTxtMenRealDez(){
        strDez = txtMenRealDez.getText();
        return strDez;
    }

    public void setTxtMenRealDez(String dez){
        strDez = dez;
        txtMenRealDez.setText(String.valueOf(dez));
    }

    /*****************************************Meta Mensal*****************************************/
    public String getTxtMenMetaJan(){
        strJan = txtMenMetaJan.getText();
        return strJan;
    }

    public void setTxtMenMetaJan(String jan){
        strJan = jan;
        txtMenMetaJan.setText(String.valueOf(jan));
    }

    public String getTxtMenMetaFev(){
        strFev = txtMenMetaFev.getText();
        return strFev;
    }

    public void setTxtMenMetaFev(String fev){
        strFev = fev;
        txtMenMetaFev.setText(String.valueOf(fev));
    }

    public String getTxtMenMetaMar(){
        strMar = txtMenMetaMar.getText();
        return strMar;
    }

    public void setTxtMenMetaMar(String mar){
        strMar = mar;
        txtMenMetaMar.setText(String.valueOf(mar));
    }

    public String getTxtMenMetaAbr(){
        strAbr = txtMenMetaAbr.getText();
        return strAbr;
    }

    public void setTxtMenMetaAbr(String abr){
        strAbr = abr;
        txtMenMetaAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenMetaMai(){
        strMai = txtMenMetaMai.getText();
        return strMai;
    }

    public void setTxtMenMetaMai(String mai){
        strMai = mai;
        txtMenMetaMai.setText(String.valueOf(mai));
    }

    public String getTxtMenMetaJun(){
        strJun = txtMenMetaJun.getText();
        return strJun;
    }

    public void setTxtMenMetaJun(String jun){
        strJun = jun;
        txtMenMetaJun.setText(String.valueOf(jun));
    }

    public String getTxtMenMetaJul(){
        strJul = txtMenMetaJul.getText();
        return strJul;
    }

    public void setTxtMenMetaJul(String jul){
        strJul = jul;
        txtMenMetaJul.setText(String.valueOf(jul));
    }

    public String getTxtMenMetaAgo(){
        strAgo = txtMenMetaAgo.getText();
        return strAgo;
    }

    public void setTxtMenMetaAgo(String ago){
        strAgo = ago;
        txtMenMetaAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenMetaSet(){
        strSet = txtMenMetaSet.getText();
        return strSet;
    }

    public void setTxtMenMetaSet(String set){
        strSet = set;
        txtMenMetaSet.setText(String.valueOf(set));
    }

    public String getTxtMenMetaOut(){
        strOut = txtMenMetaOut.getText();
        return strOut;
    }

    public void setTxtMenMetaOut(String out){
        strOut = out;
        txtMenMetaOut.setText(String.valueOf(out));
    }

    public String getTxtMenMetaNov(){
        strNov = txtMenMetaNov.getText();
        return strNov;
    }

    public void setTxtMenMetaNov(String nov){
        strNov = nov;
        txtMenMetaNov.setText(String.valueOf(nov));
    }

    public String getTxtMenMetaDez(){
        strDez = txtMenMetaDez.getText();
        return strDez;
    }

    public void setTxtMenMetaDez(String dez){
        strDez = dez;
        txtMenMetaDez.setText(String.valueOf(dez));
    }

    /*****************************************Forecast Mensal*****************************************/
    public String getTxtMenForcJan(){
        strJan = txtMenForcJan.getText();
        return strJan;
    }

    public void setTxtMenForcJan(String jan){
        strJan = jan;
        txtMenForcJan.setText(String.valueOf(jan));
    }

    public String getTxtMenForcFev(){
        strFev = txtMenForcFev.getText();
        return strFev;
    }

    public void setTxtMenForcFev(String fev){
        strFev = fev;
        txtMenForcFev.setText(String.valueOf(fev));
    }

    public String getTxtMenForcMar(){
        strMar = txtMenForcMar.getText();
        return strMar;
    }

    public void setTxtMenForcMar(String mar){
        strMar = mar;
        txtMenForcMar.setText(String.valueOf(mar));
    }

    public String getTxtMenForcAbr(){
        strAbr = txtMenForcAbr.getText();
        return strAbr;
    }

    public void setTxtMenForcAbr(String abr){
        strAbr = abr;
        txtMenForcAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenForcMai(){
        strMai = txtMenForcMai.getText();
        return strMai;
    }

    public void setTxtMenForcMai(String mai){
        strMai = mai;
        txtMenForcMai.setText(String.valueOf(mai));
    }

    public String getTxtMenForcJun(){
        strJun = txtMenForcJun.getText();
        return strJun;
    }

    public void setTxtMenForcJun(String jun){
        strJun = jun;
        txtMenForcJun.setText(String.valueOf(jun));
    }

    public String getTxtMenForcJul(){
        strJul = txtMenForcJul.getText();
        return strJul;
    }

    public void setTxtMenForcJul(String jul){
        strJul = jul;
        txtMenForcJul.setText(String.valueOf(jul));
    }

    public String getTxtMenForcAgo(){
        strAgo = txtMenForcAgo.getText();
        return strAgo;
    }

    public void setTxtMenForcAgo(String ago){
        strAgo = ago;
        txtMenForcAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenForcSet(){
        strSet = txtMenForcSet.getText();
        return strSet;
    }

    public void setTxtMenForcSet(String set){
        strSet = set;
        txtMenForcSet.setText(String.valueOf(set));
    }

    public String getTxtMenForcOut(){
        strOut = txtMenForcOut.getText();
        return strOut;
    }

    public void setTxtMenForcOut(String out){
        strOut = out;
        txtMenForcOut.setText(String.valueOf(out));
    }

    public String getTxtMenForcNov(){
        strNov = txtMenForcNov.getText();
        return strNov;
    }

    public void setTxtMenForcNov(String nov){
        strNov = nov;
        txtMenForcNov.setText(String.valueOf(nov));
    }

    public String getTxtMenForcDez(){
        strDez = txtMenForcDez.getText();
        return strDez;
    }

    public void setTxtMenForcDez(String dez){
        strDez = dez;
        txtMenForcDez.setText(String.valueOf(dez));
    }

    /*****************************************Desvio Mensal*****************************************/
    public String getTxtMenDesvJan(){
        strJan = txtMenDesvJan.getText();
        return strJan;
    }

    public void setTxtMenDesvJan(String jan){
        strJan = jan;
        txtMenDesvJan.setText(String.valueOf(jan));
    }

    public String getTxtMenDesvFev(){
        strFev = txtMenDesvFev.getText();
        return strFev;
    }

    public void setTxtMenDesvFev(String fev){
        strFev = fev;
        txtMenDesvFev.setText(String.valueOf(fev));
    }

    public String getTxtMenDesvMar(){
        strMar = txtMenDesvMar.getText();
        return strMar;
    }

    public void setTxtMenDesvMar(String mar){
        strMar = mar;
        txtMenDesvMar.setText(String.valueOf(mar));
    }

    public String getTxtMenDesvAbr(){
        strAbr = txtMenDesvAbr.getText();
        return strAbr;
    }

    public void setTxtMenDesvAbr(String abr){
        strAbr = abr;
        txtMenDesvAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenDesvMai(){
        strMai = txtMenDesvMai.getText();
        return strMai;
    }

    public void setTxtMenDesvMai(String mai){
        strMai = mai;
        txtMenDesvMai.setText(String.valueOf(mai));
    }

    public String getTxtMenDesvJun(){
        strJun = txtMenDesvJun.getText();
        return strJun;
    }

    public void setTxtMenDesvJun(String jun){
        strJun = jun;
        txtMenDesvJun.setText(String.valueOf(jun));
    }

    public String getTxtMenDesvJul(){
        strJul = txtMenDesvJul.getText();
        return strJul;
    }

    public void setTxtMenDesvJul(String jul){
        strJul = jul;
        txtMenDesvJul.setText(String.valueOf(jul));
    }

    public String getTxtMenDesvAgo(){
        strAgo = txtMenDesvAgo.getText();
        return strAgo;
    }

    public void setTxtMenDesvAgo(String ago){
        strAgo = ago;
        txtMenDesvAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenDesvSet(){
        strSet = txtMenDesvSet.getText();
        return strSet;
    }

    public void setTxtMenDesvSet(String set){
        strSet = set;
        txtMenDesvSet.setText(String.valueOf(set));
    }

    public String getTxtMenDesvOut(){
        strOut = txtMenDesvOut.getText();
        return strOut;
    }

    public void setTxtMenDesvOut(String out){
        strOut = out;
        txtMenDesvOut.setText(String.valueOf(out));
    }

    public String getTxtMenDesvNov(){
        strNov = txtMenDesvNov.getText();
        return strNov;
    }

    public void setTxtMenDesvNov(String nov){
        strNov = nov;
        txtMenDesvNov.setText(String.valueOf(nov));
    }

    public String getTxtMenDesvDez(){
        strDez = txtMenDesvDez.getText();
        return strDez;
    }

    public void setTxtMenDesvDez(String dez){
        strDez = dez;
        txtMenDesvDez.setText(String.valueOf(dez));
    }

    /*****************************************Desvio Percentual Mensal*****************************************/
    public String getTxtMenDesvPerJan(){
        strJan = txtMenDesvPerJan.getText();
        return strJan;
    }

    public void setTxtMenDesvPerJan(String jan){
        strJan = jan;
        txtMenDesvPerJan.setText(String.valueOf(jan));
    }

    public String getTxtMenDesvPerFev(){
        strFev = txtMenDesvPerFev.getText();
        return strFev;
    }

    public void setTxtMenDesvPerFev(String fev){
        strFev = fev;
        txtMenDesvPerFev.setText(String.valueOf(fev));
    }

    public String getTxtMenDesvPerMar(){
        strMar = txtMenDesvPerMar.getText();
        return strMar;
    }

    public void setTxtMenDesvPerMar(String mar){
        strMar = mar;
        txtMenDesvPerMar.setText(String.valueOf(mar));
    }

    public String getTxtMenDesvPerAbr(){
        strAbr = txtMenDesvPerAbr.getText();
        return strAbr;
    }

    public void setTxtMenDesvPerAbr(String abr){
        strAbr = abr;
        txtMenDesvPerAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenDesvPerMai(){
        strMai = txtMenDesvPerMai.getText();
        return strMai;
    }

    public void setTxtMenDesvPerMai(String mai){
        strMai = mai;
        txtMenDesvPerMai.setText(String.valueOf(mai));
    }

    public String getTxtMenDesvPerJun(){
        strJun = txtMenDesvPerJun.getText();
        return strJun;
    }

    public void setTxtMenDesvPerJun(String jun){
        strJun = jun;
        txtMenDesvPerJun.setText(String.valueOf(jun));
    }

    public String getTxtMenDesvPerJul(){
        strJul = txtMenDesvPerJul.getText();
        return strJul;
    }

    public void setTxtMenDesvPerJul(String jul){
        strJul = jul;
        txtMenDesvPerJul.setText(String.valueOf(jul));
    }

    public String getTxtMenDesvPerAgo(){
        strAgo = txtMenDesvPerAgo.getText();
        return strAgo;
    }

    public void setTxtMenDesvPerAgo(String ago){
        strAgo = ago;
        txtMenDesvPerAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenDesvPerSet(){
        strSet = txtMenDesvPerSet.getText();
        return strSet;
    }

    public void setTxtMenDesvPerSet(String set){
        strSet = set;
        txtMenDesvPerSet.setText(String.valueOf(set));
    }

    public String getTxtMenDesvPerOut(){
        strOut = txtMenDesvPerOut.getText();
        return strOut;
    }

    public void setTxtMenDesvPerOut(String out){
        strOut = out;
        txtMenDesvPerOut.setText(String.valueOf(out));
    }

    public String getTxtMenDesvPerNov(){
        strNov = txtMenDesvPerNov.getText();
        return strNov;
    }

    public void setTxtMenDesvPerNov(String nov){
        strNov = nov;
        txtMenDesvPerNov.setText(String.valueOf(nov));
    }

    public String getTxtMenDesvPerDez(){
        strDez = txtMenDesvPerDez.getText();
        return strDez;
    }

    public void setTxtMenDesvPerDez(String dez){
        strDez = dez;
        txtMenDesvPerDez.setText(String.valueOf(dez));
    }

    /*****************************************Real Histórico Mensal*****************************************/
    public String getTxtMenRealHisJan(){
        strJan = txtMenRealHisJan.getText();
        return strJan;
    }

    public void setTxtMenRealHisJan(String jan){
        strJan = jan;
        txtMenRealHisJan.setText(String.valueOf(jan));
    }

    public String getTxtMenRealHisFev(){
        strFev = txtMenRealHisFev.getText();
        return strFev;
    }

    public void setTxtMenRealHisFev(String fev){
        strFev = fev;
        txtMenRealHisFev.setText(String.valueOf(fev));
    }

    public String getTxtMenRealHisMar(){
        strMar = txtMenRealHisMar.getText();
        return strMar;
    }

    public void setTxtMenRealHisMar(String mar){
        strMar = mar;
        txtMenRealHisMar.setText(String.valueOf(mar));
    }

    public String getTxtMenRealHisAbr(){
        strAbr = txtMenRealHisAbr.getText();
        return strAbr;
    }

    public void setTxtMenRealHisAbr(String abr){
        strAbr = abr;
        txtMenRealHisAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenRealHisMai(){
        strMai = txtMenRealHisMai.getText();
        return strMai;
    }

    public void setTxtMenRealHisMai(String mai){
        strMai = mai;
        txtMenRealHisMai.setText(String.valueOf(mai));
    }

    public String getTxtMenRealHisJun(){
        strJun = txtMenRealHisJun.getText();
        return strJun;
    }

    public void setTxtMenRealHisJun(String jun){
        strJun = jun;
        txtMenRealHisJun.setText(String.valueOf(jun));
    }

    public String getTxtMenRealHisJul(){
        strJul = txtMenRealHisJul.getText();
        return strJul;
    }

    public void setTxtMenRealHisJul(String jul){
        strJul = jul;
        txtMenRealHisJul.setText(String.valueOf(jul));
    }

    public String getTxtMenRealHisAgo(){
        strAgo = txtMenRealHisAgo.getText();
        return strAgo;
    }

    public void setTxtMenRealHisAgo(String ago){
        strAgo = ago;
        txtMenRealHisAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenRealHisSet(){
        strSet = txtMenRealHisSet.getText();
        return strSet;
    }

    public void setTxtMenRealHisSet(String set){
        strSet = set;
        txtMenRealHisSet.setText(String.valueOf(set));
    }

    public String getTxtMenRealHisOut(){
        strOut = txtMenRealHisOut.getText();
        return strOut;
    }

    public void setTxtMenRealHisOut(String out){
        strOut = out;
        txtMenRealHisOut.setText(String.valueOf(out));
    }

    public String getTxtMenRealHisNov(){
        strNov = txtMenRealHisNov.getText();
        return strNov;
    }

    public void setTxtMenRealHisNov(String nov){
        strNov = nov;
        txtMenRealHisNov.setText(String.valueOf(nov));
    }

    public String getTxtMenRealHisDez(){
        strDez = txtMenRealHisDez.getText();
        return strDez;
    }

    public void setTxtMenRealHisDez(String dez){
        strDez = dez;
        txtMenRealHisDez.setText(String.valueOf(dez));
    }

    /*****************************************Benchmark Mensal*****************************************/
    public String getTxtMenBenchJan(){
        strJan = txtMenBenchJan.getText();
        return strJan;
    }

    public void setTxtMenBenchJan(double jan){
        dblJan = jan;
        txtMenBenchJan.setText(String.valueOf(jan));
    }

    public String getTxtMenBenchFev(){
        strFev = txtMenBenchFev.getText();
        return strFev;
    }

    public void setTxtMenBenchFev(double fev){
        dblFev = fev;
        txtMenBenchFev.setText(String.valueOf(fev));
    }

    public String getTxtMenBenchMar(){
        strMar = txtMenBenchMar.getText();
        return strMar;
    }

    public void setTxtMenBenchMar(double mar){
        dblMar = mar;
        txtMenBenchMar.setText(String.valueOf(mar));
    }

    public String getTxtMenBenchAbr(){
        strAbr = txtMenBenchAbr.getText();
        return strAbr;
    }

    public void setTxtMenBenchAbr(double abr){
        dblAbr = abr;
        txtMenBenchAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenBenchMai(){
        strMai = txtMenBenchMai.getText();
        return strMai;
    }

    public void setTxtMenBenchMai(double mai){
        dblMai = mai;
        txtMenBenchMai.setText(String.valueOf(mai));
    }

    public String getTxtMenBenchJun(){
        strJun = txtMenBenchJun.getText();
        return strJun;
    }

    public void setTxtMenBenchJun(double jun){
        dblJun = jun;
        txtMenBenchJun.setText(String.valueOf(jun));
    }

    public String getTxtMenBenchJul(){
        strJul = txtMenBenchJul.getText();
        return strJul;
    }

    public void setTxtMenBenchJul(double jul){
        dblJul = jul;
        txtMenBenchJul.setText(String.valueOf(jul));
    }

    public String getTxtMenBenchAgo(){
        strAgo = txtMenBenchAgo.getText();
        return strAgo;
    }

    public void setTxtMenBenchAgo(double ago){
        dblAgo = ago;
        txtMenBenchAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenBenchSet(){
        strSet = txtMenBenchSet.getText();
        return strSet;
    }

    public void setTxtMenBenchSet(double set){
        dblSet = set;
        txtMenBenchSet.setText(String.valueOf(set));
    }

    public String getTxtMenBenchOut(){
        strOut = txtMenBenchOut.getText();
        return strOut;
    }

    public void setTxtMenBenchOut(double out){
        dblOut = out;
        txtMenBenchOut.setText(String.valueOf(out));
    }

    public String getTxtMenBenchNov(){
        strNov = txtMenBenchNov.getText();
        return strNov;
    }

    public void setTxtMenBenchNov(double nov){
        dblNov = nov;
        txtMenBenchNov.setText(String.valueOf(nov));
    }

    public String getTxtMenBenchDez(){
        strDez = txtMenBenchDez.getText();
        return strDez;
    }

    public void setTxtMenBenchDez(double dez){
        dblDez = dez;
        txtMenBenchDez.setText(String.valueOf(dez));
    }

    /*****************************************Ideal Mensal*****************************************/
    public String getTxtMenIdealJan(){
        strJan = txtMenIdealJan.getText();
        return strJan;
    }

    public void setTxtMenIdealJan(String jan){
        strJan = jan;
        txtMenIdealJan.setText(String.valueOf(jan));
    }

    public String getTxtMenIdealFev(){
        strFev = txtMenIdealFev.getText();
        return strFev;
    }

    public void setTxtMenIdealFev(String fev){
        strFev = fev;
        txtMenIdealFev.setText(String.valueOf(fev));
    }

    public String getTxtMenIdealMar(){
        strMar = txtMenIdealMar.getText();
        return strMar;
    }

    public void setTxtMenIdealMar(String mar){
        strMar = mar;
        txtMenIdealMar.setText(String.valueOf(mar));
    }

    public String getTxtMenIdealAbr(){
        strAbr = txtMenIdealAbr.getText();
        return strAbr;
    }

    public void setTxtMenIdealAbr(String abr){
        strAbr = abr;
        txtMenIdealAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenIdealMai(){
        strMai = txtMenIdealMai.getText();
        return strMai;
    }

    public void setTxtMenIdealMai(String mai){
        strMai = mai;
        txtMenIdealMai.setText(String.valueOf(mai));
    }

    public String getTxtMenIdealJun(){
        strJun = txtMenIdealJun.getText();
        return strJun;
    }

    public void setTxtMenIdealJun(String jun){
        strJun = jun;
        txtMenIdealJun.setText(String.valueOf(jun));
    }

    public String getTxtMenIdealJul(){
        strJul = txtMenIdealJul.getText();
        return strJul;
    }

    public void setTxtMenIdealJul(String jul){
        strJul = jul;
        txtMenIdealJul.setText(String.valueOf(jul));
    }

    public String getTxtMenIdealAgo(){
        strAgo = txtMenIdealAgo.getText();
        return strAgo;
    }

    public void setTxtMenIdealAgo(String ago){
        strAgo = ago;
        txtMenIdealAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenIdealSet(){
        strSet = txtMenIdealSet.getText();
        return strSet;
    }

    public void setTxtMenIdealSet(String set){
        strSet = set;
        txtMenIdealSet.setText(String.valueOf(set));
    }

    public String getTxtMenIdealOut(){
        strOut = txtMenIdealOut.getText();
        return strOut;
    }

    public void setTxtMenIdealOut(String out){
        strOut = out;
        txtMenIdealOut.setText(String.valueOf(out));
    }

    public String getTxtMenIdealNov(){
        strNov = txtMenIdealNov.getText();
        return strNov;
    }

    public void setTxtMenIdealNov(String nov){
        strNov = nov;
        txtMenIdealNov.setText(String.valueOf(nov));
    }

    public String getTxtMenIdealDez(){
        strDez = txtMenIdealDez.getText();
        return strDez;
    }

    public void setTxtMenIdealDez(String dez){
        strDez = dez;
        txtMenIdealDez.setText(String.valueOf(dez));
    }

    /*****************************************Meta Anterior Mensal*****************************************/
    public String getTxtMenMetaAntJan(){
        strJan = txtMenMetaAntJan.getText();
        return strJan;
    }

    public void setTxtMenMetaAntJan(double jan){
        dblJan = jan;
        txtMenMetaAntJan.setText(String.valueOf(jan));
    }

    public String getTxtMenMetaAntFev(){
        strFev = txtMenMetaAntFev.getText();
        return strFev;
    }

    public void setTxtMenMetaAntFev(double fev){
        dblFev = fev;
        txtMenMetaAntFev.setText(String.valueOf(fev));
    }

    public String getTxtMenMetaAntMar(){
        strMar = txtMenMetaAntMar.getText();
        return strMar;
    }

    public void setTxtMenMetaAntMar(double mar){
        dblMar = mar;
        txtMenMetaAntMar.setText(String.valueOf(mar));
    }

    public String getTxtMenMetaAntAbr(){
        strAbr = txtMenMetaAntAbr.getText();
        return strAbr;
    }

    public void setTxtMenMetaAntAbr(double abr){
        dblAbr = abr;
        txtMenMetaAntAbr.setText(String.valueOf(abr));
    }

    public String getTxtMenMetaAntMai(){
        strMai = txtMenMetaAntMai.getText();
        return strMai;
    }

    public void setTxtMenMetaAntMai(double mai){
        dblMai = mai;
        txtMenMetaAntMai.setText(String.valueOf(mai));
    }

    public String getTxtMenMetaAntJun(){
        strJun = txtMenMetaAntJun.getText();
        return strJun;
    }

    public void setTxtMenMetaAntJun(double jun){
        dblJun = jun;
        txtMenMetaAntJun.setText(String.valueOf(jun));
    }

    public String getTxtMenMetaAntJul(){
        strJul = txtMenMetaAntJul.getText();
        return strJul;
    }

    public void setTxtMenMetaAntJul(double jul){
        dblJul = jul;
        txtMenMetaAntJul.setText(String.valueOf(jul));
    }

    public String getTxtMenMetaAntAgo(){
        strAgo = txtMenMetaAntAgo.getText();
        return strAgo;
    }

    public void setTxtMenMetaAntAgo(double ago){
        dblAgo = ago;
        txtMenMetaAntAgo.setText(String.valueOf(ago));
    }

    public String getTxtMenMetaAntSet(){
        strSet = txtMenMetaAntSet.getText();
        return strSet;
    }

    public void setTxtMenMetaAntSet(double set){
        dblSet = set;
        txtMenMetaAntSet.setText(String.valueOf(set));
    }

    public String getTxtMenMetaAntOut(){
        strOut = txtMenMetaAntOut.getText();
        return strOut;
    }

    public void setTxtMenMetaAntOut(double out){
        dblOut = out;
        txtMenMetaAntOut.setText(String.valueOf(out));
    }

    public String getTxtMenMetaAntNov(){
        strNov = txtMenMetaAntNov.getText();
        return strNov;
    }

    public void setTxtMenMetaAntNov(double nov){
        dblNov = nov;
        txtMenMetaAntNov.setText(String.valueOf(nov));
    }

    public String getTxtMenMetaAntDez(){
        strDez = txtMenMetaAntDez.getText();
        return strDez;
    }

    public void setTxtMenMetaAntDez(double dez){
        dblDez = dez;
        txtMenMetaAntDez.setText(String.valueOf(dez));
    }
}
