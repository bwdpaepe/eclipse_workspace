package werkcollege2;
import java.util.Scanner;
import java.lang.Integer;
public class Oefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer = 0, gemiddelde = 0, teller = 0;
		while(invoer != -1) {
			System.out.print("Voer geheel getal in, -1 stopt de invoer en print het gemiddelde van de negatieve getallen:");
			invoer = input.nextInt();
			gemiddelde = invoer < -1 ? gemiddelde+invoer : gemiddelde;
			teller = invoer < -1 ? teller+1 : teller;
			
		}
		
		if(teller == 0) {
			System.out.println("Er werden geen negatieve getallen ingevoerd!");
		}
		else {
			System.out.printf("Het gemiddelde van de negatieve getallen is %d.", gemiddelde/teller);
		}
		
		int minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
		invoer = 1;
		teller = 0;
		
		while(invoer != 0) {
			System.out.print("Voer geheel getal in, 0 stopt de invoer en print min en max:");
			invoer = input.nextInt();
			teller++;
			minimum = invoer < minimum ? invoer : minimum;
			maximum = invoer > maximum ? invoer : maximum;
		}
		if(teller == 1) {
			System.out.println("error");
		}
		else {
			System.out.printf("minimum: %d", minimum);
			System.out.printf("maximum: %d", maximum);
		}
		input.close();
	}

}
