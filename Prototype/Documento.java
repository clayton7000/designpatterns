public class Documento implements Prototype<Documento> {

    private String titulo;
    private String conteudo;
    private boolean assinado;

    public Documento(String titulo, String conteudo, boolean assinado) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.assinado = assinado;
    }

    // 🔁 Clone
    @Override
    public Documento clone() {
        return new Documento(this.titulo, this.conteudo, this.assinado);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibir() {
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + conteudo);
        System.out.println("Assinado: " + assinado);
        System.out.println("-------------------");
    }
}
