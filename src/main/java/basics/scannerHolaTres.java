package basics;

import java.util.Scanner;

public class scannerHolaTres {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre completo: " );
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu peso: ");
        double peso = scanner.nextDouble();
        System.out.println("Introduce tu altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / Math.pow(altura,2);
        imc = Math.round (imc * 100.0) / 100.0;
        System.out.println("Tu nombre completo es: " + nombre + " y tu IMC es de: " + imc);

        scanner.close();



    }
}
