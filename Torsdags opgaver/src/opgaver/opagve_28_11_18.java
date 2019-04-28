package opgaver;

public class opagve_28_11_18 {

	public static void main(String[] args) {

		int[] t = { 3, 5, 4, 1, 1, 7, 4, 9, 9, 2, 5 };
		int n = 10;

		for (int i = 1; i < n; i++) {
			if (t[i] > t[i - 1] && t[i] > t[i + 1]) {
				if(n == 10)
				System.out.println("top:" + t[i]);
				
			
			if (t[i] < t[i - 1] && t[i] < t[i + 1]) {
					System.out.println("bund:" + t[i]);

				}
			}
		}
	}
}

