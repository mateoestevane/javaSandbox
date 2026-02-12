package tema02_condicionales;

import java.util.Scanner;

public class Descuentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio del producto broder");
        double precio = sc.nextDouble();
        sc.nextLine();

        System.out.println("Eres cliente frecuente broder? (Si/No)");
        String cliente = sc.nextLine();

        System.out.println("Tienes algun cupon de descuento? (Si/No)");
        String cupon = sc.nextLine();
        double descuento, precioFinal;
        String descuentoAplicado;
        if (cliente.equalsIgnoreCase("Si") && cupon.equalsIgnoreCase("Si")) {
            descuento = 0.30;
            descuentoAplicado = "30%";


        } else if (cliente.equalsIgnoreCase("Si") || cupon.equalsIgnoreCase("Si")) {
            descuento = 0.15;
            descuentoAplicado = "15%";
        } else {
            descuento = 0;
            descuentoAplicado = "0%";
        }
        precioFinal = precio - (precio * descuento);
        System.out.printf("Descuento aplicado: %s\nPrecio final:$%.2f", descuentoAplicado, precioFinal);

        sc.close();


    }
}
