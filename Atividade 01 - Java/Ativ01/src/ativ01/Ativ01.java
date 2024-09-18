/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ01;

import java.util.Scanner;

/**
 *
 * @author Aluno_Noite
 */
public class Ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            
            Scanner (System.in);
               
        int t1, t2;
        float resultado;
        
        System.out.println("Insira o número de gols do primeiro time: ");
        t1 = (int) ler.nextFloat();
        
        System.out.println("Insira o número de gols do segundo time: ");
        t2 = (int) ler.nextFloat();
 
        
        if (t1 == t2) {
        
            System.out.println("Os times empataram!");
        
    } else if (t1 > t2) {
            System.out.println("O Time 1 ganhou! ");
            
    } else if (t1 < t2)
         
            System.out.println("O Time 2 ganhou!");
    
        
    {
            
        }
        
    }
    
}
