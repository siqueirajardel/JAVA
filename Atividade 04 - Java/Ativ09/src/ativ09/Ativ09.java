/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ09;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int maiorQueDez = 0, num, par = 0, impar = 0;
       
        for (int i = 0; i < 10; i++) {
           
            System.out.println("informe um número: ");
            num = ler.nextInt();
            
            if (num > 10 ) {
                
                maiorQueDez++;
                
                
                if (num % 2 == 0) {
                     
                    par++;
                    
                } else {
                
                    impar++;
                
                }
            }
            
            System.out.println("Existem " + maiorQueDez + " números maiores que 10, sendo " + par + " números pares e " + impar + " números ímpares");
         
           
        }
        
        
    }
    
}
