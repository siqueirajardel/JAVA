/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ03;

/**
 *
 * @author Jardel
 */
public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;
    private double salarioAumento;
    private double salarioAnual;
    
    
    public void empregadoTeste (String nome, String sobrenome, double salario, double salarioAumento, double salarioAnual){
        System.out.println("------Conta Corrente------");
        System.out.println("Nome: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Aumento Salario: " + getSalarioAumento());
        System.out.println("Salario Anual: " + getSalarioAnual());
    } 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
       this.salario = salario;
    }

    

    public double getSalarioAumento() {
        return salarioAumento;
    }


    public void setSalarioAumento(double salarioAumento) {
        this.salarioAumento = salario * 10 / 100;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual * 12;
    }
}