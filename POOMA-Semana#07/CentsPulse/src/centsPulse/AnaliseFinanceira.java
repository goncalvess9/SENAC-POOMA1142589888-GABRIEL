package centsPulse;

import java.util.List;

public class AnaliseFinanceira {
    private List<BalancoFinanceiro> balancosFinanceiros;
    private List<Rentabilidade> rentabilidadeProdutosServicos;
    private List<Orcamento> orcamentoGeral;
    private List<SugestaoInvestimento> sugestoesInvestimento;

    public AnaliseFinanceira(
            List<BalancoFinanceiro> balancosFinanceiros,
            List<Rentabilidade> rentabilidadeProdutosServicos,
            List<Orcamento> orcamentoGeral,
            List<SugestaoInvestimento> sugestoesInvestimento) {
        this.balancosFinanceiros = balancosFinanceiros;
        this.rentabilidadeProdutosServicos = rentabilidadeProdutosServicos;
        this.orcamentoGeral = orcamentoGeral;
        this.sugestoesInvestimento = sugestoesInvestimento;
    }

    public void controlarBalançosFinanceiros() {
    }

    public void controlarRentabilidadeProdutosServicos() {
    }

    public void controlarOrçamentoGeral() {
    }

    public void verificarSugestoesInvestimento() {
    }
}
