package app;

public class Rentabilidade {
    private double lucro;
    private double custo;
    
	public Rentabilidade() {
	}

	public Rentabilidade(double lucro, double custo) {
		this.lucro = lucro;
		this.custo = custo;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}
    
    public void AcrecentarCusto (double valorCusto) {
    	this.custo =+ valorCusto;
    }
    
    public void AcrecentarLucro (double valorLucro) {
    	this.lucro =+ valorLucro;
    }
}

