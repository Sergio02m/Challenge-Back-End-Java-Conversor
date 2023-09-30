package co.com.conversor.principal;


import javax.swing.JOptionPane;

import co.com.conversor.distancia.ConversorDistancia;
import co.com.conversor.distancia.Distancia;
import co.com.conversor.excepciones.ValorExcepcion;
import co.com.conversor.moneda.ConversorMonedas;
import co.com.conversor.moneda.Moneda;
import co.com.conversor.temperatura.ConversorTemperatura;
import co.com.conversor.temperatura.Temperatura;



public class Principal{
	
	public static void main(String[] args) throws ValorExcepcion {
		
		Moneda monedas = new Moneda();	
		Temperatura temperatura = new Temperatura();
		Distancia distancia = new Distancia();
		ConversorMonedas conversorMonedas = new ConversorMonedas();
		ConversorTemperatura conversorTemperatura = new  ConversorTemperatura();
		ConversorDistancia conversorDistancia = new ConversorDistancia();
		 
		 while (true){
	            String[] opciones = {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Distancia"};
	            String opcion = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
	                    "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, "Selección");

	            if(opcion == null){
	                JOptionPane.showMessageDialog(null, "Hasta pronto");
	                break;
	            }

	            switch (opcion) {
	                case "Conversor de Monedas":
	                    String opcionElegidaM = monedas.opcionesConvertirMonedas();
	                    double valorM = monedas.obtenerValorIngresado();
						conversorMonedas.convertir(opcionElegidaM, valorM);
						
	                    break;

	                case "Conversor de Temperatura":
	                	 String opcionElegidaT = temperatura.opcionesConvertirMonedas();
		                 double valorT = temperatura.obtenerValorIngresado();
		                 conversorTemperatura.convertir(opcionElegidaT, valorT);
		                 
	                    break;
	                case "Conversor de Distancia":
	                	String opcionElegidaD = distancia.opcionesConvertirMonedas();
		                 double valorD = distancia.obtenerValorIngresado();
		                 conversorDistancia.convertir(opcionElegidaD, valorD);
	                    break;
	            }

	            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?");
	                if(JOptionPane.YES_OPTION == respuesta){
	                	continue;
	                } else {
	                    JOptionPane.showMessageDialog(null, "Te espero pronto");
	                    break;
	                    }
	        }
	 }		
 }	

	

	 

		 
				






