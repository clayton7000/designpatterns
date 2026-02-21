abstract class Aprovador {
    protected Aprovador proximo;

    // Define o próximo da cadeia
    public void setProximo(Aprovador proximo) {
        this.proximo = proximo;
    }

    // Método principal
    public abstract void aprovar(double valor);
}