package util;

import java.time.LocalDate;
import java.util.ArrayList;

import model.classes.Endereco;
import model.classes.Professor;
import model.classes.TecnicoADM;
import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;

public abstract class LerClasse {
    
    public static Professor professor(){

        System.out.print("Digite o nome: ");
        String nome = Leitor.deString();

        System.out.print("Digite o CPF (apenas números): ");
        String cpf = Leitor.deCPF();

        System.out.print("Digite a data (formato dd/MM/yyyy): ");
        LocalDate dataNascimento = Leitor.deData();

        System.out.print("Digite o gênero (FEM, MASC, OUTRO): ");
        Genero genero = Leitor.deGenero();

        Endereco endereco = LerClasse.endereco();

        System.out.print("Digite a matricula: ");
        Long matricula = Leitor.deMatricula();

        System.out.print("Digite o departamento: ");
        String departamento = Leitor.deString();

        System.out.print("Digite a carga horária: ");
        Integer cargaHoraria = Leitor.deInteiro();

        System.out.print("Digite a data de ingresso (formato dd/MM/yyyy):: ");
        LocalDate dataIngresso = Leitor.deData();

        System.out.print("Digite o nível (I, II, III, IV, V, VI, VII, VIII): ");
        Nivel nivel = Leitor.deNivel();

        System.out.print("Digite a formação (ESPECIALIZACAO, MESTRADO, DOUTORADO): ");
        Formacao formacao = Leitor.deFormacao();

        ArrayList<String> disciplinas = disciplinas();
        
        return new Professor(nome, cpf, dataNascimento, genero, endereco, matricula, departamento, cargaHoraria, dataIngresso, nivel, formacao, disciplinas);
    }

    public static TecnicoADM tecnicoADM(){

        System.out.print("Digite o nome: ");
        String nome = Leitor.deString();

        System.out.print("Digite o CPF (apenas números): ");
        String cpf = Leitor.deCPF();

        System.out.print("Digite a data (formato dd/MM/yyyy): ");
        LocalDate dataNascimento = Leitor.deData();

        System.out.print("Digite o gênero (FEM, MASC, OUTRO): ");
        Genero genero = Leitor.deGenero();

        Endereco endereco = LerClasse.endereco();

        System.out.print("Digite a matricula: ");
        Long matricula = Leitor.deMatricula();

        System.out.print("Digite o departamento: ");
        String departamento = Leitor.deString();

        System.out.print("Digite a carga horária: ");
        Integer cargaHoraria = Leitor.deInteiro();

        System.out.print("Digite a data de ingresso (formato dd/MM/yyyy):: ");
        LocalDate dataIngresso = Leitor.deData();

        System.out.print("Digite o nível (I, II, III, IV, V, VI, VII, VIII): ");
        Nivel nivel = Leitor.deNivel();

        System.out.print("Digite a formação (ESPECIALIZACAO, MESTRADO, DOUTORADO): ");
        Formacao formacao = Leitor.deFormacao();

        System.out.println("Digite se é insalubre (Sim ou não): ");
        Boolean insalubridade = Leitor.deBoolean();

        System.out.println("Digite se é gratificado (Sim ou não): ");
        Boolean gratificado = Leitor.deBoolean();
        
        return new TecnicoADM(nome, cpf, dataNascimento, genero, endereco, matricula, departamento, cargaHoraria, dataIngresso, nivel, formacao, insalubridade, gratificado);
    }

    private static Endereco endereco(){

        System.out.print("Digite a rua: ");
        String rua = Leitor.deString();

        System.out.print("Digite o número: ");
        Integer numero = Leitor.deInteiro();

        System.out.print("Digite o bairro: ");
        String bairro = Leitor.deString();

        System.out.print("Digite a cidade: ");
        String cidade = Leitor.deString();

        System.out.print("Digite o CEP (apenas números, formato XXXXX-XXX): ");
        String cep = Leitor.deCEP();

        return new Endereco(rua, numero, bairro, cidade, cep);
    }

    private static ArrayList<String> disciplinas(){
        int quantidade_de_disciplinas = 0;
        ArrayList<String> disciplinas = new ArrayList<>();
        
        System.out.print("Quantidade de disciplinas: ");
        quantidade_de_disciplinas = Leitor.deInteiro();

        for(int i = 0; i < quantidade_de_disciplinas; i++){
            System.out.print("Digite o nome da disciplina: ");
            disciplinas.add(Leitor.deString());
        }

        return disciplinas;
    }
}
