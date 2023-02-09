package ClinicaVeterinaria;

public class Vacuna {
	private String nombre;
	private String fecha;
	private String laboratorio;
	private double precio;
	
	public Vacuna() {
		this.nombre = "";
		this.fecha = "";
		this.laboratorio = "";
		this.precio = 0;
	}
	
	
	public Vacuna(String nombre, String fecha, String laboratoria, double precio) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.laboratorio = laboratoria;
		this.precio = precio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getFecha() {
		return fecha;
	}



	public void setFecha(String fecha) {
		this.fecha = fecha;
	}



	public String getLaboratoria() {
		return laboratorio;
	}



	public void setLaboratoria(String laboratoria) {
		this.laboratorio = laboratoria;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Vacuna [nombre=" + nombre + ", fecha=" + fecha + ", laboratoria=" + laboratorio + ", precio=" + precio
				+ "]";
	}
	
	
	
}
