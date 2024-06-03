import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite as informações solicitadas a baixo.");

        System.out.print("Numero da conta: ");
        int numeroConta;
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Agência: ");
        String agencia;
        agencia = scanner.nextLine();

        System.out.print("Nome completo: ");
        String nomeCompleto;
        nomeCompleto = scanner.nextLine();

        System.out.print("Saldo: ");
        Double saldo;
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCompleto + " obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");

        scanner.close();
    }
}
