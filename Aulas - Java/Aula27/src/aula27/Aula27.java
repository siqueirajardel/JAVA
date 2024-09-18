/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula27;

/**
 *
 * @author Jardel
 */
public class Aula27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        
        p1.nome = "João Marcos";
        p1.contato = "(31) 99432-3896";
        p1.cpf = "123.456.789-00";
        p1.cidade = "Belo Horizonte";
        
            p2.nome = "Marta Silva";
        p2.contato = "(31) 99991-2345";
        p2.cpf = "101.112.131-41";
        p2.cidade = "Nova Lima";
        
        p1.exibirPessoa();
        p2.exibirPessoa();

    }
    
}
