package cui;

import java.util.Scanner;

import domein.Rekening;
import domein.RekeningOperaties;

public class Oefening27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rekening[] array = new Rekening[9];
		double[] saldo = {100,777.77,287.15,-350.00,399.99,123.45,987.65,-68.18,413.26};
		String[] alfabet = {"A","B","C","D","E","F","G","H","I"};
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = new Rekening(i,alfabet[i]);
			array[i].stortOp(saldo[i]);
			
		}
		Oefening27 app = new Oefening27();
		Scanner input = new Scanner(System.in);
		int wilJeNogStorten;
		do {
			app.stortOpRekeningen(array);
			System.out.print("Wil je nog storten op een rekening (ja=1): ");
			wilJeNogStorten = input.nextInt();
		}while(wilJeNogStorten==1);
		System.out.println("Beginsituatie");
		app.toonRekeningen(array);
		array[0].haalAf(299);
		array[1].stortOp(50);
		array[2].schrijfBedragOverNaar(20, array[0]);
		
		System.out.println("Eindsituatie");
		app.toonRekeningen(array);
		
		input.close();
		
	}
	
	private void toonRekeningen(Rekening[] rekeningen) {
		for(Rekening singleRekening: rekeningen) {
			toon1Rekening(singleRekening);
		}
	}
	
	private void toon1Rekening(Rekening r) {
		//r.toString();
		System.out.print(r);
	}
	
	private void stortOpRekeningen(Rekening[] rekeningen) {
		Scanner input = new Scanner(System.in);
		int rekeningIndex;
		do {
		 System.out.printf("Geef nummer van de rekening [1 - %d]: ", rekeningen.length);
		 rekeningIndex = input.nextInt();
		}while(rekeningIndex >rekeningen.length);
		System.out.print("Geef het bedrag: ");
		//input.nextDouble();
		double stortBedrag = input.nextDouble();
		RekeningOperaties.stortOpEenRekening(rekeningIndex-1, stortBedrag, rekeningen);
		
		input.close();
		
	}

}
