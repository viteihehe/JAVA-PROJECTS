package domain;

public class Clt extends Funcionario {
    private double salarioBase;
    public Clt(String nome, String funcao, double salarioBase){
        super(nome, Cargo.CLT, funcao);
        this.salarioBase = salarioBase;
    }
    
    @Override
    public double salario(){
        return salarioBase - (salarioBase*0.10);
    }
    
}
