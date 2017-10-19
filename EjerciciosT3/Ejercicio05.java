/**
 * T3. Lectura de datos 
 *
 * E5. Cálculo del área de un rectángulo.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio05 {
  public static void main(String[] args) {

    System.out.println("Área de un rectángulo");
    
    System.out.print("Longitud de la base(cm):");
    double base = Double.parseDouble(System.console().readLine());
    
    System.out.print("altura del rectangulo(cm):");
    double altura = Double.parseDouble(System.console().readLine());
   
    System.out.println("El área del rectángulo es"+(base*altura)+"cm2");
  }
}
