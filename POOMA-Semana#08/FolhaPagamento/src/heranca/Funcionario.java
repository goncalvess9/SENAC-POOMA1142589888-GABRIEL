package heranca;

public class Funcionario {
	protected String nome;
	protected String depto;
	protected String funcao;
	protected double salarioLiquido;
	
	public Funcionario(String nome, String depto, String funcao) {
		super();
		this.nome = nome;
		this.depto = depto;
		this.funcao = funcao;
	}

	public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

	@Override
    public String toString() {
        return "Nome: " + nome + ", Departamento: " + depto + ", Função: " + funcao;
    }
}
