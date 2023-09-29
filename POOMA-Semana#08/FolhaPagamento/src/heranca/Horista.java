package heranca;

public class Horista extends Funcionario{
	private double valorHora;
	private int qtdHorasTrabalahadas;
	private double salarioLiquido;
	
	public Horista(String nome, String depto, String funcao, double valorHora, int qtdHorasTrabalahadas) {
        super(nome, depto, funcao);
        this.valorHora = valorHora;
        this.qtdHorasTrabalahadas = qtdHorasTrabalahadas;
		this.valorHora = 10.00;
    }
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getQtdHorasTrabalahadas() {
		return qtdHorasTrabalahadas;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	public void setQtdHorasTrabalahadas(int qtdHorasTrabalahadas) {
		this.qtdHorasTrabalahadas = qtdHorasTrabalahadas;
	}
	public double calcularSalarioHorista(int qtdHorasTrabalhadas) {
		return salarioLiquido = this.valorHora * this.qtdHorasTrabalahadas; 
	}
	public void imprimirPagamento() {
		System.out.println("O funcionario : "+super.nome);
		System.out.println("Trabalha no Departamento : "+super.depto);
		System.out.println("Sua funcao é: "+super.funcao);
		System.out.println("O salario do funcionario é: "+this.salarioLiquido);

	}
}
