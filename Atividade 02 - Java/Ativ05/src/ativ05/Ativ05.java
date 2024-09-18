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
        
        double  soma;
        double  total = 0, valorMaisCaro = Double.MIN_VALUE, valorMaisBarato = Double.MAX_VALUE;
        String produtoMaisCaro = null; 
        String produtoMaisBarato = "";
       
            for (int i = 0; i < 15; i++) {
                
                System.out.println("Informe o nome produto: ");
                String produto = ler.next();
                
                System.out.println("Informe o valor do produto: ");
                double valor = ler.nextDouble();
            
                total += valor;
                
                
                if (valor > valorMaisCaro) {
                    
                    valorMaisCaro = valor;
                    produtoMaisCaro = produto;
               
            } if (valor < valorMaisBarato) {
            
                  valorMaisBarato = valor;
                  produtoMaisBarato = produto;
                    
            }
        
            
    }
            System.out.println("O valor total dos produtos é: " + total);
            System.out.println("O produto mais barato é " + produtoMaisBarato + " - Valor: " + valorMaisBarato);
            System.out.println("O produto mais caro é " + produtoMaisCaro + " - Valor: " + valorMaisCaro);
    }
    
}
