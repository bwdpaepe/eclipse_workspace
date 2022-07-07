package domein;

public class Vierkant {
	private int zijde;
	private char karakter;
	
	public Vierkant() {
		setZijde(1);
		setKarakter('x');
	}

	private int getZijde() {
		return zijde;
	}

	private void setZijde(int zijde) {
		this.zijde = zijde;
	}

	private char getKarakter() {
		return karakter;
	}

	private void setKarakter(char karakter) {
		this.karakter = karakter;
	}
	
	public static String maakVierkant(int zijde) {
		return(maakVierkant(zijde,'x'));
	}
	
	public static String maakVierkant(int zijde, char kar) {
		String resultaat = "";
		for(int i = 0 ; i < zijde ; i++) {
			for(int j = 0 ; j < zijde ; j++) {
				resultaat = resultaat + kar;
			}
			resultaat = resultaat + "\n";
		}
		return resultaat;
	}
	
	
	
	

}
