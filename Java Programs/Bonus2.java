import java.util.Scanner;


public class Bonus2 {
	
public static void main (String [] args) {
		
		System.out.println ("Enter a number:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if (num > 10) {
			if (num > 12) {
				System.out.println("Num is greater than 12");
			}
			else {
				System.out.println("Num is greater than 10 but smaller than 12");
				
				}
			
			}
		else {
			System.out.println ("Num is less than 10..haha!");
			}
		}

}
