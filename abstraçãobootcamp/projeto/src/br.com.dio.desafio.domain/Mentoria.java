package br.com.dio.desafio.domain;

import  br.com.dio.desafio.domain.Conteudo;
import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Mentoria() {
        super(titulo, descricao);
        this.data = LocalDate.now();
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }


}
