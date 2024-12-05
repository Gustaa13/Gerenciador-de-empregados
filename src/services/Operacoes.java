package services;

import dao.BancoDAO;
import model.Pessoa;
import model.Professor;


public class Operacoes {
    
    private static BancoDAO banco = BancoDAO.getInstance();

    public static void cadastrarProfessor(Professor professor){
        if(professor != null){
            if(buscarPessoa(professor) == null){
                banco.getArrayPessoa().add(professor);
                System.out.println("Professor cadastrado com sucesso!");
            }else{
                System.out.println("Professor já cadastrado!");
            }  
        }else{
            System.out.println("Erro ao cadastrar Professor!");
        }
    }

    public static void cadastrarTecnicoADM(){

    }

    public static void listarTecnicosADM(){

    }

    public static void deletarProfessor(Long matricula){

    }

    public static void deletarTecnicoADM(Long matricula){

    }

    public static Pessoa buscarPessoa(Pessoa pessoa){
        return banco.buscarMatricula(pessoa.getMatricula());
    }
}
