package acadgild;
import java.util.Scanner;

public class PrintMonDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the month in Captial Letters  : :  ");
		String s = in.next();
		System.out.println(s);
		switch(s.toUpperCase()){
		case "JANUARY":
			System.out.println("No of days in January are 31");
			break;
		case "FEBRUARY":
			System.out.println("No of days in February are 28/29");
			break;
		case "MARCH":
			System.out.println("No of days in March are 31");
			break;
		case "APRIL":
			System.out.println("No of days in April are 30");
			break;
		case "MAY":
			System.out.println("No of days in May are 31");
			break;
		case "JUNE":
			System.out.println("No of days in June are 30");
			break;
		case "JULY":
			System.out.println("No of days in July are 31");
			break;
		case "AUGUST":
			System.out.println("No of days in August are 31");
			break;
		case "SEPTEMBER":
			System.out.println("No of days in September are 30");
			break;
		case "OCTOBER":
			System.out.println("No of days in October are 31");
			break;
		case "NOVEMBER":
			System.out.println("No of days in November are 30");
			break;
		case "DECEMBER":
			System.out.println("No of days in December are 31");
			break;
		default :
			System.out.println("Please enter correct month");
		}
	}

}
