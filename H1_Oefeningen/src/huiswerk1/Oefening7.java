package huiswerk1;
import java.util.Scanner;

public class Oefening7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int pLengte = 1000, pBreedte = 50;
		int mHoogte, mBreedte;
		System.out.print("Geef de hoogte van de muur in cm in: ");
		mHoogte = input.nextInt();
		System.out.print("Geef de breedte van de muur in cm in: ");
		mBreedte = input.nextInt();
		
		System.out.printf("Het aantal benodigde rollen = %d", (((mHoogte * mBreedte)/(pLengte * pBreedte))+1));
		input.close();

	}

}
