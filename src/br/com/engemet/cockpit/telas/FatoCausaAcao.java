package br.com.engemet.cockpit.telas;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class FatoCausaAcao extends javax.swing.JFrame{
    private String tabela, indCod, codTab, campo, select, insert;
    private int cont = 1;
    private int check = 0;
    
    @SuppressWarnings("unchecked")
    public FatoCausaAcao(){
        initComponents();
        
        tabela = "CP_FAT_CAUSA";
        indCod = "FAT_INDCOD";
        codTab = "FAT_COD";
        
        int aux = 0;
        String data;
        campo = "FAT_DAT";
        
        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + Info.cod ;
        aux = Info.objConexao.getIndCod(select, campo, aux);

        if(aux > 1){
            while(aux > cont){
                select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
                data = Info.objConexao.getBD(select, campo);
                cbxData.addItem(data + " = " + cont);
                cont++;
            }
        }
        
        txtNome.setText(Info.graficos.getLblIndicador2());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtResponsavel = new javax.swing.JTextField();
        cbxData = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtFato = new javax.swing.JTextArea();
        lblFato = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCausa = new javax.swing.JTextArea();
        lblCausa = new javax.swing.JLabel();
        lblAcao = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAcao = new javax.swing.JTextArea();
        lblResponsavel = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        lblPrazo = new javax.swing.JLabel();
        chkOk = new javax.swing.JCheckBox();
        btnFechar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 580, -1));

        cbxData.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        cbxData.setToolTipText("");
        cbxData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDataActionPerformed(evt);
            }
        });
        getContentPane().add(cbxData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 300, -1));

        txtFato.setColumns(20);
        txtFato.setRows(5);
        jScrollPane1.setViewportView(txtFato);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 580, 90));

        lblFato.setText("Fato");
        getContentPane().add(lblFato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        txtCausa.setColumns(20);
        txtCausa.setRows(5);
        jScrollPane2.setViewportView(txtCausa);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 90));

        lblCausa.setText("Causa");
        getContentPane().add(lblCausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        lblAcao.setText("Ação / Analise");
        getContentPane().add(lblAcao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        txtAcao.setColumns(20);
        txtAcao.setRows(5);
        jScrollPane3.setViewportView(txtAcao);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 580, 90));

        lblResponsavel.setText("Responsável");
        getContentPane().add(lblResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 580, -1));

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        txtData.setToolTipText("Formato da data dd/mm/aaaa");
        getContentPane().add(txtData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, -1));

        lblPrazo.setText("Prazo");
        getContentPane().add(lblPrazo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        chkOk.setText("Ok");
        getContentPane().add(chkOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 480, -1, -1));

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        btnAdicionar.setText("Adicionar / Atualizar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    @SuppressWarnings({"unchecked", "unchecked"})
    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        // TODO add your handling code here:
        tabela = "CP_FAT_CAUSA";
        indCod = "FAT_INDCOD";
        codTab = "FAT_COD";

        int aux = 0;
        
        int dia, mes, ano;
        
        dia = Info.cal.get(Calendar.DATE);
        mes = Info.cal.get(Calendar.MONTH);
        mes+=1;
        ano = Info.cal.get(Calendar.YEAR);
        
        
        if(check == 0){
            cont = cbxData.getItemCount();
            cbxData.addItem(dia + "/" + mes + "/" + ano + " = " + cont);
        }else if(check == 2){
            cont = cbxData.getItemCount();
            cbxData.addItem(dia + "/" + mes + "/" + ano + " = " + cont);
        }
    
        select = "SELECT * FROM " + tabela + " WHERE " + indCod + " = " + Info.cod  + " AND " + codTab + " = " + cont;
        aux = Info.objConexao.getIndCod(select, campo, aux);
        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + indCod + ", " + codTab + ") values (" + Info.cod  + ", " + cont + ")";
            Info.objConexao.setBD(insert);
        }
        
        campo = "FAT_NOM";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtNome.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_FAT";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtFato.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_CAU";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtCausa.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_ACA";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAcao.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_RES";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_PRA";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtData.getText() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_OK";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + chkOk.isSelected() + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        campo = "FAT_DAT";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + (dia + "/" + mes + "/" + ano) + "' WHERE " + indCod + " = " + Info.cod  +  " AND " + codTab + " = " + cont;
        Info.objConexao.setBD(insert);
        
        JOptionPane.showMessageDialog(null, "Dados adicionados!");
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void cbxDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDataActionPerformed
        // TODO add your handling code here:
        tabela = "CP_FAT_CAUSA";
        indCod = "FAT_INDCOD";
        codTab = "FAT_COD";
        
        check = 1;
        
        cont = cbxData.getSelectedIndex();
        String strAux;
        
        txtFato.setText("");
        txtCausa.setText("");
        txtAcao.setText("");
        txtResponsavel.setText("");
        txtData.setText("");
        chkOk.setSelected(false);
        
        campo = "FAT_FAT";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        txtFato.setText(Info.objConexao.getBD(select, campo));
        
        campo = "FAT_CAU";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        txtCausa.setText(Info.objConexao.getBD(select, campo));
        
        campo = "FAT_ACA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        txtAcao.setText(Info.objConexao.getBD(select, campo));
        
        campo = "FAT_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        txtResponsavel.setText(Info.objConexao.getBD(select, campo));
        
        campo = "FAT_PRA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        txtData.setText(Info.objConexao.getBD(select, campo));
        
        campo = "FAT_OK";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + indCod + " = " + Info.cod + " AND " + codTab + " = " + cont;
        strAux = Info.objConexao.getBD(select, campo);
        boolean checkBool = Boolean.parseBoolean(strAux);
        chkOk.setSelected(checkBool);

    }//GEN-LAST:event_cbxDataActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        cbxData.setSelectedIndex(0);
        txtFato.setText("");
        txtCausa.setText("");
        txtAcao.setText("");
        txtResponsavel.setText("");
        txtData.setText("");
        chkOk.setSelected(false);
        
        check = 2;
    }//GEN-LAST:event_btnNovoActionPerformed

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new FatoCausaAcao().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JComboBox cbxData;
    private javax.swing.JCheckBox chkOk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAcao;
    private javax.swing.JLabel lblCausa;
    private javax.swing.JLabel lblFato;
    private javax.swing.JLabel lblPrazo;
    private javax.swing.JLabel lblResponsavel;
    private javax.swing.JTextArea txtAcao;
    private javax.swing.JTextArea txtCausa;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextArea txtFato;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtResponsavel;
    // End of variables declaration//GEN-END:variables
}
