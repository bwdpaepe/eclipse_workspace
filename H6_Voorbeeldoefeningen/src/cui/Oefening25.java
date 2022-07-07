package cui;

import java.util.Scanner;

public class Oefening25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				System.out.print("Geef de schaal: Celcius of Fahrenheit (C=1 of F=2): ");
				int codeSchaal = input.nextInt();
				String schaal = "Fahrenheit";
				char cOfF = 'F';
				if(codeSchaal == 1) {
					schaal = "Celsius";
					cOfF = 'C';
				}
				
				System.out.printf("Geef de temperatuur in graden %s (9999 om te stoppen):", schaal);
				int temp = input.nextInt();
				while (temp != 9999) {
					String resultaat = geefTemperatuurStatus(temp, cOfF);
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
			
			public static String geefTemperatuurStatus(int temperatuur, char cOfF) {
				if(cOfF == 'F') {
					int cTemp = (temperatuur - 32) * 5 / 9;
					return (geefTemperatuurStatus(cTemp));
				}
				else {
					return (geefTemperatuurStatus(temperatuur));
				}
			}

}
