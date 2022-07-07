package cui;

public class Oefening27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] getal = {4,8,2,3,5,17,7,99,3,12};
		int kleinste = Integer.MAX_VALUE;
		
		for(int enkelGetal: getal) {
			if(enkelGetal < kleinste) {
				kleinste = enkelGetal;
			}
			
		}
		
		for(int i = 0 ; i<getal.length;i++) {
			getal[i]*=2;
		}

	}

}
