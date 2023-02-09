package cuentabancaria;

//////////////CÓDIGO REALIZADO POR ANDRÉS JULIAN ROMERO VILLANUEVA Y SUPERVISADO POR FRANCISCO JAVIER

import java.util.ArrayList;

public class Cliente {
	
	private String codigoCliente;
	private String dni;
	private String nombre;
	private String apellidos;
	private ArrayList<Cuenta> cuentas;
	
	
	
	///CONSTRUCTORES/////////////////////
	
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = new ArrayList<Cuenta>();
	}
	
	/////TO STRING///////////////////////////////////////
	@Override
	public String toString() {
		return "Codigo de Cliente: "+this.getCodigoCliente()+"\nDNI: "+this.getDni()
		+"\nNombre: "+this.getNombre()+"\nApellidos: "+this.getApellidos();
	}
	
	
	//////GETTERS Y SETTERS
	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}


	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	
	
	
	
	///METODO MAIN /////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez");
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		System.out.println(cli);
		System.out.println("\nCuentas bancarias: ");
		cli.mostrarCuentas();
		System.out.println("TOTAL: "+cli.totalCuentas()+"€");
	}

////////////////// VOID MOSTRAR CUENTAS //////////////////////////////
	public void mostrarCuentas() {
		for(Cuenta c:this.getCuentas()) {
			System.out.println(c);
			System.out.println(" ");
		}
	}
	
	////////////////////VOID SUMA TOTAL CUENTAS ////////////////
	
public double totalCuentas() {
	double suma = 0;
	for(Cuenta c:this.getCuentas()) {
		suma+=c.getSaldo();
	}
	return suma;
}

}
