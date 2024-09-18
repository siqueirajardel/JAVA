/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula28;

/**
 *
 * @author Jardel
 */
public class Aula28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        
        p1.id = "0911";
        p1.marca = "Porsche";
        p1.nome = "911 GT3 RS";
        p1.preco = "R$ 2.599.000";
        p1.quantidade = "01";
        
        p2.id = "0718";
        p2.marca = "Porsche";
        p2.nome = "Cayman 718 GT4 RS";
        p2.preco = "R$ 1.989.000";
        p2.quantidade = "01";
        
        p1.exibirProduto();
        p2.exibirProduto();
        
    }
    
}
