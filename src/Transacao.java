import java.time.LocalDateTime;

public class Transacao {
    private String tipo;
    private double valor;
    private LocalDateTime data;
    private String descricao;

    public Transacao(String tipo, double valor, String descricao) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = LocalDateTime.now();
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }
}