package opgaver;

import java.util.*;

public class opgave_11_12_18 {

	public static void main(String[] args) {

		int[] t = { 3, 1, 2, 5, 5, 1, 6, 1, 2, 5, 4 };
		int[] target = { 1, 2, 5 };
		int[] replace = { 3, 1, 2 };

		for (int k = 0; k < t.length; k++) {

			for (int i = 0; i < replace.length; i++) {

				for (int j = 0; j < target.length; j++) {

					if (t[k] == target[j]) {
			//	System.out.println("target found: index=" + k);
					
//						System.out.println(t[k]);
//						System.out.println(target[j]);
//						System.out.println();
					}
						
				



						// if (t[k] == target[j])
						// replace.replace(target[j])
						// System.out.println(t);
					}

				}

			}

}

}
//}
