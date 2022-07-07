package cui;

import domein.Doos;
import java.util.List;
import java.util.ArrayList;

public class Oefening24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Doos> mijnDozen = new ArrayList<>();
		Oefening24 oef = new Oefening24();
		mijnDozen.add(oef.maakDoos(true));
		mijnDozen.add(oef.maakDoos(false));
		int counter = 1;
		for(Doos mijnDoos: mijnDozen) {
			oef.drukDoosAf(counter, mijnDoos);
			counter++;
		}
		
		
	}
	
	public void drukDoosAf(int nummer, Doos d) {
		System.out.printf("Doos %d: %s%n", nummer, d.toString());
	}
	
	public Doos maakDoos(boolean automatisch) {
		if(automatisch) {
			return (new Doos());
		}
		else {
			return (new Doos(5.0,6.0,8.0,"geel"));
		}
	}

}
