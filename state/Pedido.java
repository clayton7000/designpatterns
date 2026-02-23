class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        estado = new NovoEstado();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void proximoEstado() {
        estado.proximo(this);
    }

    public void mostrarStatus() {
        estado.status();
    }
}