package edu.victor.models;

public abstract class Funcionario implements Salario{
    private String nome;
    private Cargo cargo;
    private String funcao;

    public Funcionario(String nome, Cargo cargo, String funcao){
        this.nome = nome;
        this.cargo = cargo;
        this.funcao = funcao;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Cargo getCargo(){
        return this.cargo;
    }

    public void setCargo(Cargo cargo){
        this.cargo =cargo;
    }

    public String getFuncao(){
        return this.funcao;
    }
}