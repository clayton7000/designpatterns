class SMSDecorator extends NotificacaoDecorator {

    public SMSDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        enviarSMS(mensagem);
    }

    private void enviarSMS(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}