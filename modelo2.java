/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controle;

import javax.swing.JOptionPane;

/**
 *
 * @author RECEPCAO02
 */
public class modelo2 {
    public static void main(String[] args) {
        // Modelo2 - Faça um programa que receba 2 valores A e B, que são as notas de um aluno durante o semestre. 
        // A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2 e a nota B tem peso 3, depois,
        // imprima a situação do aluno, aprovado ou reprovado. Considere que cada nota pode ir de 0 até 10.0, 
        // sempre com uma casa decimal e que a média da escola em questão é 6.5.
    double A = 2.0;
    double B = 3.0;
   
    A = Double.valueOf(JOptionPane.showInputDialog(null, "Insira nota do primeiro semestre:"));
    B = Double.valueOf(JOptionPane.showInputDialog(null, "Insira nota do segundo semestre:"));
    
    double total = (A*2.0+B*3.0)/(5);
      
        if (total > 6.5){
        JOptionPane.showMessageDialog(null, "Você foi aprovado com nota:" + total);
        }
        if (total < 6.5){
        JOptionPane.showMessageDialog(null, "Você foi reprovado com nota:" + total);
        }

    }
}
