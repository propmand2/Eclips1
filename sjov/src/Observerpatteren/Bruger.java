package Observerpatteren;

public class Bruger implements IObserver {

	private int antal;
	private IOberverable PC;
	
	public Bruger(IOberverable PC) {
		
		this.PC = PC;
		
		PC.add(this);
	}

	@Override
	public void update(int antal) {

		this.antal = antal;
		
		printantal();

		
	}
	
	public void printantal() {
		System.out.println("antal bruger, som bruger pc'en: " + antal);
	}

}
