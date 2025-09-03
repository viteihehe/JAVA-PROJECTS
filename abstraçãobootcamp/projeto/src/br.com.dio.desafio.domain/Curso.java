package br.com.dio.desafio.domain;

import java.time.LocalDate;

public class Curso extends br.com.dio.desafio.domain.Conteudo {

    private int cargaHoraria;

    public Curso() {
        super();
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d
    }
    
}
