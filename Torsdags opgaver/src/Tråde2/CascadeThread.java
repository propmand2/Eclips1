package Tråde2;

import java.awt.List;

public class CascadeThread extends Thread {

	private String name;
	private CascadeThread næste_brik;
	private boolean Hvems_tur;

	public CascadeThread(String name, CascadeThread næste_brik) {
		this.name = name;
		this.næste_brik = næste_brik;

		Hvems_tur = false;
	}

	public void setNæste() {
		Hvems_tur = true;

	}

	public void run() {
		while (!Hvems_tur)
			Sleeper.nap();

		System.out.println(name);

		if (næste_brik != null)
			næste_brik.setNæste();

	}

}
