import java.util.HashMap;
import java.util.Map;
class CaractereFactory {

    private static Map<Character, Caractere> caracteres = new HashMap<>();

    public static Caractere getCaractere(char simbolo) {

        if (!caracteres.containsKey(simbolo)) {
            caracteres.put(simbolo, new CaractereConcreto(simbolo));
        }

        return caracteres.get(simbolo);
    }

    public static int totalObjetos() {
        return caracteres.size();
    }
}