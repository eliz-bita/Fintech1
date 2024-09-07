import java.time.LocalDateTime;

public class TransferenciaBancaria extends ContaBancaria {
    private String tipoTransacao;
    private LocalDateTime dataHora;
    private double valorTransacao;

    // Construtor padrão
    public TransferenciaBancaria(){
        super("", 0.0);
    }

    // Construtor
    public TransferenciaBancaria(String numeroConta, double saldo, String tipoTransacao, LocalDateTime dataHora, double valorTransacao) {
        super(numeroConta, saldo);
        this.tipoTransacao = tipoTransacao;
        this.dataHora = dataHora;
        this.valorTransacao = valorTransacao;
    }

    // Método para exibir informações da transferência
    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Tipo de Transação: " + tipoTransacao);
        System.out.println("Data e Hora: " + dataHora);
        System.out.println("Valor da Transação: R$ " + valorTransacao);
    }

    // Método específico para exibir detalhes da transaçao
    public void exibirDetalhesTransacao() {
        exibirSaldo();
    }

}
