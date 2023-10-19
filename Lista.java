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
public class Lista {
    public static void main(String[] args) {
        int v1;
        int cont;
        int maior = 0;
        for (cont=0; cont<5; cont++){
        
        v1 = Integer.valueOf(JOptionPane.showInputDialog("digite um número"));
            
            if(v1 > maior) {
                maior = v1;
            }
        }
        JOptionPane.showMessageDialog(null, maior);
    }
}
