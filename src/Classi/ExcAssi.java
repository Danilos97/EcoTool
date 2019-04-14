package Classi;

public class ExcAssi extends Exception {
	


	/* solleva un'eccezione per la classe E
	 * in caso il numero degli assi del veicolo 
	 * non rispetti il regolamento (>5)*/


		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		ExcAssi(){
		    System.out.println("Errore: il numero di assi è errato.");
		  }

}
