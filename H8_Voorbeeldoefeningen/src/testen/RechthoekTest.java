package testen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import domein.Rechthoek;

class RechthoekTest {
	
	private Rechthoek rechthoek;
	
	@BeforeEach
	public void toto() {
		
	}

	@Test
	public void maakRechthoek_lengteOK_breedteOK_maaktRechthoek() {
		// Arrange
		double lengte = 5.5;
		double breedte = 3.3;
		
		// Act
		Rechthoek rechthoek = new Rechthoek(lengte, breedte);
		
		// Assert
		Assertions.assertEquals(lengte, rechthoek.getLengte());
		Assertions.assertEquals(breedte, rechthoek.getBreedte());
	}
	
	@Test
	public void maakRechthoek_lengteOK_breedteNOK_exception() {
		// Arrange
		double lengte = 5.5;
		double breedte = -3.3;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Rechthoek(lengte, breedte));
				
		
	}
	
	@Test
	public void maakRechthoek_lengteNOK_breedteOK_exception() {
		// Arrange
		double lengte = -5.5;
		double breedte = 3.3;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Rechthoek(lengte, breedte));
				
		
	}
	
	@Test void maakRechthoek_lengteGrenswaarde_breedteOK_exception() {
		// Arrange
		double lengte = 0;
		double breedte = 3.3;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Rechthoek(lengte, breedte));
	}
	
	@Test void maakRechthoek_lengteOK_breedteGrenswaarde_exception() {
		// Arrange
		double lengte = 5.5;
		double breedte = 0;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> new Rechthoek(lengte, breedte));
	}

	@Test
	public void geefOmtrek_retourneertOmtrek() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		
		// Act
		double omtrek = rechthoek.geefOmtrek();
		
		// Assert
		Assertions.assertEquals(17.6,  omtrek, 0);
	}
	
	@Test
	public void geefOppervlakte_retourneertOpp() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		
		// Act
		double opp = rechthoek.geefOppervlakte();
		
		// Assert
		Assertions.assertEquals(18.15,  opp, 0);
	}

	@Test
	void schaal_percentageKleinderDan100_verkleintRechthoek() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = 50;
		
		// Act
		rechthoek.schaal(percentage);
		
		// Assert
		
		Assertions.assertEquals(2.75, rechthoek.getLengte());
		Assertions.assertEquals(1.65, rechthoek.getBreedte());
		
	}

	@Test
	void schaal_percentageGroterDan100_vergrootRechthoek() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = 150;
		
		// Act
		rechthoek.schaal(percentage);
		
		// Assert
		
		Assertions.assertEquals(8.25, rechthoek.getLengte());
		Assertions.assertEquals(4.95, rechthoek.getBreedte());
		
	}
	
	@Test
	public void schaal_percentageGrenswaarde1_verkleintRechthoek() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = 1;

		// Act
		rechthoek.schaal(percentage);

		// Assert
		Assertions.assertEquals(0.055, rechthoek.getLengte());
		Assertions.assertEquals(0.033, rechthoek.getBreedte());
	}

	@Test
	public void schaal_percentageGrenswaarde200_vergrootRechthoek() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = 200;

		// Act
		rechthoek.schaal(percentage);

		// Assert
		Assertions.assertEquals(11.0, rechthoek.getLengte());
		Assertions.assertEquals(6.6, rechthoek.getBreedte());
	}
	
	@Test void schaal_percentageTeKlein_exception() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = -5;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> rechthoek.schaal(percentage));

	}
	
	@Test
	public void schaal_percentageTeGroot_exception() {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		int percentage = 250;
		
		// Act & Assert
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> rechthoek.schaal(percentage));
	}
	
	@ParameterizedTest
	@ValueSource (ints = {-5, 0, 201, 250})
	public void schaal_percentageBuitenBereik_exception(int percentage) {
		// Arrange
		Rechthoek rechthoek = new Rechthoek(5.5,3.3);
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> rechthoek.schaal(percentage));
	}


}
