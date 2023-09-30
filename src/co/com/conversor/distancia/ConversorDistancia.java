package co.com.conversor.distancia;

import javax.swing.JOptionPane;

import co.com.conversor.excepciones.ValorExcepcion;

public class ConversorDistancia{

	public void convertir(String opcionElegida, double valor) throws ValorExcepcion {
		switch (opcionElegida) {
		
		case "De Kilometros a Kilometros":
			double Kilometros = (valor * 1093.61);
			Kilometros = (double)Math.round(Kilometros * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" Kilometros equivalen a " + Kilometros + " Kilometros");
			break;
		
		case "De Kilometros a Metros": 
			double Kilometros1 = valor * 1000;
			Kilometros1 = (double)Math.round(Kilometros1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" Kilometros equivalen a " + Kilometros1 + " Metros");
			break;
			
		case "De Kilometros a Millas":
			double Kilometros2 = (valor / 1.609);
			Kilometros2 = (double)Math.round(Kilometros2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor +" Kilometros equivalen a " + Kilometros2 + " Millas");
			break;
			
		case "De Millas a Yardas":
			double Millas = (valor * 1760 );
			Millas = (double)Math.round(Millas * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Millas equivalen a " + Millas + " Yardas");
			break;
			
		case "De Millas a Metros":
			double Millas1 = (valor * 1609);
			Millas1 = (double)Math.round(Millas1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Millas equivalen a " + Millas1 + " Metros");
			break;
		
		case "De Millas a Kilometros":
			double Millas2 = valor * 1.609;
			Millas2 = (double)Math.round(Millas2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Millas equivalen a " + Millas2 + " Kilometros");
			break;
			
		case "De Metros a Yardas":
			double Metros = (valor * 1.094);
			Metros = (double)Math.round(Metros * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Metros equivalen a " + Metros + " Yardas");
			break;
			
		case "De Metros a Kilometros":
			double Metros1 = (valor /1000);
			Metros1 = (double)Math.round(Metros1 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Metros equivalen a " + Metros1 + " Kilometros");
			break;
		 
			
		case "De Metros a Millas":
			double Metros2 = (valor / 1609);
			Metros2 = (double)Math.round(Metros2 * 100d) /100 ;
			JOptionPane.showMessageDialog(null, valor + " Metros equivalen a " + Metros2 + " Millas");
			break;
		
		
			
		default:
            throw new ValorExcepcion("Opción inválida");
		}
		
	}

}
