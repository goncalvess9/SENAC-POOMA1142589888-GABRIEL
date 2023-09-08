package centsPulse;

public class ObrigacaoFiscal {
    private String tipo;
    private String descricao;
    private double valor;

    public ObrigacaoFiscal(String tipo, String descricao, double valor) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ObrigacaoFiscal [tipo=" + tipo + ", descricao=" + descricao + ", valor=" + valor + "]";
    }
}

