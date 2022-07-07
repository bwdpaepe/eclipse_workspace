package werkcollege1;

import java.util.Scanner;

public class Oefening4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x,y,z,resultaat;
		System.out.print("Geef eerste getal: ");
		x = input.nextInt();
		System.out.print("Geef tweede getal: ");
		y = input.nextInt();
		System.out.print("Geef derde getal: ");
		z = input.nextInt();
		resultaat = x * y * z;
		System.out.println("Vermenigvuldiging = " + resultaat);
		//System.out.println("Vermenigvuldiging = " + resultaat);
		input.close();

	}

}
