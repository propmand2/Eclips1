package ting;

public class Mad {

	private String navn;
	private double m�ngde;
	
	
	public Mad(String navn, double m�ngde) {
		super();
		this.navn = navn;
		this.m�ngde = m�ngde;
	}


	public String getNavn() {
		return navn;
	}


	public void setNavn(String navn) {
		this.navn = navn;
	}


	public double getM�ngde() {
		return m�ngde;
	}


	public void setM�ngde(int m�ngde) {
		this.m�ngde = m�ngde;
	}


	@Override
	public String toString() {
		return "Mad navn = " + navn + ", m�ngde i styk = " + m�ngde;
	}
	
	
	
}
