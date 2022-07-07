package domein;



public class Huisdier {
	private String naam;
	
	public Huisdier(String naam) {
		this.setNaam(naam);
	}

	protected String getNaam() {
		return naam;
	}

	private final void setNaam(String naam) {
		this.naam = naam;
	}
	
	public boolean luisterNaarNaam(String naam) {
		return (naam.equals(this.getNaam()));
	}
	
	@Override
	public String toString() {
		return String.format("%s met naam %s", this.getClass().getSimpleName(), this.getNaam());
	}
	
	public String maakGeluid() {
		return "!";
	}
	
	

}
