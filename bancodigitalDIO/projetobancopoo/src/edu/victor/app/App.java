package edu.victor.app;

import edu.victor.modelos.Banco;
import edu.victor.modelos.Cliente;
import edu.victor.modelos.Conta;
import edu.victor.modelos.ContaCorrente;
import edu.victor.modelos.ContaPoupanca;
import edu.victor.util.EncontradorConta;
import edu.victor.util.Imprimir;
import edu.victor.util.Login;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.naming.directory.InvalidAttributesException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco("*Banco Vitei*");
        banco.setContas(new ArrayList<>());
        boolean loop = true;
        int escolha;

        do {
            System.out.println(banco.getNome());
            System.out.println("1 - Criar conta");
            System.out.println("2 - Logar");
            System.out.println("3 - Sair");
            System.out.println("Insira abaixo: ");
            try {
                escolha = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.nextLine();
                escolha = -1;
            }

            switch (escolha) {
                case 1:
                    Cliente cliente = new Cliente();
                    String temp;
                    int auxi;
                    sc.nextLine();

                    System.out.println("Bem vindo!!!");
                    System.out.println("Insira o nome do cliente:");
                    try {
                        temp = sc.nextLine();
                        cliente.setNome(temp);
                    } catch (NullPointerException e) {
                        throw new NullPointerException("O nome não pode ser nulo!");
                    }
                    System.out.println("Insira a senha: ");
                    try {
                        temp = sc.nextLine();
                        cliente.setSenha(temp);
                    } catch (NullPointerException e) {
                        throw new NullPointerException("A senha não pode ser nulo!");
                    }

                    System.out.println("Escolha o tipo da conta: ");
                    System.out.println("1 - Corrente");
                    System.out.println("2 - Poupança");
                    try {
                        auxi = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. Escolha 1 ou 2.");
                        sc.nextLine();
                        break;
                    }
                    Conta conta = (auxi == 1) ? new ContaCorrente(cliente) : new ContaPoupanca(cliente);

                    System.out.println("Por ultimo insira o saldo inicial se tiver ");
                    double tempSaldo;
                    try {
                        tempSaldo = sc.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada inválida. O saldo inicial será 0.");
                        sc.nextLine();
                        tempSaldo = 0;
                    }
                    conta.setSaldo(tempSaldo);
                    banco.getContas().add(conta);
                    break;
                case 2:
                    sc.nextLine();
                    double valor;
                    boolean loop2 = true;
                    int escolha2;
                    Conta contaLogada = Login.verificador(banco.getContas());
                    if (contaLogada != null) {
                        do {
                            System.out.println("1 - saque");
                            System.out.println("2 - Deposito");
                            System.out.println("3 - Transferência");
                            System.out.println("4 - Dados da conta");
                            System.out.println("5 - Menu inicial");
                            System.out.println("Insira o número inteiro:");
                            try {
                                escolha2 = sc.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                                sc.nextLine();
                                escolha2 = -1;
                            }

                            switch (escolha2) {
                                case 1:
                                    System.out.println("Insira o valor a ser sacado:");
                                    try {
                                        valor = sc.nextDouble();
                                        contaLogada.sacar(valor);
                                        System.out.println("Saque de " + valor + " realizado com sucesso");
                                    } catch (InputMismatchException e) {
                                        System.out.println("Entrada inválida. Por favor, digite um valor numérico.");
                                        sc.nextLine();
                                    } catch (InvalidAttributesException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Insira o valor a ser depositado:");
                                    try {
                                        valor = sc.nextDouble();
                                        contaLogada.depositar(valor);
                                        System.out.println("Depósito de " + valor + " realizado com sucesso");
                                    } catch (InputMismatchException e) {
                                        System.out.println("Entrada inválida. Por favor, digite um valor numérico.");
                                        sc.nextLine();
                                    } catch (InvalidAttributesException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 3:
                                    System.out.println("Insira o valor a ser transferido: ");
                                    try {
                                        valor = sc.nextDouble();
                                        System.out.println("Insira o número da conta a qual deseja transferir:");
                                        auxi = sc.nextInt();
                                        Conta contaDestino = EncontradorConta.encontrarConta(banco.getContas(), auxi);
                                        if (contaDestino != null) {
                                            contaLogada.tranferir(valor, contaDestino);
                                            System.out.println("Transferência de " + valor + " realizada com sucesso");
                                        } else {
                                            System.out.println("Conta de destino não encontrada.");
                                        }
                                    } catch (InputMismatchException e) {
                                        System.out.println("Entrada inválida. Por favor, digite valores numéricos.");
                                        sc.nextLine();
                                    } catch (InvalidAttributesException e) {
                                        e.printStackTrace();
                                    }
                                    break;
                                case 4:
                                    Imprimir.imprimir(contaLogada);
                                    break;
                                case 5:
                                    System.out.println("Obrigado pela sua confiança :D");
                                    loop2 = false;
                                    break;
                                default:
                                    System.out.println("Opção inválida");
                                    break;
                            }
                        } while (loop2);
                    } else {
                        System.out.println("Ocorreu um erro no processamento! Verifique suas credenciais.");
                    }
                    break;
                case 3:
                    System.out.println("Até breve");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (loop);
    }
}