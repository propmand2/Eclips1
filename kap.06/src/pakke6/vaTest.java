package pakke6;

// Demonstrate variable-length arguments
public class vaTest {
	
	//varTest () uses a vararg.
	static void vaTest(int... v) {
		System.out.println("Numbr of args: " + v.length);
		System.out.println("contents: ");
		
		for(int i=0; i < v.length; i++)
			System.out.println(" arg " + i + ": " + v[i]);
		System.out.println();
	}

	public static void main(String[] args) {
	{
	
	// Notice how avTest() can be called with a
	// variable number of arguments
	vaTest(10);			//1 arg
	vaTest(1, 2, 3);	// 3 arg
	vaTest();			// no arg

}
	}
}

