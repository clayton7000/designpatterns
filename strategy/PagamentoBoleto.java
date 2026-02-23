class PagamentoBoleto implements EstrategiaPagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pago R$ " + valor + " com Boleto");
    }
}