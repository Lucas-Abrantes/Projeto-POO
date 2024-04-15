package projeto;

import java.io.IOException;

public class UsuarioDemo {
    public static void main(String[] args) {
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();

        // Criar um novo usuários
          Usuario novoUsuario = new Usuario("João bosco", "Rua das Flores, 123", "joao@gmail.com", "", "joao25", "senha123", true);


        //     try {
        //          gerenciador.criarUsuario(novoUsuario); 
        //           System.out.println("");
        //           System.out.println("Usuário criado com sucesso!");
        //           System.out.println("");
        //       } catch (IOException e) {
        //           System.out.println("Erro ao criar usuário: " + e.getMessage());
        //      }


        // Listar todos os usuários
        //  try {  
        //      System.out.println(gerenciador.visualizarUsuario("joao25"));
        //      System.out.println("");
        //      System.out.println("");
        //  } catch (IOException e) {
        //      System.out.println("Erro ao buscar usuario: " + e.getMessage());
        //  }

        // Editar um usuário
        //   Usuario usuarioEditado = new Usuario("Ana joaquina 25", "Rua das Flores, 456", "joao_updated@gmail.com", "888888888", "123", "novaSenha123", true);
        //   try {
        //       gerenciador.editarUsuario(usuarioEditado);
        //       System.out.println("");
        //       System.out.println("Usuário editado com sucesso!");
        //   } catch (IOException e) {
        //       System.out.println("Erro ao editar usuário: " + e.getMessage());
        //   }

        // Listar
        //  try {
        //     List<Usuario> usuarios = gerenciador.listarUsuarios();
        //     System.out.println("Usuários listados:");
        //     for (Usuario usuario : usuarios) {
        //         System.out.println(usuario);
        //     }
        // } catch (IOException e) {
        //     System.out.println("Erro ao listar usuários: " + e.getMessage());
        // }



        // Excluir um usuário
        //    try {
        //        gerenciador.excluirUsuario("joao25");
        //        System.out.println("Usuário excluído com sucesso!");
        //    } catch (IOException e) {
        //        System.out.println("Erro ao excluir usuário: " + e.getMessage());
        //    }
    }
}
