package projeto;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorQuarto {
    private static final String FILE_PATH = "quartos.txt";
    private static final String DELIMITER = ";";

    public static void criarQuarto(Quarto quarto) throws IOException {
        List<Quarto> quartos = listarQuartos();
        for (Quarto room : quartos) {
            if (room.getNumero() == quarto.getNumero()) {
                throw new IOException("Quarto já existe.");
            }
        }
        String roomData = formatRoomData(quarto);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(roomData + "\n");
        }
    }
    
    // Formatar dados do quarto para a escrita no arquivo
    private static String formatRoomData(Quarto quarto) {
        return String.join(DELIMITER, String.valueOf(quarto.getNumero()), 
        quarto.getComodidades(), String.valueOf(quarto.getCapacidade()),
        String.valueOf(quarto.getTarifa()), String.valueOf(quarto.getVerificaData()));
    }

    // Leitura de todos os quartos
    public static List<Quarto> listarQuartos() throws IOException {
        List<Quarto> quartos = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] dados = line.split(DELIMITER);
                    quartos.add(new Quarto(Integer.parseInt(dados[0]),dados[1],Integer.parseInt(dados[2]),Float.parseFloat(dados[3])));
                }
            }
        }
        return quartos;
    }

    // Atualização de um quarto
    public static void editarQuarto(Quarto quarto) throws IOException {
        List<Quarto> quartos = listarQuartos();
        boolean found = false;
        String newRoomdata = formatRoomData(quarto);
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Quarto room : quartos) {
                if (room.getNumero() == quarto.getNumero()) {
                    out.println(newRoomdata);
                    found = true;
                } else {
                    out.println(formatRoomData(room));
                }
            }
        }
        if (!found) {
            throw new IOException("Quarto não encontrado.");
        }
    }

    public static String visualizarQuarto(int numero) throws IOException {
        List<Quarto> quartos = listarQuartos();
        if (quartos.isEmpty()) {
            return "Nenhum quarto carregado do arquivo."; // Caso lista esteja vazia
        }
        for (Quarto quarto : quartos) {
            if (quarto.getNumero() == numero) {
                return "Quarto encontrado!\n" + quarto.toString();
            }
        }
        return "Quarto não encontrado."; 
    }

    // Deleção de um quarto
    public static void excluirQuarto(int numero) throws IOException {
        List<Quarto> quartos = listarQuartos();
        boolean found = false;
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Quarto quarto : quartos) {
                if (quarto.getNumero() == numero) {
                    found = true;
                } else {
                    out.println(formatRoomData(quarto));
                }
            }
        }
        if (!found) {
            throw new IOException("Quarto não encontrado.");
        }
    }
}
