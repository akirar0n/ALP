package controle;

import javax.swing.JOptionPane;

public class Enquanto {
    public static void main(String[] args) {
        int cont;
        int n=1;
        while (n !=0){
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite o valor:")));
            System.out.println(" Valor atual " + n);
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para sair")));

        }
    }
}
