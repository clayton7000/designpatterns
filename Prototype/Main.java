public class Main {
    public static void main(String[] args) {

        // Documento original (template)
        Documento modelo = new Documento(
                "Relatório Padrão",
                "Conteúdo base do relatório...",
                false
        );

        // Clonando
        Documento doc1 = modelo.clone();
        doc1.setTitulo("Relatório Financeiro");

        Documento doc2 = modelo.clone();
        doc2.setTitulo("Relatório RH");

        // Exibir
        modelo.exibir();
        doc1.exibir();
        doc2.exibir();
    }
}
