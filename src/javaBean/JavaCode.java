package javaBean;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {
    // Atributos
    private ArrayList<String> tasks;
    private int option;
    private ArrayList<String> menu;

    // Constructor
    public JavaCode() {
        this.tasks = new ArrayList<>();
        this.option = -1;
        this.menu = new ArrayList<>();
        createMenu();
    }

    // Crear el menú
    private void createMenu() {
        menu.add("1. Mostrar lista de tareas");
        menu.add("2. Agregar tarea");
        menu.add("3. Marcar tarea como hecha");
        menu.add("4. Salir");
    }

    // Mostrar el menú y gestionar opciones
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        while (option != 4) {
            System.out.println("\n==== Menú ====");
            for (String menuItem : menu) {
                System.out.println(menuItem);
            }
            System.out.print("Selecciona una opción: ");
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                handleOption(option);
            } else {
                System.out.println("Por favor, introduce un número válido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
        scanner.close();
        System.out.println("¡Hasta luego!");
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

    // Mostrar lista de tareas
    private void showTasks() {
     
    }

    // Agregar una tarea
    private void addTask() {
    	
    }

    // Marcar una tarea como hecha
    private void markTaskAsDone() {
       
    }

    public static void main(String[] args) {
        JavaCode app = new JavaCode();
        app.showMenu();
    }
}


	//See Task
	//public void taskList() {
		
	//}
	
	//Add Task
	//public void addTask() {
		
	//}
	
	//task Done
	//public void taskDone() {
		
	//}
	
	//Task delete
	//public nexLine taskdelete() {
	//	return ;
	//}
	