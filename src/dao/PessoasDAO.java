package dao;

import java.util.ArrayList;

import model.classes.Pessoa;

public class PessoasDAO{
    private ArrayList<Pessoa> pessoas;

    public static PessoasDAO bancoDePessoas;

    private PessoasDAO(){
        pessoas = new ArrayList<>();
    }
    
    public ArrayList<Pessoa> getPessoas(){
        return this.pessoas;
    }

    public static PessoasDAO getInstance(){
        if (bancoDePessoas == null) {
            bancoDePessoas = new PessoasDAO();
        }
        return bancoDePessoas;
    }

    public void adicionarPessoa(Pessoa pessoa){
        if(!bancoDePessoas.getPessoas().contains(pessoa)){
            bancoDePessoas.getPessoas().add(pessoa);
        }
    }

    public void removerPessoa(Pessoa pessoa){
        if(bancoDePessoas.getPessoas().contains(pessoa)){
            bancoDePessoas.getPessoas().remove(pessoa);
        }
    }
}