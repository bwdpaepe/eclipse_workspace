package domein;

public class Duif extends Huisdier {
	
	private final long ringnr;

	public Duif(String naam, long ringnr) {
		super(naam);
		// TODO Auto-generated constructor stub
		this.ringnr = ringnr;
	}
	
	@Override
	public String maakGeluid() {
		return "roekoe";
	}
	
	@Override
	public String toString() {
		return String.format("%s met ringnummer %d", super.toString(), this.ringnr);
	}

}
