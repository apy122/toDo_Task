package javaBean;
import java.util.Scanner;
import java.util.concurrent.StructuredTaskScope;
public class Task {
	private String nombre;
	private int idTarea;
	private String fechaVencimiento;
	private boolean estaVencida;
	private Scanner scanner;
	public Task() {
		super();
	}
	
	public Task(String nombre, int idTarea, String fechaVencimiento, boolean estaVencida) {
		super();
		this.nombre = nombre;
		this.idTarea=idTarea;
		this.fechaVencimiento = fechaVencimiento;
		this.estaVencida = estaVencida;
		this.scanner=new Scanner(System.in);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getIdTarea() {
		return idTarea;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public boolean isEstaVencida() {
		return estaVencida;
	}
	public void setEstaVencida(boolean estaVencida) {
		this.estaVencida = estaVencida;
	}
	public void updateIdTarea() {
		
		for (idTarea=1; idTarea<100 ;idTarea++) {
			idTarea++;
		}
	}
	public void timeOutTask() {
		this.estaVencida=true;
	}
}
