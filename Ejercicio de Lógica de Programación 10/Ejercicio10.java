import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class JuegoVocabulario {
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
        diccionario.put("amigo", "friend");

        String[] palabrasSeleccionadas = seleccionarPalabrasAleatorias(diccionario, 5);

        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabraEspañol : palabrasSeleccionadas) {
            System.out.print("Traducción al inglés de '" + palabraEspañol + "': ");
            String respuestaUsuario = scanner.nextLine().toLowerCase();

            if (diccionario.containsKey(palabraEspañol) && diccionario.get(palabraEspañol).equals(respuestaUsuario)) {
                System.out.println("¡Correcto!");
                respuestasCorrectas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta es: " + diccionario.get(palabraEspañol));
                respuestasIncorrectas++;
            }
        }

        System.out.println("\nResultados:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    private static String[] seleccionarPalabrasAleatorias(Map<String, String> diccionario, int n) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasSeleccionadas = new String[n];

        for (int i = 0; i < n; i++) {
            int indiceAleatorio = random.nextInt(palabras.length);
            palabrasSeleccionadas[i] = palabras[indiceAleatorio];
        }

        return palabrasSeleccionadas;
    }
}