package Tr�de2;

import java.awt.List;

public class CascadeThread extends Thread {

	private String name;
	private CascadeThread n�ste_brik;
	private boolean Hvems_tur;

	public CascadeThread(String name, CascadeThread n�ste_brik) {
		this.name = name;
		this.n�ste_brik = n�ste_brik;

		Hvems_tur = false;
	}

	public void setN�ste() {
		Hvems_tur = true;

	}

	public void run() {
		while (!Hvems_tur)
			Sleeper.nap();

		System.out.println(name);

		if (n�ste_brik != null)
			n�ste_brik.setN�ste();

	}

}
