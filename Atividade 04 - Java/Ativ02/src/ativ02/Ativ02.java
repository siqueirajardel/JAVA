/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ02;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        double valorGasolina, valorPagamento, litros;
        
        System.out.println("Informe o preço do litro da gasolina: ");
        valorGasolina = ler.nextDouble();
        
        System.out.println("Informe o valor total de pagamento: ");
        valorPagamento = ler.nextDouble();
        
        litros = valorPagamento / valorGasolina;
        
        System.out.printf("O valor abastecido em litros (L), foi de: %.2f", litros);
    }
    
}
