public class Main {

    public static void main(String[] args) {

        Bebida cafe = new Cafe();
        Bebida cha = new Cha();

        System.out.println("Preparando café:");
        cafe.preparar();

        System.out.println("\nPreparando chá:");
        cha.preparar();
    }
}