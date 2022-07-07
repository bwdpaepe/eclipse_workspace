package domein;

public class DomeinController {
	private Spel spel;
	
	public void startNieuwSpel() {
		setSpel(new Spel());
	}
	
	private void setSpel(Spel spel) {
		this.spel = spel;
	}
	
	public void rolDobbelstenen() {
		spel.rolDobbelstenen();
	}
	
	public int geefAantalOgenWorp() {
		return spel.geefAantalOgenWorp();
	}
	
	public int geefScore() {
		return spel.getScore();
	}
	
	public boolean isEindeSpel() {
		return spel.isEindeSpel();
	}
	
	

}
