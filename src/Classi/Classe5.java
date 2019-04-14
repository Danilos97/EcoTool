package Classi;

public class Classe5 extends Veicolo{
	
	private char classe = '5';
	private double tariffa = 5.0;
		
	public Classe5 (String mod, String mar, int a, String t, int na, double p, double alt) throws ExcAssi {
		
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

}
