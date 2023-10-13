package app;

public class Balanco {
	private double saldo;
	
	public Balanco() {
		this.saldo = 0.0;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void AumentarAoSaldo(double ganho) {
		this.saldo = this.saldo + ganho;
	}
	
	public void DiminirDoSaldo(double custo) {
		this.saldo = this.saldo - custo;
	}
}

