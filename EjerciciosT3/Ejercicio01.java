/**
 * T3. Lectura de datos
 *
 * E1. Realiza un programa que pida dos números y muestra el
 *    resultado de su multiplicación.
 *
 *  Carmen Moreno de Vega
 */

public class Ejercicio01 {
  public static void main(String[] args) {
    int x;
    int y;
    
    String linea;
    
    System.out.print("Introduce el primer número: ");
    linea = System.console().readLine();
    x = Integer.parseInt( linea );
   
    System.out.print("introduce el segundo número: ");
    linea = System.console().readLine();
    y = Integer.parseInt( linea );
    
    System.out.println(x + "*" + y + "=" + (x * y));
  }
}
