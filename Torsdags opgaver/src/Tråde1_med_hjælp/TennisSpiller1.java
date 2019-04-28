package Tråde1_med_hjælp;

import java.util.Random;

public class TennisSpiller1 extends Thread {

	private TennisSpiller1 modstander;

	private String name;
	private boolean bolden;

	public TennisSpiller1(String name) {
		this.name = name;

		bolden = false;
	}

	public void setModstander(TennisSpiller1 modstander) {
		this.modstander = modstander;
	}

	public void modtagBold() {
		bolden = true;

	}

	public void run() {
		while (true) {
			while (!bolden)
				Sleeper.nap();

			Sleeper.sleepRandom(2);

			if (Math.random() > 0.20) {
				System.out.println(name + " returnerer bolden");
				bolden = false;
				modstander.modtagBold();
			} else {
				System.out.println(name + " missede bolden");
				break;

			}

		}

	}

}
