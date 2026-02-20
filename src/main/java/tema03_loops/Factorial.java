package tema03_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== FACTORIAL ===");
        System.out.print("Ingresa un numero: ");
        int n = sc.nextInt();
        int acumular = 1;

        for (int i = 1; i <= n; i++) {
            acumular *=i;
        }

        System.out.println("El factorial de " + n + " es: " + acumular);
        sc.close();

    }
}