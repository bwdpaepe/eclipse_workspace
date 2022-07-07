package cui;

import java.util.Scanner;

import domein.Rekening;

public class Oefening212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		Rekening[][] rekening = new Rekening[3][];
		
		
		for(int i = 0 ; i < rekening.length; i++) {
			System.out.printf("Geef aantal kolommen in voor rij %d: ", i+1);
			int aantalKol = input.nextInt();
			rekening[i] = new Rekening[aantalKol];
			
		}
		double bedrag = 0.0;
		for(int i = 0 ; i < rekening.length; i++) {
			for(int j = 0; j < rekening[i].length;j++) {
				bedrag = (((double)j)+1) * 10.0 + (double)i;
				rekening[i][j] = new Rekening();
				rekening[i][j].stortOp(bedrag);
			}
		}
		
		for(Rekening[] rij: rekening) {
			for(Rekening cel: rij) {
				System.out.printf("%.2f\t", cel.getSaldo());
			}
			System.out.println();
		}
		
		input.close();

	}

}
