package controle;
import javax.swing.JOptionPane;

public class exer3 {
    public static void main(String[] args) {
        /*faça um programa que receba como dado de entrada o valor de 5 multas recebidas
        por um veículo ao final informar:

        a) a média das multas;
        b) a lista com todas as multas recebidas; */
        
        int v[] = new int [5];
        int cont = 0;
        int media;
        
        for (cont = 0; cont < 5; cont ++){
            v[cont] = Integer.valueOf(JOptionPane.showInputDialog("Insira o valor da multa:"));
        }
        media = (v[0]+v[1]+v[2]+v[3]+v[4])/(5);
            System.out.print("A média das multas é " + media);
        for (cont = 0; cont < 5; cont ++) {
            System.out.print(" Multa: " + v[cont]);
        }
    }
}        
