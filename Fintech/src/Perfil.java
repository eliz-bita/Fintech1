public class Perfil {
    private String nome;
    private String telefone;
    private String cpf;
    private String dataDeNascimento;

    // Construtor padrão
    public Perfil(){

    }

    // Construtor com parâmetros
    public Perfil(String nome, String telefone, String cpf, String dataDeNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    //Metodo
    public void exibirDadosPerfil(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
    }

    // Getters e Setters
    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getTelefone() {return telefone;}

    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getDataDeNascimento() {return dataDeNascimento;}

    public void setDataDeNascimento(String dataDeNascimento) {this.dataDeNascimento = dataDeNascimento;}
}