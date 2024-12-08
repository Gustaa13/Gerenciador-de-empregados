package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.enums.Formacao;
import model.enums.Genero;
import model.enums.Nivel;

public abstract class Leitor {
    static Scanner leitor = new Scanner(System.in);
    
    public static int deInteiro(){

        if(leitor.hasNextInt()){
            return leitor.nextInt();
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deInteiro();
        }
    } 

    public static Long deLong(){
        
        if(leitor.hasNextLong()){
            return leitor.nextLong();
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deLong();
        }
    }

    public static Double deDouble(){
        if(leitor.hasNextLong()){
            return leitor.nextDouble();
        }else{
            Leitor.limpar();
            System.out.print("\nNúmero inválido! Digite novamente: ");
            return deDouble();
        }
    }

    public static String deString(){
        return leitor.nextLine();
    }

    public static String deCPF(){
        String cpf = leitor.next().trim();

        if (cpf.matches("\\d{11}")) {
            return cpf;
        } else {
            Leitor.limpar();
            System.out.println("\nCPF inválido! Digite exatamente 11 dígitos: ");
            return deCPF();
        }
    }

    public static LocalDate deData(){
        String data = leitor.nextLine();

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(data, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("\nData inválida! Use o formato dd/MM/yyyy: ");
            return deData();
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
                System.out.println("\nGênero inválido! Escolha entre FEM, MASC ou OUTRO: ");
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
                System.out.println("\nNível inválido! Escolha entre I, II, III, IV, V, VI, VII, VIII: ");
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
                System.out.println("\nFormação inválida! Escolha entre ESPECIALIZACAO, MESTRADO ou DOUTORADO: ");
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
