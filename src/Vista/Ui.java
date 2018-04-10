package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class Ui extends JFrame {

	protected JPanel contentPane;
	protected JTextField textNombre;
	protected JTextField textTelefono;
	protected JLabel lblMensaje;
	protected JTextPane lblCola;
	protected JButton btnAnadirCola;
	protected JButton btnAtenderCliente;
	protected JTextPane lblClientesAtendidos;

	/**
	 * Create the frame.
	 */
	public Ui() {
		setMinimumSize(new Dimension(500, 400));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0,
				Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JLabel lblNewLabel = new JLabel("Pacientes en COLA");
		lblNewLabel.setFont(new Font("Pristina", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridwidth = 3;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 3;
		contentPane.add(lblNombre, gbc_lblNombre);

		textNombre = new JTextField();
		GridBagConstraints gbc_textNombre = new GridBagConstraints();
		gbc_textNombre.gridwidth = 2;
		gbc_textNombre.insets = new Insets(0, 0, 5, 5);
		gbc_textNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_textNombre.gridx = 2;
		gbc_textNombre.gridy = 3;
		contentPane.add(textNombre, gbc_textNombre);
		textNombre.setColumns(10);

		JLabel lblTelefono = new JLabel("Telefono");
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 4;
		contentPane.add(lblTelefono, gbc_lblTelefono);

		textTelefono = new JTextField();
		GridBagConstraints gbc_textTelefono = new GridBagConstraints();
		gbc_textTelefono.gridwidth = 2;
		gbc_textTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_textTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_textTelefono.gridx = 2;
		gbc_textTelefono.gridy = 4;
		contentPane.add(textTelefono, gbc_textTelefono);
		textTelefono.setColumns(10);

		btnAnadirCola = new JButton("A\u00F1adir a Cola");
		GridBagConstraints gbc_btnAnadirCola = new GridBagConstraints();
		gbc_btnAnadirCola.fill = GridBagConstraints.BOTH;
		gbc_btnAnadirCola.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirCola.gridx = 1;
		gbc_btnAnadirCola.gridy = 6;
		contentPane.add(btnAnadirCola, gbc_btnAnadirCola);

		btnAtenderCliente = new JButton("Atender Cliente");
		GridBagConstraints gbc_btnAtenderCliente = new GridBagConstraints();
		gbc_btnAtenderCliente.fill = GridBagConstraints.BOTH;
		gbc_btnAtenderCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtenderCliente.gridx = 3;
		gbc_btnAtenderCliente.gridy = 6;
		contentPane.add(btnAtenderCliente, gbc_btnAtenderCliente);

		lblCola = new JTextPane();
		lblCola.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblCola.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		GridBagConstraints gbc_lblCola = new GridBagConstraints();
		gbc_lblCola.fill = GridBagConstraints.BOTH;
		gbc_lblCola.insets = new Insets(0, 0, 5, 5);
		gbc_lblCola.gridx = 1;
		gbc_lblCola.gridy = 7;
		contentPane.add(lblCola, gbc_lblCola);

		lblClientesAtendidos = new JTextPane();
		lblClientesAtendidos.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, null, null, null));
		GridBagConstraints gbc_lblClientesAtendidos = new GridBagConstraints();
		gbc_lblClientesAtendidos.fill = GridBagConstraints.BOTH;
		gbc_lblClientesAtendidos.insets = new Insets(0, 0, 5, 5);
		gbc_lblClientesAtendidos.gridx = 3;
		gbc_lblClientesAtendidos.gridy = 7;
		contentPane.add(lblClientesAtendidos, gbc_lblClientesAtendidos);

		lblMensaje = new JLabel("Aqui vamos poniendo que va pasando");
		GridBagConstraints gbc_lblMensaje = new GridBagConstraints();
		gbc_lblMensaje.fill = GridBagConstraints.BOTH;
		gbc_lblMensaje.gridwidth = 3;
		gbc_lblMensaje.insets = new Insets(0, 0, 5, 5);
		gbc_lblMensaje.gridx = 1;
		gbc_lblMensaje.gridy = 8;
		contentPane.add(lblMensaje, gbc_lblMensaje);
	}

}
