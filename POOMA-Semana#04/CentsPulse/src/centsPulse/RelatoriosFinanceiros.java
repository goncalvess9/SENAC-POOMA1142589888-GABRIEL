package centsPulse;
import java.util.List;

public class RelatoriosFinanceiros {
    private List<GraficoBalanco> graficosBalancos;
    private List<GraficoRentabilidadeProdutos> graficosRentabilidadeProdutos;
    private List<DadoInvestimento> dadosInvestimento;
    private SituacaoFinanceira situacaoFinanceira;
    private List<InformacaoMercado> informacoesMercado;

    public RelatoriosFinanceiros(
            List<GraficoBalanco> graficosBalancos,
            List<GraficoRentabilidadeProdutos> graficosRentabilidadeProdutos,
            List<DadoInvestimento> dadosInvestimento,
            SituacaoFinanceira situacaoFinanceira,
            List<InformacaoMercado> informacoesMercado) {
        this.graficosBalancos = graficosBalancos;
        this.graficosRentabilidadeProdutos = graficosRentabilidadeProdutos;
        this.dadosInvestimento = dadosInvestimento;
        this.situacaoFinanceira = situacaoFinanceira;
        this.informacoesMercado = informacoesMercado;
    }

    public void visualizarGraficosBalanços() {
    }

    public void visualizarGraficosRentabilidadeProdutos() {
    }

    public void gerarRelatoriosFinanceiros() {
    }

    public void receberInfoInvestimentoEmpresaViaEmail() {
    }

    public void receberNovasOpcoesInvestimentoViaEmail() {
    }

    public void receberSituacaoFinanceiraViaEmail() {
    }

    public void receberInformacoesAtualizadasMercadoViaEmail() {
    }
}

