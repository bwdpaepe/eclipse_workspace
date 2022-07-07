package cui;

import java.util.Scanner;

import domein.Vierkant;

public class Oefening26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Geef de zijde van het vierkant in : ");
		int z = scan.nextInt();
		scan.nextLine();
		System.out.print("Geef het karakter in : ");
		String kar = scan.nextLine();
		String res;
		if(kar.length() == 0) {
			res = Vierkant.maakVierkant(z);
		}
		else {
			res = Vierkant.maakVierkant(z, kar.charAt(0));
		}
		System.out.println(res);
	}

}
