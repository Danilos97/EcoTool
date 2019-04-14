package Classi;

public class ClasseA extends Veicolo{
	
	private char classe = 'A';
	private double tariffa = 1.0;
	
	public ClasseA (String mod, String mar, int a, String t, int na, double p, double alt) throws ExcAltezza {

		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = 2;		// forzo il numero di assi a 2
		this.peso = p;
		this.altezza = alt;
		
		if ( alt > 1.30 ) {
			
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
	 
	
}