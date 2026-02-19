import java.util.ArrayList;
import java.util.List;

class Pasta implements ArquivoSistema {

    private String nome;
    private List<ArquivoSistema> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ArquivoSistema item) {
        itens.add(item);
    }

    public void remover(ArquivoSistema item) {
        itens.remove(item);
    }

    @Override
    public void mostrar(String indentacao) {

        System.out.println(indentacao + "+ Pasta: " + nome);

        for (ArquivoSistema item : itens) {
            item.mostrar(indentacao + "   ");
        }
    }

    @Override
    public int getTamanho() {

        int total = 0;

        for (ArquivoSistema item : itens) {
            total += item.getTamanho();
        }

        return total;
    }
}