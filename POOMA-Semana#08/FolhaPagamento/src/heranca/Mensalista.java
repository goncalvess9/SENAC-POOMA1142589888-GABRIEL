package heranca;

public class Mensalista extends Funcionario {
    private double salarioMensal;

    public Mensalista() {
        this.salarioMensal = salarioMensal;
        this.salarioMensal = 1000.0;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }


    public void imprimirPagamento() {
        System.out.println("O funcionário: " + super.nome);
        System.out.println("Trabalha no Departamento: " + super.depto);
        System.out.println("Sua função é: " + super.funcao);
        System.out.println("O salário do funcionário é: " + this.salarioMensal);
    }
}
