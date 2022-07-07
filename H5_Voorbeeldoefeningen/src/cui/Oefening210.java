package cui;

public class Oefening210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MAX = 10;
		int[][] table = new int [MAX][MAX];
		for(int i = 0; i<table.length;i++)
			for(int j = 0; j<table[i].length;j++)
				table[i][j] = i + j;

	}

}
