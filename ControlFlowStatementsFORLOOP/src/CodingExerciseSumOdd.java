
public class CodingExerciseSumOdd {

	public static void main(String[] args) {
		
		 System.out.println("Sum of odd numbers is : " + sumOdd(1, 10));
		 //System.out.println(sumOdd(-1, 10));
		 System.out.println(sumOdd(100, 1000));
	}
	
	public static boolean isOdd(int number) {
		
		if (number == 0) {
			return false;
			
		}else if(number % 2 != 0) {
			System.out.println(number + " is odd");
			return true;
			
		}else 
			System.out.println(number + " is even");
			return false;
		
	}
	
	public static int sumOdd(int start, int end) {
		int sumOfOddNumbers = 0;
		if (start <= 0 || end <= 0) {
			return -1;
			
		}else {
		
		for(int i = start; i<=end; i++) {
			
			if(isOdd(i) == true) {
				
				sumOfOddNumbers = sumOfOddNumbers + i;
				
			}
				
		}return sumOfOddNumbers;
	}
		
		
	}

}
