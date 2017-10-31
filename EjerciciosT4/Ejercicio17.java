/**
 * 4. Sentencia Condicional
 *
 * 17. Escribe un programa que diga cuál es la última cifra de un número
 *     entero introducido por teclado.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio17 {

  public static void main(String[] args) {
    System.out.println("Este programa indicará la última cifra del número introducido");
    System.out.print("Indica un número entero: ");
    int n = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (n % 10));
  }
}
