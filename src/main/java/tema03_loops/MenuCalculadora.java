package tema03_loops;

import java.util.Scanner;

public class MenuCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== MENU CALCULADORA ===");
        System.out.println("1. Numeros pares");
        System.out.println("2. Tabla de multiplicar");
        System.out.println("3. Factorial");
        System.out.println("4. Salir");


        int menu = 0;
        System.out.print("Elige una opcion: ");
        while (menu != 4) {

            menu = sc.nextInt();


            switch (menu) {
                case 1:
                    System.out.println(" == Numeros pares ==");
                    System.out.print("Ingresa un numero: ");
                    int num = sc.nextInt();
                    for (int i = 0; i <= num; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }

                    }
                    System.out.println("Ingresa el numero de la operacion con la que quieres proceder");

                    break;
                case 2:
                    System.out.println("== Tabla de multiplicar ==");
                    System.out.print("Ingresa un numero: ");
                    int numeroMultiplicacion = sc.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numeroMultiplicacion + " x " + i + " = " + (i * numeroMultiplicacion));

                    }
                    System.out.println("Ingresa el numero de la operacion con la que quieres proceder");


                    break;

                case 3:
                    System.out.println("== Factorial ==");
                    System.out.print("Ingresa un numero: ");
                    break;

                case 4:
                    System.out.println("Haz salido");
                    return;
                default:
                    System.out.println("Ingresa un numero que este ahi broder");
            }
        }


    }
}
