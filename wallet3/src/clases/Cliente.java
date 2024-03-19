package clases;

public class Cliente {
	private long id;
	private String nombre;
	private CuentaBancaria cuenta;
	/**
	 * 
	 */
	public Cliente() {
	}
	/**
	 * @param id
	 * @param nombre
	 * @param cuenta
	 */
	public Cliente(long id, String nombre, CuentaBancaria cuenta) {
		this.id = id;
		this.nombre = nombre;
		this.cuenta = cuenta;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the cuenta
	 */
	public CuentaBancaria getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
}
