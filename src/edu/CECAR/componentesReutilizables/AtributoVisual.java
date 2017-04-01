/** Clase: AtributoVisual.java
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

import java.awt.Font;

/**
 ** Descripci�n
 **/

public class AtributoVisual {
	
	private static Font tipoLetraLabel =
			new Font("Arial",Font.PLAIN,12);
			

	private static Font tipoLetraTituloLabel =
			new Font("Arial",Font.PLAIN,14);
	
	
	public static Font getTipoLetraLabel() {
		return tipoLetraLabel;
	}
	
	public static Font getTipoLetraTituloLabel() {
		return tipoLetraTituloLabel;
	}

}
