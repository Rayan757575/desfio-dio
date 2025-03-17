import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        int numeroAgencia = s.nextInt();
        System.out.println("Por favor, digite o nome da Agência:");
        String agencia = s.next();
        System.out.println("Por favor, digite o seu nome:");
        String nomeUsuario = s.next();
        System.out.println("Por favor, digite o saldo na conta:");
        double saldo = s.nextDouble();
        System.out.println("\nOlá "+ nomeUsuario+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}