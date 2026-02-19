class LojaFacade {

    private Estoque estoque;
    private Pagamento pagamento;
    private Envio envio;

    public LojaFacade() {
        this.estoque = new Estoque();
        this.pagamento = new Pagamento();
        this.envio = new Envio();
    }

    public void comprarProduto(String produto) {

        System.out.println("Iniciando compra...");

        if (estoque.verificarProduto(produto)) {

            pagamento.realizarPagamento(produto);
            envio.enviarProduto(produto);

            System.out.println("Compra finalizada com sucesso!");
        }
    }
}