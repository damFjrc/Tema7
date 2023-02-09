package cuentabancaria;


///CÓDIGO REALIZADO POR FRANCISCO JAVIER


public class Cuenta {
	private String IBAN;
	private String cuenta;
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	
	
	//Constructores
	public Cuenta() {
		IBAN = "";
		this.cuenta = "";
		this.codigoTitular = "";
		this.codigoAutorizado = "";
		this.saldo = 0;
	}
	
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}
	
	//GETTERS Y SETTERS
	public String getIBAN() {
		return IBAN;
	}

	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getCodigoTitular() {
		return codigoTitular;
	}

	public void setCodigoTitular(String codigoTitular) {
		this.codigoTitular = codigoTitular;
	}

	public String getCodigoAutorizado() {
		return codigoAutorizado;
	}

	public void setCodigoAutorizado(String codigoAutorizado) {
		this.codigoAutorizado = codigoAutorizado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
////////////////////////////////////////////////////////////////////



///METODO MAIN///////////////////////////////////


	public static void main(String[] args) {
		Cuenta c = new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		System.out.println(c);
		c.ingresar(200);
		System.out.println("Ingreso: "+c.getSaldo()+"€");
		c.retirarSaldo(1300);
		c.retirarSaldo(300);
		System.out.println("Retirada: "+c.getSaldo()+"€");

	}

////	//METODO RETIRAR SALDO//////////////////////////////////////
	public double retirarSaldo(double s) {
		if(s < this.saldo) {
			this.setSaldo(this.getSaldo()-s);
		}else {
			System.out.println("La operación no se ha completado debido a que intenta retirar más de lo posible");
		}
		
		return this.getSaldo();
	}
	
	//METODO INGRESAR ///////////////////////////////////////
	public double ingresar(double c) {
		this.setSaldo(c+this.getSaldo());
		return this.getSaldo();
	}

	//TO STRING /////////////////////////////////////
	@Override
	public String toString() {
		return "IBAN:"+this.getIBAN()+"\nCuenta: "+this.getCuenta()+"\nCodigo Titular:"
				+this.codigoTitular+"\nCodigo Autorizado:"+this.codigoAutorizado
				+"\nSaldo:"+this.getSaldo()+"€";
	}
	

	
}
