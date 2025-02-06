import java.util.Scanner;

public class FormInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println ("Please enter your fisrt name:");
		Scanner scan = new Scanner (System.in);
		String fname = scan.nextLine();
		
		System.out.println ("Please enter your last name:");
		String lname = scan.nextLine();
		
		String fullname = fname+" " +lname;
		System.out.println("You entered " +fullname);

	}

}
