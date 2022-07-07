package cui;

import domein.Patroon;

public class PatroonApplicatie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patroon myPatroon;
		for(int i = 1; i <= 4; i++) {
			switch (i) {
			case 1: myPatroon = new Patroon('A'); System.out.println(myPatroon.teken()); break;
			case 2: myPatroon = new Patroon('B'); System.out.println(myPatroon.teken()); break;
			case 3: myPatroon = new Patroon('C'); System.out.println(myPatroon.teken()); break;
			case 4: myPatroon = new Patroon('D'); System.out.println(myPatroon.teken()); break;
			}
		}
		

	}

}
