package tema01_variables;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;

        System.out.println("Suma: " + num1 +" + " + num2 + " = " + (num1+num2));
        System.out.println("Resta: " + num1 +" - " + num2 + " = " + (num1-num2));
        System.out.println("Multiplicacion: " + num1 +" * " + num2 + " = " + (num1*num2));
        System.out.println("Division entera: " + num1 +" / " + num2 + " = " + (num1/num2));
        System.out.println("Residuo: " + (num1%num2));

        double a = 10.0, b = 3.0;

        System.out.println("\nDivision de : " + a +" / " + b + " = " + (a/b));

        int contador = 0;
        contador++;
        System.out.println("Contador despues de ++: " + contador);
        ++contador;
        System.out.println("Contador despues de ++: " + contador);

        contador--;
        System.out.println("Contador despues de --: " + contador);



    }
}
