import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bemvindo ao Banco xpto");

        System.out.println("Digite o seu nome completo: ");
        String nomeCompleto = scanner.next();

        System.out.println("Digite o numero da sua conta bancária: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o numero da sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite o saldo atual da sua conta:");
        double saldo = scanner.nextDouble();

        mostrarMensagem(nomeCompleto, agencia, numeroConta, saldo); 

    }

    public static void mostrarMensagem(String novoNomeCompleto, String novaAgencia, int novoNumeroConta, double novoSaldo) {
        String mensagem = "Olá "+novoNomeCompleto+", obrigado por criar uma conta em nosso banco, sua agência é "+novaAgencia+", conta "+novoNumeroConta+" e seu saldo "+novoSaldo+" já está disponível para saque.";
        
        System.out.println(mensagem);
    }

}
