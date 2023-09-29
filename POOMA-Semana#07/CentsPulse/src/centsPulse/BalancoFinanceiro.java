package centsPulse;

public class BalancoFinanceiro {
    private int ano;
    private int mes;
    private double saldo;

    public BalancoFinanceiro(int ano, int mes, double saldo) {
        this.ano = ano;
        this.mes = mes;
        this.saldo = saldo;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "BalancoFinanceiro [ano=" + ano + ", mes=" + mes + ", saldo=" + saldo + "]";
    }
}

