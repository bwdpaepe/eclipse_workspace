package werkcollege2;

public class Oefening7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int som = 0;
		for(int i = 1; i < 500; i++) {
			if(i % 12 == 0) {
				som += i;
			}
		}
		System.out.println("Som: " + som);
		
		for(int i = 51; i > 0; i--) {
			if(!(i % 2 == 0)) {
				System.out.printf("%d\t", i);
			}
		}
		System.out.println("");
		
		for(char karakter = 'a'; karakter <= 'z'; karakter++) {
			System.out.printf("%c\t", karakter);
		}

	}

}
