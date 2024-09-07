import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Login com credenciais
        Login login = new Login("joao", "senha123");

        // Validando o login
        boolean isValid = login.validarLogin("joao", "senha123");

        if (isValid) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Falha no login. Verifique o nome de usuário e a senha.");
        }

        // Perfil
        Perfil perfil = new Perfil("João", "40028922", "337.000.111-83", "01/01/2000");
        System.out.println("\nPerfil do usuário:");
        perfil.exibirDadosPerfil();



        // exibindo o extrato
        Extrato extrato = new Extrato("12345-6", 3000.0, "24/08/2024", "24/09/2024", 1000, 500);
        System.out.println("\nExtrato bancário:");
        extrato.gerarExtrato();
        

        // transação bancária
        LocalDateTime agora = LocalDateTime.now();
        TransferenciaBancaria transacao = new TransferenciaBancaria("12345-6", 2500.00, "tranferencia",agora, 500.00);
        System.out.println("\nTransação Bancária:");
        transacao.exibirDetalhesTransacao();

        // relatório financeiro
        RelatorioFinanceiro relatorio = new RelatorioFinanceiro("98765-4", 1500.00, 500.00, 5000.00, "Pagar a fatura do cartão até o dia 10.");
        System.out.println("\nRelatório Financeiro:");
        relatorio.exibirRelatorioFinanceiro();
    }
}
