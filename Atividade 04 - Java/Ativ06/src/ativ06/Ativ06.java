/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ06;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
       
       String nome;
       double comissao = 0;
       
        System.out.println("Informe o seu nome: ");
        nome = ler.next();
        
        System.out.println("Informe o número de produtos vendidos: ");
        int vendas = ler.nextInt();
       
        
        if (vendas <= 199) {
            
            comissao = vendas * 5;
        
            } else if (vendas >= 200 && vendas <= 449) {
        
            comissao = vendas * 7.5;
        
                } else if (vendas >= 450){
        
                comissao = vendas * 10;
        
    }
        System.out.println("O vendedor: " + nome + " recebeu R$" + comissao + " de comissão.");
    }
    
        
}
