/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula14;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num = 0, total = 0, i = 1;
        
        while (num != -1) {            
            
            System.out.print("Digite um número " + i + " ou -1 para sair: ");
            num = ler.nextInt();
            
            total += num;
            
            i++;
        }
        
    }
    
}
