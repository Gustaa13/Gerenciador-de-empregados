package model.enums;

public enum Nivel {
    
    I(1.0), 
    II(2.0), 
    III(3.0), 
    IV(4.0), 
    V(5.0),
    VI(6.0), 
    VII(7.0),
    VIII(8.0);

    private final Double valor;

    Nivel(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }
}
