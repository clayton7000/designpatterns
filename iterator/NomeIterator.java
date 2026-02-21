import java.util.List;

class NomeIterator implements Iterator<String> {

    private List<String> nomes;
    private int posicao = 0;

    public NomeIterator(List<String> nomes) {
        this.nomes = nomes;
    }

    @Override
    public boolean hasNext() {
        return posicao < nomes.size();
    }

    @Override
    public String next() {
        return nomes.get(posicao++);
    }
}