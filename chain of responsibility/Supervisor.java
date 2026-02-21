class Supervisor extends Aprovador {

    @Override
    public void aprovar(double valor) {
        if (valor <= 1000) {
            System.out.println("Supervisor aprovou: R$ " + valor);
        } else if (proximo != null) {
            proximo.aprovar(valor);
        }
    }
}