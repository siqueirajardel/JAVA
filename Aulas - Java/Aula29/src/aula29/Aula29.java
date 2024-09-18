/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula29;

/**
 *
 * @author Jardel
 */
public class Aula29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        
        c1.setId(10001);
        c1.setNome("Marta Silva");
        c1.setEmail("MartaSlva@gmail.com");
        c1.setContato("(11)4002-5922");
        c1.setCpf("098.123.099-11");
        c1.setSaldo(2200);
        
        c1.exibirCliente();
        System.out.println(c1.getNome());
        
    }
    
}
