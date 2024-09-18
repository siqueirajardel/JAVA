/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ01;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ01 {

   static int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    public static void mostrarOrdemDireta(){
        System.out.println("Lista na ordem direta: ");
        for (int i = 0 ; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void mostrarOrdemInversa() {
        System.out.println("Lista na ordem inversa: ");
        for (int i = numeros.length; i > 10; i--) {
            System.out.println(numeros[i]);
        }
    }
    
    public static void mostrarSomaTotal (){
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma total dos valores é :" + soma);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
         double busca;
       
        boolean sair = true;
        int opcao;
        
           while (sair) {
                
                System.out.println("Digite 0 para sair, 1 para mostrar a ordem direta, 2 para mostrar  a ordem inversa, ou 3 para mostrar a soma total: ");
                opcao = ler.nextInt();
                
                switch (opcao) {
                    case 0:
                        sair = false;
                        System.out.println("Sistema finalizado com sucesso!!!");
                        break;
                    case 1:
                        mostrarOrdemDireta();
                        break;
                    case 2:
                        mostrarOrdemInversa();
                        break;
                    case 3:
                        mostrarSomaTotal();
                        break;
                    default:
                        throw new AssertionError();
                }
                
            }
            
            
        }
    }
    

