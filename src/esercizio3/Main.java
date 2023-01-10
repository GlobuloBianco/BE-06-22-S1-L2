package esercizio3;

public class Main {

	public static void main(String[] args) {
		Articoli pane = new Articoli("41435", "Commestibile", 0.99 , 50);
		Cliente cliente1 = new Cliente("457", "Mario Rossi", "mario@rossi.it", "05/01/2023");
		Carrello carrello1 = new Carrello("4123", "lorem", 201 );
		
		stampa(pane);
		System.out.printf(" %n ------------------------- %n "); //divisorio
		stampa(cliente1);
		System.out.printf(" %n ------------------------- %n "); //divisorio
		stampa(carrello1);
	}
	
	static void stampa(Articoli e) {
		System.out.printf("Codice: %s %n Descrizione: %s %n Prezzo: %f %n Pezzi Disponibili: %d",
												e.codice, e.descrizione, e.prezzo, e.pezzi);
	}
	
	static void stampa(Cliente e) {
		System.out.printf("Codice: %s %n Dati: %s %n Email: %s %n Data Iscrizione: %s",
												e.codice, e.dati, e.email, e.iscrizione);
	}
	
	static void stampa(Carrello e) {
		System.out.printf("Cliente Associato: %s %n Elenco dati: %s %n totCosto: %f",
												e.cliente, e.elencoArt, e.costoArt);
	}
}


/*
Esercizio #3
E' necessario scrivere una applicazione che simula il funzionamento di un ecommerce. Si devono quindi rappresentare i dati relativi i seguenti elementi:
Articolo
- codice articolo
- descrizione articolo
- prezzo
- numero pezzi disponibili a magazzino
Cliente
- codice cliente
- nome e cognome
- email
- data iscrizione
Carrello
- cliente associato
- elenco articoli
- totale costo articoli
*/