/**
 * T3. Lectura de datos 
 *
 * E11. Conversor de unidades: de KB a MB.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio11 {
  public static void main(String[] args) {

    System.out.print("Introducir valor en KB:");
    double KB = Double.parseDouble(System.console().readLine());
    
    System.out.println(KB +"KB son " + (KB/1024) + "MB.");
  }
}
