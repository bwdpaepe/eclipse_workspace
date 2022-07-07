package werkcollege3;

public class Rechthoek {
	
	private double lengte;
	private double breedte;
	public Rechthoek(double lengte, double breedte) {
		setLengte(lengte);
		setBreedte(breedte);
	}
	public Rechthoek() {
		this(10.0, 7.0);
	}
	public double getLengte() {
		return lengte;
	}
	public double getBreedte() {
		return breedte;
	}
	private void setLengte(double lengte) {
		this.lengte = lengte>0?lengte:1.0;
	}
	private void setBreedte(double breedte) {
		this.breedte = breedte>0?breedte:1.0;
	}
	public double berekenOmtrek() {
		return (lengte + breedte)*2.0;
	}
	public double berekenOppervlakte() {
		return (lengte * breedte);
	}

}
