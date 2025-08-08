package edu.victor.models;

public class Estagiario extends Funcionario{
    private double bolsaFixa;
    public Estagiario(String nome, String funcao, double bolsaFixa){
        super(nome, Cargo.ESTAGIARIO, funcao);
        this.bolsaFixa = bolsaFixa;
    }

    @Override
    public double salario(){
        return bolsaFixa;
    }
}
