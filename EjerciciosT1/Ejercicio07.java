/**
 * 
 * 1. Salida por pantalla
 *
 * 7. Igual que el programa anterior, pero esta vez la pirámide estará
 *    hueca (se debe ver únicamente el contorno hecho con asteriscos).
 *
 * Carmen Moreno de Vega
 * 
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println("\033[33m"); // en naranja
    
    System.out.println("    *");    
    System.out.println("   * *");
    System.out.println("  *   *");
    System.out.println(" *     *");
    System.out.println("*********");
    
    System.out.println("\033[37m"); // de nuevo blanco
  }
}
