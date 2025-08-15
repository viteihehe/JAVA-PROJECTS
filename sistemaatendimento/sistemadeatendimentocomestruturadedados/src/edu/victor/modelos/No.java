package edu.victor.modelos;

public class No<T> {
    private T objeto;
    private No<T> refNo;


    public No(){

    }
    
    public No(T objeto){
        this.objeto = objeto;
        this.refNo = null;
    }

    /**
     * @return T return the objeto
     */
    public T getObjeto() {
        return objeto;
    }

    /**
     * @param objeto the objeto to set
     */
    public void setObjeto(T objeto) {
        this.objeto = objeto;
    }

    /**
     * @return No<T> return the refNo
     */
    public No<T> getRefNo() {
        return refNo;
    }

    /**
     * @param refNo the refNo to set
     */
    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

}
