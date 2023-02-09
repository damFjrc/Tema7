package ClinicaVeterinaria;

import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String DNI;
	private String direccion;
	private String email;
	private ArrayList <Animal> mascostas;
	public Cliente(String nombre, String dNI, String direccion, String email, ArrayList<Animal> mascostas) {
		super();
		this.nombre = nombre;
		DNI = dNI;
		this.direccion = direccion;
		this.email = email;
		this.mascostas = mascostas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Animal> getMascostas() {
		return mascostas;
	}
	public void setMascostas(ArrayList<Animal> mascostas) {
		this.mascostas = mascostas;
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", DNI=" + DNI + ", direccion=" + direccion + ", email=" + email
				+ ", mascostas=" + mascostas + "]";
	}
	

	
}
