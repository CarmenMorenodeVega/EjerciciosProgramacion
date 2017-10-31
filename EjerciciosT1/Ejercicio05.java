/**
 * 
 * 1. Salida por pantalla
 *
 * 5. Modifica el programa anterior añadiendo colores. Puedes mostrar
 *    cada asignatura de un color diferente.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String celeste = "\033[36m";
    String blanco = "\033[37m";
    
    System.out.println(blanco + "Lunes\tMartes\tMiérc.\tJueves\tViernes");
    System.out.println("======\t=======\t======\t======\t=======");
    System.out.println(rojo +"SIN" + naranja + "\tPROG" + rojo + "\tSIN" +naranja + "\tPROG" + naranja + "\tPROG");
    System.out.println(rojo +"SIN" + naranja + "\tPROG" + rojo + "\tSIN" +naranja + "\tPROG" + naranja + "\tPROG");
    System.out.println(rojo +"SIN" + naranja + "\tPROG" + rojo + "\tSIN" +naranja + "\tPROG" + celeste + "\tED" );
    System.out.println(verde + "FOL" + azul + "\tBDATO" + celeste + "\tED" + azul + "\tBDATO" + morado + "\tLM");
    System.out.println(verde + "FOL" + azul + "\tBDATO" + celeste + "\tED" + azul + "\tBDATO" + morado + "\tLM");
    System.out.println(verde + "FOL" + azul + "\tBDATO" + morado + "\tLM" + azul + "\tBDATO" + morado + "\tLM");

  }  
}
