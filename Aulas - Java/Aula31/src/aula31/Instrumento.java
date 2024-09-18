/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula31;

/**
 *
 * @author Jardel
 */
public class Instrumento {
    private String cor;
    private String nome;
    
    public Instrumento(){
    
    }
    
    public Instrumento(String cor, String nome){
        
    this.cor = cor;
    this.nome = nome;
    
    }
    
    public void exibirInfoInstrumento(String cor, String nome){
    
        System.out.println("------Informações do instrumento------");
        System.out.println("Cor: " + cor);
        System.out.println("Nome: " + nome);
        System.out.println("--------------------------------------");
    
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
