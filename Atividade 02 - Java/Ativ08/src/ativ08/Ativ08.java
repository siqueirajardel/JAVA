/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ08;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner ler = new
                Scanner(System.in);
            
            int num = -1, soma = 0, media, cont = 0;
            
           while (num != 0) {            
            System.out.println("Digite um número: ");
                num = ler.nextInt();
           cont++;     
           
           soma += num;
           
        }
            
           media = soma / cont;
           
           
        }
                
                
                
    
    
}
