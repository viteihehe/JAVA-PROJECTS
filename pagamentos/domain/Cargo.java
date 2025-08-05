package domain;

public enum Cargo {
    PJ(1), 
    CLT(2), 
    ESTAGIARIO(3);

    private int valor;

    Cargo(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    public static Cargo cargoFromValor(int valor){
        for(Cargo auxi : values()){
            if(auxi.getValor() == valor){
                return auxi;
            }
        }
        return null;
    }
}
