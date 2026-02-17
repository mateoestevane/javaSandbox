package ejercicios;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta tu nombre: ");
        String nombre = sc.next();

        System.out.println("Inserta tus calificaciones (3)");
        double cal1 = sc.nextDouble();
        if (cal1 < 0 || cal1 > 100) {
            System.out.println("Ingresa una calificacion valida");
            return;
        }
        double cal2 = sc.nextDouble();
        if (cal2 < 0 || cal2 > 100) {
            System.out.println("Ingresa una calificacion valida");
            return;
        }
        double cal3 = sc.nextDouble();
        if (cal3 < 0 || cal3 > 100) {
            System.out.println("Ingresa una calificacion valida");
            return;
        }
        double promedio = (cal1 + cal2 + cal3) / 3;
        char letra = ' ';
        String estado = " ";
        if (promedio >= 95 && cal1 >= 90 && cal2 >= 90 && cal3 >= 90) {
            letra = 'A';
            estado = "✅ APROBADO\n Mención Honorífica";

        } else if (promedio >= 90) {
            letra = 'A';
            estado = "✅ APROBADO";
        } else if (promedio >= 80) {
            letra = 'B';
            estado = "✅ APROBADO";
        } else if (promedio >= 70) {
            letra = 'C';
            estado = "✅ APROBADO";
        } else if (promedio >= 60) {
            letra = 'D';
            estado = "✅ APROBADO";
        } else if (promedio < 60) {
            letra = 'F';
            estado = "❌ REPROBADO";
        }

        System.out.printf("=== SISTEMA DE CALIFICACIONES ===\n\nNombre del estudiante: %s\n", nombre);
        System.out.println("Calificacion 1: " + cal1);
        System.out.println("Calificacion 2: " + cal2);
        System.out.println("Calificacion 3: " + cal3);
        System.out.println("--- REPORTE ---");
        System.out.printf("Estudiante: %s\nPromedio: %.2f\nLetra: %c\nEstado: %s", nombre, promedio, letra, estado);

    }
}
