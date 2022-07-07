package huiswerk2;
import java.util.Scanner;

public class Oefening3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int postcode;
		do {
			System.out.print("Geef een postcode (4 cijfers): ");
			postcode = input.nextInt();
		}while(postcode < 1000 | postcode > 9999);
		
		switch(postcode) {
		case 9300: System.out.printf("Postnummer %d komt overeen met de stad Aalst", postcode); break;
		case 2000: System.out.printf("Postnummer %d komt overeen met de stad Antwerpen", postcode); break;
		case 1000: System.out.printf("Postnummer %d komt overeen met de stad Brussel", postcode); break;
		case 9200: System.out.printf("Postnummer %d komt overeen met de stad Dendermonde", postcode); break;
		case 9000: System.out.printf("Postnummer %d komt overeen met de stad Gent", postcode); break;
		case 8500: System.out.printf("Postnummer %d komt overeen met de stad Kortrijk", postcode); break;
		case 9700: System.out.printf("Postnummer %d komt overeen met de stad Oudenaarde", postcode); break;
		case 2300: System.out.printf("Postnummer %d komt overeen met de stad Turnhout", postcode); break;
		default: System.out.printf("Postnummer %d komt niet overeen met een stad in onze lijst", postcode);
		}
		input.close();
	}

}
