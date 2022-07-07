package cui;

import java.util.Scanner;

public class Oefening25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input  = new Scanner(System.in);
		int[] getallen = new int[10];
		for(int i = 0 ; i < 10; i++) {
			System.out.printf("Geef getal %d: ", i+1);
			getallen[i] = input.nextInt();
			
		}
		System.out.print("Geef nog een extra getal: ");
		int extraGetal = input.nextInt();
		System.out.printf("Deze getallen zijn strikt groter dan %d:%n", extraGetal);
		System.out.printf("%s\t%s", "Index", "Waarde");
		for(int i = 0 ; i < getallen.length; i++) {
			if(getallen[i] > extraGetal) {
				System.out.printf("%5d\t%6d%n", i, getallen[i]);
			}
		}
		
		input.close();

	}

}
