package tema02_condicionales;

import java.util.Scanner;

public class CalculadoraConSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String operacion = "";
        double resultado = 0;


        System.out.println("=== CALCULADORA BASICA ===");
        System.out.println("Introduce el tipo de operacion (1-4)");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Mulitiplicacion");
        System.out.println("4. Division");

        int seleccion = sc.nextInt();
        System.out.println("Introduce el primer numero");

        double a = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double b = sc.nextDouble();

        switch (seleccion) {

            case 1:
                resultado = a + b;
                operacion = "suma";
                break;

            case 2:
                resultado = a - b;
                operacion = "resta";
                break;

            case 3:
                resultado = a * b;
                operacion = "multiplicacion";
                break;
            case 4:
                if (b != 0) {
                    resultado = a / b;
                    operacion = "division";

                } else {
                    System.out.println("Division Invalida: No se puede dividir entre 0");
                    return;
                }
                break;
            default:
                System.out.println("Opcion Invalida broder");
                return;
        }

        System.out.printf("El resultado de la %s es: %.2f ", operacion, resultado);
        sc.close();
    }
}