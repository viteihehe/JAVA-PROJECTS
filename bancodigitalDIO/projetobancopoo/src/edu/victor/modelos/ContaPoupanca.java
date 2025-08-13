package edu.victor.modelos;

public class ContaPoupanca extends ContaMetodos {
    public ContaPoupanca(Cliente cliente){
        super(cliente);
        this.tipoConta = TipoConta.CONTA_POUPANCA;
    }
}
