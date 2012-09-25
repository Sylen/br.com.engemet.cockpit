package br.com.engemet.cockpit.acao;

import br.com.engemet.cockpit.telas.Objetivos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class AcaoMapaEstrategico implements ActionListener{

    private Objetivos objetivo = new Objetivos();
    private int altura = 350;
    private int largura1 = 430;
    private int largura2 = 860;
    
    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e){
        JButton btns = (JButton) e.getSource();

        /***************************************************Finanças***************************************************/
        if(btns.getActionCommand().equals(CockpitStrings.MapaFinancas[0])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosFinancas[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1Financas[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1Financas[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1Financas[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1Financas[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1Financas[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1Financas[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosFinancas[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1Financas[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1Financas[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1Financas[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1Financas[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1Financas[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1Financas[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaFinancas[1])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosFinancas[3]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn4Financas[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn4Financas[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn4Financas[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn4Financas[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn4Financas[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn4Financas[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosFinancas[3]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn4Financas[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn4Financas[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn4Financas[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn4Financas[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn4Financas[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn4Financas[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaFinancas[2])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosFinancas[4]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn5Financas[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn5Financas[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn5Financas[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn5Financas[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn5Financas[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn5Financas[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosFinancas[4]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn5Financas[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn5Financas[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn5Financas[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn5Financas[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn5Financas[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn5Financas[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(false);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaFinancas[3])){
            objetivo.setBounds(200, 300, largura2, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosFinancas[1]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn2Financas[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn2Financas[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn2Financas[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn2Financas[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn2Financas[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn2Financas[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosFinancas[1]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn2Financas[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn2Financas[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn2Financas[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn2Financas[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn2Financas[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn2Financas[5]);
            
            objetivo.setBtObjetivo2ActionCommand(CockpitStrings.objetivosFinancas[2]);
            objetivo.setBtIndicador7ActionCommand(CockpitStrings.indicadoresPn3Financas[0]);
            objetivo.setBtIndicador8ActionCommand(CockpitStrings.indicadoresPn3Financas[1]);
            objetivo.setBtIndicador9ActionCommand(CockpitStrings.indicadoresPn3Financas[2]);
            objetivo.setBtIndicador10ActionCommand(CockpitStrings.indicadoresPn3Financas[3]);
            objetivo.setBtIndicador11ActionCommand(CockpitStrings.indicadoresPn3Financas[4]);
            objetivo.setBtIndicador12ActionCommand(CockpitStrings.indicadoresPn3Financas[5]);;
            objetivo.setBtObjetivo2(CockpitStrings.objetivosFinancas[2]);
            objetivo.setBtIndicador7(CockpitStrings.indicadoresPn3Financas[0]);
            objetivo.setBtIndicador8(CockpitStrings.indicadoresPn3Financas[1]);
            objetivo.setBtIndicador9(CockpitStrings.indicadoresPn3Financas[2]);
            objetivo.setBtIndicador10(CockpitStrings.indicadoresPn3Financas[3]);
            objetivo.setBtIndicador11(CockpitStrings.indicadoresPn3Financas[4]);
            objetivo.setBtIndicador12(CockpitStrings.indicadoresPn3Financas[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);
            objetivo.setVisibleBtIndicador7(true);
            objetivo.setVisibleBtIndicador8(true);
            objetivo.setVisibleBtIndicador9(true);
            objetivo.setVisibleBtIndicador10(true);
            objetivo.setVisibleBtIndicador11(true);
            objetivo.setVisibleBtIndicador12(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaFinancas[4])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaPreto());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosFinancas[5]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn6Financas[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn6Financas[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn6Financas[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn6Financas[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn6Financas[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn6Financas[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosFinancas[5]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn6Financas[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn6Financas[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn6Financas[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn6Financas[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn6Financas[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn6Financas[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }/***************************************************Clientes***************************************************/
        else if(btns.getActionCommand().equals(CockpitStrings.MapaClientes[0])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosClientes[1]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn2Clientes[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn2Clientes[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn2Clientes[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn2Clientes[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn2Clientes[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn2Clientes[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosClientes[1]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn2Clientes[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn2Clientes[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn2Clientes[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn2Clientes[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn2Clientes[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn2Clientes[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaClientes[1])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosClientes[4]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn5Clientes[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn5Clientes[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn5Clientes[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn5Clientes[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn5Clientes[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn5Clientes[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosClientes[4]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn5Clientes[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn5Clientes[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn5Clientes[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn5Clientes[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn5Clientes[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn5Clientes[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaClientes[2])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosClientes[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1Clientes[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1Clientes[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1Clientes[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1Clientes[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1Clientes[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1Clientes[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosClientes[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1Clientes[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1Clientes[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1Clientes[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1Clientes[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1Clientes[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1Clientes[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaClientes[3])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosClientes[3]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn4Clientes[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn4Clientes[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn4Clientes[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn4Clientes[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn4Clientes[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn4Clientes[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosClientes[3]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn4Clientes[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn4Clientes[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn4Clientes[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn4Clientes[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn4Clientes[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn4Clientes[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaClientes[4])){
            objetivo.setBounds(200, 300, largura2, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaVerde());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosClientes[2]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn3Clientes[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn3Clientes[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn3Clientes[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn3Clientes[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn3Clientes[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn3Clientes[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosClientes[2]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn3Clientes[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn3Clientes[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn3Clientes[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn3Clientes[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn3Clientes[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn3Clientes[5]);
            
            objetivo.setBtObjetivo2ActionCommand(CockpitStrings.objetivosClientes[5]);
            objetivo.setBtIndicador7ActionCommand(CockpitStrings.indicadoresPn6Clientes[0]);
            objetivo.setBtIndicador8ActionCommand(CockpitStrings.indicadoresPn6Clientes[1]);
            objetivo.setBtIndicador9ActionCommand(CockpitStrings.indicadoresPn6Clientes[2]);
            objetivo.setBtIndicador10ActionCommand(CockpitStrings.indicadoresPn6Clientes[3]);
            objetivo.setBtIndicador11ActionCommand(CockpitStrings.indicadoresPn6Clientes[4]);
            objetivo.setBtIndicador12ActionCommand(CockpitStrings.indicadoresPn6Clientes[5]);;
            objetivo.setBtObjetivo2(CockpitStrings.objetivosClientes[5]);
            objetivo.setBtIndicador7(CockpitStrings.indicadoresPn6Clientes[0]);
            objetivo.setBtIndicador8(CockpitStrings.indicadoresPn6Clientes[1]);
            objetivo.setBtIndicador9(CockpitStrings.indicadoresPn6Clientes[2]);
            objetivo.setBtIndicador10(CockpitStrings.indicadoresPn6Clientes[3]);
            objetivo.setBtIndicador11(CockpitStrings.indicadoresPn6Clientes[4]);
            objetivo.setBtIndicador12(CockpitStrings.indicadoresPn6Clientes[5]);

            objetivo.setVisibleBtIndicador1(false);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(false);
            objetivo.setVisibleBtIndicador7(false);
            objetivo.setVisibleBtIndicador8(true);
            objetivo.setVisibleBtIndicador9(true);
            objetivo.setVisibleBtIndicador10(true);
            objetivo.setVisibleBtIndicador11(true);
            objetivo.setVisibleBtIndicador12(false);

        }/***************************************************Processos***************************************************/
        else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[0])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[1])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[2])){
            objetivo.setBounds(200, 300, largura2, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[1]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn2Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn2Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn2Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn2Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn2Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn2Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[1]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn2Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn2Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn2Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn2Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn2Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn2Processos[5]);
            
            objetivo.setBtObjetivo2ActionCommand(CockpitStrings.objetivosProcessos[4]);
            objetivo.setBtIndicador7ActionCommand(CockpitStrings.indicadoresPn5Processos[0]);
            objetivo.setBtIndicador8ActionCommand(CockpitStrings.indicadoresPn5Processos[1]);
            objetivo.setBtIndicador9ActionCommand(CockpitStrings.indicadoresPn5Processos[2]);
            objetivo.setBtIndicador10ActionCommand(CockpitStrings.indicadoresPn5Processos[3]);
            objetivo.setBtIndicador11ActionCommand(CockpitStrings.indicadoresPn5Processos[4]);
            objetivo.setBtIndicador12ActionCommand(CockpitStrings.indicadoresPn5Processos[5]);
            objetivo.setBtObjetivo2(CockpitStrings.objetivosProcessos[4]);
            objetivo.setBtIndicador7(CockpitStrings.indicadoresPn5Processos[0]);
            objetivo.setBtIndicador8(CockpitStrings.indicadoresPn5Processos[1]);
            objetivo.setBtIndicador9(CockpitStrings.indicadoresPn5Processos[2]);
            objetivo.setBtIndicador10(CockpitStrings.indicadoresPn5Processos[3]);
            objetivo.setBtIndicador11(CockpitStrings.indicadoresPn5Processos[4]);
            objetivo.setBtIndicador12(CockpitStrings.indicadoresPn5Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);
            objetivo.setVisibleBtIndicador7(true);
            objetivo.setVisibleBtIndicador8(true);
            objetivo.setVisibleBtIndicador9(true);
            objetivo.setVisibleBtIndicador10(true);
            objetivo.setVisibleBtIndicador11(true);
            objetivo.setVisibleBtIndicador12(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[3])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[3]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn4Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn4Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn4Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn4Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn4Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn4Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[3]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn4Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn4Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn4Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn4Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn4Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn4Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[4])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[2]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn3Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn3Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn3Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn3Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn3Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn3Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[2]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn3Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn3Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn3Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn3Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn3Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn3Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[5])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[5]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn6Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn6Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn6Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn6Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn6Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn6Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[5]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn6Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn6Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn6Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn6Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn6Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn6Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaProcessos[6])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaAzul());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1Processos[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosProcessos[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1Processos[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1Processos[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1Processos[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1Processos[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1Processos[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1Processos[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        } /***************************************************PGT***************************************************/
        else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[0])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[1]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn2PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn2PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn2PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn2PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn2PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn2PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[1]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn2PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn2PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn2PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn2PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn2PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn2PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[1])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[1]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn2PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn2PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn2PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn2PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn2PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn2PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[1]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn2PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn2PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn2PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn2PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn2PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn2PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[2])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[4]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn5PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn5PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn5PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn5PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn5PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn5PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[4]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn5PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn5PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn5PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn5PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn5PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn5PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[3])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[3]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn4PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn4PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn4PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn4PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn4PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn4PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[3]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn4PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn4PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn4PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn4PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn4PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn4PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[4])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[0]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn1PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn1PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn1PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn1PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn1PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn1PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[0]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn1PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn1PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn1PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn1PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn1PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn1PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[5])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[2]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn3PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn3PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn3PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn3PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn3PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn3PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[2]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn3PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn3PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn3PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn3PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn3PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn3PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[6])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[5]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn6PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn6PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn6PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn6PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn6PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn6PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[5]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn6PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn6PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn6PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn6PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn6PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn6PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }else if(btns.getActionCommand().equals(CockpitStrings.MapaPGT[7])){
            objetivo.setBounds(400, 300, largura1, altura);
            objetivo.setVisible(true);
            objetivo.getContentPane().setBackground(CockpitCor.getPerspectivaBranco());
            objetivo.setBtObjetivo1ActionCommand(CockpitStrings.objetivosPGT[5]);
            objetivo.setBtIndicador1ActionCommand(CockpitStrings.indicadoresPn6PGT[0]);
            objetivo.setBtIndicador2ActionCommand(CockpitStrings.indicadoresPn6PGT[1]);
            objetivo.setBtIndicador3ActionCommand(CockpitStrings.indicadoresPn6PGT[2]);
            objetivo.setBtIndicador4ActionCommand(CockpitStrings.indicadoresPn6PGT[3]);
            objetivo.setBtIndicador5ActionCommand(CockpitStrings.indicadoresPn6PGT[4]);
            objetivo.setBtIndicador6ActionCommand(CockpitStrings.indicadoresPn6PGT[5]);
            objetivo.setBtObjetivo1(CockpitStrings.objetivosPGT[5]);
            objetivo.setBtIndicador1(CockpitStrings.indicadoresPn6PGT[0]);
            objetivo.setBtIndicador2(CockpitStrings.indicadoresPn6PGT[1]);
            objetivo.setBtIndicador3(CockpitStrings.indicadoresPn6PGT[2]);
            objetivo.setBtIndicador4(CockpitStrings.indicadoresPn6PGT[3]);
            objetivo.setBtIndicador5(CockpitStrings.indicadoresPn6PGT[4]);
            objetivo.setBtIndicador6(CockpitStrings.indicadoresPn6PGT[5]);

            objetivo.setVisibleBtIndicador1(true);
            objetivo.setVisibleBtIndicador2(true);
            objetivo.setVisibleBtIndicador3(true);
            objetivo.setVisibleBtIndicador4(true);
            objetivo.setVisibleBtIndicador5(true);
            objetivo.setVisibleBtIndicador6(true);

        }

    }

}