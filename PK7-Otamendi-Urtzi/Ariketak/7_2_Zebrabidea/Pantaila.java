package Zebrabidea;

class Pantaila {
	int maxZain, maxo, maxk, maxim;
	
	String tabOinezko;

	public Pantaila(int mg, int mu, int m) {
		maxo = mg;
		maxk = mu;
		
		if(maxo > maxk) {
			maxim= maxo;
		}else {
			maxim=maxk;
		}
		maxZain=m;
		tabOinezko="";

		goiburukoa();
	}

	synchronized public void pantailaratu (int oz, int kz, int op, int kp, int kont, int t){

		System.out.print("| ");
		for (int i = 0; i<maxZain ; i++) {
			if(i<oz) {
				System.out.print("O");
			}else {
				System.out.print(" ");
			}
		}
		System.out.print("   |");
		for (int i = 0; i<maxim ; i++) {
			if(i<op) {
				System.out.print("O");
			}
			else if(i<kp) {
				System.out.print("k");
			}else {
				System.out.print(" ");
			}
		}

		System.out.print("           |");
		for (int i = 0; i<maxZain ; i++) {
			if(i<kz) {
				System.out.print("k");
			}else {
				System.out.print(" ");
			}
		}
		
		System.out.print("    |");
		System.out.print(kont+"    |");
		if(t==0) System.out.print("Oinez  |");
		if(t==1) System.out.print("Kotxe  |");
		
	}

	synchronized public void mugituOinezkoa(int i, int egoera, int oz, int kz , int op, int kp, int kont, int t) throws InterruptedException{

		
		
		for (int n = 0; n<i ; n++) {
			System.out.print("\t");

		}
		switch(egoera){
		
		case 1: System.out.print("Irits\t");
				
		break;

		case 2: System.out.print("Sart\t");
				
		break;

		case 3: System.out.print("Irt\t");
				
		break;

		default: System.out.print(" ");
		break;
		}
		for (int n = (i+1); n<maxo ; n++) {
			System.out.print("\t");
			
		}
		pantailaratu(oz,kz,op,kp, kont, t);
		System.out.println("");


	}

	synchronized public void mugituKotxea(int i,int egoera , int oz, int kz , int op, int kp, int kont, int t) throws InterruptedException{
	
		
		
		
		System.out.print(tabOinezko);
		pantailaratu(oz,kz,op,kp, kont, t);
		
		for (int n = 0; n<i ; n++) {
			System.out.print("\t");

		}
		switch(egoera){

		case 1: System.out.print("Irits");
				
		break;

		case 2: System.out.print("Sart");
				
		break;

		case 3: System.out.print("Irt");
				
		break;

		default: System.out.print(" ");
		break;
		}
		
		for (int n = (i+1); n<maxk ; n++) {
			System.out.print("\t");
			
		}
		System.out.println("");
	}

	synchronized public void goiburukoa() {
		for (int i = 0; i<maxo ; i++) {
			System.out.print("O["+i+"]\t");
			tabOinezko+="    \t";
		}
		
		
		System.out.print("|Zain");
		for (int i = 0; i<maxZain ; i++) {
			System.out.print(" ");
			
		}
		
		
		System.out.print("|Zebrabidean");
		for (int i = 0; i<maxim ; i++) {
			System.out.print(" ");
		
		}

		
		System.out.print("|Zain");
		for (int i = 0; i<maxZain ; i++) {
			System.out.print(" ");
		}
		System.out.print("|Kont ");
		
		System.out.print("|Txanda ");
		
		System.out.print("|");
		for (int i = 0; i<maxk ; i++) {
			System.out.print("K["+i+"]\t");
		}
		System.out.println("");
	}
}
