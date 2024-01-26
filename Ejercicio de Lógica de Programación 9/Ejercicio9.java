import java.util.Map;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("gato", "cat");
        diccionario.put("perro", "dog");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("sol", "sun");
        diccionario.put("libro", "book");
        diccionario.put("agua", "water");
        diccionario.put("cielo", "sky");
        diccionario.put("coche", "car");
        diccionario.put("rojo", "red");
        diccionario.put("manzana", "apple");
        diccionario.put("amarillo", "yellow");
        diccionario.put("feliz", "happy");
        diccionario.put("triste", "sad");
        diccionario.put("jardín", "garden");
        diccionario.put("montaña", "mountain");
        diccionario.put("verde", "green");
        diccionario.put("ordenador", "computer");
        diccionario.put("luz", "light");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra en español: ");
        String palabraEspañol = scanner.nextLine().toLowerCase();
        scanner.close();

        String traduccion = diccionario.get(palabraEspañol);
        if (traduccion != null) {
            System.out.println("La traducción al inglés es: " + traduccion);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario");
        }
    }
}