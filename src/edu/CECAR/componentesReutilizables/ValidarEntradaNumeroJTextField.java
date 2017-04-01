/** Clase: ValidarEntradaNumeroJTextField.java
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

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JTextField;

/**
 ** Descripci�n
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
