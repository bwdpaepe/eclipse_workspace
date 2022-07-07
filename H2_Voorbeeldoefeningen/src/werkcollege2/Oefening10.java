package werkcollege2;
import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		do {
			System.out.print("geef strikt negatief getal: ");
			invoer = input.nextInt();
		}while(invoer >= 0);
		System.out.printf("jouw invoer: %d", invoer);
		
		
		
		int invoer2;
		do {
			System.out.print("geef eerste getal: ");
			invoer = input.nextInt();
			System.out.print("geef tweede getal: ");
			invoer2 = input.nextInt();
		}while(((invoer == 1000) || (invoer % 12 == 0)) && (invoer < invoer2));
		
		System.out.printf("jouw invoer: %d en %d", invoer, invoer2);
		
		
		
		
		
		input.close();
	}

}
