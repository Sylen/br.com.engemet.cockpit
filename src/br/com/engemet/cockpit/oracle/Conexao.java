package br.com.engemet.cockpit.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import br.com.engemet.cockpit.telas.Info;
import java.sql.CallableStatement;

public class Conexao{

    private final static String driver = "oracle.jdbc.driver.OracleDriver";
    private final static String bdOracle = "jdbc:oracle:thin:@192.168.0.250:1521:ORCL";
    private final static String login = "desenv";
    private final static String senha = "desenv";
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    private CallableStatement call;
    private String texto;

    public Conexao(){
        Info.objConexao = this;
    }

    public void openBD(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(bdOracle, login, senha);
            stmt = con.createStatement();
            System.out.println("\nConexao estabelecida com Sucesso!\n");
        }catch(ClassNotFoundException e){
            System.out.println("\nErro ao carregar JDBC/ODBC driver! " + e + "\n");
            System.exit(1);
        }catch(SQLException e){
            System.out.println("\nNao foi possivel estabelecer conexao " + e + "\n");
            System.exit(1);
        }
    }

    public void closeBD(){
        try{
            con.close();
            System.out.println("\nConexao fechada com Sucesso!\n");
        }catch(SQLException e){
            System.out.println("\nNao foi possivel fechar conexao " + e + "\n");
            System.exit(1);
        }
    }

    public String mostra(String query){
        try{
            System.out.println("\nMostrando dados!\n");
            System.out.println(query);
            rs = stmt.executeQuery(query);
            while(rs.next()){
                System.out.println(rs.getString("CP_INF_GERAIS"));
            }

        }catch(Exception erro){
            System.out.println("Problemas com Conexao\n\n" + erro);
        }

        return query;
    }

    public void setBD(String commandInsert){
        try{
            System.out.println(commandInsert);
            stmt.executeUpdate(commandInsert);
            System.out.println("Dados gravados com Sucesso!");
        }catch(Exception erro){
            System.out.println("Problema com Conexão\n\n");
        }
    }
    
    public String getBD(String commandSelect, String campoTabela){
        try{
            System.out.println(commandSelect);
            rs = stmt.executeQuery(commandSelect);
            while(rs.next()){
                System.out.println(rs.getString(campoTabela));
                texto = rs.getString(campoTabela);
                System.out.println("Código = " + Info.codInd);
            }

            System.out.println("Dados recuperados com Sucesso!");
        }catch(Exception erro){
            System.out.println("Problemas com Conexao\n\n" + erro);
        }
        return texto;
    }

    public int getIndCod(String commandSelect, String campoTabela, int cod){
        try{
            cod = 1;
            System.out.println(commandSelect);
            rs = stmt.executeQuery(commandSelect);
            while(rs.next()){
                System.out.println(rs.getString(campoTabela));
                cod++;
                System.out.println("Código = " + cod);   
            }

            System.out.println("Dados recuperados com Sucesso!");
        }catch(Exception erro){
            System.out.println("Problemas com Conexao\n\n" + erro);
        }
        return cod;
    }
    
    public int getSelect(String commandSelect, String campoTabela, int aux){
        try{
            aux = 0;
            System.out.println(commandSelect);
            rs = stmt.executeQuery(commandSelect);
            while(rs.next()){
                System.out.println(rs.getString(campoTabela));
                aux = rs.getInt(campoTabela);
                System.out.println("Auxiliar = " + aux);   
            }

            System.out.println("Dados recuperados com Sucesso!");
        }catch(Exception erro){
            System.out.println("Problemas com Conexao\n\n" + erro);
        }
        return aux;
    }
    
    public void setIndCod(String commandSelect, String campoTabela, int cod){
        try{
            cod = 1;
            System.out.println(commandSelect);
            rs = stmt.executeQuery(commandSelect);
            while(rs.next()){
                System.out.println(rs.getString(campoTabela));
                cod++;
                System.out.println("Código = " + cod);
            }

            System.out.println("Dados recuperados com Sucesso!");
        }catch(Exception erro){
            System.out.println("Problemas com Conexao\n\n" + erro);
        }
    }

}