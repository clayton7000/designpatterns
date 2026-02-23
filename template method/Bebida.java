abstract class Bebida {

    // Template Method (algoritmo fixo)
    public final void preparar() {
        ferverAgua();
        adicionarIngredientePrincipal();
        servir();
    }

    private void ferverAgua() {
        System.out.println("Fervendo água...");
    }

    private void servir() {
        System.out.println("Servindo na xícara...");
    }

    // Método que será implementado pelas subclasses
    protected abstract void adicionarIngredientePrincipal();
}