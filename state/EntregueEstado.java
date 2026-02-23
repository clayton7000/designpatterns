class EntregueEstado implements EstadoPedido {

    @Override
    public void proximo(Pedido pedido) {
        System.out.println("Pedido já foi entregue.");
    }

    @Override
    public void status() {
        System.out.println("Pedido foi ENTREGUE");
    }
}