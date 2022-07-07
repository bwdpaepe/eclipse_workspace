package huiswerk2;
import java.util.Scanner;
public class Oefening7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		int a2 = 0, a3 = 0, a6 = 0;
		System.out.print("Geef een positief geheel getal (stoppen met 0): ");
		invoer = input.nextInt();
		while(invoer != 0) {
			
			if(invoer % 6 == 0) {
				a2++;
				a3++;
				a6++;
			}
			else if(invoer % 3 == 0) {
				a3++;
			}
			else if(invoer % 2 == 0) {
				a2++;
			}
			System.out.print("Geef een positief geheel getal (stoppen met 0): ");
			invoer = input.nextInt();
		} 
		
		if(a2 > 1) {
			System.out.printf("Er zijn %d getallen deelbaar door 2%n", a2);
		}
		else if(a2 == 1) {
			System.out.println("Er is 1 getal deelbaar door 2%n");
		}
		else {
			System.out.println("Er is geen enkel getal deelbaar door 2%n");
		}
		if(a3 > 1) {
			System.out.printf("Er zijn %d getallen deelbaar door 3%n", a3);
		}
		else if(a3 == 1) {
			System.out.println("Er is 1 getal deelbaar door 3%n");
		}
		else {
			System.out.println("Er is geen enkel getal deelbaar door 3%n");
		}
		if(a6 > 1) {
			System.out.printf("Er zijn %d getallen deelbaar door 6%n", a6);
		}
		else if(a6 == 1) {
			System.out.println("Er is 1 getal deelbaar door 6%n");
		}
		else {
			System.out.println("Er is geen enkel getal deelbaar door 6%n");
		}
		
		input.close();

	}

}
