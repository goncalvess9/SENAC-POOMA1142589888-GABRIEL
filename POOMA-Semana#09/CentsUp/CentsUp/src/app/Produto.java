package app;

public class Produto {
	private String descricao;
	private String tipo;
	private double valor;
	private double custo;
	private double lucro;
	

	public Produto(String descricao, String tipo, double valor, double custo, double lucro) {		
		this.descricao = descricao;
		this.tipo = tipo;
		this.valor = valor;
		this.custo = custo;
		this.lucro = lucro;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}

	@Override
	public String toString() {
		return "Descricao=" + descricao + "| Tipo=" + tipo + "| Valor=" + valor + "| Custo=" + custo
				+ "| Lucro=" + lucro;
	}
	
	
}
