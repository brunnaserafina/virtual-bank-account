import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "Brunna Serafina";
        double bankBalance = 1599.99;
        String typeAccount = "Corrente";

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

    }
}