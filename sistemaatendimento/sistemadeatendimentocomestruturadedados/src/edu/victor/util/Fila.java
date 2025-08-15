package edu.victor.util;

import edu.victor.modelos.No;

public class Fila<T> {

    private No<T> refNoEntrada;


    public Fila(){
        this.refNoEntrada = null;
    }

    public T dequeue(){
        if(!isEmpty()){
            No primeiroNo = refNoEntrada;
            No auxiNo = refNoEntrada;
                while (true) { 
                    if(primeiroNo.getRefNo() != null){
                    auxiNo = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    auxiNo.setRefNo(null);
                    break;
                }
                }
            return (T) primeiroNo.getObjeto();
        }
        return null;
    }

    public T first(){
        if(!isEmpty()){
            No primeiroNo = refNoEntrada;
                while (true) { 
                    if(primeiroNo.getRefNo() != null){
                        primeiroNo = primeiroNo.getRefNo();
                    }else{
                        break;
                    }
                }
            return (T) primeiroNo.getObjeto();
        }
        return null;
    }

    public void equeue(T objeto){
        No tempNo = new No<T>(objeto);
        tempNo.setRefNo(refNoEntrada);
        refNoEntrada = tempNo;
    }

    public boolean isEmpty(){
        return (refNoEntrada == null) ? true : false;
    }
@Override
public String toString() {
    String retorno = "Fila :";
    No noauxiliar = this.refNoEntrada;

    if(this.refNoEntrada != null){
        while (true) { 
            retorno += "[ " + noauxiliar.getObjeto() + " ] ";
            if(noauxiliar.getRefNo() != null){
                noauxiliar = noauxiliar.getRefNo();
            }else{
                break;
            }
        }
        return retorno;
    }else{
        retorno = "null";
    }
    return null;
    }
}
