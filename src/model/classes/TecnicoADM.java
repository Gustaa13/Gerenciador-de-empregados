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
        this.setSalario(this.calcularSalario());

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
    
    private Integer getValorInsalubridade(){
        return insalubridade ? 1 : 0;
    }

    private Integer getValorGratificacao(){
        return funcaoGratificada ? 1 : 0;
    }

    @Override
    public Double calcularSalario(){

        Double salario = 2500.0 * Math.pow(1.03, this.nivelTecnico.getValor()) + 2500.0 * 0.25 * this.formacaoTecnico.getValor() + 2500 * 0.5 * getValorInsalubridade() + 2500.0 * 0.5 * getValorGratificacao();

        return salario;
    }

    @Override
    public String getPrincipaisDados(){
        return super.getPrincipaisDados() + "\nNível: " + nivelTecnico + "\nFormação: " + formacaoTecnico;
    }
}
