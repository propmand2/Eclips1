package test;

public class Sum {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int sum2 = 0;
		
		for(int i = 3 ;i<=100;i +=3) {
			sum = sum + i;
		}
			
			
			for(int j = 5 ;j<=100;j +=5) {
				sum2 = sum2 + j;
			}
			
			
			
			System.out.println(sum+sum2);
	}

}
