public class Main {
    public static void main(String[] args) {

        TemaFactory factory;

        String tema = "dark";

        if (tema.equalsIgnoreCase("dark")) {
            factory = new DarkThemeFactory();
        } else {
            factory = new LightThemeFactory();
        }

        Botao botao = factory.criarBotao();
        Texto texto = factory.criarTexto();

        botao.render();
        texto.render();
    }
}
