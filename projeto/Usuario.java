package projeto;

public class Usuario {

    private String nome, endereco, email, telefone, usuario, senha;
    private boolean adminUsuario;

    public Usuario(String nome, String email, String telefone, String usuario,
    String senha, boolean adminUsuario){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        this.adminUsuario = false;
    }


    public void criarUsuario(String nome, String endereco, String email, String telefone){

    }


    public void editarUsuario(String nome, String endereco, String email, String telefone){

    }


    public void excluirUsuario(){

    }


    public void visualizarUsuario(){

    }


    public void listarUsuario(){

    }


    public String getNome(){
        return this.nome;
    }

    
    public String setNome(String nome_){
        return this.nome = nome_;
    }


    public String getEndereco(){
        return this.endereco;
    }


    public String setEndereco(String endereco_){
        return this.endereco = endereco_;
    }


    public String getEmail(){
        return this.email;
    }


    public String setEmail(String email_){
        return this.email = email_;
    }


    public String getTelefone(){
        return this.telefone;
    }


    public String setTelefone(String telefone_){
        return this.telefone = telefone_;
    }


    public String getSenha(){
        return this.senha;
    }


    public String setSenha(String senha_){
        return this.senha = senha_;
    }


    public String getUsuario(){
        return this.usuario;
    }


    public String setUsuario(String usuario_){
        return this.usuario = usuario_;
    }


    public boolean getAdminUsuario(){
        return this.adminUsuario;
    }

    
    public boolean setAdminUsuario(boolean adminUsuario_){
        return this.adminUsuario = adminUsuario_;
    }
}