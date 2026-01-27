package basics;

public class printing
{


    public static void main(String[] args) {
        /* Declaro la variable name con la literal String, la cual la declaro con el valor en comillas dobles de "Mateo */


        String name = "Mateo";


        System.out.print("Hola\nMundo\nJava"); // Agrego un sout con comillas dobles (texto) con \n para salta renglones
        System.out.println(); // Agrego un salto de renglon, ya que en el primer sout no salta mas que manualmente con \n
        System.out.print("Hola, " + name + "!");  // Agrego un sout normal usando mi variable name

        /* Output:
        Hola
        Mundo
        Java
        Hola, Mateo!
         */

    }

}
