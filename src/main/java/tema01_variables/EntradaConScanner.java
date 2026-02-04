package tema01_variables;

import java.util.Scanner;

public class EntradaConScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu estatura en metros: ");
        double estatura = sc.nextDouble();

        System.out.printf("Nombre: %s\nEdad: %d\nEstatura: %.2f\n",
                nombre,edad,estatura);
        sc.close();


    }
}
