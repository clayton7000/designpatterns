public class Main {
    public static void main(String[] args) {

        PagamentoLegado sistemaAntigo = new PagamentoLegado();

        // Adapter conecta o sistema novo ao antigo
        Pagamento pagamento = new PagamentoAdapter(sistemaAntigo);

        pagamento.pagar(150.0);
    }
}
