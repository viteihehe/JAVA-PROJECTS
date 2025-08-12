package edu.victor.classes;

import edu.victor.modelos.Iphone;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IphoneExecutavel extends Iphone {

    public static void main(String[] args) {
        IphoneExecutavel iphone = new IphoneExecutavel();
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        int escolha;
        do { 
            System.out.println("Seleicone o serviço:");
            System.out.println("1 - Navegador");
            System.out.println("2 - Reprodutor de música");
            System.out.println("3 - Telefone");
            System.out.println("4 - Desligar");
            try {
                escolha = sc.nextInt();
            } catch (InputMismatchException e) {
               throw new InputMismatchException("Se deve inserir um número inteiro");
            }
        switch (escolha) {
            case 1:
                String url;
                    sc.nextLine();
                    iphone.adicionarNovaAba();
                        System.out.println("Insira a url: ");
                        try {
                        url = sc.nextLine();
                        } catch (NullPointerException e) {
                        throw new NullPointerException("Não se pode deixar esse espaço em branco");
                        }
                        iphone.exibirPagina(url);
                        iphone.atualizarPagina();
                
                break;
            case 2: 
                String musica;
                    sc.nextLine();
                    System.out.println("Insira a música desejada: ");
                    try {
                      musica = sc.nextLine();
                    } catch (NullPointerException e) {
                        throw new NullPointerException("Não se pode deixar esse espaço em branco");
                    }

                    iphone.selecionarMusica(musica);
                    iphone.tocar();
                    iphone.pausar();

                break;
            case 3:
                    sc.nextLine();
                    String numero;

                iphone.atender();

                iphone.inicarCorreioVoz();

                System.out.println("Insira o número desejado:");
                    try {
                      numero = sc.nextLine();
                    } catch (NullPointerException e) {
                        throw new NullPointerException("Não se pode deixar esse espaço em branco");
                    }   
                
                iphone.ligar(numero);
                
            
                break;
            case 4:
                System.out.println("Desligando!");
                loop = false;
              break;
            default:
                throw new AssertionError();
        }


        } while (loop);
    }

}
