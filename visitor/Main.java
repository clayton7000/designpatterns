public class Main {

    public static void main(String[] args) {

        Forma circulo = new Circulo(2);
        Forma retangulo = new Retangulo(4, 5);

        Visitor calculadora = new CalculadoraAreaVisitor();

        circulo.aceitar(calculadora);
        retangulo.aceitar(calculadora);
    }
}