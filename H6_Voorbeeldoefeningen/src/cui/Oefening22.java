package cui;

import java.util.Scanner;

public class Oefening22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String schaal = "Celsius";
		System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen):", schaal);
		int temp = input.nextInt();
		while (temp != 9999) {
			String resultaat = geefTemperatuurStatus(temp);
			System.out.printf("%d graden %s voelt aan als %s%n", temp, schaal, resultaat);
			System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen):", schaal);
			
			temp = input.nextInt();
		}
		input.close();
	}
	
	public static String geefTemperatuurStatus(int temperatuur) {
		if(temperatuur < 10) {
			return "koud";
		}
		else {
			return(temperatuur > 20 ? "warm" : "lauw");
		}
	}

}
