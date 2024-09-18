/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula07;

import java.util.Scanner;

/**
 *
 * @author Aluno_Noite
 */
public class Aula07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     String palavra = "Aula";
     String letra;
     
        System.out.println("Informe uma letra:");
        letra = ler.next().toLowerCase();
        
        if (palavra.contains(letra)) {
            System.out.println("A letra " + letra + " informada tem na palavra " + palavra);
            
        } else {
               
            System.out.println("A letra " + letra + " informada não tem na palavra " + palavra);
                    
                    {
                    
                    }
        }
     
    }
    
}
