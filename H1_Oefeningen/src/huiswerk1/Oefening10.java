package huiswerk1;
import java.util.Scanner;

public class Oefening10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int getal1, getal2, getal3;
		
		System.out.print("Geef eerste getal in: ");
		getal1 = input.nextInt();
		System.out.print("Geef tweede getal in: ");
		getal2 = input.nextInt();
		System.out.print("Geef derde getal in: ");
		getal3 = input.nextInt();
		System.out.printf("Van de ingevoerde getallen %d, %d en %d%nis de som %d%nhet gemiddelde %d%nen de rest %d%n", getal1, getal2, getal3, getal1+getal2+getal3, (getal1+getal2+getal3)/3, (getal1+getal2+getal3)%3);

		input.close();
	}

}
