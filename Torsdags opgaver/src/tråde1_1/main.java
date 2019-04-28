package tråde1_1;

public class main {

	public static void main(String[] args) {
		Runnable s1 = new TennisSpiller1("Kaj");
		Runnable s2 = new TennisSpiller1("Andrea");
	
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s2);
		
		
		
		((TennisSpiller1) s1).setModstander((TennisSpiller1) s2);
		((TennisSpiller1) s2).setModstander((TennisSpiller1) s1);
		
		t1.start();
		t2.start();
		
		((TennisSpiller1) s1).modtagBold();
	
	}

}
