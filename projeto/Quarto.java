package projeto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Quarto {
    private int numero;
    private String comodidades;
    private int capacidade;
    private float tarifa;
    private Date verificaData;

    // Listagem de quartos
    private static List<Quarto> listaDeQuartos = new ArrayList<>();

    public Quarto(int numero, String comodidades, int capacidade, float tarifa) {
        this.numero = numero;
        this.comodidades = comodidades;
        this.capacidade = capacidade;
        this.tarifa = tarifa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComodidades() {
        return comodidades;
    }

    public void setComodidades(String comodidades) {
        this.comodidades = comodidades;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }

    public Date getVerificaData() {
        return verificaData;
    }

    public void setVerificaData(Date verificaData) {
        this.verificaData = verificaData;
    }

    // Cadastrar um quarto
    public static void cadastrarQuarto(int numero, String comodidades, int capacidade, float tarifa) {
        Quarto quarto = new Quarto(numero, comodidades, capacidade, tarifa);
        listaDeQuartos.add(quarto);
    }

    // Editar um quarto
    public static void editarQuarto(int numero, String comodidades, int capacidade, float tarifa) {
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numero) {
                quarto.setComodidades(comodidades);
                quarto.setCapacidade(capacidade);
                quarto.setTarifa(tarifa);
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    // Visualizar um quarto
    public static void visualizarQuarto(int numero) {
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numero) {
                System.out.println("Número do Quarto: " + quarto.getNumero());
                System.out.println("Comodidades: " + quarto.getComodidades());
                System.out.println("Capacidade: " + quarto.getCapacidade());
                System.out.println("Tarifa: " + quarto.getTarifa());
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    // Listar todos os quartos
    public static void listarQuartos() {
        for (Quarto quarto : listaDeQuartos) {
            System.out.println("Número do Quarto: " + quarto.getNumero());
            System.out.println("Comodidades: " + quarto.getComodidades());
            System.out.println("Capacidade: " + quarto.getCapacidade());
            System.out.println("Tarifa: " + quarto.getTarifa());
            System.out.println();
        }
    }

    // Excluir um quarto
    public static void excluirQuarto(int numero) {
        for (Quarto quarto : listaDeQuartos) {
            if (quarto.getNumero() == numero) {
                listaDeQuartos.remove(quarto);
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }

    // Listar quartos disponíveis para uma determinada data
    public static void listarQuartosDisponiveis(Date verificaData) {
        List<Quarto> quartosDisponiveis = new ArrayList<>();
        for (Quarto quarto : listaDeQuartos) {
            // Verificar a disponibilidade do quarto para a data especificada
            if (quarto.getVerificaData() != null && quarto.getVerificaData().compareTo(verificaData) >= 0) {
                quartosDisponiveis.add(quarto);
            }
        }
        if (quartosDisponiveis.isEmpty()) {
            System.out.println("Nenhum quarto disponível para a data especificada.");
        } else {
            System.out.println("Quartos disponíveis para a data especificada:");
            for (Quarto quarto : quartosDisponiveis) {
                System.out.println("Número do Quarto: " + quarto.getNumero());
                System.out.println("Comodidades: " + quarto.getComodidades());
                System.out.println("Capacidade: " + quarto.getCapacidade());
                System.out.println("Tarifa: " + quarto.getTarifa());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Quarto.cadastrarQuarto(1, "TV, Wi-Fi", 2, 100.0f);
        Quarto.cadastrarQuarto(2, "Ar condicionado, TV, Wi-Fi", 3, 150.0f);
        Quarto.cadastrarQuarto(3, "Ar condicionado, TV, Wi-Fi, Frigobar", 4, 180.0f);
        
        for (Quarto quarto : listaDeQuartos){ // Subir todos para o arquivo
            GerenciadorQuarto.criarQuarto(quarto);
        }
        System.out.println("Listagem de quartos:");
        // Quarto.listarQuartos();
        GerenciadorQuarto.listarQuartos();
    }
}