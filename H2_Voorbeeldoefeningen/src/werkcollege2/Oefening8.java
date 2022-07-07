package werkcollege2;
import java.util.Scanner;
public class Oefening8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int som = 0;
		for(int i = 1; i < 6; i++) {
			System.out.print("Geef getal " + i);
			som += input.nextInt();
		}
		System.out.println("De som van de getallen = " + som);
		
		int wrd = 0;
		int evenStuff = 0, drieStuff = 0;
		for(int i = 1; i < 6; i++) {
			System.out.print("Geef getal " + i);
			wrd = input.nextInt();
			if(wrd % 2 == 0) {
				evenStuff++;
			}
			if(wrd % 3 == 0) {
				drieStuff++;
			}
		}
		System.out.printf("Je gaf %d even getallen en %d getallen deelbaar door 3 in.%n", evenStuff, drieStuff);
		
		input.close();
		System.out.println("N\t10*N\t100*N\t1000*N");
		for(int i = 1; i < 6; i++) {
			System.out.printf("%d\t%d\t%d\t%d%n", i, i*10, i*100, i*1000);
			
		}
	}
	
	

}
