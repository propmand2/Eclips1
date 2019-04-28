package test;

public class Test2 {

	public int længde;
	public int højde;
	public String navn;
	
	
	public Test2(int længde, int højde, String navn) {
		super();
		this.længde = længde;
		this.højde = højde;
		this.navn = navn;
	}
	
	public int getLængde() {
		return længde;
	}


	public void setLængde(int længde) {
		this.længde = længde;
	}


	public int getHøjde() {
		return højde;
	}


	public void setHøjde(int højde) {
		this.højde = højde;
	}


	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}

}