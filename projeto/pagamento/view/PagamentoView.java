package projeto.pagamento.view;
import java.io.*;
import java.util.Scanner;

import projeto.pagamento.controller.PagamentoController;
public class PagamentoView {

    PagamentoController pagamento = new PagamentoController();
   
    Scanner scanner = new Scanner(System.in);

    public void menuPagamento() {
        int opcao;
            System.out.println("\n");
            System.out.println("\t----------------------");
            System.out.println("\t Selecione uma opção:");
            System.out.println("\t----------------------\n");
            System.out.println("[1] - Listar pagamentos ");
            System.out.println("[2] - Visualizar pagamento");
            System.out.println("[3] - Editar pagamento ");
            System.out.println("[4] - Excluir pagamento ");
            System.out.println("[0] - Voltar");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("");
            switch (opcao) {
          
                case 1:
                    try {
                        System.out.println(pagamento.listarPagamentos());
                    } catch (IOException e) {
                        System.out.println("Erro ao listar pagamentos: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Digite o ID do pagamento: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                
                    try {
                        pagamento.visualizarPagamento(id);;
                    } catch (IOException e) {
                        System.out.println("Erro ao visualizar pagamento: " + e.getMessage());
                    }
                    break;
                case 3:
                   
                    try {
                        pagamento.editarPagamento( scanner);
                    } catch (IOException e) {
                        System.out.println("Erro ao editar pagamento: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID do pagamento a ser excluído: ");
                    int value = scanner.nextInt();
                    scanner.nextLine(); 
            
                    try {
                        pagamento.excluirPagamento(value);
                    } catch (IOException e) {
                        System.out.println("Erro ao excluir pagamento: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }   
    }


    public void menuUser(){
        int opcao;
        
            System.out.println("\n");
            System.out.println("\t----------------------");
            System.out.println("\t Selecione uma opção:");
            System.out.println("\t----------------------\n");
            System.out.println("[1] - Visualizar pagamento");
            System.out.println("[0] - Voltar");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("");
            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID do pagamento: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                
                    try {
                        pagamento.visualizarPagamento(id);;
                    } catch (IOException e) {
                        System.out.println("Erro ao visualizar pagamento: " + e.getMessage());
                    }
                    break;
              
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
    }   
}