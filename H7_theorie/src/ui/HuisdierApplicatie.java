package ui;

import domein.Duif;
import domein.Hond;
import domein.Huisdier;
import domein.Kat;

public class HuisdierApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Huisdier vanPapa = new Huisdier("Nijntje");
		Huisdier vanMama = new Hond("Rintje");
		Huisdier vanLucas = new Kat("Musti");
		Huisdier vanDaan = new Huisdier("Hopla");
		Huisdier vanOpa = new Duif("Wittekerke", 123L);
		
		Huisdier[] huisdierenArray = {vanPapa, vanMama, vanLucas, vanDaan, vanOpa};
		
		for(Huisdier mijnDier: huisdierenArray) {
			System.out.println(mijnDier.maakGeluid());
			System.out.println(mijnDier);
		}
		if(vanLucas instanceof Kat ) {
			System.out.println(((Kat)vanLucas).spin());
		}

	}

}
