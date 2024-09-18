/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ13;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int num1 = ler.nextInt();
        
        System.out.println("Digite outro número: ");
        int num2 = ler.nextInt();
        
        boolean negativo = false;
        
        if (num2 < 0) {

            num2 = -num2;
            
            negativo = true;
            
        }
        int resultado = 0;
        for (int i = 0; i < num2; i++) {
            
            resultado += num1;
            
        }
        if (negativo) {
        
        resultado = -resultado;
        
        }
        
        System.out.println("O reusltado da multiplicação é: " + resultado);
        
        
    }
    
}
