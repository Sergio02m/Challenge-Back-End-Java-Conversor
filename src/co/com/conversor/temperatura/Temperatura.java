package co.com.conversor.temperatura;

import javax.swing.JOptionPane;

public class Temperatura {

	public String opcionesConvertirMonedas() {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la temperatura que quieras Convertir ","Temperatura", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius a Fahrenheit", "De Celsius a Kelvin", "De Celsius a Rankine", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Fahrenheit a Rankine",
						"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Kelvin a Rankine", "De Rankine a Celsius", "De Rankine a Fahrenheit", "De Rankine a Kelvin"}, 
    					"Seleccion")).toString();
		return opcion;
	}

	public double obtenerValorIngresado() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la temperatura:"));
        return valor;
		
	}

}
