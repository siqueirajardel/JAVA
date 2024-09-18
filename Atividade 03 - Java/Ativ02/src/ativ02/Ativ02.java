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
        double venda, result = 0;
        int opt;
        
        System.out.println("Digite o valor da venda: ");
        venda = ler.nextInt();
        
        System.out.println("--------------- MENU ---------------");
        System.out.println("--- ESCOLHA A OPÇÃO DE PAGAMENTO ---");
        System.out.println("1. VENDA À VISTA (10% DE DESCONTO)--");
        System.out.println("2. 30 DIAS (5% DE DESCONTO)---------");
        System.out.println("3. 60 DIAS (VALOR ORIGINAL)---------");
        System.out.println("4. 90 DIAS (ACRÉSCIMO DE 5%)--------");
        System.out.println("5. CARTÃO DE DÉBITO (8% DE DESCONTO)");
        opt = ler.nextInt();
        
        switch (opt) {
            case 1:
                result = venda - venda*10/100;
                break;
            case 2:
                result = venda - venda*5/100;
                break;
            case 3:
                result = venda;
                break;
            case 4:
                result = venda + venda*5/100;
                break;
            case 5:
                result = venda - venda*8/100;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if (opt <= 5 && opt > 0) {
            System.out.println("O valor final da venda é: " + result);
        } else{
            System.out.println("");
        }
    }
    
}
