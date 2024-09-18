/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ12;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
                Scanner(System.in);
        
        System.out.println("Digite um número para exibir a tabuada de multiplicação: ");
        int numero = ler.nextInt();
        
        System.out.println("Tabuada de multiplicação de " + numero + ":");          
            
            for (int i = 0; i <= 10; i++) {
            
                System.out.println(numero + " x " + i + " = " + (numero * i));
        }
            
        }
        
    }
    

