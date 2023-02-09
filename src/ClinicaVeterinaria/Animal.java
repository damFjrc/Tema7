package ClinicaVeterinaria;

import java.util.ArrayList;

public class Animal {
	private String raza;
	private String sexo;
	private String nombre;
	private int edad;
	private double peso;
	private ArrayList <Vacuna> libroVacunacion;
	
	
	
	public Animal(String raza, String sexo, String nombre, int edad, double peso, ArrayList<Vacuna> libroVacunacion) {
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.libroVacunacion = libroVacunacion;
	}



	public Animal(String raza, String sexo, String nombre, int edad, double peso) {
		super();
		this.raza = raza;
		this.sexo = sexo;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.libroVacunacion =new ArrayList<>();
	}



	public String getRaza() {
		return raza;
	}



	public void setRaza(String raza) {
		this.raza = raza;
	}



	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public ArrayList<Vacuna> getLibroVacunacion() {
		return libroVacunacion;
	}



	public void setLibroVacunacion(ArrayList<Vacuna> libroVacunacion) {
		this.libroVacunacion = libroVacunacion;
	}



	@Override
	public String toString() {
		return "Animal [raza=" + raza + ", sexo=" + sexo + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso
				+ ", libroVacunacion=" + libroVacunacion + "]";
	}
	
	
	
	
	
}
