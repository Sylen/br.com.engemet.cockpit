package br.com.engemet.cockpit.acao;

import br.com.engemet.cockpit.telas.Graficos;
import br.com.engemet.cockpit.telas.Info;
import br.com.engemet.cockpit.telas.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AcaoBotaoCockpit implements ActionListener{

    private Graficos grafico = new Graficos();
    private String perspectiva;
    private int painel;
    private int posicao;
    private int aux;
    private String campo;
    private String tabela;
    private String select;
    private String indCod;
    private String codTab;
    private boolean valPer;
    private String[] valMeta = new String[12];
    private String[] acuMeta = new String[12];
    private String[] convertValMeta = new String[12];
    private String[] convertAcuMeta = new String[12];
    private String[] valReal = new String[12];
    private String[] acuReal = new String[12];
    private String[] convertValReal = new String[12];
    private String[] convertAcuReal = new String[12];
    private double[] desvAcu = new double[12];
    private double[] desvPerAcu = new double[12];
    private String[] convertDesvAcu = new String[12];
    private String[] convertDesvPerAcu = new String[12];
    private double[] desvMen = new double[12];
    private double[] desvPerMen = new double[12];
    private String[] convertDesvMen = new String[12];
    private String[] convertDesvPerMen = new String[12];
    private String[] valHis = new String[12];
    private String[] acuHis = new String[12];
    private String[] convertValHis = new String[12];
    private String[] convertAcuHis = new String[12];
    private String[] valFor = new String[12];
    private String[] acuFor = new String[12];
    private String[] convertValFor = new String[12];
    private String[] convertAcuFor = new String[12];
    private String[] valIde = new String[12];
    private String[] acuIde = new String[12];
    private String[] convertValIde = new String[12];
    private String[] convertAcuIde = new String[12];
    private String respMeta;
    private String indicador;
    private String nomeInd;
    private int cod;
    private String[] strFlecha = {"cima", "meio", "baixo"};

    public AcaoBotaoCockpit(){
        Info.acaoBotaoCockpit = this;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JButton btns = (JButton) e.getSource();

        for(int i = 0; i < 6; i++){
            if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn1Financas[i])){
                perspectiva = "Finanças";
                painel = 1;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn2Financas[i])){
                perspectiva = "Finanças";
                painel = 2;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn3Financas[i])){
                perspectiva = "Finanças";
                painel = 3;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn4Financas[i])){
                perspectiva = "Finanças";
                painel = 4;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn5Financas[i])){
                perspectiva = "Finanças";
                painel = 5;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn6Financas[i])){
                perspectiva = "Finanças";
                painel = 6;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn1Clientes[i])){
                perspectiva = "Clientes";
                painel = 1;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn2Clientes[i])){
                perspectiva = "Clientes";
                painel = 2;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn3Clientes[i])){
                perspectiva = "Clientes";
                painel = 3;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn4Clientes[i])){
                perspectiva = "Clientes";
                painel = 4;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn5Clientes[i])){
                perspectiva = "Clientes";
                painel = 5;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn6Clientes[i])){
                perspectiva = "Clientes";
                painel = 6;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn1Processos[i])){
                perspectiva = "Processos";
                painel = 1;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn2Processos[i])){
                perspectiva = "Processos";
                painel = 2;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn3Processos[i])){
                perspectiva = "Processos";
                painel = 3;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn4Processos[i])){
                perspectiva = "Processos";
                painel = 4;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn5Processos[i])){
                perspectiva = "Processos";
                painel = 5;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn6Processos[i])){
                perspectiva = "Processos";
                painel = 6;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn1PGT[i])){
                perspectiva = "PGT";
                painel = 1;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn2PGT[i])){
                perspectiva = "PGT";
                painel = 2;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn3PGT[i])){
                perspectiva = "PGT";
                painel = 3;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn4PGT[i])){
                perspectiva = "PGT";
                painel = 4;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn5PGT[i])){
                perspectiva = "PGT";
                painel = 5;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }else if(btns.getActionCommand().equals(CockpitStrings.indicadoresPn6PGT[i])){
                perspectiva = "PGT";
                painel = 6;
                posicao = (i + 1);
                cod = Info.getCodGrafico(perspectiva, painel, posicao);
                Info.telaPrincipal.setStatusGrafico(perspectiva, painel, posicao);
                Info.cod = cod;
                setGrafico(cod);
            }
            
        }
    }

    private void setGraficoMeta(String[] valMeta, String[] acuMeta, String[] convertValMeta, String[] convertAcuMeta, int cod){
        tabela = "CP_META";
        indCod = "MET_INDCOD";
        codTab = "MET_COD";

        campo = "MET_VAL";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            valMeta[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        campo = "MET_VALACU";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            acuMeta[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValMeta[i] = Info.absoluto.format(Float.parseFloat(valMeta[i].replace(",", ".")));
                convertAcuMeta[i] = Info.absoluto.format(Float.parseFloat(acuMeta[i].replace(",", ".")));
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValMeta[i] = Info.percentual.format(Float.parseFloat(valMeta[i].replace(",", ".")));
                convertAcuMeta[i] = Info.percentual.format(Float.parseFloat(acuMeta[i].replace(",", ".")));
            }
        }
    }

    private void setGraficoReal(String[] valReal, String[] acuReal, String[] convertValReal, String[] convertAcuReal, int cod){
        tabela = "CP_VAL_REAIS";
        indCod = "VAL_INDCOD";
        codTab = "VAL_COD";

        campo = "VAL_VAL";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            valReal[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        campo = "VAL_VALACU";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            acuReal[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValReal[i] = Info.absoluto.format(Float.parseFloat(valReal[i].replace(",", ".")));
                convertAcuReal[i] = Info.absoluto.format(Float.parseFloat(acuReal[i].replace(",", ".")));
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValReal[i] = Info.percentual.format(Float.parseFloat(valReal[i].replace(",", ".")));
                convertAcuReal[i] = Info.percentual.format(Float.parseFloat(acuReal[i].replace(",", ".")));
            }
        }
    }

    private void setGraficoDesvAcu(double[] desvAcu, double[] desvPerAcu, String[] convertDesvAcu, String[] convertDesvPerAcu, int cod){
        Info.data = Info.cal.get(Calendar.MONTH);

        double a[] = new double[12];
        double b[] = new double[12];

        for(int i = 0; i < 12; i++){
            a[i] = Float.parseFloat(acuReal[i].replace(",", "."));
            b[i] = Float.parseFloat(acuMeta[i].replace(",", "."));
        }

        for(int i = 0; i < Info.data; i++){
            desvAcu[i] = a[i] - b[i];
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertDesvAcu[i] = Info.absoluto.format(desvAcu[i]);
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertDesvAcu[i] = Info.percentual.format(desvAcu[i]);
            }
        }

        for(int i = 0; i < Info.data; i++){
            if(a[i] >= 0 && b[i] < 0){
                desvPerAcu[i] = (a[i] / b[i] - 1) * - 1;
            }else if(a[i] > 0 && b[i] == 0){
                desvPerAcu[i] = 0;
            }else if(a[i] < 0 && b[i] < 0){
                desvPerAcu[i] = (a[i] / b[i] - 1) * - 1;
            }else if(a[i] < 0 || b[i] > 0){
                desvPerAcu[i] = (a[i] / b[i] - 1);
            }else if(a[i] == 0 && b[i] == 0){
                desvPerAcu[i] = 0;
            }else{
                desvPerAcu[i] = (a[i] / b[i] - 1);
            }
        }

        Info.percentual.setMaximumFractionDigits(2);
        for(int i = 0; i < 12; i++){
            convertDesvPerAcu[i] = Info.percentual.format(desvPerAcu[i]);
        }
    }

    private void setGraficoDesvMen(double[] desvMen, double[] desvPerMen, String[] convertDesvMen, String[] convertDesvPerMen, int cod){
        Info.data = Info.cal.get(Calendar.MONTH);

        double a[] = new double[12];
        double b[] = new double[12];

        for(int i = 0; i < 12; i++){
            a[i] = Float.parseFloat(valReal[i].replace(",", "."));
            b[i] = Float.parseFloat(valMeta[i].replace(",", "."));
        }

        for(int i = 0; i < Info.data; i++){
            desvMen[i] = a[i] - b[i];
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertDesvMen[i] = Info.absoluto.format(desvMen[i]);
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertDesvMen[i] = Info.percentual.format(desvMen[i]);
            }
        }

        for(int i = 0; i < Info.data; i++){
            if(a[i] >= 0 && b[i] < 0){
                desvPerMen[i] = (a[i] / b[i] - 1) * - 1;
            }else if(a[i] > 0 && b[i] == 0){
                desvPerMen[i] = 0;
            }else if(a[i] < 0 && b[i] < 0){
                desvPerMen[i] = (a[i] / b[i] - 1) * - 1;
            }else if(a[i] < 0 || b[i] > 0){
                desvPerMen[i] = (a[i] / b[i] - 1);
            }else if(a[i] == 0 && b[i] == 0){
                desvPerMen[i] = 0;
            }else{
                desvPerMen[i] = (a[i] / b[i] - 1);
            }
        }

        Info.percentual.setMaximumFractionDigits(2);
        for(int i = 0; i < 12; i++){
            convertDesvPerMen[i] = Info.percentual.format(desvPerMen[i]);
        }
    }

    public void setFlecha(double[] desvMen, double[] desvPerMen){
        Info.data = Info.cal.get(Calendar.MONTH);

        double a[] = new double[12];
        String calculo;

        calculo = Info.getCalculo(cod);

        if(calculo.equals("CHK_MAIMEL")){
            a[0] = desvPerMen[0];
            for(int i = 1; i < Info.data; i++){
                if(desvPerMen[i] >= 0 && desvPerMen[i - 1] < 0){
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]) * - 1;

                }else if(desvPerMen[i] < 0 && desvPerMen[i - 1] < 0){
                    a[i] = ((desvPerMen[i] / desvPerMen[i - 1]) - 1) * - 1;

                }else if(desvPerMen[i] < 0 && desvPerMen[i - 1] == 0){
                    a[i] = 0;

                }else if(desvPerMen[i] < 0 || desvPerMen[i - 1] > 0){
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]);

                }else if(desvPerMen[i] == 0 && desvPerMen[i - 1] == 0){
                    a[i] = 0;

                }else{
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]) - 1;
                }
            }
            for(int i = 0; i < Info.data; i++){
                if(i == 0){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJan(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJan(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaJan(strFlecha[2]);
                    }
                }else if(i == 1){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaFev(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaFev(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaFev(strFlecha[2]);
                    }
                }else if(i == 2){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaMar(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaMar(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaMar(strFlecha[2]);
                    }
                }else if(i == 3){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaAbr(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaAbr(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaAbr(strFlecha[2]);
                    }
                }else if(i == 4){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaMai(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaMai(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaMai(strFlecha[2]);
                    }
                }else if(i == 5){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJun(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJun(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaJun(strFlecha[2]);
                    }
                }else if(i == 6){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJul(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJul(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaJul(strFlecha[2]);
                    }
                }else if(i == 7){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaAgo(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaAgo(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaAgo(strFlecha[2]);
                    }
                }else if(i == 8){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaSet(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaSet(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaSet(strFlecha[2]);
                    }
                }else if(i == 9){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaOut(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaOut(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaOut(strFlecha[2]);
                    }
                }else if(i == 10){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaNov(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaNov(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaNov(strFlecha[2]);
                    }
                }else if(i == 11){
                    if(a[i] >= 0.05){
                        Info.graficos.setLblTendenciaDez(strFlecha[0]);
                    }else if(a[i] < 0.05 && a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaDez(strFlecha[1]);
                    }else if(a[i] < (-0.05)){
                        Info.graficos.setLblTendenciaDez(strFlecha[2]);
                    }
                }
            }
        }else if(calculo.equals("CHK_MENMEL")){
            a[0] = desvPerMen[0];
            for(int i = 1; i < Info.data; i++){
                if(desvPerMen[i] >= 0 && desvPerMen[i - 1] < 0){
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]) * - 1;

                }else if(desvPerMen[i] < 0 && desvPerMen[i - 1] < 0){
                    a[i] = ((desvPerMen[i] / desvPerMen[i - 1]) - 1) * - 1;

                }else if(desvPerMen[i] < 0 && desvPerMen[i - 1] == 0){
                    a[i] = 0;

                }else if(desvPerMen[i] < 0 || desvPerMen[i - 1] > 0){
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]);

                }else if(desvPerMen[i] == 0 && desvPerMen[i - 1] == 0){
                    a[i] = 0;

                }else{
                    a[i] = (desvPerMen[i] / desvPerMen[i - 1]) - 1;
                }
            }
            for(int i = 0; i < Info.data; i++){
                if(i == 0){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJan(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJan(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaJan(strFlecha[2]);
                    }
                }else if(i == 1){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaFev(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaFev(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaFev(strFlecha[2]);
                    }
                }else if(i == 2){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaMar(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaMar(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaMar(strFlecha[2]);
                    }
                }else if(i == 3){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaAbr(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaAbr(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaAbr(strFlecha[2]);
                    }
                }else if(i == 4){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaMai(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaMai(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaMai(strFlecha[2]);
                    }
                }else if(i == 5){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJun(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJun(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaJun(strFlecha[2]);
                    }
                }else if(i == 6){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaJul(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaJul(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaJul(strFlecha[2]);
                    }
                }else if(i == 7){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaAgo(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaAgo(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaAgo(strFlecha[2]);
                    }
                }else if(i == 8){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaSet(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaSet(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaSet(strFlecha[2]);
                    }
                }else if(i == 9){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaOut(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaOut(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaOut(strFlecha[2]);
                    }
                }else if(i == 10){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaNov(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaNov(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaNov(strFlecha[2]);
                    }
                }else if(i == 11){
                    if(a[i] >= (-0.05)){
                        Info.graficos.setLblTendenciaDez(strFlecha[0]);
                    }else if(a[i] < (-0.05) && a[i] >= 0.05){
                        Info.graficos.setLblTendenciaDez(strFlecha[1]);
                    }else if(a[i] < 0.05){
                        Info.graficos.setLblTendenciaDez(strFlecha[2]);
                    }
                }
            }
        }
    }

    public void setGraficoHistorico(String[] valHis, String[] acuHis, String[] convertValHis, String[] convertAcuHis, int cod){
        tabela = "CP_HISTORICO";
        indCod = "HIS_INDCOD";
        codTab = "HIS_COD";

        campo = "HIS_VAL";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            valHis[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        campo = "HIS_VALACU";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            acuHis[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValHis[i] = Info.absoluto.format(Float.parseFloat(valHis[i].replace(",", ".")));
                convertAcuHis[i] = Info.absoluto.format(Float.parseFloat(acuHis[i].replace(",", ".")));
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValHis[i] = Info.percentual.format(Float.parseFloat(valHis[i].replace(",", ".")));
                convertAcuHis[i] = Info.percentual.format(Float.parseFloat(acuHis[i].replace(",", ".")));
            }
        }
    }
    
    public void setGraficoForecast(String[] valFor, String[] acuFor, String[] convertValFor, String[] convertAcuFor, int cod){
        tabela = "CP_FORECAST";
        indCod = "FOR_INDCOD";
        codTab = "FOR_COD";

        campo = "FOR_VAL";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            valFor[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        campo = "FOR_VALACU";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            acuFor[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValFor[i] = Info.absoluto.format(Float.parseFloat(valFor[i].replace(",", ".")));
                convertAcuFor[i] = Info.absoluto.format(Float.parseFloat(acuFor[i].replace(",", ".")));
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValFor[i] = Info.percentual.format(Float.parseFloat(valFor[i].replace(",", ".")));
                convertAcuFor[i] = Info.percentual.format(Float.parseFloat(acuFor[i].replace(",", ".")));
            }
        }
    }
    
    public void setGraficoValorIdeal(String[] valIde, String[] acuIde, String[] convertValIde, String[] convertAcuIde, int cod){
        tabela = "CP_VAL_IDEAIS";
        indCod = "IDE_INDCOD";
        codTab = "IDE_COD";

        campo = "IDE_VAL";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            valIde[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        campo = "IDE_VALACU";
        for(int i = 0; i < 12; i++){
            Info.codTb = (i + 1);

            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + Info.codTb;
            acuIde[i] = Info.objConexao.getBD(select, campo).replace(".", ",");
        }

        tabela = "CP_TIP_GRAFICO";
        campo = "GRA_NUMPER";
        indCod = "GRA_INDCOD";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        valPer = Boolean.parseBoolean(Info.objConexao.getBD(select, campo));
        if(valPer != true){
            Info.absoluto.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValIde[i] = Info.absoluto.format(Float.parseFloat(valIde[i].replace(",", ".")));
                convertAcuIde[i] = Info.absoluto.format(Float.parseFloat(acuIde[i].replace(",", ".")));
            }
        }else{
            Info.percentual.setMaximumFractionDigits(2);
            for(int i = 0; i < 12; i++){
                convertValIde[i] = Info.percentual.format(Float.parseFloat(valIde[i].replace(",", ".")));
                convertAcuIde[i] = Info.percentual.format(Float.parseFloat(acuIde[i].replace(",", ".")));
            }
        }
    }

    public void setGrafico(int cod){
        setGraficoMeta(valMeta, acuMeta, convertValMeta, convertAcuMeta, cod);
        setGraficoReal(valReal, acuReal, convertValReal, convertAcuReal, cod);
        setGraficoDesvMen(desvMen, desvPerMen, convertDesvMen, convertDesvPerMen, cod);
        setGraficoDesvAcu(desvAcu, desvPerAcu, convertDesvAcu, convertDesvPerAcu, cod);
        //setGraficoHistorico(valHis, acuHis, convertValHis, convertAcuHis, cod);
        setFlecha(desvMen, desvPerMen);
        
        Info.setHistoricoInfo(cod);
        
        if(Info.verificarHis != false){
            setGraficoHistorico(valHis, acuHis, convertValHis, convertAcuHis, cod);
        }else{
            for(int i = 0; i < 12; i++){
                convertValHis[i] = "";
                convertAcuHis[i] = "";
            }
        }
        
        Info.setForecastInfo(cod);
        
        if(Info.verificarFor != false){
            setGraficoForecast(valFor, acuFor, convertValFor, convertAcuFor, cod);
        }else{
            for(int i = 0; i < 12; i++){
                convertValFor[i] = "";
                convertAcuFor[i] = "";
            }
        }
        
        Info.setValorIdealInfo(cod);
        
        if(Info.verificarIde != false){
            setGraficoValorIdeal(valIde, acuIde, convertValIde, convertAcuIde, cod);
        }else{
            for(int i = 0; i < 12; i++){
                convertValIde[i] = "";
                convertAcuIde[i] = "";
            }
        }

        grafico.setTxtMenMetaJan(convertValMeta[0]);
        grafico.setTxtMenMetaFev(convertValMeta[1]);
        grafico.setTxtMenMetaMar(convertValMeta[2]);
        grafico.setTxtMenMetaAbr(convertValMeta[3]);
        grafico.setTxtMenMetaMai(convertValMeta[4]);
        grafico.setTxtMenMetaJun(convertValMeta[5]);
        grafico.setTxtMenMetaJul(convertValMeta[6]);
        grafico.setTxtMenMetaAgo(convertValMeta[7]);
        grafico.setTxtMenMetaSet(convertValMeta[8]);
        grafico.setTxtMenMetaOut(convertValMeta[9]);
        grafico.setTxtMenMetaNov(convertValMeta[10]);
        grafico.setTxtMenMetaDez(convertValMeta[10]);

        grafico.setTxtAcumMetaJan(convertAcuMeta[0]);
        grafico.setTxtAcumMetaFev(convertAcuMeta[1]);
        grafico.setTxtAcumMetaMar(convertAcuMeta[2]);
        grafico.setTxtAcumMetaAbr(convertAcuMeta[3]);
        grafico.setTxtAcumMetaMai(convertAcuMeta[4]);
        grafico.setTxtAcumMetaJun(convertAcuMeta[5]);
        grafico.setTxtAcumMetaJul(convertAcuMeta[6]);
        grafico.setTxtAcumMetaAgo(convertAcuMeta[7]);
        grafico.setTxtAcumMetaSet(convertAcuMeta[8]);
        grafico.setTxtAcumMetaOut(convertAcuMeta[9]);
        grafico.setTxtAcumMetaNov(convertAcuMeta[10]);
        grafico.setTxtAcumMetaDez(convertAcuMeta[11]);

        grafico.setTxtMenRealJan(convertValReal[0]);
        grafico.setTxtMenRealFev(convertValReal[1]);
        grafico.setTxtMenRealMar(convertValReal[2]);
        grafico.setTxtMenRealAbr(convertValReal[3]);
        grafico.setTxtMenRealMai(convertValReal[4]);
        grafico.setTxtMenRealJun(convertValReal[5]);
        grafico.setTxtMenRealJul(convertValReal[6]);
        grafico.setTxtMenRealAgo(convertValReal[7]);
        grafico.setTxtMenRealSet(convertValReal[8]);
        grafico.setTxtMenRealOut(convertValReal[9]);
        grafico.setTxtMenRealNov(convertValReal[10]);
        grafico.setTxtMenRealDez(convertValReal[11]);

        String compara = acuReal[0];
        int aux = 1;
        for(int i = 1; i < 12; i++){
            if(acuReal[i].equals(compara)){
                acuReal[i] = "0";
            }else{
                compara = acuReal[aux];
                aux++;
            }
        }

        grafico.setTxtAcumRealJan(convertAcuReal[0]);
        grafico.setTxtAcumRealFev(convertAcuReal[1]);
        grafico.setTxtAcumRealMar(convertAcuReal[2]);
        grafico.setTxtAcumRealAbr(convertAcuReal[3]);
        grafico.setTxtAcumRealMai(convertAcuReal[4]);
        grafico.setTxtAcumRealJun(convertAcuReal[5]);
        grafico.setTxtAcumRealJul(convertAcuReal[6]);
        grafico.setTxtAcumRealAgo(convertAcuReal[7]);
        grafico.setTxtAcumRealSet(convertAcuReal[8]);
        grafico.setTxtAcumRealOut(convertAcuReal[9]);
        grafico.setTxtAcumRealNov(convertAcuReal[10]);
        grafico.setTxtAcumRealDez(convertAcuReal[11]);

        grafico.setTxtMenDesvJan(convertDesvMen[0]);
        grafico.setTxtMenDesvFev(convertDesvMen[1]);
        grafico.setTxtMenDesvMar(convertDesvMen[2]);
        grafico.setTxtMenDesvAbr(convertDesvMen[3]);
        grafico.setTxtMenDesvMai(convertDesvMen[4]);
        grafico.setTxtMenDesvJun(convertDesvMen[5]);
        grafico.setTxtMenDesvJul(convertDesvMen[6]);
        grafico.setTxtMenDesvAgo(convertDesvMen[7]);
        grafico.setTxtMenDesvSet(convertDesvMen[8]);
        grafico.setTxtMenDesvOut(convertDesvMen[9]);
        grafico.setTxtMenDesvNov(convertDesvMen[10]);
        grafico.setTxtMenDesvDez(convertDesvMen[11]);

        grafico.setTxtMenDesvPerJan(convertDesvPerMen[0]);
        grafico.setTxtMenDesvPerFev(convertDesvPerMen[1]);
        grafico.setTxtMenDesvPerMar(convertDesvPerMen[2]);
        grafico.setTxtMenDesvPerAbr(convertDesvPerMen[3]);
        grafico.setTxtMenDesvPerMai(convertDesvPerMen[4]);
        grafico.setTxtMenDesvPerJun(convertDesvPerMen[5]);
        grafico.setTxtMenDesvPerJul(convertDesvPerMen[6]);
        grafico.setTxtMenDesvPerAgo(convertDesvPerMen[7]);
        grafico.setTxtMenDesvPerSet(convertDesvPerMen[8]);
        grafico.setTxtMenDesvPerOut(convertDesvPerMen[9]);
        grafico.setTxtMenDesvPerNov(convertDesvPerMen[10]);
        grafico.setTxtMenDesvPerDez(convertDesvPerMen[11]);

        grafico.setTxtAcumDesvJan(convertDesvAcu[0]);
        grafico.setTxtAcumDesvFev(convertDesvAcu[1]);
        grafico.setTxtAcumDesvMar(convertDesvAcu[2]);
        grafico.setTxtAcumDesvAbr(convertDesvAcu[3]);
        grafico.setTxtAcumDesvMai(convertDesvAcu[4]);
        grafico.setTxtAcumDesvJun(convertDesvAcu[5]);
        grafico.setTxtAcumDesvJul(convertDesvAcu[6]);
        grafico.setTxtAcumDesvAgo(convertDesvAcu[7]);
        grafico.setTxtAcumDesvSet(convertDesvAcu[8]);
        grafico.setTxtAcumDesvOut(convertDesvAcu[9]);
        grafico.setTxtAcumDesvNov(convertDesvAcu[10]);
        grafico.setTxtAcumDesvDez(convertDesvAcu[11]);

        grafico.setTxtAcumDesvPerJan(convertDesvPerAcu[0]);
        grafico.setTxtAcumDesvPerFev(convertDesvPerAcu[1]);
        grafico.setTxtAcumDesvPerMar(convertDesvPerAcu[2]);
        grafico.setTxtAcumDesvPerAbr(convertDesvPerAcu[3]);
        grafico.setTxtAcumDesvPerMai(convertDesvPerAcu[4]);
        grafico.setTxtAcumDesvPerJun(convertDesvPerAcu[5]);
        grafico.setTxtAcumDesvPerJul(convertDesvPerAcu[6]);
        grafico.setTxtAcumDesvPerAgo(convertDesvPerAcu[7]);
        grafico.setTxtAcumDesvPerSet(convertDesvPerAcu[8]);
        grafico.setTxtAcumDesvPerOut(convertDesvPerAcu[9]);
        grafico.setTxtAcumDesvPerNov(convertDesvPerAcu[10]);
        grafico.setTxtAcumDesvPerDez(convertDesvPerAcu[11]);

        grafico.setTxtMenRealHisJan(convertValHis[0]);
        grafico.setTxtMenRealHisFev(convertValHis[1]);
        grafico.setTxtMenRealHisMar(convertValHis[2]);
        grafico.setTxtMenRealHisAbr(convertValHis[3]);
        grafico.setTxtMenRealHisMai(convertValHis[4]);
        grafico.setTxtMenRealHisJun(convertValHis[5]);
        grafico.setTxtMenRealHisJul(convertValHis[6]);
        grafico.setTxtMenRealHisAgo(convertValHis[7]);
        grafico.setTxtMenRealHisSet(convertValHis[8]);
        grafico.setTxtMenRealHisOut(convertValHis[9]);
        grafico.setTxtMenRealHisNov(convertValHis[10]);
        grafico.setTxtMenRealHisDez(convertValHis[11]);

        grafico.setTxtAcumRealHisJan(convertAcuHis[0]);
        grafico.setTxtAcumRealHisFev(convertAcuHis[1]);
        grafico.setTxtAcumRealHisMar(convertAcuHis[2]);
        grafico.setTxtAcumRealHisAbr(convertAcuHis[3]);
        grafico.setTxtAcumRealHisMai(convertAcuHis[4]);
        grafico.setTxtAcumRealHisJun(convertAcuHis[5]);
        grafico.setTxtAcumRealHisJul(convertAcuHis[6]);
        grafico.setTxtAcumRealHisAgo(convertAcuHis[7]);
        grafico.setTxtAcumRealHisSet(convertAcuHis[8]);
        grafico.setTxtAcumRealHisOut(convertAcuHis[9]);
        grafico.setTxtAcumRealHisNov(convertAcuHis[10]);
        grafico.setTxtAcumRealHisDez(convertAcuHis[11]);

        grafico.setTxtMenForcJan(convertValFor[0]);
        grafico.setTxtMenForcFev(convertValFor[1]);
        grafico.setTxtMenForcMar(convertValFor[2]);
        grafico.setTxtMenForcAbr(convertValFor[3]);
        grafico.setTxtMenForcMai(convertValFor[4]);
        grafico.setTxtMenForcJun(convertValFor[5]);
        grafico.setTxtMenForcJul(convertValFor[6]);
        grafico.setTxtMenForcAgo(convertValFor[7]);
        grafico.setTxtMenForcSet(convertValFor[8]);
        grafico.setTxtMenForcOut(convertValFor[9]);
        grafico.setTxtMenForcNov(convertValFor[10]);
        grafico.setTxtMenForcDez(convertValFor[11]);

        grafico.setTxtAcumForcJan(convertAcuFor[0]);
        grafico.setTxtAcumForcFev(convertAcuFor[1]);
        grafico.setTxtAcumForcMar(convertAcuFor[2]);
        grafico.setTxtAcumForcAbr(convertAcuFor[3]);
        grafico.setTxtAcumForcMai(convertAcuFor[4]);
        grafico.setTxtAcumForcJun(convertAcuFor[5]);
        grafico.setTxtAcumForcJul(convertAcuFor[6]);
        grafico.setTxtAcumForcAgo(convertAcuFor[7]);
        grafico.setTxtAcumForcSet(convertAcuFor[8]);
        grafico.setTxtAcumForcOut(convertAcuFor[9]);
        grafico.setTxtAcumForcNov(convertAcuFor[10]);
        grafico.setTxtAcumForcDez(convertAcuFor[11]);
        
        grafico.setTxtMenIdealJan(convertValIde[0]);
        grafico.setTxtMenIdealFev(convertValIde[1]);
        grafico.setTxtMenIdealMar(convertValIde[2]);
        grafico.setTxtMenIdealAbr(convertValIde[3]);
        grafico.setTxtMenIdealMai(convertValIde[4]);
        grafico.setTxtMenIdealJun(convertValIde[5]);
        grafico.setTxtMenIdealJul(convertValIde[6]);
        grafico.setTxtMenIdealAgo(convertValIde[7]);
        grafico.setTxtMenIdealSet(convertValIde[8]);
        grafico.setTxtMenIdealOut(convertValIde[9]);
        grafico.setTxtMenIdealNov(convertValIde[10]);
        grafico.setTxtMenIdealDez(convertValIde[11]);

        grafico.setTxtAcumIdealJan(convertAcuIde[0]);
        grafico.setTxtAcumIdealFev(convertAcuIde[1]);
        grafico.setTxtAcumIdealMar(convertAcuIde[2]);
        grafico.setTxtAcumIdealAbr(convertAcuIde[3]);
        grafico.setTxtAcumIdealMai(convertAcuIde[4]);
        grafico.setTxtAcumIdealJun(convertAcuIde[5]);
        grafico.setTxtAcumIdealJul(convertAcuIde[6]);
        grafico.setTxtAcumIdealAgo(convertAcuIde[7]);
        grafico.setTxtAcumIdealSet(convertAcuIde[8]);
        grafico.setTxtAcumIdealOut(convertAcuIde[9]);
        grafico.setTxtAcumIdealNov(convertAcuIde[10]);
        grafico.setTxtAcumIdealDez(convertAcuIde[11]);
        
        
        grafico.setLblResponsavel2(getRespMeta(respMeta, cod));
        grafico.setLblIndicador2(getIndicador(indicador, cod));
        grafico.setGraficoEvoAcum();
        grafico.setGraficoEvoMen();
        grafico.setGraficoDesvPerc();
        grafico.setGraficoDesvAbs();

        grafico.setBounds(5, 5, 1270, 730);

        if(grafico.getComponents() != (null)){
            Principal.Frame.remove(grafico);
            Principal.Frame.remove(Info.mapaEstrategico);
        }

        Principal.Frame.add(grafico);
        Info.telaPrincipal.validate();
        Info.telaPrincipal.repaint();

    }

    public String getMetaAcu(int mes){
        return acuMeta[mes].replace(",", ".");
    }

    public String getRealAcu(int mes){
        return acuReal[mes].replace(",", ".");
    }

    public String getMetaMen(int mes){
        return valMeta[mes].replace(",", ".");
    }

    public String getRealMen(int mes){
        return valReal[mes].replace(",", ".");
    }

    public String getDesvPer(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(desvPerMen[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getDesvAbs(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(desvMen[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getHistoricoMen(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(valHis[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getHistoricoAcu(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(acuHis[mes]);
        return trans[mes].replace(",", ".");
    }
    
    public String getForecastMen(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(valFor[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getForecastAcu(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(acuFor[mes]);
        return trans[mes].replace(",", ".");
    }
    
    public String getValorIdealMen(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(valIde[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getValorIdealAcu(int mes){
        String[] trans = new String[12];

        trans[mes] = String.valueOf(acuIde[mes]);
        return trans[mes].replace(",", ".");
    }

    public String getRespMeta(String respMeta, int cod){
        tabela = "CP_INF_GERAIS";
        indCod = "INF_INDCOD";
        campo = "INF_RESMET";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        respMeta = Info.objConexao.getBD(select, campo);

        return respMeta;
    }
    
    public String getNomeInd(String nomeInd, int cod){
        tabela = "CP_INF_GERAIS";
        indCod = "INF_INDCOD";
        campo = "INF_INDDES";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        nomeInd = Info.objConexao.getBD(select, campo);

        return nomeInd;
    }

    public String getIndicador(String indicador, int cod){
        tabela = "CP_INF_GERAIS";
        indCod = "INF_INDCOD";
        campo = "INF_INDDES";

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        indicador = Info.objConexao.getBD(select, campo);

        return indicador;
    }

}
