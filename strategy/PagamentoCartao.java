class PagamentoCartao implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pago R$ " + valor + " com Cartão de Crédito");
    }
}