package domein;

public class Patroon {
	private char type;
	private char opvulteken;
	
	public Patroon(char type){
		this(type,'*');
	}
	
	public Patroon(char type, char opvulteken){
		setType(type);
		setOpvulteken(opvulteken);
	}
	
	public char getType() {
		return type;
	}
	
	public char getOpvulteken() {
		return opvulteken;
	}
	
	private void setOpvulteken(char opvulteken) {
		if(opvulteken=='*'|opvulteken=='+'|opvulteken=='-'|opvulteken=='!'|opvulteken=='?') {
			this.opvulteken = opvulteken;
		}
		else {
			this.opvulteken = '*';
		}
		
	}
	
	private void setType(char type) {
		if(type=='A'|type=='B'|type=='C'|type=='D') {
			this.type = type;
		}
		else {
			this.type = 'A';	// default value
		}
	}
	
	public String teken() {
		/*String tekening="";
		switch(type) {
		case 'A': tekening = tekenPatroonA(); break;
		case 'B': tekening = tekenPatroonB(); break;
		case 'C': tekening = tekenPatroonC(); break;
		case 'D': tekening = tekenPatroonD(); break;
		}
		
		return tekening;*/
		switch(type) {
		case 'A': return tekenPatroonA();
		case 'B': return tekenPatroonB();
		case 'C': return tekenPatroonC();
		case 'D': return tekenPatroonD();
		}
		
		return "";
	}
	
	private String tekenPatroonA() {
		String tekening="Patroon A\n";
		for(int i = 1; i<=10;i++) {
			for(int j = 1; j<=i;j++) {
				tekening = tekening + opvulteken;
			}
			tekening = tekening + "\n";
		}
		return tekening;
	}
	private String tekenPatroonB() {
		String tekening="Patroon B\n";
		for(int i = 10; i>0;i--) {
			for(int j = 10; j>i;j--) {
				tekening = tekening + " ";
			}
			for(int j = i; j>0;j--) {
				tekening = tekening + opvulteken;
			}
			tekening = tekening + "\n";
		}
		return tekening;
	}
	private String tekenPatroonC() {
		String tekening="Patroon C\n";
		for(int i = 10; i>0;i--) {
			for(int j = i; j>0;j--) {
				tekening = tekening + opvulteken;
			}
			tekening = tekening + "\n";
		}
		return tekening;
	}
	private String tekenPatroonD() {
		String tekening="Patroon D\n";
		for(int i = 1; i<=10;i++) {
			for(int j = 10; j>i;j--) {
				tekening = tekening + " ";
			}
			for(int j = 1; j<=i;j++) {
				tekening = tekening + opvulteken;
			}
			tekening = tekening + "\n";
		}
		return tekening;
	}

}
