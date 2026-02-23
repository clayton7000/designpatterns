class Pagamento {

    private EstrategiaPagamento estrategia;

    public void setEstrategia(EstrategiaPagamento estrategia) {
        this.estrategia = estrategia;
    }

    public void realizarPagamento(double valor) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia definida");
            return;
        }
        estrategia.pagar(valor);
    }
}