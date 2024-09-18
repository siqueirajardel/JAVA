/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula19;

import java.util.Scanner;

/**
 *
 * @author DEV_noite
 */
public class Aula19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new
            Scanner(System.in);
        
        
        System.out.println("Quantas pessoas você deseja cadastrar?");
        int qtde = ler.nextInt();
       
        
        String[] pessoas = new String[qtde]; 
        
        for (int i = 0; i < pessoas.length; i++) {

                System.out.println("Digite o nome da pessoa " + i + ": ");
                pessoas [i] = ler.next();
            
        }
                
                     System.out.println("As pessoas cadastradas foram: ");

                        for (int i = 0; i < pessoas.length; i++) { //clicar na lampada que sugere para converter para loop(altera essa linha)

                           System.out.println(pessoas[i]);
            
        }
        
    }
    
}
