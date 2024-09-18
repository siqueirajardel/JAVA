/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author Aluno_Noite
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner ler = new Scanner (System.in);
       
       int num1, num2, total;
       String nome;
       
        System.out.println(" Informe seu nome: ");
        nome = ler.nextLine();//next somente uma palavra e o nextLine para duas ou mais palavras
        
        System.out.println("nome: " + nome);
        
        System.out.println("informe um número: ");
        num1 = ler.nextInt();
        
        System.out.println("informe outro número: ");
        num2 = ler.nextInt();
                
            total = num1 + num2;
            
        System.out.println(nome + "o resultado é: " + total);
        

    }
    
}