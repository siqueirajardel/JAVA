/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ03;

/**
 *
 * @author Jardel
 */
public class Televisor {
    
    int canal, volume;
    boolean ligado, desligado;
    boolean retur = true;
    
void Televisor() {
    this.canal = 1;
    this.volume = 0;
    this.ligado = false;
}
    
    
void exibirMenu(){
    System.out.println("----MENU DO TELEVISOR----");
    System.out.println("1. Desligar TV " + desligado);
    System.out.println("2. Subir canal " + canal);
    System.out.println("3. Descer canal " + canal);
    System.out.println("4. Aumentar volume " + volume);
    System.out.println("5. Diminuir volume " + volume);
    
}
void desligarTv(){
    ligado = false;
    System.out.println("Desligando TV...   ");
}
                
void aumentarVolume(){
    if (ligado) {
        if (volume < 10) {
            
            volume++;
            System.out.println("Volume " + volume);
        } else {
            System.out.println("Volume máximo atingido!!!");
        }
    
    } else {
        System.out.println("O televisor está desligado!!!");
    }
}

void reduzirVolume(){
    if (ligado) {
        if (volume > 0) {
            //volume = volume - 1;
            volume--;
            System.out.println("Volume " + volume);
        } else{
            System.out.println("Volume mínimo atingido!!!");
        }
    } else {
        System.out.println("O televisor está desligado!!!");
    }
}

void subirCanal(){
    if (ligado) {
        if (canal < 16) {
            //canal = canal + 1;
            canal++;
            System.out.println("Canal " + canal);
        } else {
            canal = 1;
        }
    } else {
        System.out.println("O televisor está desligado!!!");
    }
}

void descerCanal(){
    if (ligado) {
        if (canal > 1) {
            //canal = canal - 1;
            canal--;
            System.out.println("Canal " + canal);
        } else {
            canal = 16;
        }
    } else {
        System.out.println("O televisor está desligado!!!");
    }
}

void ligarTelevisor(){
    ligado = true;
    System.out.println("Televisor ligado!!!");
}

void mostraStatus(){
    if (ligado) {
        System.out.println("O televisor está ligado!!!");
    } else {
        System.out.println("O televisor está desligado!!!");
    } if (volume < 10) {
        System.out.println("Volume... " + volume);
    } if (canal < 16) {
        System.out.println("Canal... " + canal);
    }
}

}
