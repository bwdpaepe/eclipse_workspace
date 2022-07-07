package cui;

import java.util.Scanner;

import domein.Kapitaal;

public class Oefening216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int startKapitaal;
		int aantalJaar;
		int intrest;
		double opbrengst;
		Kapitaal kap;
		System.out.println("Geef het startkapitaal (0 om te stoppen): ");
		startKapitaal = input.nextInt();
		while(startKapitaal != 0) {
			do {
				System.out.println("Geef het aantal jaar: ");
				aantalJaar = input.nextInt();
			}while(aantalJaar < 0);
			do {
				System.out.println("Geef de intrestvoet [0-100]: ");
				intrest = input.nextInt();
			}while(intrest < 0 || intrest > 100);
			
			kap=new Kapitaal((double)startKapitaal, (double)intrest);
			opbrengst = kap.berekenKapitaalNaNJaar(aantalJaar);
			System.out.printf("Het kapitaal van €%d groeit bij een interest van %d na %d aan tot %f.%n", startKapitaal, intrest, aantalJaar, opbrengst);
			System.out.println("Geef het startkapitaal (0 om te stoppen): ");
			startKapitaal = input.nextInt();
		}
		
		
		input.close();
	}

}
