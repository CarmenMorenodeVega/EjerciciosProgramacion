/**
 * T3. Lectura de datos 
 *
 * E9. Calcular el volumen de un cono V = (1/3)πr^2h
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio09 {
  static final double pi = 3.141592654;
  public static void main(String[] args) {  
    
    System.out.println("Volumen de un cono");
    
    System.out.print("Altura del cono (cm): ");
    double h = Double.parseDouble(System.console().readLine());
    
    System.out.print("Radio de la base del cono (cm): ");
    double r = Double.parseDouble(System.console().readLine());
    
    double v = (1.0/3.0)*pi*r*r*h;
    System.out.println("El volumen del cono es de " + v + " cm3");
  }
}
