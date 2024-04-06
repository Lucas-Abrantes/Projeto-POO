package projeto;
import java.util.ArrayList;
import java.util.List;


public class Usuario {

    private String nome, endereco, email, telefone, usuario, senha;
    private boolean adminUsuario;

    //listagem dos usuarios
    private static List<Usuario> listaDeUsuario = new ArrayList<>();

    public Usuario(String nome, String endereco, String email, String telefone, String usuario,
    String senha, boolean adminUsuario){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.adminUsuario = adminUsuario;
    }


    public void criarUsuario(String nome, String endereco, String email, String telefone,
     String usuario,String senha,boolean adminUsuario){
        Usuario user = new Usuario(nome, endereco, email, telefone, usuario, senha, adminUsuario);
        listaDeUsuario.add(user);

    }


    public  void editarUsuario(String nome, String endereco, String email, String telefone){
        for (Usuario user : listaDeUsuario) {
            if (user.getUsuario().equals(usuario)) {
                user.setNome(nome);
                user.setEndereco(endereco);
                user.setEmail(email);
                user.setTelefone(telefone);
                return;
            }
        }
        System.out.println("Nao foi possivel editar usuario.");

    }


    public static void excluirUsuario(String usuario){
        for(Usuario user: listaDeUsuario){
            if(user.getUsuario() == usuario){
                listaDeUsuario.remove(user);
                System.out.println("Usuario removido com sucesso");
                return;
            }
        }
        System.out.println("Nao foi possivel remover o usuario");

    }


    public  void visualizarUsuario(){
        for (Usuario user : listaDeUsuario) {
            if (user.getUsuario() == usuario) {
                System.out.println("Nome: " + user.getNome());
                System.out.println("Endereco: " + user.getEndereco());
                System.out.println("E-mail: " + user.getEmail());
                System.out.println("Telefone: " + user.getTelefone());
                return;
            }
        }
        System.out.println("Não foi possivel visualizar usuario.");
    }

    
    public void listarUsuario(){
        for (Usuario user : listaDeUsuario) {
                System.out.println("Nome: " + user.getNome());
                System.out.println("Endereco: " + user.getEndereco());
                System.out.println("E-mail: " + user.getEmail());
                System.out.println("Telefone: " + user.getTelefone());
                System.out.println("Senha: " + user.getSenha());
                System.out.println("Usuario: " + user.getUsuario());
                System.out.println("Administrador: " + user.getAdminUsuario());
                System.out.println("");
        }
    }


    public String getNome(){
        return this.nome;
    }

    
    public String setNome(String nome){
        return this.nome = nome;
    }


    public String getEndereco(){
        return this.endereco;
    }


    public String setEndereco(String endereco){
        return this.endereco = endereco;
    }


    public String getEmail(){
        return this.email;
    }


    public String setEmail(String email){
        return this.email = email;
    }


    public String getTelefone(){
        return this.telefone;
    }


    public String setTelefone(String telefone){
        return this.telefone = telefone;
    }


    public String getSenha(){
        return this.senha;
    }


    public String setSenha(String senha){
        return this.senha = senha;
    }


    public String getUsuario(){
        return this.usuario;
    }


    public String setUsuario(String usuario){
        return this.usuario = usuario;
    }


    public boolean getAdminUsuario(){
        return this.adminUsuario;
    }

    
    public boolean setAdminUsuario(boolean adminUsuario){
        return this.adminUsuario = adminUsuario;
    }
}