package huiswerk2;
import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		
		do {
			System.out.print("Geef een strikt positief geheel getal in: ");
			invoer = input.nextInt();
		}while (invoer <= 0);
		
		int teller=0;
		while(invoer != 1) {
			if(invoer%2==0) {
				invoer/=2;
			}
			else {
				invoer = invoer*3 + 1;
			}
			teller++;
		}
		System.out.printf("Het getal wijzigt %d keer", teller);
		
		input.close();

	}

}
