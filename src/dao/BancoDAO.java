package dao;

import java.util.ArrayList;

import model.Pessoa;

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
}