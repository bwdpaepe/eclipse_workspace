package werkcollege3;

import java.util.Scanner;

import werkcollege3.Driehoek;
import werkcollege3.Rechthoek;


public class GeometrieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int invoer;
		double lengte,breedte = 0.0;
		int a,b,c=0;
		Rechthoek r4;
		Driehoek d3;
		int teller=0;
		int aantalRechthoekenGroterDan50=0;
		int aantalRechthoekigeDriehoeken=0;
		do {
			System.out.print("Wil je graag nog een vorm ingeven (1 = rechthoek; 2 = driehoek; 0 om te stoppen): ");
			invoer = input.nextInt();
			switch (invoer) {
			case 1: 
				teller++;
				System.out.print("Geef de lengte van de rechthoek: ");
				lengte = input.nextDouble();
				System.out.print("Geef de breedte van de rechthoek: ");
				breedte = input.nextDouble();
				r4 = new Rechthoek(lengte,breedte);
				if(r4.berekenOppervlakte()>50) {
					aantalRechthoekenGroterDan50++;
				}
				break;
			case 2: 
				teller++;
				System.out.print("Geef de lengte van zijde A: ");
				a = input.nextInt();
				System.out.print("Geef de lengte van zijde B: ");
				b = input.nextInt();
				System.out.print("Geef de lengte van zijde C: ");
				c = input.nextInt();
				d3 = new Driehoek(a,b,c);
				if(d3.isRechthoekigeDriehoek()) {
					aantalRechthoekigeDriehoeken++;
				}
				break;
			}
			
		}while(invoer != 0);
		System.out.println("Overzicht vormen: ");
		System.out.printf("Totaal aantal vormen: %d%n", teller);
		System.out.printf("Aantal rechthoeken met opp > 50: %d%n", aantalRechthoekenGroterDan50);
		System.out.printf("Aantal rechthoekige driehoeken: %d%n", aantalRechthoekigeDriehoeken);
		input.close();
	}

}
