/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ07;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] num = new int[10];
        int pares = 0, impares = 0;
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Digite um número: " + i + ":");
            num[i] = ler.nextInt();
        }
            for (int i = 0; i < num.length; i++) {

                if(num[i] % 2 ==0){
                pares += num[i];

                } else {
                impares += num[i];
                }
           }
            System.out.println("A soma dos numeros pares é: " + pares);
            System.out.println("A soma dos numeros impares é: " + impares);
        }
        
    }
    

