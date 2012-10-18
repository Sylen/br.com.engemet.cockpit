package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.acao.AcaoBotaoCockpit;
import br.com.engemet.cockpit.acao.CalculoStatus;
import br.com.engemet.cockpit.oracle.Conexao;
import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

public abstract class Info {
    
    public static Calendar cal = Calendar.getInstance();
    public static int data;
    public static Principal telaPrincipal;
    public static Cockpit cockpit;
    public static Objetivos objetivos;
    public static Graficos graficos;
    public static MapaEstrategico mapaEstrategico;
    public static Conexao objConexao;
    public static Indicadores indicadores;
    public static AcaoBotaoCockpit acaoBotaoCockpit;
    public static CalculoStatus calculoStatus;
    public static Iniciativas iniciativas;
    public static CronogramaIniciativa cronogramaIniciativa;
    public static SGI sgi;

    public static int codInd = 1;
    public static int codTb = 1;
    public static int aux = 0;
    public static String metaAux;
    public static String nomeUsuario;

    public static Locale locBrazil = new Locale("pt", "BR");
    public static NumberFormat absoluto = NumberFormat.getInstance(locBrazil);
    public static NumberFormat percentual = NumberFormat.getPercentInstance(locBrazil);
    public static NumberFormat decimal = NumberFormat.getInstance(Locale.US);
    
    public static int cod = 0;
    private static String tabela, insert, campo, select, indCod, codTab, strPainel, strPosicao, strPerspectiva;
    
    public static boolean verificarHis, verificarFor, verificarIde;
    private static String nomeInd;
    
    public static void setForecastInfo(int cod){
        tabela = "CP_FORECAST";
        indCod = "FOR_INDCOD";
        campo = "FOR_NOM";
        int aux = 0;
        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, campo, aux);
        
        if(aux == 1){
            verificarFor = false;
        }else{
            verificarFor = true;
        }
    }
    
    public static void setHistoricoInfo(int cod){
        tabela = "CP_HISTORICO";
        indCod = "HIS_INDCOD";
        campo = "HIS_ANOREF";
        int aux = 0;
        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            verificarHis = false;
        }else{
            verificarHis = true;
        }
    }
    
    public static void setValorIdealInfo(int cod){
        tabela = "CP_VAL_IDEAIS";
        indCod = "IDE_INDCOD";
        campo = "IDE_ANOREF";
        int aux = 0;
        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            verificarIde = false;
        }else{
            verificarIde = true;
        }
    }
    
    public static int getCodGrafico(String perspectiva, int painel, int posicao){
        tabela = "CP_INF_GERAIS";
        campo = "INF_INDCOD";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strPerspectiva + " = '" + perspectiva + "' AND "+ strPainel + " = " + painel + " AND " + strPosicao + " = " + posicao;
        cod = objConexao.getSelect(select, campo, cod);

        return cod;
    }
    
    public static int getCodGrafico(String perspectiva){
        tabela = "CP_INF_GERAIS";
        campo = "INF_INDCOD";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strPerspectiva + " = '" + perspectiva;
        cod = objConexao.getSelect(select, campo, cod);

        return cod;
    }
    
    public static int getCod(){
        tabela = "CP_INF_GERAIS";
        campo = "INF_INDCOD";

        select = "SELECT * FROM CP_INF_GERAIS";
        cod = objConexao.getIndCod(select, campo, cod);
        
        cod -=1;
     
        return cod;
    }
    
    public static String getPers(int cod){
        tabela = "CP_INF_GERAIS";
        indCod = "INF_INDCOD";
        campo = "INF_PER";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        
        String perspectiva;
        
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        perspectiva = objConexao.getBD(select, campo);

        return perspectiva;
    }
    
    public static String getCalculo(int calcCod){
        tabela = "CP_META_CHK";
        indCod = "CHK_INDCOD";
        
        String aux;
        String calculo = "";
        
        campo = "CHK_MAIMEL";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + calcCod;
        aux = Info.objConexao.getBD(select, campo);
        if(aux != null){
            if(!aux.equals("false")){
                calculo = campo;
            }
        }
        
        campo = "CHK_MENMEL";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + calcCod;
        aux = Info.objConexao.getBD(select, campo);
        if(aux != null){
            if(!aux.equals("false")){
                calculo = campo;
            }
        }
        
        campo = "CHK_MENMAI";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + calcCod;
        aux = Info.objConexao.getBD(select, campo);
        if(aux != null){
            if(!aux.equals("false")){
                calculo = campo;
            }
        }
        
        campo = "CHK_MAIMEN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + calcCod;
        aux = Info.objConexao.getBD(select, campo);
        if(aux != null){
            if(!aux.equals("false")){
                calculo = campo;
            }
        }

        return calculo;
    }
    @SuppressWarnings("unchecked")
    public static void openReport(String titulo, InputStream inputstream, Map parametros, Connection conexao) throws JRException{
        JasperPrint print;
        print = JasperFillManager.fillReport(inputstream, parametros, conexao);
        
        viewReportFrame(titulo, print);
    }
    
    public static void viewReportFrame(String titulo, JasperPrint print){
        JRViewer viewer = new JRViewer(print);
        
        JFrame frameRelatorio = new JFrame(titulo);
        
        frameRelatorio.add(viewer, BorderLayout.CENTER);
        frameRelatorio.setSize(500, 500);
        //frameRelatorio.setExtendedState(WIDTH);
        frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameRelatorio.setVisible(true);
    }
}
