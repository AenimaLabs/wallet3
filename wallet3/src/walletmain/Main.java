package walletmain;


import java.util.Scanner;

import clases.CuentaBancaria;

public class Main {

	public static void main(String[] args) {
		
		double saldo;
		
		CuentaBancaria cuentaJorgeBancaria = new CuentaBancaria(12, 2500.5, "nombre");
		
		//cuentaJorgeBancaria.getNumeroCuenta();
		saldo = cuentaJorgeBancaria.getSaldoActual();
		
		cuentaJorgeBancaria.setNombreTitularString("Pedrito");
		
		System.out.println(saldo);
		cuentaJorgeBancaria.getNombreTitular();
		
		System.out.println(cuentaJorgeBancaria.getNumeroCuenta());
		System.out.println(cuentaJorgeBancaria.getSaldoActual());
		System.out.println(cuentaJorgeBancaria.getNombreTitular());
		
		CuentaBancaria cuentavacia = new CuentaBancaria();
		
		System.out.println(cuentavacia);
		System.out.println(cuentavacia.getNombreTitular());
		
		cuentavacia.setNombreTitularString("persona 1");
		System.out.println(cuentavacia.getNombreTitular());
		
		//
//		CuentaBancaria cuentafuncion = CuentaBancaria.crearCuenta();
//		
//		System.out.println("El  número de la cuenta es: " + cuentafuncion.getNumeroCuenta());
//		System.out.println("El saldo actual de la cuenta es: " + cuentafuncion.getSaldoActual());
//		System.out.println("El nombre del titular es: " + cuentafuncion.getNombreTitular());
		
		CuentaBancaria cuentafuncion2 = CuentaBancaria.crearCuentaForma2();
		
		System.out.println("El  número de la cuenta es: " + cuentafuncion2.getNumeroCuenta());
		System.out.println("El saldo actual de la cuenta es: " +cuentafuncion2.getSaldoActual());
		System.out.println("El nombre del titular es: " + cuentafuncion2.getNombreTitular());
		

	}
	
	
	
	
	/**
	
	public static CuentaBancaria crearCuenta() {
		CuentaBancaria cuentaBancaria = new CuentaBancaria();
		System.out.println("-- Paso 2 --");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el numero de cuenta: ");
		cuentaBancaria.setNumeroCuenta(scanner.nextInt());
		scanner.nextLine();
		System.out.println("Ingresa el nombre del titular de la cuenta: ");
		cuentaBancaria.setNombreTitularString(scanner.nextLine());;
		System.out.println("Ingresa el saldo Inicial: ");
		cuentaBancaria.setSaldoActual(scanner.nextDouble());
		return cuentaBancaria;	
}*/

	

}
