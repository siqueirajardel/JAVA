/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula26;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num_aleatorio, num;
        
        num_aleatorio = (int) Math.random() * 10 + 1;
        
        System.out.println("Tente adivinhar o número aleatório, digite: ");
        num = ler.nextByte();
        
        boolean check = true;
        
        while (check) {

            if (num != num_aleatorio){
                System.out.println("Eeeeerrrrooouuuu!!!! Tente novamente!!!");
                System.out.print("Digite um número: ");
                num = ler.nextInt();
            } else {
                check = false;
            }  
        }
        System.out.println("Parabéns!!! Você acertou!!!");
    }
    
}
