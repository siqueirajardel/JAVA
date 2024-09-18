/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula29;

/**
 *
 * @author Jardel
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String email;
    private String contato;
    private String cpf;
    private double saldo;
    
    public void exibirCliente(){
        System.out.println("------Informacoes do Cliente " + id + " ------");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Contato: " + contato);
        System.out.println("CPF: " + cpf);
        System.out.println("Saldo: " + saldo);
        System.out.println("--------------------------------------------");
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
