package centsPulse;

public class GraficoBalanco {
    private String dados;
    private String tipo;

    public GraficoBalanco(String dados, String tipo) {
        this.dados = dados;
        this.tipo = tipo;
    }

    public void exibir() {
        System.out.println("Exibindo gráfico de balanço:");
        System.out.println("Dados: " + dados);
        System.out.println("Tipo: " + tipo);
    }

    public void salvar() {
        System.out.println("Salvando gráfico de balanço:");
        System.out.println("Dados: " + dados);
        System.out.println("Tipo: " + tipo);
    }

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

