package centsPulse;

public class SituacaoFinanceira {
    private String status;
    private double saldo;

    public SituacaoFinanceira(String status, double saldo) {
        this.status = status;
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

