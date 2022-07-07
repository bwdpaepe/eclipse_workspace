package testen;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Zichtrekening;

class ZichtrekeningTest {
	
	private Zichtrekening rekening;
	
	@BeforeEach
	public void toto() {
		rekening = new Zichtrekening();
	}
	
	@Test
	public void maakZichtrekening_GeeftSaldoNul() {
		Assertions.assertEquals(BigDecimal.ZERO, rekening.getSaldo());
	}
	
	@Test
	public void storten_MoetSaldoAanpassen() {
		// Arrange
		BigDecimal bedrag = new BigDecimal(200);
		
		// Act
		rekening.storten(bedrag);
		
		// Assert
		Assertions.assertEquals(bedrag, rekening.getSaldo());
	}
	
	@Test
	public void storten_MetNegatiefBedrag_Exception() {
		// Arrange
		BigDecimal bedrag = new BigDecimal(-10);
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> rekening.storten(bedrag),
				"Negatief bedrag kan niet gestort worden");
	}
	
	@Test
	public void storten_MetNull_Exception() {
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> rekening.storten(null),
				"Ongeldig bedrag");
	}
	
	

}
