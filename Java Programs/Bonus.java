import java.util.Scanner;

public class Bonus {
	
	public static void main (String [] args) {
		
		System.out.println ("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num > 6) {
			if (num > 8) {
				System.out.println("Num is greater than 8");
			}
			else {
				System.out.println("Num is greater than 6 but smaller than 9");
				
				}
			
			}
		else {
			System.out.println ("Num is less than 6..haha!");
			}
		}
	
}
