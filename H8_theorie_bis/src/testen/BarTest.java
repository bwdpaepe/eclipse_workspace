package testen;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domein.Bar;

class BarTest {
	
	private Bar bar;
	
	@BeforeEach
	public void setUp() {
		bar = new Bar();
	}

	@Test
	public void magAlcoholDrinken_oudGenoeg_retourneertTrue() {
		// Arrange
		int leeftijd = 22;
		
		// Act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		// Assert
		assertTrue(resultaat);
				
	}
	
	@Test
	public void magAlcoholDrinken_teJong_retourneertFalse() {
		// Arrange
		int leeftijd = 10;
		
		// Act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		// Assert
		assertFalse(resultaat);
	}
	
	@Test
	public void magAlcoholDrinken_grensGeval16_retourneertTrue() {
		// Arrange
		int leeftijd = 16;
		
		// Act
		boolean resultaat = bar.magAlcoholDrinken(leeftijd);
		
		// Assert
		assertTrue(resultaat);
	}
	
	@Test
	public void geefDranklijst_juisteLijst() {
		// Arrange
		List<String> dranklijst = new ArrayList<>();
		dranklijst.add("water");
		dranklijst.add("cola");
		dranklijst.add("bier");
		
		// Act
		List<String> resultaat = bar.geefDranklijst();
		
		// Assert
		assertEquals(dranklijst, resultaat);
	}
	
	

}
