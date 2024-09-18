/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ02;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       
       String[] nomes = {"jardel", "bruno", "rayssa", "victor", "sandra", "ryan", "joao", "maria", "alice", "cleber"};
       String nome1;
       boolean busca = false;
       
        for (String nome : nomes) {
            
            System.out.println("Digite um nome qualquer: ");
            nome1 = ler.next().toLowerCase();
            
            if (nomes.equals(busca)) {
                busca = true;
                
                if (busca) {
                    System.out.println("ACHEI!!!");
                }
                
            } else {
                System.out.println("NÃO ACHEI!!!");
            }
         }
      }
   }
        
    
    

