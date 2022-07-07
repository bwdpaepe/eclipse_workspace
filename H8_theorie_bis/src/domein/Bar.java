package domein;

import java.util.ArrayList;
import java.util.List;

public class Bar {
	
	private List<String> dranklijst;
	
	public Bar() {
		this.dranklijst = new ArrayList<>();
		dranklijst.add("water");
		dranklijst.add("cola");
		dranklijst.add("bier");
	}
	
	public boolean magAlcoholDrinken(int leeftijd) {
		return leeftijd >= 16;
	}
	
	public List<String> geefDranklijst() {
		return this.dranklijst;
	}

}
