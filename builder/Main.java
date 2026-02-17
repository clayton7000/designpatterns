public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario.Builder("Clayton", "clayton@email.com")
                .telefone("79 99999-9999")
                .endereco("Aracaju - SE")
                .idade(30)
                .build();

        usuario.exibir();
    }
}
