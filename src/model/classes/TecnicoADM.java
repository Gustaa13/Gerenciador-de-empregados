package model.classes;

import java.time.LocalDate;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import model.interfaces.Funcionario;

public class TecnicoADM extends Pessoa implements Funcionario{
    private Nivel nivelTecnico;
    private Formacao formacaoTecnico;
    private Boolean insalubridade;
    private Boolean funcaoGratificada;

    public TecnicoADM(){}  

    public TecnicoADM(

        String nome, 
        String cpf, 
        LocalDate dataNascimento, 
        Genero genero, 
        Endereco endereco, 
        Long matricula, 
        String departamento, 
        Integer cargaHoraria, 
        LocalDate dataIngresso,

        Nivel nivelTecnico, 
        Formacao formacaoTecnico, 
        Boolean insalubridade, 
        Boolean funcaoGratificada
    ){

        super(
            nome, 
            cpf, 
            dataNascimento, 
            genero, 
            endereco, 
            matricula, 
            departamento, 
            cargaHoraria, 
            dataIngresso
        );

        this.nivelTecnico = nivelTecnico;
        this.formacaoTecnico = formacaoTecnico;
        this.insalubridade = insalubridade;
        this.funcaoGratificada = funcaoGratificada;

    }

    public Nivel getNivelTecnico() {
        return nivelTecnico;
    }

    public void setNivelTecnico(Nivel nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }

    public Formacao getFormacaoTecnico() {
        return formacaoTecnico;
    }

    public void setFormacaoTecnico(Formacao formacaoTecnico) {
        this.formacaoTecnico = formacaoTecnico;
    }

    public Boolean getInsalubridade() {
        return insalubridade;
    }

    public void setInsalubridade(Boolean insalubridade) {
        this.insalubridade = insalubridade;
    }

    public Boolean getFuncaoGratificada() {
        return funcaoGratificada;
    }

    public void setFuncaoGratificada(Boolean funcaoGratificada) {
        this.funcaoGratificada = funcaoGratificada;
    } 

    @Override
    public Double calcularSalario(){
        return null;
    }

    @Override
    public String getPrincipaisDados(){
        return super.getPrincipaisDados() + "\nNível: " + nivelTecnico + "\nFormação: " + formacaoTecnico;
    }
}
