package LIFO_A_1;

class Pantaila {
	private int maxim;
	private int kideak;
	public Pantaila(int kid, int max) {
		maxim=max;
		kideak=kid;


		for (int i=1; i<=kideak; i++){
			System.out.print("b["+i+"]\t\t");
		}
		System.out.println("LIFO");

	}
	
	
	synchronized public void sartu(int k, int non) {
		String tab="";
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Sartu:"+non;
		System.out.print(tab);
		margotuLineak(k,non+1);
	}
	
	
	synchronized public void atera(int k, int nondik) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Atera:"+nondik;
		System.out.print(tab);
		margotuLineak(k, nondik);
		
	}
	

	synchronized public void margotuLineak(int k, int kop) {
		String tab="\t\t";
		for (int i=1; i<=(kideak-(k)); i++){
			tab= tab+ "\t\t";
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