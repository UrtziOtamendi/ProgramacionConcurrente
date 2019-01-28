package LIFO_B_1;

class Pantaila {
	private int maxim;
	private int kideak;
	public Pantaila(int kid, int max) {
		maxim=max;
		kideak=kid;

		System.out.print("K \t");
		for (int i=1; i<=kideak; i++){
			System.out.print("b["+i+"]\t");
		}
		System.out.println("LIFO");

	}
	
	
	synchronized public void sartu(int p, int non, int k) {
		String tab=""+k+"\t";
		for (int i=1; i<p; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Sartu:"+non;
		System.out.print(tab);
		margotuLineak(p,non+1);
	}
	
	
	synchronized public void atera(int p, int nondik, int k) {	
		String tab=""+k+"\t";
		
		for (int i=1; i<p; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Atera:"+nondik;
		System.out.print(tab);
		margotuLineak(p, nondik);
		
	}
	

	synchronized public void margotuLineak(int k, int kop) {
		String tab="\t";
		for (int i=1; i<=(kideak-(k)); i++){
			tab= tab+ "\t";
		}
		System.out.print(tab);
		System.out.print("[");
		for (int i=0; i<(kop); ++i) {
				System.out.print("*"); 
		}
		for (int i=0; i<(maxim-kop); ++i) {
			System.out.print(" "); 
	}
		System.out.println("]");

	}
}