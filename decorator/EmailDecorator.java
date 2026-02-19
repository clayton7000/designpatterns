class EmailDecorator extends NotificacaoDecorator {

    public EmailDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        enviarEmail(mensagem);
    }

    private void enviarEmail(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }
}