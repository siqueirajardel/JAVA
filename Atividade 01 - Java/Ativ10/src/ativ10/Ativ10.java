/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ10;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
           Scanner(System.in);
       
       double litros, valorgasolina, valortotal;
            System.out.println("Informe o valor do combustível que você deseja  colocar no seu tanque: ");
       valorgasolina = ler.nextDouble();
       
       
            System.out.println("Informe a quantidade de litros que você abasteceu: ");
            litros = ler.nextDouble();
            
            
            valortotal = (valorgasolina * litros);
                       System.out.println("O valor a pagar é: " + valortotal );
                       
                       
                       
                
       
       
       
        
       
       
           
    }
    
}
