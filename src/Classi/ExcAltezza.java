package Classi;

public class ExcAltezza extends Exception {
	
	// Solleva un'eccezione nel caso in cui l'altezza del veicolo
	// nella classe A e B non rispetti il regolamento.

	private static final long serialVersionUID = 1L;

		ExcAltezza(){
		    System.out.println("Errore: l 'altezza è errata.");
		}
}
