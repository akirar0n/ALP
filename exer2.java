package controle;

import javax.swing.JOptionPane;

public class exer2 {
    public static void main(String[] args) {
       /* faça um programa que receba como dados de entrada a 
        idade de várias pessoas e mostre como resultado:
        a) qual a idade da pessoa mais nova;
        b) uma lista com todas as idade digitadas;*/  
    int cont = 0;
    int nova = 999;
    int n = 1;
    int v[] = new int [999];
    while (n !=0){
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite o valor:"))); 
        
        if (n < nova){
            nova = n;
        }
            v[cont] = n;
            cont++;
            n = (Integer.valueOf(JOptionPane.showInputDialog("Digite 1 para continuar ou 0 para sair")));     
            
        }      
        
            JOptionPane.showMessageDialog(null, "Mais nova tem " + nova + " anos.");
        for (cont=0; cont<999; cont++){
            if (v[cont] !=0){
               System.out.println(v[cont]);
            }
        }
    }
}
