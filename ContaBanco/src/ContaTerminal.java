import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println();
        System.out.println("Informe o número da agência: ");
        agencia = sc.nextLine();

        System.out.println("Informe o número da conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Informe o saldo disponível: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia,numeroConta,saldo);
            
        
        //"Olá %s" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
        //agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");


        sc.close();
    }
}
