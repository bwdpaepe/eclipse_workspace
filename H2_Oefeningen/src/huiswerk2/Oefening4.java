package huiswerk2;
import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int afstand, uren;
		float minuten;
		do {
			System.out.print("Geef een afstand in kilometer (strikt positief geheel getal): ");
			afstand = input.nextInt();
		}while(afstand <= 0);
		for(int i = 40; i<=140; i+=10) {
			uren = afstand / i;
			minuten = ((float)afstand / (float)i) * 60;
			
			System.out.printf(" %d km\t%3d km/u\t%d u %2.0f min%n", afstand, i, uren, minuten);
		}
		input.close();

	}

}
