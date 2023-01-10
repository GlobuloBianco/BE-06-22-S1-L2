package esercizio1;

public class Main {

	public static void main(String[] args) {
		Rettangolo elem1 = new Rettangolo(10,21.2);
		Rettangolo elem2 = new Rettangolo(14,28.2);
		//Stampa un rettangolo
		stampaRettangolo(elem1);
		
		//spaziatura
		System.out.println("------------------------------");
		
		//Stampa 2 rettangoli
		stampaDueRettangoli(elem1, elem2);
	}
	
	static void stampaRettangolo(Rettangolo el) {
		System.out.println("L'area del rettangolo è: " + el.calcArea());
		System.out.println("Il perimetro del rettangolo è: " + el.calcPerimetro());
	}

	static void stampaDueRettangoli(Rettangolo elm1, Rettangolo elm2) {
		System.out.println("1* Rettangolo) L'area è di " + elm1.calcArea() + " e il perimetro è di " + elm1.calcPerimetro());
		System.out.println("2* Rettangolo) L'area è di " + elm2.calcArea() + " e il perimetro è di " + elm2.calcPerimetro());
	}

}

/*
Esercizio #1
Creare una classe Rettangolo che permetta di rappresentare dei rettangoli. Per ogni rettangolo deve essere
possibile specificare altezza e larghezza in fase di costruzione dell'istanza e devono essere realizzati i metodi per calcolare perimetro ed area.

Realizzare una funzione stampaRettangolo che, dato un rettangolo, stampi a video area e perimetro.

Rrealizzare una funzione stampaDueRettangoli che, dati due rettangoli, stampi area e perimetro di ognuno e quindi la somma delle aree e dei perimetri.
Scrivere un main che utilizzi funzioni suddette.
*/