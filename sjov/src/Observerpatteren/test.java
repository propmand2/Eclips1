package Observerpatteren;

public class test {

	public static void main(String[] args) {
		
		PC pc = new PC();
		
		Bruger bruger = new Bruger(pc);
		
		
		pc.setantal(5);
		pc.setantal(10);
		pc.setantal(8);
		
		
		Bruger bruger2 = new Bruger(pc);
		
		pc.setantal(6);
		pc.setantal(15);
		pc.setantal(70);

	}

}
