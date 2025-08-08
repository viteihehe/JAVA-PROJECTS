package edu.victor.models;

public class Pj extends Funcionario{
    private double valorHora;
    private int horasTrabalhadas;
    public Pj(String nome, String funcao, double valorHora, int horasTrabalhadas){
        super(nome, Cargo.PJ, funcao);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double salario(){
        return valorHora*horasTrabalhadas;
    }
}
