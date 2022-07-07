package huiswerk1;
import java.util.Scanner;

public class Oefening9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een positief getal in: ");
		int invoer = input.nextInt();
		System.out.printf("\t%2d\t%3d\t%4d\t%5d\t%6d%n", 1, 10, 100, 1000, 10000);
		System.out.printf("\t%d\t%d\t%d\t%d\t%d%n", 1*invoer, 10*invoer, 100*invoer, 1000*invoer, 10000*invoer);
		
		input.close();

	}

}
