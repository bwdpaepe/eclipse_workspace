package cui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Oefening21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double invoer;
		List<Double> nulPositief = new ArrayList<>();
		
		do {
			System.out.print("Geef een positief bedrag, stop met -1: ");
			invoer = input.nextDouble();
			if(invoer >= 0) {
				nulPositief.add(invoer);
			}
			
		} while(invoer != -1);
		
		if(nulPositief.size() > 0) {
			System.out.print("De lijst met bedragen:");
			for(double element: nulPositief) {
				System.out.printf("\t%.2f", element);
			}
		}
		else {
			System.out.print("De lijst is leeg!");
			
		}
		
		input.close();
	}

}
