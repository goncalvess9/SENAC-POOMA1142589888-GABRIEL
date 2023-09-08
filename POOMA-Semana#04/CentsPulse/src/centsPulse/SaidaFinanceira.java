package centsPulse;
import java.util.Date;

public class SaidaFinanceira {
    private String descricao;
    private double valor;
    private Date data;

    public SaidaFinanceira(String descricao, double valor, Date data) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "SaidaFinanceira [descricao=" + descricao + ", valor=" + valor + ", data=" + data + "]";
    }
}

