package cui;
import domein.Rekening;
public class Oefening29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rekening[] array = new Rekening[9];
		double[] saldo = {100,777.77,287.15,-350.00,399.99,123.45,987.65,-68.18,413.26};
		String[] alfabet = {"A","B","C","D","E","F","G","H","I"};
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = new Rekening(i,alfabet[i]);
			array[i].stortOp(saldo[i]);
			
		}
		
		double gemiddelde = 0.0;
		String output = "";
		
		for(Rekening singleRekening: array) {
			
			output += "Rekening " + singleRekening.getRekeningnummer() + " van " + singleRekening.getHouder() + " bevat " + singleRekening.getSaldo() + "\n";
			gemiddelde += singleRekening.getSaldo();
		}
		
		gemiddelde/=array.length;
		
		System.out.print(output);
		System.out.printf("Het gemiddelde van deze %d rekeningen bedraagt: %f", array.length, gemiddelde);
	}

}
