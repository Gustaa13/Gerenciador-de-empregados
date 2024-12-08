import java.time.LocalDate;
import java.util.Arrays;

import model.classes.Endereco;
import model.classes.Professor;
import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import service.Funcionarios;
import util.Controlador;
import util.Leitor;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        int operacao = 0;
    
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
        
        do{
            Menu.menuPrincipal();
            operacao = Leitor.DeInteiro();
            Controlador.controladorMenuPrincipal(operacao);
        }while(operacao != 5);

        Leitor.Fechar();
    }
}