package tema03_loops;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero limite:");
        int n = sc.nextInt();
        int contador = 0;

        for (int i = 0; i <= n; i += 2) {
                contador++;
                System.out.println(i);
        }
        System.out.println("Total de numeros pares: " + contador);
        sc.close();
    }
}
