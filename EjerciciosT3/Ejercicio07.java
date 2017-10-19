/**
 * T3. Lectura de datos
 *
 * E7. Cálculo de factura a partir de la base imponible.
 * Aplicamos IVA=21%
 * 
 * Carmen Moreno de Vega
 */

public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.print("Base imponible (importe sin IVA):");
    double baseImponible = Double.parseDouble(System.console().readLine());

    System.out.printf("Base imponible %5.2f\n", baseImponible);
    System.out.printf("IVA            %5.2f\n", (baseImponible*0.21));
    
    System.out.printf("--------------------\n");
    
    System.out.printf("Total          %5.2f\n", (baseImponible*1.21));
  }
}
