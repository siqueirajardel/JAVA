/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dev_noite
 */
public class Aula25 {
    
     List<String>  nomes = new ArrayList<>();
        List<Integer> idades = new ArrayList<>();
       
    /**
     * @param args the command line arguments
     */
    
    void cadastrar() {
        
         Scanner ler = new
            Scanner(System.in);
        
        boolean check;
        do {
        
            System.out.println("Digite o nome do cliente: ");
            nomes.add(ler.nextLine());
            
                System.out.println("Informe sua idade: ");
                idades.add(ler.nextInt());
            
                    System.out.println("Deseja cadastrar outro cliente? 1.SIM/2.NÃO");
                    System.out.println("=>");
                    int opt = ler.nextInt();
            
            check = opt == 1;
            
            /* if (opt == 1) {
              check = true;
            } else {
             check = false;
            }
                }*/
            
            if (opt == 1) {
                check = true;
            
            }
        
        } while (check);
        
        System.out.println("Cliente(s) Cadastrado(s) com sucesso!!");

    }
    void listar() {
        int qtde = nomes.size();
        System.out.println(qtde + " Foram cadastrados no sistema.");
        System.out.println("------ Lista de Clientes Cadastrados ------");
        
        for (int i = 0; i < qtde; i++) {
            System.out.println("---------- CLIENTE" + i + "----------");
            System.out.println("Nome: " + nomes.get(i));
            System.out.println("Idade: " + idades.get(i));
            System.out.println("--------------------------------------");
    }
    }
    void deletar(int del) {
        
        Scanner entrada = new Scanner(System.in);
        
        if (nomes.isEmpty()) {
            System.out.println("Não existem Clientes cadastrados!!!");
        } else {
        
        if (nomes.contains(nomes.get(del))) {
            
            System.err.println("Tem certeza que você deseja excluir " + nomes.get(del) + "?");
            System.out.print("1.SIM / 2.NÃO");
            int confirm = entrada.nextInt();
            boolean exc = confirm == 1;
            
            if (exc) {
            nomes.remove(del);
            idades.remove(del);
            
            System.out.println("Cliente excluído com sucesso!!!");
          } else {
                
            System.out.println("Cliente não encontrado!!!");
            
        }
      }
    }
  }
    public static void main(String[] args) {
        
       Aula25 aula = new Aula25();
       
       Scanner input = new Scanner(System.in);
       
       boolean ok = true;
       
       do {
       
       
       //aula.cadastrar();
       
        System.out.println("-----SISTEMA DE CADASTRO DE CLIENTES-----");
        System.out.println("Escolha as opções abaixo: ---------------");
        System.out.println("1. CADASTRAR CLIENTE --------------------");
        System.out.println("2. LISTAR CLIENTE -----------------------");
        System.out.println("3. EXCLUIR CLIENTE ----------------------");
        System.out.println("4. SAIR DO SISTEMA ----------------------");
        System.out.println("=>");
        int escolha = input.nextInt();
        
        switch (escolha) {
            case 1:
               aula.cadastrar();
                break;
            case 2:
               aula.listar();
                break;
            case 3:
                System.out.println("Informe o código do Cliente: ");
                int cod = input.nextInt();
                aula.deletar(cod);
                break;
            case 4:
               ok = false;
                break;
            default:
                System.out.println("Opção inválida!!!");
                break;
        }
       } while (ok);
       
        System.out.println("Sistema finalizado!!!");
    }
    
}
