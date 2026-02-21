public class Main {

    public static void main(String[] args) {

        Mediator chat = new ChatMediator();

        Usuario usuario1 = new UsuarioChat(chat, "João");
        Usuario usuario2 = new UsuarioChat(chat, "Maria");
        Usuario usuario3 = new UsuarioChat(chat, "Pedro");

        chat.adicionarUsuario(usuario1);
        chat.adicionarUsuario(usuario2);
        chat.adicionarUsuario(usuario3);

        usuario1.enviar("Olá pessoal!");
    }
}