package pakke6;


public class SDemo {
	public static void main(String[] args) {
		StaticDemo ob1 = new StaticDemo ();
		StaticDemo ob2 = new StaticDemo ();

		// each object has its own copy of an instance variable.
		ob1.x = 10;
		ob2.x = 20;
		System.out.println("Of course, ob1.x and ob2.x " + "are independent");
		System.out.println("ob1.x: " + ob1.x + "\nob2.x: " + ob2.x );
		System.out.println();
		
		// Each object shares one copy of a static variable.
		System.out.println("the static variable y is shared");
		StaticDemo.y = 19;
		System.out.println(" Set staticDemo.y to 19");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
		
		StaticDemo.y = 100;
		System.out.println(" Change staticDemo.y to 100");
		
		System.out.println("ob1.sum(): " + ob1.sum());
		System.out.println("ob2.sum(): " + ob2.sum());
		System.out.println();
	}

}
