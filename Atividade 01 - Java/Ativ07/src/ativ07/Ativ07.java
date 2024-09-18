/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ07;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
           Scanner(System.in);
        
        String nome;
        double peso, altura, IMC;
        
            System.out.println("Informe seu nome: ");
            nome = ler.next();

                System.out.println("Informe seu peso (Kg): ");
                peso = ler.nextDouble();

                    System.out.println("Informe sua altura (m): ");
                    altura = ler.nextDouble();
                
       IMC = peso / (altura * altura);
       
       System.out.println("O valor do seu IMC é: " + IMC);
       
        if (IMC < 18.5) {
        
            System.out.println("Você está abaixo do peso!");
            
        } else if (IMC > 18.5 && IMC < 25){
        
            System.out.println("Você possui um peso normal!");
        
        } else if (IMC > 25 && IMC < 30){
             
            System.out.println("Você está acima do peso!");
                
        } else if (IMC > 30){
                
            System.out.println("Você está obeso!");
                
                
            
            
        }
        
            
        
        
           
    }
    
}
