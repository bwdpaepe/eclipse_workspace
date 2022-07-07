package werkcollege2;

public class Oefening4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		if(age >= 65) {
			System.out.println("Age greater than or equal to 65");
		}
		else {
			System.out.println("Age is less than 65");
		}
		
		int x = 1, total = 0;
		while (x <= 10) {
			total += x;
			++x;
		}
		System.out.println("total: " + total);
		
		int z = 10;
		total = 0;
		while ( z <= 100 ) {
			total += z;
			++z;
		}
		System.out.println("total: " + total);

	}

}
