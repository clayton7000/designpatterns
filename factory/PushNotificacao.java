public class PushNotificacao implements Notificacao{
    public void enviar(String mensagem) {
        System.out.println("Enviando PUSH: " + mensagem);
    }
}
