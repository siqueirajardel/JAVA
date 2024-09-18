/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ08;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
             
       double largura, profundidade, area;
       
        System.out.println("Informe a largura do terreno (m): ");
        largura = ler.nextDouble();
        
            System.out.println("Informe a profundidade do terreno(m): ");
            profundidade = ler.nextDouble();
            
            area = (largura * profundidade);
            
            
            System.out.println("A área do terreno é de " + area + " m² !!");
                    
       
    }
    
}
