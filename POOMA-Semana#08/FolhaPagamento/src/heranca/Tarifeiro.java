package heranca;

public class Tarifeiro extends Funcionario {
    private double valorTarefa;
    private int qtdTarefasFeitas;
    private double salarioLiquido;

    public Tarifeiro() {
    	super();
        this.valorTarefa = valorTarefa;
        this.qtdTarefasFeitas = qtdTarefasFeitas;
        this.valorTarefa = 5.0; 
    }
    
    public double getValorTarefa() {
        return valorTarefa;
    }

    public void setValorTarefa(double valorTarefa) {
        this.valorTarefa = valorTarefa;
    }

    public int getQtdTarefasFeitas() {
        return qtdTarefasFeitas;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void setQtdTarefasFeitas(int qtdTarefasFeitas) {
        this.qtdTarefasFeitas = qtdTarefasFeitas;
    }

    public double calcularSalarioTarifeiro() {
        return salarioLiquido = this.valorTarefa * this.qtdTarefasFeitas;
    }

    public void imprimirPagamento() {
        System.out.println("O funcionário: " + super.nome);
        System.out.println("Trabalha no Departamento: " + super.depto);
        System.out.println("Sua função é: " + super.funcao);
        System.out.println("O salário do funcionário é: " + this.salarioLiquido);
    }
}

