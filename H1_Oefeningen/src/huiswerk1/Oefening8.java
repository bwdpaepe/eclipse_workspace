package huiswerk1;
import java.util.Scanner;

public class Oefening8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer, maand, dag, jaarSaldo;
		System.out.print("Geef een datum in <ddmmjjjj>: ");
		invoer = input.nextInt();
		invoer = invoer / 10000;
		maand = invoer % 100;
		dag = invoer / 100;
		
		jaarSaldo = ((12 - maand) * 30) - (dag);
		
		System.out.printf("Het duurt nog %d dagen voor het terug nieuwjaar is!", jaarSaldo);
		
		input.close();

	}

}
