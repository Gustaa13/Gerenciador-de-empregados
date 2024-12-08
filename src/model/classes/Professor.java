package model.classes;

import java.time.LocalDate;
import java.util.List;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import model.interfaces.Funcionario;

public class Professor extends Pessoa implements Funcionario{
    private Nivel nivelProfessor;
    private Formacao formacaoProfessor;
    private List<String> disciplinas;

    public Professor(){}

    public Professor(

        String nome, 
        String cpf, 
        LocalDate dataNascimento, 
        Genero genero, 
        Endereco endereco, 
        Long matricula, 
        String departamento, 
        Integer cargaHoraria, 
        LocalDate dataIngresso, 

        Nivel nivelProfessor, 
        Formacao formacaoProfessor, 
        List<String> disciplinas

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

        this.nivelProfessor = nivelProfessor;
        this.formacaoProfessor = formacaoProfessor;
        this.disciplinas = disciplinas;

    }

    public Nivel getNivelProfessor() {
        return nivelProfessor;
    }

    public void setNivelProfessor(Nivel nivelProfessor) {
        this.nivelProfessor = nivelProfessor;
    }

    public Formacao getFormacaoProfessor() {
        return formacaoProfessor;
    }

    public void setFormacaoProfessor(Formacao formacaoProfessor) {
        this.formacaoProfessor = formacaoProfessor;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    } 

    @Override
    public Double calcularSalario(){
        return null;
    }

    @Override
    public String getPrincipaisDados(){
        return super.getPrincipaisDados() + "\nNivel: " + nivelProfessor + "\nFormação: " + formacaoProfessor + "\nDisciplinas: " + disciplinas;
    }
}