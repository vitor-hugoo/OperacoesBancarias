
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        try {
            double saldo = 0;
            boolean continuar = true;

            while (continuar) {

                System.out.println("Digite a opção desejada:\n1 - Depositar\n2 - Sacar\n3 - Consultar Saldo\n4 - Encerrar");

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                        System.out.println("Insira o valor para efetuar o deposito.");
                        double deposito = scanner.nextDouble();
                        saldo += deposito;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                        break;
                    case 2:
                        // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                        System.out.println("Digite o valor para efetuar o saque.");
                        double saque = scanner.nextDouble();
                        if (saque > saldo) {
                            System.out.println("Saldo insuficiente.");
                        } else {
                            saldo -= saque;
                            System.out.printf("Saldo atual: %.1f%n", saldo);
                        }
                        break;
                    case 3:
                        // TODO: Exibir o saldo atual da conta.
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                        break;
                    case 4:
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Apenas valores númericos são aceitos.");
            scanner.nextLine();
        }
    }
}
