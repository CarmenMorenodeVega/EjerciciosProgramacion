/**
 * 4. Sentencia Condicional
 *
 * 6. Realiza un programa que calcule el tiempo que tardará en caer un
 *    objeto desde una altura h.
 *    t = raiz(2h/g) siendo g = 9.81 m/s2
 *
 * Carmen Moreno de Vega
 */
public class Ejercicio06 {

  final static double g = 9.81;
  public static void main(String[] args) {
  
    System.out.print("Indicar la altura (en metros) a la que se encuentra el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
  }
}
