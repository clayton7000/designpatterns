class PagoEstado implements EstadoPedido {

    @Override
    public void proximo(Pedido pedido) {
        pedido.setEstado(new EnviadoEstado());
    }

    @Override
    public void status() {
        System.out.println("Pedido está PAGO");
    }
}