package banco;

import java.util.Scanner;

public class Cuenta {
//	Parte hecha por ivsn garcia
	private String IBAN;
	private String cuenta;
	private String codigoTitular;
	private String codigoAutorizado;
	private double saldo;
	//Getters y Setters
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
	//Constructor con todos los campos.
	public Cuenta(String iBAN, String cuenta, String codigoTitular, String codigoAutorizado, double saldo) {
		super();
		IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigoTitular = codigoTitular;
		this.codigoAutorizado = codigoAutorizado;
		this.saldo = saldo;
	}
	//Metodo toString.
	@Override
	public String toString() {
		return "\nIBAN" + IBAN + "\ncuenta=" + cuenta + ", \ncodigoTitular=" + codigoTitular
				+ "\ncodigoAutorizado=" + codigoAutorizado + "\nsaldo=" + saldo;
	}
	
	public double retirarSaldo(double cantidad) {
		Scanner kb = new Scanner(System.in);
		double retirar = 0.0;
		System.out.println("Seleccione la cantidad a retirar");
		retirar = kb.nextDouble();
		if(retirar<=this.getSaldo()) {
			this.setSaldo(this.getSaldo()-retirar);
			System.out.println("Se han retirado "+this.getSaldo()+" de la cuenta");
		}else {
			System.out.println("No se ha podido retirar el dinero solicitado");
		}
		
		return saldo;
		
	}
	public void ingresar(double cantidad) {
		Scanner kb = new Scanner(System.in);
		double ingreso=0.0;
		System.out.println("Seleccione la cantidad a ingresar");
		ingreso=kb.nextDouble();
		this.setSaldo(ingreso+this.getSaldo());
		System.out.println("Se han ingresado "+this.getSaldo()+" en la cuenta");
		
	}
	
}
