/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ08;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int valor = 0, dentroITV = 0, foraITV = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            valor = ler.nextInt();
            
            if (valor >= 10 && valor <= 20) {

            dentroITV++;    
            
            } else {
            
            foraITV++;
            
            }
            
        }
        System.out.println("A quantidade de números no intervalo entre 10 e 20 são de: " + dentroITV++);
        System.out.println("A quantidade de números fora do intervalo entre 10 e 20 são de: " + foraITV++);
    }
    
}
