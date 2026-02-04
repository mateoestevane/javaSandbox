package tema01_variables;

public class TiposDeDatos {
    public static void main(String[] args) {
        int edad = 23;
        double precio = 19.99;
        String nombre = "Mateo";
        char inicial = nombre.charAt(0);
        boolean esEstudiante = true;
        System.out.println("Mi edad es: " + edad);
        System.out.printf("El precio es: $%.2f\n",precio);
        System.out.printf("Mi nombre es: "+ nombre);
        System.out.println("Tu inicial es: " + inicial);
        System.out.println("Eres estudiante: " + esEstudiante);



    }
}
