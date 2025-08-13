package edu.victor.modelos;

import javax.naming.directory.InvalidAttributesException;

public abstract class ContaMetodos extends Conta{

    public ContaMetodos(Cliente cliente){
        super(cliente);
    }

    @Override
    public void sacar(double valor) throws InvalidAttributesException {
        if((valor >= 0)&&(valor <= saldo)){
            saldo -= valor;
        }else{
            throw new InvalidAttributesException("O valor deve ser um numero natural");
        }
    }

    @Override
    public void depositar(double valor) throws InvalidAttributesException {
          if(valor >= 0){
            saldo -= valor;
        }else{
            throw new InvalidAttributesException("O valor deve ser um numero natural");
        }
    }

    @Override
    public void tranferir(double valor, Conta conta) throws InvalidAttributesException {
        if(valor >= 0 && conta != null && valor <= saldo){
            saldo -= valor;
            conta.saldo += valor;
        }else{
            throw new InvalidAttributesException("O valor deve ser um numero natural e a conta não dever ser nula");
        }
    }

}
