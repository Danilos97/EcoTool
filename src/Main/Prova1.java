package Main;

import Classi.*;
import Impl.*;

public class Prova1 {

	public static void main(String[] args) throws ExcAltezza, ExcAssi {
		
		double risultato;
		
		Casello x = new Casello("Pescara", 150.0);
		System.out.println("Casello x creato");
		Casello y = new Casello("L'Aquila", 53.5);
		System.out.println("Casello y creato");
		
		Veicolo a = new ClasseA("Supra","Toyota",2006,"dssas",2,5.0,1.20);
		System.out.println("veicolo a creato");
		
		Pedaggio p = new Pedaggio();
		System.out.println("Oggetto pedaggio creato");
		
		risultato = p.Calcola(a, x, y);
		
		System.out.println("Risultato di Pedaggio.Calcola messo nella variabile risultato");
		
		System.out.println("Il pedaggio calcolato sul veicolo " + 
		a.getModello() + " sulla tratta di " + x.getNome() + " - " +
		y.getNome() + ", per una lunghezza totale di KM " + x.kmPercorsi(y) + 
		" è di: " + risultato + "0 €" );
		
		Casello[] autostrada = new Casello[3];		// Creazione di un'autostrada come array di Casello
		
		autostrada[0] = new Casello( "roma", 150.0);
		autostrada[1] = new Casello( "pescara", 70.0);
		autostrada[2] = new Casello( "l'aquila", 53.5);
		
		for( int i = 0; i < autostrada.length; i++) {
		System.out.println("Stampo nome "+ (i+1) + "° casello: " + autostrada[i].getNome() +	// Stampo i dati di un'autostrada
		"\nStampo KM " + (i+1) + "° casello: " + autostrada[i].getDistanza());
		}
		
		// Prova calcolo pedaggio tra 2 caselli di Autostrada
		
		double pedaggio = p.Calcola(a, autostrada[0], autostrada[2]);
		
		System.out.println("Pedaggio calcolato su 1° e 3° casello di Autostrada: " + pedaggio);
				
	}

}
