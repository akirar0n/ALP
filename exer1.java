package controle;
import javax.swing.JOptionPane;

public class exer1 {
    public static void main(String[] args) {
        // Faça um programa que receba como dados de entrada vários números inteiros
        // e mostre como resultado: 
        // a) quantos números foram digitados;
        // b) qual foi o maior número digitado;
        // obs: o programa deve ser finalizado quando receber o valor 0. 
        int cont=0;
        int n=1;
        int maior=0;
       
        while (n !=0){
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite o valor:"))); 
        
        if (n > maior){
            maior = n;
        }
        
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para sair")));     
            cont++;
        }      
        
            JOptionPane.showMessageDialog(null, "Maior número foi: " + maior);
            JOptionPane.showMessageDialog(null, "Programa rodou: " + cont + "vezes");
    }
}
