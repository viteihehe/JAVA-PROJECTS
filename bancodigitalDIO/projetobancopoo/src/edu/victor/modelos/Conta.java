package edu.victor.modelos;

public abstract class Conta implements Operacoes{
    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;

    protected String agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected TipoConta tipoConta;

    public Conta(){
    };

    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public int getNumero(){
        return this.numero;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public TipoConta geTipoConta(){
        return this.tipoConta;
    }
    
}
