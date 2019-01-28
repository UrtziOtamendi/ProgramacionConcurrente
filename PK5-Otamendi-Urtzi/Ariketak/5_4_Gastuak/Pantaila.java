package Ariketa_4;

class Pantaila {
	private int maxim;
	private int kideak;
	public int kont;
	public Pantaila(int kid, int max) {
		maxim=max;
		kideak=kid;
		kont=0;


		for (int i=1; i<=kideak; i++){
			System.out.print("b["+i+"]\t\t");
		}
		System.out.println("Botea");

	}
	synchronized public void hartu(int k, int zenbat, int n) {
		String tab="";
		kont=n;
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Hartu["+zenbat+"]";
		System.out.print(tab);
		margotuRazioak(k);
	}
	
	
	synchronized public void bete(int k, int zenbat, int n) {	
		String tab="";
		kont=n;
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Bete["+zenbat+"]";
		System.out.print(tab);
		System.out.print("\t");
		margotuRazioak(k);
		
	}
	

	synchronized public void zerbaitetara(int k, String zertara) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +zertara;
		System.out.println(tab);
		
	}
	
	synchronized public void askatu(int k) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Askatu";
		System.out.print(tab);
		System.out.print("\t");
		margotuRazioak(k);
		
	}
	
	

	synchronized public void begiratzera(int k) {	
		String tab="";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t\t";
		}
		tab= tab +"Begir["+kont+"]";
		System.out.print(tab);
		margotuRazioak(k);
		
	}




	synchronized public void margotuRazioak(int k) {
		String tab="\t";
		for (int i=1; i<=(kideak-(k)); i++){
			tab= tab+ "\t\t";
		}
		System.out.print(tab);
		System.out.print("[");
		for (int i=0; i<(kont); ++i) { System.out.print("*"); }
		for (int i=0; i<(maxim-kont); ++i) { System.out.print(" "); }
		System.out.println("]");

	}
}