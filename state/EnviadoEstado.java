class EnviadoEstado implements EstadoPedido {

    @Override
    public void proximo(Pedido pedido) {
        pedido.setEstado(new EntregueEstado());
    }

    @Override
    public void status() {
        System.out.println("Pedido foi ENVIADO");
    }
}