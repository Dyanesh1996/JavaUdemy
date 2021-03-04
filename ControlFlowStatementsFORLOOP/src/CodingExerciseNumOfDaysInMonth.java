
public class CodingExerciseNumOfDaysInMonth {

	public static void main(String[] args) {
		System.out.println(isLeapYear(2020));
		System.out.println(isLeapYear(2017));
		System.out.println(getDaysInMonth(2, 2017));
		
	}
	
	public static boolean isLeapYear(int year) {
		if (year >=1 && year <=9999) {
			
			if ((year % 4 ==0) && (year % 100 != 0) || (year % 400 ==0)) {
				
				System.out.println("It's a leap year");
				return true;
			}
			else 
				return false;
			
		}
		else 
			return false;
		
		
	}
	
	public static int getDaysInMonth(int month, int year) {
		
		if (month <1 || month >12 || year <1 || year >9999){
			return -1;
			
		}else {
			switch (month) {
			case 4: case 6: case 9: case 11: 
				return 30;
		
			case 2: 
				return isLeapYear(year) ? 29 : 28;		
				
			default :			
				return 31;
			}			
		}			
	}
}
