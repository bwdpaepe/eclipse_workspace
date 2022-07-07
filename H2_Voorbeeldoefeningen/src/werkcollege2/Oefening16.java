package werkcollege2;

public class Oefening16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A
		for(int i = 1; i<=10;i++) {
			for(int j = 1; j<=i;j++) {
				System.out.print('*');
			}
			System.out.println();
		}
		// B
		for(int i = 10; i>0;i--) {
			for(int j = i; j<10;j++) {
				System.out.print(' ');
			}
			for(int j = 0; j<=i;j++) {
				
				System.out.print('*');
			}
			System.out.println();
		}
		// C
		for(int i = 10; i>0;i--) {
			for(int j = i; j>0;j--) {
				System.out.print('*');
			}
			System.out.println();
		}
		// D
		for(int i = 1; i<=10;i++) {
			for(int j = i; j<10;j++) {
				System.out.print(' ');
			}
			for(int j = 0; j<=i;j++) {
				
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
