/** Clase: AtributoVisual.java
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

import java.awt.Font;

/**
 ** Descripción
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
