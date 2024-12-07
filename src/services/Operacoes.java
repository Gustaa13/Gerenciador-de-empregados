package services;

import java.util.ArrayList;

import dao.BancoDAO;
import model.Pessoa;
import model.Professor;
import model.TecnicoADM;


public abstract class Operacoes {
    
    private static BancoDAO banco = BancoDAO.getInstance();

    public static void cadastrarPessoa(Pessoa pessoa){
        if(pessoa != null){
            if(banco.buscarMatricula(pessoa.getMatricula()) == null){
                banco.getArrayPessoa().add(pessoa);
                System.out.println("Funcionário cadastrado com sucesso!");
            }else{
                System.out.println("Funcionário já cadastrado no banco de dados!");
            }  
        }else{
            System.out.println("Erro ao cadastrar funcionário!");
        }
    }

    public static void listarProfessores(){
        ArrayList<Professor> professores = banco.buscarProfessores();
        if(professores != null){
            for(Professor professor : professores){
                System.out.println("Nome: " + professor.getNome() + "\n");
                System.out.println("Formação: " + professor.getFormacaoProfessor() + "\n");
            }
        }
    }

    public static void listarTecnicosADM(){
        ArrayList<TecnicoADM> tecnicoADMs = banco.buscarTecnicosADM();
        if(tecnicoADMs != null){
            for(TecnicoADM tecnicoADM : tecnicoADMs){
                System.out.println("Nome: " + tecnicoADM.getNome() + "\n");
                System.out.println("Formação: " + tecnicoADM.getFormacaoTecnico() + "\n");
            }
        }
    }

    public static void deletarPessoa(Long matricula){
        if(banco.deletarMatricula(matricula)){
            System.out.println("Funcionario deletado com sucesso!");
        }else{
            System.out.println("Funcionario não encontrada no banco de dados!");
        }
    }

    public static void buscarPessoa(Long matricula){
        Pessoa pessoa = banco.buscarMatricula(matricula);
        if(pessoa != null){
            pessoa.exibir_principais_dados();
        }else{
            System.out.println("Pessoa não encontrada!");;
        }  
    }
}
