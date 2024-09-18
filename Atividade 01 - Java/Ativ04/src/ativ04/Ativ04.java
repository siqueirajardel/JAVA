/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ04;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
                
        String palavra = "AEIOU";
        String letra;
        
             System.out.println("Informe uma letra: ");
             letra = ler.next().toUpperCase();
        
             if (palavra.contains(letra)) {
                 
                 System.out.println("A letra " + letra + " Informada é vogal!");
                 
             } else {
                 
                 System.out.println("A letra " + letra + " é consoante!");
             
    }
            
            }
}   
    
