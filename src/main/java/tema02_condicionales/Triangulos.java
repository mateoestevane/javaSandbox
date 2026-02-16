package tema02_condicionales;

import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el lado 1: ");
        int lado1 = sc.nextInt();
        System.out.println("");

        System.out.print("Ingresa el lado 2: ");
        int lado2 = sc.nextInt();
        System.out.println("");

        System.out.print("Ingresa el lado 3: ");
        int lado3 = sc.nextInt();

        boolean esValido;
        String tipoTriangulo = "";

        if ((lado1 + lado2 > lado3 && lado1 + lado3 > lado2) && lado2 + lado3 > lado1) {
            esValido = true;
        } else {
            esValido = false;
        }

        if (esValido) {
            if ((lado1 == lado2) && lado1 == lado3) {
                tipoTriangulo = "Equilatero";

            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                tipoTriangulo = "Isosceles";
            } else {
                tipoTriangulo = "Escaleno";
            }


        } else {
            System.out.println("❌ No es un Triangulo valido");
            return;
        }

        System.out.printf("✅ Triangulo %s", tipoTriangulo);


    }
}