package co.com.conversor.distancia;

import javax.swing.JOptionPane;

public class Distancia {

	public String opcionesConvertirMonedas() {
		String opcion = (JOptionPane.showInputDialog(null, "Elija a la distancia que desea convertir","Dsitancia", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Kilometros a Yarda","De Kilometros a Metros","De Kilometros a Millas", 
						"De Millas a Yardas","De Millas a Metros","De Millas a Kilometros","De Metros a Yardas","De Metros a Kilometros","De Metros a Millas"}, 
    					"Seleccion")).toString();
		return opcion;
	}

	public double obtenerValorIngresado() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la distancia:"));
        return valor;
	}

}
