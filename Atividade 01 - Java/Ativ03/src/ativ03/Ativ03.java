/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ03;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int num1, num2, A, B, C;
        Float soma;
        
        System.out.println("Informe o primeiro número: ");
        num1 = (int) ler.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        num2 = (int) ler.nextFloat();
        
        A = (num1 + num2);
        
        if (A > 20) {

            B = (A + 8);
        
                 System.out.println("O valor total é: " + B);
            
        } else if (A <= 20)  {
        
            C = (A - 5);
                
                System.out.println("O valor total é: " + C);
             
             
                
        }
                    
               
   
                
    }
    
}
