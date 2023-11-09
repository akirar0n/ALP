package controle;

import javax.swing.JOptionPane;

public class exer3 {
    public static void main(String[] args) {
        /*faça um programa que receba como dado de entrada o valor de 5 multas recebidas
        por um veículo ao final informar:

        a) a média das multas;
        b) a lista com todas as multas recebidas; */
        double multa;
        int cont = 0;
        int v[] = new int [5];
        
        for (cont=0; cont<5; cont++){
            multa = (Double.valueOf(JOptionPane.showInputDialog("Insira o valor da multa")));
        }
        int media = (v[5])/(5);
        
    }
}
