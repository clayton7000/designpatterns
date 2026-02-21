public class Main {

    public static void main(String[] args) {

        ColecaoNomes colecao = new ColecaoNomes();

        colecao.adicionarNome("João");
        colecao.adicionarNome("Maria");
        colecao.adicionarNome("Pedro");

        Iterator<String> iterator = colecao.criarIterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }
    }
}