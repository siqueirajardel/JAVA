/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula30;

/**
 *
 * @author Jardel
 */
public class VideoFlix {
    
    private String titulo;
    private String genero;
    private int avaliacao;
    
    public VideoFlix(){
    
    }
    
    public void exibirInfo(){
        
        System.out.println("Titulo: " + titulo);
        System.out.println("Genero: " + genero);
        System.out.println("Avaliacao: " + avaliacao);
        
                
                
    }
    
    public VideoFlix(String titulo, String genero, int avaliacao){
        this.titulo = titulo;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
    
}
