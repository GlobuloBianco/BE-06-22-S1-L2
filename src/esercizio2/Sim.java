package esercizio2;

public class Sim {
	String numero;
	double credito;
	int[] chiamate;
	
	public Sim(String num) {
		this.numero = num;
		this.credito = 0;
		this.chiamate = new int[5];
	}
	
	public void stampaDati() {
		System.out.println("Il tuo numero di telefono è: " + this.numero);
		System.out.println("Il tuo credito residuo è di: " + this.credito + "Euro");
		
		System.out.println("Le tue ultime 5 chiamate sono: ");
		for (int i = 0; i<this.chiamate.length; i++) {
			// se non ci sono chiamate recenti stampa
			if (this.chiamate[i] == 0) {
				System.out.println("Non hai chiamate recenti");
				break;
			} else { //senno stampa le ultime 5 chiamate
				System.out.println( (i+1) + ") " + this.chiamate[i]);
			}
		}
	}
}
