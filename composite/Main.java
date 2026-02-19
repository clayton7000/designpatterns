public class Main {

    public static void main(String[] args) {

        Arquivo arquivo1 = new Arquivo("foto.jpg", 100);
        Arquivo arquivo2 = new Arquivo("video.mp4", 500);
        Arquivo arquivo3 = new Arquivo("documento.pdf", 50);

        Pasta pastaDocumentos = new Pasta("Documentos");
        pastaDocumentos.adicionar(arquivo3);

        Pasta pastaMidia = new Pasta("Midia");
        pastaMidia.adicionar(arquivo1);
        pastaMidia.adicionar(arquivo2);

        Pasta pastaRaiz = new Pasta("Raiz");

        pastaRaiz.adicionar(pastaDocumentos);
        pastaRaiz.adicionar(pastaMidia);

        pastaRaiz.mostrar("");

        System.out.println("\nTamanho total: " + pastaRaiz.getTamanho() + "kb");
    }
}