package edu.victor.modelos;

public enum TipoConta {
    CONTA_CORRENTE(1),
    CONTA_POUPANCA(2);

    TipoConta(int valor) {
        this.valor = valor;
    }

    private int valor;

    public int getValor(){
        return this.valor;
    }

    public static TipoConta tipoContaPorValor(int valor){
        for(TipoConta auxi : values()){
            if(auxi.getValor() == valor){
                return auxi;
            }
        }
        return null;
    }
}
