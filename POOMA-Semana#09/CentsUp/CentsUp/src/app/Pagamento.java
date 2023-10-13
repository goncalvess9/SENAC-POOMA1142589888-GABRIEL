package app;

import java.util.Calendar;

public class Pagamento {
	private String descricaoTransacao;
	private String tipo;
	private double valor;
	private Boolean concluido;
	private Calendar data;
	
	public Pagamento() {
	}
	
	public Pagamento(String descricaoTransacao, String tipo, double valor, Boolean concluido, Calendar data) {
		this.descricaoTransacao = descricaoTransacao;
		this.tipo = tipo;
		this.valor = valor;
		this.concluido = concluido;
		this.data = data;
	}

	public String getDescricaoTransacao() {
		return descricaoTransacao;
	}
	public void setDescricaoTransacao(String descricaoTransacao) {
		this.descricaoTransacao = descricaoTransacao;
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

	public Boolean getConcluido() {
		return concluido;
	}

	public void setConcluido(Boolean concluido) {
		this.concluido = concluido;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public void validarTipoDeFluxo(Rentabilidade rentabilidade, Balanco balanco) throws Exception{
		if(this.concluido == true) {
			if(tipo.equals("Entrada")) {
				balanco.AumentarAoSaldo(valor);
				rentabilidade.AcrecentarLucro(valor);
				}
			else if(tipo.equals("Saída")) {
				balanco.DiminirDoSaldo(valor);
				rentabilidade.AcrecentarCusto(valor);
				}
			else {
				throw new Exception("O tipo de entrada está inválido");
				}
		}
	}
	public void VendaDeProduto(Rentabilidade rentabilidade, Balanco balanco, Produto produto) throws Exception{
		validarTipoDeFluxo(rentabilidade, balanco);
	}
	public void CompraDeProduto(Rentabilidade rentabilidade, Balanco balanco, Produto produto) throws Exception{
		validarTipoDeFluxo(rentabilidade, balanco);
	}

	@Override
	public String toString() {
		String conclusao;
		if(concluido == true)
			conclusao = "Sim";
		else
			conclusao = "Não";
		
		return "Descrição: " + descricaoTransacao + " | Tipo: " + tipo + " | Valor: " + valor
			 + " Concluido? " + conclusao + " Data : " + data + "]";
	}
	
	
}


