/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num, total = 0; 
        
        for (int i = 1; i <= 5; i++ ) {
            
            System.out.print("Digite um número " + i + ":");
            num = ler.nextInt();
            
            total += num;  //total = total + num
            
        }
            
            System.out.println("A soma dos números digitados é; " + total);
          
        }
        
    }
    

