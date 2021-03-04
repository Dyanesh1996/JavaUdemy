
public class swicthChallenge {

	public static void main(String[] args) {
			
		
		char letter = 'A';		// can be done for String also
		
		
		switch(letter) {
		
			case 'A' : case 'B' : case 'C' : case 'D' : case 'E': 
				System.out.println("It's A or B or C or D or E");
				System.out.println("It's " + letter + " to be precise");
				break;
		
				default : 
					System.out.println("It's something else");
		
		}
		
		String month = "JANUARY";

		switch(month.toLowerCase()) {		//converts uppercase input string to lowercase string
		
			case "january" : 
			System.out.println("Jan");
			break;
			
			
			case "February" : 
			System.out.println("Feb");	
			break;
			
			
			case "March" : case "April" : case  "May" :
				System.out.println("Mar or Apr or Mayy");
				break;
				
				
			default : 
				System.out.println("None of the above");		
		}
	}	
	
				
		
		
		
		
}
