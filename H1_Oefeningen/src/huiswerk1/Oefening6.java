package huiswerk1;
import java.util.Scanner;

public class Oefening6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int invoer, rest;
		System.out.print("Geef een getal (>=999 en <=9999) in: ");
		invoer = input.nextInt();
		System.out.println("Het getal bestaat uit:");
		System.out.println((invoer / 1000) + " duizendtallen");
		rest = invoer % 1000;
		System.out.println((rest / 100) + " honderdtallen");
		rest = rest % 100;
		System.out.println((rest / 10) + " tientallen");
		rest = rest % 10;
		System.out.println(rest + " eenheden");
		input.close();

	}

}
