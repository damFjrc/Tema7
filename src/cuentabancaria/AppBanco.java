package cuentabancaria;


////// CÓDIGO REALIZADO POR FRANCISCO JAVIER Y ANDRÉS JULIAN ROMERO VILLANUEVA

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {
	private ArrayList<Cliente> clientes;

	
	//CONSTRUCTOR/////////////////////
	public AppBanco(ArrayList<Cliente> clientes) {
		this.clientes = new ArrayList<Cliente>();
	}
	public AppBanco() {
		this.clientes = new ArrayList<Cliente>();
	}

	//GETTERS Y SETTERS //////////////////////
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	/////MAIN///////////////////
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez");
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		Cuenta c3=new Cuenta("ES234211", "Ahorro Boda", "B124", "A128", 14200);
		Cuenta c4=new Cuenta("ES234212", "Compartida", "B124", "A129", 17000);
		Cliente cli2=new Cliente("B124", "11111J", "Marta", "LLópez");
		cli2.getCuentas().add(c3);
		cli2.getCuentas().add(c4);
		////////////////////////////////////////////
		
		Scanner sc = new Scanner(System.in);
		AppBanco app = new AppBanco();
		app.getClientes().add(cli);
		app.getClientes().add(cli2);
		int selector = 0;
		do {
			app.menu();
			selector = sc.nextInt();
			switch(selector) {
			
			case 1:
				app.nuevoCliente();
				
				break;
			case 2:
				app.mostrarClientes();
				
				break;
			case 3:
				System.out.println("Codigo cliente: ");
				String codigo = sc.next();
				app.accesoCliente(codigo);
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Selecciona una opción válida");
				break;
			}
		}while(selector != 4);
		
	}
	
	//////////// IMPRIMIR MENU//////////////////////
	private static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println("1. Alta Cliente");
		System.out.println("2. Mostrar Clientes");
		System.out.println("3. Acceso Cliente");
		System.out.println("4. Salir");
	}
	
	//////////////Nuevo Cliente//////////////////
	private void nuevoCliente() {
		Scanner in = new Scanner(System.in);
		String nombre = "";
		String apellidos ="";
		String codigoCliente = "B"+(int)(Math.floor(1+Math.random()*999));
		String dni = "";
		System.out.println("Introduce el nombre");
		nombre = in.next();
		System.out.println("Introduce los apellidos");
		apellidos = in.next();
		System.out.println("Introduce el Dni");
		dni = in.next();
		Cliente c = new Cliente(codigoCliente, dni, nombre, apellidos);
		clientes.add(c);
		System.out.println("Cliente Registrado con éxito!");
	}
	
	/////MOSTRAR CLIENTE/////////////////////
	private void mostrarClientes() {
		for(Cliente c: clientes) {
			System.out.println(c);
			System.out.println(" ");
		}
	}
		
	/////Acceso Cliente/////////////////////
	private  void accesoCliente(String codigo) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int selector = 0;
		for(Cliente c: clientes) {
			if(codigo.equals(c.getCodigoCliente())) {
				if(c.getCuentas().size()!=0) {
					for (Cuenta s : c.getCuentas()) {
						System.out.println(s);
						System.out.println(" ");
					}
					c.totalCuentas();
					/// SELECTOR DE CUENTAS
					System.out.println("Seleccione la cuenta en la que desea operar: ");
					selector = sc.nextInt();
					for(Cuenta s: c.getCuentas()) {
						if((selector-1) == contador) {
							System.out.println("Te gustaría retirar o ingresar?");
							System.out.println("1. Ingresar");
							System.out.println("2. Retirar");
							selector = sc.nextInt();
							switch(selector) {
							case 1:
								ingresar(s);
								break;
							case 2:
								retirar(s);
								break;
							}
						}else {
							contador++;
						}
					}
					
						
					
				}else {
					System.out.println("El cliente no tiene cuentas registradas");
					System.out.println(" ");
				}
			}
		}
	}
	
	///////////RETIRAR////////////////////
	private void retirar(Cuenta s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la cantidad a retirar");
		int cantidad = 0;
		cantidad = sc.nextInt();
		s.retirarSaldo(cantidad);
		System.out.println("El saldo actual de la cuenta es: "+s.getSaldo()+"€");
		System.out.println(" ");
		
	}
	private void ingresar(Cuenta s) {
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int cantidad = 0;
		System.out.println("Introduzca la cantidad a ingresar");
		cantidad = sc.nextInt();
		s.ingresar(cantidad);
		System.out.println("El saldo actual de la cuenta es: "+s.getSaldo()+"€");
		System.out.println(" ");	
	}
	
	
	
	}


