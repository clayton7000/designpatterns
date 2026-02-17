public class Main {
    public static void main(String[] args) {

        ConfiguracaoSistema c1 = ConfiguracaoSistema.getInstancia();
        ConfiguracaoSistema c2 = ConfiguracaoSistema.getInstancia();

        c1.exibirAmbiente();

        // Teste: ambas referências apontam para o mesmo objeto
        System.out.println(c1 == c2); // true
    }
}
