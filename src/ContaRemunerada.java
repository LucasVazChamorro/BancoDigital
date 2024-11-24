public class ContaRemunerada extends Conta {
    private static final double TAXA_RENDIMENTO = 0.005; // 0.5% ao mês

    public ContaRemunerada(Cliente cliente) {
        super(cliente);
    }

    public void aplicarRendimento() {
        double rendimento = this.getSaldo() * TAXA_RENDIMENTO;
        this.depositar(rendimento);
        registrarTransacao("RENDIMENTO", rendimento, "Rendimento mensal");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Remunerada ===");
        super.imprimirInfosComuns();
    }
}