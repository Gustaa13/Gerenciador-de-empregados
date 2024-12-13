package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;
import service.Funcionarios;

public abstract class Leitor {
    static Scanner leitor = new Scanner(System.in);
    
    public static int deInteiro(){

        if(leitor.hasNextInt()){
            int inteiro = leitor.nextInt();
            Leitor.limpar();

            return inteiro;
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deInteiro();
        }
    } 

    public static Long deLong(){
        
        if(leitor.hasNextLong()){
            Long numeroLongo = leitor.nextLong();
            Leitor.limpar();

            return numeroLongo;
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deLong();
        }
    }

    public static Double deDouble(){
        if(leitor.hasNextLong()){
            Double pontoFlutuante = leitor.nextDouble();
            Leitor.limpar();

            return pontoFlutuante;
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deDouble();
        }
    }

    public static Boolean deBoolean(){
        String booleano = leitor.nextLine().toUpperCase();

        switch (booleano) {
            case "SIM":
                return true;
            case "NÃO":
                return false;
            case "NAO":
                return false;
            default:
                System.out.print("\nResposta inválida! Digite sim ou não: ");
                return deBoolean();
        }
    }

    public static String deString(){
        return leitor.nextLine();
    }

    public static String deCPF(){
        String cpf = leitor.nextLine();

        if (cpf.matches("\\d{11}")) {
            return cpf;
        } else {
            System.out.print("\nCPF inválido! Digite exatamente 11 dígitos: ");
            return deCPF();
        }
    }

    public static String deCEP(){
        String cep = Leitor.deString();

            if (cep.matches("\\d{5}-\\d{3}")) {
                return cep;
            } else {
                System.out.print("\nCEP inválido! Use o formato XXXXX-XXX. Digite novamente: ");
                return deCEP();
            }
    }

    public static LocalDate deData(){
        String data = leitor.nextLine();

        try {
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(data, formatador);
        } catch (DateTimeParseException e) {
            System.out.print("\nData inválida! Use o formato dd/MM/yyyy: ");
            return deData();
        }
    }

    public static Long deMatricula(){
        Long matricula = Leitor.deLong();
        
        if(Funcionarios.buscarProfessorPorMatricula(matricula) != null || Funcionarios.buscarTecnicoADMPorMatricula(matricula) != null){
            System.out.print("Matrícula já existe! Digite uma matrícula diferente: ");
            return deMatricula();
        }else{
            return matricula;
        }
    }

    public static Genero deGenero(){
        String genero = leitor.nextLine().toUpperCase();

        switch (genero) {
            case "FEM":
                return Genero.FEM;
            case "MASC":
                return Genero.MASC;
            case "OUTRO":
                return Genero.OUTRO;
            default:
                System.out.print("\nGênero inválido! Escolha entre FEM, MASC ou OUTRO: ");
                return deGenero();
        }
    }

    public static Nivel deNivel(){
        String nivel = leitor.nextLine().toUpperCase();

        switch (nivel) {
            case "I":
                return Nivel.I;
            case "II":
                return Nivel.II;
            case "III":
                return Nivel.III;
            case "IV":
                return Nivel.IV;
            case "V":
                return Nivel.V;
            case "VI":
                return Nivel.VI;
            case "VII":
                return Nivel.VII;
            case "VIII":
                return Nivel.VIII;
            default:
                System.out.print("\nNível inválido! Escolha entre I, II, III, IV, V, VI, VII, VIII: ");
                return deNivel();
        }
    }

    public static Formacao deFormacao(){
        String formacao = leitor.nextLine().toUpperCase();

        switch (formacao) {
            case "ESPECIALIZACAO":
                return Formacao.ESPECIALIZACAO;
            case "MESTRADO":
                return Formacao.MESTRADO;
            case "DOUTORADO":
                return Formacao.DOUTORADO;
            default:
                System.out.print("\nFormação inválida! Escolha entre ESPECIALIZACAO, MESTRADO ou DOUTORADO: ");
                return deFormacao();
        }
    }

    public static void limpar(){
        leitor.nextLine();
    }

    public static void fechar(){
        leitor.close();
    }
}
