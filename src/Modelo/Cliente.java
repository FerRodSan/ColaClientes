package Modelo;

public class Cliente implements Comparable<Cliente> {

	private String nombre;
	private String numTelefono;

	public Cliente(String nombre, String numTelefono) {
		super();
		this.nombre = nombre;
		this.numTelefono = numTelefono;
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
		return this.nombre + " : " + this.numTelefono;
	}

}
