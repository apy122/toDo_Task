package javaBean;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {
    // Atributo
    private ArrayList<Task> tasks;
    private int option;
    private ArrayList<String> menu;
    private Scanner scanner;
    private Task task;
    private int index;

    // Constructor
    public JavaCode() {
        this.tasks = new ArrayList<>();
        this.option = -1;
        this.menu = new ArrayList<>();
        this.scanner= new Scanner(System.in);
        this.task=new Task();
        index= 1;
        
        createMenu();
        showMenu();
    }
    
public ArrayList<Task> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}

	public ArrayList<String> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<String> menu) {
		this.menu = menu;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	//clase
    // Crear el menú
    private void createMenu() {
        menu.add("1. Mostrar lista de tareas");
        menu.add("2. Agregar tarea");
        menu.add("3. Eliminar tarea");
        menu.add("4. Mark task done");
        menu.add("5. Salir");
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
                removeTask();
                break;
            case 4:
            	taskMade();

            case 5:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
        }
    }

    private void showTasks() {
        if (this.tasks.isEmpty()) {
            System.out.println("La lista de tareas está vacía.");
        } else {
            System.out.println("ID   Nombre   Fecha   Vencida?");
            for (Task task: tasks) {
                System.out.println(task.getIdTarea()+" "+task.getNombre()+" "+task.getFechaVencimiento()+ " "+ task.isEstaVencida());
            }
        }
    }
    

    // Agregar una tarea
    private void addTask () {
    	System.out.println("Tarea a realizar: ");
    	String taskName= scanner.next();
    	System.out.println("Fecha de vencimiento: ");
    	String fechaVencimiento= scanner.next();
    	tasks.add(new Task(taskName, index, fechaVencimiento, false));
    	index++;
    	task.updateIdTarea();
    	
    	
    			
    }
    
    // Eliminar tarea
    private void removeTask() {
        System.out.println("Número de tarea a eliminar: ");
        if (scanner.hasNextInt()) {
            index = scanner.nextInt();
            if (index >= 0 && index < tasks.size()) {
                tasks.remove(index);
                System.out.println("Tarea eliminada correctamente.");
            } else {
                System.out.println("Número de tarea no válido. Inténtalo de nuevo.");
            }
        } else {
            System.out.println("Por favor, introduce un número válido.");
            scanner.nextLine();
        }
    }
    public void taskMade() {
    	System.out.println("Marca Tarea terminada(por numero): ");
    	index= scanner.nextInt();
    	if(index>0 && index<tasks.size()) {
    		tasks.get(index).timeOutTask();
    		System.out.println("La tarea con ID " + index + " ha sido marcada como terminada.");
    	}else {
    		System.out.println("Inserte una opcion Valida");
    	}
		
    }
   }
