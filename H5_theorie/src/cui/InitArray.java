package cui;

public class InitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intLijst = {21,54,36,87,22,1,39,7,81,47};
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for(int counter = 0; counter < intLijst.length; counter++) {
			System.out.printf("%5d%8d%n", counter, intLijst[counter]);
		}

	}

}
