/**
 * 4. Sentencia Condicional
 *
 * 5. Realiza un programa que resuelva una ecuación de primer grado
 *    (del tipo ax + b = 0).
 *
 * Carmen Moreno de Vega
 * 
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("Resolver ecuaciones de primer grado (ax + b = 0)");
   
    System.out.print("Indicar el valor de a:");
    Double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indicar el valor de b:");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
      System.out.println("No hay solución.");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}
