/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula18;

import java.util.Scanner;

/**
 *
 * @author DEV_noite
 */
public class Aula18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Quantos números você deseja cadastrar? ");
        int qtde = ler.nextInt();
        
        int[] numeros = new int[qtde];
        
            for (int i = 0; i < numeros.length; i++) {

                System.out.println("Digite o número " + i + ": ");
                numeros[i] = ler.nextInt();
            
        }
                System.out.println("Os números cadastrados foram: ");
        
                    for (int i = 0; i < numeros.length; i++) {

                       System.out.println(numeros[i]);
            
        }
        
    }
    
}

