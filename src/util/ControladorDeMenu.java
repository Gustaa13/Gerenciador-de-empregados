package util;

import model.classes.Professor;
import model.classes.TecnicoADM;
import service.Funcionarios;

public abstract class ControladorDeMenu {
    
    public static void Principal(int operacao){

        switch (operacao) {
            case 1: 
                do{
                    Menu.menuCadastrar(); 
                    operacao = Leitor.deInteiro();
                    ControladorDeMenu.Cadastro(operacao);
                }while(operacao != 3);
            break;
            case 2: 
                do{
                    Menu.menuListar(); 
                    operacao = Leitor.deInteiro();
                    ControladorDeMenu.Lista(operacao);
                }while(operacao != 3);
            break;
            case 3: 
                do{
                    Menu.menuDeletar(); 
                    operacao = Leitor.deInteiro();
                    ControladorDeMenu.Delete(operacao);
                }while(operacao != 3);
            break;
            case 4: 
                do{
                    Menu.menuBuscar(); 
                    operacao = Leitor.deInteiro();
                    ControladorDeMenu.Busca(operacao);
                }while(operacao != 3);  
            break;
            case 5: break;
            default: 
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void Cadastro(int operacao){

        switch (operacao) {
            case 1:
                Professor professor = LerClasse.professor();
                Funcionarios.adicionarProfessor(professor);
                System.out.println("Professor adicionado com sucesso!");
            break;
            case 2:
                TecnicoADM tecnicoADM = LerClasse.tecnicoADM();
                Funcionarios.adicionarTecnicoADM(tecnicoADM);
                System.out.println("Técnico adicionado com sucesso!");
            break;
            case 3: break;
            default:
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void Lista(int operacao){

        switch (operacao) {
            case 1:
                if(Funcionarios.listarProfessores() == null){
                    System.out.println("\nNenhum professor encontrado!\n");
                    return;
                }else{
                    System.out.println("\n---- Professores ----");
                    for(Professor professor : Funcionarios.listarProfessores()){
                        System.out.println(professor.getPrincipaisDados());
                    }
                }  
            break;
            case 2:
                if(Funcionarios.listarTecnicosADMs() == null){
                    System.out.println("\nNenhum técnico encontrado!\n");
                    return;
                }else{
                    System.out.println("\n---- Técnicos ----");
                    for(TecnicoADM tecnicoADM : Funcionarios.listarTecnicosADMs()){
                        System.out.println(tecnicoADM.getPrincipaisDados());
                    }
                }
            break;
            case 3: break;
            default:
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void Delete(int operacao){
        Long matricula;

        switch (operacao) {
            case 1:
                System.out.print("\nDigite a matrícula do professor: ");
                matricula = Leitor.deLong();

                if (Funcionarios.buscarProfessorPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para professor não existe!");
                }else{
                    Funcionarios.removerProfessor(Funcionarios.buscarProfessorPorMatricula(matricula));
                    System.out.println("\nProfessor removido!");
                }
            break;
            case 2:
                System.out.print("\nDigite a matrícula do tecnico: ");
                matricula = Leitor.deLong();

                if (Funcionarios.buscarTecnicoADMPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para técnico não existe!");
                }else{
                    Funcionarios.removerTecnicosADM(Funcionarios.buscarTecnicoADMPorMatricula(matricula));
                    System.out.println("\nTécnico removido!");
                }
            break;
            case 3: break;
            default:
                System.out.println("\nNúmero de operação inválido!\n"); 
            break;
        }
    }

    private static void Busca(int operacao){
        Long matricula;

        switch (operacao) {
            case 1:
                System.out.print("Digite a matrícula do professor: ");
                matricula = Leitor.deLong();

                if (Funcionarios.buscarProfessorPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para professor não existe!");
                }else{
                    System.out.println("\n---- Professor ----");
                    System.out.println(Funcionarios.buscarProfessorPorMatricula(matricula).getPrincipaisDados());
                }
            break;
            case 2:
                System.out.print("Digite a matrícula do técnico: ");
                matricula = Leitor.deLong();

                if (Funcionarios.buscarTecnicoADMPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para técnico não existe!");
                }else{
                    System.out.println("\n---- Tecnico ----");
                    System.out.println(Funcionarios.buscarTecnicoADMPorMatricula(matricula).getPrincipaisDados());
                }
            break;
            case 3: break;
            default:
                System.out.println("\nNúmero de operação inválido!\n"); 
            break;
        }
    }
}
