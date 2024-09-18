/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ03;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Jardel
 */
public class Ativ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] numeros = new int [10];
        int soma = 0;
        
        for (int i = 0; i < numeros.length; i++) {
            
        System.out.println("Digite os 10 valores da array: ");
        numeros[i] = ler.nextInt();
        }
            for (int num : numeros) {
                
                if (num % 2 == 0) {
                    soma++;
                }
            
        }
        
        System.out.println("A array possui " + soma + " valores pares.");
        
        
    }
    
}
