public class Usuario {

    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private Integer idade;

    // Construtor privado → só o Builder cria
    private Usuario(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.telefone = builder.telefone;
        this.endereco = builder.endereco;
        this.idade = builder.idade;
    }

    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Idade: " + idade);
    }

    // 🏗️ Builder
    public static class Builder {
        private String nome;
        private String email;
        private String telefone;
        private String endereco;
        private Integer idade;

        public Builder(String nome, String email) {
            this.nome = nome;
            this.email = email;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public Builder idade(Integer idade) {
            this.idade = idade;
            return this;
        }

        public Usuario build() {
            return new Usuario(this);
        }
    }
}
