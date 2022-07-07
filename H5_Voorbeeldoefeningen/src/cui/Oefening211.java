package cui;

import java.util.Scanner;

public class Oefening211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		double gem = 0.0;
		double table[][] = new double[3][2];
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j++) {
				System.out.printf("Geef getal op rij %d en kolom %d: ", i+1, j+1);
				table[i][j] = input.nextDouble();
			}
		}
		
		// bereken gem (eigenlijk kunt ge da onmiddellijk doen, maar hier willen we enhanced for oefenen
		
		int counter = 0;
		for(double[] rij: table) {
			for(double cel: rij) {
				gem += cel;
				counter++;
			}
		}
		
		if(counter !=0) {gem /= counter;}
		
		String uitvoer = String.format("gemiddelde is %.1f", gem);
		System.out.print(uitvoer);
		
		input.close();

	}

}
