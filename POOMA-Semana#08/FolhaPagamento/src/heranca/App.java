package heranca;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cadastro de funcionários!");

        while (true) {
            Mensalista mensal = new Mensalista();
            Tarifeiro tarifa = new Tarifeiro();
            Horista hora = new Horista();

            
            System.out.println("\nEscolha o tipo de funcionário:");
            System.out.println("1 - Mensalista");
            System.out.println("2 - Tarifeiro");
            System.out.println("3 - Horista");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();

            scanner.nextLine(); // Limpa o buffer

            if (opcao == 4) {
                System.out.println("Encerrando o programa.");
                break;
            }
            
            switch (opcao) {
                case 1:
                    Mensalista funcionario = new Mensalista(nome, depto, funcao, salarioMensal);
                	System.out.print("Digite o nome do funcionário: ");
                	mensal.nome = scanner.nextLine();
                    System.out.print("Digite o departamento do funcionário: ");
                    mensal.depto = scanner.nextLine();
                    System.out.print("Digite a função do funcionário: ");
                    mensal.funcao = scanner.nextLine();
                    System.out.print("Digite o salário mensal do Mensalista: ");
                    double salarioMensal = scanner.nextDouble();
                    mensal.imprimirPagamento();
                    break;

                case 2:
                	Mensalista funcionario = new Mensalista(nome, depto, funcao, salarioMensal);
                	System.out.print("Digite o nome do funcionário: ");
                	mensal.nome = scanner.nextLine();
                    System.out.print("Digite o departamento do funcionário: ");
                    mensal.depto = scanner.nextLine();
                    System.out.print("Digite a função do funcionário: ");
                    mensal.funcao = scanner.nextLine();
                    System.out.print("Digite o salário mensal do Mensalista: ");
                    double salarioMensal = scanner.nextDouble();
                    mensal.imprimirPagamento();
                    break;

                case 3:
                	Mensalista funcionario = new Mensalista(nome, depto, funcao, salarioMensal);
                	System.out.print("Digite o nome do funcionário: ");
                	mensal.nome = scanner.nextLine();
                    System.out.print("Digite o departamento do funcionário: ");
                    mensal.depto = scanner.nextLine();
                    System.out.print("Digite a função do funcionário: ");
                    mensal.funcao = scanner.nextLine();
                    System.out.print("Digite o salário mensal do Mensalista: ");
                    double salarioMensal = scanner.nextDouble();
                    mensal.imprimirPagamento();
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

            
        }

        scanner.close();
    }
}
