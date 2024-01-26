import java.util.Scanner;

public class OrdenarNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número #" + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        ordenarNumerosPrimosAlInicio(numeros);

        mostrarArrayConIndicesYValores(numeros);

        scanner.close();
    }

    private static void ordenarNumerosPrimosAlInicio(int[] numeros) {
        int[] tempArray = new int[numeros.length];
        int primosIndex = 0;
        int otrosNumerosIndex = numeros.length - 1;

        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                tempArray[primosIndex++] = numeros[i];
            } else {
                tempArray[otrosNumerosIndex--] = numeros[i];
            }
        }

        System.arraycopy(tempArray, 0, numeros, 0, numeros.length);
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void mostrarArrayConIndicesYValores(int[] numeros) {
        System.out.println("\nArray ordenado:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("pos[" + i + "] = " + numeros[i]);
        }
    }
}