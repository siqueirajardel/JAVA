/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ.pkg01;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
        
        int cavalos, ferraduras;
        
        System.out.println("Informe o número de cavalos comprados no seu haras: ");
        cavalos = ler.nextInt();
        
        ferraduras = cavalos * 4;
        
        System.out.println("O número necessário de ferraduras para os cavalos são de: " + ferraduras + " ferraduras!");
    }
    
}
