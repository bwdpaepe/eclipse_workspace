package cui;

import java.util.List;
import java.util.ArrayList;

public class ArrayListInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 6, b = 3, c = 8, d = 5;
		List<Integer> integerList = new ArrayList<>();
		
		integerList.add(a);
		integerList.add(b);
		integerList.add(c);
		integerList.add(d);
		
		for (int element : integerList) {
			System.out.printf("%d ", element);
		}
		System.out.println();
		

	}

}
