package Impl;

import Interfaces.PedaggioManager;
import Classi.*;

public class Pedaggio implements PedaggioManager{
	
	public double Calcola( Veicolo a, Casello x, Casello y ) {
		
		double costo;
		double costobase;
		double iva = 0.22;
		double km;
		
		km = x.kmPercorsi(y);
		costobase = ( km * a.getTariffa());
		costo = costobase + (costobase * iva);
		costo = Math.round(costo * 10.0) / 10.0;	// Arrotondamento sui 10 cent
		
		return costo;
		
	}

}
