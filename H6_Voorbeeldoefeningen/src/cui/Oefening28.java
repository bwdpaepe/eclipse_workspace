package cui;

import java.util.Scanner;

import domein.KopOfMunt;

public class Oefening28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welkom bij het spel \"Kop of munt\"");
		System.out.println("Raad 10 keer of een worp kop of munt zal opleveren.");
		System.out.println("Uw score wordt bepaald door het aantal juiste voorspellingen.");
		
		int aantalWorpen = 10;
		KopOfMunt[] km = new KopOfMunt[aantalWorpen];
		
		/*for(int i=0;i<aantalWorpen;i++) {
			km[i]=new KopOfMunt();
		}*/
		
		Oefening28 app = new Oefening28();
		app.speelSpel(km);
		System.out.println(app.geefOverzicht(km));

	}
	
	private void speelSpel(KopOfMunt[] spel) {
		
		Scanner input = new Scanner(System.in);
		int invoer;
		
		for(int i=0;i<spel.length;i++) {
			spel[i]=new KopOfMunt();
			System.out.printf("Worp %d: wordt het kop (1) of munt (2)?", i+1);
			invoer = input.nextInt();
			spel[i].setGeraden(invoer==1);
		}
		
		input.close();
	}
	
	private String geefOverzicht(KopOfMunt[] spel) {
		int score = 0;
		String uitvoer = String.format("%10s%10s%10s%n", "WORP", "GERADEN", "EVALUATIE");
		for(KopOfMunt enkelSpel: spel) {
			uitvoer += enkelSpel.geefInfoWorp();
			if (enkelSpel.isJuistGeraden())
                score++;
		}
		uitvoer += String.format("%nJe haalt %d op %d%n", score, spel.length);
        return uitvoer;
	}

}
