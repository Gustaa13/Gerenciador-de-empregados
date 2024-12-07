import java.time.LocalDate;
import java.util.Arrays;

import model.classes.Endereco;
import model.classes.Professor;
import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import service.Funcionarios;

public class Main {
    public static void main(String[] args) {
    
        Professor professor = new Professor(
            "Gustavo", 
            "70259993425", 
            LocalDate.of(2002, 11, 13), 
            Genero.masc, 
            new Endereco(), 
            Long.valueOf(2), 
            Double.valueOf(700), 
            "BioME", 
            Integer.valueOf(20), 
            LocalDate.of(2024, 11, 1), 
            Nivel.I, 
            Formacao.especializacao, 
            Arrays.asList("Lp2", "Web1")
        );

        Funcionarios.adicionarProfessor(professor);
        for(Professor prof : Funcionarios.listarProfessores()){
            System.out.println("\nOs professores são: " + prof.getNome() + "\n");
        }

        System.out.println("\nO professor é: " + Funcionarios.buscarProfessorPorMatricula(Long.valueOf(2)).getNome() + "\n");
        
        Funcionarios.removerProfessor(professor);

        System.out.println("\nO professor é: " + Funcionarios.buscarProfessorPorMatricula(Long.valueOf(2)) + "\n");
    }
}
