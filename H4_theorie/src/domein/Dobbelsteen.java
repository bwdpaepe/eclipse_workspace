package domein;

import java.security.SecureRandom;

public class Dobbelsteen {
	private int aantalOgen;
	
	public Dobbelsteen() {
		setAantalOgen(1);
	}
	
	private void setAantalOgen(int aantalOgen) {
		if (aantalOgen > 0 && aantalOgen < 7) {
			this.aantalOgen = aantalOgen;
		}
	}
	
	public void rol() {
		SecureRandom sr = new SecureRandom();
		setAantalOgen(1+sr.nextInt(6));
	}
	
	public int getAantalOgen() {
		return aantalOgen;
	}

}
