package br.com.engemet.cockpit.acao;

import br.com.engemet.cockpit.telas.Info;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class CalculoStatus{

    private double vermelhao, vermelho, amarelo, verde, verdao;
    private double[] valor = new double[5];
    private int aux;
    private String tabela, campo, select, insert, indCod, codTab, strPainel, strPosicao, strPerspectiva;
    private String[] strCor = {"Vermelhao", "Vermelho", "Amarelo", "Verde", "Verdao"};
    private String[] strMes = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};

    public CalculoStatus(){
        Info.calculoStatus = this;
    }

    public double getMetaAcu(int cod, int mes){
        tabela = "CP_META";
        campo = "MET_VALACU";
        indCod = "MET_INDCOD";
        codTab = "MET_COD";

        double[] metaAcu;
        metaAcu = new double[12];

        //for(int i = 0; i < cod; i++){
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + (cod) + " AND " + codTab + " = " + (mes + 1);
        metaAcu[(mes)] = Double.parseDouble(Info.objConexao.getBD(select, campo).replace(",", "."));
        //}
        return metaAcu[mes];
    }

    public double getRealAcu(int cod, int mes){
        tabela = "CP_VAL_REAIS";
        campo = "VAL_VALACU";
        indCod = "VAL_INDCOD";
        codTab = "VAL_COD";

        double[] realAcu;
        realAcu = new double[12];

        //for(int i = 0; i < cod; i++){
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + (cod) + " AND " + codTab + " = " + (mes + 1);
        realAcu[(mes)] = Double.parseDouble(Info.objConexao.getBD(select, campo).replace(",", "."));
        //}
        return realAcu[mes];
    }

    public void setMaiorMelhor(double meta, double real, int cod, int mes){
        tabela = "CP_CORES";
        campo = "COR_INDCOD";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";

        int ano = Info.cal.get(Calendar.YEAR);

        vermelhao = 0.75;
        vermelho = 0.95;
        amarelo = 1;
        verde = 1.2;
        verdao = 1.2;

        int cor = 0;

        for(int j = 0; j < 5; j++){
            valor[j] = meta;
        }
        valor[0] *= vermelhao;
        valor[1] *= vermelho;
        valor[2] *= amarelo;
        valor[3] *= verde;
        valor[4] *= verdao;

        if(real <= valor[0]){
            cor = 0;
        }else if(real <= valor[1]){
            cor = 1;
        }else if(real <= valor[2]){
            cor = 2;
        }else if(real <= valor[3]){
            cor = 3;
        }else if(real >= valor[4]){
            cor = 4;
        }

        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            campo = "COR_NOM";
            insert = "INSERT INTO " + tabela + " (" + indCod + ", " + codTab + ") values (" + cod + ", " + (mes + 1) + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strCor[cor] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_MESREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strMes[mes] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_ANOREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = " + ano + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);
        }else{
            campo = "COR_NOM";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strCor[cor] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_MESREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strMes[mes] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_ANOREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = " + ano + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);
        }
    }

    public void setMenorMelhor(double meta, double real, int cod, int mes){
        tabela = "CP_CORES";
        campo = "COR_NOM";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";

        int ano = Info.cal.get(Calendar.YEAR);

        vermelhao = 1.25;
        vermelho = 1.05;
        amarelo = 1;
        verde = 0.8;
        verdao = 0.8;

        int cor = 0;

        for(int j = 0; j < 5; j++){
            valor[j] = meta;
        }
        valor[0] *= vermelhao;
        valor[1] *= vermelho;
        valor[2] *= amarelo;
        valor[3] *= verde;
        valor[4] *= verdao;

        if(real >= valor[0]){
            cor = 0;
        }else if(real >= valor[1]){
            cor = 1;
        }else if(real >= valor[2]){
            cor = 2;
        }else if(real >= valor[3]){
            cor = 3;
        }else if(real <= valor[4]){
            cor = 4;
        }

        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux == 1){
            campo = "COR_NOM";
            insert = "INSERT INTO " + tabela + " (" + indCod + ", " + codTab + ") values (" + cod + ", " + (mes + 1) + ")";
            Info.objConexao.setBD(insert);
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strCor[cor] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_MESREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strMes[mes] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_ANOREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = " + ano + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);
        }else{
            campo = "COR_NOM";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strCor[cor] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_MESREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = '" + strMes[mes] + "' WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);

            campo = "COR_ANOREF";
            insert = "UPDATE " + tabela + " SET " + campo + " = " + ano + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
            Info.objConexao.setBD(insert);
        }
    }
    
    public void setBolaMapa(int cod, int mes){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        for(int i = 1; i < 7; i++){
            if(i == codPai){
                for(int j = 1; j < 7; j++){
                    if(j == codPos){
                        setIndicadorMapa(cor, strPer, i, j);
                    }
                }
            }
        }
    }
    
    public void setBolaCockpit(int cod, int mes, String per){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        if(strPer.equals(per)){
            for(int i = 1; i < 7; i++){
                if(i == codPai){
                    for(int j = 1; j < 7; j++){
                        if(j == codPos){
                            setIndicadorCockpit(cor, strPer, i, j);
                        }
                    }
                }
            }
        }
    }
    
    public void setBolaFinancas(int cod, int mes){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        for(int i = 1; i < 7; i++){
            if(i == codPai){
                for(int j = 1; j < 7; j++){
                    if(j == codPos){
                        setIndicadorFinanças(cor, strPer, i, j);
                    }
                }
            }
        }
    }
    
    public void setBolaFinancas(int cod, int mes, int pai){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorFinanças(cor, strPer, pai, j);
                }
            }
        }
    }
    
    public void setBolaFinancas(int cod, int mes, int pai1, int pai2){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai1 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorFinanças(cor, strPer, pai1, j);
                }
            }
        }

        if(pai2 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorFinanças(cor, strPer, pai2, j);
                }
            }
        }
    }
    
    public void setBolaClientes(int cod, int mes){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        for(int i = 1; i < 7; i++){
            if(i == codPai){
                for(int j = 1; j < 7; j++){
                    if(j == codPos){
                        setIndicadorClientes(cor, strPer, i, j);
                    }
                }
            }
        }
    }
    
    public void setBolaClientes(int cod, int mes, int pai){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorClientes(cor, strPer, pai, j);
                }
            }
        }
    }
    
    public void setBolaClientes(int cod, int mes, int pai1, int pai2){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai1 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorClientes(cor, strPer, pai1, j);
                }
            }
        }
        
        if(pai2 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorClientes(cor, strPer, pai2, j);
                }
            }
        }
    }
    
    public void setBolaProcessos(int cod, int mes){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        for(int i = 1; i < 7; i++){
            if(i == codPai){
                for(int j = 1; j < 7; j++){
                    if(j == codPos){
                        setIndicadorProcessos(cor, strPer, i, j);
                    }
                }
            }
        }
    }
    
    public void setBolaProcessos(int cod, int mes, int pai){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorProcessos(cor, strPer, pai, j);
                }
            }
        }
    }
    
    public void setBolaProcessos(int cod, int mes, int pai1, int pai2){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai1 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorProcessos(cor, strPer, pai1, j);
                }
            }
        }
        
        if(pai2 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorProcessos(cor, strPer, pai2, j);
                }
            }
        }
    }
    
    public void setBolaPgt(int cod, int mes){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        for(int i = 1; i < 7; i++){
            if(i == codPai){
                for(int j = 1; j < 7; j++){
                    if(j == codPos){
                        setIndicadorPgt(cor, strPer, i, j);
                    }
                }
            }
        }
    }
    
    public void setBolaPgt(int cod, int mes, int pai){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorPgt(cor, strPer, pai, j);
                }
            }
        }
    }
    
    public void setBolaPgt(int cod, int mes, int pai1, int pai2){
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);
        
        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));

        if(pai1 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorPgt(cor, strPer, pai1, j);
                }
            }
        }
        
        if(pai2 == codPai){
            for(int j = 1; j < 7; j++){
                if(j == codPos){
                    setIndicadorPgt(cor, strPer, pai2, j);
                }
            }
        }
    }
    
    public void setBolaGrafico(int cod, int mes, String perspectiva, int pai, int pos){
        Info.data = Info.cal.get(Calendar.MONTH);
        
        tabela = "CP_CORES";
        indCod = "COR_INDCOD";
        codTab = "COR_COD";
        campo = "COR_NOM";

        String cor;
        String strPer;
        int codPai;
        int codPos;

        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + cod + " AND " + codTab + " = " + (mes + 1);
        cor = Info.objConexao.getBD(select, campo);

        tabela = "CP_INF_GERAIS";
        strPerspectiva = "INF_PER";
        strPainel = "INF_PAI";
        strPosicao = "INF_POS";
        indCod = "INF_INDCOD";
        campo = "INF_INDCOD";
        
        select = "SELECT " + strPerspectiva + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        strPer = Info.objConexao.getBD(select, strPerspectiva);

        select = "SELECT " + strPainel + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPai = Integer.parseInt(Info.objConexao.getBD(select, strPainel));

        select = "SELECT " + strPosicao + " FROM " + tabela + " WHERE " + indCod + " = " + cod;
        codPos = Integer.parseInt(Info.objConexao.getBD(select, strPosicao));
        
        if(perspectiva.equals(strPer)){
            if(pai == codPai){
                if(pos == codPos){
                    setIndicadorGrafico(cor, (mes + 1));

                    if((mes + 1) == Info.data){
                        setIndicadorGraficoAtual(cor);
                    }
                }
            }
        }
    }
    
    public void setIndicadorGrafico(String cor, int mes){
        if(mes == 1){
            Info.graficos.setLblStatusJan(cor);
        }else if(mes == 2){
            Info.graficos.setLblStatusFev(cor);
        }else if(mes == 3){
            Info.graficos.setLblStatusMar(cor);
        }else if(mes == 4){
            Info.graficos.setLblStatusAbr(cor);
        }else if(mes == 5){
            Info.graficos.setLblStatusMai(cor);
        }else if(mes == 6){
            Info.graficos.setLblStatusJun(cor);
        }else if(mes == 7){
            Info.graficos.setLblStatusJul(cor);
        }else if(mes == 8){
            Info.graficos.setLblStatusAgo(cor);
        }else if(mes == 9){
            Info.graficos.setLblStatusSet(cor);
        }else if(mes == 10){
            Info.graficos.setLblStatusOut(cor);
        }else if(mes == 11){
            Info.graficos.setLblStatusNov(cor);
        }else if(mes == 12){
            Info.graficos.setLblStatusDez(cor);
        }
        
    }

    public void setIndicadorGraficoAtual(String cor){
        Info.graficos.setLblStatus2(cor);
    }
    
    public void setIndicadorMapa(String cor, String per, int pai, int pos){
        String[] corPainel1 = new String[6];
        String[] corPainel2 = new String[6];
        String[] corPainel3 = new String[6];
        String[] corPainel4 = new String[6];
        String[] corPainel5 = new String[6];
        String[] corPainel6 = new String[6];
        
        int[] intCor = new int[6];
        int menor1 = 5, menor2= 5, menor3= 5, menor4= 5, menor5= 5, menor6= 5;
        
        //FINANCAS
        if(per.equals(CockpitStrings.Perspectivas[0])){
            if(pai == 1){
                if(pos == 1){
                    corPainel1[0] = cor;
                }else if(pos == 2){
                    corPainel1[1] = cor;
                }else if(pos == 3){
                    corPainel1[2] = cor;
                }else if(pos == 4){
                    corPainel1[3] = cor;
                }else if(pos == 5){
                    corPainel1[4] = cor;
                }else if(pos == 6){
                    corPainel1[5] = cor;
                }
            }else if(pai == 2){
                if(pos == 1){
                    corPainel2[0] = cor;
                }else if(pos == 2){
                    corPainel2[1] = cor;
                }else if(pos == 3){
                    corPainel2[2] = cor;
                }else if(pos == 4){
                    corPainel2[3] = cor;
                }else if(pos == 5){
                    corPainel2[4] = cor;
                }else if(pos == 6){
                    corPainel2[5] = cor;
                }
            }else if(pai == 3){
                if(pos == 1){
                    corPainel3[0] = cor;
                }else if(pos == 2){
                    corPainel3[1] = cor;
                }else if(pos == 3){
                    corPainel3[2] = cor;
                }else if(pos == 4){
                    corPainel3[3] = cor;
                }else if(pos == 5){
                    corPainel3[4] = cor;
                }else if(pos == 6){
                    corPainel3[5] = cor;
                }
            }else if(pai == 4){
                if(pos == 1){
                    corPainel4[0] = cor;
                }else if(pos == 2){
                    corPainel4[1] = cor;
                }else if(pos == 3){
                    corPainel4[2] = cor;
                }else if(pos == 4){
                    corPainel4[3] = cor;
                }else if(pos == 5){
                    corPainel4[4] = cor;
                }else if(pos == 6){
                    corPainel4[5] = cor;
                }
            }else if(pai == 5){
                if(pos == 1){
                    corPainel5[0] = cor;
                }else if(pos == 2){
                    corPainel5[1] = cor;
                }else if(pos == 3){
                    corPainel5[2] = cor;
                }else if(pos == 4){
                    corPainel5[3] = cor;
                }else if(pos == 5){
                    corPainel5[4] = cor;
                }else if(pos == 6){
                    corPainel5[5] = cor;
                }
            }else if(pai == 6){
                if(pos == 1){
                    corPainel6[0] = cor;
                }else if(pos == 2){
                    corPainel6[1] = cor;
                }else if(pos == 3){
                    corPainel6[2] = cor;
                }else if(pos == 4){
                    corPainel6[3] = cor;
                }else if(pos == 5){
                    corPainel6[4] = cor;
                }else if(pos == 6){
                    corPainel6[5] = cor;
                }
            }
            
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(corPainel1[i] != null){
                        if(corPainel1[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor1 > intCor[i]){
                                menor1 = intCor[i];
                            }                       
                        }
                    }
                    
                    if(corPainel2[i] != null){
                        if(corPainel2[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel3[i] != null){
                        if(corPainel3[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel4[i] != null){
                        if(corPainel4[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor4 > intCor[i]){
                                menor4 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel5[i] != null){
                        if(corPainel5[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor5 > intCor[i]){
                                menor5 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel6[i] != null){
                        if(corPainel6[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor6 > intCor[i]){
                                menor6 = intCor[i];
                            }
                        }
                    }
                }
            }
            if(menor1 < 5){    
                cor = strCor[menor1];
                Info.mapaEstrategico.setLblStatusFinPos1(cor);
            }
            if(menor2 < 5){
                cor = strCor[menor2];
                Info.mapaEstrategico.setLblStatusFinPos4(cor);
            }
            if(menor4 < 5){
                cor = strCor[menor4];
                Info.mapaEstrategico.setLblStatusFinPos2(cor);
            }
            if(menor5 < 5){
                cor = strCor[menor5];
                Info.mapaEstrategico.setLblStatusFinPos3(cor);
            }
            if(menor6 < 5){
                cor = strCor[menor6];
                Info.mapaEstrategico.setLblStatusFinPos5(cor);
            }
            
        //CLIENTES
        }else if(per.equals(CockpitStrings.Perspectivas[1])){
            if(pai == 1){
                if(pos == 1){
                    corPainel1[0] = cor;
                }else if(pos == 2){
                    corPainel1[1] = cor;
                }else if(pos == 3){
                    corPainel1[2] = cor;
                }else if(pos == 4){
                    corPainel1[3] = cor;
                }else if(pos == 5){
                    corPainel1[4] = cor;
                }else if(pos == 6){
                    corPainel1[5] = cor;
                }
            }else if(pai == 2){
                if(pos == 1){
                    corPainel2[0] = cor;
                }else if(pos == 2){
                    corPainel2[1] = cor;
                }else if(pos == 3){
                    corPainel2[2] = cor;
                }else if(pos == 4){
                    corPainel2[3] = cor;
                }else if(pos == 5){
                    corPainel2[4] = cor;
                }else if(pos == 6){
                    corPainel2[5] = cor;
                }
            }else if(pai == 3){
                if(pos == 1){
                    corPainel3[0] = cor;
                }else if(pos == 2){
                    corPainel3[1] = cor;
                }else if(pos == 3){
                    corPainel3[2] = cor;
                }else if(pos == 4){
                    corPainel3[3] = cor;
                }else if(pos == 5){
                    corPainel3[4] = cor;
                }else if(pos == 6){
                    corPainel3[5] = cor;
                }
            }else if(pai == 4){
                if(pos == 1){
                    corPainel4[0] = cor;
                }else if(pos == 2){
                    corPainel4[1] = cor;
                }else if(pos == 3){
                    corPainel4[2] = cor;
                }else if(pos == 4){
                    corPainel4[3] = cor;
                }else if(pos == 5){
                    corPainel4[4] = cor;
                }else if(pos == 6){
                    corPainel4[5] = cor;
                }
            }else if(pai == 5){
                if(pos == 1){
                    corPainel5[0] = cor;
                }else if(pos == 2){
                    corPainel5[1] = cor;
                }else if(pos == 3){
                    corPainel5[2] = cor;
                }else if(pos == 4){
                    corPainel5[3] = cor;
                }else if(pos == 5){
                    corPainel5[4] = cor;
                }else if(pos == 6){
                    corPainel5[5] = cor;
                }
            }else if(pai == 6){
                if(pos == 1){
                    corPainel6[0] = cor;
                }else if(pos == 2){
                    corPainel6[1] = cor;
                }else if(pos == 3){
                    corPainel6[2] = cor;
                }else if(pos == 4){
                    corPainel6[3] = cor;
                }else if(pos == 5){
                    corPainel6[4] = cor;
                }else if(pos == 6){
                    corPainel6[5] = cor;
                }
            }
            
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(corPainel1[i] != null){
                        if(corPainel1[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor1 > intCor[i]){
                                menor1 = intCor[i];
                            }                       
                        }
                    }
                    
                    if(corPainel2[i] != null){
                        if(corPainel2[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel3[i] != null){
                        if(corPainel3[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor3 > intCor[i]){
                                menor3 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel4[i] != null){
                        if(corPainel4[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor4 > intCor[i]){
                                menor4 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel5[i] != null){
                        if(corPainel5[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor5 > intCor[i]){
                                menor5 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel6[i] != null){
                        if(corPainel6[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor3 > intCor[i]){
                                menor3 = intCor[i];
                            }
                        }
                    }
                }
            }
            if(menor1 < 5){    
                cor = strCor[menor1];
                Info.mapaEstrategico.setLblStatusCliPos3(cor);
            }
            if(menor2 < 5){
                cor = strCor[menor2];
                Info.mapaEstrategico.setLblStatusCliPos1(cor);
            }
            if(menor3 < 5){
                cor = strCor[menor3];
                Info.mapaEstrategico.setLblStatusCliPos5(cor);
            }
            if(menor4 < 5){
                cor = strCor[menor4];
                Info.mapaEstrategico.setLblStatusCliPos4(cor);
            }
            if(menor5 < 5){
                cor = strCor[menor5];
                Info.mapaEstrategico.setLblStatusCliPos2(cor);
            }
            
        //PROCESSOS
        }else if(per.equals(CockpitStrings.Perspectivas[2])){
            if(pai == 1){
                if(pos == 1){
                    corPainel1[0] = cor;
                }else if(pos == 2){
                    corPainel1[1] = cor;
                }else if(pos == 3){
                    corPainel1[2] = cor;
                }else if(pos == 4){
                    corPainel1[3] = cor;
                }else if(pos == 5){
                    corPainel1[4] = cor;
                }else if(pos == 6){
                    corPainel1[5] = cor;
                }
            }else if(pai == 2){
                if(pos == 1){
                    corPainel2[0] = cor;
                }else if(pos == 2){
                    corPainel2[1] = cor;
                }else if(pos == 3){
                    corPainel2[2] = cor;
                }else if(pos == 4){
                    corPainel2[3] = cor;
                }else if(pos == 5){
                    corPainel2[4] = cor;
                }else if(pos == 6){
                    corPainel2[5] = cor;
                }
            }else if(pai == 3){
                if(pos == 1){
                    corPainel3[0] = cor;
                }else if(pos == 2){
                    corPainel3[1] = cor;
                }else if(pos == 3){
                    corPainel3[2] = cor;
                }else if(pos == 4){
                    corPainel3[3] = cor;
                }else if(pos == 5){
                    corPainel3[4] = cor;
                }else if(pos == 6){
                    corPainel3[5] = cor;
                }
            }else if(pai == 4){
                if(pos == 1){
                    corPainel4[0] = cor;
                }else if(pos == 2){
                    corPainel4[1] = cor;
                }else if(pos == 3){
                    corPainel4[2] = cor;
                }else if(pos == 4){
                    corPainel4[3] = cor;
                }else if(pos == 5){
                    corPainel4[4] = cor;
                }else if(pos == 6){
                    corPainel4[5] = cor;
                }
            }else if(pai == 5){
                if(pos == 1){
                    corPainel5[0] = cor;
                }else if(pos == 2){
                    corPainel5[1] = cor;
                }else if(pos == 3){
                    corPainel5[2] = cor;
                }else if(pos == 4){
                    corPainel5[3] = cor;
                }else if(pos == 5){
                    corPainel5[4] = cor;
                }else if(pos == 6){
                    corPainel5[5] = cor;
                }
            }else if(pai == 6){
                if(pos == 1){
                    corPainel6[0] = cor;
                }else if(pos == 2){
                    corPainel6[1] = cor;
                }else if(pos == 3){
                    corPainel6[2] = cor;
                }else if(pos == 4){
                    corPainel6[3] = cor;
                }else if(pos == 5){
                    corPainel6[4] = cor;
                }else if(pos == 6){
                    corPainel6[5] = cor;
                }
            }
            
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(corPainel1[i] != null){
                        if(corPainel1[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor1 > intCor[i]){
                                menor1 = intCor[i];
                            }                       
                        }
                    }
                    
                    if(corPainel2[i] != null){
                        if(corPainel2[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel3[i] != null){
                        if(corPainel3[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor3 > intCor[i]){
                                menor3 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel4[i] != null){
                        if(corPainel4[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor4 > intCor[i]){
                                menor4 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel5[i] != null){
                        if(corPainel5[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel6[i] != null){
                        if(corPainel6[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor6 > intCor[i]){
                                menor6 = intCor[i];
                            }
                        }
                    }
                }
            }
            if(menor1 < 5){    
                cor = strCor[menor1];
                Info.mapaEstrategico.setLblStatusProPos1(cor);
                Info.mapaEstrategico.setLblStatusProPos2(cor);
                Info.mapaEstrategico.setLblStatusProPos7(cor);
            }
            if(menor2 < 5){
                cor = strCor[menor2];
                Info.mapaEstrategico.setLblStatusProPos3(cor);
            }
            if(menor3 < 5){
                cor = strCor[menor3];
                Info.mapaEstrategico.setLblStatusProPos5(cor);
            }
            if(menor4 < 5){
                cor = strCor[menor4];
                Info.mapaEstrategico.setLblStatusProPos4(cor);
            }
            if(menor6 < 5){
                cor = strCor[menor6];
                Info.mapaEstrategico.setLblStatusProPos6(cor);
            }
            
        //PESSOAS, GESTÃO & TECNOLOGIA
        }else if(per.equals(CockpitStrings.Perspectivas[3])){
            if(pai == 1){
                if(pos == 1){
                    corPainel1[0] = cor;
                }else if(pos == 2){
                    corPainel1[1] = cor;
                }else if(pos == 3){
                    corPainel1[2] = cor;
                }else if(pos == 4){
                    corPainel1[3] = cor;
                }else if(pos == 5){
                    corPainel1[4] = cor;
                }else if(pos == 6){
                    corPainel1[5] = cor;
                }
            }else if(pai == 2){
                if(pos == 1){
                    corPainel2[0] = cor;
                }else if(pos == 2){
                    corPainel2[1] = cor;
                }else if(pos == 3){
                    corPainel2[2] = cor;
                }else if(pos == 4){
                    corPainel2[3] = cor;
                }else if(pos == 5){
                    corPainel2[4] = cor;
                }else if(pos == 6){
                    corPainel2[5] = cor;
                }
            }else if(pai == 3){
                if(pos == 1){
                    corPainel3[0] = cor;
                }else if(pos == 2){
                    corPainel3[1] = cor;
                }else if(pos == 3){
                    corPainel3[2] = cor;
                }else if(pos == 4){
                    corPainel3[3] = cor;
                }else if(pos == 5){
                    corPainel3[4] = cor;
                }else if(pos == 6){
                    corPainel3[5] = cor;
                }
            }else if(pai == 4){
                if(pos == 1){
                    corPainel4[0] = cor;
                }else if(pos == 2){
                    corPainel4[1] = cor;
                }else if(pos == 3){
                    corPainel4[2] = cor;
                }else if(pos == 4){
                    corPainel4[3] = cor;
                }else if(pos == 5){
                    corPainel4[4] = cor;
                }else if(pos == 6){
                    corPainel4[5] = cor;
                }
            }else if(pai == 5){
                if(pos == 1){
                    corPainel5[0] = cor;
                }else if(pos == 2){
                    corPainel5[1] = cor;
                }else if(pos == 3){
                    corPainel5[2] = cor;
                }else if(pos == 4){
                    corPainel5[3] = cor;
                }else if(pos == 5){
                    corPainel5[4] = cor;
                }else if(pos == 6){
                    corPainel5[5] = cor;
                }
            }else if(pai == 6){
                if(pos == 1){
                    corPainel6[0] = cor;
                }else if(pos == 2){
                    corPainel6[1] = cor;
                }else if(pos == 3){
                    corPainel6[2] = cor;
                }else if(pos == 4){
                    corPainel6[3] = cor;
                }else if(pos == 5){
                    corPainel6[4] = cor;
                }else if(pos == 6){
                    corPainel6[5] = cor;
                }
            }
            
            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){
                    if(corPainel1[i] != null){
                        if(corPainel1[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor1 > intCor[i]){
                                menor1 = intCor[i];
                            }                       
                        }
                    }
                    
                    if(corPainel2[i] != null){
                        if(corPainel2[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor2 > intCor[i]){
                                menor2 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel3[i] != null){
                        if(corPainel3[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor3 > intCor[i]){
                                menor3 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel4[i] != null){
                        if(corPainel4[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor4 > intCor[i]){
                                menor4 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel5[i] != null){
                        if(corPainel5[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor5 > intCor[i]){
                                menor5 = intCor[i];
                            }
                        }
                    }
                    
                    if(corPainel6[i] != null){
                        if(corPainel6[i].equals(strCor[j])){
                            intCor[i] = j;
                            if(menor6 > intCor[i]){
                                menor6 = intCor[i];
                            }
                        }
                    }
                }
            }
            if(menor1 < 5){    
                cor = strCor[menor1];
                Info.mapaEstrategico.setLblStatusPgtPos5(cor);
            }
            if(menor2 < 5){
                cor = strCor[menor2];
                Info.mapaEstrategico.setLblStatusPgtPos1(cor);
                Info.mapaEstrategico.setLblStatusPgtPos2(cor);
            }
            if(menor3 < 5){
                cor = strCor[menor3];
                Info.mapaEstrategico.setLblStatusPgtPos6(cor);
            }
            if(menor4 < 5){
                cor = strCor[menor4];
                Info.mapaEstrategico.setLblStatusPgtPos4(cor);
            }
            if(menor5 < 5){
                cor = strCor[menor5];
                Info.mapaEstrategico.setLblStatusPgtPos3(cor);
            }
            if(menor6 < 5){
                cor = strCor[menor6];
                Info.mapaEstrategico.setLblStatusPgtPos7(cor);
                Info.mapaEstrategico.setLblStatusPgtPos8(cor);
            }
        }
    }

    public void setIndicadorCockpit(String cor, String per, int pai, int pos){
        if(pai == 1){
            if(pos == 1){
                Info.cockpit.setLblStatusPai1Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai1Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai1Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai1Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai1Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai1Pos6(cor);
            }
        }else if(pai == 2){
            if(pos == 1){
                Info.cockpit.setLblStatusPai2Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai2Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai2Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai2Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai2Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai2Pos6(cor);
            }
        }else if(pai == 3){
            if(pos == 1){
                Info.cockpit.setLblStatusPai3Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai3Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai3Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai3Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai3Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai3Pos6(cor);
            }
        }else if(pai == 4){
            if(pos == 1){
                Info.cockpit.setLblStatusPai4Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai4Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai4Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai4Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai4Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai4Pos6(cor);
            }
        }else if(pai == 5){
            if(pos == 1){
                Info.cockpit.setLblStatusPai5Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai5Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai5Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai5Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai5Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai5Pos6(cor);
            }
        }else if(pai == 6){
            if(pos == 1){
                Info.cockpit.setLblStatusPai6Pos1(cor);
            }else if(pos == 2){
                Info.cockpit.setLblStatusPai6Pos2(cor);
            }else if(pos == 3){
                Info.cockpit.setLblStatusPai6Pos3(cor);
            }else if(pos == 4){
                Info.cockpit.setLblStatusPai6Pos4(cor);
            }else if(pos == 5){
                Info.cockpit.setLblStatusPai6Pos5(cor);
            }else if(pos == 6){
                Info.cockpit.setLblStatusPai6Pos6(cor);
            }
        }
    }
    
    public void setIndicadorFinanças(String cor, String per, int pai, int pos){
        
        //FINANCAS
        if(per.equals(CockpitStrings.Perspectivas[0])){
            if(pai == 1){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 2){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 3){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos7(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos8(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos9(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos10(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos11(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos12(cor);
                }
            }else if(pai == 4){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 5){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 6){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }
        }
    }
    
    public void setIndicadorClientes(String cor, String per, int pai, int pos){
        //CLIENTES
        if(per.equals(CockpitStrings.Perspectivas[1])){
            if(pai == 1){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 2){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 3){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 4){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 5){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 6){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos7(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos8(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos9(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos10(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos11(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos12(cor);
                }
            }
        }
    }
    
    public void setIndicadorProcessos(String cor, String per, int pai, int pos){
        //PROCESSOS
        if(per.equals(CockpitStrings.Perspectivas[2])){
            if(pai == 1){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 2){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 3){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 4){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 5){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos7(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos8(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos9(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos10(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos11(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos12(cor);
                }
            }else if(pai == 6){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }
        }
    }
    
    public void setIndicadorPgt(String cor, String per, int pai, int pos){
        //PESSOAS, GESTAO & TECNOLOGIA
        if(per.equals(CockpitStrings.Perspectivas[3])){
            if(pai == 1){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 2){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 3){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 4){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 5){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }else if(pai == 6){
                if(pos == 1){
                    Info.objetivos.setLblStatusPos1(cor);
                }else if(pos == 2){
                    Info.objetivos.setLblStatusPos2(cor);
                }else if(pos == 3){
                    Info.objetivos.setLblStatusPos3(cor);
                }else if(pos == 4){
                    Info.objetivos.setLblStatusPos4(cor);
                }else if(pos == 5){
                    Info.objetivos.setLblStatusPos5(cor);
                }else if(pos == 6){
                    Info.objetivos.setLblStatusPos6(cor);
                }
            }
        }  
    }
            

}
