/**
 * 4. Sentencia Condicional
 *
 * 1. Escribe un programa que pida por teclado un día de la semana
 *    y que diga qué asignatura toca a primera hora ese día.
 *
 * Carmen Moreno de Vega
 *
 */

public class Ejercicio01 {
  public static void main(String[] args) {

    String diaDeSemana;

    System.out.print("Para saber la asignatura que corresponde a primera hora, elige un día de la semana:");
    diaDeSemana = (System.console().readLine());  
    
    
    switch(diaDeSemana) {
      
      case "lunes":
        System.out.println("Sistemas Informáticos");
        break;
      case "martes":
        System.out.println("Programación");
        break;
      case "miércoles":
        System.out.println("Sistemas Informáticos");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Programación");
        break;
      case "sábado":
      case "domingo":
        System.out.println("¡Ese día no hay clase!");
        break;
      default:
        System.out.println("El día solicitado no es válido.");
    }
  }
}
