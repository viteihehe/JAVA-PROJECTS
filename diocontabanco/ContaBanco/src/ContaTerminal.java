import java.util.Scanner;

public class ContaTerminal {
    /**
     * @author Victor Manuel
     * @version 1.0
     * @since 2023-10-01
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);    

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Bem vindo ao Banco DIO");
            System.out.println("Por favor,insira seu nome:");
                nomeCliente = sc.nextLine();
            System.out.println("Por favor, insira sua agência:");
                agencia = sc.nextLine();
            System.out.println("Por favor, insira seu numero:");
                numero = sc.nextInt();
            System.out.println("Por favor, insira seu saldo:");
                saldo = sc.nextDouble();


        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso baco, sua agência é "
        +agencia+", conta "+numero+" e seu saldo "+saldo+" já esta disponível");


    }
}
