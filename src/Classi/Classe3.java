package Classi;

public class Classe3 extends Veicolo {
		
	private char classe = '3';
	private double tariffa = 3.0;
		
	public Classe3 (String mod, String mar, int a, String t, int na, double p, double alt) {
		
		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = 3;		// forzo il numero di assi a 3
		this.peso = p;
		this.altezza = alt;
		
		if ( na != 3 ) {
			
			System.out.println("Il numero di assi � stato resettato a 3 perch� il veicolo � di classe" + classe );
		}
	}

	public char getClasse() {
		return classe;
	}

	public double getTariffa() {
		return tariffa;
	}

}
