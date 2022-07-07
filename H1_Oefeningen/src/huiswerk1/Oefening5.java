package huiswerk1;

import java.util.Scanner;

public class Oefening5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lengte, breedte;
		Scanner input = new Scanner(System.in);
		System.out.print("Geef de lengte van de rechthoek in:");
		lengte = input.nextInt();
		System.out.print("Geef de breedte van de rechthoek in:");
		breedte = input.nextInt();
		System.out.printf("De omtrek = %d%n", ((lengte + breedte) * 2));
		System.out.printf("De oppervlakte = %d", (lengte * breedte));
		input.close();

	}

}
