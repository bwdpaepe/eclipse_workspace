package domein;

import java.util.Random;

public class KopOfMunt {
	//true = kop
	//false = munt
	private boolean worp;
	private boolean geraden;
	public KopOfMunt() {
		Random input = new Random();
		setWorp(input.nextBoolean());
		
	}
	private boolean isWorp() {
		return worp;
	}
	private void setWorp(boolean worp) {
		this.worp = worp;
	}
	private boolean isGeraden() {
		return geraden;
	}
	public void setGeraden(boolean geraden) {
		this.geraden = geraden;
	}
	
	public boolean isJuistGeraden() {
		return(isWorp() == isGeraden());
	}
	
	public String geefInfoWorp() {
		return (String.format("%10s%10s%10s%n",zetOmNaarKopOfMunt(isWorp()),zetOmNaarKopOfMunt(isGeraden()),isJuistGeraden() ? "juist" : "fout"));
	}
	
	private String zetOmNaarKopOfMunt(boolean trueOfFalse) {
		return (trueOfFalse ? "kop" : "munt");
	}
	

}
