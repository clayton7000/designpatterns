public class Main {

    public static void main(String[] args) {

        String texto = "ABACA";

        int coluna = 0;

        for (char c : texto.toCharArray()) {

            Caractere caractere = CaractereFactory.getCaractere(c);

            caractere.mostrar(1, coluna++);

        }

        System.out.println("\nTotal de objetos criados: " +
            CaractereFactory.totalObjetos());
    }
}