/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Jardel
 */
public class Ativ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] palpiteUsuario = {5, 10, 15, 20, 25, 30};
       int[] numerosSorteados = sortearNumeros();

        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados)); 
        
        int acertos = verificarAcertos(palpiteUsuario, numerosSorteados);

        System.out.println("Você acertou " + acertos + " números.");
    }
    public static int[] sortearNumeros() {
        Random random = new Random();
        
        int[] numeros = new int[6];
        
        
        for (int i = 0; i < 6; i++) {
            numeros[i] = random.nextInt(60) + 1;
            
        }
        return numeros;
    }

    public static int verificarAcertos(int[] palpite, int[] sorteio) {
        int acertos = 0;
        for (int numero : palpite) {
            for (int sorteado : sorteio) {
                
                if (numero == sorteado) {
                    acertos++;
                    break;
                    
            }
          }
        }
        return acertos;
    }
}
