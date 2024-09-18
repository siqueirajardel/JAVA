/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula31;

/**
 *
 * @author Jardel
 */
public class Guitarra extends Instrumento {
    private String funcionamento;
    private String marca;
    private String modelo;
    private int numCordas;
    private double preco;
    
    
public Guitarra(){
    super();
}
    
public Guitarra(String funcionamento, String cor, int numCordas, double preco){
    this.funcionamento = funcionamento;
    this.numCordas = numCordas;
    this.preco = preco;
    
}

public void exibirInfo(){
    super.exibirInfoInstrumento(marca, modelo);
    System.out.println("Informações da Guitarra:");
    System.out.println("Funcionamento: " + funcionamento);
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Número de cordas: " + numCordas);
    System.out.println("Preço: " + preco);
    System.out.println("-----------------------------------");
}

    public String getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(String funcionamento) {
        this.funcionamento = funcionamento;
    }

    public int getNumCordas() {
        return numCordas;
    }

    public void setNumCordas(int numCordas) {
        this.numCordas = numCordas;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
