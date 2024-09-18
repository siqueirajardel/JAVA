/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ07;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
       int anos = 0;
       Double alturaJorge = 1.72;
       Double alturaRoberto = 1.65;
       Double crescimentoJorge = 0.03;
       Double crescimentoRoberto = 0.04;
       
       
        while (alturaRoberto <= alturaJorge) {

             alturaJorge += crescimentoJorge;
             
             alturaRoberto += crescimentoRoberto;
             
             anos++;
            
        }
       
       
        System.out.print("o tempo necessário para Roberto ficar maior que Jorge é de: " + anos + "anos.");
            
    }
    
}
