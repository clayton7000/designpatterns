public class Main {
    public static void main(String[] args) {

        Notificacao notificacao = NotificacaoFactory.criarNotificacao(TipoNotificacao.EMAIL);
        notificacao.enviar("Bem-vindo ao sistema!");

        notificacao = NotificacaoFactory.criarNotificacao(TipoNotificacao.SMS);
        notificacao.enviar("Seu código é 1234");
    }
}
