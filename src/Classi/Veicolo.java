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
	
	// Il costruttore è stato omesso ed è stata
	// resa la classe abstract per evitare eventuali
	// istanziazioni
	
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
