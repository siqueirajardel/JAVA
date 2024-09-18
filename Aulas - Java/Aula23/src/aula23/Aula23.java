/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula23;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new
            Scanner(System.in);
       
        String[] pessoas = {"jardel", "rayssa", "cleber", "joão", "wellington", "bruno"};
        String busca;
        boolean result = false;

        System.out.println("Informe um nome de uma pessoa: ");
        System.out.println("=>");
        busca = ler.nextLine().toLowerCase();
        
        for(String pessoa: pessoas){
          
            if (pessoa.equals(busca)){
                
                result = true;
                
            }
                    
        }
        
        if (result) {
            
            System.out.println("O nome: " + busca + " existe no Array!!!");
            
        } else {
        
            System.out.println("O nome: " + busca + " não existe no Array!!!");
        
        }
    }
    
}
