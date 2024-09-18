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
        
        String nome;
        int meta, vendas;
        
        System.out.println("Informe o nome do vendedor: ");
        nome = ler.next();
        
            System.out.println("Informe o valor da meta de vendas: ");
            meta = ler.nextInt();
        
                System.out.println("Informe o número de vendas realizadas: ");
                vendas = ler.nextInt();
        
        if (vendas > meta) {
            
            System.out.println("Você ganhou!");
            
        } else if (vendas < meta){
            
            System.out.println("O vendedor " + nome + " ainda não atingiu a meta de vendas!");
        
            
        }
        
        
        
        
        
        
    }
    
}
