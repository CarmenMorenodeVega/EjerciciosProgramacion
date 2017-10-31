/**
 * 4. Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
    calcule los segundos que faltan para llegar a la medianoche.
 *
 * Carmen Moreno de Vega
 */
public class Ejercicio11 {

    public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca  los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    if ((minuto > 60) || (minuto < 0)) {
    System.out.print("el número es incorrecto");
  }
    if ((hora > 24) || (hora < 0)) {
    System.out.print("el número es incorrecto");
  }
    
    System.out.printf("los segundos que faltan para llegar a medianoche son " 
     + ((24 * 3600) - ((hora * 3600) + (minuto * 60))) + "segundos");
}
}
