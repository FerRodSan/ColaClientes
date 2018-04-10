package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
				cliente = new Cliente(textNombre.getText(), textTelefono.getText());
				cola.agregarClienteCola(cliente);
				lblMensaje.setText("Cliente añadido");
				textNombre.setText("");
				textTelefono.setText("");
				muestraCola();
			}
		});

		btnAtenderCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lista.eliminarClienteCola(cola);
				lblMensaje.setText("Cliente atendido");
				muestraCola();
				muestraLista();
			}
		});
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
