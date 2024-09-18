/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num, soma = 0, mult = 1;
        
        for (int i = 1; i <= 5; i++) {
            
            System.out.println("Informe um número " + i + ":");
            num = ler.nextInt();
            
            if (num > 10) {
                
                soma += num; //soma = soma + num
                
            }else{
                
                if (num == 0){
                    num = 1;
                }
                
                mult *= num; //mult = mult * num
                
            }
            
        }
        
        System.out.println("A soma dos números maiores que 10 é:" + soma);
        System.out.println("A multiplicação números menores que 10 é:" + mult);
        
    }
    
}
