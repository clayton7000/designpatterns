class EditorTexto {

    private String texto;

    public void escrever(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    // salva o estado
    public Memento salvar() {
        return new Memento(texto);
    }

    // restaura o estado
    public void restaurar(Memento memento) {
        this.texto = memento.getEstado();
    }
}