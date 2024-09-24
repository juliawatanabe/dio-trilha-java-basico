import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanObj = new Scanner(System.in); 

        System.out.println("Olá, seja bem-vindo ao Banco FrogCoins.");

        System.out.println("Qual o seu nome? ");
        String userName = scanObj.nextLine();

        System.out.println("Digite o número da Agência: ");
        String agencia = scanObj.nextLine();

        System.out.println("Digite o número da sua conta bancária: ");
        int contaBancaria = scanObj.nextInt();

        System.out.println("Verificando os dados...");
        System.out.println("Informe o valor a ser depositado: ");
        Double valorDeposito = scanObj.nextDouble();

        System.out.println("Olá ".concat(userName) + ". Agradecemos a sua preferência pelo nosso banco! Sua agência é a ".concat(agencia) + " e a sua conta é " + contaBancaria + ". O seu saldo de R$ " + valorDeposito + " já está disponível para saque.");
        
    }
}
