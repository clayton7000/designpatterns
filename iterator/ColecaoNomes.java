import java.util.ArrayList;
import java.util.List;

class ColecaoNomes implements Colecao<String> {

    private List<String> nomes = new ArrayList<>();

    public void adicionarNome(String nome) {
        nomes.add(nome);
    }

    @Override
    public Iterator<String> criarIterator() {
        return new NomeIterator(nomes);
    }
}