class Diretor extends Aprovador {

    @Override
    public void aprovar(double valor) {
        if (valor <= 20000) {
            System.out.println("Diretor aprovou: R$ " + valor);
        } else {
            System.out.println("Valor muito alto. Necessita aprovação especial.");
        }
    }
}