package cui;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Oefening23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Geef het eerste getal: ");
		int getal1=0, getal2=0;
		List<Integer> perfecteGetallen = new ArrayList<>();
		getal1 = input.nextInt();
		do {
		System.out.printf("Geef het tweede getal (>%d)): ", getal1);
		getal2 = input.nextInt();
		} while (getal2 <= getal1);
		
		Oefening23 oef = new Oefening23();
		for(int i = getal1; i<=getal2;i++) {
			if(oef.isPerfect(i)) {
				perfecteGetallen.add(i);
			}
		}
		if(perfecteGetallen.size()==0) {
			System.out.println("Er zijn geen perfecte getallen in dit interval.");
		}
		else {
			System.out.printf("De perfecte getallen tussen %d en %d zijn: ", getal1, getal2);
			for(int perfectGetal: perfecteGetallen) {
				System.out.printf("%d\t", perfectGetal);
			}
		}
		input.close();
	}
	
	
	
	public boolean isPerfect(int x) {
		Oefening23 oef = new Oefening23();
		if(oef.berekenSomVanDelers(x) == x) {
			return true;
		}
		return false;
	}
	
	public int berekenSomVanDelers(int x) {
		List<Integer> delers = new ArrayList<>();
		int som = 0;
		for (int i = 1 ; i <= x / 2; i++) {
			if(x%i==0) {
				delers.add(i);
			}
		}
		if (delers.size()>0) {
			for(int singleDeler : delers) {
				som += singleDeler;
			}
			return som;
		}
		return 0;
	}
	
	

}
