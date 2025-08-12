package edu.victor.modelos;

import edu.victor.interfaces.AparelhoTelefonico;
import edu.victor.interfaces.NavegadorInternet;
import edu.victor.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void inicarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
         System.out.println("Exibindo: "+url);
    }

    @Override
    public void adicionarNovaAba() {
         System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
         System.out.println("Atualizando página");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
         System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
         System.out.println("Colocando música: "+musica);
    }
}
