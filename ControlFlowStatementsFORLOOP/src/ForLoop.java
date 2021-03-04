
public class ForLoop {

	public static void main(String[] args) {
			
		for (int i=2; i<9; i++) {		//loop from 2 to 8
			
			System.out.println("10000 at " + i + "% interest rate is : " + calculateInterest(10000, i));
				
		}	
		System.out.println("************************************");
		
		for (int i=8; i>1; i--) {		//reverse loop from 8 to 2
			
			System.out.println("10000 at " + i + "% interest rate is : " + calculateInterest(10000, i));
				
		}		
		
		
	}

	public static double calculateInterest(double amount, double interestRate) {
			
			return (amount * (interestRate/100));
		}	
		
	}

