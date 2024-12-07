package dao;

import java.util.ArrayList;

import model.Pessoa;
import model.Professor;
import model.TecnicoADM;

public class BancoDAO {
    private ArrayList<Pessoa> funcionarios;

    public static BancoDAO banco;

    private BancoDAO(){
        funcionarios = new ArrayList<>();
    }
    
    public ArrayList<Pessoa> getArrayPessoa(){
        return this.funcionarios;
    }

    public static BancoDAO getInstance(){
        if (banco == null) {
            banco = new BancoDAO();
        }
        return banco;
    }

    public Pessoa buscarMatricula(Long matricula){
        for(Pessoa pessoa : banco.getArrayPessoa()){
            if(matricula == pessoa.getMatricula()){
                return pessoa;
            }
        }
        return null;
    }

    public Boolean deletarMatricula(Long matricula){
        Pessoa pessoa = buscarMatricula(matricula);
        if(pessoa != null){
            return banco.getArrayPessoa().remove(pessoa);
        }
        return false;
    }

    public ArrayList<Professor> buscarProfessores(){
        ArrayList<Professor> professores = new ArrayList<>();
        for(Pessoa pessoa : banco.getArrayPessoa()){
            if(pessoa instanceof Professor){
                professores.add((Professor)pessoa);
            }
        }
        return professores;
    }

    public ArrayList<TecnicoADM> buscarTecnicosADM(){
        ArrayList<TecnicoADM> tecnicoADMs = new ArrayList<>();
        for(Pessoa pessoa : banco.getArrayPessoa()){
            if(pessoa instanceof TecnicoADM){
                tecnicoADMs.add((TecnicoADM)pessoa);
            }
        }
        return tecnicoADMs;
    }
}