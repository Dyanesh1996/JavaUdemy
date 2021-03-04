
public class continueStatement {

	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			
			if(i==6) {
				continue;		//1,2,3,4,5 will be printed..for 6, continue will take cursor to i++
			}
			System.out.println(i);
			
		}	
		
	}
}
