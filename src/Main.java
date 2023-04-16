import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Brunna Serafina";
        double bankBalance = 1599.99;
        String typeAccount = "Corrente";
        int option = 0;

        String dataAccount = """
                 *******************************************
                 Dados iniciais do cliente:
                 
                 Nome do cliente: %s
                 Tipo de conta: %s
                 Saldo inicial: R$ %.2f
                 *******************************************
                """.formatted(username, typeAccount, bankBalance);

        String menu = """
                 Operações
                 
                 1- Consultar saldos
                 2- Receber valor
                 3- Transferir valor
                 4- Sair   
                 
                 Digite a opção desejada: 
                """;

        System.out.println(dataAccount);

        Scanner reading = new Scanner(System.in);

        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("O saldo atualizado é de " + bankBalance);
            } else if (option == 2) {
                System.out.println("Informe o valor a receber: ");
                double receivedValue = reading.nextDouble();
                bankBalance += receivedValue;
                System.out.println("Saldo atualizado R$ " + bankBalance);
            } else if (option == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double transferredValue = reading.nextDouble();
                if (transferredValue > bankBalance) {
                    System.out.println("Não há saldo para realizar a transferência!");
                } else {
                    bankBalance -= transferredValue;
                    System.out.println("Saldo atualizado R$ " + bankBalance);
                }
            } else if (option != 4) {
                System.out.println("Opção inválida!");
            }
        }


    }
}