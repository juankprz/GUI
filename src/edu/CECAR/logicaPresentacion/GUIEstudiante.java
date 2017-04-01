/** Clase: GUIEstudiante.java
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

package edu.CECAR.logicaPresentacion;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import edu.CECAR.componentesReutilizables.CrearJFrame;

/**
 ** Descripci�n
 **/

public class GUIEstudiante extends CrearJFrame {
	
	private JTextField TxtMin;
        private JTextField TxtMax;
	private JTextField tNombres;
	private JLabel LblAc;
        private JLabel LblMin;
        private JLabel LblMax;
	public GUIEstudiante() {
		
		super("Relacion Entre Amigos",900,500);
                //Label
		LblAc= getJLabel("Alta Comunicacion:",10,0,120, 53);
                LblMin=getJLabel("MIN:", 120,15, 60, 25);
                LblMax=getJLabel("MAX:", 190,15, 60, 25);
                
               //texfield	
		TxtMin = getJTextFieldNumero(150,15,35,25);
		TxtMin.setName("4");
                TxtMin = getJTextFieldNumero(220,15,35,25);
		TxtMax.setName("4");
		
                
                
                
		mostrarJFrame();
		
	}
	
	public static void main(String[] args) {
		
		new GUIEstudiante();
	}

}
