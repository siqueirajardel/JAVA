/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ02;

/**
 *
 * @author Jardel
 */
public class Ativ02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Calculadora c1 = new Calculadora();
       
       c1.num1 = 15;
       c1.num2 = 4;
       
       c1.exibirAdicao();
       c1.exibirSubtracao();
       c1.exibirMultiplicacao();
       c1.exibirDivisao();
       c1.exibirResto();
    }
    
}
