package br.com.engemet.cockpit.telas;

import java.awt.Color;
import java.awt.KeyboardFocusManager;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.KeyStroke;

public class CronogramaIniciativa extends javax.swing.JFrame{

    private JLabel lblItem;
    private JLabel lblAtividade;
    private JLabel lblRealizado;
    private JLabel lblIniPeriodo;
    private JLabel lblFimPeriodo;
    private JProgressBar progresso;
    private String select, insert, tabela, campo, strCodIni, strCod;
    private int aux;
    public int verificar;
    public int cod;
    private int itensGeral = 0;
    private String strItem;
    private String strAtividade;
    private String strRealizado = "0";
    private String strIniPeriodo;
    private String strFimPeriodo;
    //private int numeroAtividade = 1;

    public CronogramaIniciativa(){
        Info.cronogramaIniciativa = this;

        initComponents();
        
        
        
        Set tab = new HashSet (1);   
    
      //Modificando o KeyStroke para avançar  
      tab.add(KeyStroke.getKeyStroke("TAB"));   

      //Criando o set para o método setFocusTraversalKeys() - shifttab  
      Set shifttab = new HashSet (1);  

      //Modificando o KeyStroke para retroceder  
      shifttab.add(KeyStroke.getKeyStroke("shift TAB"));  

      //Modificando as propriedades de foco do componente textArea  
      txtAtividades.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,tab);  
      txtAtividades.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,shifttab); 
      
      txtProdutos.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,tab);  
      txtProdutos.setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,shifttab); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProdutos = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAtividades = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxFimSem = new javax.swing.JComboBox();
        cbxFimMes = new javax.swing.JComboBox();
        cbxIniSem = new javax.swing.JComboBox();
        cbxFimAno = new javax.swing.JComboBox();
        cbxIniMes = new javax.swing.JComboBox();
        cbxIniAno = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRealizado = new javax.swing.JTextField();
        txtResponsavel = new javax.swing.JTextField();
        cbxAtividades = new javax.swing.JComboBox();
        btnAddAtividade = new javax.swing.JButton();
        btnNovaAtividade = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cronograma");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalvar.setText("Salvar Atividade");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 130, -1));

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 100, -1));

        jLabel6.setBackground(new java.awt.Color(22, 54, 92));
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Fim");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 40, 30));

        txtProdutos.setColumns(20);
        txtProdutos.setLineWrap(true);
        txtProdutos.setRows(2);
        jScrollPane1.setViewportView(txtProdutos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 400, -1));

        jLabel7.setBackground(new java.awt.Color(22, 54, 92));
        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Atividades");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 30));

        txtAtividades.setColumns(20);
        txtAtividades.setLineWrap(true);
        txtAtividades.setRows(2);
        jScrollPane2.setViewportView(txtAtividades);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, -1));

        jLabel8.setBackground(new java.awt.Color(22, 54, 92));
        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Realizado %");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 90, 30));

        jLabel9.setBackground(new java.awt.Color(22, 54, 92));
        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Período");
        jLabel9.setToolTipText("");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 30));

        jLabel10.setBackground(new java.awt.Color(22, 54, 92));
        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Início");
        jLabel10.setToolTipText("");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 40, 30));

        cbxFimSem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxFimSem.setToolTipText("Escoha uma Sexta-Feira");
        getContentPane().add(cbxFimSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 30));

        cbxFimMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(cbxFimMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, 30));

        cbxIniSem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbxIniSem.setToolTipText("Escoha uma Segunda-Feira");
        getContentPane().add(cbxIniSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, -1, 30));

        getContentPane().add(cbxFimAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 100, 30));

        cbxIniMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(cbxIniMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, -1, 30));

        getContentPane().add(cbxIniAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 100, 30));

        jLabel11.setBackground(new java.awt.Color(22, 54, 92));
        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Produtos Finais");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setOpaque(true);
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 400, 30));

        jLabel12.setBackground(new java.awt.Color(22, 54, 92));
        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Responsável");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.setOpaque(true);
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 310, 30));

        txtRealizado.setText("0");
        txtRealizado.setToolTipText("Digite um valor de 0 a 100 sem virgulas ou ponto e sem o sinal de %");
        getContentPane().add(txtRealizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 90, -1));
        getContentPane().add(txtResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 310, -1));

        cbxAtividades.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbxAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAtividadesActionPerformed(evt);
            }
        });
        getContentPane().add(cbxAtividades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        btnAddAtividade.setText("Adicionar Atividade");
        btnAddAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAtividadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 150, -1));

        btnNovaAtividade.setText("Nova Atividade");
        btnNovaAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaAtividadeActionPerformed(evt);
            }
        });
        getContentPane().add(btnNovaAtividade, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 120, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
        if(verificar == 0){
            if(JOptionPane.showConfirmDialog(null, "Você nao salvou sua atividade, deseja Salva-la?", "Adicionar Atividade", JOptionPane.YES_NO_OPTION) == 0){
                setSalvarAtividade();

                JOptionPane.showMessageDialog(null, "Atividade Salva! Preencha sua nova atividade.");
            }else{
                dispose();
            }
        }

        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        setSalvarAtividade();

        if(verificar == 0){
            verificar = 1;
        }else if(verificar == 2){
            select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
            itensGeral = Info.objConexao.getIndCod(select, campo, itensGeral);

            itensGeral--;

            setCamposEditar();

            for(int i = 1; i <= itensGeral; i++){
                setPegarAtividade(i);
                setCamposAtvidade(i, strItem, strAtividade, strRealizado, strIniPeriodo, strFimPeriodo);
            }

            verificar = 0;
        }else{
            verificar = 3;
        }

        Info.iniciativas.setDataAtualizacao();
        JOptionPane.showMessageDialog(null, "Atividade Salva!");
    }//GEN-LAST:event_btnSalvarActionPerformed

    @SuppressWarnings("unchecked")
    private void btnAddAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAtividadeActionPerformed
        // TODO add your handling code here:
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        campo = "ATI_COD";

        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
        itensGeral = Info.objConexao.getIndCod(select, campo, itensGeral);

        itensGeral--;

        if(verificar == 0 || verificar == 1){
            select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
            Info.cronogramaIniciativa.cod = Info.objConexao.getIndCod(select, campo, Info.cronogramaIniciativa.cod);
            itensGeral++;
        }
        //numeroAtividade = cod;

        if(verificar == 0 || verificar == 2){
            if(JOptionPane.showConfirmDialog(null, "Você nao salvou sua atividade, deseja Salva-la?", "Adicionar Atividade", JOptionPane.YES_NO_OPTION) == 0){
                setSalvarAtividade();

                JOptionPane.showMessageDialog(null, "Atividade Salva! Preencha sua nova atividade.");

                setCamposEditar();

                if(verificar == 0){
                    for(int i = 1; i <= itensGeral; i++){
                        setPegarAtividade(i);
                        setCamposAtvidade(i, strItem, strAtividade, strRealizado, strIniPeriodo, strFimPeriodo);
                    }
                }

                if(verificar == 0){
                    cbxAtividades.addItem(txtAtividades.getText());
                }

                txtAtividades.setText("");
                txtProdutos.setText("");
                txtResponsavel.setText("");
                txtRealizado.setText("");
                cbxIniSem.setSelectedIndex(0);
                cbxIniMes.setSelectedIndex(0);
                cbxIniAno.setSelectedIndex(0);
                cbxFimSem.setSelectedIndex(0);
                cbxFimMes.setSelectedIndex(0);
                cbxFimAno.setSelectedIndex(0);

                //numeroAtividade++;

                verificar = 0;
            }
        }else if(verificar == 1 || verificar == 3){
            JOptionPane.showMessageDialog(null, "Preencha sua nova atividade.");

            setCamposEditar();

            for(int i = 1; i <= itensGeral - 1; i++){
                setPegarAtividade(i);
                setCamposAtvidade(i, strItem, strAtividade, strRealizado, strIniPeriodo, strFimPeriodo);
            }

            if(verificar == 1){
                cbxAtividades.addItem(txtAtividades.getText());
            }
            txtAtividades.setText("");
            txtProdutos.setText("");
            txtResponsavel.setText("");
            txtRealizado.setText("");
            cbxIniSem.setSelectedIndex(0);
            cbxIniMes.setSelectedIndex(0);
            cbxIniAno.setSelectedIndex(0);
            cbxFimSem.setSelectedIndex(0);
            cbxFimMes.setSelectedIndex(0);
            cbxFimAno.setSelectedIndex(0);

            //numeroAtividade++;

            verificar = 0;
        }

    }//GEN-LAST:event_btnAddAtividadeActionPerformed

    private void cbxAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAtividadesActionPerformed
        // TODO add your handling code here:
        setEditarAtividates(cbxAtividades.getSelectedIndex());

        this.cod = cbxAtividades.getSelectedIndex();

        verificar = 2;

    }//GEN-LAST:event_cbxAtividadesActionPerformed

    private void btnNovaAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaAtividadeActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Deseja criar uma nova Atividade?", "Nova Atividade", JOptionPane.YES_NO_OPTION) == 0){
            select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
            Info.cronogramaIniciativa.cod = Info.objConexao.getIndCod(select, campo, Info.cronogramaIniciativa.cod);

            txtAtividades.setText("");
            txtProdutos.setText("");
            txtResponsavel.setText("");
            txtRealizado.setText("");
            cbxIniSem.setSelectedIndex(0);
            cbxIniMes.setSelectedIndex(0);
            cbxIniAno.setSelectedIndex(0);
            cbxFimSem.setSelectedIndex(0);
            cbxFimMes.setSelectedIndex(0);
            cbxFimAno.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Preencha sua nova atividade.");
        }
    }//GEN-LAST:event_btnNovaAtividadeActionPerformed

    private void setSalvarAtividade(){
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";

        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        aux = Info.objConexao.getIndCod(select, strCodIni, aux);
        strItem = String.valueOf(cod);

        if(aux == 1){
            insert = "INSERT INTO " + tabela + " (" + strCodIni + ", " + strCod + ") values (" + Info.iniciativas.iniCod + ", " + cod + ")";
            Info.objConexao.setBD(insert);
        }

        campo = "ATI_NOM";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtAtividades.getText() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        strAtividade = txtAtividades.getText();

        campo = "ATI_PROFIN";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtProdutos.getText() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);

        campo = "ATI_RES";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtResponsavel.getText() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);

        campo = "ATI_REA";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + txtRealizado.getText() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        strRealizado = txtRealizado.getText();

        campo = "ATI_INISEM";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxIniSem.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        campo = "ATI_INIMES";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxIniMes.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        campo = "ATI_INIANO";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxIniAno.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        strIniPeriodo = ("de: " + cbxIniSem.getSelectedItem() + "/" + cbxIniMes.getSelectedItem() + "/" + cbxIniAno.getSelectedItem());

        campo = "ATI_FIMSEM";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxFimSem.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        campo = "ATI_FIMMES";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxFimMes.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        campo = "ATI_FIMANO";
        insert = "UPDATE " + tabela + " SET " + campo + " = '" + cbxFimAno.getSelectedItem() + "' WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        Info.objConexao.setBD(insert);
        strFimPeriodo = ("a: " + cbxFimSem.getSelectedItem() + "/" + cbxFimMes.getSelectedItem() + "/" + cbxFimAno.getSelectedItem());
    }

    private void setPegarAtividade(int cod){
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";

        strItem = String.valueOf(cod);

        campo = "ATI_NOM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        strAtividade = Info.objConexao.getBD(select, campo);

        campo = "ATI_REA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        strRealizado = Info.objConexao.getBD(select, campo);

        campo = "ATI_INISEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String iniSem = Info.objConexao.getBD(select, campo);
        campo = "ATI_INIMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String iniMes = Info.objConexao.getBD(select, campo);
        campo = "ATI_INIANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String iniAno = Info.objConexao.getBD(select, campo);
        strIniPeriodo = ("de: " + iniSem + "/" + iniMes + "/" + iniAno);

        campo = "ATI_FIMSEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String fimSem = Info.objConexao.getBD(select, campo);
        campo = "ATI_FIMMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String fimMes = Info.objConexao.getBD(select, campo);
        campo = "ATI_FIMANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        String fimAno = Info.objConexao.getBD(select, campo);
        strFimPeriodo = ("a: " + fimSem + "/" + fimMes + "/" + fimAno);
    }

    @SuppressWarnings("unchecked")
    public void setComboBoxs(){
        Info.data = Info.cal.get(Calendar.YEAR);

        int data = Info.data + 10;
        String strData;

        cbxIniAno.addItem("");
        cbxFimAno.addItem("");

        for(int i = Info.data; i <= data; i++){
            strData = String.valueOf(i);
            cbxIniAno.addItem(strData);
            cbxFimAno.addItem(strData);
        }
    }

    public void setCbxAtividades(int cod){
        cbxAtividades.setSelectedIndex(cod);

        setEditarAtividates(cod);
    }

    @SuppressWarnings("unchecked")
    public void setCbxEditarAtividades(){
        String descricao;

        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";
        select = "SELECT * FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod;
        cod = Info.objConexao.getIndCod(select, strCodIni, cod);

        String[] combo = new String[cod];

        campo = "ATI_NOM";
        for(int i = 1; i < (cod); i++){
            select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + i;
            descricao = Info.objConexao.getBD(select, campo);

            combo[i] = i + " = " + descricao;

            cbxAtividades.addItem(combo[i] = i + " = " + descricao);
        }
    }

    public void setEditarAtividates(int cod){
        tabela = "IN_CRONO_ATIVIDADES";
        strCodIni = "ATI_INICOD";
        strCod = "ATI_COD";

        campo = "ATI_NOM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        txtAtividades.setText(Info.objConexao.getBD(select, campo));

        campo = "ATI_PROFIN";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        txtProdutos.setText(Info.objConexao.getBD(select, campo));

        campo = "ATI_RES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        txtResponsavel.setText(Info.objConexao.getBD(select, campo));

        campo = "ATI_REA";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        txtRealizado.setText(Info.objConexao.getBD(select, campo));

        campo = "ATI_INISEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxIniSem.setSelectedItem(Info.objConexao.getBD(select, campo));

        campo = "ATI_INIMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxIniMes.setSelectedItem(Info.objConexao.getBD(select, campo));

        campo = "ATI_INIANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxIniAno.setSelectedItem(Info.objConexao.getBD(select, campo));

        campo = "ATI_FIMSEM";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxFimSem.setSelectedItem(Info.objConexao.getBD(select, campo));

        campo = "ATI_FIMMES";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxFimMes.setSelectedItem(Info.objConexao.getBD(select, campo));

        campo = "ATI_FIMANO";
        select = "SELECT " + campo + " FROM " + tabela + " WHERE " + strCodIni + " = " + Info.iniciativas.iniCod + " AND " + strCod + " = " + cod;
        cbxFimAno.setSelectedItem(Info.objConexao.getBD(select, campo));
    }

    public void setCamposAtvidade(int numeroAtividade, String strItem, String strAtividade, String strRealizado, String strIniPeriodo, String strFimPeriodo){
        lblItem = new JLabel();
        lblAtividade = new JLabel();
        lblRealizado = new JLabel();
        lblIniPeriodo = new JLabel();
        lblFimPeriodo = new JLabel();
        progresso = new JProgressBar(0, 100);
        int intProgresso;

        int x, y, width, height;

        lblItem.setText(strItem);
        lblAtividade.setText(strAtividade);
        lblRealizado.setText(strRealizado);
        lblIniPeriodo.setText(strIniPeriodo);
        lblFimPeriodo.setText(strFimPeriodo);

        if(strRealizado == null || strRealizado.equals("")){
            intProgresso = 0;
        }else{
            intProgresso = Integer.parseInt(strRealizado);
        }

        y = 0;

        if(numeroAtividade > 1){
            numeroAtividade--;
            y = (numeroAtividade * 60) + 0;
            numeroAtividade++;
        }

        width = 40;
        height = 60;
        x = 0;
        lblItem.setBackground(new Color(255, 255, 255));
        lblItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblItem.setOpaque(true);
        lblItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.iniciativas.setJPanel4(lblItem, x, y, width, height);

        width = 300;
        height = 60;
        x = 40;
        lblAtividade.setBackground(new Color(255, 255, 255));
        lblAtividade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblAtividade.setOpaque(true);
        lblAtividade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.iniciativas.setJPanel4(lblAtividade, x, y, width, height);

        width = 90;
        height = 60;
        x = 340;
        lblRealizado.setBackground(new Color(255, 255, 255));
        lblRealizado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblRealizado.setOpaque(true);
        lblRealizado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.iniciativas.setJPanel4(lblRealizado, x, y, width, height);

        width = 330;
        height = 30;
        x = 430;
        lblIniPeriodo.setBackground(new Color(255, 255, 255));
        lblIniPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblIniPeriodo.setOpaque(true);
        lblIniPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.iniciativas.setJPanel4(lblIniPeriodo, x, y, width, height);

        width = 330;
        height = 30;
        x = 430;
        y += 30;
        lblFimPeriodo.setBackground(new Color(255, 255, 255));
        lblFimPeriodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFimPeriodo.setOpaque(true);
        lblFimPeriodo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.iniciativas.setJPanel4(lblFimPeriodo, x, y, width, height);
        y -= 30;

        width = 200;
        height = 60;
        x = 760;
        progresso.setValue(intProgresso);
        Info.iniciativas.setJPanel4(progresso, x, y, width, height);

        Info.iniciativas.validate();
        Info.iniciativas.repaint();
    }

    public void setCamposEditar(){
        Info.iniciativas.removeJPanel4();
        Info.iniciativas.validate();
        Info.iniciativas.repaint();
    }
//    public static void main(String args[]){
//
//        java.awt.EventQueue.invokeLater(new Runnable(){
//            public void run(){
//                new CronogramaIniciativa().setVisible(true);
//            }
//
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAtividade;
    private javax.swing.JButton btnFechar;
    private javax.swing.JToggleButton btnNovaAtividade;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxAtividades;
    private javax.swing.JComboBox cbxFimAno;
    private javax.swing.JComboBox cbxFimMes;
    private javax.swing.JComboBox cbxFimSem;
    private javax.swing.JComboBox cbxIniAno;
    private javax.swing.JComboBox cbxIniMes;
    private javax.swing.JComboBox cbxIniSem;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAtividades;
    private javax.swing.JTextArea txtProdutos;
    private javax.swing.JTextField txtRealizado;
    private javax.swing.JTextField txtResponsavel;
    // End of variables declaration//GEN-END:variables
}
