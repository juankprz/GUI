/** Clase: Validacion.java
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

/**
 ** Se definen las diferentes formas de validar 
 * los componentes graficos de una GUI
 **/

public class Validacion {
	
	private static ValidarEntradaNumeroJTextField 
	               entradaNumeroJTextField = 
	               new ValidarEntradaNumeroJTextField();
	

	public static ValidarEntradaNumeroJTextField getEntradaNumeroJTextField() {
		return entradaNumeroJTextField;
	}
}
