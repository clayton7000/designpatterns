public class Main {

    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento();

        pagamento.setEstrategia(new PagamentoCartao());
        pagamento.realizarPagamento(100);

        pagamento.setEstrategia(new PagamentoPix());
        pagamento.realizarPagamento(200);

        pagamento.setEstrategia(new PagamentoBoleto());
        pagamento.realizarPagamento(300);
    }
}