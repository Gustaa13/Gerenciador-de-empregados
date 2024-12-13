package service;

import java.util.ArrayList;

import dao.PessoasDAO;
import model.classes.Pessoa;
import model.classes.Professor;
import model.classes.TecnicoADM;

public class Funcionarios {

    public static void adicionarProfessor(Professor professor){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        bancoDePessoas.adicionarPessoa(professor);
    }

    public static ArrayList<Professor> listarProfessores(){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        ArrayList<Professor> professores = new ArrayList<>();

        for(Pessoa pessoa : bancoDePessoas.getPessoas()){
            if(pessoa instanceof Professor){
                professores.add((Professor)pessoa);
            }
        }
        return professores;
    }

    public static void removerProfessor(Professor professor){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        bancoDePessoas.removerPessoa(professor);
    }

    public static Professor buscarProfessorPorMatricula(Long matricula){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        
        for(Pessoa pessoa : bancoDePessoas.getPessoas()){
            if((matricula.equals(pessoa.getMatricula())) && pessoa instanceof Professor){
                return (Professor)pessoa;
            }
        }
        return null;
    }

    public static void adicionarTecnicoADM(TecnicoADM tecnicoADM){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        bancoDePessoas.adicionarPessoa(tecnicoADM);
    }

    public static ArrayList<TecnicoADM> listarTecnicosADMs(){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        ArrayList<TecnicoADM> tecnicoADMs = new ArrayList<>();

        for(Pessoa pessoa : bancoDePessoas.getPessoas()){
            if(pessoa instanceof TecnicoADM){
                tecnicoADMs.add((TecnicoADM)pessoa);
            }
        }
        return tecnicoADMs;
    }

    public static void removerTecnicosADM(TecnicoADM tecnicoADM){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        bancoDePessoas.removerPessoa(tecnicoADM);
    }

    public static TecnicoADM buscarTecnicoADMPorMatricula(Long matricula){
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();
        
        for(Pessoa pessoa : bancoDePessoas.getPessoas()){
            if((matricula.equals(pessoa.getMatricula())) && pessoa instanceof TecnicoADM){
                return (TecnicoADM)pessoa;
            }
        }
        return null;
    }
}
