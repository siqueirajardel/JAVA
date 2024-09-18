/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ11;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
            System.out.println("Digite o nome do seu estilo musical: ");
            String estilo = ler.next();

                System.out.println("Digite o número de vezes que você deseja exibir a mensagem: ");
                int vezes = ler.nextInt();
        
        
        for (int i = 0; i < vezes; i++) {
            
            System.out.println("Eu gosto de ouvir " + estilo + "!!");
            
        }
        
        
    }
    
}
