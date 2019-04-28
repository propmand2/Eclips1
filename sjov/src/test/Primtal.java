package test;

public class Primtal {

	public static void main(String[] args) {
	
			
			
			for(long i = 2; i <= 1001;i++ ) {
				
				
				for(long j = 2; j<=i;j++) {
					
					if(j==i)
					{
						System.out.println(i);
					}
					if(i%j==0)
					{
						break;
					}
				}
			}
				
			

		}

	}


	


