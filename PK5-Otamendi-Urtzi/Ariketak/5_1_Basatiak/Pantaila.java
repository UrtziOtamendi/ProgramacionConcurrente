package Ariketa_1;

class Pantaila {
	private int razioak;
	private int basatiak;
	public int kont;
	public Pantaila(int b, int p) {
		basatiak = b;
		razioak=p;
		kont=0;

		System.out.print("SUK\t");

		for (int i=1; i<=basatiak; i++){
			System.out.print("b["+i+"]\t");
		}
		System.out.println("Lapikoa");

	}
	synchronized public void hartu(int k, int p) {
		String tab="\t";
		kont = p;
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Hartu";
		System.out.print(tab);
		margotuRazioak(k);
	}
	synchronized public void jan(int k) {
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Jan";
		System.out.print(tab);
		margotuRazioak(k);
	}
	synchronized public void lo(int k) {
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Lo";
		System.out.print(tab);
		margotuRazioak(k);
	}
	synchronized public void bete(int p) {	
		System.out.print("Bete");
		kont = p;
		margotuRazioak(0);
	}


	synchronized public void margotuRazioak(int k) {
		String tab="\t";
		for (int i=1; i<=(basatiak-k); i++){
			tab= tab+ "\t";
		}
		System.out.print(tab);
		System.out.print("[");
		for (int i=0; i<(kont); ++i) { System.out.print("*"); }
		for (int i=0; i<(razioak-kont); ++i) { System.out.print(" "); }
		System.out.println("]");

	}
}