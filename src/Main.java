/*import java.time.LocalDate;
import java.util.Arrays;

import model.classes.Endereco;
import model.classes.Professor;
import model.classes.TecnicoADM;
import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import service.Funcionarios;*/
import util.ControladorDeMenu;
import util.Leitor;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        int operacao = 0;

        /*Professor professor = new Professor(
            "Gustavo", 
            "99999999999", 
            LocalDate.of(2002, 11, 13), 
            Genero.MASC, 
            new Endereco(), 
            Long.valueOf(2), 
            "BioME", 
            Integer.valueOf(20), 
            LocalDate.of(2024, 11, 1), 
            Nivel.I, 
            Formacao.ESPECIALIZACAO, 
            Arrays.asList("Lp2", "Web1")
        );
        Funcionarios.adicionarProfessor(professor);

        Professor professor2 = new Professor(
            "Gustavo", 
            "99999999999", 
            LocalDate.of(2002, 11, 13), 
            Genero.MASC, 
            new Endereco(), 
            Long.valueOf(3), 
            "BioME", 
            Integer.valueOf(20), 
            LocalDate.of(2024, 11, 1), 
            Nivel.I, 
            Formacao.ESPECIALIZACAO, 
            Arrays.asList("Lp2", "Web1")
        );
        Funcionarios.adicionarProfessor(professor2);

        TecnicoADM tecnicoADM = new TecnicoADM(
            "Gustavo", 
            "99999999999", 
            LocalDate.of(2002, 11, 13), 
            Genero.MASC, 
            new Endereco(), 
            Long.valueOf(4), 
            "BioME", 
            Integer.valueOf(20), 
            LocalDate.of(2024, 11, 1), 
            Nivel.I, 
            Formacao.ESPECIALIZACAO, 
            true,
            true
        );
        Funcionarios.adicionarTecnicoADM(tecnicoADM);

        TecnicoADM tecnicoADM2 = new TecnicoADM(
            "Gustavo", 
            "99999999999", 
            LocalDate.of(2002, 11, 13), 
            Genero.MASC, 
            new Endereco(), 
            Long.valueOf(5), 
            "BioME", 
            Integer.valueOf(20), 
            LocalDate.of(2024, 11, 1), 
            Nivel.I, 
            Formacao.ESPECIALIZACAO, 
            true,
            true
        );
        Funcionarios.adicionarTecnicoADM(tecnicoADM2);*/

        do{
            Menu.menuPrincipal();
            operacao = Leitor.deInteiro();
            ControladorDeMenu.Principal(operacao);
        }while(operacao != 5);

        Leitor.fechar();
    }
}