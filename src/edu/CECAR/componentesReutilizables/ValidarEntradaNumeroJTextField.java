/** Clase: ValidarEntradaNumeroJTextField.java
 **
 ** Fecha Creación: 21/03/2017
 **
 ** Fecha Modificación:
 **
 ** Versión: 0.1
 **
 ** Autor: 92531165
 **
 ** Copyright: CECAR
 **/  

package edu.CECAR.componentesReutilizables;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

/**
 ** Descripción
 **/

public class ValidarEntradaNumeroJTextField 
extends KeyAdapter {
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		
		JTextField jTextField = (JTextField)e.getComponent();
	  
		 if (!Character.isDigit(e.getKeyChar()))
			 e.consume();
		 else
			 if (jTextField.getName() !=null &&
					 (jTextField.getText().length() > (Integer.parseInt(jTextField.getName())-1)))
				 
				    e.consume();
		 
	
	}

}
