package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.oracle.Conexao;
import javax.swing.JOptionPane;

public class AcessoUsuario extends javax.swing.JFrame{
    
    public static final Conexao conexao = new Conexao();
    
    //Administrador = 1
    //Acesso + Edição de Indicadores + Edição de Iniciativas = 2
    //Acesso + Edição de Iniciativas = 3
    //Acesso = 4
    private String strAcesso[] = {"Administrador", "Acesso + Edição de Indicadores + Edição de Iniciativas", "Acesso + Edição de Iniciativas", "Acesso"};
    private String select, insert, tabela, usuario, codUsuario, acessoUsuario, senhaUsuario, campo;
    
    public AcessoUsuario(){
        conexao.openBD();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOk = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Entrar no Cockpit");
        setAlwaysOnTop(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        lblSenha.setText("Senha :");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        lblUsuario.setText("Usuário :");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 210, 30));

        txtSenha.setToolTipText("");
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 210, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        tabela = "CP_USUARIOS";
        usuario = "USU_USU";
        senhaUsuario = "USU_SEN";
        
        String strUsuario;
        int compararUsuario = 0;
        int comparaSenha = 0;
                
        strUsuario = txtUsuario.getText();

        select = "SELECT * FROM " + tabela + " WHERE " + usuario + " = '" + strUsuario + "'";
        compararUsuario = Info.objConexao.getIndCod(select, usuario, compararUsuario);

        select = "SELECT * FROM " + tabela + " WHERE " + usuario + " = '" + strUsuario + "'";
        comparaSenha = Info.objConexao.getIndCod(select, usuario, comparaSenha);
        
        if(compararUsuario != 1 && comparaSenha != 1){
            Info.telaPrincipal.setEnabled(true);
            Info.telaPrincipal.setTextUsuario(strUsuario);
            setAcesso();
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Usuário ou senha não conferem! Entrar em contato com o Administrador");
        }
    }//GEN-LAST:event_btnOkActionPerformed
    
    public void setAcesso(){
        tabela = "CP_USUARIOS";
        usuario = "USU_USU";
        acessoUsuario = "USU_ACE";
        
        int acesso;
        String strUsuario;
        strUsuario = Info.telaPrincipal.getTextUsuario();
        
        select = "SELECT " + acessoUsuario + " FROM " + tabela + " WHERE " + usuario + " = '" + strUsuario + "'";
        acesso = Integer.parseInt(Info.objConexao.getBD(select, acessoUsuario));
        
        if(acesso == 2){
            Info.telaPrincipal.setCriarUsuario(false);
        }else if(acesso == 3){
            Info.telaPrincipal.setIndicadores(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
