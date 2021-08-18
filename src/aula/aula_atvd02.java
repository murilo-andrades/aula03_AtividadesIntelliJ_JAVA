package aula;

import javax.swing.*;
import java.util.Scanner;

public class aula_atvd02 {
    public static void main(String[] args) {

        double percentualItbi;
        double valorVenal;
        double valorTransacao;
        double impostoPago;

        String dado;
        dado= JOptionPane.showInputDialog("Digite o valor da transação:");
        valorTransacao = Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Digite o valor da venal:");
        valorVenal = Double.parseDouble(dado);
        dado= JOptionPane.showInputDialog("Digite o valor do percentual do ITBI:");
        percentualItbi = Double.parseDouble(dado);

        if (valorTransacao > valorVenal){
            impostoPago = valorTransacao*percentualItbi/100;
        }else{
            impostoPago = valorVenal*percentualItbi/100;
        }

        JOptionPane.showMessageDialog(null,"Imposto a ser pago: "+impostoPago);
    }

}
