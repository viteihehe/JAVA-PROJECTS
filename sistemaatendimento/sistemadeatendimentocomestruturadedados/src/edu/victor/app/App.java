package edu.victor.app;

import edu.victor.modelos.Paciente;
import edu.victor.util.Fila;
import edu.victor.util.Pilha;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha<Paciente> pilha = new Pilha<>();
        Fila<Paciente> fila = new Fila<>();
        boolean loop = true;
        byte escolha = 0;

        do {
            System.out.println("Sistema de armazenamento médico:");
            System.out.println("1 - Cadastro de pacientes");
            System.out.println("2 - Cadastros de urgências");
            System.out.println("3 - Atendimento");
            System.out.println("4 - Imprimir relatorio");
            System.out.println("5 - Sair");
            try {
                escolha = sc.nextByte();
                sc.nextLine();
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

            switch (escolha) {
                case 1:
                    System.out.println("Insira o nome do paciente: ");
                    String nome = sc.nextLine();
                    System.out.println("Insira que cuidado médico ele precisa: ");
                    String especialidade = sc.nextLine();

                    Paciente paciente = new Paciente();
                    paciente.setNome(nome);
                    paciente.setEspecialidadeMedica(especialidade);

                    fila.equeue(paciente);
                    break;

                case 2:
                    System.out.println("Insira o nome do paciente: ");
                    String nome2 = sc.nextLine();
                    System.out.println("Insira que cuidado médico ele precisa: ");
                    String especialidade2 = sc.nextLine();

                    Paciente paciente2 = new Paciente();
                    paciente2.setNome(nome2);
                    paciente2.setEspecialidadeMedica(especialidade2);

                    pilha.push(paciente2);
                    break;
                case 3:
                    if (!pilha.isEmpty()) {
                        System.out.println(pilha.pop());
                    } else if (!fila.isEmpty()) {
                        System.out.println(fila.dequeue());
                    }
                    break;
                case 4:
                    System.out.println(pilha);
                    System.out.println(fila);
                    break;
                case 5:
                    System.out.println("Encerrando sistema");
                    loop = false;
                    break;
                default:
                    System.out.println("Escolha invalida.");
            }

        } while (loop);

    }
}
