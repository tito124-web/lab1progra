package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();
     static Scanner scanner = new Scanner(System.in);
    public main(String[] args) {

        
    	int opcion;
        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        do {    
        	
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Mostrar estudiante con la calificación más alta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

             opcion = validacionMenu(0);

            switch (opcion) {
            
            case 1: agregandoStudiante();
            pausa();
            break;
            
            case 2: LiatadeEstudiante();
            pausa();
            break;
            
            case 3: promedioStudent();
            pausa();
            break;
            
            case 4:  betterstudent();
            pausa();
            break;
            
            case 5: 
            	salir();
            	pausa();
                default: System.out.println("esto es todo amigos ");
                
                
            }  
            
            }while(opcion != 5);
        
        scanner.close();
            }
    
    public static void pausa() {   
        System.out.println("Presiona Enter para continuar...");
        scanner.nextLine();
    }
    
    public static int validacionMenu(int opcion){ 
        boolean validar = false; 
        do {
          try {
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
                scanner.nextLine();
                validar = true;
          } catch (NumberFormatException e) {
                System.out.println("Error: Usted no ingreso un número.");
                scanner.nextLine();
          }  
        } while(!validar);
        return opcion;
      }
        
           public static void agregandoStudiante() {
    	
    	  System.out.print("Ingrese el nombre del estudiante: ");
          String nombre = scanner.nextLine();

          System.out.print("Ingrese la calificación del estudiante: ");
          double calificacion = Double.parseDouble(scanner.nextLine());

          estudiantes.add(nombre);
          calificaciones.add(calificacion);

          System.out.println("Estudiante agregado correctamente."); 
          }
    public static void LiatadeEstudiante() {
    	
    	if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(estudiantes.get(i) +
                        " - Calificación: " + calificaciones.get(i));
            } 
            } 
    	}

    public static void promedioStudent() {
    	
    	if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
        } else {
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion; }

            double promedio = suma / calificaciones.size();
            System.out.println("El promedio de calificaciones es: " + promedio); } 
    	}
    
   public static void betterstudent() {
    	
    	if (calificaciones.isEmpty()) {
            System.out.println("No hay calificaciones registradas.");
        } else {

            double maxCalificacion = calificaciones.get(0);
            String estudianteMax = estudiantes.get(0);

            for (int i = 1; i < calificaciones.size(); i++) {
                if (calificaciones.get(i) > maxCalificacion) {
                    maxCalificacion = calificaciones.get(i);
                    estudianteMax = estudiantes.get(i);
                } 
                }

            System.out.println("El estudiante con la calificación más alta es: "
                    + estudianteMax + " con " + maxCalificacion);
        } 
    	}
    
    public static void salir() {
    	
    	 System.out.println("saliendo del programa");
    	 }
    	 }

