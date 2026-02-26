package ejercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i); // Selects a particular character from the string based on index value
            System.out.print(c);
            System.out.print(c);
        }
    }
}