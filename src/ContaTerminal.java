import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite as informações solicitadas a baixo.");

        System.out.print("Numero da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Agência: ");
        String agencia = scanner.next();

        System.out.print("Nome completo: ");
        String nomeCompleto = scanner.next();

        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCompleto + "obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta"+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");

        scanner.close();
    }
}
