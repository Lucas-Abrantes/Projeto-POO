package projeto;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorUsuario {
    private static final String FILE_PATH = "usuarios.txt";
    private static final String DELIMITER = ",";

    // Criação de usuário
    public void criarUsuario(Usuario usuario) throws IOException {
        List<Usuario> usuarios = listarUsuarios();
        for (Usuario user : usuarios) {
            if (user.getUsuario().equals(usuario.getUsuario())) {
                throw new IOException("Usuário já existe.");
            }
        }
        String userData = formatUserData(usuario);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            bw.write(userData + "\n");
        }
    }

    // Formatar dados do usuário para a escrita no arquivo
    private String formatUserData(Usuario usuario) {
        return String.join(DELIMITER, usuario.getNome(), 
        usuario.getEndereco(), usuario.getEmail(),
         usuario.getTelefone(), usuario.getUsuario(), usuario.getSenha(), String.valueOf(usuario.getAdminUsuario()));
    }

    // Leitura de todos os usuários
    public List<Usuario> listarUsuarios() throws IOException {
        List<Usuario> usuarios = new ArrayList<>();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] dados = line.split(DELIMITER);
                    usuarios.add(new Usuario(dados[0], dados[1], dados[2], dados[3], dados[4], dados[5], Boolean.parseBoolean(dados[6])));
                }
            }
        }
        return usuarios;
    }

    // Atualização de um usuário
    public void editarUsuario(Usuario usuario) throws IOException {
        List<Usuario> usuarios = listarUsuarios();
        boolean found = false;
        String newUserdata = formatUserData(usuario);
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Usuario user : usuarios) {
                if (user.getUsuario().equals(usuario.getUsuario())) {
                    out.println(newUserdata);
                    found = true;
                } else {
                    out.println(formatUserData(user));
                }
            }
        }
        if (!found) {
            throw new IOException("Usuário não encontrado.");
        }
    }

    public String visualizarUsuario(String username) throws IOException {
        List<Usuario> usuarios = listarUsuarios();
        if (usuarios.isEmpty()) {
            return "Nenhum usuário carregado do arquivo."; // Caso lista esteja vazia
        }
        for (Usuario usuario : usuarios) {
            if (usuario.getUsuario().equals(username)) {
                return "Usuário encontrado!\n" + usuario.toString();
            }
        }
        return "Usuário não encontrado."; 
    }
    
   

    // Deleção de um usuário
    public void excluirUsuario(String username) throws IOException {
        List<Usuario> usuarios = listarUsuarios();
        boolean found = false;
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_PATH))) {
            for (Usuario usuario : usuarios) {
                if (usuario.getUsuario().equals(username)) {
                    found = true;
                } else {
                    out.println(formatUserData(usuario));
                }
            }
        }
        if (!found) {
            throw new IOException("Usuário não encontrado.");
        }
    }
}