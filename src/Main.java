import util.Controlador;
import util.Leitor;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        int operacao = 0;
        
        do{
            Menu.menuPrincipal();
            operacao = Leitor.deInteiro();
            Controlador.controladorMenuPrincipal(operacao);
        }while(operacao != 5);

        Leitor.fechar();
    }
}