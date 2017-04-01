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
import javax.swing.JScrollPane;

/**
 ** Descripci�n
 **/

public class GUIEstudiante extends CrearJFrame {
	
	private JTextField TxtMin;
        private JTextField TxtMax;
        private JTextField TxtTcorreo;
	private JTextField tNombres;
	private JLabel LblAc;
        private JLabel LblMin;
        private JLabel LblMax;
        private JLabel LblPalabras;
        JScrollPane obj= new JScrollPane();
	public GUIEstudiante() {
		
		super("Relacion Entre Amigos",900,500);
                //Panel alta comunicacion
                //label
		LblAc= getJLabel("Alta Comunicacion:",10,0,120,53);
                LblMin=getJLabel("MIN:", 120,15, 60, 25);
                LblMax=getJLabel("MAX:", 190,15, 60, 25);
                LblPalabras=getJLabel("Palabras:",10,30,80,53);
                getJLabel("Relacion Trabajo:",10,45,150,53);
                getJLabel("Total Correos:",10,400,150,53);
                TxtTcorreo=getJTextFieldNumero(95,415,35,25);
                TxtTcorreo.setEditable(false);
                getJTextArea(10,90,200,300);
                getJTextArea(250,90,200,300);
                getJLabel("Relacion Sentimental:",250,45,150,53);
//jtextfield    
                TxtMin = getJTextFieldNumero(150,15,35,25);
                TxtMin = getJTextFieldNumero(220,15,35,25);
                
               //texfield	
		
		
                
                
                
		mostrarJFrame();
		
	}
	
	public static void main(String[] args) {
		
            GUIEstudiante guiEstudiante = new GUIEstudiante();
	}

}
