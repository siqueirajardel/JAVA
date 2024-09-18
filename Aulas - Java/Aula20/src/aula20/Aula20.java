/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula20;

import java.util.Arrays;
import java.util.Comparator;


/**
 *
 * @author DEV_noite
 */
public class Aula20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int[] numeros = {44, 5, 18, 23, 31, 19, 7};
        String[] frutas = {"Laranja", "Abacaxi", "Maçã"};
        
        Arrays.sort(numeros);//Organizar em ordem decrescente
        
        System.out.println(Arrays.toString(numeros));
        
        Arrays.sort(frutas, Comparator.reverseOrder());//Organizar em ordem alfabetica ao contrário
        
        System.out.println(Arrays.toString(frutas));
        
        Integer[] nums = {44, 5, 18, 23, 31, 19, 7};
        
        Arrays.sort(nums, Comparator.reverseOrder()); //Organizar em ordem decrescente
        
        System.out.println(Arrays.toString(nums));
        
        
        Arrays.sort(frutas, Comparator.naturalOrder());//Organizar em ordem alfabetica
        
        System.out.println(Arrays.toString(frutas));
        
        
                
    }
    
}
