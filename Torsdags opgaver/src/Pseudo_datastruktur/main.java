package Pseudo_datastruktur;

public class main {

	public static void main(String[] args) {

		int x = 5;

		Aggregate aggregate = new Aggregate(x);

		Iterator iterator = new Aggregate(x).createIterator();

		while (iterator.next())
			System.out.println(iterator.current() + " ");

		System.out.println();

	}

}
