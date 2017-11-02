/**
 * T5. Bucles
 *
 * 00. Decir si un número es primo (bucle for) .
 *
 * Carmen Moreno de Vega
 */
public class numerosPrimos {

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
