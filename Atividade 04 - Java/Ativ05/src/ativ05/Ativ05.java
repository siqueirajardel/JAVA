/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ05;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        double salarioBruto, prestacao;
        
        System.out.println("Informe o seu salário bruto: ");
        salarioBruto = ler.nextDouble();
        
        System.out.println("Informe o valor da prestação do seu financiamento: ");
        prestacao = ler.nextDouble();
        
        if (prestacao <= salarioBruto * 25/100) {
            
            System.out.println("Parabéns, o valor para seu financiamento foi aprovado! :)");
            
        } else {
        
            System.out.println("Infelizmente não podemos aprovar o valor solicitado! :/ ");
            
        }
    }
    
}
