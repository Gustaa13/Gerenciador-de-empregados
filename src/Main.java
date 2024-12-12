import dao.PessoasDAO;
import util.ControladorDeMenu;
import util.Leitor;
import util.Menu;

public class Main {
    public static void main(String[] args) {
        int operacao = 0;
        PessoasDAO bancoDePessoas = PessoasDAO.getInstance();

        bancoDePessoas.carregarPessoasdeArquivo();

        do{
            Menu.menuPrincipal();
            operacao = Leitor.deInteiro();
            ControladorDeMenu.Principal(operacao);
        }while(operacao != 5);

        Leitor.fechar();
        bancoDePessoas.salvarPessoasParaArquivo();
    }
}