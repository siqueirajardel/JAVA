/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ02;

/**
 *
 * @author Jardel
 */
public class ContaCorrente{
    
    private double saldo;
    private String cliente;
    

    
    void exibirCliente(){
        System.out.println("-----Conta Corrente-----");
        System.out.println("Cliente: " + getCliente());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("------------------------");
    }
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo <= -1) {
            saldo = 0;
        } else {
            saldo = saldo;
        }
    }

    
    
}
