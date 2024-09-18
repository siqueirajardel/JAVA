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
        
        double valorAPagar, pesoPrato; 
        
        System.out.println("Informe o peso total do seu prato (em Kg): ");
        pesoPrato = ler.nextDouble();
        
        valorAPagar = 58 * pesoPrato;
        System.out.println("O valor a pagar pelo seu prato é de: " + valorAPagar + " Reais.");
        
    }
    
}
