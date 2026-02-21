class UsuarioChat extends Usuario {

    public UsuarioChat(Mediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(nome + " enviou: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu: " + mensagem);
    }
}