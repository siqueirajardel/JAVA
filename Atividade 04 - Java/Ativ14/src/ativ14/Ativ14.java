/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ14;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new
            Scanner(System.in);
        String nomeMN = "";
        int idadeMN = Integer.MAX_VALUE;
        
        for (int i = 0; i <= 10; i++) {
            
        
        
        System.out.println("Informe o nome de uma pessoa: ");
        String nome = ler.nextLine();
        
        System.out.println("Informe a idade dessa pessoa: ");
        int idade = ler.nextInt();
        
            if (idade < idadeMN) {
                
                idadeMN = idade;
                nomeMN = nome;
                
            }
            System.out.println("A pessoa mais nova é: " + nomeMN);
        }
        
        
    }
    
}
