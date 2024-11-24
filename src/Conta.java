import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private List<Transacao> historico;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historico = new ArrayList<>();
    }

    public List<Transacao> getHistorico() {
        return new ArrayList<>(historico);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser positivo");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
        registrarTransacao("SAQUE", valor, "Saque em conta");
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        }
        saldo += valor;
        registrarTransacao("DEPOSITO", valor, "Depósito em conta");
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta destino não pode ser nula");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        registrarTransacao("TRANSFERENCIA", valor, "Transferência para conta " + contaDestino.getNumero());
    }

    protected void registrarTransacao(String tipo, double valor, String descricao) {
        historico.add(new Transacao(tipo, valor, descricao));
    }


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}