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
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        Scanner ler = new 
                Scanner(System.in);
        
        int soma1 = 0, soma2 = 0, num;
        
             for (int i = 0; i < 10; i++) {
            
            System.out.println("Digite um número: ");
            num = ler.nextInt();

            if (num > 5) {       
                        
                   soma1++;   
                        
                    } else {
                
                    soma2++;
                
            }
              
        }
      
        System.out.println("A quantidade de números maiores que 5 é: " + soma1);
        System.out.println("A quantidade de números menores que 5 é: " + soma2);
    }
    
}
