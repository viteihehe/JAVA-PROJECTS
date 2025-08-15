package edu.victor.util;

import edu.victor.modelos.No;

public class Pilha<T> {

    private No<T> refNoEntrada = null;

    public Pilha(){
    }


    public T pop(){
       if(!isEmpty()){
         No auxiNo = new No<>();
        auxiNo = this.refNoEntrada;
        refNoEntrada = refNoEntrada.getRefNo();
        return (T) auxiNo.getObjeto();
       }
       return null;
    }

    public void push(T objeto){
        No auxiNo = new No<T>(objeto);
        No tempNo = new No<>();
        tempNo = refNoEntrada;
        refNoEntrada = auxiNo;
        auxiNo.setRefNo(tempNo);
    }

    public T top(){
        return this.refNoEntrada.getObjeto();
    }


    public boolean isEmpty(){
        return (this.refNoEntrada == null) ? true : false;
    }

     @Override
    public String toString(){
        String retorno = "=======================\n";
        retorno += "Pilha\n";
        retorno += "=================\n";

        No tempDado = this.refNoEntrada;

        while(true){
            if(tempDado != null){
                retorno += "No{ "+tempDado.getObjeto()+"}\n";
                tempDado = tempDado.getRefNo();
            }else{
                break;
            }
        }
        retorno += "=====================\n";
        return retorno;
    }
}
