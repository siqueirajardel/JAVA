                    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula15;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        double num1,num2, result = 0;
        int opt;
        
        System.out.println("Informe um número: ");
        num1 = ler.nextDouble();
        
        System.out.println("Informe outro número: ");
        num2 = ler.nextDouble();
        
        System.out.println("---------------- MENU DE CÁLCULOS ---------------");
        System.out.println("INFORME QUAL DAS OPÇÕES ABAIXO DESEJA REALIZAR O CÁLCULO: ");
        System.out.println("1. Somar ------------------------------");
        System.out.println("2. Subtrair ---------------------------");
        System.out.println("3. Multiplicar ------------------------");
        System.out.println("4. Dividir ----------------------------");
        System.out.println("---------------------------------------");
        System.out.println("=>");
        opt = ler.nextInt();
        
        switch (opt) {
            case 1:
                result = num1 + num2;
            break;
            
            case 2:
                result = num1 - num2;
            break;  
            
            case 3:
                result = num1 * num2;
            break;

            case 4:
                result = num1 / num2;
            break;    
               
            default:
                System.out.println("Opção inválida!");
                break;
        }
    
        if(opt <= 4 && opt > 0) {
            System.out.println("O resultado do cálculo é: " + result); 
    } else {
            System.out.println("");
            
}
    }
}

   

