package centsPulse;
import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String endereco;
    private String cnpj;
    private String informacoesContato;
    private List<String> produtosServicos;
    private List<Fornecedor> fornecedores;
    private List<BalancoFinanceiro> balancosFinanceiros;
    private List<Orcamento> orcamentos;
    private List<Rentabilidade> rentabilidades;
    private List<ObrigacaoFiscal> obrigacoesFiscais;
    private List<PendenciaFinanceira> pendenciasFinanceiras;

    public Empresa(String nome, String endereco, String cnpj, String informacoesContato) {
        this.nome = nome;
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.informacoesContato = informacoesContato;
        this.produtosServicos = new ArrayList<>();
        this.fornecedores = new ArrayList<>();
        this.balancosFinanceiros = new ArrayList<>();
        this.orcamentos = new ArrayList<>();
        this.rentabilidades = new ArrayList<>();
        this.obrigacoesFiscais = new ArrayList<>();
        this.pendenciasFinanceiras = new ArrayList<>();
    }

    public void inserirDadosEmpresa(String novoNome, String novoEndereco, String novoCnpj, String novasInformacoesContato) {
        this.nome = novoNome;
        this.endereco = novoEndereco;
        this.cnpj = novoCnpj;
        this.informacoesContato = novasInformacoesContato;
    }

    public void alterarDadosEmpresa(String novoEndereco, String novasInformacoesContato) {
        this.endereco = novoEndereco;
        this.informacoesContato = novasInformacoesContato;
    }

    public void cadastrarProdutoServico(String produtoServico) {
        produtosServicos.add(produtoServico);
    }

    public void alterarProdutoServico(String produtoAntigo, String novoProduto) {
        int index = produtosServicos.indexOf(produtoAntigo);
        if (index != -1) {
            produtosServicos.set(index, novoProduto);
        }
    }

    public void inserirDadosFornecedor(Fornecedor fornecedor) {
        fornecedores.add(fornecedor);
    }

    public void alterarDadosFornecedor(Fornecedor fornecedorAntigo, Fornecedor novoFornecedor) {
        int index = fornecedores.indexOf(fornecedorAntigo);
        if (index != -1) {
            fornecedores.set(index, novoFornecedor);
        }
    }
}

