package br.com.engemet.cockpit.telas;

import br.com.engemet.cockpit.oracle.Conexao;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;

public class Editar extends javax.swing.JFrame{
    private int cod;
    private Indicadores indicador;
    private Iniciativas iniciativa;
    private CronogramaIniciativa cronogramaIniciativa;
    private String nomeEditar;
    
    public Editar(){
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTexto = new javax.swing.JLabel();
        btnOk = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cbxIndicadores = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTexto.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 590, 0));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        cbxIndicadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        getContentPane().add(cbxIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 590, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here
        if(nomeEditar.equals("Editar Indicadores")){
            cod = cbxIndicadores.getSelectedIndex();
        
            indicador = new Indicadores();
            indicador.setBounds(120, 20, 1000, 730);
            indicador.setCod(cod);
            indicador.setVisible(true);

            this.dispose();
        }else if(nomeEditar.equals("Editar Iniciativa")){
            cod = cbxIndicadores.getSelectedIndex();

            iniciativa = new Iniciativas();
            iniciativa.setBounds(110, 0, 1050, 710);
            iniciativa.setEditarIniciativa(cod);
            iniciativa.setDataAtualizacao();
            iniciativa.setVisible(true);
            
            this.dispose();
        }else if(nomeEditar.equals("Consultar Iniciativa")){
            cod = cbxIndicadores.getSelectedIndex();

            iniciativa = new Iniciativas();
            iniciativa.setBounds(110, 0, 1050, 710);
            iniciativa.setConsultarIniciativa(cod);
            iniciativa.setDataAtualizacao();
            iniciativa.consultarIniciativa();
            iniciativa.setVisible(true);
            
            this.dispose();
        }else if(nomeEditar.equals("Editar Atividades")){
            cod = cbxIndicadores.getSelectedIndex();
            
            cronogramaIniciativa = new CronogramaIniciativa();
            cronogramaIniciativa.setComboBoxs();
            cronogramaIniciativa.setCbxEditarAtividades();
            cronogramaIniciativa.setCbxAtividades(cod);
            cronogramaIniciativa.setBounds(440, 200, 450, 450);
            cronogramaIniciativa.verificar = 0;
            cronogramaIniciativa.setVisible(true);
            
            this.dispose();
        }else if(nomeEditar.equals("Imprimir / Exportar Indicadores")){
            cod = cbxIndicadores.getSelectedIndex();
            
            InputStream inputStream = getClass().getResourceAsStream("/InfGerais.jasper");
        
            Map<String, Object> parametros = new HashMap<String,Object>();

            parametros.put("PAR_INDCOD", cod);

            try{        
                Info.openReport("Iformações Gerais", inputStream, parametros, Conexao.getBDCockpit());
            }catch(SQLException ex){
                ex.printStackTrace();
            }catch(JRException ex){
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            dispose();
        }
        
        
    }//GEN-LAST:event_btnOkActionPerformed
    
    /*
    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new EditarIniciativa().setVisible(true);
            }

        });
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnOk;
    private javax.swing.JComboBox cbxIndicadores;
    private javax.swing.JLabel lblTexto;
    // End of variables declaration//GEN-END:variables
    
    @SuppressWarnings("unchecked")
    public void setCbxIndicadores(String combo){
        cbxIndicadores.addItem(combo);
    }
    
    public int getCbxIndicadores(){
        return cbxIndicadores.getSelectedIndex();
    }
    
    public void setNomeEditar(String nomeEditar){
        this.nomeEditar = nomeEditar;
    }
    
    public void setTexto(String texto){
        lblTexto.setText(texto);
    }
}
