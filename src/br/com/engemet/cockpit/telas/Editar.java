package br.com.engemet.cockpit.telas;

import javax.swing.JOptionPane;

public class Editar extends javax.swing.JFrame{
    private int cod;
    
    
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

        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 500, -1));

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        cbxIndicadores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        getContentPane().add(cbxIndicadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 490, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed
        // TODO add your handling code here:
        Indicadores indicador = new Indicadores();
        
        cod = cbxIndicadores.getSelectedIndex();
        
        indicador = new Indicadores();
        indicador.setBounds(120, 40, 1000, 730);
        indicador.setCod(cod);
        indicador.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnOkActionPerformed

    public static void main(String args[]){

        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                new Editar().setVisible(true);
            }

        });
    }

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

    public void setTexto(String texto){
        lblTexto.setText(texto);
    }
}
