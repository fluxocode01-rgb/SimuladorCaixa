import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular: ");
        String nome = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nome, 500.00); // Começa com R$ 500
        int opcao = 0;

        do {
            System.out.println("1- Ver Saldo | 2- Depositar | 3- Sacar | 0- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirExtrato();
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double vDep = scanner.nextDouble();
                    conta.depositar(vDep);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double vSaq = scanner.nextDouble();
                    conta.sacar(vSaq);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}