package esercizio2;

public class Main {

	public static void main(String[] args) {
		Sim tel1 = new Sim("3919385912");
		tel1.stampaDati();
	}

}


/*
Esercizio #2
E' necessario scrivere una applicazione che simula il funzionamento di un frammento del sistema informativo di un operatore di telefonia cellulare.
Si devono quindi rappresentare i dati relativi ad una carta SIM ed in particolare:

- il numero di telefono
- il credito disponibile in euro
- la lista delle ultime 5 chiamate effettuate
Per ciascuna chiamata deve essere rappresentata la durata in minuti e il numero chiamato
La classe SIM dovrà fornire le seguenti funzionalità:
-
un costruttore che crea una SIM con numero di telefono passato come parametro, credito a 0 e lista delle chiamate vuota
una funzione per la stampa dei dati della SIM
Scrivere un main che crei una istanza di SIM e ne stampi i dati.
*/