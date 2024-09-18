/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ06;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       int[] vetor = new int[8];
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < 8; i++) {
            System.out.println("Posição " + i + ": ");
            vetor[i] = ler.nextInt();
        }
        
        System.out.println("Digete a posição de X: ");
        int x = ler.nextInt();
        System.out.println("Digete a posição de Y: ");
        int y = ler.nextInt();
        
        if (x >= 0 && x < 8 && y >= 0 && y < 8) {
            int soma = vetor[x] + vetor[y];
            System.out.println("A soma dos valores de X e de Y é: " + soma);
        } else {
            System.out.println("Posições inválidas. Por gentileza, digite uma posição entre 0 e 7.");
        }
    }
    
}
