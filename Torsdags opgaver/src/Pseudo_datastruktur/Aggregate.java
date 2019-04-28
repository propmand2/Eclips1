package Pseudo_datastruktur;

public class Aggregate {

	private Iterator iterator;
//	public int nr;
	public int n�ste;
	public int x;

	public Aggregate(int x) {

		this.x = x;
	}

	public int fib(int x) {

		int f�r1 = 1;
		int f�r2 = 1;
		n�ste = f�r2;

		for (int nr = 3; nr <= x; nr++) {
			n�ste = f�r1 + f�r2;
			f�r1 = f�r2;
			f�r2 = n�ste;
		}
		return 1;

	}

	public Iterator createIterator() {
		return new Iterator(this);
	}

}
