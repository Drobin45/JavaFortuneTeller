import java.util.Scanner;

public class FortuneTeller {
	
	public static void main(String[] args) {
// Goals: Have program ask for user data, use user data to output new data, consolidate data at end of program
	
	
	//Introduction and asking for data
	//Needed data: Name, Age, Number of Siblings, Favorite ROYGBIV Color, Birthmonth as Integer
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Welcome to the fortune teller program! \n");
	
	System.out.println("What is your first name?");
	String firstName = input.nextLine();
	
	System.out.println("What is your last name?");
	String lastName = input.nextLine();
	
	System.out.println("How old are you?");
	int age = input.nextInt();
	
	System.out.println("How many siblings do you have?");
	int siblings = input.nextInt();
	
	System.out.println("Yes or No. Do you know what ROYGBIV stands for?");
	boolean ROYQuestion = input.hasNext();
	
	if (ROYQuestion == false)
	{
		System.out.println("ROYGBIV stands for Red, Orange, Yellow, Green, Blue, Indigo, or Violet."
				+ "Please choose your favorite of these colors. Please spell carefully!");
	}
	
	else 
	{
		System.out.println("Great! Which is your favorite ROYGBIV color then? Please spell carefully!");
	}
	String favColor = input.next();
			
	
}
}
