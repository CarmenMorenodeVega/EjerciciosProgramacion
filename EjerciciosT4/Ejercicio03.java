/**
 * 4. Sentencia Condicional
 *
 * 3. Escribe un programa en que dado un número del 1 a 7 escriba el
 *    correspondiente nombre del día de la semana.
 *
 * Carmen Moreno de Vega
 */

public class Ejercicio03 {
	public static void main(String[] args) {

		String dia;
		System.out.print("Por favor, introduzca un número del 1 al 7: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		switch(numero) {
			case 1:
        dia = "lunes";
        break;
			case 2:
        dia = "martes";
        break;
			case 3:
        dia = "miércoles";
        break;
			case 4:
        dia = "jueves";
        break;
			case 5:
        dia = "viernes";
        break;
			case 6:
        dia = "sábado";
        break;
			case 7:
        dia = "domingo";
        break;
			default:
        dia = "El número de estar en el intervalo [1-7]";
		}
		System.out.println(dia);
	}
}
