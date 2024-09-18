/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ06;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
       
       int total = 0, moraNovalima = 0, moraFora = 0;
       String usuario, cidade, totalUsuarios;
       
        for (int i = 0; i < 3; i++) {
            
        
        System.out.println("Informe seu nome: ");
        usuario = ler.nextLine();
        
        System.out.println("Informe sua cidade natal: ");
        cidade = ler.nextLine().toUpperCase();
        
        if (cidade.contains("Nova Lima")) {
            
        moraNovalima++;
        
            System.out.println("A quantidade de pessoas que moram em Nova Lima é de: " 
                  + moraNovalima + " pessoas." );
            
        } else {
    
        moraFora++;
        }
        }
            System.out.println("A quantidade de pessoas que não moram em Nova Lima é de: " 
                  + moraFora + " pessoas." );
    }
    
    }

        
