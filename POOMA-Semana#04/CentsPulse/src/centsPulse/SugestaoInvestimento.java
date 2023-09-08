package centsPulse;

public class SugestaoInvestimento {
    private String descricao;
    private double valorInvestimento;
    private double retornoInvestimento;

    public SugestaoInvestimento(String descricao, double valorInvestimento, double retornoInvestimento) {
        this.descricao = descricao;
        this.valorInvestimento = valorInvestimento;
        this.retornoInvestimento = retornoInvestimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public double getRetornoInvestimento() {
        return retornoInvestimento;
    }

    public void setRetornoInvestimento(double retornoInvestimento) {
        this.retornoInvestimento = retornoInvestimento;
    }

    public String getSugestao() {
        return "Descrição: " + descricao + ", Valor do Investimento: " + valorInvestimento + ", Retorno Esperado: " + retornoInvestimento;
    }
}


