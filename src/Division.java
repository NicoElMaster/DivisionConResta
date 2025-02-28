import java.util.Scanner;

public class Division {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Programa para poder realizar una división con resta ****");
        System.out.println("\t** Realizado por Nicolas Moreno Jiménez :) **");

        // Solicitar números al usuario
        // Dividendo
        System.out.print("\nIngresa el dividendo: ");
        int dividendo = Integer.parseInt(scanner.nextLine());

        // Divisor
        System.out.print("Ingrese el divisor: ");
        int divisor = Integer.parseInt(scanner.nextLine());

        // Validación para evitar la división por el número cero
        if (divisor == 0) {
            System.out.println("Error: No se puede dividir por cero!!!!");
        } else {
            int cociente = 0;
            int residuo = dividendo;

            // Proceso de restas sucesivas
            while (residuo >= divisor) {
                residuo -= divisor;
                cociente++;
            }

            // Mostrar resultados
            System.out.print("\nResultado de la división: " + dividendo + " / " + divisor + " = " + cociente
                    + " (Residuo: " + residuo + ")");

        }

        System.out.println("\n\t>>> Espero te haya gustado el programa :) <<<");
        scanner.close();
    }
}
