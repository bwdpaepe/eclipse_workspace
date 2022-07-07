package domein;

public class Doos {
	private double lengte;
	private double breedte;
	private double hoogte;
	private String kleur;
	private String code;
	private static int aantalDozen;
	
	public Doos() {
		this(1.0,1.0,1.0,"rood");
	}
	
	public Doos(double lengte, double breedte, double hoogte, String kleur) {
		setLengte(lengte);
		setBreedte(breedte);
		setHoogte(hoogte);
		setKleur(kleur);
		aantalDozen++;
		genereerCode();
		
	}
	
	
	
	private void setLengte(double lengte) {
		this.lengte = lengte;
	}

	private void setBreedte(double breedte) {
		this.breedte = breedte;
	}

	private void setHoogte(double hoogte) {
		this.hoogte = hoogte;
	}

	private void setKleur(String kleur) {
		if(kleur.isEmpty()) {
			throw new IllegalArgumentException("De kleur moet ingevuld zijn.");
		}
		else {
			this.kleur = kleur;
		}
	}

	private void setCode(String code) {
		this.code = code;
	}

	private void setAantalDozen(int aantalDozen) {
		this.aantalDozen = aantalDozen;
	}

	@Override
	public String toString() {
		return "Een doos met lengte " + lengte + ", met hoogte " + hoogte + ", met breedte " + breedte + " en kleur " + kleur + ".\n Deze doos heeft als unieke code " + code + ".";
	}
	
	private void controleerAfmeting(String afmeting, double minWaarde, double waarde) {
		if (waarde <= minWaarde) {
            throw new IllegalArgumentException(String.format("De %s is te klein.", afmeting));
        }
	}
	
	private void genereerCode() {
		String genCode = "D"+ String.format("%015d", aantalDozen);
		setCode(genCode);
	}

	
}
