import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2000.00;
        String nome = "Yasmina Andrade";
        String tipoConta = "Corrente";
        int opcao = 0;

        String dadosCliente = """
                ******************************
                DADOS INICIAIS DO CLIENTE
                Nome: %s
                Tipo de conta: %s
                Saldo Inicial: %.2f
                ******************************
                """.formatted(nome, tipoConta, saldo);

        String mensagemMenu = """
                
                Operações
                                    
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                                    
                Digite a opção desejada:
                """;

        System.out.println(dadosCliente);

        while (opcao != 4) {
            System.out.println(mensagemMenu);
            opcao = scanner.nextByte();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Seu saldo atualizado é R$ " + saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir: ");
                    double transferencia = scanner.nextDouble();

                    if (transferencia < saldo) {
                        saldo -= transferencia;
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    System.out.println("Seu saldo atualizado é R$ " + saldo);
                    break;
                case 4:
                    System.out.println("Operação finalizada!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }
    }
}