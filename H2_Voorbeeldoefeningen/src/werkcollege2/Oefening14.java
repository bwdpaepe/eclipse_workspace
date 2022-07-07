package werkcollege2;
import java.util.Scanner;
public class Oefening14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int invoer, teller=0, som=0;
		for(int i = 0; i<10; i++) {
			System.out.printf("Invoer %d: ", i + 1);
			invoer = input.nextInt();
			if(invoer==-1) {
				break;
			}
			teller++;
			som+=invoer;
			
		}
		System.out.printf("gemiddelde: %d", som / teller);
		
		input.close();

	}

}
