package werkcollege1;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int maandSalaris, jaarSalaris, vakantieGeld;
		
		System.out.print("Geef maandsalaris in euro: ");
		maandSalaris = input.nextInt();
		
		jaarSalaris = maandSalaris * 12;
		System.out.println("jaarsalaris = " + jaarSalaris + "€");
		
		vakantieGeld = (jaarSalaris * 8) / 100;
		System.out.println("vakantiegeld = " + vakantieGeld + "€");
		input.close();

	}

}
