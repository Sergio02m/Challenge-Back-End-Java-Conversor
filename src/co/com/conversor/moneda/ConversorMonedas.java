package co.com.conversor.moneda;

import javax.swing.JOptionPane;

import co.com.conversor.excepciones.ValorExcepcion;

public class ConversorMonedas {
	

	public void convertir(String opcionElegida , double valor) throws ValorExcepcion {
		
		 switch (opcionElegida) {
		 
		 case "De Pesos Colombianos a Dólar":
			 double Dolar =  (valor)/ 4100;
			 Dolar = (double)Math.round(Dolar * 100d)/100;
			 JOptionPane.showMessageDialog(null, valor + " Pesos Colombianos equivalen a " + Dolar + " Dolares");			
			break;
		
		 case "De Pesos Colombianos a Euro":
			double Euro =  valor/ 4100;
			Euro = (double)Math.round(Euro * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Pesos Colombianos equivalen a " + Euro + " Euros");
			break;
		
		case "De Pesos Colombianos a Quetzal":
			double Qetzal =  valor/ 524.04;
			Qetzal = (double)Math.round(Qetzal * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Pesos Colombianos equivalen a " + Qetzal + " Quetzales");
			break;
		
		case "De Pesos Colombianos a Yen":
			double Yen =  valor/ 28.20;
			Yen = (double)Math.round(Yen * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + "Pesos Colombianos equivalen a " + Yen + " Yenes");
			break;
		
		case "De Pesos Colombianos a Won Coreano":
			double Won =  valor/ 3.06;
			Won = (double)Math.round(Won * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Pesos Colombianos equivalen a " + Won + " Wones");
			break;
		
		case "De Pesos Colombianos a Peso Mexicano":
			double PesoMexicamo  =  valor/ 240.38;
			PesoMexicamo  = (double)Math.round(PesoMexicamo  * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Pesos Colombianos equivalen a " + PesoMexicamo + " Pesos Mexicanos");
			break;
		
		case "De Dólar a Pesos Colombianos":
			double pesoColombiano =  (valor)* 4100;
			pesoColombiano = (double)Math.round(pesoColombiano * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Dolares equivalen a " + pesoColombiano + " Pesos Colombianos");
			break;
		
		case "De Euro a Pesos Colombianos":
			double pesoColombiano1 =  valor* 4100;
			pesoColombiano1 = (double)Math.round(pesoColombiano1 * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Euros equivalen a " + pesoColombiano1 + " Pesos Colombianos");
			break;
		
		case "De Quetzal a Pesos Colombianos":
			double pesoColombiano2 =  valor* 524.04;
			pesoColombiano2 = (double)Math.round(pesoColombiano2 * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Quetzales equivalen a " + pesoColombiano2 + " Pesos Colombianos");
			break;
		
		case "De Yen a Pesos Colombianos":
			double pesoColombiano3 =  valor* 28.20;
			pesoColombiano3 = (double)Math.round(pesoColombiano3 * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Yenes equivalen a " + pesoColombiano3 + " Pesos Colombianos");
			break;
		
		case "De Won Coreano a Pesos Colombianos":
			double pesoColombiano4 =  valor* 3.06;
			pesoColombiano4 = (double)Math.round(pesoColombiano4 * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Wones equivalen a " + pesoColombiano4 + " Pesos Colombianos");
			break;
		case "De Peso Mexicano a Pesos Colombianos":
			double pesoColombiano5  =  valor* 240.38;
			pesoColombiano5 = (double)Math.round(pesoColombiano5 * 100d)/100;
			JOptionPane.showMessageDialog(null, valor + " Peso Mexicano equivalen a " + pesoColombiano5 + " Pesos Colombianos");
			break;
		default:
            throw new ValorExcepcion("Opción inválida");
	 }
		

	}

}
