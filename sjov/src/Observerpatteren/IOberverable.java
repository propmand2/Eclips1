package Observerpatteren;

public interface IOberverable {
	public void add(IObserver o);
	public void remove(IObserver o);
	// Husk notify + observerklassens navn
	public void notifyIObserver();

}
