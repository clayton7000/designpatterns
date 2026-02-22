public class Main {

    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.escrever("Versão 1");
        historico.salvar(editor.salvar());

        editor.escrever("Versão 2");
        historico.salvar(editor.salvar());

        editor.escrever("Versão 3");

        System.out.println("Atual: " + editor.getTexto());

        // desfazer
        editor.restaurar(historico.desfazer());
        System.out.println("Desfazer 1: " + editor.getTexto());

        editor.restaurar(historico.desfazer());
        System.out.println("Desfazer 2: " + editor.getTexto());
    }
}