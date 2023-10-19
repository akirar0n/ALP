/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

import javax.swing.JOptionPane;

/**
 *
 * @author contabilidade
 */
public class exercício1 {
    // Faça um programa que receba como dado de entrada 2 notas de 5 alunos, 
    // ao final informar qual foi a maior média da turma.s
    public static void main(String[] args) {
        double nota1;
        double nota2;
        double maior = 0;
        int cont;
        
        for (cont=0; cont<6; cont++ ){
            nota1 = Double.valueOf(JOptionPane.showInputDialog("Insira sua primeira nota:"));
            nota2 = Double.valueOf(JOptionPane.showInputDialog("Insira sua segunda nota:"));
            
                double total = (nota1+nota2)/(2);
    
        if (total > maior) {
           maior = total ; 
        } 
        }
        JOptionPane.showMessageDialog(null, maior);
    }
}
