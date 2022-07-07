package huiswerk2;
import java.util.Scanner;

public class Oefening2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Geef een getal in: ");
		int invoer = input.nextInt();
		if(invoer>0) {
			invoer-=10;
			System.out.printf("Het ingegeven getal was strikt positief en werd verminderd met 10. Het heeft nu de waarde %d.", invoer);
		}
		else if(invoer<0) {
			invoer+=10;
			System.out.printf("Het ingegeven getal was negabief en werd vermeerderd met 10. Het heeft nu de waarde %d.", invoer);
		}
		else {
			invoer+=1;
			System.out.println("Het ingegeven getal was nul en werd vermeerderd met 1.");
		}
		input.close();

	}

}
