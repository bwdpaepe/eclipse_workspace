package cui;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {2,5,3};
		
		int categorieen = array.length;
		
		int tientallen = 0;
		
		for(int counter = 1; counter <= categorieen; counter++) {
			switch(categorieen / counter) {
				case 1:
					if(tientallen == 0) {
						switch((int) (Math.log10(1) + 1)){

							case 2: System.out.printf("05%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
				
							case 3: System.out.printf("06%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
				
							default: System.out.printf("07%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
						}
					}
					else {
						switch((int) (Math.log10(tientallen) + 1)){

							case 2: System.out.printf("05%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
					
							case 3: System.out.printf("06%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
					
							default: System.out.printf("07%d: ", (counter-1) * 10);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
						}
					}
					break;
				
				
			
				default:
					if(tientallen == 0) {
						switch((int) (Math.log10(1) + 1)){

							case 2: System.out.printf("02%d-02%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
				
							case 3: System.out.printf("03%d-03%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
								break;
				
							default: System.out.printf("04%d-04%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
								for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
									System.out.print("*");
								}
								System.out.println();
						}
					}
					else {
						switch((int) (Math.log10(tientallen) + 1)){

						case 2: System.out.printf("02%d-02%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
							for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
								System.out.print("*");
							}
							System.out.println();
							break;
			
						case 3: System.out.printf("03%d-03%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
							for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
								System.out.print("*");
							}
							System.out.println();
							break;
			
						default: System.out.printf("04%d-04%d: ", (counter-1) * 10, ((counter-1) * 10) + 9);
							for(int sterretjes = 0; sterretjes < array[counter-1]; sterretjes++) {
								System.out.print("*");
							}
							System.out.println();
					}
					}
			}
			tientallen++;
		}

	}

}
