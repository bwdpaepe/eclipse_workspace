package cui;

import domein.Auto;

import java.util.Scanner;

public class AutoApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		int tellerAutos=0;
		int tellerGrijzeAutos=0;
		Auto myAuto;
		String kleur;
		do {
			System.out.println("Registratie auto");
			System.out.println("(1) Auto (alles standaard");
			System.out.println("(2) Auto met gekozen kleur");
			System.out.println();
			System.out.print("Wens je nog een auto te registreren?");
			invoer = input.nextInt();
			switch(invoer) {
			case 1: 
				tellerAutos++;
				myAuto = new Auto(); 
				if(myAuto.getKleur().toLowerCase().equals("grijs")) {
					tellerGrijzeAutos++;
				}
				break;
			case 2:
				tellerAutos++;
				System.out.print("Geef een kleur: ");
				kleur = input.next();
				myAuto = new Auto(kleur);
				if(myAuto.getKleur().toLowerCase().equals("grijs")) {
					tellerGrijzeAutos++;
				}
				break;
			}
			
		}while(invoer == 1 | invoer == 2);
		System.out.printf("Aantal geregistreerde auto's: %d%n", tellerAutos);
		System.out.printf("Aantal grijze auto's: %d%n", tellerGrijzeAutos);
		
		input.close();

	}

}
