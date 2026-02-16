public class NotificacaoFactory {
     public static Notificacao criarNotificacao(TipoNotificacao tipo) {

        switch (tipo) {
            case EMAIL:
                return new EmailNotificacao();
            case SMS:
                return new SmsNotificacao();
            case PUSH:
                return new PushNotificacao();
            default:
                throw new IllegalArgumentException("Tipo desconhecido");
        }
    }
}
