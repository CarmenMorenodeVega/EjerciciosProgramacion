/**
 * T4. Sentencia condicional 
 *
 * E07. Realiza un programa que calcule la media de tres notas.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.print("Introduce la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());

    System.out.print("Introduce la nota del segundo examen: ");
    double examen2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la nota del tercer examen: ");
    double examen3= Double.parseDouble(System.console().readLine());
    
    // notaMedia = ((examen1) + (examen2) + (examen3))/3 de donde:
    
    double notaMedia = ((examen1) + (examen2) + (examen3))/3;
    
    System.out.println("La nota media de los tres exámenes es: " + notaMedia +"");
  }
}
