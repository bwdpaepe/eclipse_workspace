package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Oefening22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		List<Integer> achtCijfers = new ArrayList<>();
		
		do {
			System.out.print("Geef een getal van 8 cijfers: ");
			invoer = input.nextInt();
			
			
		} while(invoer / 10000000 >= 10 || invoer / 10000000 < 1);
		
		for(int i = 7; i>=0;i--) {
			achtCijfers.add((int)(invoer/Math.pow(10, i)));
			invoer = (int)(invoer % Math.pow(10, i));
		}
		
		List<Integer> uniek = new ArrayList<>();
		for(int cijfer: achtCijfers) {
			if(!uniek.contains(cijfer)) {
				uniek.add(cijfer);
			}
		}
		
		System.out.println("Alle verschillende cijfers in dit geval (in volgorde van voorkomen) zijn:");
		for(int cijfer: uniek) {
			System.out.printf("\t%d", cijfer);
		}
		input.close();
	}

}
