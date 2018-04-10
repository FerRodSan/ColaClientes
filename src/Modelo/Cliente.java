package Modelo;

import java.sql.Timestamp;

public class Cliente implements Comparable<Cliente> {

	private String nombre;
	private String numTelefono;
	private String fecha;

	public Cliente(String nombre, String numTelefono, String fecha) {
		super();
		this.nombre = nombre;
		this.numTelefono = numTelefono;
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	@Override
	public int compareTo(Cliente o) {
		return this.nombre.compareTo(o.getNombre());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Cliente) {
			return this.nombre.equals(((Cliente) obj).getNombre());
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hasCode = 1;
		hasCode = 31 * hasCode + nombre.hashCode();
		return hasCode;
	}

	@Override
	public String toString() {
		return this.nombre + " : " + this.numTelefono+ " : "+this.fecha;
	}
	
	/*
	 * obtengo la hora, minutos, segundos y milisegundos al crear el cliente
	 */
	protected String obtenerFecha() {
		String cadena = new Timestamp(System.currentTimeMillis()).toString();
		return cadena.substring(cadena.indexOf(" ") + 1, cadena.length());
	}

}
