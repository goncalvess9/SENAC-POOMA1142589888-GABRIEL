package centsPulse;
import java.util.Date;

public class ControlePagamentosReceber {
    private String descricao;
    private double valor;
    private Date dataVencimento;

    public ControlePagamentosReceber(String descricao, double valor, Date dataVencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
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

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "ControlePagamentosReceber [descricao=" + descricao + ", valor=" + valor + ", dataVencimento=" + dataVencimento + "]";
    }
}

