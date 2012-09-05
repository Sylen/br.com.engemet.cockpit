package br.com.engemet.cockpit.telas;

import javax.swing.JOptionPane;

public class CriarUsuario extends javax.swing.JFrame{
    
    //Administrador = 1
    //Acesso + Edição de Indicadores + Edição de Iniciativas = 2
    //Acesso + Edição de Iniciativas = 3
    //Acesso = 4
    private String strAcesso[] = {"Administrador", "Acesso + Edição de Indicadores + Edição de Iniciativas", "Acesso + Edição de Iniciativas", "Acesso"};
    private String select, insert, tabela, usuario, codUsuario, acessoUsuario, senhaUsuario, campo;
    private int codUsu;
    
    public CriarUsuario(){
        tabela = "CP_USUARIOS";
        campo = "USU_COD";

        select = "SELECT " + campo + " FROM " + tabela;
        codUsu = Info.objConexao.getIndCod(select, campo, codUsu);

        initComponents();
        
        txtCod.setText(String.valueOf(codUsu));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCod = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        lblReSenha = new javax.swing.JLabel();
        lblAcesso = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtReSenha = new javax.swing.JPasswordField();
        txtSenha = new javax.swing.JPasswordField();
        cbxAcesso = new javax.swing.JComboBox();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCod.setText("Código :");
        getContentPane().add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 30));

        lblUsuario.setText("Usuário :");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 30));

        lblSenha.setText("Senha :");
        getContentPane().add(lblSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 30));

        lblReSenha.setText("Repita Senha :");
        getContentPane().add(lblReSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        lblAcesso.setText("Acesso :");
        getContentPane().add(lblAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 400, 30));
        getContentPane().add(txtReSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 400, 30));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 400, 30));

        cbxAcesso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "Administrador", "Acesso + Edição de Indicadores + Edição de Iniciativas", "Acesso + Edição de Iniciativas", "Acesso" }));
        getContentPane().add(cbxAcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, 30));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        lblTitulo.setText("Titulo");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        txtCod.setEditable(false);
        txtCod.setToolTipText("");
        getContentPane().add(txtCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        tabela = "CP_USUARIOS";
        codUsuario = "USU_COD";
        usuario = "USU_USU";
        acessoUsuario = "USU_ACE";
        senhaUsuario = "USU_SEN";
        
        int aux = 0;
        String strUsuario, charSenha, charReSenha;
        
        strUsuario = txtUsuario.getText();
        charSenha = String.valueOf(txtSenha.getPassword());
        charReSenha = String.valueOf(txtReSenha.getPassword());

        if(charSenha.equals(charReSenha)){
            select = "SELECT * FROM " + tabela + " WHERE " + usuario + " = '" + strUsuario + "'";
            aux = Info.objConexao.getIndCod(select, campo, aux);
            if(aux == 1){
                insert = "INSERT INTO " + tabela + " (" + codUsuario + ") values (" + codUsu  + ")";
                Info.objConexao.setBD(insert);
            }else if(aux == 2 && Info.aux == 0){
                JOptionPane.showMessageDialog(null, "Usuário ja existe!");
            }else if(aux == 2 && Info.aux == 1){
                insert = "UPDATE " + tabela + " SET " + senhaUsuario + " = '" + charSenha + "' WHERE " + usuario + " = '" + strUsuario + "'";
                Info.objConexao.setBD(insert);

                dispose();
            }
            if(aux == 1 && Info.aux == 0){
                insert = "UPDATE " + tabela + " SET " + usuario + " = '" + strUsuario + "' WHERE " + codUsuario + " = " + codUsu;
                Info.objConexao.setBD(insert);

                insert = "UPDATE " + tabela + " SET " + senhaUsuario + " = '" + charSenha + "' WHERE " + codUsuario + " = " + codUsu;
                Info.objConexao.setBD(insert);

                insert = "UPDATE " + tabela + " SET " + acessoUsuario + " = " + cbxAcesso.getSelectedIndex() + " WHERE " + codUsuario + " = " + codUsu;
                Info.objConexao.setBD(insert);

                dispose();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Os campos de senha devem ser iguais!");
        }

    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]){
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new CriarUsuario().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cbxAcesso;
    private javax.swing.JLabel lblAcesso;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblReSenha;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCod;
    private javax.swing.JPasswordField txtReSenha;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
    
    public void setTitulo(String nome){
        lblTitulo.setText(nome);
    }
    
    public void setRedefirSenha(){
        txtUsuario.setText(Info.telaPrincipal.getTextUsuario());
        txtUsuario.setEditable(false);
        cbxAcesso.setVisible(false);
        lblAcesso.setVisible(false);
        lblCod.setVisible(false);
        txtCod.setVisible(false);
    }

}
