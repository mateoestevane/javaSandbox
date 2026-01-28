package basics;

import java.util.Scanner;
public class scannerHola {
    public static void main(String[] args) {

        String nombre;
        String primerApellido;
        String segundoApellido;
        String nombreCompleto;
        int edad;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu primer nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce tu primer apellido: ");
        primerApellido = scanner.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        segundoApellido = scanner.nextLine();
        System.out.println("Introduce tu edad: ");
        edad = scanner.nextInt();

        nombreCompleto = nombre +(" ") + primerApellido + (" ") + segundoApellido;
        System.out.println("Hola, tu nombre completo es: " + nombreCompleto + " y tienes " + edad + " años.");



    }

}