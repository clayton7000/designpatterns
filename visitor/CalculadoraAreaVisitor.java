class CalculadoraAreaVisitor implements Visitor {

    @Override
    public void visitarCirculo(Circulo circulo) {
        double area = Math.PI * circulo.getRaio() * circulo.getRaio();
        System.out.println("Área do círculo: " + area);
    }

    @Override
    public void visitarRetangulo(Retangulo retangulo) {
        double area = retangulo.getLargura() * retangulo.getAltura();
        System.out.println("Área do retângulo: " + area);
    }
}