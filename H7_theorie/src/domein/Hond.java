package domein;

public class Hond extends Huisdier {

	public Hond(String naam) {
		super(naam);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String maakGeluid() {
		String hondenGeluid = String.format("Waf waf %s", super.maakGeluid());
		return hondenGeluid;
	}
	
	public String kwispel() {
		return "kwispel--kwispel--kwispel";
	}

}
