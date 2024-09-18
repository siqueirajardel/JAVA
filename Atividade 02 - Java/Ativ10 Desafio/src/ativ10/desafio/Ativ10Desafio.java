/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ10.desafio;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ10Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int  inicio = 1800, fim = 2030, cont = 0;
        
        for (int ano = inicio; ano <= fim; ano++) {
            
            if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
                
            System.out.println(ano); 
            cont++;
            }
            
           
        }
                System.out.println("A quantidade de anos é: " + cont); 
    }
    
}
