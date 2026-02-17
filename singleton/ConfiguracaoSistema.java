public class ConfiguracaoSistema {

    // Instância única (criada sob demanda)
    private static ConfiguracaoSistema instancia;

    // Construtor privado → impede new externo
    private ConfiguracaoSistema() {
        System.out.println("Configuração do sistema iniciada.");
    }

    // Método global de acesso
    public static ConfiguracaoSistema getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoSistema();
        }
        return instancia;
    }

    // Exemplo de método da classe
    public void exibirAmbiente() {
        System.out.println("Ambiente: Produção");
    }
}
