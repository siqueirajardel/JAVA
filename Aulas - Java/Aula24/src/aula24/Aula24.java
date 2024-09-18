/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula24;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev_noite
 */
public class Aula24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(25);
        numeros.add(12);
        numeros.add(45);
        numeros.add(34);
        numeros.add(19);
        
        numeros.remove(2); //remove o valor da posição 2 da Array
        
        //System.out.println(numeros.get(3)); imprime somente o valor da posição 3 
        
        for (int i = 0; i < numeros.size(); i++) {
            
            System.out.println(numeros.get(i));
            
        }
        
    }
    
}
