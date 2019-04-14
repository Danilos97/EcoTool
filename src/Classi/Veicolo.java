package Classi;

public abstract class Veicolo {
	
	protected String modello;
	protected String marca;
	protected int anno;
	protected String targa;
	protected int nassi;
	protected double peso;
	protected double altezza;
	protected double tariffa;
	protected char classe;
	
	/*public Veicolo (String mod, String mar, int a, String t, int na, double p, double alt){
		
		this.modello = mod;
		this.marca = mar;
		this.anno = a;
		this.targa = t;
		this.nassi = na;
		this.peso = p;
		this.altezza = alt;
		
	}*/

	public String getModello() {
		return modello;
	}

	public String getMarca() {
		return marca;
	}

	public int getAnno() {
		return anno;
	}

	public String getTarga() {
		return targa;
	}

	public int getNassi() {
		return nassi;
	}

	public double getPeso() {
		return peso;
	}

	public double getAltezza() {
		return altezza;
	}
	
	public double getTariffa() {
		return tariffa;
	}
	
	public char getClasse() {
		return classe;
	}
	
}
