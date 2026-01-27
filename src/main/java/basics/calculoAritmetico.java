package basics;
import java.util.Scanner;
public class calculoAritmetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Inicializo la clase importada Scanner y creo un nuevo Scanner

        int num1 = scanner.nextInt(); // Inicializo la variable num1 y su valor es lo introducido en el escaner
        int num2 = scanner.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        scanner.close();




    }
}
