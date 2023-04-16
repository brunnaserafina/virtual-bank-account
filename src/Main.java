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

        System.out.println(dataAccount);

    }
}