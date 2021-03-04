
public class SwitchStatement {

	public static void main(String[] args) {
		
		int SwitchValue = 1;
		
		
		switch(SwitchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		
		case 2 :
			System.out.println("Value was 2");
			break;
			
			
		case 3: case 4: case 5:		//rather writing cases for each value, it can also be written in same line like this
			System.out.println("Value was 3 or 4 or 5");
			break;
			
		default :
			System.out.println("Value was not 1 or 2");
			break;
			
		}
		
	}

}
