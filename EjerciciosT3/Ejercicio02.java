/**
 * T3. Lectura de datos
 * 
 * E2. Realiza un conversor de euros a pesetas. Introducir los euros por teclado.
 *
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Introduce la cantidad de euros: ");
    double euros = Double.parseDouble(System.console().readLine());

    int pesetas = (int) (euros*166.38);
    
    System.out.print(euros+"euros son"+pesetas+"pesetas.");
  }
}
