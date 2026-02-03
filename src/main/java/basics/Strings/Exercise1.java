package basics.Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoActual = 2026;
        System.out.println("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce tu estatura: ");
        double altura = sc.nextDouble();

        int longitud = nombre.length();
        char primerCaracter = nombre.charAt(0);
        char ultimoCaracter = nombre.charAt(nombre.length()-1);
        int edadAprox = anoActual - edad;
        System.out.println("Primer caracter de tu nombre: " + primerCaracter);
        System.out.println("Ultimo caracter de tu nombre: " + ultimoCaracter);
        System.out.println("Edad aproximada: " +edadAprox);







    }
}
