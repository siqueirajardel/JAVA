/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula06;

import java.util.Scanner;

/**
 *
 * @author Aluno_Noite
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner ler = new Scanner (System.in);
      
      String palavra = "Exemplo", word;
      
      System.out.println("Informe uma palavra: ");
      word = ler.next().toLowerCase();
      
        if (word.equals(palavra)) {
            
            System.out.println("Você acertou!");
            
        } else {
            
            System.out.println("Você errou!");
        }
                  }
      }
 
    






    

