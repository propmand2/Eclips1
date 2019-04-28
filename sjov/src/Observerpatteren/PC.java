package Observerpatteren;

import java.awt.List;
import java.util.ArrayList;
import java.util.Observer;

public class PC implements IOberverable {

	
	
	private ArrayList<IObserver> observers;
	// Listen af Observers
	private int antal;
	
	public PC() {
		
		observers = new ArrayList<IObserver>();
		// constructeren definer arraylisten
	}
	
	
	@Override
	public void add(IObserver nyobserver) {
		
		observers.add(nyobserver);
		
	}

	@Override
	public void remove(IObserver sletObsever) {
		
		int observersIndex = observers.indexOf(sletObsever);
		
		System.out.println("Observer" + (observersIndex+1) + "slettet");
		
		observers.remove(observersIndex);
	}

	@Override
	public void notifyIObserver() {
		
		// ( type  næste er midlertidig : observers er arraylisten
		for(IObserver observer : this.observers) {
			
			observer.update(antal);
			
		}
		
	}

	public void setantal(int antal) {
		
		this.antal = antal;
		notifyIObserver();
		
	}

	// https://www.youtube.com/watch?v=wiQdrH2YpT4
	
	// https://www.youtube.com/watch?v=_BpmfnqjgzQ

}
