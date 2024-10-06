import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\nDigite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("\nDigite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("\nDigite o seu saldo: ");
        double saldo = scanner.nextDouble();
        scanner.close();
        System.out.println("");

        System.out.println("Olá "+ nome +" , obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
