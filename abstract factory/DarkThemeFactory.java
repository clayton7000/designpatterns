public class DarkThemeFactory implements TemaFactory {

    public Botao criarBotao() {
        return new BotaoDark();
    }

    public Texto criarTexto() {
        return new TextoDark();
    }
}
