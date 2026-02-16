package tema02_condicionales;

import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Proporciona tu nombre de usuario: ");
        String nombreUsuario = sc.nextLine();
        System.out.println("Tienes credencial de biblioteca? ");
        String credencial = sc.nextLine();
        System.out.println("Tienes libros pendientes de devolver? ");
        String librosPendientes = sc.nextLine();
        System.out.println("Que edad tienes? ");
        int edad = sc.nextInt();

        if ((credencial.equalsIgnoreCase("Si") && librosPendientes.equalsIgnoreCase("No")) && edad >= 12) {

            System.out.println(nombreUsuario + " puede pedir un libro.");

        } else if (credencial.equalsIgnoreCase("No")) {
            System.out.println(nombreUsuario + " no puedes pedir libro broder, no tienes credencial.");

        } else if (librosPendientes.equalsIgnoreCase("Si") && edad >= 12) {
            System.out.println(nombreUsuario + " no puedes pedir libro broder, tienes libros pendientes");


        } else if (edad < 12)
            System.out.println(nombreUsuario + " no puedes pedir libro broder, eres menor");


    }
}
