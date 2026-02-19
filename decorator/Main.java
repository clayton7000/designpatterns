public class Main {

    public static void main(String[] args) {

        Notificacao notificacao = new NotificacaoBasica();

        // adiciona Email
        notificacao = new EmailDecorator(notificacao);

        // adiciona SMS
        notificacao = new SMSDecorator(notificacao);

        notificacao.enviar("Sistema atualizado!");
    }
}