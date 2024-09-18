/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula30;

/**
 *
 * @author Jardel
 */
public class Serie extends VideoFlix{
    
    private int episodio;
    private int temporada;
    
    public Serie(){
        super();
    }
    
    public Serie(String titulo, String genero, int avaliacao, int temporada){
        super(titulo, genero, avaliacao);
        this.episodio = episodio;
        this.temporada = temporada;
    }
    
    public void exibirInfo(){
    
        System.out.println("------- Informações da Série -------");
        super.exibirInfo();
        System.out.println("Temporadas: " + temporada);
        System.out.println("------------------------------------");
    
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
    
    
}
