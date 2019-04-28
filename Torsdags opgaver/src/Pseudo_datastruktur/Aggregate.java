package Pseudo_datastruktur;

public class Aggregate {

	private Iterator iterator;
//	public int nr;
	public int næste;
	public int x;

	public Aggregate(int x) {

		this.x = x;
	}

	public int fib(int x) {

		int før1 = 1;
		int før2 = 1;
		næste = før2;

		for (int nr = 3; nr <= x; nr++) {
			næste = før1 + før2;
			før1 = før2;
			før2 = næste;
		}
		return 1;

	}

	public Iterator createIterator() {
		return new Iterator(this);
	}

}
