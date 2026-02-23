public class Main {

    public static void main(String[] args) {

        EstacaoTemperatura estacao = new EstacaoTemperatura();

        Observer celular1 = new DisplayCelular("Celular João");
        Observer celular2 = new DisplayCelular("Celular Maria");

        estacao.adicionarObserver(celular1);
        estacao.adicionarObserver(celular2);

        estacao.setTemperatura(25.5f);
        estacao.setTemperatura(30.0f);
    }
}