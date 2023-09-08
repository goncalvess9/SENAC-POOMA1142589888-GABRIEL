package centsPulse;

public class Rentabilidade {
    private int ano;
    private int mes;
    private double lucro;

    public Rentabilidade(int ano, int mes, double lucro) {
        this.ano = ano;
        this.mes = mes;
        this.lucro = lucro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    @Override
    public String toString() {
        return "Rentabilidade [ano=" + ano + ", mes=" + mes + ", lucro=" + lucro + "]";
    }
}

