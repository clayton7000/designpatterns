class NotificacaoBasica implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação básica: " + mensagem);
    }
}