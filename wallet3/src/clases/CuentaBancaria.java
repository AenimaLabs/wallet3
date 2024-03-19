package clases;

import java.util.Scanner;

public class CuentaBancaria {
	
   private int numeroCuenta;
   private double saldoActual;
   private String nombreTitular;
/**
 * 
 */
public CuentaBancaria() {
}
/**
 * @param numeroCuenta
 * @param saldoActual
 * @param nombreTitular
 */
public CuentaBancaria(int numeroCuenta, double saldoActual, String nombreTitular) {
	this.numeroCuenta = numeroCuenta;
	this.saldoActual = saldoActual;
	this.nombreTitular = nombreTitular;
}
/**
 * @return the numeroCuenta
 */
public int getNumeroCuenta() {
	return numeroCuenta;
}
/**
 * @param numeroCuenta the numeroCuenta to set
 */
public void setNumeroCuenta(int numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}
/**
 * @return the saldoActual
 */
public double getSaldoActual() {
	return saldoActual;
}
/**
 * @param saldoActual the saldoActual to set
 */
public void setSaldoActual(double saldoActual) {
	this.saldoActual = saldoActual;
}
/**
 * @return the nombreTitularString
 */
public String getNombreTitular() {
	return nombreTitular;
}
/**
 * @param nombreTitular the nombreTitularString to set
 */
public void setNombreTitularString(String nombreTitular) {
	this.nombreTitular = nombreTitular;
}

public static CuentaBancaria crearCuenta() {
	
	 //scanner con minúsculas equivale al lector
	 Scanner scanner = new Scanner(System.in);

     System.out.println("Ingrese el número de cuenta:");
     int numeroCuenta = scanner.nextInt();
     scanner.nextLine(); // Consumir la nueva línea pendiente después del nextInt()

     System.out.println("Ingrese el saldo inicial:");
     double saldoInicial = scanner.nextDouble();
     scanner.nextLine(); // Consumir la nueva línea pendiente después del nextDouble()

     System.out.println("Ingrese el nombre del titular:");
     String nombreTitular = scanner.nextLine();
     
     CuentaBancaria plantillaCuentaBancaria = new CuentaBancaria(numeroCuenta, saldoInicial, nombreTitular);
     
     System.out.println("");
     //scanner.close();

     return plantillaCuentaBancaria;
}

public static CuentaBancaria crearCuentaForma2() {
	
	CuentaBancaria plantillaCuentaBancaria2 = new CuentaBancaria();
	 
	 // abrir scanner o lector
	 Scanner scanner = new Scanner(System.in);	 
	 

     System.out.println("Ingrese el número de cuenta:");
     plantillaCuentaBancaria2.setNumeroCuenta(scanner.nextInt());
     scanner.nextLine(); // Consumir la nueva línea pendiente después del nextInt()

     System.out.println("Ingrese el saldo inicial:");
     plantillaCuentaBancaria2.setSaldoActual(scanner.nextDouble());
     scanner.nextLine(); // Consumir la nueva línea pendiente después del nextDouble()

     System.out.println("Ingrese el nombre del titular:");
     plantillaCuentaBancaria2.setNombreTitularString(scanner.nextLine());


     scanner.close();

     return plantillaCuentaBancaria2;
}
   
public void ingresarDinero(Double montoingresado) {
	this.saldoActual = this.saldoActual + montoingresado;
	// si en un principio tenía 0 y luego ingreso 100, el nuevo valor debe ser el inicial + ingresado
	//valorinicial = 0
	//valorinicial = valorinicial + montoingresado
}

public void retirarDinero (double montoRetirado) {
	if (this.saldoActual >= montoRetirado) {
		this.saldoActual = this.saldoActual - montoRetirado;			
	} else {
		System.out.println("Saldo insuficiente para retiro");
	}
	
}
   
}
