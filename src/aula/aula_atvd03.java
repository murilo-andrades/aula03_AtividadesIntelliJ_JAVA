package aula;

import javax.swing.*;

public class aula_atvd03 {
    public static void main(String[] args) {
        double n1, n2, t3;
        double media;
        String dado;

        dado = JOptionPane.showInputDialog("INFORME A NOTA DA PROVA 1:");
        n1 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("INFORME A NOTA DA PROVA 2:");
        n2 = Double.parseDouble(dado);
        dado = JOptionPane.showInputDialog("INFORME A NOTA DO TRABALHO:");
        t3 = Double.parseDouble(dado);

        media=(n1+n2+t3)/3;
        if(media>=6){
            JOptionPane.showMessageDialog(null, "APROVADO!, A SUA MÉDIA É DE: " + media);
        }else{
            JOptionPane.showMessageDialog(null, "REPROVADO! A SUA MÉDIA FICOU EM: "+ media);
        }
    }

}
