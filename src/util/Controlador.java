package util;

import model.classes.Professor;
import model.classes.TecnicoADM;
import service.Funcionarios;

public abstract class Controlador {
    
    public static void controladorMenuPrincipal(int operacao){

        switch (operacao) {
            case 1: 
                do{
                    Menu.menuCadastrar(); 
                    operacao = Leitor.DeInteiro();
                    Controlador.controladorMenuCadastro(operacao);
                }while(operacao != 3);
            break;
            case 2: 
                do{
                    Menu.menuListar(); 
                    operacao = Leitor.DeInteiro();
                    Controlador.controladorMenuLista(operacao);
                }while(operacao != 3);
            break;
            case 3: 
                do{
                    Menu.menuDeletar(); 
                    operacao = Leitor.DeInteiro();
                    Controlador.controladorMenuDelete(operacao);
                }while(operacao != 3);
            break;
            case 4: 
                do{
                    Menu.menuBuscar(); 
                    operacao = Leitor.DeInteiro();
                    Controlador.controladorMenuBusca(operacao);
                }while(operacao != 3);  
            break;
            case 5: break;
            default: 
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void controladorMenuCadastro(int operacao){

        switch (operacao) {
            case 1:
                
            break;
            case 2:
                
            break;
            case 3: break;
            default:
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void controladorMenuLista(int operacao){

        switch (operacao) {
            case 1:
                if(Funcionarios.listarProfessores() == null){
                    System.out.println("\nNenhum professor encontrado!\n");
                    return;
                }else{
                    System.out.println("\n---- Professores ----\n");
                    for(Professor professor : Funcionarios.listarProfessores()){
                        System.out.println(professor.getNome() + "\n");
                    }
                }  
            break;
            case 2:
                if(Funcionarios.listarTecnicosADMs() == null){
                    System.out.println("\nNenhum técnico encontrado!\n");
                    return;
                }else{
                    System.out.println("\n---- Técnicos ----\n");
                    for(TecnicoADM tecnicoADM : Funcionarios.listarTecnicosADMs()){
                        System.out.println(tecnicoADM.getNome() + "\n");
                    }
                }
            break;
            case 3: break;
            default:
                System.out.println("Número de operação inválido!\n"); 
            break;
        }
    }

    private static void controladorMenuDelete(int operacao){
        Long matricula;

        switch (operacao) {
            case 1:
                System.out.print("\nDigite a matrícula do professor: ");
                matricula = Leitor.DeLong();

                if (Funcionarios.buscarProfessorPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para professor não existe!");
                }else{
                    Funcionarios.removerProfessor(Funcionarios.buscarProfessorPorMatricula(matricula));
                    System.out.println("\nProfessor removido!");
                }
            break;
            case 2:
                System.out.print("\nDigite a matrícula do tecnico: ");
                matricula = Leitor.DeLong();

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

    private static void controladorMenuBusca(int operacao){
        Long matricula;

        switch (operacao) {
            case 1:
                System.out.print("Digite a matrícula do professor: ");
                matricula = Leitor.DeLong();

                if (Funcionarios.buscarProfessorPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para professor não existe!");
                }else{
                    System.out.println("\nO professor é: " + Funcionarios.buscarProfessorPorMatricula(matricula).getNome() + "\n");
                }
            break;
            case 2:
                System.out.print("\nDigite a matrícula do técnico: ");
                matricula = Leitor.DeLong();

                if (Funcionarios.buscarTecnicoADMPorMatricula(matricula) == null) {
                    System.out.println("\nMatrícula para técnico não existe!");
                }else{
                    System.out.println("\nO técnico é: " + Funcionarios.buscarTecnicoADMPorMatricula(matricula).getNome() + "\n");
                }
            break;
            case 3: break;
            default:
                System.out.println("\nNúmero de operação inválido!\n"); 
            break;
        }
    }
}
