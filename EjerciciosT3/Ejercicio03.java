/**
 * T3. Lectura de datos
 *
 * E3. Realiza un conversor de pesetas a euros. Introducir las pesetas
 *    por teclado.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.print("introduzca la cantidad de pesetas a convertir:");
    
    int pesetas=Integer.parseInt(System.console().readLine());

    double euros=pesetas/166.38;

    System.out.printf("%d pesetas son %.2f euros",pesetas,euros);
  }
}
