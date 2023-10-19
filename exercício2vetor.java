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
public class exercício2vetor {
    // Faça um programa que receba como dado de entrada 10 números, ao final informar qual foi a média
    // dos números e mostrar a lista dos números digitados.
    public static void main(String[] args) {
        int v[] = new int[10]; // declaração e alocação de espaço para o vetor "v"
        int cont=0; // índice ou posição
        for(cont = 0; cont<10; cont ++){
            v[cont]=Integer.valueOf(JOptionPane.showInputDialog("Digite um numero"));
            
        }
        for(cont = 0; cont<10; cont ++){
            JOptionPane.showMessageDialog(null,""+v[cont]);
        }
    }
}
