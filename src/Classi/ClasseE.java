package Classi;

public class ClasseE extends Veicolo{
	
	private char classe = 'E';
	private double tariffa = 5.0;
		
	public ClasseE (String mod, String mar, int a, String t, int na, double p, double alt) throws ExcAssi {
		
		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = na;
		this.peso = p;
		this.altezza = alt;
		
		if ( na < 5 ) {
			
			throw new ExcAssi();
		}
		
	}

	public char getClasse() {
		return classe;
	}

	public double getTariffa() {
		return tariffa;
	}

	// Metodi interfaccia


}
