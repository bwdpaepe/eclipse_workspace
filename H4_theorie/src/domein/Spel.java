package domein;

import java.util.List;
import java.util.ArrayList;

public class Spel {
	
	private int score;
	private int eersteWorp;
	private List<Dobbelsteen> dobbelstenen;
	
	public Spel() {
		setScore(-1);
		setEersteWorp(0);
		dobbelstenen = new ArrayList<>();
		for (int i = 1 ; i <= 2 ; i++) {
			dobbelstenen.add(new Dobbelsteen());
		}
	}
	
	private void setEersteWorp(int eersteWorp) {
		if ((eersteWorp > 1 && eersteWorp < 13) || eersteWorp == 0) {
			this.eersteWorp = eersteWorp;
		}
	}
	
	private void setScore(int score) {
		if(score >= -1 && score < 3) {
			this.score = score;
		}
	}
	
	public void rolDobbelstenen() {
		int aantalOgenHuidigeWorp = 0;
		for (Dobbelsteen d : dobbelstenen) {
			d.rol();
			aantalOgenHuidigeWorp += d.getAantalOgen();
		}
		
		bepaalScore(aantalOgenHuidigeWorp);
		bepaalEersteWorp(aantalOgenHuidigeWorp);
	}
	
	private void bepaalEersteWorp(int aantalOgenWorp) {
		if (eersteWorp == 0) {
			setEersteWorp(aantalOgenWorp);
		}
	}
	
	private void bepaalScore(int aantalOgenWorp) {
		if (eersteWorp == 0 && (aantalOgenWorp == 7 || aantalOgenWorp == 11)) {
			setScore(2);
		}
		else if (aantalOgenWorp == 7 || aantalOgenWorp == 11) {
			setScore(0);
		}
		else if (aantalOgenWorp == eersteWorp) {
			setScore(1);
		}
	}
	
	public int geefAantalOgenWorp() {
		int aantalOgenHuidigeWorp = 0;
		for (Dobbelsteen d : dobbelstenen) {
			aantalOgenHuidigeWorp += d.getAantalOgen();
		}
		return aantalOgenHuidigeWorp;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean isEindeSpel() {
		return (score >= 0 && score <=2);
	}

}
