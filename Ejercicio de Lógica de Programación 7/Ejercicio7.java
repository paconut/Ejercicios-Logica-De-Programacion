import java.util.Scanner;

public class CalculoMinutosFinDeSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String diaSemana;
        do {
            System.out.print("Ingrese un día de la semana (Lunes - Viernes): ");
            diaSemana = scanner.nextLine().toLowerCase();
        } while (!validarDiaSemana(diaSemana));

        int horas, minutos;
        do {
            System.out.print("Ingrese la hora (0-23): ");
            horas = scanner.nextInt();
            System.out.print("Ingrese los minutos (0-59): ");
            minutos = scanner.nextInt();
        } while (!validarHora(horas, minutos));

        int minutosHastaFinDeSemana = calcularMinutosHastaFinDeSemana(diaSemana, horas, minutos);
        System.out.println("Faltan " + minutosHastaFinDeSemana + " minutos para el fin de semana");
        scanner.close();
    }

    private static boolean validarDiaSemana(String diaSemana) {
        return diaSemana.equals("lunes") || diaSemana.equals("martes") || diaSemana.equals("miércoles")
                || diaSemana.equals("jueves") || diaSemana.equals("viernes");
    }

    private static boolean validarHora(int horas, int minutos) {
        return horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59;
    }

    private static int calcularMinutosHastaFinDeSemana(String diaSemana, int horas, int minutos) {
        int minutosTotales = horas * 60 + minutos;

        int valorDiaSemana;
        switch (diaSemana) {
            case "lunes":
                valorDiaSemana = 1;
                break;
            case "martes":
                valorDiaSemana = 2;
                break;
            case "miércoles":
                valorDiaSemana = 3;
                break;
            case "jueves":
                valorDiaSemana = 4;
                break;
            case "viernes":
                valorDiaSemana = 5;
                break;
            default:
                valorDiaSemana = 1;
        }

        int minutosHastaFinDeSemana = 0;
        if (valorDiaSemana < 5) {
            minutosHastaFinDeSemana = (5 - valorDiaSemana) * 24 * 60 - minutosTotales + 15 * 60;
        }

        return minutosHastaFinDeSemana;
    }
}