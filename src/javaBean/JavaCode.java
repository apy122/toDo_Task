package javaBean;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {
	private ArrayList<String> tasks;
	private Scanner scanner;
	private int option;

	public JavaCode(){
		super();
		this.tasks = new ArrayList<>();;
		this.scanner = new Scanner(System.in);
		this.option = -1;
	}
	//Menu
	public void Menu(){
		while(option!=4) {
			System.out.println("Menu:\n");
			System.out.println("1. Task List\n");
			System.out.println("2. Add Task\n");
			System.out.println("3. Task done\n");
			System.out.println("4. Delete Task\n");
			
			option=-1; 
			//future options
			if (scanner.hasNextInt()) {
				System.out.println("\nIngrese opcion\n");
				int option= this.scanner.nextInt();
	            scanner.nextLine();
	          //options
				switch (option) {
				case 1:
					taskList();
					break;
				case 2:
					addTask();
					break;
				case 3:
					taskDone();
					break;
				}
	        }else{
	            System.out.println("Por favor, introduce un número válido.");
	            scanner.nextLine();
	            continue;
	        }
		}
	}

	//See Task
	public void taskList() {
		
	}
	
	//Add Task
	public void addTask() {
		
	}
	
	//task Done
	public void taskDone() {
		
	}
	
	//Task delete
	public void taskdelete() {
		
	}


	@Override
	public String toString() {
		return "testToDo [tasks=" + tasks + ", scanner=" + scanner + "]";
	}
	
	
}