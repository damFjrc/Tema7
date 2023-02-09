package ClinicaVeterinaria;

import java.util.ArrayList;

public class Perro extends Animal {
	private String chip;
	private boolean seguroObligatorio;
	public Perro(String raza, String sexo, String nombre, int edad, double peso, ArrayList<Vacuna> libroVacunacion,
			String chip, boolean seguroObligatorio) {
		super(raza, sexo, nombre, edad, peso, libroVacunacion);
		this.chip = chip;
		this.seguroObligatorio = seguroObligatorio;
	}
	
	
	public Perro(String raza, String sexo, String nombre, int edad, double peso, String chip,
			boolean seguroObligatorio) {
		super(raza, sexo, nombre, edad, peso);
		this.chip = chip;
		this.seguroObligatorio = seguroObligatorio;
	}


	public String getChip() {
		return chip;
	}


	public void setChip(String chip) {
		this.chip = chip;
	}


	public boolean isSeguroObligatorio() {
		return seguroObligatorio;
	}


	public void setSeguroObligatorio(boolean seguroObligatorio) {
		this.seguroObligatorio = seguroObligatorio;
	}


	@Override
	public String toString() {
		return "Perro [chip=" + chip + ", seguroObligatorio=" + seguroObligatorio + ", getRaza()=" + getRaza()
				+ ", getSexo()=" + getSexo() + ", getLibroVacunacion()=" + getLibroVacunacion() + "]";
}


	
	
	
}
