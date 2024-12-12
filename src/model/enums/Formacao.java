package model.enums;

public enum Formacao {

    ESPECIALIZACAO(1), 
    MESTRADO(2), 
    DOUTORADO(3);

    private final Integer valor;
    
    Formacao(Integer valor){
        this.valor = valor;
    }

    public Integer getValor(){
        return valor;
    }
}
