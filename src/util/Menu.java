package util;

public abstract class Menu {
    
    public static void menuPrincipal(){
        System.out.println("\n----- MENU PRINCIPAL -----\n");

        System.out.println("1 - Cadastrar funcionário");
        System.out.println("2 - Listar funcionário");
        System.out.println("3 - Deletar funcionário");
        System.out.println("4 - Buscar funcionário");
        System.out.println("5 - Sair do sistema\n");

        System.out.print("Digite o número de operação: ");
    }

    public static void menuCadastrar(){
        System.out.println("\n----- MENU CADASTRO -----\n");

        System.out.println("1 - Cadastrar professor");
        System.out.println("2 - Cadastrar técnico");
        System.out.println("3 - Voltar para o menu principal\n");

        System.out.print("Digite o número da operação: ");
    }

    public static void menuListar(){
        System.out.println("\n----- MENU LISTA -----\n");

        System.out.println("1 - Listar professores");
        System.out.println("2 - Listar técnicos");
        System.out.println("3 - Voltar para o menu principal\n");

        System.out.print("Digite o número da operação: ");
    }

    public static void menuDeletar(){
        System.out.println("\n----- MENU DELETE -----\n");

        System.out.println("1 - Deletar professor");
        System.out.println("2 - Deletar técnico");
        System.out.println("3 - Voltar para o menu principal\n");

        System.out.print("Digite o número da operação: ");
    }

    public static void menuBuscar(){
        System.out.println("\n----- MENU BUSCA -----\n");

        System.out.println("1 - Buscar professor");
        System.out.println("2 - Buscar técnico");
        System.out.println("3 - Voltar para o menu principal\n");

        System.out.print("Digite o número da operação: ");
    }
}
