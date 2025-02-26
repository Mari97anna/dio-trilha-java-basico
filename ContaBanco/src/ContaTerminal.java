import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scan.nextLine();

        System.out.println("Digite o seu nome: ");
        String nomeCliente= scan.nextLine();

        System.out.println("Informe o numero da conta: ");
        int numero = scan.nextInt();

        System.out.println("Digite o saldo disponível: ");
        double saldoDisponivel= scan.nextDouble();

        System.out.println("Olá " + nomeCliente + " ,obrigado por criar uma conta em" +
                " nosso banco, sua agência é " + agencia + " ,conta " + numero +
                " e seu saldo " + saldoDisponivel + " já está disponível para saque.");

        scan.close();






    }
}