/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ01;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner ler = new
            Scanner(System.in);
         
         double num1, num2, result = 0;
         int opt;
         
         System.out.println("Digite o número que você deseja realizar as operações: ");
         num1 = ler.nextDouble();
         
         System.out.println("---------- MENU ----------");
         System.out.println("INFORME QUAL DAS OPÇÕES ABAIXO VOCÊ DESEJA OPERAR: ");
         System.out.println("1. RAIZ QUADRADA ---------");
         System.out.println("2. A METADE --------------");
         System.out.println("3. 10% DO NÚMERO ---------");
         System.out.println("4. O DOBRO DO NÚMERO -----");
         System.out.println("=>");
         opt = ler.nextInt();
         
         switch (opt) {
            case 1:
                result = num1 * num1;
                break;
            case 2:
                result = num1 / 2;
                break;
            case 3:
                result = num1 * 10/100;
                break;
            case 4:
                result = num1 * 2;
                break;
            default:
                System.out.println("Opção inválida!!");
                break;
        }
         
         if (opt <= 4 && opt > 0) {
             System.out.println("O resultado do cálculo é: " + result);
        } else {
             System.out.println("");
         }
         }
         
         
         
    }
    
    
    

