package cui;

import domein.DomeinController;

public class DobbelsteenApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DomeinController dc = new DomeinController();
		
		dc.startNieuwSpel();
		dc.rolDobbelstenen();
		
		System.out.printf("Aantal ogen van de worp: %d.%n", dc.geefAantalOgenWorp());
		System.out.printf("Score: %d.%n", dc.geefScore());
	}

}
