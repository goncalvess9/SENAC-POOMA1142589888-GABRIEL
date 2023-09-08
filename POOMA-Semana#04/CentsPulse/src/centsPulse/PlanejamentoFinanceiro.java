package centsPulse;
import java.util.Date;

public class PlanejamentoFinanceiro {
    private String descricao;
    private double valor;
    private Date dataPrevista;

    public PlanejamentoFinanceiro(String descricao, double valor, Date dataPrevista) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataPrevista = dataPrevista;
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

    public Date getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(Date dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    @Override
    public String toString() {
        return "PlanejamentoFinanceiro [descricao=" + descricao + ", valor=" + valor + ", dataPrevista=" + dataPrevista + "]";
    }
}

