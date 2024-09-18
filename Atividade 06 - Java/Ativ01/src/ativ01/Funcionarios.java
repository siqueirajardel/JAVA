/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ01;

/**
 *
 * @author Jardel
 */
public class Funcionarios {
        String nome;
        String depto;
        double salario;
        String dataEntrada;
        String rg;
        
void exibirFuncionario () {

    System.out.println("----- Informacoes do Funcionario -----");
    System.out.println("Nome: " + nome);
    System.out.println("Departamento: " + depto);
    System.out.println("Salario: " + salario);
    System.out.println("Data de Entrada: " + dataEntrada);
    System.out.println("RG: " + rg);

}
void recebeAumento (double percent) {
    salario += salario * (percent /100.0);
    
    System.out.println("Aumento de " + percent + "%" + ". Novo salario de: " + " R$ " + salario);
}    
 void salarioAnual(){
 
 salario += salario * 12;
     System.out.println("O salario anual deste(a) funcionario(a) é: " + salario);
 
 }       
        
        
        
        
}


