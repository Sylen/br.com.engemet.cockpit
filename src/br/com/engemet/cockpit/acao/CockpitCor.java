package br.com.engemet.cockpit.acao;

import java.awt.Color;

public class CockpitCor{

    private static Color perspectivaPreto;
    private static Color perspectivaVerde;
    private static Color perspectivaAzul;
    private static Color perspectivaBranco;
    private static Color graficoPreto;
    private static Color graficoVerde;
    private static Color graficoLinhaVerde;
    private static Color graficoAzul;
    private static Color graficoVermelho;
    private static Color graficoCinza;

    public static Color getPerspectivaPreto(){
        perspectivaPreto = new Color(0, 0, 0);
        return perspectivaPreto;
    }

    public static Color getPerspectivaVerde(){
        perspectivaVerde = new Color(0, 102, 0);
        return perspectivaVerde;
    }

    public static Color getPerspectivaAzul(){
        perspectivaAzul = new Color(0, 0, 204);
        return perspectivaAzul;
    }

    public static Color getPerspectivaBranco(){
        perspectivaBranco = new Color(255, 255, 255);
        return perspectivaBranco;
    }
    
    public static Color getGraficoPreto(){
        graficoPreto = new Color(0, 0, 0);
        return graficoPreto;
    }
    
    public static Color getGraficoVerde(){
        graficoVerde = new Color(85, 107, 47);
        return graficoVerde;
    }
    
    public static Color getGraficoLinhaVerde(){
        graficoVerde = new Color(0, 176, 80);
        return graficoLinhaVerde;
    }

    public static Color getGraficoAzul(){
        graficoAzul = new Color(79, 129, 189);
        return graficoAzul;
    }

    public static Color getGraficoVermelho(){
        graficoVermelho = new Color(200, 0, 0);
        return graficoVermelho;
    }

    public static Color getGraficoCinza(){
        graficoCinza = new Color(128, 128, 128);
        return graficoCinza;
    }

}
