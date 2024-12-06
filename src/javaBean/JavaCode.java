package javaBean;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaCode {
	//Atributes
	private ArrayList<String> tasks;
	private Scanner scanner;
	private int option;
	private ArrayList<String> menu;
	
	//builders
	public JavaCode() {
		super();
	}

	public JavaCode(ArrayList<String> tasks, Scanner scanner, int option, ArrayList<String> menu) {
		super();
		this.tasks = new ArrayList<>();
		this.scanner =new Scanner(System.in);
		this.option = -1;
		this.menu = new ArrayList<>();;
	}
	
	//seters and getters

	public ArrayList<String> getTasks() {
		return tasks;
	}

	public void setTasks(ArrayList<String> tasks) {
		this.tasks = tasks;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
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
	
	//Menu
	public void Menu(){
			
			//option menu
			menu.add("Menu:\n");
			menu.add("1. Task List\n");
			menu.add("2. Add Task\n");
			menu.add("3. Task done\n");
			menu.add("4. Delete Task\n");
		}
		public void showMenu() {
			while(option!=4) {
				System.out.println("\n====Menu====\n");
				for(String menu:menu) {
					System.out.println(menu);
				}
				System.out.println("Select Option: ");
				if (scanner.hasNextInt()) {
	                option = scanner.nextInt();
	                scanner.nextLine();
	                setOption(option);
	            } else {
	                System.out.println("Por favor, introduce un número válido.");
	                scanner.nextLine();
	            }
			}
			
			if (scanner.hasNextInt()) {
				System.out.println("\nIngrese opcion\n");
			    option= this.scanner.nextInt();
	            scanner.nextLine();
	          //options
				switch (option) {
				case 1:
					//taskList();
					break;
				case 2:
					//addTask();
					break;
				case 3:
					//taskDone();
					break;
				}
	        }else{
	            System.out.println("Por favor, introduce un número válido.");
	            scanner.nextLine();
	            continue;
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


	
	
}