package pakke9;

// Use finally
public class UseFinally {
	public static void genException(int what) {
		int t;
		int nums[] = new int[2];

		System.out.println("Reciving" + what);
		try {
			switch (what) {
			case 0:
				t = 10 / what; // generate div-by-zero error
				break;
			case 1:
				nums[4] = 4; // generate array index error
				break;
			case 2:
				return; // return from block
			}
		} catch (ArithmeticException exc) {
			// catch the exception
			System.out.println(" Can't divide by Zero!");
		} catch (ArrayIndexOutOfBoundsException exc) {
			// catch the exception
			System.out.println("No matching element found.");
		} finally {
			System.out.println("Leaving try");
		}
	}
}
