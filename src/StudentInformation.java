
import java.util.Scanner;

public class StudentInformation {



/**

*

* Name: Marsha Guimond

* Teacher: Mr.Hardman

* Assignment 3, Program 2

* Date Last Modified: October 27, 2016

*

*/

public static void main(String[] args) {
	
	
	
		Scanner userInput = new Scanner(System.in);
	
		String firstName;
		String lastName;
		String login;
		int userID;
		double average;
		int grade;
		
		
		System.out.println("Please fill out the information below.");
		
		System.out.println("What is your login?  ");
		login = userInput.nextLine();
		
		System.out.println("What is your ID: ");
		userID = userInput.nextInt();
		
		System.out.println("What is your first name? ");
		firstName = userInput.next();
		
		System.out.println("What is your last name? ");
		lastName = userInput.next();
		
		System.out.println("What is your average? ");
		average = userInput.nextDouble();
		
		System.out.println("What grade are you in?");
		grade = userInput.nextInt();
		
		System.out.println("\n" + "Your information:");
		System.out.println( String.format("%-13s" + login, "Login: ") );
		System.out.println( String.format("%-13s" + userID, "ID: ") );
		System.out.println( String.format("%-13s" + lastName + ", " + firstName, "Name: ") ); 
		System.out.println( String.format("%-13s" + average, "Average: ") );
		System.out.println( String.format("%-13s" + grade, "Grade: ") );
		
		
		userInput.close();
		
		
	}

}
