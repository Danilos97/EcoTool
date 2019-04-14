package Classi;

public class ClasseB extends Veicolo{
	
	private char classe = 'B';
	private double tariffa = 2.0;
	
	public ClasseB (String mod, String mar, int a, String t, int na, double p, double alt) throws ExcAltezza {
		
		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = 2;
		this.peso = p;
		this.altezza = alt;
		
		if ( alt <= 1.30) {
			
			throw new ExcAltezza();
		}
		
		if ( na != 2 ) {
			
			System.out.println("Il numero di assi è stato resettato a 2 perchè il veicolo è di classe" + classe );
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
