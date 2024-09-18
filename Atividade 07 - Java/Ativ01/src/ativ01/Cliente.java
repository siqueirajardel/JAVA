/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ01;

/**
 *
 * @author Jardel
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String endereco;
    private double renda;
    
    
void mostrarCliente(){
    
    System.out.println("----INFORMACOES DO CLIENTE----");
    System.out.println("Nome do Cliente: " + getNome());
    System.out.println("Endereço: " + getEndereco());
    System.out.println("Renda: " + getRenda());
    System.out.println("------------------------------");
    
}

public void setId(int id){
    this.id = id;
}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
}
