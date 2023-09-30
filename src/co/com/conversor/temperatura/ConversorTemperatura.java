package co.com.conversor.temperatura;

import javax.swing.JOptionPane;

import co.com.conversor.excepciones.ValorExcepcion;

public class ConversorTemperatura {

	public void convertir(String opcionElegida, double valor) throws ValorExcepcion {

		switch (opcionElegida) {
		
		case "De Celsius a Fahrenheit":
			double Fahrenheit = (valor * 1.8) + 32;
			Fahrenheit = (double)Math.round(Fahrenheit * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" °Celcius equivalen a " + Fahrenheit + " °Fahrenheit");
			break;
		
		case "De Celsius a Kelvin": 
			double Kelvin = valor + 273.15;
			Kelvin = (double)Math.round(Kelvin * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" °Celcius equivalen a " + Kelvin + " °Kelvin");
			break;
			
		case "De Celsius a Rankine":
			double Rankine = (valor * 1.8) + 491.67;
			Rankine = (double)Math.round(Rankine * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" °Celcius equivalen a " + Rankine + " °Rankine");
			break;
			
		case "De Fahrenheit a Celsius":
			double Celsius = (valor - 32) * ( 0.556 );
			Celsius = (double)Math.round(Celsius * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Fahrenhei equivalen a " + Celsius + " °Celsius");
			break;
			
		case "De Fahrenheit a Kelvin":
			double Kelvin1 = (valor + 459.67)*(0.556);
			Kelvin1 = (double)Math.round(Kelvin1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Fahrenhei equivalen a " + Kelvin1 + " °Kelvin");
			break;
		
		case "De Fahrenheit a Rankine":
			double Rankine1 = valor + 459.67;
			Rankine1 = (double)Math.round(Rankine1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Fahrenhei equivalen a " + Rankine1 + " °Rankine");
			break;
			
		case "De Kelvin a Celsius":
			double Celsius1 = valor - 273.15;
			Celsius1 = (double)Math.round(Celsius1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Kelvin equivalen a " + Celsius1 + " °Celsius");
			break;
			
		case "De Kelvin a Fahrenheit":
			double Fahrenhit1 = ((valor - 273.15) * (1.8)) + 32;
			Fahrenhit1 = (double)Math.round(Fahrenhit1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Kelvin equivalen a " + Fahrenhit1 + " °Fahrenheit");
			break;
		 
		case "De Kelvin a Rankine":
			double Rankine2 = valor * 1.8 ;
			Rankine2 = (double)Math.round(Rankine2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Kelvin equivalen a " + Rankine2 + " °Rankine");
			break;
			
		case "De Rankine a Celsius":
			double Celsius2 = (valor - 491.67) * (0.556);
			Celsius2 = (double)Math.round(Celsius2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Rankine equivalen a " + Celsius2 + " °Celsius");
			break;
		
		case "De Rankine a Fahrenheit":
			double Fahrenhit2 = valor - 459.67;
			Fahrenhit2 = (double)Math.round(Fahrenhit2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Rankine equivalen a " + Fahrenhit2 + " °Fahrenheit");
			break;
			
		case "De Rankine a Kelvin":
			double Kelvin3 = valor * (0.556);
			Kelvin3 = (double)Math.round(Kelvin3* 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " °Rankine equivalen a " + Kelvin3 + " °Kelvin");
			break;
			
		default:
            throw new ValorExcepcion("Opción inválida");
		}
		
		
	}
		
}
	
