public class PagamentoAdapter implements Pagamento {

    private PagamentoLegado pagamentoLegado;

    public PagamentoAdapter(PagamentoLegado pagamentoLegado) {
        this.pagamentoLegado = pagamentoLegado;
    }

    @Override
    public void pagar(double valor) {
        // Converte ou adapta chamada
        pagamentoLegado.realizarPagamento(valor);
    }
}
