package cui;

public class InitArrayEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int ARRAY_LENGTH = 10;
		
		int evenLijst[] = new int[ARRAY_LENGTH];
		
		for(int counter = 0; counter < evenLijst.length; counter++) {
			evenLijst[counter] = 2+ (counter * 2);
		}
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < evenLijst.length; counter++) {
			System.out.printf("%5d%8d%n", counter, evenLijst[counter]);
		}
		
		
		

	}

}
