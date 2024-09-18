/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula30;

/**
 *
 * @author Jardel
 */
public class Aula30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Filme f1 = new Filme();
        Serie s1 = new Serie();
        
        f1.setTitulo("Senhor Dos Anéis");
        f1.setGenero("Aventura");
        f1.setAvaliacao(7);
        f1.setDuracao(210);
        
        s1.setTitulo("O Atirador");
        s1.setGenero("Ação");
        s1.setAvaliacao(10);
        s1.setTemporada(3);
        
        //Outra forma de apresentar esses dados: 
        
        Filme f2 = new Filme("Tropa de Elite", "Ação/Policial", 9, 120);
        Serie s2 = new Serie("Suits", "Empreendedor/Direito", 10, 9);
        
        f1.exibirInfo();
        s1.exibirInfo();
        
        System.out.println("--------------------------------");
        
        f2.exibirInfo();
        s2.exibirInfo();
        
        
    }
    
}
