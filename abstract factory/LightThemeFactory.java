public class LightThemeFactory implements TemaFactory {

    public Botao criarBotao() {
        return new BotaoLight();
    }

    public Texto criarTexto() {
        return new TextoLight();
    }
}
