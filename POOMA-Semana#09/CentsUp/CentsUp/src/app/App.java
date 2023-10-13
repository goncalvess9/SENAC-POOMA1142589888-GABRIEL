package app;
import java.util.Scanner;
import java.util.Calendar;
import java.util.ArrayList;

public class App {
	public static Scanner leitor = new Scanner(System.in);
	
    public static void main(String[] args) {
    	try {
    	String nomeEmpresa;
    	String nomeCliente;
    	String endereco;
    	String cnpj;
    	String telefone;
    	String email;
    	Balanco balance = new Balanco();
    	String opcao = "0";
    	Rentabilidade rentabilidade = new Rentabilidade();
    	ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    	ArrayList<Pagamento> pagamentos = new ArrayList<>();
    	ArrayList<Produto> produtos = new ArrayList<>();	
    	ArrayList<Noticias> noticias = new ArrayList<>();	
    	
    	System.out.println("Olá, seja bem-vindo!!\n");
    	System.out.println("Complete o cadastro, por favor.\n");
    	System.out.println("Nome da Empresa:");
    	nomeEmpresa = leitor.next();
    	System.out.println("Seu primeiro nome:");
    	nomeCliente = leitor.next();
    	System.out.println("CNPJ:");
    	cnpj = leitor.next();
    	System.out.println("Email:");
    	email = leitor.next();
    	System.out.println("Telefone");
    	telefone = leitor.next();
    	System.out.println("Endereço:");
    	endereco = leitor.next();
    	System.out.println("Qual o Saldo Atual?");
    	balance.setSaldo(leitor.nextDouble());
		System.out.println("Cadastrado com sucesso!");
    	
    	Empresa empresa = new Empresa(nomeEmpresa,nomeCliente, endereco, cnpj, telefone, email);
    	
    	do{
    		System.out.println("\nOlá," + empresa.getNomeCliente() + "!\n");
        	System.out.println("Saldo Atual: " + balance.getSaldo());
        	System.out.println("Lucro Total: " + rentabilidade.getLucro());
        	System.out.println("Custo Total: " + rentabilidade.getCusto());
        	System.out.println("\nO que gostaria de realizar? Digite o númera da operação que deseja\n");
        	
    		System.out.println("1 - Alterar Cadastro");
    		System.out.println("2 - Extrato");
    		System.out.println("3 - Fornecedores");
    		System.out.println("4 - Produtos/Serviços");
    		System.out.println("5 - Pagamentos Pendentes");
    		System.out.println("6 - Notificações");
    		System.out.println("x - Sair");
    		opcao = leitor.next();
    	
    		if(opcao.equals("1")) {
        		System.out.println("Alterar Cadastro");
        		System.out.println("-----------------------");
            	System.out.println("Nome da Empresa:");
            	nomeEmpresa = leitor.next();
            	System.out.println("Seu primeiro nome:");
            	nomeCliente = leitor.next();
            	System.out.println("Email:");
            	email = leitor.next();
            	System.out.println("Telefone");
            	telefone = leitor.next();
            	System.out.println("Endereço:");
            	endereco = leitor.next();
            	empresa.alterarCadastro(nomeEmpresa, nomeCliente, endereco, telefone, email);
    		}
    		else if(opcao.equals("2")) {
    			System.out.println("Extrato");
        		System.out.println("-----------------------");
    			System.out.println("Saldo Atual: " + balance.getSaldo());
            	System.out.println("Lucro Total: " + rentabilidade.getLucro());
            	System.out.println("Custo Total: " + rentabilidade.getCusto());
        		System.out.println("-----------------------");
        		
        		if(pagamentos.size() == 0) {
        			System.out.println("Não há transações!");
        		}
        		else {
        			for(int i = 0; i < pagamentos.size(); i++) {
        				System.out.println(pagamentos.get(i));
        			}
        		}
    		}
    		else if(opcao.equals("3")) {
    			String opcaoMenuFornecedor;
    			System.out.println("Fornecedores");
        		System.out.println("-----------------------");
    			System.out.println("1. Cadastrar novo Fornecedor");
    			System.out.println("2. Consultar Fornecedores");
    			System.out.println("3. Buscar Fornecedor por ID");
    			System.out.println("2. Alterar cadastro de Fornecedor");
    			opcaoMenuFornecedor = leitor.next();

    			if(opcaoMenuFornecedor.equalsIgnoreCase("1")) {
        			System.out.println("Cadastrar novo Fornecedor");
            		System.out.println("-----------------------");
                	System.out.println("Nome Fornecedor:");
                	String nomeFornecedor = leitor.next();
                	System.out.println("Telefone");
                	String telefoneFornecedor = leitor.next();
                	System.out.println("Endereço:");
                	String enderecoFornecedor = leitor.next();
                	
    				Fornecedor novoFornecedor = new Fornecedor(nomeFornecedor, telefoneFornecedor, enderecoFornecedor);
    				fornecedores.add(novoFornecedor);
    				System.out.println("Cadastrado com sucesso!");
    			}
    			else if(opcaoMenuFornecedor.equalsIgnoreCase("2")) {
        			System.out.println("Fornecedores");
            		System.out.println("-----------------------/n");
            		for(int i = 0; i < fornecedores.size(); i++) {
            			Fornecedor f = fornecedores.get(i);
            			int id = fornecedores.indexOf(f);
            			System.out.print("ID: "+ id + "| ");
            			System.out.print(fornecedores.get(i));
                		System.out.println("");
            		}
    			}
    			else if(opcaoMenuFornecedor.equalsIgnoreCase("3")) {
    				System.out.println("Digite o id do fornecedor que está buscando: ");
        			int id = leitor.nextInt();
            		System.out.println("-----------------------/n");
            		System.out.println(fornecedores.get(id));
    			}
    			else if(opcaoMenuFornecedor.equalsIgnoreCase("4")) {
    				System.out.println("Alterar dados do Fornecedor");
            		System.out.println("-----------------------");     
    				System.out.println("Digite o id do fornecedor que deseja alterar: ");
            		int id = leitor.nextInt();
            		System.out.println("-----------------------/n");
            		System.out.println(fornecedores.get(id).getNome());
            		System.out.println("Nome Fornecedor:");
                	String nomeFornecedor = leitor.next();
                	System.out.println("Telefone");
                	String telefoneFornecedor = leitor.next();
                	System.out.println("Endereço:");
                	String enderecoFornecedor = leitor.next();
                	
    				Fornecedor novoFornecedor = new Fornecedor(nomeFornecedor, telefoneFornecedor, enderecoFornecedor);
    				fornecedores.set(id, novoFornecedor);
    				System.out.println("Alterado com sucesso!");
    			}
    		}
    		else if(opcao.equals("4")) {
    			String opcaoMenuProduto;
    			System.out.println("Produtos/Serviços");
        		System.out.println("-----------------------");
    			System.out.println("1. Cadastrar novo Produto");
    			System.out.println("2. Consultar Produtos");
    			System.out.println("3. Buscar Produto por ID");
    			System.out.println("4. Alterar dados de um Produto");
    			System.out.println("5. Compra de Produto");
    			System.out.println("6. Venda Produto");
    			opcaoMenuProduto = leitor.next();
    			if(opcaoMenuProduto.equalsIgnoreCase("1")) {
        			System.out.println("Cadastrar novo Produto");
            		System.out.println("-----------------------");
                	System.out.println("Descrição:");
                	String descricaoProd = leitor.next();
                	System.out.println("Tipo: (Serviço ou Produto)");
                	String tipoProduto = leitor.next();
                	System.out.println("Valor:");
                	Double valor = leitor.nextDouble();
                	System.out.println("Custo:");
                	Double custo = leitor.nextDouble();
                	Double lucro = valor - custo;
                	if(custo > valor) {
                		System.out.println("O valor inserido está incorreto, está maior que o custo.");
                	}
                	else {
                		Produto novoProduto = new Produto(descricaoProd, tipoProduto, valor, custo, lucro);
                    	produtos.add(novoProduto);
        				System.out.println("Produto cadastrado com sucesso!");
                	}
    			}
    			else if(opcaoMenuProduto.equalsIgnoreCase("2")) {
        			System.out.println("Produtos");
            		System.out.println("-----------------------/n");
            		for(int i = 0; i < produtos.size(); i++) {
            			System.out.print(produtos.get(i));
            		}
    			}
    			else if(opcaoMenuProduto.equalsIgnoreCase("3")) {
    				System.out.println("Digite o id do produto que está buscando: ");
        			int id = leitor.nextInt();
            		System.out.println("-----------------------/n");
            		System.out.println(produtos.get(id));
    			}
    			else if(opcaoMenuProduto.equalsIgnoreCase("4")) {
    				System.out.println("Alterar dados do Produto");
            		System.out.println("-----------------------");     
    				System.out.println("Digite o id do produto que deseja alterar: ");
            		int id = leitor.nextInt();
            		System.out.println("-----------------------/n");
            		System.out.println(produtos.get(id).getDescricao());
            		System.out.println("Descrição:");
                	String descricaoProd = leitor.next();
                	System.out.println("Tipo: (Serviço ou Produto)");
                	String tipoProduto = leitor.next();
                	System.out.println("Valor:");
                	Double valor = leitor.nextDouble();
                	System.out.println("Custo:");
                	Double custo = leitor.nextDouble();
                	Double lucro = valor - custo;
                	
            		Produto novoProduto = new Produto(descricaoProd, tipoProduto, valor, custo, lucro);
            		produtos.set(id, novoProduto);
    				System.out.println("Alterado com sucesso!");
    			}
    			else if(opcaoMenuProduto.equalsIgnoreCase("5")) {
    				System.out.println("Compra de produtos");
    				System.out.println("Digite o id do produto: ");
        			int id = leitor.nextInt();
        			System.out.println("Digite a quantidade de produtos: ");
        			int qtd = leitor.nextInt();
        			String desc = "Compra produtos" + produtos.get(id).getDescricao();
        			double valorProd = produtos.get(id).getCusto() * qtd;
        			String tipoFluxo = "Saída";
        			boolean concluido = true;
        			Calendar dataAtual = Calendar.getInstance();
        			Pagamento novoPagamento = new Pagamento(desc, tipoFluxo, valorProd, concluido, dataAtual);
        			pagamentos.add(novoPagamento);
        			pagamentos.get(pagamentos.size() - 1).CompraDeProduto(rentabilidade, balance, produtos.get(id));
    			}
    			else if(opcaoMenuProduto.equalsIgnoreCase("6")) {
    				System.out.println("Venda de produtos");
    				System.out.println("Digite o id do produto: ");
        			int id = leitor.nextInt();
        			System.out.println("Digite a quantidade de produtos: ");
        			int qtd = leitor.nextInt();
        			String desc = "Venda produtos" + produtos.get(id).getDescricao();
        			double valorProd = produtos.get(id).getCusto() * qtd;
        			String tipoFluxo = "Entrada";
        			boolean concluido = true;
        			Calendar dataAtual = Calendar.getInstance();
        			Pagamento novoPagamento = new Pagamento(desc, tipoFluxo, valorProd, concluido, dataAtual);
        			pagamentos.add(novoPagamento);
        			pagamentos.get(pagamentos.size() - 1).CompraDeProduto(rentabilidade, balance, produtos.get(id));
    			}
        	}
    		else if(opcao.equals("5")) {
    			String opcaoMenuPagamentos;
    			System.out.println("Pagamentos pendentes");
        		System.out.println("-----------------------");
    			System.out.println("1. Marcar pendência financeira");
    			System.out.println("2. Consultar pendências");
    			System.out.println("3. Concluir Pagamento");
    			opcaoMenuPagamentos = leitor.next();
    			if(opcaoMenuPagamentos.equalsIgnoreCase("1")) {
    				//
    			}
    			else if(opcaoMenuPagamentos.equalsIgnoreCase("2")) {
    				System.out.println("Pendências financeiras");
            		System.out.println("-----------------------/n");
            		for(int i = 0; i < pagamentos.size(); i++){
            			if(pagamentos.get(i).getConcluido() == false && pagamentos.get(i).getTipo().equals("Saída")) {
            				System.out.println("Pagamentos pendentes a serem feitos e obrigações fiscais");
                    		System.out.println("-----------------------/n");
                    		System.out.println(pagamentos.get(i));
            			}
            		}
            		for(int i = 0; i < pagamentos.size(); i++){
            			if(pagamentos.get(i).getConcluido() == false && pagamentos.get(i).getTipo().equals("Entrada")) {
            				System.out.println("Pagamentos pendentes a serem recebidos");
                    		System.out.println("-----------------------/n");
                    		System.out.println(pagamentos.get(i));
            			}
            		}
    			}
    			else if(opcaoMenuPagamentos.equalsIgnoreCase("3")) {
    				System.out.println("Concluir pagamento");
            		System.out.println("-----------------------/n");
            		//
    			}
        	}
    		else if(opcao.equals("6")) {
    			if(noticias.size() == 0) {
    				System.out.println("Notificações");
            		System.out.println("-----------------------/n");
            		System.out.println("Sem notificaçãoes novas agora!");
    			}
    			else {
    				System.out.println("Notificações");
            		System.out.println("-----------------------/n");
            		for(int i = 0; i < noticias.size(); i++) {
            			noticias.get(i);
            		}
    			}
        	}
    		else if(!opcao.equalsIgnoreCase("x")) {
        		throw new Exception("Opção inválida"); 
        	}
    	}
    	while(!opcao.equalsIgnoreCase("x"));
    		
    	} 
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    }
}