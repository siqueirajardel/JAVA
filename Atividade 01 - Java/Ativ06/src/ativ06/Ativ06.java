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
        
       String nome, sexo, estadocivil, anos;
       
        System.out.println("Informe o seu nome: ");
        nome = ler.next();
        
            System.out.println("Informe o seu sexo (M ou F)");
            sexo = ler.next().toUpperCase();
            
                System.out.println("Informe seu estado civil");
                estadocivil = ler.next().toUpperCase();
                
            if (estadocivil.equals("CASADA")&& sexo.equals("F")) {
            
                System.out.println("Informe o tempo de casamento em anos:");
                anos = ler.next();
        }
 
                
                
                
    }
    
}
