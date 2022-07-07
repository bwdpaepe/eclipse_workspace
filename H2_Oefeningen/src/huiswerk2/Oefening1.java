package huiswerk2;
import java.util.Scanner;

public class Oefening1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Geef eerste getal: ");
		int getal1 = input.nextInt();
		System.out.print("Geef tweede getal: ");
		int getal2 = input.nextInt();
		System.out.print("Geef derde getal: ");
		int getal3 = input.nextInt();
		System.out.printf("Van de ingevoerde getallen %d, %d en %d%n", getal1, getal2, getal3);
		System.out.printf("is de som %d%n", getal1 + getal2 + getal3);
		System.out.printf("het gemiddelde %d%n", (getal1 + getal2 + getal3) / 3);
		System.out.printf("de rest %d%n", (getal1 + getal2 + getal3) % ((getal1 + getal2 + getal3) / 3));
		int grootste;
		if(getal1 > getal2) {
			grootste = getal1;
	
		}
		else {
			grootste = getal2;
		}
		if(getal3 > grootste) {
			grootste = getal3;
		}
		System.out.printf("en het grootste getal %d%n", grootste);
		input.close();

	}

}
