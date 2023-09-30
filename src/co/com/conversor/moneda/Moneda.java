package co.com.conversor.moneda;

import javax.swing.JOptionPane;


public class Moneda {


	public  String opcionesConvertirMonedas() {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea converitir tu dinero","Monedas", 
				JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos Colombianos a Dólar", "De Pesos Colombianos a Euro", "De Pesos Colombianos a Quetzal","De Pesos Colombianos a Yen","De Pesos Colombianos a Won Coreano","De Pesos Colombianos a Peso Mexicano",
						"De Dólar a Pesos Colombianos", "De Euro a Pesos Colombianos", "De Quetzal a Pesos Colombianos","De Yen a Pesos Colombianos","De Won Coreano a Pesos Colombianos", "De Peso Mexicano a Pesos Colombianos"}, 
    					"Seleccion")).toString();
		return opcion;
		
	}


	public double obtenerValorIngresado() {
         double valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la modeda:"));
         return valor;
         
         
        
	}
}



