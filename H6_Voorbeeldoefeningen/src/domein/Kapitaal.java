package domein;

public class Kapitaal {
	private double beginBedrag;
	private double intrest;
	public Kapitaal(double beginBedrag, double intrest) {
		setBeginBedrag(beginBedrag);
		setIntrest(intrest);
	}
	private double getBeginBedrag() {
		return beginBedrag;
	}
	private void setBeginBedrag(double beginBedrag) {
		if(beginBedrag >= 0) {
			this.beginBedrag = beginBedrag;
		}
	}
	private double getIntrest() {
		return intrest;
	}
	private void setIntrest(double intrest) {
		if(intrest >=0 && intrest <=100) {
			this.intrest = intrest;
		}
	}
	
	public double berekenKapitaalNaNJaar(int n) {
		if(n==0) {
			double startKapitaal = getBeginBedrag();
			return startKapitaal;
		}
		else {
			double intrest = getIntrest();
			return (((intrest / 100.0) + 1) * berekenKapitaalNaNJaar(n-1));
			
		}
		
	}
	

}
