package centsPulse;
import java.util.ArrayList;
import java.util.List;

public class FluxoDeCaixa {
    private List<EntradaFinanceira> entradasFinanceiras;
    private List<SaidaFinanceira> saidasFinanceiras;
    private List<ControlePagamentosReceber> controlePagamentosReceber;
    private List<PlanejamentoFinanceiro> planejamentoFinanceiro;
    private List<PendenciaFinanceira> pendenciasFinanceiras;

    public FluxoDeCaixa() {
        this.entradasFinanceiras = new ArrayList<>();
        this.saidasFinanceiras = new ArrayList<>();
        this.controlePagamentosReceber = new ArrayList<>();
        this.planejamentoFinanceiro = new ArrayList<>();
        this.pendenciasFinanceiras = new ArrayList<>();
    }

    public void visualizarEntradasSaidas() {
    }

    public void gerarObrigacoesFiscais() {
    }

    public void controlarPagamentosReceber() {
    }

    public void realizarPlanejamentosFinanceiros() {
    }

    public void controlarPendenciasFinanceiras() {
    }
}


