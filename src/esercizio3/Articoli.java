package esercizio3;

public class Articoli {
	String codice;
	String descrizione;
	double prezzo;
	int pezzi;
	
	public Articoli(String cod, String desc, double cost, int pz) {
		this.codice = cod;
		this.descrizione = desc;
		this.prezzo = cost;
		this.pezzi = pz;
	}
}


/*
Articolo
- codice articolo
- descrizione articolo
- prezzo
- numero pezzi disponibili a magazzino
*/