/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ01;

/**
 *
 * @author Jardel
 */
public class Normal extends Ingresso {
    
    public String tipo;
    
    public  Normal(){
        super();
        
    }
    
    public Normal(double valor, String tipo){
    super();
    this.setTipo(tipo);
    }
    
    public void imprimirIngresso(){
        System.out.println("---Ingresso Normal---");
        super.imprimirIngresso();
        System.out.println("Tipo: " + getTipo());
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
