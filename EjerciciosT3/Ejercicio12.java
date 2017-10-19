/**
 * T3. Lectura de datos 
 *
 * E12. Calcular nota necesaria en el segundo
 *      examen de Programación para obtener la media deseada.
 *      Nota del primer examen es el 40% del total.
 *      Nota del segundo examen es el 60% del total.
 * 
 *   Ejemplo 1:
 *      Nota del primer examen: 7
 *      Nota final deseada = 8.5
 *      Para tener 8.5 en el trimestre ----- segundo examen = 9.5 
 * 
 *   Ejemplo 2:
 *      Nota del primer examen: 8
 *      Nota final deseada = 7
 *      Para tener 7 en el trimestre ----- segundo examen = 6.33 
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.print("Introduce la nota del primer examen: ");
    double examen1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota deseada en el trimestre? ");
    double notaTrimestre = Double.parseDouble(System.console().readLine());
    
    // notaTrimestre = ((examen1*40) + (examen2*60))/100 de donde:
    
    // 60*examen2 = ((100*notaTrimestre) - (examen1 * 40)). Por tanto:
    // examen2 = ((100*notaTrimestre) - (examen1*40))/60.
    
    
    double examen2 = ((notaTrimestre*100) - (examen1*40)) / (60);
    
    System.out.println("Para tener un "+ notaTrimestre +" en el trimestre la nota del segundo examen tiene que ser un "+ examen2 +"");
  }
}
