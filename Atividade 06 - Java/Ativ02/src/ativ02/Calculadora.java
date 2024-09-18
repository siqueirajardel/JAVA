/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ02;

/**
 *
 * @author Jardel
 */
public class Calculadora {
    
    double num1, num2, num3;
    double adicao, subtracao, multiplicacao, divisao, resto;
    
void exibirAdicao(){
    adicao = num1 + num2;
    System.out.println("O resultado da adicao é: " + adicao);
}

void exibirSubtracao(){
    subtracao = num1 - num2;
    System.out.println("O resultado da subtracao é: " + subtracao);
}

void exibirMultiplicacao(){
    multiplicacao = num1 * num2;
    System.out.println("O resultado da multiplicacao é: " + multiplicacao);
}

void exibirDivisao(){
    divisao = num1 / num2;
    System.out.println("O resultado da divisao é: " + divisao);
}

void exibirResto(){
    num3 = num1 / num2;
    resto = num3 % 2;
    System.out.println("O resultado do resto é: " + resto);
}
    
    
    
    
}
