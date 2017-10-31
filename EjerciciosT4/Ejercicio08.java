/**
 * T4. Sentencia condicional 
 *
 * E08. Realiza un programa que calcule la media de tres notas.
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
   suficiente, bien, notable o sobresaliente).
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio08 {
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
    
    if (notaMedia < 5) {
      System.out.println("La nota obtenida es un Insuficiente.");
    } 
    if ((notaMedia >= 5) && (notaMedia < 6)) {
      System.out.println("La nota obtenida es un Suficiente.");
    }  
    if ((notaMedia >= 6) && (notaMedia < 7)) {
      System.out.println("La nota obtenida es un Bien.");  
    }
    if ((notaMedia >= 7) && (notaMedia < 9)) {
      System.out.println("La nota obtenida es un Notable.");  
    }
    if ((notaMedia >= 9) && (notaMedia < 10)) {
      System.out.println("La nota obtenida es un Sobresaliente.");
    }   
  }
}
