public class Main {

    public static void main(String[] args) {

        // Criar os aprovadores
        Aprovador supervisor = new Supervisor();
        Aprovador gerente = new Gerente();
        Aprovador diretor = new Diretor();

        // Montar a cadeia
        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        // Testar solicitações
        supervisor.aprovar(500);
        supervisor.aprovar(3000);
        supervisor.aprovar(10000);
        supervisor.aprovar(50000);
    }
}