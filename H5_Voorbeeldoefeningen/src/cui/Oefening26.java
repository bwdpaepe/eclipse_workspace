package cui;

import java.lang.Integer;

public class Oefening26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] array = new int[12];
		int[] array = {360,2100,450,1450,650,780,321,1200,560,1850,960,420};
		int max = Integer.MIN_VALUE;
		int max_index = 0;
		int min = Integer.MAX_VALUE;
		int min_index = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
				min_index = i+1;
			}
			if(array[i] > max) {
				max = array[i];
				max_index = i+1;
			}
		}
		
		System.out.printf("Hoogste omzet %d in maand %d%n", max, max_index);
		System.out.printf("Laagste omzet %d in maand %d%n", min, min_index);
 
	}

}
