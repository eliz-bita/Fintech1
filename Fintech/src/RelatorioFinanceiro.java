public class RelatorioFinanceiro extends ContaBancaria {
    private double mediaDespesas;
    private double tetoOrcamento;
    private String lembretePagamento;

    //Construtor padrão
    public RelatorioFinanceiro(){
        super("",0.0);

    }

    // Construtor com parâmetros
    public RelatorioFinanceiro(String numeroConta, double saldo, double mediaDespesas, double tetoOrcamento, String lembretePagamento) {
        super(numeroConta, saldo);
        this.mediaDespesas = mediaDespesas;
        this.tetoOrcamento = tetoOrcamento;
        this.lembretePagamento = lembretePagamento;
    }


    // Método para exibir informações do relatório financeiro
    @Override
    public void exibirSaldo() {
        super.exibirSaldo();
        System.out.println("Média de Despesas: R$ " + mediaDespesas);
        System.out.println("Teto de Orçamento: R$ " + tetoOrcamento);
        System.out.println("Lembrete de Pagamento: " + lembretePagamento);
    }

    // Método específico para exibir o relatório financeiro completo
    public void exibirRelatorioFinanceiro() {
        exibirSaldo();
    }
}

