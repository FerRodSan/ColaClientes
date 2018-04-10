package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Timestamp;
import java.util.Iterator;

import Modelo.Cliente;
import Modelo.Cola;
import Modelo.Lista;
import Vista.Ui;

public class ParaUi extends Ui {

	Cliente cliente;
	Cola cola = new Cola();
	Lista lista = new Lista();

	public ParaUi() {
		super();

		btnAnadirCola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textNombre.getText().isEmpty()||textTelefono.getText().isEmpty()) {
					lblMensaje.setText("espacio vacio, rellena bien los datos");
				}else {
					String fecha=obtenerFecha();
					cliente = new Cliente(textNombre.getText(), textTelefono.getText(), fecha );
					cola.agregarClienteCola(cliente);
					lblFechaHora.setText(fecha);
					lblMensaje.setText("Cliente añadido");
					textNombre.setText("");
					textTelefono.setText("");
					muestraCola();
				}
			}
		});

		btnAtenderCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cola.getColaEspera().isEmpty()) {
					lblMensaje.setText("No hay nadie en colaaaa!!");
				} else {
					lista.eliminarClienteCola(cola);
					lblMensaje.setText("Cliente atendido");
					muestraCola();
					muestraLista();
				}
			}
		});
	}
	
	/*
	 * obtengo la hora, minutos, segundos y milisegundos al crear el cliente
	 */
	protected String obtenerFecha() {
		String cadena = new Timestamp(System.currentTimeMillis()).toString();
		return cadena.substring(cadena.indexOf(" ") + 1, cadena.length());
	}



	/*
	 * muestra la lista de gente atendida 
	 */
	private void muestraLista() {
		lblClientesAtendidos.setText("");
		for (Iterator<Cliente> iterator = lista.getColaAtendida().iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			lblClientesAtendidos.setText(lblClientesAtendidos.getText()+ cliente.toString() + "\n");
		}
		lblMensaje.setText("Mostrando Lista clientes atendidos");
	}

	/*
	 * muestra la cola del paro
	 */
	private void muestraCola() {
		lblCola.setText("");
		for (Iterator<Cliente> iterator = cola.getColaEspera().iterator(); iterator.hasNext();) {
			Cliente cliente = (Cliente) iterator.next();
			lblCola.setText(lblCola.getText() + cliente.toString()+"\n");
		}
		lblMensaje.setText("Mostrando cola de clientes");
	}
}
