package werkcollege2;

public class Oefening11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aantal = 50, jaar = 0;
		do {
			aantal *= 1.15;
			jaar++;
		}while(aantal < 1000);
		System.out.printf("aantal jaar: %d", jaar);

	}

}
