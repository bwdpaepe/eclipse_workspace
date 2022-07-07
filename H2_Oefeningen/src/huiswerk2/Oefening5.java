package huiswerk2;
import java.util.Scanner;
import java.lang.Integer;
public class Oefening5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer, grootste = Integer.MIN_VALUE, oude_grootste = Integer.MIN_VALUE;
		
		for(int i = 1; i<=10; i++) {
			System.out.printf("Geef getal %d in: ", i);
			invoer = input.nextInt();
			if(invoer > oude_grootste) {
				if(invoer > grootste) {
					oude_grootste = grootste;
					grootste = invoer;
				}
				else {
					oude_grootste = invoer;
				}
				
			}
		}
		
		System.out.printf("Het op één na grootste getal is %d", oude_grootste);
		input.close();
	}

}
