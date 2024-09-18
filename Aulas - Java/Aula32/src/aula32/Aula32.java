/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula32;

import javax.swing.JOptionPane;

/**
 *
 * @author Jardel
 */
public class Aula32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1, num2, result;
        
        try {
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número",
                "Dados",  JOptionPane.INFORMATION_MESSAGE)); 
        
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite outro número",
                "Dados",  JOptionPane.INFORMATION_MESSAGE)); 
        
        result = num1 + num2;
        
        JOptionPane.showMessageDialog(null,"O resultado do cálculo é " + result, "Mensagem", 
        JOptionPane.INFORMATION_MESSAGE);
      
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null,"Operação cancelada. O Programa está cansado de tanta burrice :( ", "Erro!!!", 
        JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        
    }
    
}
