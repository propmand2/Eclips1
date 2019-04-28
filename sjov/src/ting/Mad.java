package ting;

public class Mad {

	private String navn;
	private double mængde;
	
	
	public Mad(String navn, double mængde) {
		super();
		this.navn = navn;
		this.mængde = mængde;
	}


	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public double getMængde() {
		return mængde;
	}


	public void setMængde(int mængde) {
		this.mængde = mængde;
	}


	@Override
	public String toString() {
		return "Mad navn = " + navn + ", mængde i styk = " + mængde;
	}
	
	
	
}
