package centsPulse;

public class Orcamento {
    private int ano;
    private String descricao;
    private double valor;

    public Orcamento(int ano, String descricao, double valor) {
        this.ano = ano;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
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
        return "Orcamento [ano=" + ano + ", descricao=" + descricao + ", valor=" + valor + "]";
    }
}

