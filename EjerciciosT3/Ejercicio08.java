/**
 * T3. Lectura de datos
 *
 * E8. Escribe un programa que calcule el salario semanal de un empleado
 *    en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.print("Horas trabajadas durante la semana:");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.println("El salario semanal del empleado es igual " + (horasTrabajadas*12) + "euros.");
  }
}
