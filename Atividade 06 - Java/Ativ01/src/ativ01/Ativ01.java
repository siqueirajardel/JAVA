/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ01;

/**
 *
 * @author Jardel
 */
public class Ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Funcionarios p1 = new Funcionarios(); 
       Funcionarios p2 = new Funcionarios(); 
       
       
       p1.nome = "Jardel Siqueira";
       p1.dataEntrada = "01/02/2024";
       p1.depto = "Senior Software Development";
       p1.salario = 8600;
       p1.rg = "MG99912345";
       
       p2.nome = "Rayssa Costa";
       p2.dataEntrada = "23/09/2023";
       p2.depto = "Law & Personal Health";
       p2.salario = 8980;
       p2.rg = "MG99912345";
       
       p1.exibirFuncionario();
       p1.recebeAumento(17);
       p1.salarioAnual();
       
       p2.exibirFuncionario();
       p2.recebeAumento(17);
       p2.salarioAnual();
       
       
    }
    
}
