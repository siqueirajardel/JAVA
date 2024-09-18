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
        
        int num;
        
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        
        if (num % 3 == 0) {
            
            System.out.println("Este número é divisível por 3!!");
        } else {
        
            System.out.println("Este número não é divisível por 3!!");
            
        }
    }
    
}
