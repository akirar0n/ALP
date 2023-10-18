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
public class modelo1 {
    public static void main(String[] args) {
        // Modelo1 - Faça um programa em Java que calcule e imprima o salário reajustado de um funcionário de acordo com a seguinte regra: 
        // a) Salários de até R$300,00, reajuste de 50% 
        // b) Salários maiores que R$300,00, reajuste de 30%.
        double salario;

        salario = Double.valueOf(JOptionPane.showInputDialog(null, "Insira o seu salário:"));
        
       if (salario <= 300){
          JOptionPane.showMessageDialog(null, "Seu salário será:" + (salario + salario * 0.5));
       } 
       
       if (salario > 300) {
           JOptionPane.showMessageDialog(null, "Seu salário será:" + (salario + salario * 0.3));
       }
    }
}
