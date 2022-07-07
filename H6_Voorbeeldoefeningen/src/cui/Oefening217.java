package cui;

import java.util.Scanner;

public class Oefening217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gem;
		int[][] table = new int[3][2];
		voerGetalIn(table);
		gem = berekenGemiddelde(table);
		String uitvoer = String.format("gemiddelde is %.1f", gem);
		System.out.print(uitvoer);

	}
	
	private static void voerGetalIn(int[][] table) {
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i < table.length ; i++) {
			for(int j = 0 ; j < table[i].length ; j++) {
				System.out.printf("Geef waarde op rij %d en kolom %d: ", i+1, j+1);
				table[i][j] = input.nextInt();
			}
		}
		
		input.close();
		
	}
	
	private static double berekenGemiddelde(int[][] table) {
		double gem=0.0;
		for(int[] rij: table) {
			for(int cel: rij) {
				gem+=cel;
			}
		}
		gem/=(table.length * table[0].length);
		return gem;
	}

}
