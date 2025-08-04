package pac2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//Define date format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		//Accept input date
		System.out.println("Enter a date(dd-MM-yyyy): ");
		String inputDateStr = sc.nextLine();
		
		LocalDate inputDate = LocalDate.parse(inputDateStr,formatter);
		
		LocalDate currentDate = LocalDate.now();
		
		//calculate the duration
		Period duration = Period.between(inputDate, currentDate);
		
		System.out.println("Duration from "+inputDate.format(formatter)+ "to" + currentDate.format(formatter)+ ":");
		System.out.println(duration.getYears()+"Years," +
		duration.getMonths()+ "Months," +
				duration.getDays()+ "Days");
		
		sc.close();
	}

}
