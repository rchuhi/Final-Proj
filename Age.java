import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*Reginah Chuhi
CIS219
Tuesday and Thursday 3:30pm
  
 */
public class Age {

	public static void main(String[] args) {
		//gets users date of birth and checks to make sure it valid
		
		Scanner scan=new Scanner(System.in);	
		System.out.println("Enter your date of Birth, it must be between 1-31: ");
		int date= scan.nextInt();
		if (date > 31) {
			 System.out.println("Please enter a valid Date, it must be between 1-31");
		main(args);}
		//gets users Year of birth and checks to make sure it valid
		System.out.println("Enter your year of Birth, it must be in the YYYY format: ");
		int year= scan.nextInt();
		if (year <1900) {
			 System.out.println("Please enter a valid Year, it must be in the YYYY format");
			 main(args);}
		//gets users Month of birth and checks to make sure it valid
		System.out.println("Enter your month of Birth, it must be between 1-12: ");
		int month= scan.nextInt();
		if (month > 12) {
			 System.out.println("Please enter a valid month, it must be between 1-12");
			 main(args);}
		//outputs a message depending on the month of birth
		switch (month) {
	      case 1:
	        System.out.println(date + " January " + year + " Your sign is Baobab Tree ");
	        break;
	      case 2:
	        System.out.println(date + " February " + year + " Yoyr sign is Amber and Silver ");
	        break;
	      case 3:
	        System.out.println(date + " March " + year+ " Your Sign is Family");
	        break;
	      case 4:
	        System.out.println(date+ " April "+ year + " Your sign is Service to community ");
	        break;
	      case 5:
	        System.out.println(date + " May " +year+" Your sign is Market");
	        break;
	      case 6:
	        System.out.println(date+ " June "+ year+ " Your sign is the Ancestor");
	        break;
	      case 7:
	        System.out.println(date+ " July "+ year + " Your sign is Judge");
	        break;
	      case 8:
		        System.out.println(date + " August " + year +  " Your sign is Kola Nut");
		        break;
	      case 9:
		        System.out.println(date+ " September " + year+ " Your sign is Traveller");
		        break;
		        
	      case 10:
		        System.out.println(date +" October " + " Your sign is Distance");
		        break;
	      case 11:
		        System.out.println(date + " November " + year +" Your sign is Child of the world");
		        break;
	      case 12:
		        System.out.println(date + " December " + year + " Your sign is Harvest");
		        break;}
		
		//Calculates the age of the user according to his input
				LocalDate BirthDate=LocalDate.of(year, month, date);
				LocalDate today=LocalDate .now();
				System.out.println(BirthDate);

				int age=Period.between(BirthDate, today).getYears();
			
				System.out.println("You are "+ age + " Years old");	
	}	

		
}
