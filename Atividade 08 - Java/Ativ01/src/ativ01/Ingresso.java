/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ01;

/**
 *
 * @author Jardel
 */
public class Ingresso {
    
    public double valor;
    
    public void Ingresso(){
    
    }
    
    public void Ingresso(double valor){
        this.setValor(valor);
    }
    
    public void imprimirIngresso(){
        System.out.println("Valor Ingresso: " + getValor());
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
        
    }
}
