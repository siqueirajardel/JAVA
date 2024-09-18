/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ07;

import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Ativ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new
            Scanner(System.in);
        
        int hom1, hom2, mu1, mu2, homemMV, homemMN, muMV, muMN, calc1, calc2;
        
        System.out.println("Informe a idade em anos do homem 1: ");
        hom1 = ler.nextInt();
        
            System.out.println("Informe a idade em anos do homem 2: ");
            hom2 = ler.nextInt();
        
                System.out.println("Informe a idade em anos da mulher 1: ");
                mu1 = ler.nextInt();
        
                    System.out.println("Informe a idade em anos do mulher 2: ");
                    mu2 = ler.nextInt();
                    
        if (hom1 != hom2 || mu1 != mu2) {
            
            if (hom1 > hom2) {
                
               homemMV = hom1;
               homemMN = hom2;
               
            } else {
            
            homemMV = hom2;
            homemMN = hom1;
            }
        
            if (mu1 > mu2) {
                
            muMV = mu1;
            muMN = mu2;
                
                
            } else {
            
            muMV = mu2;
            muMN = mu1;
            
            }
            
            calc1 = homemMV + mu2;
            calc2 = homemMN + mu1;
            
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é de: " + calc1);
            System.out.println("A soma da idade do homem mais novo com a mulher mais velha é de: " + calc2);
        }
    }
    
}
