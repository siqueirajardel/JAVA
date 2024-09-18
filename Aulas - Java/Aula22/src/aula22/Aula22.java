/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula22;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] pessoas = {"Jardel", "Rayssa", "Cleber", "João", "Wellington", "Bruno"};
        String busca;
        Arrays.sort(pessoas);
        
        Scanner ler = new
            Scanner(System.in);
        
        
        
        System.out.println("Informe um nome: ");
        System.out.println("=>");
        busca = ler.nextLine().toLowerCase();
        
        int result = Arrays.binarySearch(pessoas, busca);
            
        
        if (result >= 0) {
            
            System.out.println("O nome: " + result + " existe no Array!!!");
            
        } else {
        
            System.out.println("O nome: " + result + " não existe no Array!!!");
        
        }

    }
    
}
