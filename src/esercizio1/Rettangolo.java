package esercizio1;

public class Rettangolo {
	double altezza;
	double larghezza;
	
	public Rettangolo(double alt, double lar) {
		this.altezza = alt;
		this.larghezza = lar;
	}

	public double calcPerimetro() {
		double result = (this.altezza + this.larghezza) * 2;
		return result;
	}
	
	public double calcArea() {
		double result = this.altezza * this.larghezza;
		return result;
	}
}
