/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ10;

import java.util.Scanner;

/**
 *
 * @author DEV_noite
 */
public class Ativ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int soma = 0; 
        
        System.out.println("Digite um número (Ou digite um número negativo para encerrar): ");
            
            while (true) {            
            
                int numero = ler.nextInt();
                
                    if (numero < 0) {
                    
                        break;
                    
                    }
                        soma += numero;
        } 
            System.out.println("A soma dos númeors digitados é: " + soma);
            
        
        
    }
    
}
