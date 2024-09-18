/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int[] valores = new int [10];
        int numMaior = 0, numMenor = 9999 ;
        
        Arrays.sort(valores);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
            valores[i] = ler.nextInt();
           }
        
        for (int i = 0; i < valores.length; i++) {
            
            if (valores[i] > numMaior) {
               numMaior = valores[i];
              } 
            
            if (valores[i] < numMenor){
               numMenor = valores[i];
            }
            
        }
        System.out.println("O número maior é o: " + numMaior);
        System.out.println("O número menor é o: " + numMenor);
    }
    
}
