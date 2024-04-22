package projeto.reserva.view;

import java.io.*;
import java.util.Scanner;
import projeto.reserva.controller.ReservaController;

public class ReservaView {
    ReservaController reservaController = new ReservaController();
    Scanner scanner = new Scanner(System.in);

    public void menuReserva() {
        int opcao;
            System.out.println("\n");
            System.out.println("\t----------------------");
            System.out.println("\t Selecione uma opção:");
            System.out.println("\t----------------------\n");
            System.out.println("[1] - Realizar reserva");
            System.out.println("[2] - Listar reservas");
            System.out.println("[3] - Visualizar reserva");
            System.out.println("[4] - Editar reserva");
            System.out.println("[5] - Cancelar reserva");
            System.out.println("[6] - Verifica reserva");
            System.out.println("[0] - Voltar");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
            System.out.println("");
            switch (opcao) {
                case 1:
                    try {
                        reservaController.realizarReserva(scanner);
                    } catch (IOException e) {
                        System.out.println("Erro ao realizar reserva: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println(reservaController.listarReservas()); 
                           
                        break;
                    } catch (IOException e) {
                        System.out.println("Erro ao listar reservas: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID da reserva: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
                
                    try {
                        reservaController.visualizarReserva(id);
                    } catch (IOException e) {
                        System.out.println("Erro ao visualizar reserva: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Digite o ID da reserva para edição: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
                   
                    try {
                        reservaController.editarReserva(idEdit, scanner);
                    } catch (IOException e) {
                        System.out.println("Erro ao editar reserva: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Digite o ID da reserva a ser cancelada: ");
                    int value = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
            
                    try {
                        reservaController.cancelarReserva(value);
                    } catch (IOException e) {
                        System.out.println("Erro ao cancelar reserva: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Digite o ID para verificar a reserva: ");
                    int input = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
            
                    try {
                        System.out.println(reservaController.verificaReserva(input));
                    } catch (IOException e) {
                        System.out.println("Erro ao cancelar reserva: " + e.getMessage());
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
        do {
            System.out.println("\n");
            System.out.println("\t----------------------");
            System.out.println("\t Selecione uma opção:");
            System.out.println("\t----------------------\n");
            
            System.out.println("[1] - Visualizar reserva");
            System.out.println("[2] - Cancelar reserva");
            System.out.println("[3] - Verifica reserva");
            System.out.println("[4] - Realizar reserva");
            System.out.println("[5] - Visualizar checkin");
            System.out.println("[6] - Visualizar checkout");
            System.out.println("[0] - voltar");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer de entrada
            System.out.println("");
            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da reserva: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
                
                    try {
                        reservaController.visualizarReserva(id);
                    } catch (IOException e) {
                        System.out.println("Erro ao visualizar reserva: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Digite o ID da reserva a ser cancelada: ");
                    int value = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
            
                    try {
                        reservaController.cancelarReserva(value);
                    } catch (IOException e) {
                        System.out.println("Erro ao cancelar reserva: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID para verificar a reserva: ");
                    int input = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer de entrada
            
                    try {
                        System.out.println(reservaController.verificaReserva(input));
                    } catch (IOException e) {
                        System.out.println("Erro ao verificar reserva: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        reservaController.realizarReserva(scanner);
                    } catch (IOException e) {
                        System.out.println("Erro ao realizar reserva: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Digite o id da reserva: ");
                    int valor1 = Integer.parseInt(scanner.nextLine());
                    try {
                        System.out.println(reservaController.getDataCheckin(valor1));

                    } catch (Exception e) {
                        System.out.println("Erro ao buscar checkin: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Digite o id da reserva: ");
                    int valor2 = Integer.parseInt(scanner.nextLine());
                    try {
                        System.out.println(reservaController.getDataCheckout(valor2));

                    } catch (Exception e) {
                        System.out.println("Erro ao buscar checkout: " + e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);
    }
}
