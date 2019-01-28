package Ariketa_13;

class Pantaila {
	private int razioak;
	private int basatiak;
	public int kont;
	
	public Pantaila(int b, int p) {
		basatiak = b;
		razioak=p;
		kont=0;

		System.out.print("Hozkailu  ");
		System.out.print("egH \t");
		System.out.print("Lapikoa  ");
		System.out.print("egL \t");
		
		System.out.print("SUK\t");

		for (int i=1; i<=basatiak; i++){
			System.out.print("b["+i+"]\t");
		}
		
		System.out.println("");

	}
	
	
	synchronized public void parametroak(int h, int egH, int l, int egL) {
		System.out.print("[");
		for (int i=0; i<h; ++i) { System.out.print("*"); }
		for (int i=0; i<(BasatiakApp.HK-h); ++i) { System.out.print(" "); }
		System.out.print("] ");
		System.out.print("   "+egH+"\t");
		System.out.print("[");
		for (int i=0; i<l; ++i) { System.out.print("*"); }
		for (int i=0; i<(razioak-l); ++i) { System.out.print(" "); }
		System.out.print("] ");
		System.out.print("   "+egL+"\t");
	}
	
	
	
	
	
	synchronized public void hil (int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Hil");
	}
	
	synchronized public void begiratuHoz (int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("BegiratuHoz:"+h);
	}
	
	synchronized public void gorde (int z, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Gorde:"+z);
	}

	synchronized public void askatuHozk ( int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Askatu Hozk");
	}
	
	synchronized public void begiratuLap ( int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("BegiratuLap:"+l);
	}
	

	synchronized public void hartuHozk (int r, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Hartu Hozk:"+r);
	}
	
	synchronized public void bota (int r, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Bota:"+r);
	}
	
	synchronized public void askatuSuk ( int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		System.out.println("Askatu Dena");
	}
	
	
	
	synchronized public void hartu(int k, int z, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Hartu:"+z;
		System.out.println(tab);
		
	}
	
	synchronized public void begiratu(int k, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Begiratu:"+l;
		System.out.println(tab);
		
	}
	

	synchronized public void askatu(int k, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Askatu";
		System.out.println(tab);
		
	}
	
	synchronized public void jan(int k, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Jan";
		System.out.println(tab);
	}
	
	synchronized public void lo(int k, int h, int egH, int l, int egL) {
		parametroak(h,egH,l,egL);
		String tab="\t";
		
		for (int i=1; i<k; i++){
			tab= tab+ "\t";
		}
		tab= tab +"Lo";
		System.out.println(tab);
		
	}



}