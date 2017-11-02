/**
 * T5. Bucles
 *
 * 16. Escribe un programa que diga si un número introducido por teclado es o no primo. 
       Un número primo es aquel que sólo es divisible entre él mismo
       y la unidad.
 *
 * Carmen Moreno de Vega
 */
public class Ejercicio16 {

  public static void main(String[] args) {
    
  System.out.println("Hallar si un número dado es primo.");
  System.out.println("Indica el número que quieres analizar:"); 
  boolean isPrime = true;
  int n = Integer.parseInt(System.console().readLine());
      for(int i = 2; i < n; i++){
        if (n % i == 0) {
        isPrime = false;
        }
      }
      
      if (isPrime) {
        System.out.println("El " + n + " es primo.");
        } else {
        System.out.println("El " + n + " no es primo.");
        }
  }
}
