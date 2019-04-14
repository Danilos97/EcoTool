package Classi;

public class ClasseD extends Veicolo{
	
	private char classe = 'D';
	private double tariffa = 4.0;
	
	public ClasseD (String mod, String mar, int a, String t, int na, double p, double alt) {
		
		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = 4;		// forza numero di assi a 4
		this.peso = p;
		this.altezza = alt;
		
		if ( na != 4 ) {
			
			System.out.println("Il numero di assi è stato resettato a 4 perchè il veicolo è di classe" + classe );
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
