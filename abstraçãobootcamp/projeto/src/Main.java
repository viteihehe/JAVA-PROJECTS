package projeto.src;

import projeto.src.br.com.dio.desafio.domain.BootCamp;
import projeto.src.br.com.dio.desafio.domain.Usuario;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Mentoria;
import projeto.src.br.com.dio.desafio.util.Login;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando Bootcamp e Conteúdos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootcamp = new BootCamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        boolean loop = true;
        int escolha;

        do {
            System.out.println("\n--- Sistema BootCamp ---");
            System.out.println("1 - Criar Usuário");
            System.out.println("2 - Logar");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                escolha = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número.");
                sc.nextLine();
                escolha = -1;
            }

            switch (escolha) {
                case 1:
                    sc.nextLine();
                    Usuario novoUsuario = new Usuario();
                    System.out.print("Digite o nome do usuário: ");
                    novoUsuario.setNome(sc.nextLine());

                    System.out.print("Digite a senha: ");
                    novoUsuario.setSenha(sc.nextLine());

                    // usuário é adicionado no bootcamp
                    novoUsuario.inscreverNoBootCamp(bootcamp);
                    bootcamp.getDevsInscritos().add(novoUsuario);
                    System.out.println("Usuário criado e inscrito no BootCamp!");
                    break;

                case 2:
                    sc.nextLine();
                    Usuario usuarioLogado = Login.verificador(bootcamp);
                    if (usuarioLogado != null) {
                        boolean loop2 = true;
                        int escolha2;

                        do {
                            System.out.println("\n--- Menu do Usuário ---");
                            System.out.println("1 - Ver Progresso");
                            System.out.println("2 - Progredir nos conteúdos");
                            System.out.println("3 - Voltar ao menu inicial");
                            System.out.print("Escolha: ");

                            try {
                                escolha2 = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida! Digite um número.");
                                sc.nextLine();
                                escolha2 = -1;
                            }

                            switch (escolha2) {
                                case 1:
                                    usuarioLogado.imprimir();
                                    break;
                                case 2:
                                    usuarioLogado.progredir();
                                    System.out.println("Você avançou em um conteúdo!");
                                    break;
                                case 3:
                                    loop2 = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }
                        } while (loop2);
                    } else {
                        System.out.println("Falha no login!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo do sistema. Até logo!");
                    loop = false;
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (loop);

        sc.close();
    }
}
