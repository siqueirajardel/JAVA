/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula04;

import java.util.Scanner;

/**
 *
 * @author Aluno_Noite
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler  = new 
                Scanner(System.in);
        
        int n1, n2, n3;
        float media;
        
        System.out.println("Informe um valor: ");
        n1 = (int) ler.nextFloat();
        
        System.out.println("Informe outro valor: ");
        n2 = (int) ler.nextFloat();
       
        System.out.println("Informe mais um valor: ");
        n3 = (int) ler.nextFloat();
        
        media = ( n1 + n2 + n3) /3;
        
        System.out.println(media);
        
        if (media >= 7) {
            
            System.out.println("A média é maior que 7");
            
        } else {
            
            System.out.println("A média é menor que 7");
        }
       
    }
    
}
