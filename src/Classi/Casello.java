package Classi;

public class Casello {

		private String nome;
		private double distanza; // distanza dall'entrata in autostrada
		
		public Casello ( String n, double d ){
			
			this.nome=n;
			this.distanza=d;
		}

		public String getNome(){
			
			return nome;
		}

		public double getDistanza(){
			
			return distanza;
		}

		public double kmPercorsi( Casello a ){
			
			return Math.abs(this.distanza - a.getDistanza());
		}
	}
