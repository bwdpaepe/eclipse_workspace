package cui;

import java.util.Scanner;
import java.util.Random;


public class Oefening29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		Oefening29 app = new Oefening29();
		app.voerGetallenIn(array1);
		app.bepaalRandomGetallen(array2);
		app.toonArray("Door jou gekozen getallen", array1);
		app.toonArray("Door het systeem gekozen getallen", array2);
		app.bepaalZelfde(array1, array2);

	}
	
	private void voerGetallenIn(int[] ingevoerd) {
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < ingevoerd.length; i++) {
			System.out.printf("Voer uniek getal %d in: ", i+1);
			ingevoerd[i] = input.nextInt();
			if(ingevoerd[i] > 10) {
				System.out.println("Getal mag niet groter zijn dan 10");
				i--;
			}
			else if(ingevoerd[i] < 0) {
				System.out.println("Getal mag niet kleiner zijn dan 0");
				i--;
			}
			else if(zitAllInArray(ingevoerd, i)) {
				System.out.printf("Het ingevoerde getal is niet uniek. Voer uniek getal %d in: ", i+1);
				i--;
			}
		}
		input.close();
	}
	
	private boolean zitAllInArray(int[] array, int index) {
		boolean uniek = true;
		int i = 0;
		while(uniek && i < index) {
			if(array[i] == array[index]) {
				uniek = false;
			}
			i++;
		}
		return uniek;
	}
	
	private void bepaalRandomGetallen(int[] random) {
		Random input = new Random();
		for(int i = 0; i < random.length; i++) {
			random[i] = input.nextInt(11);
			if(zitAllInArray(random, i)) {
				i--;
			}
		}
	}
	
	private void toonArray(String boodschap, int[] array) {
		System.out.println(boodschap);
		for(int i =0;i<array.length;i++) {
			System.out.printf("%3d", array[i]);
		}
		System.out.println();
			
	}
	
	private void bepaalZelfde(int[] ingevoerd, int[] random) {
		String zelfde = "";
		for(int i = 0;i<ingevoerd.length;i++) {
			for(int j = 0;j<random.length;j++) {
				if(ingevoerd[i]==random[j]) {
					zelfde += ingevoerd[i] + " ";
				}
			}
		}
		if (zelfde.isEmpty())
            System.out.println("In de ingevoerde array zitten geen getallen "
                + "die ook in de random array voorkomen");
        else
            System.out.println
                ("De getallen die in beide arrays voorkomen zijn: " + zelfde);
	}

}
