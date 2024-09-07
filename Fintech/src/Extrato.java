
public class Extrato extends ContaBancaria{
    private String periodoInicial;
    private String periodoFinal;
    private double saldoInicial;
    private double saldoFinal;

    // Construtor padrão
    public Extrato(){
        super("", 0.0);
    }

    // Construtor com parâmetros
    public Extrato(String numeroConta, double saldo, String periodoInicial, String periodoFinal, double saldoInicial, double saldoFinal) {
        super(numeroConta, saldo);
        this.periodoInicial = periodoInicial;
        this.periodoFinal = periodoFinal;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
    }

    // Método para gerar extrato
    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Período: " + periodoInicial + " a " + periodoFinal);
        System.out.println("Saldo Inicial: R$ " + saldoInicial);
    }

    // Método específico para exibir o Extrato
    public void gerarExtrato() {
        System.out.println("Gerando Extrato... ");
        exibirSaldo();
    }

    // Método para mostrar saldo inicial
    public void mostrarSaldoInicial() {
        System.out.println("Saldo Inicial: R$ " + saldoInicial);
    }

    // Método para calcular e mostrar o saldo final
    public void calcularSaldoFinal() {
        System.out.println("Saldo Inicial: R$ " + saldoInicial);
        System.out.println("Saldo Final: R$ " + saldoFinal);
    }

    // Getters e Setters
    public String getNumConta() {
        return numeroConta;
    }

    public void setNumConta(String numConta) {
        this.numeroConta = numConta;
    }

    public String getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(String periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public String getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(String periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
}
