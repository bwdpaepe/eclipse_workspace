package domein;

import java.security.SecureRandom;

public class Kat extends Huisdier {

	public Kat(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String maakGeluid() {
		return "miauw";
	}
	
	@Override
	public boolean luisterNaarNaam(String naam) {
		SecureRandom r = new SecureRandom();
		if(r.nextInt(10) == 5) {
			return super.luisterNaarNaam(naam);
		}
		return false;
	}
	
	public String spin() {
		return super.getNaam() + " spint";
	}

}
