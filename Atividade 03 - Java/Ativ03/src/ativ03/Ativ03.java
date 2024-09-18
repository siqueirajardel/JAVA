/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ03;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        double pesoNoPlaneta, pesoNaTerra, gravidade, pesoPessoa, result = 0;
        int opt;
        System.out.println("Informe seu peso (em Kg): ");
        pesoPessoa = ler.nextDouble();
        
        System.out.println("---------------- MENU ---------------");
        System.out.println("ESCOLHA EM QUAL PLANETA VOCÊ DESEJA VER SEU PESO: ");
        System.out.println("1. Mercúrio -------------------------");
        System.out.println("2. Vênus ----------------------------");
        System.out.println("3. Marte ----------------------------");
        System.out.println("4. Júpiter --------------------------");
        System.out.println("5. Saturno --------------------------");
        System.out.println("6. Urano ----------------------------");
        System.out.println("=>");
        opt = ler.nextInt();
        
        switch (opt) {
            case 1:
                result = pesoPessoa / 10 * 0.37;
                break;
            case 2:
                result = pesoPessoa / 10 * 0.88;
                break;
            case 3:
                result = pesoPessoa / 10 * 0.38;
                break;
            case 4:
                result = pesoPessoa / 10 * 2.64;
                break;
            case 5:
                result = pesoPessoa / 10 * 1.15;
                break;
            case 6:
                result = pesoPessoa / 10 * 1.17;
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
        if (opt <= 6 && opt > 0) {
            System.out.println("O seu peso no planeta selecionado é: " + result + "Kg");
        } else {
            System.out.println("");
        }
    }
    
}
