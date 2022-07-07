package huiswerk2;
import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int deler;
		do {
			System.out.print("Geef een strikt positieve deler in: ");
			deler = input.nextInt();
		}while(deler<=0);
		int invoer;
		int teller=1;
		int a=0;
		do {
			System.out.printf("Geef een positief getal %d in (of stop met -1): ", teller);
			teller++;
			invoer = input.nextInt();
			if(invoer%deler == 0) {
				a++;
			}
		}while(invoer!=-1);
		if(a > 1) {
			System.out.printf("Er zijn %d getallen deelbaar door %d%n", a, deler);
		}
		else if(a == 1) {
			System.out.printf("Er is 1 getal deelbaar door %d%n", deler);
		}
		else {
			System.out.printf("Er is geen enkel getal deelbaar door %d%n", deler);
		}
		
		input.close();

	}

}
