package projeto.src.br.com.dio.desafio.util;


import projeto.src.br.com.dio.desafio.domain.BootCamp;
import projeto.src.br.com.dio.desafio.domain.Usuario;

import java.util.Scanner;
import java.util.Set;

public class Login {
    public static Usuario verificador(BootCamp bootCamp) {
        Scanner scanner = new Scanner(System.in);
        String nomeTeste, senhaTeste;

        System.out.println("Insira o usuário: ");
        nomeTeste = scanner.nextLine();

        System.out.println("Insira a senha: ");
        senhaTeste = scanner.nextLine();

        // Percorre todas as contas
        for (Usuario conta : bootCamp.getDevsInscritos()) {
            if (conta.getNome().equals(nomeTeste) && conta.getSenha().equals(senhaTeste)) {
                System.out.println("Login realizado com sucesso!");
                return conta;
            }
        }

        System.out.println("Nome ou senha incorretos!");
        return null; // login falhou
    }

}
