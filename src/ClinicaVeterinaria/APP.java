
package ClinicaVeterinaria;

public class APP {

	public static void main(String[] args) {
		Vacuna v=new Vacuna("Astra Zeneca", "Enero", "XX", 20);
		Vacuna v1=new Vacuna("Pfizer", "Enero", "XX", 30);
		
		Perro p=new Perro("Border Collie", "Hembra", "Lori", 1, 10, null, "123455", false);
		Cliente c=new Cliente("Andres", "12134H", "Paseo del muelle", "andres@riberadeltajo.es", null);
	}

}
