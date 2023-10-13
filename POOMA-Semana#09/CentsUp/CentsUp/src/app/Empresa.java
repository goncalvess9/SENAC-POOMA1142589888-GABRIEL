package app;

public class Empresa {
    private String nomeEmpresa;
    private String nomeCliente;
    private String endereco;
    private String cnpj;
    private String telefone;
    private String email;
    
	public Empresa() {
	}

	public Empresa(String nomeEmpresa, String nomeCliente, String endereco, String cnpj, String telefone, String email) {
		this.nomeEmpresa = nomeEmpresa;
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void alterarCadastro(String nomeEmpresa, String nomeCliente, String endereco, String telefone, String email) {
		this.nomeEmpresa = nomeEmpresa;
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}
}

