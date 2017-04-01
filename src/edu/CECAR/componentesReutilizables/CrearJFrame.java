/** Clase: CrearJFrame.java
 **
 ** Fecha Creaci�n: 21/03/2017
 **
 ** Fecha Modificaci�n:
 **
 ** Versi�n: 0.1
 **
 ** Autor: 92531165
 **
 ** Copyright: CECAR
 **/  

package edu.CECAR.componentesReutilizables;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 ** Componente reutilizable para la creaci�n de GUI
 * basadas en el estandar de dise�o definido.
 * 
 * Ademas los compoenens graficos  validan la entrada
 * de datos.
 * 
 **/

public abstract class CrearJFrame {

	private JFrame frame;


	/**
	 * Metodo que define la GUI estandar 
	 * de mi empresa
	 */
	public CrearJFrame() {

		this("",800,600);		

	}

	public CrearJFrame(String titulo) {

		this(titulo,800,600);

	}

	public CrearJFrame(String titulo, int ancho, int alto) {

		frame = new JFrame(titulo);
		frame.setSize(ancho, alto);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane();
		frame.setLayout(null);		

	}


	public void mostrarJFrame() {
		
		frame.setVisible(true);

	}
	
	public JLabel getJLabel(String texto,
			int posX, int posY,int ancho, int alto) {
		
		JLabel lResultado = new JLabel(texto);
		lResultado.setForeground(Color.black);
		lResultado.setFont(AtributoVisual.getTipoLetraLabel());
		lResultado.setBounds(posX,  posY, ancho,  alto);
		getFrame().add(lResultado);
		
		return lResultado;
		
	}
	
	public JTextField getJTextFieldNumero(int posX, int posY,
			int ancho, int alto) { 
		
		JTextField tResultado = new JTextField();
		tResultado.addKeyListener(Validacion.getEntradaNumeroJTextField());
		tResultado.setBounds(posX,  posY, ancho,  alto);
		getFrame().add(tResultado);
		return tResultado;
		
	}
	
	public JTextField getJTextFieldTexto(int posX, int posY,
			int ancho, int alto) { 
		
		JTextField tResultado = new JTextField();
		tResultado.setBounds(posX,  posY, ancho,  alto);
		getFrame().add(tResultado);
		return tResultado;
		
	}

	public JFrame getFrame() {
		return frame;
	}
}
