package Tråde1_med_hjælp;

public class main {

	public static void main(String[] args) {
		TennisSpiller1 s1 = new TennisSpiller1("Kaj");
		TennisSpiller1 s2 = new TennisSpiller1("Andrea");
	
		s1.setModstander(s2);
		s2.setModstander(s1);
		
		s1.start();
		s2.start();
		
		s1.modtagBold();
	
	}

}
