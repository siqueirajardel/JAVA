/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula31;

/**
 *
 * @author Jardel
 */
public class Violao extends Instrumento{
    private String funcionamento;
    private String marca;
    private String modelo;
    private int numCordas;
    private double preco;
    
    public Violao(){
        super();
    }
    
    public Violao(String funcionamento, String marca, String modelo, String cor, int numCordas, double preco){
        this.funcionamento = funcionamento;
        this.marca = marca;
        this.modelo = modelo;
      
    }
    
    public void exibirInfo(){
    super.exibirInfoInstrumento(getMarca(), getModelo());
    System.out.println("Informações da Guitarra:");
    System.out.println("Funcionamento: " + getFuncionamento());
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo());
    System.out.println("Número de cordas: " + getNumCordas());
    System.out.println("Preço: " + getPreco());
    System.out.println("-----------------------------------");
        
    }

    public String getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(String funcionamento) {
        this.funcionamento = funcionamento;
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
    
    
    
}
