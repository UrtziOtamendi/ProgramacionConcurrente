package Zoo;

class Pantaila {

	

	public Pantaila() {
		System.out.print("Atea \t");
		System.out.print("Zatiak \t\t");
		System.out.print("K \t");
		System.out.print("JZ \t");
		System.out.print("|");
		System.out.print("Zaindaria");
		System.out.print(" |");
		for(int i=0; i<ZooApp.LKop ; i++) {
			System.out.print("L["+i+"]\t");
		}
		System.out.println("");
	}
	
	public void printValues(int p, int k, int jz,  boolean a) {


		if(a) {
			System.out.print("Itxita \t");	
		}else {
			System.out.print("Irekia \t");
		}
		System.out.print("[");
		for(int i=0; i<(p) ; i++) {
			System.out.print("*");
		}
		for(int i=0; i<(ZooApp.Max-p) ; i++) {
			System.out.print(" ");
		}
		System.out.print("] \t");
		System.out.print(k+"   \t");
		System.out.print(jz+"  \t");
		System.out.print("|");
		
	}

	public void tabulate(int n) {
		for(int i=0; i<(n) ; i++) {
			System.out.print("\t\t");
		}
	}

	public void sartuLehoi(int z, int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("\t ");
		System.out.print("  |");
		for(int i=0; i<(z) ; i++) {
			System.out.print("\t");
		}
		
		System.out.println("Sartu");

	}
	public void jan(int z, int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("\t ");
		System.out.print("  |");
		for(int i=0; i<(z) ; i++) {
			System.out.print("\t");
		}
		
		System.out.println("Jan");

	}
	public void irtenLehoi(int z, int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("\t ");
		System.out.print("  |");
		for(int i=0; i<(z) ; i++) {
			System.out.print("\t");
		}
		
		System.out.println("Irten");

	}

	public void sartu( int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("Sartu");
		System.out.println("     |");
		

	}
	
	public void bete( int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("Bete");
		System.out.println("      |");
		

	}
	
	public void irten( int p, int k, int jz,  boolean a) {
		printValues(p,k,jz,a);
		System.out.print("Irten");
		System.out.println("     |");
		

	}
	
	


}
