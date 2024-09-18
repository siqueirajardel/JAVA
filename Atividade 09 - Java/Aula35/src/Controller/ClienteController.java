/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Jardel
 */
public class ClienteController {
    
    Cliente c1;
    
    public void cadCliente(String nome, String email, String cpf, String contato, String sexo, String preferencia, String estado, String senha){
    
        int id = (int) (Math.random() * 100 + 1);    

        c1 = new Cliente(id, nome, email, cpf, contato, sexo, preferencia, estado, senha);
    }
    
    public void exibirCadastro() {

        JOptionPane.showMessageDialog(null, 
                "------- Informações Cadastradas ------- \n" + 
                "ID do Cliente: " + c1.getId() + "\n" +
                "Nome do Cliente: " + c1.getNome() + "\n" +
                "E-mail: " + c1.getEmail() + "\n" +
                "CPF: " + c1.getCpf() + "\n" +
                "Contato: " + c1.getContato() + "\n" +
                "Sexo: " + c1.getSexo() + "\n" +
                "Preferência: " + c1.getPreferencia() + "\n" +
                "Estado: " + c1.getEstado() + "\n" +
                "Senha: " + c1.getSenha() + "\n" +
                "---------------------------------------",
                        
                "Cliente Cadastrado", 
                JOptionPane.INFORMATION_MESSAGE);
    
}
    
    public boolean validarCampos(){
    
        if (c1.getNome().isEmpty()) {
            
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Nome", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
         
        } else if(c1.getEmail().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Email", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else if(c1.getCpf().equals("   .   .   -  ")) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo CPF", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else if(c1.getContato().equals(c1.getContato())) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Contato", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else if(c1.getSexo().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Sexo", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else if(c1.getPreferencia().equals("[]")) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Preferencia", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        }  else if(c1.getEstado().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Estado", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else if(c1.getSenha().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você não preencheu o campo Senha", 
                    "ERRO!", JOptionPane.WARNING_MESSAGE);
            
            return false;
            
        } else{
            
            return true;    
        }
    
    }
    
}
