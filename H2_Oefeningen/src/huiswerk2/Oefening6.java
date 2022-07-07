package huiswerk2;
import java.util.Scanner;
public class Oefening6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer;
		do {
			System.out.print("Geef een strikt positief geheel getal: ");
			invoer = input.nextInt();
		}while(invoer <= 0);
		System.out.print("De delers zijn: ");
		for(int i = 1; i<=invoer/2;i++) {
			if(invoer%i==0) {
				System.out.printf("%d, ", i);
			}
		}
		System.out.printf("%d.", invoer);
		
		input.close();
	}

}
