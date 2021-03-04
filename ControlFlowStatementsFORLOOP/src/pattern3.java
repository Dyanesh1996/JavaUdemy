
public class pattern3 {			//we're ust merging codes for prev 2 atterns

	public static void main(String[] args) {
		
		for(int i = 1; i<= 4; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
				
			}
			
			System.out.println("");
		}
		
		
		for (int i = 1; i<=4; i++) {
			
			for(int j =3; j>=i; j--) {			// j=3 and not 4 
				System.out.print("*");
				
			}
			 	System.out.println("");
		}
		
	}

}
