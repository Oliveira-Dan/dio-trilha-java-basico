import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        var nomeBanco = "DioBank";
        var saldo = 237.48;
        System.out.printf("Olá. Bem vindo ao banco %s! Crie sua conta agora. \n", nomeBanco);
        System.out.println("Insira seus dados abaixo.");
        System.out.print("Nome: ");
        var nome = scanner.next();
        System.out.print("Agência: ");
        var agencia = scanner.next();
        System.out.print("Conta: ");
        var conta = scanner.nextInt();
        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Lembresse, sua agência é %s, conta %s, e como bônus de cadastro você tem o saldo de R$ %s. \n", nome, agencia, conta, saldo);
    }
}
