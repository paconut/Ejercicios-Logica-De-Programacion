import java.util.Scanner;

public class InvertirTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una palabra o frase: ");
        String texto = scanner.nextLine();
        scanner.close();
        String textoInvertido = invertirTexto(texto);
        System.out.println("Texto invertido: " + textoInvertido);
    }

    private static String invertirTexto(String texto) {
        StringBuilder textoInvertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }
        return textoInvertido.toString();
    }
}