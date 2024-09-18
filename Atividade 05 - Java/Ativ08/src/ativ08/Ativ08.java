/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ08;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int cont = 0;
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        
        System.out.println("Escreva uma frase ou uma palavra: ");
        String frase_palavra = ler.nextLine().toLowerCase();
        
        for (int i = 0; i < frase_palavra.length(); i++) {
            
            for (char vogal : vogais) {
                if (frase_palavra.charAt(i) == vogal) {
                    cont++;
                    break;
                }
            }
        }
        
        System.out.println("A frase possui " + cont + " vogais.");
        
    }
    
}
