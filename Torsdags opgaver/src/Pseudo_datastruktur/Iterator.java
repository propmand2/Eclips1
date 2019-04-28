package Pseudo_datastruktur;

public class Iterator {

	private Aggregate aggregate;
	int index;

	public Iterator(Aggregate aggregate) {
		this.aggregate = aggregate;

		index = -1;
	}

	public boolean next() {
		if (index + 1 < aggregate.x) {
			index++;
			return true;
		} else
			return false;

	}

	public int current() {
		return aggregate.næste;
	}
}
