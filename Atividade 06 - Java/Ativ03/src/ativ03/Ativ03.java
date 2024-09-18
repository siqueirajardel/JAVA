/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ativ03;

/**
 *
 * @author Jardel
 */
public class Ativ03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Televisor t1 = new Televisor();
       
       t1.canal = 1;
       t1.ligado = true;
       t1.volume = 0;
       
       t1.ligarTelevisor();
       t1.aumentarVolume();
       t1.aumentarVolume();
       t1.aumentarVolume();
       t1.aumentarVolume();
       t1.reduzirVolume();
       
       t1.subirCanal();
       t1.subirCanal();
       t1.subirCanal();
       t1.descerCanal();
       
       t1.mostraStatus();
       t1.desligarTv();
       
       
    }
    
}
