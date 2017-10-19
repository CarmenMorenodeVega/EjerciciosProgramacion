/**
 * T3. Lectura de datos 
 *
 * E10. Conversor de unidades: de MB a KB.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.print("introducir valor en MB: ");
    double MB = Double.parseDouble(System.console().readLine());
    
    System.out.println(MB + "MB son " +  (MB * 1024) + "KB.");
  }
}
