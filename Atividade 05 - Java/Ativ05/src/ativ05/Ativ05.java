/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ05;

import java.util.Scanner;

/**
 *
 * @author Jardel
 */
public class Ativ05 {
private static void mostrarVetor(int[] vetor){
    System.out.println("Vetor na ordem direta: ");
    for (int num : vetor) {
        System.out.println(num + "");
    }


}
private static void mostrarVetorInverso (int[] vetor) {
    System.out.println("Vetor na ordem inversa: ");
    for (int i = vetor.length - 1; i >= 0; i--) {
        System.out.println(vetor[i] + "");
    }

}

private static void mostrarSomaTotal (int[] vetor) {
    int soma = 0;
    for (int num : vetor) {
        soma += num;
    }
    System.out.println("A soma total dos valores é: " + soma);
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner ler = new Scanner(System.in);
     
     int[] vetor = new int [10];
     int opcao;
     
        System.out.println("Digite os valores do vetor: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ":");
            vetor[i] = ler.nextInt();
        }
     
        do {

            System.out.println("Digite 0 para sair, 1 para mostrar os valores na ordem direta, 2 na ordem inversa, ou 3 para mostrar a soma desses valores: ");
            opcao = ler.nextInt();
            
            switch (opcao) {
                case 0:
                    System.out.println("Sistema finalizado!!!");
                    break;
                case 1:
                    mostrarVetor(vetor);
                    break;
                case 2:
                    mostrarVetorInverso(vetor);
                    break;
                case 3:
                    mostrarSomaTotal(vetor);
                    break;
                default:
                    System.out.println("Opção inválida.  Digite novamente.");
            }
        } while (opcao  != 0);
    } 

}