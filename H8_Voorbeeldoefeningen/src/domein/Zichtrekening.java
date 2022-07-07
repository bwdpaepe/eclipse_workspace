package domein;

import java.math.BigDecimal;

public class Zichtrekening {
	
	private BigDecimal saldo = BigDecimal.ZERO;
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	public void storten(BigDecimal bedrag) {
		if (bedrag == null) {
			throw new IllegalArgumentException("Ongeldig bedrag");
		}
		
		if (bedrag.compareTo(BigDecimal.ZERO) < 0) {
			throw new IllegalArgumentException("Negatief bedrag kan niet gestort worden");
		}
		
		saldo = saldo.add(bedrag);
	}

}
