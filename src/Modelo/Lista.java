package Modelo;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lista{
	
	private LinkedList<Cliente> linkedList=new LinkedList<>();

	public void eliminarClienteCola(Cola colaEspera) {
		this.linkedList.offer(colaEspera.getColaEspera().pop());
	}

	public LinkedList<Cliente> getColaAtendida() {
		return linkedList;
	}

	public void setColaAtendida(LinkedList<Cliente> colaAtendida) {
		this.linkedList = colaAtendida;
	}

	
}
