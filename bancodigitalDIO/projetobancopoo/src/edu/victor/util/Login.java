package edu.victor.util;


import java.util.List;
import java.util.Scanner;
import edu.victor.modelos.Cliente;
import edu.victor.modelos.Conta;

public class Login {
    public static Conta verificador(List<Conta> contas) {
    Scanner scanner = new Scanner(System.in);
    String nomeTeste, senhaTeste;

    System.out.println("Insira o usuário: ");
    nomeTeste = scanner.nextLine();

    System.out.println("Insira a senha: ");
    senhaTeste = scanner.nextLine();

    // Percorre todas as contas
    for (Conta conta : contas) {
        Cliente cliente = conta.getCliente();
        if (cliente.getNome().equals(nomeTeste) && cliente.getSenha().equals(senhaTeste)) {
            System.out.println("Login realizado com sucesso!");
            return conta; 
        }
    }

    System.out.println("Nome ou senha incorretos!");
    return null; // login falhou
}

}
