/*
 En HTML / CSS, un color se puede indicar mediante la palabra en inglés o su código RGB. 
Crea un programa que nos ayude en nuestro diseño de páginas web. 
El programa deberá pedir un color en español y nos dará el correspondiente color en inglés y el código RGB. 
Si el color introducido no existe, se mostrará el mensaje “Lo siento, ese color no existe”. 
Ejemplo: Por favor, introduzca un color: verde El color verde, en inglés es Green y su código RGB es #008000. 
La información se debe guardar en dos HashMap. 
Uno de ellos tendrá parejas clave-valor del tipo (color español, color inglés) y otro (color español, código RGB). 
El programa no se dará por válido si no utiliza los dos HashMap indicados, aunque funcione bien.
 */
package ex2015.pkg2016t3c1.a.pkg1;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author cmove
 */
public class Ex20152016T3c1A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s =new Scanner(System.in);
        HashMap<String,String> colorRGB =new HashMap<String,String>();
        colorRGB.put("Azul","#0000FF");
        colorRGB.put("Negro","#000000");
        colorRGB.put("Rojo","#FF0000");
        colorRGB.put("Blanco","#FFFFFF");
        colorRGB.put("Verde", "#008000");
        colorRGB.put("Morado","#800080"); 
        colorRGB.put("Amarillo", "#FFFF00");
        colorRGB.put("Naranja","#FFA500"); 
        colorRGB.put("Rosa", "#EE82EE");
        
        HashMap<String,String> color =new HashMap<String,String>();
        color.put("Azul","Blue");
        color.put("Negro","Black");
        color.put("Rojo","Red");
        color.put("Blanco","White"); 
        color.put("Verde", "Green");
        color.put("Morado","Púpura"); 
        color.put("Amarillo", "Yellow");
        color.put("Naranja","Orange"); 
        color.put("Rosa", "Pink");
        
    System.out.print("Por favor, introduzca un color: "); 
    String colorSpanish = s.nextLine();
    if (color.containsKey(colorSpanish)) { 
        System.out.println("La traducción de " + colorSpanish + " es: " + color.get(colorSpanish));
        
    } else { 
        System.out.println("El color no está definido.");
    }      
    }
}

