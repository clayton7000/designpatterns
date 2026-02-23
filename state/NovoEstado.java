class NovoEstado implements EstadoPedido {

    @Override
    public void proximo(Pedido pedido) {
        pedido.setEstado(new PagoEstado());
    }

    @Override
    public void status() {
        System.out.println("Pedido está NOVO");
    }
}