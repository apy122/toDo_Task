package test;
import java.util.ArrayList;
import java.util.Scanner;

public class testToDo {
	private ArrayList<String> tasks;
	private Scanner scanner;
	
	public testToDo(ArrayList<String> tasks, Scanner scanner) {
		super();
		this.tasks = tasks;
		this.scanner = scanner;
	}
	
	//Menu
	public void Menu(){
		int option=0;
		while(option!=4) {
			System.out.println("Menu");
			System.out.println("1. Task List");
			System.out.println("2. Add Task");
			System.out.println("3. Task done");
			System.out.println("4. Delete Task");
			
			//future options
			  if (scanner.hasNextInt()) {
	                option = scanner.nextInt();
	                scanner.nextLine();
	            } else {
	                System.out.println("Por favor, introduce un número válido.");
	                scanner.nextLine();
	                continue;
	            }
			//options
			switch (option) {
			case 1:
				taskList();
			case 2:
				addTask();
			case 3:
				taskDone();
			
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
}