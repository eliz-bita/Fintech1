public class Login {
    private String username;
    private String password;

    // Construtor padrão
    public Login() {}

    // Construtor com parâmetros
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    // Lógica para realizar o login
    public boolean validarLogin(String username, String password) {
        boolean isValid = this.username.equals(username) && this.password.equals(password);
        System.out.println("Realizando login para o usuário: " + username);
        return isValid;
    }


    // Getters e Setters
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

}



