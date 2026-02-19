class Arquivo implements ArquivoSistema {

    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    @Override
    public void mostrar(String indentacao) {
        System.out.println(indentacao + "- Arquivo: " + nome + 
                           " (" + tamanho + "kb)");
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }
}