/**
 * T3. Lectura de datos
 *
 * E6. Escribe un programa que calcule el área de un triángulo.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("Área de un triángulo");
   
    System.out.print("Base del triángulo (cm):");
    double base = Double.parseDouble(System.console().readLine());
   
    System.out.print("Altura del triángulo (cm):");
    double altura = Double.parseDouble(System.console().readLine());
    
    System.out.println("El área del triángulo es"+(base*altura)/2+"cm2");
  }
}
