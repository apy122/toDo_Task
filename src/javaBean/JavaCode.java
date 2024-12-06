package javaBean;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {
    // Atributos
    private ArrayList<String> tasks;
    private int option;
    private ArrayList<String> menu;
    private Scanner scanner;
    private int i;

    // Constructor
    public JavaCode() {
        this.tasks = new ArrayList<>();
        this.option = -1;
        this.menu = new ArrayList<>();
        this.scanner= new Scanner(System.in);
        this.i=0;
        
        createMenu();
        showMenu();
    }

    // Crear el menú
    private void createMenu() {
        menu.add("1. Mostrar lista de tareas");
        menu.add("2. Agregar tarea");
        menu.add("3. Eliminar tarea");
        menu.add("4. Salir");
    }

    // Mostrar el menú y gestionar opciones
    public void showMenu() {
        while (option != 4) {
            System.out.println("\n==== Menú ====");
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
            System.out.print("Selecciona una opción: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); 
                handleOption(option);
            } else {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    // Manejar las opciones del menú
    private void handleOption(int option) {
        switch (option) {
            case 1:
                showTasks();
                break;
            case 2:
                addTask();
                break;
            case 3:
                markTaskAsDone();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private void showTasks() {
     if(this.tasks.isEmpty()){
    	 System.out.println("Showtask empty");
     }else {
    	 for( i=0; i< tasks.size();i++) {
    		 System.out.println((i+1)+ tasks.get(i));
    	 }
     }
     for(int i=0;i< tasks.size(); i++) {
    	 System.out.println(i+1);
     }
    }

    // Agregar una tarea
    private void addTask () {
    	System.out.println("Write task to Do: ");
    	String task= scanner.nextLine();
    	scanner.nextLine();
    	tasks.add(task);
    }

    // Eliminar tarea
    private void markTaskAsDone() {
       System.out.println("Number of task to remove: ");
       int i= scanner.nextInt();
       tasks.remove(i);
    }

}


	