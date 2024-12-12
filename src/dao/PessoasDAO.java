package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.classes.Pessoa;

public class PessoasDAO{
    private ArrayList<Pessoa> pessoas;

    public static PessoasDAO bancoDePessoas;

    private static final String ARQUIVO_PESSOAS = "database/pessoas.bin";

    private PessoasDAO(){
        pessoas = new ArrayList<>();
    }
    
    public ArrayList<Pessoa> getPessoas(){
        return this.pessoas;
    }

    public static PessoasDAO getInstance(){
        if (bancoDePessoas == null) {
            bancoDePessoas = new PessoasDAO();
        }
        return bancoDePessoas;
    }

    public void adicionarPessoa(Pessoa pessoa){
        if(!bancoDePessoas.getPessoas().contains(pessoa)){
            bancoDePessoas.getPessoas().add(pessoa);
        }
    }

    public void removerPessoa(Pessoa pessoa){
        if(bancoDePessoas.getPessoas().contains(pessoa)){
            bancoDePessoas.getPessoas().remove(pessoa);
        }
    }

    public void carregarPessoasdeArquivo(){
        File arquivo = new File(ARQUIVO_PESSOAS);

        if(arquivo.exists() && arquivo.length() > 0){

            try(ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(ARQUIVO_PESSOAS))){
                Object objeto = entrada.readObject();
    
                if(objeto instanceof ArrayList<?>){
                    ArrayList<?> listaTemp = (ArrayList<?>) objeto;
    
                    if(!listaTemp.isEmpty() && listaTemp.get(0) instanceof Pessoa){
                        @SuppressWarnings("unchecked")
                        ArrayList<Pessoa> pessoasCarregados = (ArrayList<Pessoa>) listaTemp;
                        bancoDePessoas.getPessoas().clear();
                        bancoDePessoas.getPessoas().addAll(pessoasCarregados);
                    }
                }

            }catch(IOException | ClassNotFoundException e){

                e.printStackTrace();
                System.out.println("Erro ao carregar o banco de pessoas.");

            }
        }else if(!arquivo.exists()){
            try {
                arquivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Erro ao criar o arquivo.");
            }
        }
    }

    public void salvarPessoasParaArquivo(){
        try(ObjectOutputStream saida = new ObjectOutputStream(new FileOutputStream(ARQUIVO_PESSOAS))){

            saida.writeObject(bancoDePessoas.getPessoas());

        }catch(IOException e){

            e.printStackTrace();
            System.out.println("Erro ao salvar o banco de pessoas");

        }
    }
}