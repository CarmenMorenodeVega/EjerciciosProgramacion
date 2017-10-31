/**
 * 4. Sentencia Condicional
 *
 * 12. Realiza un minicuestionario. Cada pregunta acertada sumará un punto. El
       programa mostrará al final la calificación obtenida. Pásale el minicuestionario
       a tus compañeros y pídeles que lo hagan para ver qué tal andan de conoci-
       mientos en las diferentes asignaturas del curso..
 *
 * Carmen Moreno de Vega
 */
public class Ejercicio12 {

    public static void main(String[] args) {
  
    int puntos = 0;
    String respuesta;
    
    System.out.println("CUESTIONARIO de lo ABSURDO  ⌨ ");
    
    System.out.println("1. ¿Qué es Java?");
    System.out.println("a) Un idioma extranjero\nb) un lenguaje de programación\nc) Un pokemon"); 
    System.out.print("=> ");respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }
        
    System.out.println("2. ¿Cuál es el logotipo de Java?");
    System.out.println("a) Un pinguino\nb) Una taza de café\nc) Un perro"); 
    System.out.print("=> ");respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {puntos++;
    }
    
    System.out.println("3. ¿Qué es Wachinpaninpei?");
    System.out.println("a) Una palabra inventada\nb) Un animal\nc) una capa de la tierra"); 
    System.out.print("=> ");respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {puntos++;
    }
     
    System.out.println("4. ¿Quién es el hombre más rápido del mundo?");
    System.out.println("a) Flash\nb) Usain Bolt\nc) Chiquito de la calzada"); 
    System.out.print("=> ");respuesta = System.console().readLine();  
    if (respuesta.equals("a")) {puntos++;
    }
    
    System.out.println("5. ¿Quién inventó la regla del tito Folagor?");
    System.out.println("a) Newton\nb) Mi hijo Alonso\nc) Folagor03"); 
    System.out.print("=> ");respuesta = System.console().readLine();  
    if (respuesta.equals("c")) {puntos++;
    }
    
    System.out.println("\nHa obtenido " + puntos + " puntos."); 
  }
}
