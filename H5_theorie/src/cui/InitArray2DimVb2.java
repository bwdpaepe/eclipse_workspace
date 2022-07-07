package cui;

public class InitArray2DimVb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {{1,2,3},{4,5}};
		
		System.out.println("Values in array by row are\n");
		String output = "";
		
		for (int[] row: array) {
			for (int element: row) {
				output += String.format("%d ", element);
			}
			output += "%n";
		}
		System.out.print(output);

	}

}
