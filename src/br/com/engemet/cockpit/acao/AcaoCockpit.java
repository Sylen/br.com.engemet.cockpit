package br.com.engemet.cockpit.acao;

import br.com.engemet.cockpit.telas.Cockpit;
import br.com.engemet.cockpit.telas.SGI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

public class AcaoCockpit implements ActionListener{

    private Cockpit cockpit = new Cockpit();
    private SGI sgi = new SGI();
    private int altura = 680;
    private int largura = 1260;
    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e){
        JMenuItem btns = (JMenuItem) e.getSource();

        if(btns.getActionCommand().equals(CockpitStrings.Cockpit[0])){
            cockpit.setBounds(20, 5, largura, altura);
            cockpit.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            cockpit.setVisible(true);
            cockpit.setBtnPn1Obj1(CockpitStrings.objetivosFinancas[0]);
            cockpit.setBtnPn1Ind1(CockpitStrings.indicadoresPn1Financas[0]);
            cockpit.setBtnPn1Ind2(CockpitStrings.indicadoresPn1Financas[1]);
            cockpit.setBtnPn1Ind3(CockpitStrings.indicadoresPn1Financas[2]);
            cockpit.setBtnPn1Ind4(CockpitStrings.indicadoresPn1Financas[3]);
            cockpit.setBtnPn1Ind5(CockpitStrings.indicadoresPn1Financas[4]);
            cockpit.setBtnPn1Ind6(CockpitStrings.indicadoresPn1Financas[5]);

            cockpit.setBtnPn2Obj2(CockpitStrings.objetivosFinancas[1]);
            cockpit.setBtnPn2Ind1(CockpitStrings.indicadoresPn2Financas[0]);
            cockpit.setBtnPn2Ind2(CockpitStrings.indicadoresPn2Financas[1]);
            cockpit.setBtnPn2Ind3(CockpitStrings.indicadoresPn2Financas[2]);
            cockpit.setBtnPn2Ind4(CockpitStrings.indicadoresPn2Financas[3]);
            cockpit.setBtnPn2Ind5(CockpitStrings.indicadoresPn2Financas[4]);
            cockpit.setBtnPn2Ind6(CockpitStrings.indicadoresPn2Financas[5]);

            cockpit.setBtnPn3Obj3(CockpitStrings.objetivosFinancas[2]);
            cockpit.setBtnPn3Ind1(CockpitStrings.indicadoresPn3Financas[0]);
            cockpit.setBtnPn3Ind2(CockpitStrings.indicadoresPn3Financas[1]);
            cockpit.setBtnPn3Ind3(CockpitStrings.indicadoresPn3Financas[2]);
            cockpit.setBtnPn3Ind4(CockpitStrings.indicadoresPn3Financas[3]);
            cockpit.setBtnPn3Ind5(CockpitStrings.indicadoresPn3Financas[4]);
            cockpit.setBtnPn3Ind6(CockpitStrings.indicadoresPn3Financas[5]);

            cockpit.setBtnPn4Obj4(CockpitStrings.objetivosFinancas[3]);
            cockpit.setBtnPn4Ind1(CockpitStrings.indicadoresPn4Financas[0]);
            cockpit.setBtnPn4Ind2(CockpitStrings.indicadoresPn4Financas[1]);
            cockpit.setBtnPn4Ind3(CockpitStrings.indicadoresPn4Financas[2]);
            cockpit.setBtnPn4Ind4(CockpitStrings.indicadoresPn4Financas[3]);
            cockpit.setBtnPn4Ind5(CockpitStrings.indicadoresPn4Financas[4]);
            cockpit.setBtnPn4Ind6(CockpitStrings.indicadoresPn4Financas[5]);

            cockpit.setBtnPn5Obj5(CockpitStrings.objetivosFinancas[4]);
            cockpit.setBtnPn5Ind1(CockpitStrings.indicadoresPn5Financas[0]);
            cockpit.setBtnPn5Ind2(CockpitStrings.indicadoresPn5Financas[1]);
            cockpit.setBtnPn5Ind3(CockpitStrings.indicadoresPn5Financas[2]);
            cockpit.setBtnPn5Ind4(CockpitStrings.indicadoresPn5Financas[3]);
            cockpit.setBtnPn5Ind5(CockpitStrings.indicadoresPn5Financas[4]);
            cockpit.setBtnPn5Ind6(CockpitStrings.indicadoresPn5Financas[5]);

            cockpit.setBtnPn6Obj6(CockpitStrings.objetivosFinancas[5]);
            cockpit.setBtnPn6Ind1(CockpitStrings.indicadoresPn6Financas[0]);
            cockpit.setBtnPn6Ind2(CockpitStrings.indicadoresPn6Financas[1]);
            cockpit.setBtnPn6Ind3(CockpitStrings.indicadoresPn6Financas[2]);
            cockpit.setBtnPn6Ind4(CockpitStrings.indicadoresPn6Financas[3]);
            cockpit.setBtnPn6Ind5(CockpitStrings.indicadoresPn6Financas[4]);
            cockpit.setBtnPn6Ind6(CockpitStrings.indicadoresPn6Financas[5]);
            
            cockpit.setActionBtnPn1Obj1(CockpitStrings.objetivosFinancas[0]);
            cockpit.setActionBtnPn1Ind1(CockpitStrings.indicadoresPn1Financas[0]);
            cockpit.setActionBtnPn1Ind2(CockpitStrings.indicadoresPn1Financas[1]);
            cockpit.setActionBtnPn1Ind3(CockpitStrings.indicadoresPn1Financas[2]);
            cockpit.setActionBtnPn1Ind4(CockpitStrings.indicadoresPn1Financas[3]);
            cockpit.setActionBtnPn1Ind5(CockpitStrings.indicadoresPn1Financas[4]);
            cockpit.setActionBtnPn1Ind6(CockpitStrings.indicadoresPn1Financas[5]);

            cockpit.setActionBtnPn2Obj2(CockpitStrings.objetivosFinancas[1]);
            cockpit.setActionBtnPn2Ind1(CockpitStrings.indicadoresPn2Financas[0]);
            cockpit.setActionBtnPn2Ind2(CockpitStrings.indicadoresPn2Financas[1]);
            cockpit.setActionBtnPn2Ind3(CockpitStrings.indicadoresPn2Financas[2]);
            cockpit.setActionBtnPn2Ind4(CockpitStrings.indicadoresPn2Financas[3]);
            cockpit.setActionBtnPn2Ind5(CockpitStrings.indicadoresPn2Financas[4]);
            cockpit.setActionBtnPn2Ind6(CockpitStrings.indicadoresPn2Financas[5]);

            cockpit.setActionBtnPn3Obj3(CockpitStrings.objetivosFinancas[2]);
            cockpit.setActionBtnPn3Ind1(CockpitStrings.indicadoresPn3Financas[0]);
            cockpit.setActionBtnPn3Ind2(CockpitStrings.indicadoresPn3Financas[1]);
            cockpit.setActionBtnPn3Ind3(CockpitStrings.indicadoresPn3Financas[2]);
            cockpit.setActionBtnPn3Ind4(CockpitStrings.indicadoresPn3Financas[3]);
            cockpit.setActionBtnPn3Ind5(CockpitStrings.indicadoresPn3Financas[4]);
            cockpit.setActionBtnPn3Ind6(CockpitStrings.indicadoresPn3Financas[5]);

            cockpit.setActionBtnPn4Obj4(CockpitStrings.objetivosFinancas[3]);
            cockpit.setActionBtnPn4Ind1(CockpitStrings.indicadoresPn4Financas[0]);
            cockpit.setActionBtnPn4Ind2(CockpitStrings.indicadoresPn4Financas[1]);
            cockpit.setActionBtnPn4Ind3(CockpitStrings.indicadoresPn4Financas[2]);
            cockpit.setActionBtnPn4Ind4(CockpitStrings.indicadoresPn4Financas[3]);
            cockpit.setActionBtnPn4Ind5(CockpitStrings.indicadoresPn4Financas[4]);
            cockpit.setActionBtnPn4Ind6(CockpitStrings.indicadoresPn4Financas[5]);

            cockpit.setActionBtnPn5Obj5(CockpitStrings.objetivosFinancas[4]);
            cockpit.setActionBtnPn5Ind1(CockpitStrings.indicadoresPn5Financas[0]);
            cockpit.setActionBtnPn5Ind2(CockpitStrings.indicadoresPn5Financas[1]);
            cockpit.setActionBtnPn5Ind3(CockpitStrings.indicadoresPn5Financas[2]);
            cockpit.setActionBtnPn5Ind4(CockpitStrings.indicadoresPn5Financas[3]);
            cockpit.setActionBtnPn5Ind5(CockpitStrings.indicadoresPn5Financas[4]);
            cockpit.setActionBtnPn5Ind6(CockpitStrings.indicadoresPn5Financas[5]);

            cockpit.setActionBtnPn6Obj6(CockpitStrings.objetivosFinancas[5]);
            cockpit.setActionBtnPn6Ind1(CockpitStrings.indicadoresPn6Financas[0]);
            cockpit.setActionBtnPn6Ind2(CockpitStrings.indicadoresPn6Financas[1]);
            cockpit.setActionBtnPn6Ind3(CockpitStrings.indicadoresPn6Financas[2]);
            cockpit.setActionBtnPn6Ind4(CockpitStrings.indicadoresPn6Financas[3]);
            cockpit.setActionBtnPn6Ind5(CockpitStrings.indicadoresPn6Financas[4]);
            cockpit.setActionBtnPn6Ind6(CockpitStrings.indicadoresPn6Financas[5]);
            
            cockpit.setVisiblePn1Ind1(true);
            cockpit.setVisiblePn1Ind2(true);
            cockpit.setVisiblePn1Ind3(true);
            cockpit.setVisiblePn1Ind4(true);
            cockpit.setVisiblePn1Ind5(true);
            cockpit.setVisiblePn1Ind6(true);
            
            cockpit.setVisiblePn2Ind1(true);
            cockpit.setVisiblePn2Ind2(true);
            cockpit.setVisiblePn2Ind3(true);
            cockpit.setVisiblePn2Ind4(true);
            cockpit.setVisiblePn2Ind5(true);
            cockpit.setVisiblePn2Ind6(true);
            
            cockpit.setVisiblePn3Ind1(true);
            cockpit.setVisiblePn3Ind2(true);
            cockpit.setVisiblePn3Ind3(true);
            cockpit.setVisiblePn3Ind4(true);
            cockpit.setVisiblePn3Ind5(true);
            cockpit.setVisiblePn3Ind6(true);
            
            cockpit.setVisiblePn4Ind1(true);
            cockpit.setVisiblePn4Ind2(true);
            cockpit.setVisiblePn4Ind3(true);
            cockpit.setVisiblePn4Ind4(true);
            cockpit.setVisiblePn4Ind5(true);
            cockpit.setVisiblePn4Ind6(true);
            
            cockpit.setVisiblePn5Ind1(true);
            cockpit.setVisiblePn5Ind2(true);
            cockpit.setVisiblePn5Ind3(true);
            cockpit.setVisiblePn5Ind4(true);
            cockpit.setVisiblePn5Ind5(true);
            cockpit.setVisiblePn5Ind6(false);
            
            cockpit.setVisiblePn6Ind1(true);
            cockpit.setVisiblePn6Ind2(true);
            cockpit.setVisiblePn6Ind3(true);
            cockpit.setVisiblePn6Ind4(true);
            cockpit.setVisiblePn6Ind5(true);
            cockpit.setVisiblePn6Ind6(true);
            
        } else if(btns.getActionCommand().equals(CockpitStrings.Cockpit[1])){
            cockpit.setBounds(20, 5, largura, altura);
            cockpit.setVisible(true);
            cockpit.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            cockpit.setBtnPn1Obj1(CockpitStrings.objetivosClientes[0]);
            cockpit.setBtnPn1Ind1(CockpitStrings.indicadoresPn1Clientes[0]);
            cockpit.setBtnPn1Ind2(CockpitStrings.indicadoresPn1Clientes[1]);
            cockpit.setBtnPn1Ind3(CockpitStrings.indicadoresPn1Clientes[2]);
            cockpit.setBtnPn1Ind4(CockpitStrings.indicadoresPn1Clientes[3]);
            cockpit.setBtnPn1Ind5(CockpitStrings.indicadoresPn1Clientes[4]);
            cockpit.setBtnPn1Ind6(CockpitStrings.indicadoresPn1Clientes[5]);

            cockpit.setBtnPn2Obj2(CockpitStrings.objetivosClientes[1]);
            cockpit.setBtnPn2Ind1(CockpitStrings.indicadoresPn2Clientes[0]);
            cockpit.setBtnPn2Ind2(CockpitStrings.indicadoresPn2Clientes[1]);
            cockpit.setBtnPn2Ind3(CockpitStrings.indicadoresPn2Clientes[2]);
            cockpit.setBtnPn2Ind4(CockpitStrings.indicadoresPn2Clientes[3]);
            cockpit.setBtnPn2Ind5(CockpitStrings.indicadoresPn2Clientes[4]);
            cockpit.setBtnPn2Ind6(CockpitStrings.indicadoresPn2Clientes[5]);

            cockpit.setBtnPn3Obj3(CockpitStrings.objetivosClientes[2]);
            cockpit.setBtnPn3Ind1(CockpitStrings.indicadoresPn3Clientes[0]);
            cockpit.setBtnPn3Ind2(CockpitStrings.indicadoresPn3Clientes[1]);
            cockpit.setBtnPn3Ind3(CockpitStrings.indicadoresPn3Clientes[2]);
            cockpit.setBtnPn3Ind4(CockpitStrings.indicadoresPn3Clientes[3]);
            cockpit.setBtnPn3Ind5(CockpitStrings.indicadoresPn3Clientes[4]);
            cockpit.setBtnPn3Ind6(CockpitStrings.indicadoresPn3Clientes[5]);

            cockpit.setBtnPn4Obj4(CockpitStrings.objetivosClientes[3]);
            cockpit.setBtnPn4Ind1(CockpitStrings.indicadoresPn4Clientes[0]);
            cockpit.setBtnPn4Ind2(CockpitStrings.indicadoresPn4Clientes[1]);
            cockpit.setBtnPn4Ind3(CockpitStrings.indicadoresPn4Clientes[2]);
            cockpit.setBtnPn4Ind4(CockpitStrings.indicadoresPn4Clientes[3]);
            cockpit.setBtnPn4Ind5(CockpitStrings.indicadoresPn4Clientes[4]);
            cockpit.setBtnPn4Ind6(CockpitStrings.indicadoresPn4Clientes[5]);

            cockpit.setBtnPn5Obj5(CockpitStrings.objetivosClientes[4]);
            cockpit.setBtnPn5Ind1(CockpitStrings.indicadoresPn5Clientes[0]);
            cockpit.setBtnPn5Ind2(CockpitStrings.indicadoresPn5Clientes[1]);
            cockpit.setBtnPn5Ind3(CockpitStrings.indicadoresPn5Clientes[2]);
            cockpit.setBtnPn5Ind4(CockpitStrings.indicadoresPn5Clientes[3]);
            cockpit.setBtnPn5Ind5(CockpitStrings.indicadoresPn5Clientes[4]);
            cockpit.setBtnPn5Ind6(CockpitStrings.indicadoresPn5Clientes[5]);

            cockpit.setBtnPn6Obj6(CockpitStrings.objetivosClientes[5]);
            cockpit.setBtnPn6Ind1(CockpitStrings.indicadoresPn6Clientes[0]);
            cockpit.setBtnPn6Ind2(CockpitStrings.indicadoresPn6Clientes[1]);
            cockpit.setBtnPn6Ind3(CockpitStrings.indicadoresPn6Clientes[2]);
            cockpit.setBtnPn6Ind4(CockpitStrings.indicadoresPn6Clientes[3]);
            cockpit.setBtnPn6Ind5(CockpitStrings.indicadoresPn6Clientes[4]);
            cockpit.setBtnPn6Ind6(CockpitStrings.indicadoresPn6Clientes[5]);
            
            cockpit.setActionBtnPn1Obj1(CockpitStrings.objetivosClientes[0]);
            cockpit.setActionBtnPn1Ind1(CockpitStrings.indicadoresPn1Clientes[0]);
            cockpit.setActionBtnPn1Ind2(CockpitStrings.indicadoresPn1Clientes[1]);
            cockpit.setActionBtnPn1Ind3(CockpitStrings.indicadoresPn1Clientes[2]);
            cockpit.setActionBtnPn1Ind4(CockpitStrings.indicadoresPn1Clientes[3]);
            cockpit.setActionBtnPn1Ind5(CockpitStrings.indicadoresPn1Clientes[4]);
            cockpit.setActionBtnPn1Ind6(CockpitStrings.indicadoresPn1Clientes[5]);

            cockpit.setActionBtnPn2Obj2(CockpitStrings.objetivosClientes[1]);
            cockpit.setActionBtnPn2Ind1(CockpitStrings.indicadoresPn2Clientes[0]);
            cockpit.setActionBtnPn2Ind2(CockpitStrings.indicadoresPn2Clientes[1]);
            cockpit.setActionBtnPn2Ind3(CockpitStrings.indicadoresPn2Clientes[2]);
            cockpit.setActionBtnPn2Ind4(CockpitStrings.indicadoresPn2Clientes[3]);
            cockpit.setActionBtnPn2Ind5(CockpitStrings.indicadoresPn2Clientes[4]);
            cockpit.setActionBtnPn2Ind6(CockpitStrings.indicadoresPn2Clientes[5]);

            cockpit.setActionBtnPn3Obj3(CockpitStrings.objetivosClientes[2]);
            cockpit.setActionBtnPn3Ind1(CockpitStrings.indicadoresPn3Clientes[0]);
            cockpit.setActionBtnPn3Ind2(CockpitStrings.indicadoresPn3Clientes[1]);
            cockpit.setActionBtnPn3Ind3(CockpitStrings.indicadoresPn3Clientes[2]);
            cockpit.setActionBtnPn3Ind4(CockpitStrings.indicadoresPn3Clientes[3]);
            cockpit.setActionBtnPn3Ind5(CockpitStrings.indicadoresPn3Clientes[4]);
            cockpit.setActionBtnPn3Ind6(CockpitStrings.indicadoresPn3Clientes[5]);

            cockpit.setActionBtnPn4Obj4(CockpitStrings.objetivosClientes[3]);
            cockpit.setActionBtnPn4Ind1(CockpitStrings.indicadoresPn4Clientes[0]);
            cockpit.setActionBtnPn4Ind2(CockpitStrings.indicadoresPn4Clientes[1]);
            cockpit.setActionBtnPn4Ind3(CockpitStrings.indicadoresPn4Clientes[2]);
            cockpit.setActionBtnPn4Ind4(CockpitStrings.indicadoresPn4Clientes[3]);
            cockpit.setActionBtnPn4Ind5(CockpitStrings.indicadoresPn4Clientes[4]);
            cockpit.setActionBtnPn4Ind6(CockpitStrings.indicadoresPn4Clientes[5]);

            cockpit.setActionBtnPn5Obj5(CockpitStrings.objetivosClientes[4]);
            cockpit.setActionBtnPn5Ind1(CockpitStrings.indicadoresPn5Clientes[0]);
            cockpit.setActionBtnPn5Ind2(CockpitStrings.indicadoresPn5Clientes[1]);
            cockpit.setActionBtnPn5Ind3(CockpitStrings.indicadoresPn5Clientes[2]);
            cockpit.setActionBtnPn5Ind4(CockpitStrings.indicadoresPn5Clientes[3]);
            cockpit.setActionBtnPn5Ind5(CockpitStrings.indicadoresPn5Clientes[4]);
            cockpit.setActionBtnPn5Ind6(CockpitStrings.indicadoresPn5Clientes[5]);

            cockpit.setActionBtnPn6Obj6(CockpitStrings.objetivosClientes[5]);
            cockpit.setActionBtnPn6Ind1(CockpitStrings.indicadoresPn6Clientes[0]);
            cockpit.setActionBtnPn6Ind2(CockpitStrings.indicadoresPn6Clientes[1]);
            cockpit.setActionBtnPn6Ind3(CockpitStrings.indicadoresPn6Clientes[2]);
            cockpit.setActionBtnPn6Ind4(CockpitStrings.indicadoresPn6Clientes[3]);
            cockpit.setActionBtnPn6Ind5(CockpitStrings.indicadoresPn6Clientes[4]);
            cockpit.setActionBtnPn6Ind6(CockpitStrings.indicadoresPn6Clientes[5]);
            
            cockpit.setVisiblePn1Ind1(true);
            cockpit.setVisiblePn1Ind2(true);
            cockpit.setVisiblePn1Ind3(true);
            cockpit.setVisiblePn1Ind4(true);
            cockpit.setVisiblePn1Ind5(true);
            cockpit.setVisiblePn1Ind6(true);
            
            cockpit.setVisiblePn2Ind1(true);
            cockpit.setVisiblePn2Ind2(true);
            cockpit.setVisiblePn2Ind3(true);
            cockpit.setVisiblePn2Ind4(true);
            cockpit.setVisiblePn2Ind5(true);
            cockpit.setVisiblePn2Ind6(true);
            
            cockpit.setVisiblePn3Ind1(false);
            cockpit.setVisiblePn3Ind2(true);
            cockpit.setVisiblePn3Ind3(true);
            cockpit.setVisiblePn3Ind4(true);
            cockpit.setVisiblePn3Ind5(true);
            cockpit.setVisiblePn3Ind6(false);
            
            cockpit.setVisiblePn4Ind1(true);
            cockpit.setVisiblePn4Ind2(true);
            cockpit.setVisiblePn4Ind3(true);
            cockpit.setVisiblePn4Ind4(true);
            cockpit.setVisiblePn4Ind5(true);
            cockpit.setVisiblePn4Ind6(true);
            
            cockpit.setVisiblePn5Ind1(true);
            cockpit.setVisiblePn5Ind2(true);
            cockpit.setVisiblePn5Ind3(true);
            cockpit.setVisiblePn5Ind4(true);
            cockpit.setVisiblePn5Ind5(true);
            cockpit.setVisiblePn5Ind6(true);
            
            cockpit.setVisiblePn6Ind1(false);
            cockpit.setVisiblePn6Ind2(true);
            cockpit.setVisiblePn6Ind3(true);
            cockpit.setVisiblePn6Ind4(true);
            cockpit.setVisiblePn6Ind5(true);
            cockpit.setVisiblePn6Ind6(false);
            
        }else if(btns.getActionCommand().equals(CockpitStrings.Cockpit[2])){
            cockpit.setBounds(20, 5, largura, altura);
            cockpit.setVisible(true);
            cockpit.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            cockpit.setBtnPn1Obj1(CockpitStrings.objetivosProcessos[0]);
            cockpit.setBtnPn1Ind1(CockpitStrings.indicadoresPn1Processos[0]);
            cockpit.setBtnPn1Ind2(CockpitStrings.indicadoresPn1Processos[1]);
            cockpit.setBtnPn1Ind3(CockpitStrings.indicadoresPn1Processos[2]);
            cockpit.setBtnPn1Ind4(CockpitStrings.indicadoresPn1Processos[3]);
            cockpit.setBtnPn1Ind5(CockpitStrings.indicadoresPn1Processos[4]);
            cockpit.setBtnPn1Ind6(CockpitStrings.indicadoresPn1Processos[5]);

            cockpit.setBtnPn2Obj2(CockpitStrings.objetivosProcessos[1]);
            cockpit.setBtnPn2Ind1(CockpitStrings.indicadoresPn2Processos[0]);
            cockpit.setBtnPn2Ind2(CockpitStrings.indicadoresPn2Processos[1]);
            cockpit.setBtnPn2Ind3(CockpitStrings.indicadoresPn2Processos[2]);
            cockpit.setBtnPn2Ind4(CockpitStrings.indicadoresPn2Processos[3]);
            cockpit.setBtnPn2Ind5(CockpitStrings.indicadoresPn2Processos[4]);
            cockpit.setBtnPn2Ind6(CockpitStrings.indicadoresPn2Processos[5]);

            cockpit.setBtnPn3Obj3(CockpitStrings.objetivosProcessos[2]);
            cockpit.setBtnPn3Ind1(CockpitStrings.indicadoresPn3Processos[0]);
            cockpit.setBtnPn3Ind2(CockpitStrings.indicadoresPn3Processos[1]);
            cockpit.setBtnPn3Ind3(CockpitStrings.indicadoresPn3Processos[2]);
            cockpit.setBtnPn3Ind4(CockpitStrings.indicadoresPn3Processos[3]);
            cockpit.setBtnPn3Ind5(CockpitStrings.indicadoresPn3Processos[4]);
            cockpit.setBtnPn3Ind6(CockpitStrings.indicadoresPn3Processos[5]);

            cockpit.setBtnPn4Obj4(CockpitStrings.objetivosProcessos[3]);
            cockpit.setBtnPn4Ind1(CockpitStrings.indicadoresPn4Processos[0]);
            cockpit.setBtnPn4Ind2(CockpitStrings.indicadoresPn4Processos[1]);
            cockpit.setBtnPn4Ind3(CockpitStrings.indicadoresPn4Processos[2]);
            cockpit.setBtnPn4Ind4(CockpitStrings.indicadoresPn4Processos[3]);
            cockpit.setBtnPn4Ind5(CockpitStrings.indicadoresPn4Processos[4]);
            cockpit.setBtnPn4Ind6(CockpitStrings.indicadoresPn4Processos[5]);

            cockpit.setBtnPn5Obj5(CockpitStrings.objetivosProcessos[4]);
            cockpit.setBtnPn5Ind1(CockpitStrings.indicadoresPn5Processos[0]);
            cockpit.setBtnPn5Ind2(CockpitStrings.indicadoresPn5Processos[1]);
            cockpit.setBtnPn5Ind3(CockpitStrings.indicadoresPn5Processos[2]);
            cockpit.setBtnPn5Ind4(CockpitStrings.indicadoresPn5Processos[3]);
            cockpit.setBtnPn5Ind5(CockpitStrings.indicadoresPn5Processos[4]);
            cockpit.setBtnPn5Ind6(CockpitStrings.indicadoresPn5Processos[5]);

            cockpit.setBtnPn6Obj6(CockpitStrings.objetivosProcessos[5]);
            cockpit.setBtnPn6Ind1(CockpitStrings.indicadoresPn6Processos[0]);
            cockpit.setBtnPn6Ind2(CockpitStrings.indicadoresPn6Processos[1]);
            cockpit.setBtnPn6Ind3(CockpitStrings.indicadoresPn6Processos[2]);
            cockpit.setBtnPn6Ind4(CockpitStrings.indicadoresPn6Processos[3]);
            cockpit.setBtnPn6Ind5(CockpitStrings.indicadoresPn6Processos[4]);
            cockpit.setBtnPn6Ind6(CockpitStrings.indicadoresPn6Processos[5]);
            
            cockpit.setActionBtnPn1Obj1(CockpitStrings.objetivosProcessos[0]);
            cockpit.setActionBtnPn1Ind1(CockpitStrings.indicadoresPn1Processos[0]);
            cockpit.setActionBtnPn1Ind2(CockpitStrings.indicadoresPn1Processos[1]);
            cockpit.setActionBtnPn1Ind3(CockpitStrings.indicadoresPn1Processos[2]);
            cockpit.setActionBtnPn1Ind4(CockpitStrings.indicadoresPn1Processos[3]);
            cockpit.setActionBtnPn1Ind5(CockpitStrings.indicadoresPn1Processos[4]);
            cockpit.setActionBtnPn1Ind6(CockpitStrings.indicadoresPn1Processos[5]);

            cockpit.setActionBtnPn2Obj2(CockpitStrings.objetivosProcessos[1]);
            cockpit.setActionBtnPn2Ind1(CockpitStrings.indicadoresPn2Processos[0]);
            cockpit.setActionBtnPn2Ind2(CockpitStrings.indicadoresPn2Processos[1]);
            cockpit.setActionBtnPn2Ind3(CockpitStrings.indicadoresPn2Processos[2]);
            cockpit.setActionBtnPn2Ind4(CockpitStrings.indicadoresPn2Processos[3]);
            cockpit.setActionBtnPn2Ind5(CockpitStrings.indicadoresPn2Processos[4]);
            cockpit.setActionBtnPn2Ind6(CockpitStrings.indicadoresPn2Processos[5]);

            cockpit.setActionBtnPn3Obj3(CockpitStrings.objetivosProcessos[2]);
            cockpit.setActionBtnPn3Ind1(CockpitStrings.indicadoresPn3Processos[0]);
            cockpit.setActionBtnPn3Ind2(CockpitStrings.indicadoresPn3Processos[1]);
            cockpit.setActionBtnPn3Ind3(CockpitStrings.indicadoresPn3Processos[2]);
            cockpit.setActionBtnPn3Ind4(CockpitStrings.indicadoresPn3Processos[3]);
            cockpit.setActionBtnPn3Ind5(CockpitStrings.indicadoresPn3Processos[4]);
            cockpit.setActionBtnPn3Ind6(CockpitStrings.indicadoresPn3Processos[5]);

            cockpit.setActionBtnPn4Obj4(CockpitStrings.objetivosProcessos[3]);
            cockpit.setActionBtnPn4Ind1(CockpitStrings.indicadoresPn4Processos[0]);
            cockpit.setActionBtnPn4Ind2(CockpitStrings.indicadoresPn4Processos[1]);
            cockpit.setActionBtnPn4Ind3(CockpitStrings.indicadoresPn4Processos[2]);
            cockpit.setActionBtnPn4Ind4(CockpitStrings.indicadoresPn4Processos[3]);
            cockpit.setActionBtnPn4Ind5(CockpitStrings.indicadoresPn4Processos[4]);
            cockpit.setActionBtnPn4Ind6(CockpitStrings.indicadoresPn4Processos[5]);

            cockpit.setActionBtnPn5Obj5(CockpitStrings.objetivosProcessos[4]);
            cockpit.setActionBtnPn5Ind1(CockpitStrings.indicadoresPn5Processos[0]);
            cockpit.setActionBtnPn5Ind2(CockpitStrings.indicadoresPn5Processos[1]);
            cockpit.setActionBtnPn5Ind3(CockpitStrings.indicadoresPn5Processos[2]);
            cockpit.setActionBtnPn5Ind4(CockpitStrings.indicadoresPn5Processos[3]);
            cockpit.setActionBtnPn5Ind5(CockpitStrings.indicadoresPn5Processos[4]);
            cockpit.setActionBtnPn5Ind6(CockpitStrings.indicadoresPn5Processos[5]);

            cockpit.setActionBtnPn6Obj6(CockpitStrings.objetivosProcessos[5]);
            cockpit.setActionBtnPn6Ind1(CockpitStrings.indicadoresPn6Processos[0]);
            cockpit.setActionBtnPn6Ind2(CockpitStrings.indicadoresPn6Processos[1]);
            cockpit.setActionBtnPn6Ind3(CockpitStrings.indicadoresPn6Processos[2]);
            cockpit.setActionBtnPn6Ind4(CockpitStrings.indicadoresPn6Processos[3]);
            cockpit.setActionBtnPn6Ind5(CockpitStrings.indicadoresPn6Processos[4]);
            cockpit.setActionBtnPn6Ind6(CockpitStrings.indicadoresPn6Processos[5]);
            
            cockpit.setVisiblePn1Ind1(true);
            cockpit.setVisiblePn1Ind2(true);
            cockpit.setVisiblePn1Ind3(true);
            cockpit.setVisiblePn1Ind4(true);
            cockpit.setVisiblePn1Ind5(true);
            cockpit.setVisiblePn1Ind6(true);
            
            cockpit.setVisiblePn2Ind1(true);
            cockpit.setVisiblePn2Ind2(true);
            cockpit.setVisiblePn2Ind3(true);
            cockpit.setVisiblePn2Ind4(true);
            cockpit.setVisiblePn2Ind5(true);
            cockpit.setVisiblePn2Ind6(true);
            
            cockpit.setVisiblePn3Ind1(true);
            cockpit.setVisiblePn3Ind2(true);
            cockpit.setVisiblePn3Ind3(true);
            cockpit.setVisiblePn3Ind4(true);
            cockpit.setVisiblePn3Ind5(true);
            cockpit.setVisiblePn3Ind6(true);
            
            cockpit.setVisiblePn4Ind1(true);
            cockpit.setVisiblePn4Ind2(true);
            cockpit.setVisiblePn4Ind3(true);
            cockpit.setVisiblePn4Ind4(true);
            cockpit.setVisiblePn4Ind5(true);
            cockpit.setVisiblePn4Ind6(true);
            
            cockpit.setVisiblePn5Ind1(true);
            cockpit.setVisiblePn5Ind2(true);
            cockpit.setVisiblePn5Ind3(true);
            cockpit.setVisiblePn5Ind4(true);
            cockpit.setVisiblePn5Ind5(true);
            cockpit.setVisiblePn5Ind6(true);
            
            cockpit.setVisiblePn6Ind1(true);
            cockpit.setVisiblePn6Ind2(true);
            cockpit.setVisiblePn6Ind3(true);
            cockpit.setVisiblePn6Ind4(true);
            cockpit.setVisiblePn6Ind5(true);
            cockpit.setVisiblePn6Ind6(true);
            
        }else if(btns.getActionCommand().equals(CockpitStrings.Cockpit[3])){
            cockpit.setBounds(20, 5, largura, altura);
            cockpit.setVisible(true);
            cockpit.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            cockpit.setBtnPn1Obj1(CockpitStrings.objetivosPGT[0]);
            cockpit.setBtnPn1Ind1(CockpitStrings.indicadoresPn1PGT[0]);
            cockpit.setBtnPn1Ind2(CockpitStrings.indicadoresPn1PGT[1]);
            cockpit.setBtnPn1Ind3(CockpitStrings.indicadoresPn1PGT[2]);
            cockpit.setBtnPn1Ind4(CockpitStrings.indicadoresPn1PGT[3]);
            cockpit.setBtnPn1Ind5(CockpitStrings.indicadoresPn1PGT[4]);
            cockpit.setBtnPn1Ind6(CockpitStrings.indicadoresPn1PGT[5]);

            cockpit.setBtnPn2Obj2(CockpitStrings.objetivosPGT[1]);
            cockpit.setBtnPn2Ind1(CockpitStrings.indicadoresPn2PGT[0]);
            cockpit.setBtnPn2Ind2(CockpitStrings.indicadoresPn2PGT[1]);
            cockpit.setBtnPn2Ind3(CockpitStrings.indicadoresPn2PGT[2]);
            cockpit.setBtnPn2Ind4(CockpitStrings.indicadoresPn2PGT[3]);
            cockpit.setBtnPn2Ind5(CockpitStrings.indicadoresPn2PGT[4]);
            cockpit.setBtnPn2Ind6(CockpitStrings.indicadoresPn2PGT[5]);

            cockpit.setBtnPn3Obj3(CockpitStrings.objetivosPGT[2]);
            cockpit.setBtnPn3Ind1(CockpitStrings.indicadoresPn3PGT[0]);
            cockpit.setBtnPn3Ind2(CockpitStrings.indicadoresPn3PGT[1]);
            cockpit.setBtnPn3Ind3(CockpitStrings.indicadoresPn3PGT[2]);
            cockpit.setBtnPn3Ind4(CockpitStrings.indicadoresPn3PGT[3]);
            cockpit.setBtnPn3Ind5(CockpitStrings.indicadoresPn3PGT[4]);
            cockpit.setBtnPn3Ind6(CockpitStrings.indicadoresPn3PGT[5]);

            cockpit.setBtnPn4Obj4(CockpitStrings.objetivosPGT[3]);
            cockpit.setBtnPn4Ind1(CockpitStrings.indicadoresPn4PGT[0]);
            cockpit.setBtnPn4Ind2(CockpitStrings.indicadoresPn4PGT[1]);
            cockpit.setBtnPn4Ind3(CockpitStrings.indicadoresPn4PGT[2]);
            cockpit.setBtnPn4Ind4(CockpitStrings.indicadoresPn4PGT[3]);
            cockpit.setBtnPn4Ind5(CockpitStrings.indicadoresPn4PGT[4]);
            cockpit.setBtnPn4Ind6(CockpitStrings.indicadoresPn4PGT[5]);

            cockpit.setBtnPn5Obj5(CockpitStrings.objetivosPGT[4]);
            cockpit.setBtnPn5Ind1(CockpitStrings.indicadoresPn5PGT[0]);
            cockpit.setBtnPn5Ind2(CockpitStrings.indicadoresPn5PGT[1]);
            cockpit.setBtnPn5Ind3(CockpitStrings.indicadoresPn5PGT[2]);
            cockpit.setBtnPn5Ind4(CockpitStrings.indicadoresPn5PGT[3]);
            cockpit.setBtnPn5Ind5(CockpitStrings.indicadoresPn5PGT[4]);
            cockpit.setBtnPn5Ind6(CockpitStrings.indicadoresPn5PGT[5]);

            cockpit.setBtnPn6Obj6(CockpitStrings.objetivosPGT[5]);
            cockpit.setBtnPn6Ind1(CockpitStrings.indicadoresPn6PGT[0]);
            cockpit.setBtnPn6Ind2(CockpitStrings.indicadoresPn6PGT[1]);
            cockpit.setBtnPn6Ind3(CockpitStrings.indicadoresPn6PGT[2]);
            cockpit.setBtnPn6Ind4(CockpitStrings.indicadoresPn6PGT[3]);
            cockpit.setBtnPn6Ind5(CockpitStrings.indicadoresPn6PGT[4]);
            cockpit.setBtnPn6Ind6(CockpitStrings.indicadoresPn6PGT[5]);
            
            cockpit.setActionBtnPn1Obj1(CockpitStrings.objetivosPGT[0]);
            cockpit.setActionBtnPn1Ind1(CockpitStrings.indicadoresPn1PGT[0]);
            cockpit.setActionBtnPn1Ind2(CockpitStrings.indicadoresPn1PGT[1]);
            cockpit.setActionBtnPn1Ind3(CockpitStrings.indicadoresPn1PGT[2]);
            cockpit.setActionBtnPn1Ind4(CockpitStrings.indicadoresPn1PGT[3]);
            cockpit.setActionBtnPn1Ind5(CockpitStrings.indicadoresPn1PGT[4]);
            cockpit.setActionBtnPn1Ind6(CockpitStrings.indicadoresPn1PGT[5]);

            cockpit.setActionBtnPn2Obj2(CockpitStrings.objetivosPGT[1]);
            cockpit.setActionBtnPn2Ind1(CockpitStrings.indicadoresPn2PGT[0]);
            cockpit.setActionBtnPn2Ind2(CockpitStrings.indicadoresPn2PGT[1]);
            cockpit.setActionBtnPn2Ind3(CockpitStrings.indicadoresPn2PGT[2]);
            cockpit.setActionBtnPn2Ind4(CockpitStrings.indicadoresPn2PGT[3]);
            cockpit.setActionBtnPn2Ind5(CockpitStrings.indicadoresPn2PGT[4]);
            cockpit.setActionBtnPn2Ind6(CockpitStrings.indicadoresPn2PGT[5]);

            cockpit.setActionBtnPn3Obj3(CockpitStrings.objetivosPGT[2]);
            cockpit.setActionBtnPn3Ind1(CockpitStrings.indicadoresPn3PGT[0]);
            cockpit.setActionBtnPn3Ind2(CockpitStrings.indicadoresPn3PGT[1]);
            cockpit.setActionBtnPn3Ind3(CockpitStrings.indicadoresPn3PGT[2]);
            cockpit.setActionBtnPn3Ind4(CockpitStrings.indicadoresPn3PGT[3]);
            cockpit.setActionBtnPn3Ind5(CockpitStrings.indicadoresPn3PGT[4]);
            cockpit.setActionBtnPn3Ind6(CockpitStrings.indicadoresPn3PGT[5]);

            cockpit.setActionBtnPn4Obj4(CockpitStrings.objetivosPGT[3]);
            cockpit.setActionBtnPn4Ind1(CockpitStrings.indicadoresPn4PGT[0]);
            cockpit.setActionBtnPn4Ind2(CockpitStrings.indicadoresPn4PGT[1]);
            cockpit.setActionBtnPn4Ind3(CockpitStrings.indicadoresPn4PGT[2]);
            cockpit.setActionBtnPn4Ind4(CockpitStrings.indicadoresPn4PGT[3]);
            cockpit.setActionBtnPn4Ind5(CockpitStrings.indicadoresPn4PGT[4]);
            cockpit.setActionBtnPn4Ind6(CockpitStrings.indicadoresPn4PGT[5]);

            cockpit.setActionBtnPn5Obj5(CockpitStrings.objetivosPGT[4]);
            cockpit.setActionBtnPn5Ind1(CockpitStrings.indicadoresPn5PGT[0]);
            cockpit.setActionBtnPn5Ind2(CockpitStrings.indicadoresPn5PGT[1]);
            cockpit.setActionBtnPn5Ind3(CockpitStrings.indicadoresPn5PGT[2]);
            cockpit.setActionBtnPn5Ind4(CockpitStrings.indicadoresPn5PGT[3]);
            cockpit.setActionBtnPn5Ind5(CockpitStrings.indicadoresPn5PGT[4]);
            cockpit.setActionBtnPn5Ind6(CockpitStrings.indicadoresPn5PGT[5]);

            cockpit.setActionBtnPn6Obj6(CockpitStrings.objetivosPGT[5]);
            cockpit.setActionBtnPn6Ind1(CockpitStrings.indicadoresPn6PGT[0]);
            cockpit.setActionBtnPn6Ind2(CockpitStrings.indicadoresPn6PGT[1]);
            cockpit.setActionBtnPn6Ind3(CockpitStrings.indicadoresPn6PGT[2]);
            cockpit.setActionBtnPn6Ind4(CockpitStrings.indicadoresPn6PGT[3]);
            cockpit.setActionBtnPn6Ind5(CockpitStrings.indicadoresPn6PGT[4]);
            cockpit.setActionBtnPn6Ind6(CockpitStrings.indicadoresPn6PGT[5]);
            
            cockpit.setVisiblePn1Ind1(true);
            cockpit.setVisiblePn1Ind2(true);
            cockpit.setVisiblePn1Ind3(true);
            cockpit.setVisiblePn1Ind4(true);
            cockpit.setVisiblePn1Ind5(true);
            cockpit.setVisiblePn1Ind6(true);
            
            cockpit.setVisiblePn2Ind1(true);
            cockpit.setVisiblePn2Ind2(true);
            cockpit.setVisiblePn2Ind3(true);
            cockpit.setVisiblePn2Ind4(true);
            cockpit.setVisiblePn2Ind5(true);
            cockpit.setVisiblePn2Ind6(true);
            
            cockpit.setVisiblePn3Ind1(true);
            cockpit.setVisiblePn3Ind2(true);
            cockpit.setVisiblePn3Ind3(true);
            cockpit.setVisiblePn3Ind4(true);
            cockpit.setVisiblePn3Ind5(true);
            cockpit.setVisiblePn3Ind6(true);
            
            cockpit.setVisiblePn4Ind1(true);
            cockpit.setVisiblePn4Ind2(true);
            cockpit.setVisiblePn4Ind3(true);
            cockpit.setVisiblePn4Ind4(true);
            cockpit.setVisiblePn4Ind5(true);
            cockpit.setVisiblePn4Ind6(true);
            
            cockpit.setVisiblePn5Ind1(true);
            cockpit.setVisiblePn5Ind2(true);
            cockpit.setVisiblePn5Ind3(true);
            cockpit.setVisiblePn5Ind4(true);
            cockpit.setVisiblePn5Ind5(true);
            cockpit.setVisiblePn5Ind6(true);
            
            cockpit.setVisiblePn6Ind1(true);
            cockpit.setVisiblePn6Ind2(true);
            cockpit.setVisiblePn6Ind3(true);
            cockpit.setVisiblePn6Ind4(true);
            cockpit.setVisiblePn6Ind5(true);
            cockpit.setVisiblePn6Ind6(true);
        }else if(btns.getActionCommand().equals(CockpitStrings.Cockpit[4])){
            sgi.setBounds(80, 0, 1005, 730);
            sgi.setVisible(true);
            
            sgi.setBtnFin1(CockpitStrings.indicadoresPn3Financas[4]);
            sgi.setBtnFin1ActionCommand(CockpitStrings.indicadoresPn3Financas[4]);
            sgi.setBtnFin2(CockpitStrings.indicadoresPn4Financas[4]);
            sgi.setBtnFin2ActionCommand(CockpitStrings.indicadoresPn4Financas[4]);
            sgi.setBtnFin3(CockpitStrings.indicadoresPn5Financas[1]);
            sgi.setBtnFin3ActionCommand(CockpitStrings.indicadoresPn5Financas[1]);
            sgi.setBtnFin4(CockpitStrings.indicadoresPn5Financas[2]);
            sgi.setBtnFin4ActionCommand(CockpitStrings.indicadoresPn5Financas[2]);
            sgi.setBtnFin5(CockpitStrings.indicadoresPn5Financas[4]);
            sgi.setBtnFin5ActionCommand(CockpitStrings.indicadoresPn5Financas[4]);
            
            sgi.setBtnCli1(CockpitStrings.indicadoresPn2Clientes[1]);
            sgi.setBtnCli1ActionCommand(CockpitStrings.indicadoresPn2Clientes[1]);
            sgi.setBtnCli2(CockpitStrings.indicadoresPn2Clientes[4]);
            sgi.setBtnCli2ActionCommand(CockpitStrings.indicadoresPn2Clientes[4]);
            sgi.setBtnCli3(CockpitStrings.indicadoresPn3Clientes[4]);
            sgi.setBtnCli3ActionCommand(CockpitStrings.indicadoresPn3Clientes[4]);
            sgi.setBtnCli4(CockpitStrings.indicadoresPn5Clientes[0]);
            sgi.setBtnCli4ActionCommand(CockpitStrings.indicadoresPn5Clientes[0]);
            sgi.setBtnCli5(CockpitStrings.indicadoresPn5Clientes[1]);
            sgi.setBtnCli5ActionCommand(CockpitStrings.indicadoresPn5Clientes[1]);
            sgi.setBtnCli6(CockpitStrings.indicadoresPn5Clientes[4]);
            sgi.setBtnCli6ActionCommand(CockpitStrings.indicadoresPn5Clientes[4]);
            sgi.setBtnCli7(CockpitStrings.indicadoresPn6Clientes[4]);
            sgi.setBtnCli7ActionCommand(CockpitStrings.indicadoresPn6Clientes[4]);
            
            sgi.setBtnPro1(CockpitStrings.indicadoresPn1Processos[1]);
            sgi.setBtnPro1ActionCommand(CockpitStrings.indicadoresPn1Processos[1]);
            sgi.setBtnPro2(CockpitStrings.indicadoresPn1Processos[2]);
            sgi.setBtnPro2ActionCommand(CockpitStrings.indicadoresPn1Processos[2]);
            sgi.setBtnPro3(CockpitStrings.indicadoresPn1Processos[3]);
            sgi.setBtnPro3ActionCommand(CockpitStrings.indicadoresPn1Processos[3]);
            sgi.setBtnPro4(CockpitStrings.indicadoresPn1Processos[4]);
            sgi.setBtnPro4ActionCommand(CockpitStrings.indicadoresPn1Processos[4]);
            sgi.setBtnPro5(CockpitStrings.indicadoresPn1Processos[5]);
            sgi.setBtnPro5ActionCommand(CockpitStrings.indicadoresPn1Processos[5]);
            sgi.setBtnPro6(CockpitStrings.indicadoresPn4Processos[1]);
            sgi.setBtnPro6ActionCommand(CockpitStrings.indicadoresPn4Processos[1]);
            sgi.setBtnPro7(CockpitStrings.indicadoresPn4Processos[3]);
            sgi.setBtnPro7ActionCommand(CockpitStrings.indicadoresPn4Processos[3]);
            sgi.setBtnPro8(CockpitStrings.indicadoresPn4Processos[4]);
            sgi.setBtnPro8ActionCommand(CockpitStrings.indicadoresPn4Processos[4]);
            sgi.setBtnPro9(CockpitStrings.indicadoresPn6Processos[0]);
            sgi.setBtnPro9ActionCommand(CockpitStrings.indicadoresPn6Processos[0]);
            sgi.setBtnPro10(CockpitStrings.indicadoresPn6Processos[1]);
            sgi.setBtnPro10ActionCommand(CockpitStrings.indicadoresPn6Processos[1]);
            sgi.setBtnPro11(CockpitStrings.indicadoresPn6Processos[2]);
            sgi.setBtnPro11ActionCommand(CockpitStrings.indicadoresPn6Processos[2]);
            sgi.setBtnPro12(CockpitStrings.indicadoresPn6Processos[3]);
            sgi.setBtnPro12ActionCommand(CockpitStrings.indicadoresPn6Processos[3]);
            sgi.setBtnPro13(CockpitStrings.indicadoresPn6Processos[4]);
            sgi.setBtnPro13ActionCommand(CockpitStrings.indicadoresPn6Processos[4]);
            sgi.setBtnPro14(CockpitStrings.indicadoresPn6Processos[5]);
            sgi.setBtnPro14ActionCommand(CockpitStrings.indicadoresPn6Processos[5]);
            
            sgi.setBtnPgt1(CockpitStrings.indicadoresPn1PGT[4]);
            sgi.setBtnPgt1ActionCommand(CockpitStrings.indicadoresPn1PGT[4]);
            sgi.setBtnPgt2(CockpitStrings.indicadoresPn4PGT[0]);
            sgi.setBtnPgt2ActionCommand(CockpitStrings.indicadoresPn4PGT[0]);
            sgi.setBtnPgt3(CockpitStrings.indicadoresPn4PGT[1]);
            sgi.setBtnPgt3ActionCommand(CockpitStrings.indicadoresPn4PGT[1]);
            sgi.setBtnPgt4(CockpitStrings.indicadoresPn4PGT[2]);
            sgi.setBtnPgt4ActionCommand(CockpitStrings.indicadoresPn4PGT[2]);
            sgi.setBtnPgt5(CockpitStrings.indicadoresPn4PGT[3]);
            sgi.setBtnPgt5ActionCommand(CockpitStrings.indicadoresPn4PGT[3]);
            sgi.setBtnPgt6(CockpitStrings.indicadoresPn4PGT[5]);
            sgi.setBtnPgt6ActionCommand(CockpitStrings.indicadoresPn4PGT[5]);
            sgi.setBtnPgt7(CockpitStrings.indicadoresPn5PGT[0]);
            sgi.setBtnPgt7ActionCommand(CockpitStrings.indicadoresPn5PGT[0]);
            sgi.setBtnPgt8(CockpitStrings.indicadoresPn5PGT[1]);
            sgi.setBtnPgt8ActionCommand(CockpitStrings.indicadoresPn5PGT[1]);
            sgi.setBtnPgt9(CockpitStrings.indicadoresPn5PGT[3]);
            sgi.setBtnPgt9ActionCommand(CockpitStrings.indicadoresPn5PGT[3]);
            sgi.setBtnPgt10(CockpitStrings.indicadoresPn5PGT[4]);
            sgi.setBtnPgt10ActionCommand(CockpitStrings.indicadoresPn5PGT[4]);
            sgi.setBtnPgt11(CockpitStrings.indicadoresPn5PGT[5]);
            sgi.setBtnPgt11ActionCommand(CockpitStrings.indicadoresPn5PGT[5]);
            
        }
    }
    
}
