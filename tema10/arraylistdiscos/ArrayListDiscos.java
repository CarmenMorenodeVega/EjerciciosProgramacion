/*Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta 
vez una lista para almacenar la información sobre los discos en lugar de un 
array convencional. Comprobarás que el código se simplifica notablemente.
¿Cuánto ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
programa hecho con una lista?
 * @author cmove */
package arraylistdiscos;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDiscos {
   public static void main(String[] args) {
       ArrayList<Disco> album = new ArrayList<Disco>();
       //String c, String a, String t, String g, int d
       int i;
       String codigo;
       String autor;
       String titulo;
       String genero;
       String duracion = null;
       int opcionMenu;
       int opcionVisualizaListado = 0;
       
       
       Scanner s = new Scanner(System.in);
      
       album.add(new Disco("12345", "El último de la Fila", "Lapiz y Tinta", "pop", 20));
       album.add(new Disco("12350", "Joaquin Sabina", "Nos sobran los motivos", "pop", 15));
       album.add(new Disco("12355", "Serrat", "El sur también existe", "pop", 18));
       
       //Preparamos el menú: Listado de disco, añadir, modificar y borrar
     
       do {
            System.out.println("\nLISTADO DE DISCOS");
            System.out.println("1. Visualiza listado");
            System.out.println("2. Añadir nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Indica una opción: ");
            opcionMenu = Integer.parseInt(s.nextLine());
           
            
            switch (opcionMenu) {
                case 1://Visualizar listado de disco existentes.
                    do{
                        System.out.println("Listado de discos existentes: ");
                        System.out.println("1. Ver listado completo: ");
                        System.out.println("2. Seleccionar discos por autor: ");
                        System.out.println("3. Seleccionar discos por género: ");
                        System.out.println("4. Volver al menú principal: ");
                        opcionVisualizaListado = Integer.parseInt(s.nextLine()); 
                        
                        /*Mediante el siguiente switch generamos los casos (opciones)
                        para visualizar el listado completo o bien por autor o género*/
                        switch (opcionVisualizaListado) {
                            case 1: // Listado de discos completo    
                               for(Disco d : album) {
                                    System.out.println(d);
                               }              
                            break;
                    
                            case 2: // ver listado de discos por autor 
                                System.out.print("Selecciona un autor: ");
                                autor = s.nextLine();
                                for(Disco d : album) {
                                    if(d.getAutor().equals(autor)) {
                                        System.out.println(d);
                                    }
                                }
                            break;
                    
                            case 3: // ver listado de discos por género 
                                System.out.print("Seleciona un género: ");
                                genero = s.nextLine();
                                for(Disco d : album) {
                                    if(d.getGenero().equals(genero)) {
                                        System.out.println(d);
                                    }                               
                                }
                            
                        } // cierro switch (opcionListado)
    
                    } while (opcionVisualizaListado != 4);

                    break;
      
                    //Continuo con el caso 2 del switch (opcionMenu).
                    case 2: //Añadimos disco nuevo
                        System.out.println("\nNUEVO DISCO: ");
                        System.out.println("Indique los datos del disco que quiere incluir: ");  
                        System.out.print("Código: ");
                        codigo = s.nextLine();
                        /* si el código introducido ya existe, mediante "while", hacemos 
                        que se quede dentro del bucle hasta que introduzca un codigo correcto*/
        
                        while (album.contains(new Disco(codigo,"", "", "", 0))) {
                            System.out.println("El código indicado ya existe en la base de datos.Indique otro código, por favor:");
                            codigo = s.nextLine();
                        } // cuando el valor del código no existe continua el proceso de alta.
                        System.out.print("Autor: ");
                        autor = s.nextLine(); 
                    
                        System.out.print("Título: ");
                        titulo = s.nextLine(); 
                    
                        System.out.print("Genero: ");
                        genero = s.nextLine();
                    
                        System.out.print("Duración: ");
                        duracion = s.nextLine();
              
        
                        album.add(new Disco(codigo, autor, titulo, genero, duracion));
                        System.out.print("El disco se ha creado satisfactoriamente. ");
                    break;
              
                    case 3:
                        System.out.println("\nMODIFICAR:");
                        System.out.print("Por favor, indica el código del disco que quieres modificar: ");
                        codigo = s.nextLine();

                        while (!album.contains(new Disco(codigo,"", "", "", 0))) {
                            System.out.print("El código indicado no existe.Indica un código que exista: ");
                            codigo = s.nextLine();
                        }  
                        i = album.indexOf(new Disco(codigo,"", "", "", 0));
                        
                        System.out.println("indica los cambios o INTRO para dejarlos igual.");
  
                        System.out.println("Código: " + album.get(i).getCodigo());
                        System.out.print("Nuevo código: ");
                        codigo = s.nextLine();
                        if (!codigo.isEmpty()) {
                            album.get(i).setCodigo(codigo);
                        }
        
                        System.out.println("Autor: " + album.get(i).getAutor());
                        System.out.print("Nuevo autor: ");
                        autor = s.nextLine();
                        if (!autor.isEmpty()) {
                            album.get(i).setAutor(autor);
                        }
        
                        System.out.println("Título: " + album.get(i).getTitulo());
                        System.out.print("Nuevo título: ");
                        titulo = s.nextLine();
                        if (!titulo.isEmpty()) {
                            album.get(i).setTitulo(titulo);
                        }
        
                        System.out.println("Género: " + album.get(i).getGenero());
                        System.out.print("Nuevo género: ");
                        genero = s.nextLine();
                        if (!genero.isEmpty()) {
                            album.get(i).setGenero(genero);
                        }
        
                        System.out.println("Duración: " + album.get(i).getDuracion());
                        System.out.print("Duración: ");
                        if (duracion.isEmpty()) {
                        } else {
                            album.get(i).setDuracion(Integer.parseInt(duracion));
                        }
                    break;
        
                    case 4:
                        System.out.println("\nBORRAR:");
        
                        System.out.print("Por favor, indica el código del disco a eliminar del listado: ");
                        codigo = s.nextLine();

                        if (!album.contains(new Disco(codigo,"", "", "", 0))) {
                            System.out.println("Lo siento, no se puede borrar un disco que no existe.");
                        } else {
                        album.remove(new Disco(codigo,"", "", "", 0));
                        out.println("Album borrado del listado correctamente.");
                        }
                 }  
      }while (opcionMenu != 5);// cierro el switch opcionMenu  
     }
   }



