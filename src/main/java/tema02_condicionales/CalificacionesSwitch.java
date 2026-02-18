package tema02_condicionales;

import java.util.Scanner;

public class CalificacionesSwitch {
    public static void main(String[] args) {
        char letra = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una calificacion (0-100)");
        int calificacion = sc.nextInt();
        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Introduce un valor en el rango solicitado");
            sc.close();
            return;
        }
        if (calificacion >= 90) {
            letra = 'A';
        } else if (calificacion >= 80) {
            letra = 'B';
        } else if (calificacion >= 70) {
            letra = 'C';
        } else if (calificacion >= 60) {
            letra = 'D';
        } else {
            letra = 'F';
        }
        System.out.println("Tu calificacion es: " + letra);

        switch (letra) {

            case 'A':

                System.out.println("Excelente trabajo");
                break;
            case 'B':

                System.out.println("Buen trabajo");
                break;
            case 'C':

                System.out.println("Trabajo aceptable");
                break;
            case 'D':

                System.out.println("Necesitas mejorar");
                break;

            case 'F':

                System.out.println("Reprobado");
                break;


        }
        sc.close();


    }
}
