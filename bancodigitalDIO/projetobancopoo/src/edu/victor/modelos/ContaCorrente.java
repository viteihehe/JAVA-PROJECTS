package edu.victor.modelos;

public class ContaCorrente extends ContaMetodos {

    public ContaCorrente(Cliente cliente){
        super(cliente);
        this.tipoConta = TipoConta.CONTA_CORRENTE;
    }
}
