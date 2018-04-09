package Modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Cola {
	
	private ArrayDeque<Cliente> colaEspera=new ArrayDeque<Cliente>();
	
	public void agregarClienteCola(Cliente cliente) {
		this.colaEspera.add(cliente);
	}

	public ArrayDeque<Cliente> getColaEspera() {
		return colaEspera;
	}

	public void setColaEspera(ArrayDeque<Cliente> colaEspera) {
		this.colaEspera = colaEspera;
	}
}
