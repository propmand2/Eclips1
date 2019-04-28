package pakke6;


// Use a static block
public class StaticBlock {
	static double rootof2;
	static double rootof3;
	
	static {
		System.out.println("Inside static block ");
		rootof2 = Math.sqrt(2.0);
		rootof3 = Math.sqrt(3.0);
	}
	StaticBlock (String msg) {
		System.out.println(msg);
	}
}
